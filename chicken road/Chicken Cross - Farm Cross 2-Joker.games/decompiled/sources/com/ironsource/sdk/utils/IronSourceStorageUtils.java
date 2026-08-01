package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.messages.Message;
import com.ironsource.C4491k4;
import com.ironsource.C4710w8;
import com.ironsource.C4771zf;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4673u7;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceStorageUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8662a = "supersonicads";
    private static C4771zf b = null;
    private static boolean c = false;

    private static void a(Context context) {
        C4771zf c4771zf = b;
        if (c4771zf != null && c4771zf.b()) {
            deleteCacheDirectories(context);
        }
        C4771zf c4771zf2 = b;
        if (c4771zf2 == null || !c4771zf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        C4771zf c4771zf = b;
        return (c4771zf == null || !c4771zf.d()) ? a2.g(context) : a2.m(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    Object c2 = c(file2);
                    if (c2 instanceof JSONArray) {
                        jSONObject.put("files", c(file2));
                    } else if (c2 instanceof JSONObject) {
                        jSONObject.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e) {
                    C4491k4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C4710w8 c4710w8, JSONObject jSONObject) throws Exception {
        if (c4710w8 == null || !c4710w8.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = c4710w8.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            C4710w8 c4710w82 = new C4710w8(file.getPath());
            if (c4710w82.isFile()) {
                String name = c4710w82.getName();
                JSONObject a2 = c4710w82.a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, SDKUtils.mergeJSONObjects(a2, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, a2);
                }
            } else if (c4710w82.isDirectory()) {
                jSONObject2.put(c4710w82.getName(), buildFilesMapOfDirectory(c4710w82, jSONObject));
            }
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        C4771zf c4771zf = b;
        return (c4771zf == null || !c4771zf.d()) ? a2.k(context) : a2.C(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        a(a2.m(context));
        a(a2.C(context));
    }

    public static synchronized boolean deleteFile(C4710w8 c4710w8) {
        synchronized (IronSourceStorageUtils.class) {
            if (!c4710w8.exists()) {
                return false;
            }
            return c4710w8.delete();
        }
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        a(a2.g(context));
        a(a2.k(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z = file.delete();
            }
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C4771zf c4771zf = b;
        if (c4771zf == null || !c4771zf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(U3.c.u + canonicalPath2);
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File b2;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (b2 = b(context)) == null || !b2.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return b2.getPath();
    }

    public static ArrayList<C4710w8> getFilesInFolderRecursive(C4710w8 c4710w8) {
        if (c4710w8 == null || !c4710w8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C4710w8> arrayList = new ArrayList<>();
        File[] listFiles = c4710w8.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                C4710w8 c4710w82 = new C4710w8(file.getPath());
                if (c4710w82.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c4710w82));
                }
                if (c4710w82.isFile()) {
                    arrayList.add(c4710w82);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b2 = b(new File(getDiskCacheDirPath(context)));
        if (!b2.exists()) {
            b2.mkdir();
        }
        return b2.getPath();
    }

    public static long getTotalSizeOfDir(C4710w8 c4710w8) {
        long totalSizeOfDir;
        long j = 0;
        if (c4710w8 != null && c4710w8.isDirectory()) {
            File[] listFiles = c4710w8.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                C4710w8 c4710w82 = new C4710w8(file.getPath());
                if (c4710w82.isFile()) {
                    totalSizeOfDir = c4710w82.length();
                } else if (c4710w82.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c4710w82);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, C4771zf c4771zf) {
        b = c4771zf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C4710w8 c4710w8) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c4710w8));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[Message.MAX_CONTENT_SIZE_BYTES];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder append = new StringBuilder().append(file.getAbsolutePath());
        String str = File.separator;
        return new File(append.append(str).append(f8662a).append(str).toString());
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    private static boolean a() {
        C4771zf c4771zf;
        return Build.VERSION.SDK_INT > 29 && (c4771zf = b) != null && c4771zf.a();
    }
}
