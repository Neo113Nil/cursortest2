package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0877Mi {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public com.facebook.ads.redexgen.core.InterfaceC0876Mh A00;
    public com.facebook.ads.redexgen.core.InterfaceC0876Mh A01;
    public final android.util.SparseArray<java.lang.String> A02;
    public final android.util.SparseBooleanArray A03;
    public final android.util.SparseBooleanArray A04;
    public final java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> A05;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, 6, 122, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 122, 5, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, 6, 96, 5, com.google.common.base.Ascii.DC4, 17, 17, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC2, 32, 33, 66, 101, 125, 106, 103, 98, 111, 43, 125, 106, 103, 126, 110, 43, 120, 98, 113, 110, 49, 43, Byte.MAX_VALUE, 125, Byte.MAX_VALUE, 116, 121, 120, 67, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 67, 117, 114, 120, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public C0877Mi(com.facebook.ads.redexgen.core.C5O c5o, java.io.File file, byte[] bArr, boolean z, boolean z2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08((c5o == null && file == null) ? false : true);
        this.A05 = new java.util.HashMap<>();
        this.A02 = new android.util.SparseArray<>();
        this.A04 = new android.util.SparseBooleanArray();
        this.A03 = new android.util.SparseBooleanArray();
        com.facebook.ads.redexgen.core.C1849kQ c1849kQ = c5o != null ? new com.facebook.ads.redexgen.core.C1849kQ(c5o) : null;
        com.facebook.ads.redexgen.core.InterfaceC0876Mh databaseStorage = file != null ? new com.facebook.ads.redexgen.core.C1848kP(new java.io.File(file, A04(42, 24, 47)), bArr, z) : null;
        if (c1849kQ == null || (databaseStorage != null && z2)) {
            com.facebook.ads.redexgen.core.InterfaceC0876Mh legacyStorage = (com.facebook.ads.redexgen.core.InterfaceC0876Mh) com.facebook.ads.redexgen.core.C5C.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c1849kQ;
        } else {
            this.A01 = c1849kQ;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(android.util.SparseArray<java.lang.String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private com.facebook.ads.redexgen.core.C0875Mg A01(java.lang.String str) {
        int A00 = A00(this.A02);
        com.facebook.ads.redexgen.core.C0875Mg c0875Mg = new com.facebook.ads.redexgen.core.C0875Mg(A00, str);
        this.A05.put(str, c0875Mg);
        this.A02.put(A00, str);
        this.A03.put(A00, true);
        this.A01.AGK(c0875Mg);
        return c0875Mg;
    }

    public static com.facebook.ads.redexgen.core.C1846kN A02(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int readInt = dataInputStream.readInt();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < readInt; nextBytesToRead++) {
            java.lang.String readUTF = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i = java.lang.Math.min(bytesRead, 10485760);
                byte[] bArr = com.facebook.ads.redexgen.core.C5C.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i;
                    bArr = java.util.Arrays.copyOf(bArr, size);
                    dataInputStream.readFully(bArr, valueSize, i);
                    valueSize += i;
                    int size2 = bytesRead - valueSize;
                    i = java.lang.Math.min(size2, 10485760);
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new java.io.IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new com.facebook.ads.redexgen.core.C1846kN(hashMap);
    }

    public static javax.crypto.Cipher A05() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        int i = com.facebook.ads.redexgen.core.C5C.A02;
        java.lang.String A04 = A04(0, 20, 102);
        if (i == 18) {
            try {
                return javax.crypto.Cipher.getInstance(A04, A04(20, 2, 81));
            } catch (java.lang.Throwable unused) {
            }
        }
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(A04);
        java.lang.String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(com.facebook.ads.redexgen.core.C1846kN c1846kN, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> A062 = c1846kN.A06();
        dataOutputStream.writeInt(A062.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : A062) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(java.lang.String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(java.lang.String str) {
        return A0D(str).A01;
    }

    public final com.facebook.ads.redexgen.core.C0875Mg A0C(java.lang.String str) {
        return this.A05.get(str);
    }

    public final com.facebook.ads.redexgen.core.C0875Mg A0D(java.lang.String str) {
        com.facebook.ads.redexgen.core.C0875Mg cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final com.facebook.ads.redexgen.core.C1846kN A0E(java.lang.String str) {
        com.facebook.ads.redexgen.core.C0875Mg cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : com.facebook.ads.redexgen.core.C1846kN.A03;
    }

    public final java.lang.String A0F(int i) {
        return this.A02.get(i);
    }

    public final java.util.Collection<com.facebook.ads.redexgen.core.C0875Mg> A0G() {
        return java.util.Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        com.facebook.ads.redexgen.core.C4C A0N = com.facebook.ads.redexgen.core.BO.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean hasNext = A0N.hasNext();
            java.lang.String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (hasNext) {
                A0K((java.lang.String) A0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws java.io.IOException {
        this.A01.AKJ(this.A05);
        int size = this.A04.size();
        for (int i = 0; i < size; i++) {
            android.util.SparseArray<java.lang.String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws java.io.IOException {
        this.A01.AAF(j);
        if (this.A00 != null) {
            this.A00.AAF(j);
        }
        if (!this.A01.A6S() && this.A00 != null && this.A00.A6S()) {
            this.A00.AAs(this.A05, this.A02);
            this.A01.AKI(this.A05);
        } else {
            this.A01.AAs(this.A05, this.A02);
        }
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.InterfaceC0876Mh interfaceC0876Mh = this.A00;
            java.lang.String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            interfaceC0876Mh.A5p();
            this.A00 = null;
        }
    }

    public final void A0K(java.lang.String str) {
        com.facebook.ads.redexgen.core.C0875Mg c0875Mg = this.A05.get(str);
        if (c0875Mg != null && c0875Mg.A09() && c0875Mg.A0A()) {
            this.A05.remove(str);
            int i = c0875Mg.A01;
            boolean z = this.A03.get(i);
            this.A01.AFd(c0875Mg, z);
            if (z) {
                this.A02.remove(i);
                this.A03.delete(i);
            } else {
                this.A02.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public final void A0L(java.lang.String str, com.facebook.ads.redexgen.core.C0880Ml c0880Ml) {
        com.facebook.ads.redexgen.core.C0875Mg A0D = A0D(str);
        if (A0D.A0E(c0880Ml)) {
            this.A01.AGK(A0D);
        }
    }
}
