package Q1;

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
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
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
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j3.i f4868a = new j3.i(27);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4869b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4870c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4871d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4872e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4873g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4874h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f4875j = {48, 48, 50, 0};

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
        int i5 = 0;
        int i6 = 0;
        for (c cVar : cVarArr) {
            i6 += ((((cVar.f4866g * 2) + 7) & (-8)) / 8) + (cVar.f4865e * 2) + d(bArr, cVar.f4861a, cVar.f4862b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        if (Arrays.equals(bArr, f)) {
            int length = cVarArr.length;
            while (i5 < length) {
                c cVar2 = cVarArr[i5];
                q(byteArrayOutputStream, cVar2, d(bArr, cVar2.f4861a, cVar2.f4862b));
                p(byteArrayOutputStream, cVar2);
                i5++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(bArr, cVar3.f4861a, cVar3.f4862b));
            }
            int length2 = cVarArr.length;
            while (i5 < length2) {
                p(byteArrayOutputStream, cVarArr[i5]);
                i5++;
            }
        }
        if (byteArrayOutputStream.size() == i6) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i6);
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
        byte[] bArr2 = f4874h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4873g;
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
                return AbstractC2107A.u(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i5) {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(bArr, i6, i5 - i6);
            if (read < 0) {
                throw new IllegalStateException(AbstractC2107A.q("Not enough bytes to read: ", i5));
            }
            i6 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += (int) m(byteArrayInputStream, 2);
            iArr[i7] = i6;
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
    public static byte[] h(FileInputStream fileInputStream, int i5, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int i8 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i8 += inflater.inflate(bArr, i8, i6 - i8);
                    i7 += read;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f4875j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m5 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                c[] k5 = k(byteArrayInputStream, bArr2, m5, cVarArr);
                byteArrayInputStream.close();
                return k5;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f4871d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m6 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            c[] j5 = j(byteArrayInputStream2, m6, cVarArr);
            byteArrayInputStream2.close();
            return j5;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i5, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i5 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m5 = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, m5), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            c cVar = cVarArr[i7];
            if (!cVar.f4862b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            cVar.f4865e = i8;
            cVar.f4867h = g(byteArrayInputStream, i8);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i5 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m5 = m(byteArrayInputStream, 4);
            int m6 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i7 = 0;
                while (true) {
                    if (i7 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i7].f4862b.equals(substring)) {
                        cVar = cVarArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f4864d = m5;
            int[] g5 = g(byteArrayInputStream, m6);
            if (Arrays.equals(bArr, f4874h)) {
                cVar.f4865e = m6;
                cVar.f4867h = g5;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f4872e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            c[] n5 = n(byteArrayInputStream, str, m5);
            byteArrayInputStream.close();
            return n5;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i5) {
        byte[] f5 = f(inputStream, i5);
        long j5 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j5 += (f5[i6] & 255) << (i6 * 8);
        }
        return j5;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m5 = (int) m(byteArrayInputStream, 2);
            int m6 = (int) m(byteArrayInputStream, 2);
            cVarArr[i6] = new c(str, new String(f(byteArrayInputStream, m5), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m6, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m6], new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            c cVar = cVarArr[i7];
            int available = byteArrayInputStream.available() - cVar.f;
            int i8 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.i;
                if (available2 <= available) {
                    break;
                }
                i8 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                for (int m7 = (int) m(byteArrayInputStream, 2); m7 > 0; m7--) {
                    m(byteArrayInputStream, 2);
                    int m8 = (int) m(byteArrayInputStream, 1);
                    if (m8 != 6 && m8 != 7) {
                        while (m8 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m9 = (int) m(byteArrayInputStream, 1); m9 > 0; m9--) {
                                m(byteArrayInputStream, 2);
                            }
                            m8--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f4867h = g(byteArrayInputStream, cVar.f4865e);
            int i9 = cVar.f4866g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = valueOf.get(i10) ? 2 : 0;
                if (valueOf.get(i10 + i9)) {
                    i11 |= 4;
                }
                if (i11 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i10), Integer.valueOf(i11 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f4871d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f4872e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b3.length, 4);
                byte[] a5 = a(b3);
                u(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr4 = f4873g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.i.size() * 4;
                    String d5 = d(bArr4, cVar.f4861a, cVar.f4862b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d5.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f4867h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f4863c, 4);
                    byteArrayOutputStream.write(d5.getBytes(charset));
                    Iterator it = cVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i6 : cVar.f4867h) {
                        v(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b5.length, 4);
                byte[] a6 = a(b5);
                u(byteArrayOutputStream, a6.length, 4);
                byteArrayOutputStream.write(a6);
                return true;
            }
            byte[] bArr6 = f4874h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String d6 = d(bArr6, cVar2.f4861a, cVar2.f4862b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d6.getBytes(charset2).length);
                TreeMap treeMap = cVar2.i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f4867h.length);
                u(byteArrayOutputStream, cVar2.f4863c, 4);
                byteArrayOutputStream.write(d6.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : cVar2.f4867h) {
                    v(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i8 = 2;
            int i9 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f4863c, 4);
                u(byteArrayOutputStream2, cVar3.f4864d, 4);
                u(byteArrayOutputStream2, cVar3.f4866g, 4);
                String d7 = d(bArr2, cVar3.f4861a, cVar3.f4862b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d7.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(d7.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i10];
                    v(byteArrayOutputStream3, i10);
                    v(byteArrayOutputStream3, cVar4.f4865e);
                    i11 = i11 + 4 + (cVar4.f4865e * i8);
                    int[] iArr = cVar4.f4867h;
                    int length3 = iArr.length;
                    int i12 = i5;
                    int i13 = i8;
                    int i14 = i12;
                    while (i14 < length3) {
                        int i15 = iArr[i14];
                        v(byteArrayOutputStream3, i15 - i12);
                        i14++;
                        i12 = i15;
                    }
                    i10++;
                    i8 = i13;
                    i5 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i16];
                    Iterator it3 = cVar5.i.entrySet().iterator();
                    int i18 = 0;
                    while (it3.hasNext()) {
                        i18 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i18, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i16);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i18);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i19 + length4;
                            i16++;
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
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i20);
                int i21 = lVar4.f4888a;
                if (i21 == 1) {
                    j5 = 0;
                } else if (i21 == 2) {
                    j5 = 1;
                } else if (i21 == 3) {
                    j5 = 2;
                } else if (i21 == 4) {
                    j5 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                u(byteArrayOutputStream, j5, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = lVar4.f4889b;
                if (lVar4.f4890c) {
                    long length5 = bArr7.length;
                    byte[] a7 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a7);
                    u(byteArrayOutputStream, a7.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a7.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f4867h;
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            v(byteArrayOutputStream, i7 - i6);
            i5++;
            i6 = i7;
        }
        int i8 = cVar.f4866g;
        byte[] bArr = new byte[(((i8 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + i8;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f4865e);
        u(byteArrayOutputStream, cVar.f, 4);
        u(byteArrayOutputStream, cVar.f4863c, 4);
        u(byteArrayOutputStream, cVar.f4866g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i5, c cVar) {
        int bitCount = Integer.bitCount(i5 & (-2));
        int i6 = cVar.f4866g;
        byte[] bArr = new byte[(((bitCount * i6) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i7 = 0;
            for (int i8 = 1; i8 <= 4; i8 <<= 1) {
                if (i8 != 1 && (i8 & i5) != 0) {
                    if ((i8 & intValue2) == i8) {
                        int i9 = (i7 * i6) + intValue;
                        int i10 = i9 / 8;
                        bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
                    }
                    i7++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i5 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i5);
                v(byteArrayOutputStream, 0);
                i5 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:53|54|55)|57|(3:239|240|(4:242|243|244|245)(2:249|250))|59|(3:68|69|(3:76|77|(4:79|80|81|(1:75))(2:82|83))(3:(1:72)|73|(0)))|100|(2:104|(5:108|109|110|111|(2:113|114)(3:115|116|117))(2:106|107))|132|(1:134)(3:138|139|(13:143|144|145|146|148|149|150|151|152|(3:157|158|(9:160|(2:161|(1:163)(1:164))|165|166|167|168|169|170|171))|154|155|156)(2:141|142))|(1:136)|137) */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0137, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0138, code lost:
    
        r20.c(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, d dVar, boolean z3) {
        boolean z5;
        FileInputStream fileInputStream;
        ?? r7;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr;
        boolean z6;
        boolean z7;
        ?? r72;
        Throwable th;
        Throwable th2;
        boolean z8;
        boolean z9;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i5;
        b bVar;
        FileInputStream a5;
        boolean z10;
        boolean z11;
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
                            z11 = readLong == packageInfo.lastUpdateTime;
                            if (z11) {
                                dVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z11) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        k.c(context, false);
                        return;
                    }
                }
                z11 = false;
                if (z11) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr3 = bVar2.f4856c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f = true;
                    byte[] bArr4 = f4869b;
                    try {
                        try {
                            fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e3) {
                            dVar.c(6, e3);
                            fileInputStream = null;
                            r7 = 8;
                            r72 = 8;
                            if (fileInputStream != null) {
                            }
                            cVarArr2 = bVar2.f4859g;
                            if (cVarArr2 != null) {
                            }
                            d dVar2 = bVar2.f4855b;
                            cVarArr3 = bVar2.f4859g;
                            if (cVarArr3 != null) {
                            }
                            bArr = bVar2.f4860h;
                            if (bArr != null) {
                            }
                            if (z7) {
                            }
                            z9 = z7;
                            z10 = z8;
                            k.c(context, (z9 || !z3) ? false : z10);
                        } catch (IOException e5) {
                            dVar.c(7, e5);
                            fileInputStream = null;
                            r7 = 8;
                            r72 = 8;
                            if (fileInputStream != null) {
                            }
                            cVarArr2 = bVar2.f4859g;
                            if (cVarArr2 != null) {
                            }
                            d dVar22 = bVar2.f4855b;
                            cVarArr3 = bVar2.f4859g;
                            if (cVarArr3 != null) {
                            }
                            bArr = bVar2.f4860h;
                            if (bArr != null) {
                            }
                            if (z7) {
                            }
                            z9 = z7;
                            z10 = z8;
                            k.c(context, (z9 || !z3) ? false : z10);
                        }
                        if (fileInputStream != null) {
                            try {
                                try {
                                } catch (IllegalStateException e6) {
                                    dVar.c(8, e6);
                                    fileInputStream.close();
                                    cVarArr = null;
                                    bVar2.f4859g = cVarArr;
                                    cVarArr2 = bVar2.f4859g;
                                    if (cVarArr2 != null) {
                                    }
                                    d dVar222 = bVar2.f4855b;
                                    cVarArr3 = bVar2.f4859g;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr = bVar2.f4860h;
                                    if (bArr != null) {
                                    }
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z10 = z8;
                                    k.c(context, (z9 || !z3) ? false : z10);
                                }
                            } catch (IOException e7) {
                                dVar.c(7, e7);
                                fileInputStream.close();
                                cVarArr = null;
                                bVar2.f4859g = cVarArr;
                                cVarArr2 = bVar2.f4859g;
                                if (cVarArr2 != null) {
                                }
                                d dVar2222 = bVar2.f4855b;
                                cVarArr3 = bVar2.f4859g;
                                if (cVarArr3 != null) {
                                }
                                bArr = bVar2.f4860h;
                                if (bArr != null) {
                                }
                                if (z7) {
                                }
                                z9 = z7;
                                z10 = z8;
                                k.c(context, (z9 || !z3) ? false : z10);
                            }
                            if (!Arrays.equals(bArr4, f(fileInputStream, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(fileInputStream, f(fileInputStream, 4), bVar2.f4858e);
                            try {
                                fileInputStream.close();
                            } catch (IOException e8) {
                                dVar.c(7, e8);
                            }
                            bVar2.f4859g = cVarArr;
                        }
                        cVarArr2 = bVar2.f4859g;
                        if (cVarArr2 != null && (i5 = Build.VERSION.SDK_INT) >= 24 && (i5 >= 31 || i5 == 24 || i5 == 25)) {
                            try {
                                a5 = bVar2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e9) {
                                dVar.c(9, e9);
                            } catch (IOException e10) {
                                dVar.c(7, e10);
                            } catch (IllegalStateException e11) {
                                bVar2.f4859g = null;
                                dVar.c(8, e11);
                            }
                            if (a5 == null) {
                                try {
                                    if (!Arrays.equals(f4870c, f(a5, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f4859g = i(a5, f(a5, 4), bArr3, cVarArr2);
                                    a5.close();
                                    bVar = bVar2;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a5 != null) {
                                    a5.close();
                                }
                                bVar = null;
                                if (bVar != null) {
                                }
                            }
                        }
                        d dVar22222 = bVar2.f4855b;
                        cVarArr3 = bVar2.f4859g;
                        if (cVarArr3 != null && (bArr2 = bVar2.f4856c) != null) {
                            if (bVar2.f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e12) {
                                dVar22222.c(7, e12);
                            } catch (IllegalStateException e13) {
                                dVar22222.c(8, e13);
                            }
                            if (o(byteArrayOutputStream, bArr2, cVarArr3)) {
                                bVar2.f4860h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bVar2.f4859g = null;
                            } else {
                                dVar22222.c(5, null);
                                bVar2.f4859g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = bVar2.f4860h;
                        if (bArr != null) {
                            z7 = false;
                            z8 = true;
                        } else {
                            try {
                                if (!bVar2.f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f4857d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z8 = true;
                                                                                bVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.f4860h = null;
                                                                                bVar2.f4859g = null;
                                                                                z7 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
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
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e14) {
                                        e = e14;
                                        r72 = 1;
                                        bVar2.b(6, e);
                                        z6 = r72;
                                        z7 = false;
                                        z8 = z6;
                                        if (z7) {
                                        }
                                        z9 = z7;
                                        z10 = z8;
                                        k.c(context, (z9 || !z3) ? false : z10);
                                    } catch (IOException e15) {
                                        e = e15;
                                        r7 = 1;
                                        bVar2.b(7, e);
                                        z6 = r7;
                                        z7 = false;
                                        z8 = z6;
                                        if (z7) {
                                        }
                                        z9 = z7;
                                        z10 = z8;
                                        k.c(context, (z9 || !z3) ? false : z10);
                                    }
                                } catch (FileNotFoundException e16) {
                                    e = e16;
                                    bVar2.b(6, e);
                                    z6 = r72;
                                    z7 = false;
                                    z8 = z6;
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z10 = z8;
                                    k.c(context, (z9 || !z3) ? false : z10);
                                } catch (IOException e17) {
                                    e = e17;
                                    bVar2.b(7, e);
                                    z6 = r7;
                                    z7 = false;
                                    z8 = z6;
                                    if (z7) {
                                    }
                                    z9 = z7;
                                    z10 = z8;
                                    k.c(context, (z9 || !z3) ? false : z10);
                                }
                            } finally {
                                bVar2.f4860h = null;
                                bVar2.f4859g = null;
                            }
                        }
                        if (z7) {
                            e(packageInfo, filesDir);
                        }
                        z9 = z7;
                        z10 = z8;
                    } finally {
                    }
                    r7 = 8;
                    r72 = 8;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f = true;
                        byte[] bArr42 = f4869b;
                        fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.f4859g;
                        if (cVarArr2 != null) {
                            a5 = bVar2.a(assets, "dexopt/baseline.profm");
                            if (a5 == null) {
                            }
                        }
                        d dVar222222 = bVar2.f4855b;
                        cVarArr3 = bVar2.f4859g;
                        if (cVarArr3 != null) {
                            if (bVar2.f) {
                            }
                        }
                        bArr = bVar2.f4860h;
                        if (bArr != null) {
                        }
                        if (z7) {
                        }
                        z9 = z7;
                        z10 = z8;
                    } catch (IOException unused2) {
                        z5 = true;
                        bVar2.b(4, null);
                    }
                }
                k.c(context, (z9 || !z3) ? false : z10);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z5 = true;
            z9 = false;
            z10 = z5;
            k.c(context, (z9 || !z3) ? false : z10);
        } catch (PackageManager.NameNotFoundException e18) {
            dVar.c(7, e18);
            k.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j5, int i5) {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j5 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        u(byteArrayOutputStream, i5, 2);
    }
}
