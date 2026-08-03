package N;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.j f1119a = new m0.j(8, false);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1120b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1121c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1122d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1123e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1124f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1125g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1126h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1127i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1128j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(N.b[] bVarArr, byte[] bArr) {
        int i2 = 0;
        for (N.b bVar : bVarArr) {
            i2 += ((((bVar.f1116g * 2) + 7) & (-8)) / 8) + (bVar.f1114e * 2) + d(bVar.f1110a, bVar.f1111b, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + bVar.f1115f;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2);
        if (java.util.Arrays.equals(bArr, f1124f)) {
            for (N.b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f1110a, bVar2.f1111b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.f1117h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (N.b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f1110a, bVar3.f1111b, bArr));
            }
            for (N.b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.f1117h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean c(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (java.io.File file2 : listFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = f1126h;
        boolean equals = java.util.Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1125g;
        java.lang.Object obj = (equals || java.util.Arrays.equals(bArr, bArr3)) ? io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return "!".equals(obj) ? str2.replace(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        return B1.a.j(sb, (java.util.Arrays.equals(bArr, bArr2) || java.util.Arrays.equals(bArr, bArr3)) ? io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
    }

    public static void e(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException unused) {
        }
    }

    public static byte[] f(java.io.InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new java.lang.IllegalStateException(B1.a.f(i2, "Not enough bytes to read: "));
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] g(java.io.ByteArrayInputStream byteArrayInputStream, int i2) {
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
    public static byte[] h(java.io.FileInputStream fileInputStream, int i2, int i3) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new java.lang.IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (java.util.zip.DataFormatException e2) {
                    throw new java.lang.IllegalStateException(e2.getMessage());
                }
            }
            throw new java.lang.IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static N.b[] i(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, N.b[] bVarArr) {
        byte[] bArr3 = f1127i;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, f1128j)) {
                throw new java.lang.IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new java.lang.IllegalStateException("Content found after the end of file");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(h2);
            try {
                N.b[] k2 = k(byteArrayInputStream, bArr2, m2, bVarArr);
                byteArrayInputStream.close();
                return k2;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(f1122d, bArr2)) {
            throw new java.lang.IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            throw new java.lang.IllegalStateException("Unsupported meta version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(h3);
        try {
            N.b[] j2 = j(byteArrayInputStream2, m3, bVarArr);
            byteArrayInputStream2.close();
            return j2;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static N.b[] j(java.io.ByteArrayInputStream byteArrayInputStream, int i2, N.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new N.b[0];
        }
        if (i2 != bVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new java.lang.String(f(byteArrayInputStream, m2), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            N.b bVar = bVarArr[i4];
            if (!bVar.f1111b.equals(strArr[i4])) {
                throw new java.lang.IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            bVar.f1114e = i5;
            bVar.f1117h = g(byteArrayInputStream, i5);
        }
        return bVarArr;
    }

    public static N.b[] k(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, N.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new N.b[0];
        }
        if (i2 != bVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m3 = (int) m(byteArrayInputStream, 2);
            N.b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i4].f1111b.equals(substring)) {
                        bVar = bVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (bVar == null) {
                throw new java.lang.IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f1113d = m2;
            int[] g2 = g(byteArrayInputStream, m3);
            if (java.util.Arrays.equals(bArr, f1126h)) {
                bVar.f1114e = m3;
                bVar.f1117h = g2;
            }
        }
        return bVarArr;
    }

    public static N.b[] l(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, f1123e)) {
            throw new java.lang.IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(h2);
        try {
            N.b[] n2 = n(byteArrayInputStream, str, m2);
            byteArrayInputStream.close();
            return n2;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(java.io.InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (f2[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static N.b[] n(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i2) {
        java.util.TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new N.b[0];
        }
        N.b[] bVarArr = new N.b[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m3 = (int) m(byteArrayInputStream, 2);
            bVarArr[i3] = new N.b(str, new java.lang.String(f(byteArrayInputStream, m2), java.nio.charset.StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new java.util.TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            N.b bVar = bVarArr[i4];
            int available = byteArrayInputStream.available() - bVar.f1115f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f1118i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) m(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(i5), 1);
                for (int m4 = (int) m(byteArrayInputStream, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new java.lang.IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f1117h = g(byteArrayInputStream, bVar.f1114e);
            int i6 = bVar.f1116g;
            java.util.BitSet valueOf = java.util.BitSet.valueOf(f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(i7) ? 2 : 0;
                if (valueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, N.b[] bVarArr) {
        long j2;
        java.util.ArrayList arrayList;
        int length;
        byte[] bArr2 = f1122d;
        int i2 = 0;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1123e;
            if (java.util.Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f1125g;
            if (java.util.Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (N.b bVar : bVarArr) {
                    int size = bVar.f1118i.size() * 4;
                    java.lang.String d2 = d(bVar.f1110a, bVar.f1111b, bArr4);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d2.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.f1117h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.f1112c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    java.util.Iterator it = bVar.f1118i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : bVar.f1117h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1124f;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f1126h;
            if (!java.util.Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (N.b bVar2 : bVarArr) {
                java.lang.String d3 = d(bVar2.f1110a, bVar2.f1111b, bArr6);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d3.getBytes(charset2).length);
                java.util.TreeMap treeMap = bVar2.f1118i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.f1117h.length);
                t(byteArrayOutputStream, bVar2.f1112c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i4 : bVar2.f1117h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (N.b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.f1112c, 4);
                t(byteArrayOutputStream2, bVar3.f1113d, 4);
                t(byteArrayOutputStream2, bVar3.f1116g, 4);
                java.lang.String d4 = d(bVar3.f1110a, bVar3.f1111b, bArr2);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = d4.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            N.m mVar = new N.m(false, 1, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < bVarArr.length) {
                try {
                    N.b bVar4 = bVarArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, bVar4.f1114e);
                    i8 = i8 + 4 + (bVar4.f1114e * 2);
                    int[] iArr = bVar4.f1117h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        u(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            N.m mVar2 = new N.m(true, 3, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < bVarArr.length) {
                try {
                    N.b bVar5 = bVarArr[i11];
                    java.util.Iterator it3 = bVar5.f1118i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i14 = i12 + 6;
                            java.util.ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            java.util.ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            N.m mVar3 = new N.m(true, 4, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                N.m mVar4 = (N.m) arrayList2.get(i15);
                int i16 = mVar4.f1139a;
                if (i16 == 1) {
                    j2 = 0;
                } else if (i16 == 2) {
                    j2 = 1;
                } else if (i16 == 3) {
                    j2 = 2;
                } else if (i16 == 4) {
                    j2 = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = mVar4.f1140b;
                if (mVar4.f1141c) {
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
                i15++;
                arrayList5 = arrayList;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(java.io.ByteArrayOutputStream byteArrayOutputStream, N.b bVar, java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f1114e);
        t(byteArrayOutputStream, bVar.f1115f, 4);
        t(byteArrayOutputStream, bVar.f1112c, 4);
        t(byteArrayOutputStream, bVar.f1116g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(java.io.ByteArrayOutputStream byteArrayOutputStream, N.b bVar) {
        byte[] bArr = new byte[(((bVar.f1116g * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : bVar.f1118i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + bVar.f1116g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(java.io.ByteArrayOutputStream byteArrayOutputStream, N.b bVar) {
        int i2 = 0;
        for (java.util.Map.Entry entry : bVar.f1118i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
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
    public static void s(android.content.Context context, java.util.concurrent.Executor executor, N.d dVar, boolean z2) {
        boolean z3;
        ?? r6;
        java.io.IOException iOException;
        int i2;
        N.b[] bVarArr;
        N.b[] bVarArr2;
        N.a aVar;
        N.b[] bVarArr3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.FileInputStream g2;
        boolean z6;
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        android.content.res.AssetManager assets = applicationContext.getAssets();
        java.lang.String name = new java.io.File(applicationInfo.sourceDir).getName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            java.io.File filesDir = context.getFilesDir();
            if (!z2) {
                java.io.File file = new java.io.File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = readLong == packageInfo.lastUpdateTime;
                            if (z6) {
                                dVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (java.io.IOException unused) {
                    }
                    if (z6) {
                        android.util.Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        N.l.c(context, false);
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
            android.util.Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = android.os.Build.VERSION.SDK_INT;
            java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            N.a aVar2 = new N.a(assets, executor, dVar, name, file2);
            byte[] bArr2 = (byte[]) aVar2.f1105d;
            if (bArr2 == null) {
                aVar2.h(3, java.lang.Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (java.io.IOException unused2) {
                        z3 = true;
                        aVar2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    aVar2.h(4, null);
                }
                aVar2.f1102a = true;
                byte[] bArr3 = f1120b;
                try {
                    try {
                        r6 = aVar2.g(assets, "dexopt/baseline.prof");
                    } catch (java.io.FileNotFoundException e2) {
                        dVar.a(6, e2);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        bVarArr2 = (N.b[]) aVar2.f1109h;
                        if (bVarArr2 != null) {
                        }
                        aVar = aVar2;
                        N.d dVar2 = (N.d) aVar.f1104c;
                        bVarArr3 = (N.b[]) aVar.f1109h;
                        ?? r62 = r6;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) aVar.f1106e;
                        if (bArr == null) {
                        }
                        if (z5) {
                        }
                        N.l.c(context, (z5 || !z2) ? false : z3);
                    } catch (java.io.IOException e3) {
                        dVar.a(7, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        bVarArr2 = (N.b[]) aVar2.f1109h;
                        if (bVarArr2 != null) {
                        }
                        aVar = aVar2;
                        N.d dVar22 = (N.d) aVar.f1104c;
                        bVarArr3 = (N.b[]) aVar.f1109h;
                        ?? r622 = r6;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) aVar.f1106e;
                        if (bArr == null) {
                        }
                        if (z5) {
                        }
                        N.l.c(context, (z5 || !z2) ? false : z3);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (java.io.IOException e4) {
                            i2 = 7;
                            dVar.a(7, e4);
                            try {
                                r6.close();
                            } catch (java.io.IOException e5) {
                                iOException = e5;
                                dVar.a(i2, iOException);
                                bVarArr = null;
                                r6 = r6;
                                aVar2.f1109h = bVarArr;
                                bVarArr2 = (N.b[]) aVar2.f1109h;
                                if (bVarArr2 != null) {
                                }
                                aVar = aVar2;
                                N.d dVar222 = (N.d) aVar.f1104c;
                                bVarArr3 = (N.b[]) aVar.f1109h;
                                ?? r6222 = r6;
                                if (bVarArr3 != null) {
                                }
                                bArr = (byte[]) aVar.f1106e;
                                if (bArr == null) {
                                }
                                if (z5) {
                                }
                                N.l.c(context, (z5 || !z2) ? false : z3);
                            }
                            bVarArr = null;
                            r6 = r6;
                            aVar2.f1109h = bVarArr;
                            bVarArr2 = (N.b[]) aVar2.f1109h;
                            if (bVarArr2 != null) {
                            }
                            aVar = aVar2;
                            N.d dVar2222 = (N.d) aVar.f1104c;
                            bVarArr3 = (N.b[]) aVar.f1109h;
                            ?? r62222 = r6;
                            if (bVarArr3 != null) {
                            }
                            bArr = (byte[]) aVar.f1106e;
                            if (bArr == null) {
                            }
                            if (z5) {
                            }
                            N.l.c(context, (z5 || !z2) ? false : z3);
                        } catch (java.lang.IllegalStateException e6) {
                            try {
                                dVar.a(8, e6);
                                try {
                                    r6.close();
                                } catch (java.io.IOException e7) {
                                    iOException = e7;
                                    i2 = 7;
                                    dVar.a(i2, iOException);
                                    bVarArr = null;
                                    r6 = r6;
                                    aVar2.f1109h = bVarArr;
                                    bVarArr2 = (N.b[]) aVar2.f1109h;
                                    if (bVarArr2 != null) {
                                    }
                                    aVar = aVar2;
                                    N.d dVar22222 = (N.d) aVar.f1104c;
                                    bVarArr3 = (N.b[]) aVar.f1109h;
                                    ?? r622222 = r6;
                                    if (bVarArr3 != null) {
                                    }
                                    bArr = (byte[]) aVar.f1106e;
                                    if (bArr == null) {
                                    }
                                    if (z5) {
                                    }
                                    N.l.c(context, (z5 || !z2) ? false : z3);
                                }
                                bVarArr = null;
                                r6 = r6;
                                aVar2.f1109h = bVarArr;
                                bVarArr2 = (N.b[]) aVar2.f1109h;
                                if (bVarArr2 != null) {
                                }
                                aVar = aVar2;
                                N.d dVar222222 = (N.d) aVar.f1104c;
                                bVarArr3 = (N.b[]) aVar.f1109h;
                                ?? r6222222 = r6;
                                if (bVarArr3 != null) {
                                }
                                bArr = (byte[]) aVar.f1106e;
                                if (bArr == null) {
                                }
                                if (z5) {
                                }
                                N.l.c(context, (z5 || !z2) ? false : z3);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                java.lang.Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (java.io.IOException e8) {
                                    dVar.a(7, e8);
                                    throw th2;
                                }
                            }
                        }
                        if (!java.util.Arrays.equals(bArr3, f(r6, 4))) {
                            throw new java.lang.IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(r6, f(r6, 4), (java.lang.String) aVar2.f1108g);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (java.io.IOException e9) {
                            java.io.IOException iOException2 = e9;
                            dVar.a(7, iOException2);
                            r6 = iOException2;
                        }
                        aVar2.f1109h = bVarArr;
                    }
                    bVarArr2 = (N.b[]) aVar2.f1109h;
                    if (bVarArr2 != null) {
                        int i4 = android.os.Build.VERSION.SDK_INT;
                        r6 = 34;
                        if (i4 <= 34) {
                            r6 = 25;
                            r6 = 25;
                            if (i4 != 25) {
                                switch (i4) {
                                }
                            }
                            try {
                                g2 = aVar2.g(assets, "dexopt/baseline.profm");
                            } catch (java.io.FileNotFoundException e10) {
                                dVar.a(9, e10);
                            } catch (java.io.IOException e11) {
                                dVar.a(7, e11);
                            } catch (java.lang.IllegalStateException e12) {
                                aVar2.f1109h = null;
                                dVar.a(8, e12);
                            }
                            if (g2 != null) {
                                try {
                                    boolean equals = java.util.Arrays.equals(f1121c, f(g2, 4));
                                    if (!equals) {
                                        throw new java.lang.IllegalStateException("Invalid magic");
                                    }
                                    aVar2.f1109h = i(g2, f(g2, 4), bArr2, bVarArr2);
                                    g2.close();
                                    aVar = aVar2;
                                    r6 = equals;
                                } finally {
                                }
                            } else {
                                if (g2 != null) {
                                    g2.close();
                                }
                                aVar = null;
                            }
                        }
                    }
                    aVar = aVar2;
                    N.d dVar2222222 = (N.d) aVar.f1104c;
                    bVarArr3 = (N.b[]) aVar.f1109h;
                    ?? r62222222 = r6;
                    if (bVarArr3 != null) {
                        byte[] bArr4 = (byte[]) aVar.f1105d;
                        r62222222 = bArr4;
                        if (bArr4 != null) {
                            if (!aVar.f1102a) {
                                throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (java.io.IOException e13) {
                                dVar2222222.a(7, e13);
                            } catch (java.lang.IllegalStateException e14) {
                                dVar2222222.a(8, e14);
                            }
                            if (o(byteArrayOutputStream, bArr4, bVarArr3)) {
                                aVar.f1106e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                aVar.f1109h = null;
                                r62222222 = bArr4;
                            } else {
                                dVar2222222.a(5, null);
                                aVar.f1109h = null;
                                byteArrayOutputStream.close();
                                r62222222 = bArr4;
                            }
                        }
                    }
                    bArr = (byte[]) aVar.f1106e;
                    if (bArr == null) {
                        z5 = false;
                        z3 = true;
                    } else {
                        try {
                            if (!aVar.f1102a) {
                                throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                                    try {
                                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream((java.io.File) aVar.f1107f);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z3 = true;
                                                        try {
                                                            aVar.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            aVar.f1106e = null;
                                                            aVar.f1109h = null;
                                                            z5 = true;
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                            java.lang.Throwable th4 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th4;
                                                            } catch (java.lang.Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                java.lang.Throwable th7 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th7;
                                                } catch (java.lang.Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                    throw th7;
                                                }
                                            }
                                        } catch (java.lang.Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (java.lang.Throwable th10) {
                                        th = th10;
                                    }
                                } catch (java.io.FileNotFoundException e15) {
                                    e = e15;
                                    r62222222 = 1;
                                    aVar.h(6, e);
                                    z4 = r62222222;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    N.l.c(context, (z5 || !z2) ? false : z3);
                                } catch (java.io.IOException e16) {
                                    e = e16;
                                    r62222222 = 1;
                                    aVar.h(7, e);
                                    z4 = r62222222;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    N.l.c(context, (z5 || !z2) ? false : z3);
                                }
                            } catch (java.io.FileNotFoundException e17) {
                                e = e17;
                                aVar.h(6, e);
                                z4 = r62222222;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                N.l.c(context, (z5 || !z2) ? false : z3);
                            } catch (java.io.IOException e18) {
                                e = e18;
                                aVar.h(7, e);
                                z4 = r62222222;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                N.l.c(context, (z5 || !z2) ? false : z3);
                            }
                        } finally {
                            aVar.f1106e = null;
                            aVar.f1109h = null;
                        }
                    }
                    if (z5) {
                        e(packageInfo, filesDir);
                    }
                    N.l.c(context, (z5 || !z2) ? false : z3);
                } catch (java.lang.Throwable th11) {
                    th = th11;
                }
            }
            z3 = true;
            z5 = false;
            N.l.c(context, (z5 || !z2) ? false : z3);
        } catch (android.content.pm.PackageManager.NameNotFoundException e19) {
            dVar.a(7, e19);
            N.l.c(context, false);
        }
    }

    public static void t(java.io.ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
