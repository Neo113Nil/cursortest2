package com.unity3d.coherence;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
final class Coherence {
    private static final String BLOB_SUBDIR = "unity_coherence_blobs";
    private static final int BLOB_TIER_CACHE = 0;
    private static final int BLOB_TIER_DURABLE = 1;
    static final int MAX_EXPR_BYTES = 4096;
    static final int MAX_LETS = 16;
    static final int MAX_LISTING_BYTES = 32768;
    static final int MAX_PATH_SEGMENTS = 32;
    private static final Set<String> SETTINGS_GETTERS;
    private static final Set<String> SETTINGS_ROOTS;
    private final Object blobLock = new Object();
    private final Context context;
    private final SharedPreferences prefs;

    Long platformQueryInt(int i) {
        return null;
    }

    String platformQueryString(int i) {
        return null;
    }

    Coherence(Context context, SharedPreferences sharedPreferences) {
        this.context = context;
        this.prefs = sharedPreferences;
    }

    String kvGet(String str) {
        return this.prefs.getString(str, null);
    }

    boolean kvSet(String str, String str2) {
        this.prefs.edit().putString(str, str2).apply();
        return true;
    }

    String generateUuid() {
        return UUID.randomUUID().toString();
    }

    String reflectString(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof String) {
            return (String) resolvePath;
        }
        return null;
    }

    Long reflectInt(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Number) {
            return Long.valueOf(((Number) resolvePath).longValue());
        }
        return null;
    }

    Boolean reflectBool(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Boolean) {
            return (Boolean) resolvePath;
        }
        return null;
    }

    Double reflectDouble(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Number) {
            return Double.valueOf(((Number) resolvePath).doubleValue());
        }
        return null;
    }

    HttpResult httpPost(String str, String str2, byte[] bArr) {
        return httpExecute("POST", str, str2, bArr);
    }

    HttpResult httpGet(String str, String str2) {
        return httpExecute("GET", str, str2, null);
    }

    private HttpResult httpExecute(String str, String str2, String str3, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setRequestMethod(str);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                if (str3 != null) {
                    for (String str4 : str3.split(ServerSentEventKt.END_OF_LINE)) {
                        int indexOf = str4.indexOf(58);
                        if (indexOf > 0) {
                            httpURLConnection.setRequestProperty(str4.substring(0, indexOf).trim(), str4.substring(indexOf + 1).trim());
                        }
                    }
                }
                if (bArr != null && bArr.length > 0) {
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                HttpResult httpResult = new HttpResult();
                httpResult.status = httpURLConnection.getResponseCode();
                InputStream errorStream = httpResult.status >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                if (errorStream != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read = errorStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            httpResult.body = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } finally {
                        }
                    } finally {
                        errorStream.close();
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return httpResult;
            } catch (IOException unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (IOException unused2) {
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private File blobBaseDir(int i) {
        File cacheDir;
        if (i == 0) {
            cacheDir = this.context.getCacheDir();
        } else {
            if (i != 1) {
                return null;
            }
            cacheDir = this.context.getFilesDir();
        }
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, BLOB_SUBDIR);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    private static String blobFilenameForKey(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 unavailable", e);
        }
    }

    private File blobFile(int i, String str) {
        File blobBaseDir = blobBaseDir(i);
        if (blobBaseDir == null || str == null || str.isEmpty()) {
            return null;
        }
        return new File(blobBaseDir, blobFilenameForKey(str));
    }

    byte[] blobGet(int i, String str) {
        File blobFile = blobFile(i, str);
        if (blobFile != null && blobFile.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(blobFile, "r");
                try {
                    long length = randomAccessFile.length();
                    if (length <= 2147483647L) {
                        byte[] bArr = new byte[(int) length];
                        randomAccessFile.readFully(bArr);
                        randomAccessFile.close();
                        return bArr;
                    }
                    randomAccessFile.close();
                    return null;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    boolean blobSet(int i, String str, byte[] bArr) {
        File blobFile = blobFile(i, str);
        if (blobFile == null) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        File file = new File(blobFile.getParentFile(), blobFile.getName() + ".tmp");
        synchronized (this.blobLock) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    if (bArr.length > 0) {
                        fileOutputStream.write(bArr);
                    }
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    if (atomicReplace(file, blobFile)) {
                        return true;
                    }
                    file.delete();
                    return false;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
                return false;
            }
        }
    }

    private static boolean atomicReplace(File file, File file2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                return true;
            } catch (IOException | UnsupportedOperationException unused) {
            }
        }
        if (file.renameTo(file2)) {
            return true;
        }
        if (file2.exists() && file2.delete()) {
            return file.renameTo(file2);
        }
        return false;
    }

    boolean blobDelete(int i, String str) {
        File blobFile = blobFile(i, str);
        if (blobFile == null) {
            return false;
        }
        if (blobFile.delete()) {
            return true;
        }
        return !blobFile.exists();
    }

    int httpDownloadToBlob(String str, String str2, int i, String str3) {
        HttpURLConnection httpURLConnection;
        File blobFile = blobFile(i, str3);
        if (blobFile == null) {
            return -1;
        }
        File file = new File(blobFile.getParentFile(), blobFile.getName() + ".tmp");
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            if (str2 != null) {
                for (String str4 : str2.split(ServerSentEventKt.END_OF_LINE)) {
                    int indexOf = str4.indexOf(58);
                    if (indexOf > 0) {
                        httpURLConnection.setRequestProperty(str4.substring(0, indexOf).trim(), str4.substring(indexOf + 1).trim());
                    }
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream == null) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return -1;
                }
                synchronized (this.blobLock) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            inputStream.close();
                            if (atomicReplace(file, blobFile)) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return responseCode;
                            }
                            file.delete();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return -1;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        inputStream.close();
                        throw th2;
                    }
                }
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    do {
                    } while (errorStream.read(new byte[4096]) != -1);
                    errorStream.close();
                } catch (Throwable th3) {
                    errorStream.close();
                    throw th3;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return responseCode;
        } catch (IOException unused2) {
            httpURLConnection2 = httpURLConnection;
            file.delete();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return -1;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    String reflectEvalString(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof String) {
            return (String) evaluateJvmExpression;
        }
        return null;
    }

    Long reflectEvalInt(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof Number) {
            return Long.valueOf(((Number) evaluateJvmExpression).longValue());
        }
        return null;
    }

    Boolean reflectEvalBool(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof Boolean) {
            return (Boolean) evaluateJvmExpression;
        }
        return null;
    }

    String reflectListJvm(String str) {
        boolean z;
        boolean z2;
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression == null) {
            return null;
        }
        Class<?> cls = evaluateJvmExpression instanceof Class ? (Class) evaluateJvmExpression : evaluateJvmExpression.getClass();
        StringBuilder sb = new StringBuilder();
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z2 = false;
                break;
            }
            String str2 = "F\t" + fields[i].getName() + "\n";
            if (sb.length() + str2.length() > 32768) {
                z2 = true;
                break;
            }
            sb.append(str2);
            i++;
        }
        if (!z2) {
            for (Method method : cls.getMethods()) {
                String str3 = "M\t" + methodDescriptor(method) + "\n";
                if (sb.length() + str3.length() > 32768) {
                    break;
                }
                sb.append(str3);
            }
        }
        z = z2;
        if (z) {
            sb.append("...\n");
        }
        return sb.toString();
    }

    private static String methodDescriptor(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName()).append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):").append(method.getReturnType().getName());
        return sb.toString();
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("android.provider.Settings$Global");
        hashSet.add("android.provider.Settings$Secure");
        hashSet.add("android.provider.Settings$System");
        SETTINGS_ROOTS = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(Arrays.asList("getInt", "getString", "getFloat", "getLong"));
        SETTINGS_GETTERS = Collections.unmodifiableSet(hashSet2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Object resolvePath(String str) {
        Object obj;
        if (str != null && !str.isEmpty()) {
            List<String> list = tokenize(str);
            if (!list.isEmpty() && list.size() <= 32) {
                int i = 0;
                String str2 = list.get(0);
                int i2 = 1;
                if ("context".equals(str2)) {
                    obj = this.context;
                } else if (str2.startsWith("stickyIntent(")) {
                    String extractStringArg = extractStringArg(str2);
                    if (extractStringArg == null) {
                        return null;
                    }
                    try {
                        obj = this.context.registerReceiver(null, new IntentFilter(extractStringArg));
                    } catch (Throwable unused) {
                    }
                } else {
                    int size = list.size();
                    while (true) {
                        if (size < 1) {
                            obj = null;
                            i2 = -1;
                            break;
                        }
                        if (list.get(size - 1).indexOf(40) == -1) {
                            try {
                                obj = Class.forName(join(list, i, size));
                                i2 = size;
                                break;
                            } catch (ClassNotFoundException unused2) {
                                continue;
                            }
                        }
                        size--;
                    }
                    if (obj == null) {
                        return null;
                    }
                }
                while (i2 < list.size()) {
                    if (obj == null) {
                        return null;
                    }
                    obj = dispatchSegment(obj, list.get(i2));
                    i2++;
                }
                return obj;
            }
        }
        return null;
        return null;
    }

    private Object dispatchSegment(Object obj, String str) {
        int indexOf = str.indexOf(40);
        if (indexOf == -1) {
            return resolveFieldOrZeroArgMethod(obj, str);
        }
        String substring = str.substring(0, indexOf);
        String extractStringArg = extractStringArg(str);
        if (extractStringArg == null) {
            return null;
        }
        return resolveMethodWithStringArg(obj, substring, extractStringArg);
    }

    private static Object resolveFieldOrZeroArgMethod(Object obj, String str) {
        boolean z = obj instanceof Class;
        Class<?> cls = z ? (Class) obj : obj.getClass();
        if (z) {
            obj = null;
        }
        try {
            return cls.getField(str).get(obj);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (NoSuchFieldException unused2) {
            try {
                return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                return null;
            }
        }
    }

    private Object resolveMethodWithStringArg(Object obj, String str, String str2) {
        boolean z = obj instanceof Class;
        Class<?> cls = z ? (Class) obj : obj.getClass();
        if (z) {
            obj = null;
        }
        if (obj == null && SETTINGS_ROOTS.contains(cls.getName()) && SETTINGS_GETTERS.contains(str)) {
            try {
                return cls.getMethod(str, ContentResolver.class, String.class).invoke(null, this.context.getContentResolver(), str2);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        try {
            return cls.getMethod(str, String.class).invoke(obj, str2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    static List<String> tokenize(String str) {
        return splitOnTopLevel('.', str, false);
    }

    static List<String> splitOnTopLevel(char c, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z2) {
                sb.append(charAt);
                z2 = false;
            } else if (z3) {
                if (charAt == '\\') {
                    z2 = true;
                } else if (charAt == '\"') {
                    z3 = false;
                }
                sb.append(charAt);
            } else if (charAt == '\"') {
                sb.append(charAt);
                z3 = true;
            } else if (charAt == '(') {
                i++;
                sb.append(charAt);
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
                sb.append(charAt);
            } else if (charAt == c && i == 0) {
                if (z || sb.length() > 0) {
                    arrayList.add(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
        }
        if (z || sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    Object evaluateJvmExpression(String str) {
        if (str == null || str.isEmpty() || str.length() > 4096) {
            return null;
        }
        try {
            List<String> splitOnTopLevel = splitOnTopLevel(';', str, true);
            if (!splitOnTopLevel.isEmpty() && splitOnTopLevel.size() <= 17) {
                HashMap hashMap = new HashMap();
                Iterator<String> it = splitOnTopLevel.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    String trim = it.next().trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("let ") && !trim.startsWith("let\t")) {
                            obj = evaluateExpr(trim, hashMap);
                        }
                        int i = topLevelEqualsIdx(trim);
                        if (i < 0) {
                            return null;
                        }
                        String trim2 = trim.substring(3, i).trim();
                        if (!isValidIdent(trim2)) {
                            return null;
                        }
                        hashMap.put(trim2, evaluateExpr(trim.substring(i + 1).trim(), hashMap));
                    }
                }
                return obj;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r1 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object evaluateExpr(String str, Map<String, Object> map) {
        Object obj;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        int i = 1;
        if (trim.length() >= 2 && trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') {
            return parseStringLiteral(trim);
        }
        if ("true".equals(trim)) {
            return Boolean.TRUE;
        }
        if ("false".equals(trim)) {
            return Boolean.FALSE;
        }
        if ("null".equals(trim)) {
            return null;
        }
        if (looksLikeInt(trim)) {
            try {
                return Long.valueOf(Long.parseLong(trim));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = 40;
        if (trim.charAt(0) == '(' && trim.charAt(trim.length() - 1) == ')' && isBalancedOuterParen(trim)) {
            return evaluateExpr(trim.substring(1, trim.length() - 1), map);
        }
        List<String> list = tokenize(trim);
        if (list.isEmpty() || list.size() > 32) {
            return null;
        }
        String str2 = list.get(0);
        if (isValidIdent(str2) && map.containsKey(str2)) {
            obj = map.get(str2);
        } else if ("context".equals(str2)) {
            obj = this.context;
        } else if (str2.startsWith("stickyIntent(")) {
            Object evalSingleArgInside = evalSingleArgInside(str2, map);
            if (!(evalSingleArgInside instanceof String)) {
                return null;
            }
            try {
                obj = this.context.registerReceiver(null, new IntentFilter((String) evalSingleArgInside));
            } catch (Throwable unused2) {
            }
        } else {
            int size = list.size();
            while (true) {
                if (size < 1) {
                    obj = null;
                    i = -1;
                    break;
                }
                if (list.get(size - 1).indexOf(i2) == -1) {
                    try {
                        i = size;
                        obj = Class.forName(join(list, 0, size));
                        break;
                    } catch (ClassNotFoundException unused3) {
                        continue;
                    }
                }
                size--;
            }
            if (obj == null) {
                return null;
            }
        }
        while (i < list.size()) {
            if (obj == null) {
                return null;
            }
            obj = dispatchSegmentV2(obj, list.get(i), map);
            i++;
        }
        return obj;
        return null;
    }

    private Object dispatchSegmentV2(Object obj, String str, Map<String, Object> map) {
        List<Object> parseAndEvalArgs;
        int indexOf = str.indexOf(40);
        if (indexOf == -1) {
            return resolveFieldOrZeroArgMethod(obj, str);
        }
        String substring = str.substring(0, indexOf);
        int lastIndexOf = str.lastIndexOf(41);
        if (lastIndexOf >= indexOf && (parseAndEvalArgs = parseAndEvalArgs(str.substring(indexOf + 1, lastIndexOf), map)) != null) {
            return resolveMethodWithArgs(obj, substring, parseAndEvalArgs);
        }
        return null;
    }

    private Object evalSingleArgInside(String str, Map<String, Object> map) {
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf < indexOf) {
            return null;
        }
        return evaluateExpr(str.substring(indexOf + 1, lastIndexOf), map);
    }

    private List<Object> parseAndEvalArgs(String str, Map<String, Object> map) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> splitOnTopLevel = splitOnTopLevel(AbstractJsonLexerKt.COMMA, trim, false);
        ArrayList arrayList = new ArrayList(splitOnTopLevel.size());
        Iterator<String> it = splitOnTopLevel.iterator();
        while (it.hasNext()) {
            String trim2 = it.next().trim();
            int i = topLevelLabelColonIdx(trim2);
            if (i > 0 && isValidIdent(trim2.substring(0, i).trim())) {
                trim2 = trim2.substring(i + 1).trim();
            }
            arrayList.add(evaluateExpr(trim2, map));
        }
        return arrayList;
    }

    private Object resolveMethodWithArgs(Object obj, String str, List<Object> list) {
        boolean z = obj instanceof Class;
        Class<?> cls = z ? (Class) obj : obj.getClass();
        if (z) {
            obj = null;
        }
        if (obj == null && SETTINGS_ROOTS.contains(cls.getName()) && SETTINGS_GETTERS.contains(str) && (list.isEmpty() || !(list.get(0) instanceof ContentResolver))) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(this.context.getContentResolver());
            arrayList.addAll(list);
            Object invokeBestOverload = invokeBestOverload(cls, str, arrayList, null);
            if (invokeBestOverload != null) {
                return invokeBestOverload;
            }
        }
        return invokeBestOverload(cls, str, list, obj);
    }

    private static Object invokeBestOverload(Class<?> cls, String str, List<Object> list, Object obj) {
        int matchSpecificity;
        int i = Integer.MIN_VALUE;
        Method method = null;
        boolean z = false;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str)) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == list.size() && (matchSpecificity = matchSpecificity(parameterTypes, list)) >= 0) {
                    if (matchSpecificity > i) {
                        z = false;
                        method = method2;
                        i = matchSpecificity;
                    } else if (matchSpecificity == i) {
                        z = true;
                    }
                }
            }
        }
        if (method != null && !z) {
            try {
                Object[] coerceArgs = coerceArgs(method.getParameterTypes(), list);
                if (coerceArgs == null) {
                    return null;
                }
                return method.invoke(obj, coerceArgs);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    private static int matchSpecificity(Class<?>[] clsArr, List<Object> list) {
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            int assignabilityScore = assignabilityScore(clsArr[i2], list.get(i2));
            if (assignabilityScore < 0) {
                return -1;
            }
            i += assignabilityScore;
        }
        return i;
    }

    private static int assignabilityScore(Class<?> cls, Object obj) {
        if (obj == null) {
            return cls.isPrimitive() ? -1 : 1;
        }
        if (obj instanceof String) {
            if (cls == String.class) {
                return 100;
            }
            if (cls == CharSequence.class) {
                return 60;
            }
            return cls == Object.class ? 40 : -1;
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (cls == Long.TYPE || cls == Long.class) {
                return 100;
            }
            if (cls == Integer.TYPE || cls == Integer.class) {
                return (longValue < -2147483648L || longValue > 2147483647L) ? -1 : 90;
            }
            if (cls == Short.TYPE || cls == Short.class) {
                return (longValue < -32768 || longValue > 32767) ? -1 : 80;
            }
            if (cls == Byte.TYPE || cls == Byte.class) {
                return (longValue < -128 || longValue > 127) ? -1 : 70;
            }
            if (cls == Double.TYPE || cls == Double.class) {
                return 60;
            }
            if (cls == Float.TYPE || cls == Float.class) {
                return 55;
            }
            if (cls == Number.class) {
                return 50;
            }
            return cls == Object.class ? 40 : -1;
        }
        if (obj instanceof Boolean) {
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return 100;
            }
            return cls == Object.class ? 40 : -1;
        }
        if (cls.isInstance(obj)) {
            return cls == obj.getClass() ? 100 : 50;
        }
        return -1;
    }

    private static Object[] coerceArgs(Class<?>[] clsArr, List<Object> list) {
        Object[] objArr = new Object[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            Object obj = list.get(i);
            Class<?> cls = clsArr[i];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i] = null;
            } else if (obj instanceof Long) {
                long longValue = ((Long) obj).longValue();
                if (cls == Integer.TYPE || cls == Integer.class) {
                    objArr[i] = Integer.valueOf((int) longValue);
                } else if (cls == Short.TYPE || cls == Short.class) {
                    objArr[i] = Short.valueOf((short) longValue);
                } else if (cls == Byte.TYPE || cls == Byte.class) {
                    objArr[i] = Byte.valueOf((byte) longValue);
                } else if (cls == Float.TYPE || cls == Float.class) {
                    objArr[i] = Float.valueOf(longValue);
                } else if (cls == Double.TYPE || cls == Double.class) {
                    objArr[i] = Double.valueOf(longValue);
                } else {
                    objArr[i] = obj;
                }
            } else {
                objArr[i] = obj;
            }
        }
        return objArr;
    }

    private static int topLevelEqualsIdx(String str) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
            } else if (charAt == '=' && i == 0) {
                return i2;
            }
        }
        return -1;
    }

    private static int topLevelLabelColonIdx(String str) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
            } else if (i != 0) {
                continue;
            } else {
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '.' || charAt == ',') {
                    return -1;
                }
            }
        }
        return -1;
    }

    private static boolean isValidIdent(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (!Character.isLetter(charAt) && charAt != '_') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt2) && charAt2 != '_' && charAt2 != '$') {
                return false;
            }
        }
        return true;
    }

    private static boolean looksLikeInt(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int i = str.charAt(0) == '-' ? 1 : 0;
        if (i >= str.length()) {
            return false;
        }
        while (i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    static String parseStringLiteral(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str.length() - 2);
        int length = str.length() - 1;
        int i2 = 1;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' && (i = i2 + 1) < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\"') {
                    sb.append('\"');
                } else if (charAt2 == '0') {
                    sb.append((char) 0);
                } else if (charAt2 == '\\') {
                    sb.append('\\');
                } else if (charAt2 == 'n') {
                    sb.append('\n');
                } else if (charAt2 == 'r') {
                    sb.append('\r');
                } else if (charAt2 == 't') {
                    sb.append('\t');
                }
                i2 = i;
                i2++;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    private static boolean isBalancedOuterParen(String str) {
        if (str.length() < 2) {
            return false;
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')' && i - 1 == 0 && i2 < str.length() - 1) {
                return false;
            }
        }
        return i == 0;
    }

    static String extractStringArg(String str) {
        int i;
        char charAt;
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf != -1 && lastIndexOf >= indexOf) {
            String trim = str.substring(indexOf + 1, lastIndexOf).trim();
            if (trim.length() >= 2 && trim.startsWith("\"") && trim.endsWith("\"")) {
                String substring = trim.substring(1, trim.length() - 1);
                StringBuilder sb = new StringBuilder(substring.length());
                int i2 = 0;
                while (i2 < substring.length()) {
                    char charAt2 = substring.charAt(i2);
                    if (charAt2 == '\\' && (i = i2 + 1) < substring.length() && ((charAt = substring.charAt(i)) == '\"' || charAt == '\\')) {
                        sb.append(charAt);
                        i2 = i;
                    } else {
                        sb.append(charAt2);
                    }
                    i2++;
                }
                return sb.toString();
            }
        }
        return null;
    }

    private static String join(List<String> list, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 > i) {
                sb.append('.');
            }
            sb.append(list.get(i3));
        }
        return sb.toString();
    }
}
