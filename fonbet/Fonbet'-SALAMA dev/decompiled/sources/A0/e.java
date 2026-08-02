package A0;

import B4.V;
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
import java.io.Serializable;
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
    public static final V f36a = new V(1);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f37b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f38c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f39d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f40e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f41f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f42g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f43h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f44i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

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

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i7 = 0;
        for (c cVar : cVarArr) {
            i7 += ((((cVar.f33g * 2) + 7) & (-8)) / 8) + (cVar.f31e * 2) + d(cVar.f27a, bArr, cVar.f28b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f32f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, f41f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f27a, bArr, cVar2.f28b));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f34h;
                int length = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f27a, bArr, cVar3.f28b));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f34h;
                int length2 = iArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = iArr2[i11];
                    u(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
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
        boolean z4 = true;
        for (File file2 : listFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, byte[] bArr, String str2) {
        byte[] bArr2 = f43h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f42g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return e1.k.i(t.e.c(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read < 0) {
                throw new IllegalStateException(e1.k.d(i7, "Not enough bytes to read: "));
            }
            i8 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += (int) m(byteArrayInputStream, 2);
            iArr[i9] = i8;
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
    public static byte[] h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int i10 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i10 += inflater.inflate(bArr, i10, i8 - i10);
                    i9 += read;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f44i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m7 = (int) m(fileInputStream, 2);
            byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
            try {
                c[] k7 = k(byteArrayInputStream, bArr2, m7, cVarArr);
                byteArrayInputStream.close();
                return k7;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f39d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m8 = (int) m(fileInputStream, 1);
        byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h7);
        try {
            c[] j3 = j(byteArrayInputStream2, m8, cVarArr);
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

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i7, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m7 = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, m7), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            c cVar = cVarArr[i9];
            if (!cVar.f28b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            cVar.f31e = i10;
            cVar.f34h = g(byteArrayInputStream, i10);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m7 = m(byteArrayInputStream, 4);
            int m8 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i9 = 0;
                while (true) {
                    if (i9 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i9].f28b.equals(substring)) {
                        cVar = cVarArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f30d = m7;
            int[] g3 = g(byteArrayInputStream, m8);
            if (Arrays.equals(bArr, f43h)) {
                cVar.f31e = m8;
                cVar.f34h = g3;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f40e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m7 = (int) m(fileInputStream, 1);
        byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
        try {
            c[] n2 = n(byteArrayInputStream, str, m7);
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

    public static long m(InputStream inputStream, int i7) {
        byte[] f7 = f(inputStream, i7);
        long j3 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j3 += (f7[i8] & 255) << (i8 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m7 = (int) m(byteArrayInputStream, 2);
            int m8 = (int) m(byteArrayInputStream, 2);
            cVarArr[i8] = new c(str, new String(f(byteArrayInputStream, m7), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m8, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m8], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            c cVar = cVarArr[i9];
            int available = byteArrayInputStream.available() - cVar.f32f;
            int i10 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f35i;
                if (available2 <= available) {
                    break;
                }
                i10 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                for (int m9 = (int) m(byteArrayInputStream, 2); m9 > 0; m9--) {
                    m(byteArrayInputStream, 2);
                    int m10 = (int) m(byteArrayInputStream, 1);
                    if (m10 != 6 && m10 != 7) {
                        while (m10 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m11 = (int) m(byteArrayInputStream, 1); m11 > 0; m11--) {
                                m(byteArrayInputStream, 2);
                            }
                            m10--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f34h = g(byteArrayInputStream, cVar.f31e);
            int i11 = cVar.f33g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = valueOf.get(i12) ? 2 : 0;
                if (valueOf.get(i12 + i11)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f39d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b7 = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b7.length, 4);
                byte[] a2 = a(b7);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f42g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f35i.size() * 4;
                    String d7 = d(cVar.f27a, bArr4, cVar.f28b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d7.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f34h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f29c, 4);
                    byteArrayOutputStream.write(d7.getBytes(charset));
                    Iterator it = cVar.f35i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i8 : cVar.f34h) {
                        u(byteArrayOutputStream, i8);
                    }
                }
                return true;
            }
            byte[] bArr5 = f41f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b8 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b8.length, 4);
                byte[] a4 = a(b8);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f43h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String d8 = d(cVar2.f27a, bArr6, cVar2.f28b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d8.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f35i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f34h.length);
                t(byteArrayOutputStream, cVar2.f29c, 4);
                byteArrayOutputStream.write(d8.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : cVar2.f34h) {
                    u(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i10 = 2;
            int i11 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f29c, 4);
                t(byteArrayOutputStream2, cVar3.f30d, 4);
                t(byteArrayOutputStream2, cVar3.f33g, 4);
                String d9 = d(cVar3.f27a, bArr2, cVar3.f28b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d9.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(d9.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            n nVar = new n(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(nVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i12];
                    u(byteArrayOutputStream3, i12);
                    u(byteArrayOutputStream3, cVar4.f31e);
                    i13 = i13 + 4 + (cVar4.f31e * 2);
                    int[] iArr = cVar4.f34h;
                    int length3 = iArr.length;
                    int i14 = i7;
                    while (i7 < length3) {
                        int i15 = iArr[i7];
                        u(byteArrayOutputStream3, i15 - i14);
                        i7++;
                        i14 = i15;
                    }
                    i12++;
                    i7 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            n nVar2 = new n(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i16];
                    Iterator it3 = cVar5.f35i.entrySet().iterator();
                    int i18 = 0;
                    while (it3.hasNext()) {
                        i18 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i16);
                            int length4 = byteArray3.length + i10 + byteArray4.length;
                            int i19 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i18);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i19 + length4;
                            i16++;
                            arrayList3 = arrayList4;
                            i10 = 2;
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
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            n nVar3 = new n(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nVar3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                n nVar4 = (n) arrayList2.get(i20);
                int i21 = nVar4.f58a;
                if (i21 == 1) {
                    j3 = 0;
                } else if (i21 == 2) {
                    j3 = 1;
                } else if (i21 == 3) {
                    j3 = 2;
                } else if (i21 == 4) {
                    j3 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = nVar4.f59b;
                if (nVar4.f60c) {
                    long length5 = bArr7.length;
                    byte[] a7 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a7);
                    t(byteArrayOutputStream, a7.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a7.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f31e);
        t(byteArrayOutputStream, cVar.f32f, 4);
        t(byteArrayOutputStream, cVar.f29c, 4);
        t(byteArrayOutputStream, cVar.f33g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((cVar.f33g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f35i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + cVar.f33g;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i7 = 0;
        for (Map.Entry entry : cVar.f35i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ca, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01db  */
    /* JADX WARN: Type inference failed for: r0v68, types: [A0.c[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [A0.c[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z4) {
        boolean z7;
        ?? r62;
        IOException iOException;
        int i7;
        Serializable serializable;
        c[] cVarArr;
        b bVar;
        c[] cVarArr2;
        byte[] bArr;
        boolean z8;
        boolean z9;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream a2;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                dVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        m.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i8 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr2 = (byte[]) bVar2.f23e;
            if (bArr2 == null) {
                bVar2.b(3, Integer.valueOf(i8));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z7 = true;
                        bVar2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    bVar2.b(4, null);
                }
                bVar2.f19a = true;
                byte[] bArr3 = f37b;
                try {
                    try {
                        r62 = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e7) {
                        dVar.c(6, e7);
                        r62 = 0;
                        if (r62 != 0) {
                        }
                        cVarArr = (c[]) bVar2.f26h;
                        if (cVarArr != null) {
                        }
                        bVar = bVar2;
                        d dVar2 = (d) bVar.f22d;
                        cVarArr2 = (c[]) bVar.f26h;
                        ?? r63 = r62;
                        if (cVarArr2 != null) {
                        }
                        bArr = (byte[]) bVar.f24f;
                        if (bArr == null) {
                        }
                        if (z9) {
                        }
                        m.c(context, (z9 || !z4) ? false : z7);
                    } catch (IOException e8) {
                        dVar.c(7, e8);
                        r62 = 0;
                        if (r62 != 0) {
                        }
                        cVarArr = (c[]) bVar2.f26h;
                        if (cVarArr != null) {
                        }
                        bVar = bVar2;
                        d dVar22 = (d) bVar.f22d;
                        cVarArr2 = (c[]) bVar.f26h;
                        ?? r632 = r62;
                        if (cVarArr2 != null) {
                        }
                        bArr = (byte[]) bVar.f24f;
                        if (bArr == null) {
                        }
                        if (z9) {
                        }
                        m.c(context, (z9 || !z4) ? false : z7);
                    }
                    if (r62 != 0) {
                        try {
                        } catch (IOException e9) {
                            i7 = 7;
                            dVar.c(7, e9);
                            try {
                                r62.close();
                            } catch (IOException e10) {
                                iOException = e10;
                                dVar.c(i7, iOException);
                                serializable = null;
                                r62 = r62;
                                bVar2.f26h = serializable;
                                cVarArr = (c[]) bVar2.f26h;
                                if (cVarArr != null) {
                                }
                                bVar = bVar2;
                                d dVar222 = (d) bVar.f22d;
                                cVarArr2 = (c[]) bVar.f26h;
                                ?? r6322 = r62;
                                if (cVarArr2 != null) {
                                }
                                bArr = (byte[]) bVar.f24f;
                                if (bArr == null) {
                                }
                                if (z9) {
                                }
                                m.c(context, (z9 || !z4) ? false : z7);
                            }
                            serializable = null;
                            r62 = r62;
                            bVar2.f26h = serializable;
                            cVarArr = (c[]) bVar2.f26h;
                            if (cVarArr != null) {
                            }
                            bVar = bVar2;
                            d dVar2222 = (d) bVar.f22d;
                            cVarArr2 = (c[]) bVar.f26h;
                            ?? r63222 = r62;
                            if (cVarArr2 != null) {
                            }
                            bArr = (byte[]) bVar.f24f;
                            if (bArr == null) {
                            }
                            if (z9) {
                            }
                            m.c(context, (z9 || !z4) ? false : z7);
                        } catch (IllegalStateException e11) {
                            try {
                                dVar.c(8, e11);
                                try {
                                    r62.close();
                                } catch (IOException e12) {
                                    iOException = e12;
                                    i7 = 7;
                                    dVar.c(i7, iOException);
                                    serializable = null;
                                    r62 = r62;
                                    bVar2.f26h = serializable;
                                    cVarArr = (c[]) bVar2.f26h;
                                    if (cVarArr != null) {
                                    }
                                    bVar = bVar2;
                                    d dVar22222 = (d) bVar.f22d;
                                    cVarArr2 = (c[]) bVar.f26h;
                                    ?? r632222 = r62;
                                    if (cVarArr2 != null) {
                                    }
                                    bArr = (byte[]) bVar.f24f;
                                    if (bArr == null) {
                                    }
                                    if (z9) {
                                    }
                                    m.c(context, (z9 || !z4) ? false : z7);
                                }
                                serializable = null;
                                r62 = r62;
                                bVar2.f26h = serializable;
                                cVarArr = (c[]) bVar2.f26h;
                                if (cVarArr != null) {
                                }
                                bVar = bVar2;
                                d dVar222222 = (d) bVar.f22d;
                                cVarArr2 = (c[]) bVar.f26h;
                                ?? r6322222 = r62;
                                if (cVarArr2 != null) {
                                }
                                bArr = (byte[]) bVar.f24f;
                                if (bArr == null) {
                                }
                                if (z9) {
                                }
                                m.c(context, (z9 || !z4) ? false : z7);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r62.close();
                                    throw th2;
                                } catch (IOException e13) {
                                    dVar.c(7, e13);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r62, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        ?? l7 = l(r62, f(r62, 4), bVar2.f20b);
                        try {
                            r62.close();
                            serializable = l7;
                            r62 = r62;
                        } catch (IOException e14) {
                            IOException iOException2 = e14;
                            dVar.c(7, iOException2);
                            serializable = l7;
                            r62 = iOException2;
                        }
                        bVar2.f26h = serializable;
                    }
                    cVarArr = (c[]) bVar2.f26h;
                    if (cVarArr != null) {
                        int i9 = Build.VERSION.SDK_INT;
                        r62 = 34;
                        if (i9 <= 34) {
                            char c3 = 24;
                            if (i9 != 24) {
                                c3 = 25;
                                c3 = 25;
                                r62 = 25;
                                if (i9 != 25) {
                                    switch (i9) {
                                    }
                                }
                            }
                            try {
                                a2 = bVar2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e15) {
                                dVar.c(9, e15);
                            } catch (IOException e16) {
                                dVar.c(7, e16);
                            } catch (IllegalStateException e17) {
                                bVar2.f26h = null;
                                dVar.c(8, e17);
                            }
                            if (a2 != null) {
                                try {
                                    boolean equals = Arrays.equals(f38c, f(a2, 4));
                                    if (!equals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f26h = i(a2, f(a2, 4), bArr2, cVarArr);
                                    a2.close();
                                    bVar = bVar2;
                                    r62 = equals;
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                }
                                bVar = null;
                                r62 = c3;
                            }
                        }
                    }
                    bVar = bVar2;
                    d dVar2222222 = (d) bVar.f22d;
                    cVarArr2 = (c[]) bVar.f26h;
                    ?? r63222222 = r62;
                    if (cVarArr2 != null) {
                        byte[] bArr4 = (byte[]) bVar.f23e;
                        r63222222 = bArr4;
                        if (bArr4 != null) {
                            if (!bVar.f19a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e18) {
                                dVar2222222.c(7, e18);
                            } catch (IllegalStateException e19) {
                                dVar2222222.c(8, e19);
                            }
                            if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                bVar.f24f = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bVar.f26h = null;
                                r63222222 = bArr4;
                            } else {
                                dVar2222222.c(5, null);
                                bVar.f26h = null;
                                byteArrayOutputStream.close();
                                r63222222 = bArr4;
                            }
                        }
                    }
                    bArr = (byte[]) bVar.f24f;
                    if (bArr == null) {
                        z9 = false;
                        z7 = true;
                    } else {
                        try {
                            if (!bVar.f19a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) bVar.f25g);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z7 = true;
                                                        try {
                                                            bVar.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            bVar.f24f = null;
                                                            bVar.f26h = null;
                                                            z9 = true;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            Throwable th4 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th7;
                                                } catch (Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                    throw th7;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    r63222222 = 1;
                                    bVar.b(6, e);
                                    z8 = r63222222;
                                    z9 = false;
                                    z7 = z8;
                                    if (z9) {
                                    }
                                    m.c(context, (z9 || !z4) ? false : z7);
                                } catch (IOException e21) {
                                    e = e21;
                                    r63222222 = 1;
                                    bVar.b(7, e);
                                    z8 = r63222222;
                                    z9 = false;
                                    z7 = z8;
                                    if (z9) {
                                    }
                                    m.c(context, (z9 || !z4) ? false : z7);
                                }
                            } catch (FileNotFoundException e22) {
                                e = e22;
                                bVar.b(6, e);
                                z8 = r63222222;
                                z9 = false;
                                z7 = z8;
                                if (z9) {
                                }
                                m.c(context, (z9 || !z4) ? false : z7);
                            } catch (IOException e23) {
                                e = e23;
                                bVar.b(7, e);
                                z8 = r63222222;
                                z9 = false;
                                z7 = z8;
                                if (z9) {
                                }
                                m.c(context, (z9 || !z4) ? false : z7);
                            }
                        } finally {
                            bVar.f24f = null;
                            bVar.f26h = null;
                        }
                    }
                    if (z9) {
                        e(packageInfo, filesDir);
                    }
                    m.c(context, (z9 || !z4) ? false : z7);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z7 = true;
            z9 = false;
            m.c(context, (z9 || !z4) ? false : z7);
        } catch (PackageManager.NameNotFoundException e24) {
            dVar.c(7, e24);
            m.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j3 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        t(byteArrayOutputStream, i7, 2);
    }
}
