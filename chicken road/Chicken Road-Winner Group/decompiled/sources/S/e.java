package S;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final P0.j f1266a = new P0.j(17);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1267b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1268c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1269d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1270e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1271g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1272h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1273i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1274j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i3 = 0;
        for (b bVar : bVarArr) {
            i3 += ((((bVar.f1263g * 2) + 7) & (-8)) / 8) + (bVar.f1262e * 2) + d(bArr, bVar.f1258a, bVar.f1259b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bArr, bVar2.f1258a, bVar2.f1259b));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.f1264h;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bArr, bVar3.f1258a, bVar3.f1259b));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.f1264h;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f1272h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1271g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return B0.c.l(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read < 0) {
                throw new IllegalStateException(B0.c.h(i3, "Not enough bytes to read: "));
            }
            i4 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int i6 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i6 += inflater.inflate(bArr, i6, i4 - i6);
                    i5 += read;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f1273i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1274j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m3 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                b[] k3 = k(byteArrayInputStream, bArr2, m3, bVarArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1269d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            b[] j3 = j(byteArrayInputStream2, m4, bVarArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i3, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            iArr[i4] = (int) m(byteArrayInputStream, 2);
            strArr[i4] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            b bVar = bVarArr[i5];
            if (!bVar.f1259b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            bVar.f1262e = i6;
            bVar.f1264h = g(byteArrayInputStream, i6);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m3 = m(byteArrayInputStream, 4);
            int m4 = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i5 = 0;
                while (true) {
                    if (i5 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i5].f1259b.equals(substring)) {
                        bVar = bVarArr[i5];
                        break;
                    }
                    i5++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f1261d = m3;
            int[] g3 = g(byteArrayInputStream, m4);
            if (Arrays.equals(bArr, f1272h)) {
                bVar.f1262e = m4;
                bVar.f1264h = g3;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1270e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            b[] n3 = n(byteArrayInputStream, str, m3);
            byteArrayInputStream.close();
            return n3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (f3[i4] & 255) << (i4 * 8);
        }
        return j3;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            int m4 = (int) m(byteArrayInputStream, 2);
            bVarArr[i4] = new b(str, new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m4, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m4], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            b bVar = bVarArr[i5];
            int available = byteArrayInputStream.available() - bVar.f;
            int i6 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f1265i;
                if (available2 <= available) {
                    break;
                }
                i6 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i6), 1);
                for (int m5 = (int) m(byteArrayInputStream, 2); m5 > 0; m5--) {
                    m(byteArrayInputStream, 2);
                    int m6 = (int) m(byteArrayInputStream, 1);
                    if (m6 != 6 && m6 != 7) {
                        while (m6 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m7 = (int) m(byteArrayInputStream, 1); m7 > 0; m7--) {
                                m(byteArrayInputStream, 2);
                            }
                            m6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f1264h = g(byteArrayInputStream, bVar.f1262e);
            int i7 = bVar.f1263g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = valueOf.get(i8) ? 2 : 0;
                if (valueOf.get(i8 + i7)) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1269d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1270e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f1271g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f1265i.size() * 4;
                    String d3 = d(bArr4, bVar.f1258a, bVar.f1259b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d3.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.f1264h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.f1260c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it = bVar.f1265i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i4 : bVar.f1264h) {
                        u(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b4 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f1272h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String d4 = d(bArr6, bVar2.f1258a, bVar2.f1259b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d4.getBytes(charset2).length);
                TreeMap treeMap = bVar2.f1265i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.f1264h.length);
                t(byteArrayOutputStream, bVar2.f1260c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : bVar2.f1264h) {
                    u(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.f1260c, 4);
                t(byteArrayOutputStream2, bVar3.f1261d, 4);
                t(byteArrayOutputStream2, bVar3.f1263g, 4);
                String d5 = d(bArr2, bVar3.f1258a, bVar3.f1259b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i8];
                    u(byteArrayOutputStream3, i8);
                    u(byteArrayOutputStream3, bVar4.f1262e);
                    i9 = i9 + 4 + (bVar4.f1262e * i6);
                    int[] iArr = bVar4.f1264h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    int i11 = i6;
                    int i12 = i10;
                    while (i12 < length3) {
                        int i13 = iArr[i12];
                        u(byteArrayOutputStream3, i13 - i10);
                        i12++;
                        i10 = i13;
                    }
                    i8++;
                    i6 = i11;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i14];
                    Iterator it3 = bVar5.f1265i.entrySet().iterator();
                    int i16 = 0;
                    while (it3.hasNext()) {
                        i16 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i17 = i15 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i16);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i15 = i17 + length4;
                            i14++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i18);
                int i19 = mVar4.f1285a;
                if (i19 == 1) {
                    j3 = 0;
                } else if (i19 == 2) {
                    j3 = 1;
                } else if (i19 == 3) {
                    j3 = 2;
                } else if (i19 == 4) {
                    j3 = 3;
                } else {
                    if (i19 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = mVar4.f1286b;
                if (mVar4.f1287c) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    t(byteArrayOutputStream, a5.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i18++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f1262e);
        t(byteArrayOutputStream, bVar.f, 4);
        t(byteArrayOutputStream, bVar.f1260c, 4);
        t(byteArrayOutputStream, bVar.f1263g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f1263g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f1265i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i4 = intValue + bVar.f1263g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i3 = 0;
        for (Map.Entry entry : bVar.f1265i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:53|54|55)|57|(3:196|197|(4:199|200|201|202)(2:206|207))|59|(5:63|(1:65)|66|67|(3:74|75|(4:77|78|79|(1:73))(2:80|81))(3:(1:70)|71|(0)))|97|(2:101|(5:105|106|107|108|(2:110|111)(3:112|113|114))(2:103|104))|128|(1:130)(3:134|135|(8:139|140|141|142|143|144|145|(2:146|(1:148)(7:149|150|151|152|153|154|155)))(2:137|138))|(1:132)|133|(1:45)(1:42)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0132, code lost:
    
        r20.a(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z3) {
        boolean z4;
        FileInputStream fileInputStream;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        J1.c cVar;
        FileInputStream g3;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                dVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        l.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            J1.c cVar2 = new J1.c(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) cVar2.f699d;
            if (bArr3 == null) {
                cVar2.h(3, Integer.valueOf(i4));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z4 = true;
                        cVar2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    cVar2.h(4, null);
                }
                cVar2.f696a = true;
                ?? r7 = f1267b;
                try {
                    try {
                        fileInputStream = cVar2.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        dVar.a(6, e3);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) cVar2.f701g;
                        if (bVarArr2 != null) {
                        }
                        d dVar2 = (d) cVar2.f698c;
                        bVarArr3 = (b[]) cVar2.f701g;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) cVar2.f702h;
                        if (bArr == null) {
                        }
                        if (z6) {
                        }
                        z8 = z6;
                        z9 = z7;
                        l.c(context, (z8 || !z3) ? false : z9);
                    } catch (IOException e4) {
                        dVar.a(7, e4);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) cVar2.f701g;
                        if (bVarArr2 != null) {
                        }
                        d dVar22 = (d) cVar2.f698c;
                        bVarArr3 = (b[]) cVar2.f701g;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) cVar2.f702h;
                        if (bArr == null) {
                        }
                        if (z6) {
                        }
                        z8 = z6;
                        z9 = z7;
                        l.c(context, (z8 || !z3) ? false : z9);
                    }
                    if (fileInputStream != null) {
                        try {
                            try {
                            } catch (IllegalStateException e5) {
                                dVar.a(8, e5);
                                fileInputStream.close();
                                bVarArr = null;
                                cVar2.f701g = bVarArr;
                                bVarArr2 = (b[]) cVar2.f701g;
                                if (bVarArr2 != null) {
                                    if (i3 != 25) {
                                    }
                                    try {
                                        g3 = cVar2.g(assets, "dexopt/baseline.profm");
                                        if (g3 == null) {
                                        }
                                    } catch (FileNotFoundException e6) {
                                        dVar.a(9, e6);
                                    } catch (IOException e7) {
                                        dVar.a(7, e7);
                                    } catch (IllegalStateException e8) {
                                        cVar2.f701g = null;
                                        dVar.a(8, e8);
                                    }
                                }
                                d dVar222 = (d) cVar2.f698c;
                                bVarArr3 = (b[]) cVar2.f701g;
                                if (bVarArr3 != null) {
                                    if (cVar2.f696a) {
                                    }
                                }
                                bArr = (byte[]) cVar2.f702h;
                                if (bArr == null) {
                                }
                                if (z6) {
                                }
                                z8 = z6;
                                z9 = z7;
                                l.c(context, (z8 || !z3) ? false : z9);
                            }
                        } catch (IOException e9) {
                            dVar.a(7, e9);
                            fileInputStream.close();
                            bVarArr = null;
                            cVar2.f701g = bVarArr;
                            bVarArr2 = (b[]) cVar2.f701g;
                            if (bVarArr2 != null) {
                            }
                            d dVar2222 = (d) cVar2.f698c;
                            bVarArr3 = (b[]) cVar2.f701g;
                            if (bVarArr3 != null) {
                            }
                            bArr = (byte[]) cVar2.f702h;
                            if (bArr == null) {
                            }
                            if (z6) {
                            }
                            z8 = z6;
                            z9 = z7;
                            l.c(context, (z8 || !z3) ? false : z9);
                        }
                        if (!Arrays.equals((byte[]) r7, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(fileInputStream, 4), (String) cVar2.f);
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            dVar.a(7, e10);
                        }
                        cVar2.f701g = bVarArr;
                    }
                    bVarArr2 = (b[]) cVar2.f701g;
                    if (bVarArr2 != null && (i3 = Build.VERSION.SDK_INT) <= 34) {
                        if (i3 != 25) {
                            switch (i3) {
                            }
                        }
                        g3 = cVar2.g(assets, "dexopt/baseline.profm");
                        if (g3 == null) {
                            try {
                                if (!Arrays.equals(f1268c, f(g3, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVar2.f701g = i(g3, f(g3, 4), bArr3, bVarArr2);
                                g3.close();
                                cVar = cVar2;
                                if (cVar != null) {
                                    cVar2 = cVar;
                                }
                            } finally {
                            }
                        } else {
                            if (g3 != null) {
                                g3.close();
                            }
                            cVar = null;
                            if (cVar != null) {
                            }
                        }
                    }
                    d dVar22222 = (d) cVar2.f698c;
                    bVarArr3 = (b[]) cVar2.f701g;
                    if (bVarArr3 != null && (bArr2 = (byte[]) cVar2.f699d) != null) {
                        if (cVar2.f696a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write((byte[]) r7);
                                byteArrayOutputStream.write(bArr2);
                            } finally {
                            }
                        } catch (IOException e11) {
                            dVar22222.a(7, e11);
                        } catch (IllegalStateException e12) {
                            dVar22222.a(8, e12);
                        }
                        if (o(byteArrayOutputStream, bArr2, bVarArr3)) {
                            cVar2.f702h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            cVar2.f701g = null;
                        } else {
                            dVar22222.a(5, null);
                            cVar2.f701g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr = (byte[]) cVar2.f702h;
                    if (bArr == null) {
                        z6 = false;
                        z7 = true;
                    } else {
                        try {
                            if (!cVar2.f696a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) cVar2.f700e);
                                        try {
                                            try {
                                                byte[] bArr4 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr4);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr4, 0, read);
                                                    } else {
                                                        z7 = true;
                                                        try {
                                                            cVar2.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            cVar2.f702h = null;
                                                            cVar2.f701g = null;
                                                            z6 = true;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                th2.addSuppressed(th3);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (FileNotFoundException e13) {
                                    e = e13;
                                    r7 = 1;
                                    cVar2.h(6, e);
                                    z5 = r7;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z9 = z7;
                                    l.c(context, (z8 || !z3) ? false : z9);
                                } catch (IOException e14) {
                                    e = e14;
                                    r7 = 1;
                                    cVar2.h(7, e);
                                    z5 = r7;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z9 = z7;
                                    l.c(context, (z8 || !z3) ? false : z9);
                                }
                            } catch (FileNotFoundException e15) {
                                e = e15;
                                cVar2.h(6, e);
                                z5 = r7;
                                z6 = false;
                                z7 = z5;
                                if (z6) {
                                }
                                z8 = z6;
                                z9 = z7;
                                l.c(context, (z8 || !z3) ? false : z9);
                            } catch (IOException e16) {
                                e = e16;
                                cVar2.h(7, e);
                                z5 = r7;
                                z6 = false;
                                z7 = z5;
                                if (z6) {
                                }
                                z8 = z6;
                                z9 = z7;
                                l.c(context, (z8 || !z3) ? false : z9);
                            }
                        } finally {
                            cVar2.f702h = null;
                            cVar2.f701g = null;
                        }
                    }
                    if (z6) {
                        e(packageInfo, filesDir);
                    }
                    z8 = z6;
                    z9 = z7;
                    l.c(context, (z8 || !z3) ? false : z9);
                } finally {
                }
            }
            z4 = true;
            z8 = false;
            z9 = z4;
            l.c(context, (z8 || !z3) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            dVar.a(7, e17);
            l.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, i3, 2);
    }
}
