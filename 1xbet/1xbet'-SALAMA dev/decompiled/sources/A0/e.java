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

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f36a = new V(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f37b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f38c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f39d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f40e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f41f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f42g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f43h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
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
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f33g * 2) + 7) & (-8)) / 8) + (cVar.f31e * 2) + d(cVar.f27a, bArr, cVar.f28b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f32f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f41f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f27a, bArr, cVar2.f28b));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f34h;
                int length2 = iArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
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
                int length3 = iArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length3) {
                    int i12 = iArr2[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, byte[] bArr, String str2) {
        byte[] bArr2 = f43h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f42g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return p031e1.k.i(p136t.e.c(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, i8, i7 - i8);
            if (i9 < 0) {
                throw new IllegalStateException(p031e1.k.d(i7, "Not enough bytes to read: "));
            }
            i8 += i9;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i8] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int i10 = fileInputStream.read(bArr2);
                if (i10 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i10);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i8 - iInflate);
                    i9 += i10;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            if (i9 == i7) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f44i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
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
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
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
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
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

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i9 = 0; i9 < cVarArr.length; i9++) {
                    if (cVarArr[i9].f28b.equals(strSubstring)) {
                        cVar = cVarArr[i9];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f30d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f43h)) {
                cVar.f31e = iM;
                cVar.f34h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f40e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i7) throws IOException {
        byte[] bArrF = f(inputStream, i7);
        long j3 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j3 += ((long) (bArrF[i8] & 255)) << (i8 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i8] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            c cVar = cVarArr[i9];
            int iAvailable = byteArrayInputStream.available() - cVar.f32f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f35i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f34h = g(byteArrayInputStream, cVar.f31e);
            int i10 = cVar.f33g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i10 * 2) + 7) & (-8)) / 8));
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bitSetValueOf.get(i11) ? 2 : 0;
                if (bitSetValueOf.get(i11 + i10)) {
                    i12 |= 4;
                }
                if (i12 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i11));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i11), Integer.valueOf(i12 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f39d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f42g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f35i.size() * 4;
                    String strD = d(cVar.f27a, bArr4, cVar.f28b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f34h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f29c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
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
                byte[] bArrB2 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f43h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(cVar2.f27a, bArr6, cVar2.f28b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f35i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f34h.length);
                t(byteArrayOutputStream, cVar2.f29c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
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
                String strD3 = d(cVar3.f27a, bArr2, cVar3.f28b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
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
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            n nVar2 = new n(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i16];
                    Iterator it3 = cVar5.f35i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i16);
                            int length4 = byteArray3.length + i10 + byteArray4.length;
                            int i18 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i17 = i18 + length4;
                            i16++;
                            arrayList3 = arrayList4;
                            i10 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            n nVar3 = new n(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(nVar3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                n nVar4 = (n) arrayList2.get(i19);
                int i20 = nVar4.f58a;
                if (i20 == 1) {
                    j3 = 0;
                } else if (i20 == 2) {
                    j3 = 1;
                } else if (i20 == 3) {
                    j3 = 2;
                } else if (i20 == 4) {
                    j3 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = nVar4.f59b;
                if (nVar4.f60c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f31e);
        t(byteArrayOutputStream, cVar.f32f, 4);
        t(byteArrayOutputStream, cVar.f29c, 4);
        t(byteArrayOutputStream, cVar.f33g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f33g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f35i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i7 = iIntValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i8 = iIntValue + cVar.f33g;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : cVar.f35i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018b A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #1 {all -> 0x01a1, blocks: (B:99:0x017f, B:101:0x018b, B:112:0x01a4, B:113:0x01a9), top: B:236:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01a4 A[Catch: all -> 0x01a1, TRY_ENTER, TryCatch #1 {all -> 0x01a1, blocks: (B:99:0x017f, B:101:0x018b, B:112:0x01a4, B:113:0x01a9), top: B:236:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01b6 A[Catch: IllegalStateException -> 0x019a, IOException -> 0x019c, FileNotFoundException -> 0x019f, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x019f, IOException -> 0x019c, IllegalStateException -> 0x019a, blocks: (B:97:0x0177, B:102:0x0195, B:121:0x01b6, B:119:0x01b3, B:118:0x01b0), top: B:277:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f7 A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #22 {all -> 0x0206, blocks: (B:138:0x01eb, B:140:0x01f7, B:149:0x0209), top: B:260:0x01eb }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0209 A[Catch: all -> 0x0206, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x0206, blocks: (B:138:0x01eb, B:140:0x01f7, B:149:0x0209), top: B:260:0x01eb }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0227  */
    /* JADX WARN: Code duplicated, block: B:165:0x0233  */
    /* JADX WARN: Code duplicated, block: B:166:0x0237  */
    /* JADX WARN: Code duplicated, block: B:174:0x0253 A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #13 {all -> 0x0276, blocks: (B:171:0x024b, B:172:0x024d, B:174:0x0253), top: B:247:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:217:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:225:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:236:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0177 A[EXC_TOP_SPLITTER, PHI: r6
      0x0177: PHI (r6v27 char) = (r6v26 char), (r6v34 char), (r6v31 char) binds: [B:92:0x016d, B:94:0x0171, B:95:0x0173] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [A0.c[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void s(Context context, Executor executor, d dVar, boolean z4) {
        byte[] bArr;
        ?? A7;
        IOException iOException;
        int i7;
        ?? r7;
        c[] cVarArr;
        b bVar;
        d dVar2;
        c[] cVarArr2;
        ?? r8;
        byte[] bArr2;
        ?? r9;
        boolean z7;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i8;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i9;
        char c3;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        ?? r11;
        boolean z8;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            ?? r15 = 1;
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j3 = dataInputStream.readLong();
                            dataInputStream.close();
                            z8 = j3 == packageInfo.lastUpdateTime;
                            if (z8) {
                                dVar.c(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z8 = false;
                    }
                } else {
                    z8 = false;
                }
                if (z8) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    m.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i10 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr5 = (byte[]) bVar2.f23e;
            if (bArr5 == null) {
                bVar2.b(3, Integer.valueOf(i10));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                bVar2.b(4, null);
                            }
                            if (z7 || !z4) {
                                r11 = 0;
                            } else {
                                r11 = r15;
                            }
                            m.c(context, r11);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            bVar2.b(4, null);
                            z7 = false;
                        }
                        A7 = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e7) {
                        dVar.c(6, e7);
                        A7 = 0;
                    } catch (IOException e8) {
                        dVar.c(7, e8);
                        A7 = 0;
                    }
                    if (A7 != 0) {
                        try {
                            if (!Arrays.equals(bArr, f(A7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c[] cVarArrL = l(A7, f(A7, 4), bVar2.f20b);
                            try {
                                A7.close();
                                r7 = cVarArrL;
                                A7 = A7;
                            } catch (IOException e9) {
                                IOException iOException2 = e9;
                                dVar.c(7, iOException2);
                                r7 = cVarArrL;
                                A7 = iOException2;
                            }
                            bVar2.f26h = r7;
                        } catch (IOException e10) {
                            i7 = 7;
                            dVar.c(7, e10);
                            try {
                                A7.close();
                            } catch (IOException e11) {
                                iOException = e11;
                                dVar.c(i7, iOException);
                                r7 = 0;
                                A7 = A7;
                                bVar2.f26h = r7;
                                cVarArr = (c[]) bVar2.f26h;
                                if (cVarArr != null) {
                                    i9 = Build.VERSION.SDK_INT;
                                    A7 = 34;
                                    if (i9 > 34) {
                                        bVar = bVar2;
                                    } else {
                                        c3 = 24;
                                        if (i9 != 24) {
                                            c3 = 25;
                                            A7 = 25;
                                            c3 = 25;
                                            if (i9 != 25) {
                                                switch (i9) {
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                        try {
                                                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                            if (fileInputStreamA != null) {
                                                                try {
                                                                    zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                                    if (!zEquals) {
                                                                        throw new IllegalStateException("Invalid magic");
                                                                    }
                                                                    bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                                    fileInputStreamA.close();
                                                                    bVar = bVar2;
                                                                    A7 = zEquals;
                                                                } catch (Throwable th4) {
                                                                    try {
                                                                        fileInputStreamA.close();
                                                                        throw th4;
                                                                    } catch (Throwable th5) {
                                                                        th4.addSuppressed(th5);
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } else {
                                                                if (fileInputStreamA != null) {
                                                                    fileInputStreamA.close();
                                                                }
                                                                bVar = null;
                                                                A7 = c3;
                                                            }
                                                        } catch (FileNotFoundException e12) {
                                                            dVar.c(9, e12);
                                                        } catch (IOException e13) {
                                                            dVar.c(7, e13);
                                                        } catch (IllegalStateException e14) {
                                                            bVar2.f26h = null;
                                                            dVar.c(8, e14);
                                                        }
                                                        if (bVar == null) {
                                                            bVar = bVar2;
                                                        }
                                                        break;
                                                    default:
                                                        bVar = bVar2;
                                                        break;
                                                }
                                            } else {
                                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                    if (!zEquals) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                    fileInputStreamA.close();
                                                    bVar = bVar2;
                                                    A7 = zEquals;
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    bVar = null;
                                                    A7 = c3;
                                                }
                                                if (bVar == null) {
                                                    bVar = bVar2;
                                                }
                                            }
                                        } else {
                                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                            if (fileInputStreamA != null) {
                                                zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                if (!zEquals) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                fileInputStreamA.close();
                                                bVar = bVar2;
                                                A7 = zEquals;
                                            } else {
                                                if (fileInputStreamA != null) {
                                                    fileInputStreamA.close();
                                                }
                                                bVar = null;
                                                A7 = c3;
                                            }
                                            if (bVar == null) {
                                                bVar = bVar2;
                                            }
                                        }
                                    }
                                } else {
                                    bVar = bVar2;
                                }
                                dVar2 = (d) bVar.f22d;
                                cVarArr2 = (c[]) bVar.f26h;
                                r8 = A7;
                                if (cVarArr2 != null) {
                                    if (!bVar.f19a) {
                                        r8 = bArr4;
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        r8 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                                bVar.f24f = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bVar.f26h = null;
                                                r8 = bArr4;
                                            } else {
                                                dVar2.c(5, null);
                                                bVar.f26h = null;
                                                byteArrayOutputStream.close();
                                                r8 = bArr4;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e15) {
                                        dVar2.c(7, e15);
                                    } catch (IllegalStateException e16) {
                                        dVar2.c(8, e16);
                                    }
                                }
                                r8 = bArr4;
                                bArr2 = (byte[]) bVar.f24f;
                                if (bArr2 == null) {
                                    z7 = false;
                                    r15 = 1;
                                } else {
                                    try {
                                        if (!bVar.f19a) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream((File) bVar.f25g);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i8 = byteArrayInputStream.read(bArr3);
                                                                if (i8 > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i8);
                                                                } else {
                                                                    r15 = 1;
                                                                    try {
                                                                        bVar.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar.f24f = null;
                                                                        bVar.f26h = null;
                                                                        z7 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e17) {
                                                e = e17;
                                                r8 = 1;
                                                bVar.b(6, e);
                                                r9 = r8;
                                                bVar.f24f = null;
                                                bVar.f26h = null;
                                                z7 = false;
                                                r15 = r9;
                                            } catch (IOException e18) {
                                                e = e18;
                                                r8 = 1;
                                                bVar.b(7, e);
                                                r9 = r8;
                                                bVar.f24f = null;
                                                bVar.f26h = null;
                                                z7 = false;
                                                r15 = r9;
                                            }
                                        } catch (FileNotFoundException e19) {
                                            e = e19;
                                            bVar.b(6, e);
                                            r9 = r8;
                                            bVar.f24f = null;
                                            bVar.f26h = null;
                                            z7 = false;
                                            r15 = r9;
                                        } catch (IOException e20) {
                                            e = e20;
                                            bVar.b(7, e);
                                            r9 = r8;
                                            bVar.f24f = null;
                                            bVar.f26h = null;
                                            z7 = false;
                                            r15 = r9;
                                        }
                                    } catch (Throwable th15) {
                                        bVar.f24f = null;
                                        bVar.f26h = null;
                                        throw th15;
                                    }
                                }
                                if (z7) {
                                    e(packageInfo, filesDir);
                                }
                                if (z7) {
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                }
                                m.c(context, r11);
                            }
                            r7 = 0;
                            A7 = A7;
                        } catch (IllegalStateException e21) {
                            try {
                                dVar.c(8, e21);
                                try {
                                    A7.close();
                                } catch (IOException e22) {
                                    iOException = e22;
                                    i7 = 7;
                                    dVar.c(i7, iOException);
                                    r7 = 0;
                                    A7 = A7;
                                    bVar2.f26h = r7;
                                    cVarArr = (c[]) bVar2.f26h;
                                    if (cVarArr != null) {
                                        i9 = Build.VERSION.SDK_INT;
                                        A7 = 34;
                                        if (i9 > 34) {
                                            bVar = bVar2;
                                        } else {
                                            c3 = 24;
                                            if (i9 != 24) {
                                                c3 = 25;
                                                A7 = 25;
                                                c3 = 25;
                                                if (i9 != 25) {
                                                    switch (i9) {
                                                        case 31:
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                            if (fileInputStreamA != null) {
                                                                zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                                if (!zEquals) {
                                                                    throw new IllegalStateException("Invalid magic");
                                                                }
                                                                bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                                fileInputStreamA.close();
                                                                bVar = bVar2;
                                                                A7 = zEquals;
                                                            } else {
                                                                if (fileInputStreamA != null) {
                                                                    fileInputStreamA.close();
                                                                }
                                                                bVar = null;
                                                                A7 = c3;
                                                            }
                                                            if (bVar == null) {
                                                                bVar = bVar2;
                                                            }
                                                            break;
                                                        default:
                                                            bVar = bVar2;
                                                            break;
                                                    }
                                                } else {
                                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                        if (!zEquals) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                        fileInputStreamA.close();
                                                        bVar = bVar2;
                                                        A7 = zEquals;
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        bVar = null;
                                                        A7 = c3;
                                                    }
                                                    if (bVar == null) {
                                                        bVar = bVar2;
                                                    }
                                                }
                                            } else {
                                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                    if (!zEquals) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                    fileInputStreamA.close();
                                                    bVar = bVar2;
                                                    A7 = zEquals;
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    bVar = null;
                                                    A7 = c3;
                                                }
                                                if (bVar == null) {
                                                    bVar = bVar2;
                                                }
                                            }
                                        }
                                    } else {
                                        bVar = bVar2;
                                    }
                                    dVar2 = (d) bVar.f22d;
                                    cVarArr2 = (c[]) bVar.f26h;
                                    r8 = A7;
                                    if (cVarArr2 != null) {
                                        if (!bVar.f19a) {
                                            r8 = bArr4;
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        r8 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr4);
                                        if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                            dVar2.c(5, null);
                                            bVar.f26h = null;
                                            byteArrayOutputStream.close();
                                            r8 = bArr4;
                                        } else {
                                            bVar.f24f = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bVar.f26h = null;
                                            r8 = bArr4;
                                        }
                                    }
                                    r8 = bArr4;
                                    bArr2 = (byte[]) bVar.f24f;
                                    if (bArr2 == null) {
                                        if (!bVar.f19a) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        fileOutputStream = new FileOutputStream((File) bVar.f25g);
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i8 = byteArrayInputStream.read(bArr3);
                                            if (i8 > 0) {
                                                fileOutputStream.write(bArr3, 0, i8);
                                            } else {
                                                r15 = 1;
                                                bVar.b(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                bVar.f24f = null;
                                                bVar.f26h = null;
                                                z7 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z7 = false;
                                    r15 = 1;
                                    if (z7) {
                                        e(packageInfo, filesDir);
                                    }
                                    if (z7) {
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                    }
                                    m.c(context, r11);
                                }
                                r7 = 0;
                                A7 = A7;
                            } catch (Throwable th16) {
                                th = th16;
                                Throwable th17 = th;
                                try {
                                    A7.close();
                                    throw th17;
                                } catch (IOException e23) {
                                    dVar.c(7, e23);
                                    throw th17;
                                }
                            }
                        }
                    }
                    cVarArr = (c[]) bVar2.f26h;
                    if (cVarArr != null) {
                        i9 = Build.VERSION.SDK_INT;
                        A7 = 34;
                        if (i9 > 34) {
                            bVar = bVar2;
                        } else {
                            c3 = 24;
                            if (i9 != 24) {
                                c3 = 25;
                                A7 = 25;
                                c3 = 25;
                                if (i9 != 25) {
                                    switch (i9) {
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                            if (fileInputStreamA != null) {
                                                zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                                if (!zEquals) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                                fileInputStreamA.close();
                                                bVar = bVar2;
                                                A7 = zEquals;
                                            } else {
                                                if (fileInputStreamA != null) {
                                                    fileInputStreamA.close();
                                                }
                                                bVar = null;
                                                A7 = c3;
                                            }
                                            if (bVar == null) {
                                                bVar = bVar2;
                                            }
                                            break;
                                        default:
                                            bVar = bVar2;
                                            break;
                                    }
                                } else {
                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA != null) {
                                        zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                        if (!zEquals) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                        fileInputStreamA.close();
                                        bVar = bVar2;
                                        A7 = zEquals;
                                    } else {
                                        if (fileInputStreamA != null) {
                                            fileInputStreamA.close();
                                        }
                                        bVar = null;
                                        A7 = c3;
                                    }
                                    if (bVar == null) {
                                        bVar = bVar2;
                                    }
                                }
                            } else {
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA != null) {
                                    zEquals = Arrays.equals(f38c, f(fileInputStreamA, 4));
                                    if (!zEquals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f26h = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, cVarArr);
                                    fileInputStreamA.close();
                                    bVar = bVar2;
                                    A7 = zEquals;
                                } else {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                    }
                                    bVar = null;
                                    A7 = c3;
                                }
                                if (bVar == null) {
                                    bVar = bVar2;
                                }
                            }
                        }
                    } else {
                        bVar = bVar2;
                    }
                    dVar2 = (d) bVar.f22d;
                    cVarArr2 = (c[]) bVar.f26h;
                    r8 = A7;
                    if (cVarArr2 != null && (bArr4 = (byte[]) bVar.f23e) != null) {
                        if (!bVar.f19a) {
                            r8 = bArr4;
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        r8 = bArr4;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                            dVar2.c(5, null);
                            bVar.f26h = null;
                            byteArrayOutputStream.close();
                            r8 = bArr4;
                        } else {
                            bVar.f24f = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar.f26h = null;
                            r8 = bArr4;
                        }
                    }
                    r8 = bArr4;
                    bArr2 = (byte[]) bVar.f24f;
                    if (bArr2 == null) {
                        if (!bVar.f19a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream((File) bVar.f25g);
                        bArr3 = new byte[512];
                        while (true) {
                            i8 = byteArrayInputStream.read(bArr3);
                            if (i8 > 0) {
                                fileOutputStream.write(bArr3, 0, i8);
                            } else {
                                r15 = 1;
                                bVar.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                bVar.f24f = null;
                                bVar.f26h = null;
                                z7 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z7 = false;
                    r15 = 1;
                    if (z7) {
                        e(packageInfo, filesDir);
                    }
                    if (z7) {
                        r11 = 0;
                    } else {
                        r11 = 0;
                    }
                    m.c(context, r11);
                } catch (Throwable th18) {
                    th = th18;
                }
                bVar2.f19a = true;
                bArr = f37b;
            }
            z7 = false;
            if (z7) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            m.c(context, r11);
        } catch (PackageManager.NameNotFoundException e24) {
            dVar.c(7, e24);
            m.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j3 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        t(byteArrayOutputStream, i7, 2);
    }
}
