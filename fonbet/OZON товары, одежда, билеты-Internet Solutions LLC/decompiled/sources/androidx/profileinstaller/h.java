package androidx.profileinstaller;

import C.o0;
import Ij.C3261b;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f44638a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f44639b = {112, 114, 109, 0};

    @NonNull
    private static byte[] a(@NonNull c[] cVarArr, @NonNull byte[] bArr) throws IOException {
        int i11 = 0;
        int i12 = 0;
        for (c cVar : cVarArr) {
            i12 += ((((cVar.f44631g * 2) + 7) & (-8)) / 8) + (cVar.f44629e * 2) + b(bArr, cVar.f44625a, cVar.f44626b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f44630f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        if (Arrays.equals(bArr, j.f44650c)) {
            int length = cVarArr.length;
            while (i11 < length) {
                c cVar2 = cVarArr[i11];
                k(byteArrayOutputStream, cVar2, b(bArr, cVar2.f44625a, cVar2.f44626b));
                j(byteArrayOutputStream, cVar2);
                i11++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                k(byteArrayOutputStream, cVar3, b(bArr, cVar3.f44625a, cVar3.f44626b));
            }
            int length2 = cVarArr.length;
            while (i11 < length2) {
                j(byteArrayOutputStream, cVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == i12) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i12);
    }

    @NonNull
    private static String b(@NonNull byte[] bArr, @NonNull String str, @NonNull String str2) {
        byte[] bArr2 = j.f44652e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = j.f44651d;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? ProductContainerDTO.RATIO_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(ProductContainerDTO.RATIO_DELIMITER, "!");
            }
            if (ProductContainerDTO.RATIO_DELIMITER.equals(obj)) {
                return str2.replace("!", ProductContainerDTO.RATIO_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(ProductContainerDTO.RATIO_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(ProductContainerDTO.RATIO_DELIMITER, "!");
                }
                if (ProductContainerDTO.RATIO_DELIMITER.equals(obj)) {
                    return str2.replace("!", ProductContainerDTO.RATIO_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return o0.c(C3261b.e(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ProductContainerDTO.RATIO_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    private static int[] c(@NonNull ByteArrayInputStream byteArrayInputStream, int i11) throws IOException {
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += (int) d.d(byteArrayInputStream, 2);
            iArr[i13] = i12;
        }
        return iArr;
    }

    @NonNull
    static c[] d(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = j.f44653f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j.f44654g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int d11 = (int) d.d(fileInputStream, 2);
            byte[] c11 = d.c(fileInputStream, (int) d.d(fileInputStream, 4), (int) d.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c11);
            try {
                c[] f7 = f(byteArrayInputStream, bArr2, d11, cVarArr);
                byteArrayInputStream.close();
                return f7;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(j.f44648a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int d12 = (int) d.d(fileInputStream, 1);
        byte[] c12 = d.c(fileInputStream, (int) d.d(fileInputStream, 4), (int) d.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c12);
        try {
            c[] e11 = e(byteArrayInputStream2, d12, cVarArr);
            byteArrayInputStream2.close();
            return e11;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @NonNull
    private static c[] e(@NonNull ByteArrayInputStream byteArrayInputStream, int i11, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i11 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int d11 = (int) d.d(byteArrayInputStream, 2);
            iArr[i12] = (int) d.d(byteArrayInputStream, 2);
            strArr[i12] = new String(d.b(byteArrayInputStream, d11), StandardCharsets.UTF_8);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            if (!cVar.f44626b.equals(strArr[i13])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i14 = iArr[i13];
            cVar.f44629e = i14;
            cVar.f44632h = c(byteArrayInputStream, i14);
        }
        return cVarArr;
    }

    @NonNull
    private static c[] f(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i11, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i11 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            d.d(byteArrayInputStream, 2);
            String str = new String(d.b(byteArrayInputStream, (int) d.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long d11 = d.d(byteArrayInputStream, 4);
            int d12 = (int) d.d(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(ProductContainerDTO.RATIO_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i13 = 0;
                while (true) {
                    if (i13 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i13].f44626b.equals(substring)) {
                        cVar = cVarArr[i13];
                        break;
                    }
                    i13++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f44628d = d11;
            int[] c11 = c(byteArrayInputStream, d12);
            if (Arrays.equals(bArr, j.f44652e)) {
                cVar.f44629e = d12;
                cVar.f44632h = c11;
            }
        }
        return cVarArr;
    }

    @NonNull
    static c[] g(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, j.f44649b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int d11 = (int) d.d(fileInputStream, 1);
        byte[] c11 = d.c(fileInputStream, (int) d.d(fileInputStream, 4), (int) d.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c11);
        try {
            c[] h11 = h(byteArrayInputStream, str, d11);
            byteArrayInputStream.close();
            return h11;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private static c[] h(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i11) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int d11 = (int) d.d(byteArrayInputStream, 2);
            int d12 = (int) d.d(byteArrayInputStream, 2);
            cVarArr[i12] = new c(str, new String(d.b(byteArrayInputStream, d11), StandardCharsets.UTF_8), d.d(byteArrayInputStream, 4), d12, (int) d.d(byteArrayInputStream, 4), (int) d.d(byteArrayInputStream, 4), new int[d12], new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            int available = byteArrayInputStream.available() - cVar.f44630f;
            int i14 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f44633i;
                if (available2 <= available) {
                    break;
                }
                i14 += (int) d.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i14), 1);
                for (int d13 = (int) d.d(byteArrayInputStream, 2); d13 > 0; d13--) {
                    d.d(byteArrayInputStream, 2);
                    int d14 = (int) d.d(byteArrayInputStream, 1);
                    if (d14 != 6 && d14 != 7) {
                        while (d14 > 0) {
                            d.d(byteArrayInputStream, 1);
                            for (int d15 = (int) d.d(byteArrayInputStream, 1); d15 > 0; d15--) {
                                d.d(byteArrayInputStream, 2);
                            }
                            d14--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f44632h = c(byteArrayInputStream, cVar.f44629e);
            int i15 = cVar.f44631g;
            BitSet valueOf = BitSet.valueOf(d.b(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = valueOf.get(i16) ? 2 : 0;
                if (valueOf.get(i16 + i15)) {
                    i17 |= 4;
                }
                if (i17 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i16));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    static boolean i(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull c[] cVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = j.f44648a;
        int i11 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = j.f44649b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a11 = a(cVarArr, bArr3);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, a11.length, 4);
                byte[] a12 = d.a(a11);
                d.e(byteArrayOutputStream, a12.length, 4);
                byteArrayOutputStream.write(a12);
                return true;
            }
            byte[] bArr4 = j.f44651d;
            if (Arrays.equals(bArr, bArr4)) {
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f44633i.size() * 4;
                    String b11 = b(bArr4, cVar.f44625a, cVar.f44626b);
                    Charset charset = StandardCharsets.UTF_8;
                    d.f(byteArrayOutputStream, b11.getBytes(charset).length);
                    d.f(byteArrayOutputStream, cVar.f44632h.length);
                    d.e(byteArrayOutputStream, size, 4);
                    d.e(byteArrayOutputStream, cVar.f44627c, 4);
                    byteArrayOutputStream.write(b11.getBytes(charset));
                    Iterator<Integer> it = cVar.f44633i.keySet().iterator();
                    while (it.hasNext()) {
                        d.f(byteArrayOutputStream, it.next().intValue());
                        d.f(byteArrayOutputStream, 0);
                    }
                    for (int i12 : cVar.f44632h) {
                        d.f(byteArrayOutputStream, i12);
                    }
                }
                return true;
            }
            byte[] bArr5 = j.f44650c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a13 = a(cVarArr, bArr5);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, a13.length, 4);
                byte[] a14 = d.a(a13);
                d.e(byteArrayOutputStream, a14.length, 4);
                byteArrayOutputStream.write(a14);
                return true;
            }
            byte[] bArr6 = j.f44652e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            d.f(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String b12 = b(bArr6, cVar2.f44625a, cVar2.f44626b);
                Charset charset2 = StandardCharsets.UTF_8;
                d.f(byteArrayOutputStream, b12.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = cVar2.f44633i;
                d.f(byteArrayOutputStream, treeMap.size());
                d.f(byteArrayOutputStream, cVar2.f44632h.length);
                d.e(byteArrayOutputStream, cVar2.f44627c, 4);
                byteArrayOutputStream.write(b12.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    d.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i13 : cVar2.f44632h) {
                    d.f(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            d.f(byteArrayOutputStream2, cVarArr.length);
            int i14 = 2;
            int i15 = 2;
            for (c cVar3 : cVarArr) {
                d.e(byteArrayOutputStream2, cVar3.f44627c, 4);
                d.e(byteArrayOutputStream2, cVar3.f44628d, 4);
                d.e(byteArrayOutputStream2, cVar3.f44631g, 4);
                String b13 = b(bArr2, cVar3.f44625a, cVar3.f44626b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b13.getBytes(charset3).length;
                d.f(byteArrayOutputStream2, length2);
                i15 = i15 + 14 + length2;
                byteArrayOutputStream2.write(b13.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i15 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(e.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            for (int i17 = 0; i17 < cVarArr.length; i17++) {
                try {
                    c cVar4 = cVarArr[i17];
                    d.f(byteArrayOutputStream3, i17);
                    d.f(byteArrayOutputStream3, cVar4.f44629e);
                    i16 = i16 + 4 + (cVar4.f44629e * i14);
                    int[] iArr = cVar4.f44632h;
                    int length3 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length3) {
                        int i21 = iArr[i18];
                        d.f(byteArrayOutputStream3, i21 - i19);
                        i18++;
                        i14 = i14;
                        i19 = i21;
                    }
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(e.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i22 = 0;
            int i23 = 0;
            while (i22 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i22];
                    Iterator<Map.Entry<Integer, Integer>> it3 = cVar5.f44633i.entrySet().iterator();
                    int i24 = i11;
                    while (it3.hasNext()) {
                        i24 |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, i24, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            d.f(byteArrayOutputStream3, i22);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i25 = i23 + 6;
                            ArrayList arrayList4 = arrayList3;
                            d.e(byteArrayOutputStream3, length4, 4);
                            d.f(byteArrayOutputStream3, i24);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i23 = i25 + length4;
                            i22++;
                            arrayList3 = arrayList4;
                            i11 = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i23 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i23 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(e.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            d.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i26 = 0;
            while (i26 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i26);
                d.e(byteArrayOutputStream, kVar4.f44655a.a(), 4);
                d.e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = kVar4.f44656b;
                if (kVar4.f44657c) {
                    long length5 = bArr7.length;
                    byte[] a15 = d.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a15);
                    d.e(byteArrayOutputStream, a15.length, 4);
                    d.e(byteArrayOutputStream, length5, 4);
                    length = a15.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    d.e(byteArrayOutputStream, bArr7.length, 4);
                    d.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i26++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i27));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    private static void j(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar) throws IOException {
        m(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f44632h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            d.f(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        int i14 = cVar.f44631g;
        byte[] bArr = new byte[(((i14 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f44633i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                int i15 = intValue / 8;
                bArr[i15] = (byte) (bArr[i15] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i16 = intValue + i14;
                int i17 = i16 / 8;
                bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    private static void k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar, @NonNull String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        d.f(byteArrayOutputStream, str.getBytes(charset).length);
        d.f(byteArrayOutputStream, cVar.f44629e);
        d.e(byteArrayOutputStream, cVar.f44630f, 4);
        d.e(byteArrayOutputStream, cVar.f44627c, 4);
        d.e(byteArrayOutputStream, cVar.f44631g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    private static void l(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i11, @NonNull c cVar) throws IOException {
        int bitCount = Integer.bitCount(i11 & (-2));
        int i12 = cVar.f44631g;
        byte[] bArr = new byte[(((bitCount * i12) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f44633i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i13 = 0;
            for (int i14 = 1; i14 <= 4; i14 <<= 1) {
                if (i14 != 1 && (i14 & i11) != 0) {
                    if ((i14 & intValue2) == i14) {
                        int i15 = (i13 * i12) + intValue;
                        int i16 = i15 / 8;
                        bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
                    }
                    i13++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    private static void m(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar) throws IOException {
        int i11 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f44633i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.f(byteArrayOutputStream, intValue - i11);
                d.f(byteArrayOutputStream, 0);
                i11 = intValue;
            }
        }
    }
}
