package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
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

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0074f {

    /* renamed from: a, reason: collision with root package name */
    public static final C.b f1028a = new C.b(12);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1029b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1030c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1031d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1032e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1033f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1034g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1035h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1036i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1037j = {48, 48, 50, 0};

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

    public static byte[] b(C0070b[] c0070bArr, byte[] bArr) {
        int i2 = 0;
        for (C0070b c0070b : c0070bArr) {
            i2 += ((((c0070b.f1024g * 2) + 7) & (-8)) / 8) + (c0070b.f1022e * 2) + d(c0070b.f1018a, c0070b.f1019b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0070b.f1023f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f1033f)) {
            for (C0070b c0070b2 : c0070bArr) {
                p(byteArrayOutputStream, c0070b2, d(c0070b2.f1018a, c0070b2.f1019b, bArr));
                r(byteArrayOutputStream, c0070b2);
                int[] iArr = c0070b2.f1025h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, c0070b2);
            }
        } else {
            for (C0070b c0070b3 : c0070bArr) {
                p(byteArrayOutputStream, c0070b3, d(c0070b3.f1018a, c0070b3.f1019b, bArr));
            }
            for (C0070b c0070b4 : c0070bArr) {
                r(byteArrayOutputStream, c0070b4);
                int[] iArr2 = c0070b4.f1025h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, c0070b4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
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
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f1035h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1034g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
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

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
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
    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static C0070b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0070b[] c0070bArr) {
        byte[] bArr3 = f1036i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1037j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                C0070b[] k2 = k(byteArrayInputStream, bArr2, m2, c0070bArr);
                byteArrayInputStream.close();
                return k2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1031d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
        try {
            C0070b[] j2 = j(byteArrayInputStream2, m3, c0070bArr);
            byteArrayInputStream2.close();
            return j2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C0070b[] j(ByteArrayInputStream byteArrayInputStream, int i2, C0070b[] c0070bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0070b[0];
        }
        if (i2 != c0070bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0070b c0070b = c0070bArr[i4];
            if (!c0070b.f1019b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0070b.f1022e = i5;
            c0070b.f1025h = g(byteArrayInputStream, i5);
        }
        return c0070bArr;
    }

    public static C0070b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0070b[] c0070bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0070b[0];
        }
        if (i2 != c0070bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m3 = (int) m(byteArrayInputStream, 2);
            C0070b c0070b = null;
            if (c0070bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0070bArr.length) {
                        break;
                    }
                    if (c0070bArr[i4].f1019b.equals(substring)) {
                        c0070b = c0070bArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0070b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0070b.f1021d = m2;
            int[] g2 = g(byteArrayInputStream, m3);
            if (Arrays.equals(bArr, f1035h)) {
                c0070b.f1022e = m3;
                c0070b.f1025h = g2;
            }
        }
        return c0070bArr;
    }

    public static C0070b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1032e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            C0070b[] n2 = n(byteArrayInputStream, str, m2);
            byteArrayInputStream.close();
            return n2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (f2[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static C0070b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0070b[0];
        }
        C0070b[] c0070bArr = new C0070b[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m3 = (int) m(byteArrayInputStream, 2);
            c0070bArr[i4] = new C0070b(str, new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            C0070b c0070b = c0070bArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = c0070b.f1023f;
            int i7 = c0070b.f1024g;
            TreeMap treeMap = c0070b.f1026i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int m4 = (int) m(byteArrayInputStream, 2);
                while (m4 > 0) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    m4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0070b.f1025h = g(byteArrayInputStream, c0070b.f1022e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return c0070bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0070b[] c0070bArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1031d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1032e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(c0070bArr, bArr3);
                t(byteArrayOutputStream, c0070bArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f1034g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c0070bArr.length, 1);
                for (C0070b c0070b : c0070bArr) {
                    int size = c0070b.f1026i.size() * 4;
                    String d2 = d(c0070b.f1018a, c0070b.f1019b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d2.getBytes(charset).length);
                    u(byteArrayOutputStream, c0070b.f1025h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c0070b.f1020c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = c0070b.f1026i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0070b.f1025h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1033f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(c0070bArr, bArr5);
                t(byteArrayOutputStream, c0070bArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f1035h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c0070bArr.length);
            for (C0070b c0070b2 : c0070bArr) {
                String str = c0070b2.f1018a;
                TreeMap treeMap = c0070b2.f1026i;
                String d3 = d(str, c0070b2.f1019b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d3.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c0070b2.f1025h.length);
                t(byteArrayOutputStream, c0070b2.f1020c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0070b2.f1025h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c0070bArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0070b c0070b3 : c0070bArr) {
                t(byteArrayOutputStream2, c0070b3.f1020c, 4);
                t(byteArrayOutputStream2, c0070b3.f1021d, 4);
                t(byteArrayOutputStream2, c0070b3.f1024g, 4);
                String d4 = d(c0070b3.f1018a, c0070b3.f1019b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d4.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0083o c0083o = new C0083o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0083o);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0070bArr.length) {
                try {
                    C0070b c0070b4 = c0070bArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, c0070b4.f1022e);
                    i8 = i8 + 4 + (c0070b4.f1022e * i5);
                    int[] iArr = c0070b4.f1025h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        u(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0083o c0083o2 = new C0083o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0083o2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c0070bArr.length) {
                try {
                    C0070b c0070b5 = c0070bArr[i13];
                    Iterator it3 = c0070b5.f1026i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c0070b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c0070b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
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
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            C0083o c0083o3 = new C0083o(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0083o3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                C0083o c0083o4 = (C0083o) arrayList2.get(i17);
                int i18 = c0083o4.f1048a;
                byte[] bArr7 = c0083o4.f1049b;
                if (i18 == 1) {
                    j2 = 0;
                } else if (i18 == 2) {
                    j2 = 1;
                } else if (i18 == 3) {
                    j2 = 2;
                } else if (i18 == 4) {
                    j2 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                if (c0083o4.f1050c) {
                    long length5 = bArr7.length;
                    byte[] a4 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a4);
                    t(byteArrayOutputStream, a4.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a4.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0070b c0070b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c0070b.f1022e);
        t(byteArrayOutputStream, c0070b.f1023f, 4);
        t(byteArrayOutputStream, c0070b.f1020c, 4);
        t(byteArrayOutputStream, c0070b.f1024g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0070b c0070b) {
        byte[] bArr = new byte[(((c0070b.f1024g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0070b.f1026i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + c0070b.f1024g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C0070b c0070b) {
        int i2 = 0;
        for (Map.Entry entry : c0070b.f1026i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, InterfaceC0073e interfaceC0073e, boolean z2) {
        boolean z3;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r7;
        C0070b[] c0070bArr;
        C0070b[] c0070bArr2;
        C0070b[] c0070bArr3;
        byte[] bArr2;
        boolean z4;
        boolean z5;
        ?? r72;
        boolean z6;
        boolean z7;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        G.e eVar;
        FileInputStream g2;
        boolean z8;
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z9 = readLong == packageInfo.lastUpdateTime;
                            if (z9) {
                                interfaceC0073e.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z9) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC0082n.c(context, false);
                        return;
                    }
                }
                z9 = false;
                if (z9) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            G.e eVar2 = new G.e(assets, executor, interfaceC0073e, name, file2);
            byte[] bArr3 = (byte[]) eVar2.f182d;
            if (bArr3 == null) {
                eVar2.h(3, Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z3 = true;
                        eVar2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    eVar2.h(4, null);
                }
                eVar2.f179a = true;
                try {
                    try {
                        fileInputStream = eVar2.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0073e.c(6, e2);
                        fileInputStream = null;
                        bArr = f1029b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c0070bArr2 = (C0070b[]) eVar2.f185g;
                        if (c0070bArr2 != null) {
                            if (i2 != 25) {
                            }
                            try {
                                g2 = eVar2.g(assets, "dexopt/baseline.profm");
                                if (g2 == null) {
                                }
                            } catch (FileNotFoundException e3) {
                                interfaceC0073e.c(9, e3);
                            } catch (IOException e4) {
                                interfaceC0073e.c(7, e4);
                            } catch (IllegalStateException e5) {
                                eVar2.f185g = null;
                                interfaceC0073e.c(8, e5);
                            }
                        }
                        InterfaceC0073e interfaceC0073e2 = (InterfaceC0073e) eVar2.f181c;
                        c0070bArr3 = (C0070b[]) eVar2.f185g;
                        byte[] bArr4 = (byte[]) eVar2.f182d;
                        if (c0070bArr3 != null) {
                            if (eVar2.f179a) {
                            }
                        }
                        bArr2 = (byte[]) eVar2.f186h;
                        if (bArr2 == null) {
                        }
                        if (z5) {
                        }
                        z7 = z5;
                        z8 = z6;
                        AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                    } catch (IOException e6) {
                        interfaceC0073e.c(7, e6);
                        fileInputStream = null;
                        bArr = f1029b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c0070bArr2 = (C0070b[]) eVar2.f185g;
                        if (c0070bArr2 != null) {
                        }
                        InterfaceC0073e interfaceC0073e22 = (InterfaceC0073e) eVar2.f181c;
                        c0070bArr3 = (C0070b[]) eVar2.f185g;
                        byte[] bArr42 = (byte[]) eVar2.f182d;
                        if (c0070bArr3 != null) {
                        }
                        bArr2 = (byte[]) eVar2.f186h;
                        if (bArr2 == null) {
                        }
                        if (z5) {
                        }
                        z7 = z5;
                        z8 = z6;
                        AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e7) {
                            interfaceC0073e.c(7, e7);
                            try {
                                fileInputStream.close();
                            } catch (IOException e8) {
                                interfaceC0073e.c(7, e8);
                            }
                            c0070bArr = null;
                            eVar2.f185g = c0070bArr;
                            c0070bArr2 = (C0070b[]) eVar2.f185g;
                            if (c0070bArr2 != null) {
                            }
                            InterfaceC0073e interfaceC0073e222 = (InterfaceC0073e) eVar2.f181c;
                            c0070bArr3 = (C0070b[]) eVar2.f185g;
                            byte[] bArr422 = (byte[]) eVar2.f182d;
                            if (c0070bArr3 != null) {
                            }
                            bArr2 = (byte[]) eVar2.f186h;
                            if (bArr2 == null) {
                            }
                            if (z5) {
                            }
                            z7 = z5;
                            z8 = z6;
                            AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                        } catch (IllegalStateException e9) {
                            interfaceC0073e.c(8, e9);
                            fileInputStream.close();
                            c0070bArr = null;
                            eVar2.f185g = c0070bArr;
                            c0070bArr2 = (C0070b[]) eVar2.f185g;
                            if (c0070bArr2 != null) {
                            }
                            InterfaceC0073e interfaceC0073e2222 = (InterfaceC0073e) eVar2.f181c;
                            c0070bArr3 = (C0070b[]) eVar2.f185g;
                            byte[] bArr4222 = (byte[]) eVar2.f182d;
                            if (c0070bArr3 != null) {
                            }
                            bArr2 = (byte[]) eVar2.f186h;
                            if (bArr2 == null) {
                            }
                            if (z5) {
                            }
                            z7 = z5;
                            z8 = z6;
                            AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0070bArr = l(fileInputStream, f(fileInputStream, 4), (String) eVar2.f184f);
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            interfaceC0073e.c(7, e10);
                        }
                        eVar2.f185g = c0070bArr;
                    }
                    c0070bArr2 = (C0070b[]) eVar2.f185g;
                    if (c0070bArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        if (i2 != 25) {
                            switch (i2) {
                            }
                        }
                        g2 = eVar2.g(assets, "dexopt/baseline.profm");
                        if (g2 == null) {
                            try {
                                if (!Arrays.equals(f1030c, f(g2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                eVar2.f185g = i(g2, f(g2, 4), bArr3, c0070bArr2);
                                g2.close();
                                eVar = eVar2;
                                if (eVar != null) {
                                    eVar2 = eVar;
                                }
                            } finally {
                            }
                        } else {
                            if (g2 != null) {
                                g2.close();
                            }
                            eVar = null;
                            if (eVar != null) {
                            }
                        }
                    }
                    InterfaceC0073e interfaceC0073e22222 = (InterfaceC0073e) eVar2.f181c;
                    c0070bArr3 = (C0070b[]) eVar2.f185g;
                    byte[] bArr42222 = (byte[]) eVar2.f182d;
                    if (c0070bArr3 != null && bArr42222 != null) {
                        if (eVar2.f179a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e11) {
                            interfaceC0073e22222.c(7, e11);
                        } catch (IllegalStateException e12) {
                            interfaceC0073e22222.c(8, e12);
                        }
                        if (o(byteArrayOutputStream, bArr42222, c0070bArr3)) {
                            eVar2.f186h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            eVar2.f185g = null;
                        } else {
                            interfaceC0073e22222.c(5, null);
                            eVar2.f185g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) eVar2.f186h;
                    if (bArr2 == null) {
                        z5 = false;
                        z6 = true;
                    } else {
                        try {
                            if (!eVar2.f179a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) eVar2.f183e);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z6 = true;
                                                        try {
                                                            eVar2.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            eVar2.f186h = null;
                                                            eVar2.f185g = null;
                                                            z5 = true;
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
                                    r72 = 1;
                                    eVar2.h(6, e);
                                    z4 = r72;
                                    z5 = false;
                                    z6 = z4;
                                    if (z5) {
                                    }
                                    z7 = z5;
                                    z8 = z6;
                                    AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                                } catch (IOException e14) {
                                    e = e14;
                                    r7 = 1;
                                    eVar2.h(7, e);
                                    z4 = r7;
                                    z5 = false;
                                    z6 = z4;
                                    if (z5) {
                                    }
                                    z7 = z5;
                                    z8 = z6;
                                    AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                                }
                            } catch (FileNotFoundException e15) {
                                e = e15;
                                eVar2.h(6, e);
                                z4 = r72;
                                z5 = false;
                                z6 = z4;
                                if (z5) {
                                }
                                z7 = z5;
                                z8 = z6;
                                AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                            } catch (IOException e16) {
                                e = e16;
                                eVar2.h(7, e);
                                z4 = r7;
                                z5 = false;
                                z6 = z4;
                                if (z5) {
                                }
                                z7 = z5;
                                z8 = z6;
                                AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                            }
                        } finally {
                            eVar2.f186h = null;
                            eVar2.f185g = null;
                        }
                    }
                    if (z5) {
                        e(packageInfo, filesDir);
                    }
                    z7 = z5;
                    z8 = z6;
                    AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
                } finally {
                }
                bArr = f1029b;
                r7 = 8;
                r72 = 8;
            }
            z3 = true;
            z7 = false;
            z8 = z3;
            AbstractC0082n.c(context, (z7 || !z2) ? false : z8);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0073e.c(7, e17);
            AbstractC0082n.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
