package U;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import b2.AbstractC0279e;
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
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final l1.j f3054a = new l1.j(14);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3055b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3056c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3057d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3058e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3059f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3060g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f3061h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f3062i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f3063j = {48, 48, 50, 0};

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
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += ((((cVar.f3049g * 2) + 7) & (-8)) / 8) + (cVar.f3047e * 2) + d(cVar.f3043a, cVar.f3044b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f3048f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f3059f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f3043a, cVar2.f3044b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f3050h;
                int length = iArr.length;
                int i3 = 0;
                int i6 = 0;
                while (i3 < length) {
                    int i7 = iArr[i3];
                    u(byteArrayOutputStream, i7 - i6);
                    i3++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f3043a, cVar3.f3044b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f3050h;
                int length2 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, cVar4);
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
        boolean z = true;
        for (File file2 : listFiles) {
            z = c(file2) && z;
        }
        return z;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3061h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3060g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return AbstractC0279e.h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
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
                throw new IllegalStateException(AbstractC0279e.d(i2, "Not enough bytes to read: "));
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i6] = i3;
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
            int i6 = 0;
            int i7 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i7 += inflater.inflate(bArr, i7, i3 - i7);
                    i6 += read;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i6);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f3062i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3063j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m6 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                c[] k3 = k(byteArrayInputStream, bArr2, m6, cVarArr);
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
        if (Arrays.equals(f3057d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m7 = (int) m(fileInputStream, 1);
        byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h6);
        try {
            c[] j2 = j(byteArrayInputStream2, m7, cVarArr);
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

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m6 = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i2; i6++) {
            c cVar = cVarArr[i6];
            if (!cVar.f3044b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            cVar.f3047e = i7;
            cVar.f3050h = g(byteArrayInputStream, i7);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m6 = m(byteArrayInputStream, 4);
            int m7 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i6].f3044b.equals(substring)) {
                        cVar = cVarArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f3046d = m6;
            int[] g6 = g(byteArrayInputStream, m7);
            if (Arrays.equals(bArr, f3061h)) {
                cVar.f3047e = m7;
                cVar.f3050h = g6;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f3058e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m6 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            c[] n6 = n(byteArrayInputStream, str, m6);
            byteArrayInputStream.close();
            return n6;
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
        byte[] f3 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (f3[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m6 = (int) m(byteArrayInputStream, 2);
            int m7 = (int) m(byteArrayInputStream, 2);
            cVarArr[i3] = new c(str, new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m7, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m7], new TreeMap());
        }
        for (int i6 = 0; i6 < i2; i6++) {
            c cVar = cVarArr[i6];
            int available = byteArrayInputStream.available() - cVar.f3048f;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f3051i;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i7), 1);
                for (int m8 = (int) m(byteArrayInputStream, 2); m8 > 0; m8--) {
                    m(byteArrayInputStream, 2);
                    int m9 = (int) m(byteArrayInputStream, 1);
                    if (m9 != 6 && m9 != 7) {
                        while (m9 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m10 = (int) m(byteArrayInputStream, 1); m10 > 0; m10--) {
                                m(byteArrayInputStream, 2);
                            }
                            m9--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f3050h = g(byteArrayInputStream, cVar.f3047e);
            int i8 = cVar.f3049g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = valueOf.get(i9) ? 2 : 0;
                if (valueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3057d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3058e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b6 = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b6.length, 4);
                byte[] a6 = a(b6);
                t(byteArrayOutputStream, a6.length, 4);
                byteArrayOutputStream.write(a6);
                return true;
            }
            byte[] bArr4 = f3060g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f3051i.size() * 4;
                    String d6 = d(cVar.f3043a, cVar.f3044b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d6.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f3050h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f3045c, 4);
                    byteArrayOutputStream.write(d6.getBytes(charset));
                    Iterator it = cVar.f3051i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : cVar.f3050h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3059f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b7 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b7.length, 4);
                byte[] a7 = a(b7);
                t(byteArrayOutputStream, a7.length, 4);
                byteArrayOutputStream.write(a7);
                return true;
            }
            byte[] bArr6 = f3061h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String d7 = d(cVar2.f3043a, cVar2.f3044b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d7.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f3051i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f3050h.length);
                t(byteArrayOutputStream, cVar2.f3045c, 4);
                byteArrayOutputStream.write(d7.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : cVar2.f3050h) {
                    u(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f3045c, 4);
                t(byteArrayOutputStream2, cVar3.f3046d, 4);
                t(byteArrayOutputStream2, cVar3.f3049g, 4);
                String d8 = d(cVar3.f3043a, cVar3.f3044b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d8.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(d8.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            o oVar = new o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(oVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i9];
                    u(byteArrayOutputStream3, i9);
                    u(byteArrayOutputStream3, cVar4.f3047e);
                    i10 = i10 + 4 + (cVar4.f3047e * 2);
                    int[] iArr = cVar4.f3050h;
                    int length3 = iArr.length;
                    int i11 = i2;
                    while (i2 < length3) {
                        int i12 = iArr[i2];
                        u(byteArrayOutputStream3, i12 - i11);
                        i2++;
                        i11 = i12;
                    }
                    i9++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            o oVar2 = new o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i13];
                    Iterator it3 = cVar5.f3051i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
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
                            u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + i7 + byteArray4.length;
                            int i16 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                            i7 = 2;
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
            o oVar3 = new o(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                o oVar4 = (o) arrayList2.get(i17);
                int i18 = oVar4.f3074a;
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
                byte[] bArr7 = oVar4.f3075b;
                if (oVar4.f3076c) {
                    long length5 = bArr7.length;
                    byte[] a8 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a8);
                    t(byteArrayOutputStream, a8.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a8.length;
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f3047e);
        t(byteArrayOutputStream, cVar.f3048f, 4);
        t(byteArrayOutputStream, cVar.f3045c, 4);
        t(byteArrayOutputStream, cVar.f3049g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((cVar.f3049g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f3051i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + cVar.f3049g;
                int i6 = i3 / 8;
                bArr[i6] = (byte) ((1 << (i3 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.f3051i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, f fVar, boolean z) {
        boolean z5;
        ?? r6;
        IOException iOException;
        int i2;
        c[] cVarArr;
        c[] cVarArr2;
        b bVar;
        c[] cVarArr3;
        byte[] bArr;
        boolean z6;
        boolean z7;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream g6;
        boolean z8;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z8 = readLong == packageInfo.lastUpdateTime;
                            if (z8) {
                                fVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z8) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        n.c(context, false);
                        return;
                    }
                }
                z8 = false;
                if (z8) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, fVar, name, file2);
            byte[] bArr2 = (byte[]) bVar2.f3038d;
            if (bArr2 == null) {
                bVar2.h(3, Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z5 = true;
                        bVar2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    bVar2.h(4, null);
                }
                bVar2.f3035a = true;
                byte[] bArr3 = f3055b;
                try {
                    try {
                        r6 = bVar2.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        fVar.c(6, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        cVarArr2 = (c[]) bVar2.f3042h;
                        if (cVarArr2 != null) {
                        }
                        bVar = bVar2;
                        f fVar2 = (f) bVar.f3037c;
                        cVarArr3 = (c[]) bVar.f3042h;
                        ?? r62 = r6;
                        if (cVarArr3 != null) {
                        }
                        bArr = (byte[]) bVar.f3039e;
                        if (bArr == null) {
                        }
                        if (z7) {
                        }
                        n.c(context, (z7 || !z) ? false : z5);
                    } catch (IOException e6) {
                        fVar.c(7, e6);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        cVarArr2 = (c[]) bVar2.f3042h;
                        if (cVarArr2 != null) {
                        }
                        bVar = bVar2;
                        f fVar22 = (f) bVar.f3037c;
                        cVarArr3 = (c[]) bVar.f3042h;
                        ?? r622 = r6;
                        if (cVarArr3 != null) {
                        }
                        bArr = (byte[]) bVar.f3039e;
                        if (bArr == null) {
                        }
                        if (z7) {
                        }
                        n.c(context, (z7 || !z) ? false : z5);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e7) {
                            i2 = 7;
                            fVar.c(7, e7);
                            try {
                                r6.close();
                            } catch (IOException e8) {
                                iOException = e8;
                                fVar.c(i2, iOException);
                                cVarArr = null;
                                r6 = r6;
                                bVar2.f3042h = cVarArr;
                                cVarArr2 = (c[]) bVar2.f3042h;
                                if (cVarArr2 != null) {
                                }
                                bVar = bVar2;
                                f fVar222 = (f) bVar.f3037c;
                                cVarArr3 = (c[]) bVar.f3042h;
                                ?? r6222 = r6;
                                if (cVarArr3 != null) {
                                }
                                bArr = (byte[]) bVar.f3039e;
                                if (bArr == null) {
                                }
                                if (z7) {
                                }
                                n.c(context, (z7 || !z) ? false : z5);
                            }
                            cVarArr = null;
                            r6 = r6;
                            bVar2.f3042h = cVarArr;
                            cVarArr2 = (c[]) bVar2.f3042h;
                            if (cVarArr2 != null) {
                            }
                            bVar = bVar2;
                            f fVar2222 = (f) bVar.f3037c;
                            cVarArr3 = (c[]) bVar.f3042h;
                            ?? r62222 = r6;
                            if (cVarArr3 != null) {
                            }
                            bArr = (byte[]) bVar.f3039e;
                            if (bArr == null) {
                            }
                            if (z7) {
                            }
                            n.c(context, (z7 || !z) ? false : z5);
                        } catch (IllegalStateException e9) {
                            try {
                                fVar.c(8, e9);
                                try {
                                    r6.close();
                                } catch (IOException e10) {
                                    iOException = e10;
                                    i2 = 7;
                                    fVar.c(i2, iOException);
                                    cVarArr = null;
                                    r6 = r6;
                                    bVar2.f3042h = cVarArr;
                                    cVarArr2 = (c[]) bVar2.f3042h;
                                    if (cVarArr2 != null) {
                                    }
                                    bVar = bVar2;
                                    f fVar22222 = (f) bVar.f3037c;
                                    cVarArr3 = (c[]) bVar.f3042h;
                                    ?? r622222 = r6;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr = (byte[]) bVar.f3039e;
                                    if (bArr == null) {
                                    }
                                    if (z7) {
                                    }
                                    n.c(context, (z7 || !z) ? false : z5);
                                }
                                cVarArr = null;
                                r6 = r6;
                                bVar2.f3042h = cVarArr;
                                cVarArr2 = (c[]) bVar2.f3042h;
                                if (cVarArr2 != null) {
                                }
                                bVar = bVar2;
                                f fVar222222 = (f) bVar.f3037c;
                                cVarArr3 = (c[]) bVar.f3042h;
                                ?? r6222222 = r6;
                                if (cVarArr3 != null) {
                                }
                                bArr = (byte[]) bVar.f3039e;
                                if (bArr == null) {
                                }
                                if (z7) {
                                }
                                n.c(context, (z7 || !z) ? false : z5);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e11) {
                                    fVar.c(7, e11);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        cVarArr = l(r6, f(r6, 4), (String) bVar2.f3041g);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e12) {
                            IOException iOException2 = e12;
                            fVar.c(7, iOException2);
                            r6 = iOException2;
                        }
                        bVar2.f3042h = cVarArr;
                    }
                    cVarArr2 = (c[]) bVar2.f3042h;
                    if (cVarArr2 != null) {
                        int i6 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        if (i6 <= 34) {
                            r6 = 25;
                            r6 = 25;
                            if (i6 != 25) {
                                switch (i6) {
                                }
                            }
                            try {
                                g6 = bVar2.g(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e13) {
                                fVar.c(9, e13);
                            } catch (IOException e14) {
                                fVar.c(7, e14);
                            } catch (IllegalStateException e15) {
                                bVar2.f3042h = null;
                                fVar.c(8, e15);
                            }
                            if (g6 != null) {
                                try {
                                    boolean equals = Arrays.equals(f3056c, f(g6, 4));
                                    if (!equals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f3042h = i(g6, f(g6, 4), bArr2, cVarArr2);
                                    g6.close();
                                    bVar = bVar2;
                                    r6 = equals;
                                } finally {
                                }
                            } else {
                                if (g6 != null) {
                                    g6.close();
                                }
                                bVar = null;
                            }
                        }
                    }
                    bVar = bVar2;
                    f fVar2222222 = (f) bVar.f3037c;
                    cVarArr3 = (c[]) bVar.f3042h;
                    ?? r62222222 = r6;
                    if (cVarArr3 != null) {
                        byte[] bArr4 = (byte[]) bVar.f3038d;
                        r62222222 = bArr4;
                        if (bArr4 != null) {
                            if (!bVar.f3035a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e16) {
                                fVar2222222.c(7, e16);
                            } catch (IllegalStateException e17) {
                                fVar2222222.c(8, e17);
                            }
                            if (o(byteArrayOutputStream, bArr4, cVarArr3)) {
                                bVar.f3039e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bVar.f3042h = null;
                                r62222222 = bArr4;
                            } else {
                                fVar2222222.c(5, null);
                                bVar.f3042h = null;
                                byteArrayOutputStream.close();
                                r62222222 = bArr4;
                            }
                        }
                    }
                    bArr = (byte[]) bVar.f3039e;
                    if (bArr == null) {
                        z7 = false;
                        z5 = true;
                    } else {
                        try {
                            if (!bVar.f3035a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) bVar.f3040f);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z5 = true;
                                                        try {
                                                            bVar.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            bVar.f3039e = null;
                                                            bVar.f3042h = null;
                                                            z7 = true;
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
                                } catch (FileNotFoundException e18) {
                                    e = e18;
                                    r62222222 = 1;
                                    bVar.h(6, e);
                                    z6 = r62222222;
                                    z7 = false;
                                    z5 = z6;
                                    if (z7) {
                                    }
                                    n.c(context, (z7 || !z) ? false : z5);
                                } catch (IOException e19) {
                                    e = e19;
                                    r62222222 = 1;
                                    bVar.h(7, e);
                                    z6 = r62222222;
                                    z7 = false;
                                    z5 = z6;
                                    if (z7) {
                                    }
                                    n.c(context, (z7 || !z) ? false : z5);
                                }
                            } catch (FileNotFoundException e20) {
                                e = e20;
                                bVar.h(6, e);
                                z6 = r62222222;
                                z7 = false;
                                z5 = z6;
                                if (z7) {
                                }
                                n.c(context, (z7 || !z) ? false : z5);
                            } catch (IOException e21) {
                                e = e21;
                                bVar.h(7, e);
                                z6 = r62222222;
                                z7 = false;
                                z5 = z6;
                                if (z7) {
                                }
                                n.c(context, (z7 || !z) ? false : z5);
                            }
                        } finally {
                            bVar.f3039e = null;
                            bVar.f3042h = null;
                        }
                    }
                    if (z7) {
                        e(packageInfo, filesDir);
                    }
                    n.c(context, (z7 || !z) ? false : z5);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z5 = true;
            z7 = false;
            n.c(context, (z7 || !z) ? false : z5);
        } catch (PackageManager.NameNotFoundException e22) {
            fVar.c(7, e22);
            n.c(context, false);
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
