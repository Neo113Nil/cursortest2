package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Uj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1080Uj implements java.io.Closeable {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"eAEkEYRVeXrfS58a4k5WuKPwy8inSFa", "kCWvHOIytqFj1LqyoQQyp7", "68j8lTajfoiD43mqP1eMjl4G9M", "TuTeUuVTuzlBunCet0oFaCexHHLwVmnb", "nTNwkbliDK7ulO", "oDpWF45gCEuTtB4s", "WYN7gIj7AgnNZEOK", "71vjkKoJ6BpaE0wznNMgre6CgC3xNcNz"};
    public final com.facebook.ads.redexgen.core.UZ A01;
    public final java.util.Deque<com.facebook.ads.redexgen.core.C1079Ui> A02 = new java.util.LinkedList();
    public boolean A00 = false;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-37, 7, com.google.common.base.Ascii.CR, 4, -4, -72, 6, 7, com.google.common.base.Ascii.FF, -72, -7, -4, -4, -72, 10, -3, -5, 7, 10, -4, -72, com.google.common.base.Ascii.FF, 7, -72, 6, -3, com.google.common.base.Ascii.SI, 4, 17, -72, -7, -4, -4, -3, -4, -72, -2, 1, 4, -3, com.google.common.base.Ascii.RS, 57, 65, 68, kotlin.io.encoding.Base64.padSymbol, 60, -8, 76, 71, -8, 60, kotlin.io.encoding.Base64.padSymbol, 68, kotlin.io.encoding.Base64.padSymbol, 76, kotlin.io.encoding.Base64.padSymbol, -8, 62, 65, 68, kotlin.io.encoding.Base64.padSymbol, -8, -1, -3, 75, -1, -73, -46, -38, -35, -42, -43, -111, -27, -32, -111, -35, -38, -28, -27, -111, -41, -38, -35, -42, -43, -111, -38, -33, -111, -43, -38, -29, -42, -44, -27, -32, -29, -22, -111, -104, -106, -28, -104, -31, -4, 4, 7, 0, -1, -69, com.google.common.base.Ascii.SI, 10, -69, 7, 10, -4, -1, -69, 1, 4, 7, 0, -69, -62, -64, com.google.common.base.Ascii.SO, -62, -57, -69, com.google.common.base.Ascii.SO, 6, 4, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 4, 9, 2, -69, -4, 7, 7, -69, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, 0, 17, 4, 10, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SO, -69, 1, 4, 7, 0, com.google.common.base.Ascii.SO, -69, com.google.common.base.Ascii.DLE, 9, com.google.common.base.Ascii.SI, 4, 7, -69, -64, -1, -37, -4, -5, -70, -16, -4, -5, 1, -10, -12, 2, -4, 2, 0, -83, -5, -18, -6, -14, -15, -83, -13, -10, -7, -14, -83, -10, -5, -83, -7, -4, -12, -12, -10, -5, -12, -83, -15, -10, -1, -14, -16, 1, -4, -1, 6, -57, -83, -78, -15, -71, -83, -6, -10, -5, -83, -10, 0, -83, -78, -15, -43, -24, -26, -14, -11, -25, -55, -20, -17, -24, -42, -24, -12, -8, -24, -15, -26, -24, -93, -28, -17, -11, -24, -28, -25, -4, -93, -26, -17, -14, -10, -24, -25, 47, 72, 69, 72, 73, 81, 72, -6, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 70, 63, -6, 67, 72, -6, 70, 73, 65, 65, 67, 72, 65, -6, 62, 67, 76, 63, kotlin.io.encoding.Base64.padSymbol, 78, 73, 76, 83, com.google.common.base.Ascii.DC4, -6, 1, -1, 77, 1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09() throws java.io.IOException {
        int i;
        if (this.A00) {
            throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
        }
        i = 0;
        java.util.Iterator<com.facebook.ads.redexgen.core.C1079Ui> it = this.A02.iterator();
        while (it.hasNext()) {
            i += it.next().A01();
        }
        return i;
    }

    static {
        A03();
    }

    public C1080Uj(com.facebook.ads.redexgen.core.UZ uz, com.facebook.ads.redexgen.core.InterfaceC1078Uh interfaceC1078Uh) throws java.io.IOException {
        this.A01 = uz;
        A05(uz, interfaceC1078Uh);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private com.facebook.ads.redexgen.core.C1079Ui A00() throws java.io.IOException {
        int i = -1;
        if (!this.A02.isEmpty()) {
            i = this.A02.getLast().A00();
        }
        int i2 = i + 1;
        this.A02.add(new com.facebook.ads.redexgen.core.C1079Ui(i2, new com.facebook.ads.redexgen.core.C1076Uf(new java.io.File(this.A01.A05(), A01(i2)))));
        return this.A02.getLast();
    }

    public static java.lang.String A01(int i) {
        return java.lang.Integer.toString(i);
    }

    private void A04(int i, java.io.File file) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1076Uf c1076Uf = new com.facebook.ads.redexgen.core.C1076Uf(file);
        c1076Uf.A05();
        this.A02.addFirst(new com.facebook.ads.redexgen.core.C1079Ui(i, c1076Uf));
    }

    private void A05(com.facebook.ads.redexgen.core.UZ uz, com.facebook.ads.redexgen.core.InterfaceC1078Uh interfaceC1078Uh) throws java.io.IOException {
        java.io.File[] listFiles = uz.A05().listFiles();
        if (listFiles != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashSet hashSet = new java.util.HashSet();
            int i = -1;
            for (java.io.File file : listFiles) {
                try {
                    int parseInt = java.lang.Integer.parseInt(file.getName());
                    hashMap.put(java.lang.Integer.valueOf(parseInt), file);
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (java.lang.NumberFormatException unused) {
                    hashSet.add(file);
                    interfaceC1078Uh.AIc(java.lang.String.format(java.util.Locale.US, A02(260, 39, 118), file.getCanonicalPath()));
                }
            }
            boolean isEmpty = hashMap.isEmpty();
            if (A04[0].length() != 31) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "dQtFqGLzpKOzaVLFdcsStellVtbbzgLH";
            if (!isEmpty) {
                int i2 = i;
                while (hashMap.containsKey(java.lang.Integer.valueOf(i2 - 1))) {
                    i2--;
                }
                java.util.Iterator it = new java.util.HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Integer) it.next()).intValue();
                    if (intValue < i2) {
                        interfaceC1078Uh.AIc(java.lang.String.format(java.util.Locale.US, A02(166, 61, 41), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i2)));
                        hashSet.add((java.io.File) hashMap.remove(java.lang.Integer.valueOf(intValue)));
                    }
                }
                while (i >= i2) {
                    java.io.File file2 = (java.io.File) hashMap.get(java.lang.Integer.valueOf(i));
                    try {
                        A04(i, file2);
                        hashMap.remove(java.lang.Integer.valueOf(i));
                        i--;
                    } catch (java.io.IOException e) {
                        interfaceC1078Uh.AId(java.lang.String.format(java.util.Locale.US, A02(104, 62, 55), file2.getCanonicalPath(), java.lang.Integer.valueOf(i)), e);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (java.lang.Object obj : hashSet) {
                java.lang.String[] strArr = A04;
                if (strArr[2].length() == strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                A04[4] = "c1qN9eBQiEQB2i";
                java.io.File file3 = (java.io.File) obj;
                if (!file3.delete()) {
                    java.util.Locale locale = java.util.Locale.US;
                    java.lang.String canonicalPath = file3.getCanonicalPath();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    if (A04[7].charAt(19) != 'm') {
                        A04[7] = "thOmxL8vB3eH9n9jjORGQQ6LKF6RMw2U";
                        objArr[0] = canonicalPath;
                        interfaceC1078Uh.AIc(java.lang.String.format(locale, A02(40, 26, 116), objArr));
                    } else {
                        A04[7] = "xgRJlHLuW2qx7z7dN03x9GIdgxBOKXSD";
                        objArr[0] = canonicalPath;
                        interfaceC1078Uh.AIc(java.lang.String.format(locale, A02(38, 20, 82), objArr));
                    }
                }
            }
            return;
        }
        java.io.IOException e2 = new java.io.IOException(java.lang.String.format(java.util.Locale.US, A02(66, 38, 13), uz.A05().getCanonicalPath()));
        throw e2;
    }

    public final synchronized int A06() throws java.io.IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
    }

    public final synchronized int A07() throws java.io.IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
    }

    public final synchronized int A08() throws java.io.IOException {
        if (!this.A00) {
        } else {
            throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
        }
        return this.A02.size();
    }

    public final synchronized com.facebook.ads.redexgen.core.UX A0A(int i, int i2, byte[] bArr, int i3, int[] iArr, int i4) throws java.io.IOException {
        if (!this.A00) {
            for (com.facebook.ads.redexgen.core.C1079Ui file : this.A02) {
                if (file.A00() == i) {
                    return new com.facebook.ads.redexgen.core.UX(i, file.A02(i2, bArr, i3, iArr, i4));
                }
            }
            return new com.facebook.ads.redexgen.core.UX(-1, new com.facebook.ads.redexgen.core.UW(com.facebook.ads.redexgen.core.UV.A05, -1, -1, 0));
        }
        throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
    }

    public final synchronized void A0B() throws java.io.IOException {
        if (!this.A00) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C1079Ui> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws java.io.IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new java.io.IOException(A02(0, 40, 52));
            }
        } else {
            throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
        }
    }

    public final synchronized boolean A0D() throws java.io.IOException {
        if (!this.A00) {
            if (this.A02.size() <= 1) {
                return false;
            }
            com.facebook.ads.redexgen.core.C1079Ui first = this.A02.getFirst();
            this.A02.removeFirst();
            first.A04();
            return true;
        }
        throw new java.io.IOException(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 33, 31));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        java.util.Iterator<com.facebook.ads.redexgen.core.C1079Ui> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A03();
        }
    }
}
