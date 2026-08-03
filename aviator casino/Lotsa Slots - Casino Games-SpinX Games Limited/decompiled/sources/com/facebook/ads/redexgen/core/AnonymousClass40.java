package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.40, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass40 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"xt7OJkzoRAU9F21vTA99nWdYHEgU1aqe", "agkrpda7Xp", "R", "5vNqnHOJCumqZOnLm9qFfz6JcwPphcfm", "ZSdlC9FQn5pQkXbUirih3rU8AE2dOqgO", "058ZJGrrLXJjuDHx9oXjnYONx8ueRFml", "p8wyR2SRaX4jfTsJEE0Ho6ErxYgTWBLm", "ZJmK2n287z"};
    public final java.io.File A00;
    public final java.io.File A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-69, com.google.common.base.Ascii.SI, 10, -69, -3, -4, -2, 6, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, -69, 1, 4, 7, 0, -69, -43, 9, 8, com.google.common.base.Ascii.DC2, -64, -13, -18, -20, -24, -30, -59, -24, -21, -28, 6, 50, 56, 47, 39, 49, -22, 55, -29, 38, 53, 40, 36, 55, 40, -29, -13, com.google.common.base.Ascii.US, 37, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.RS, -41, 36, -48, 34, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, -48, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, -48};
    }

    static {
        A02();
    }

    public AnonymousClass40(java.io.File file) {
        this.A01 = file;
        this.A00 = new java.io.File(file.getPath() + A00(16, 4, 88));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r3 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A00(20, 10, 48), A00(46, 21, 97) + r6.A01 + A00(0, 16, 76) + r6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        if (r3 == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3z] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.ads.redexgen.X.3z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.C04213z A03() throws java.io.IOException {
        if (this.A01.exists()) {
            java.io.File file = this.A00;
            java.lang.String[] strArr = A03;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "WaNlpEO0EesrYpEsZIaqNMFL0IgmF9T8";
            if (!file.exists()) {
                boolean renameTo = this.A01.renameTo(this.A00);
                java.lang.String[] strArr2 = A03;
                if (strArr2[0].charAt(5) != strArr2[4].charAt(5)) {
                    java.lang.String[] strArr3 = A03;
                    strArr3[0] = "Kt2izesvv7R2DCfklGYX0jErBdo4LMwT";
                    strArr3[4] = "3ZhItr65AZc3uqV8hBhNNn4gHqhWY2uE";
                } else {
                    A03[2] = "qsL8i3rJfSd1ZoM6";
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            final java.io.File file2 = this.A01;
            return new java.io.OutputStream(file2) { // from class: com.facebook.ads.redexgen.X.3z
                public static byte[] A02;
                public boolean A00 = false;
                public final java.io.FileOutputStream A01;

                static {
                    A01();
                }

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
                    }
                    return new java.lang.String(copyOfRange);
                }

                public static void A01() {
                    A02 = new byte[]{-25, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.SI, 9, -20, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 36, 63, 71, 74, 67, 66, -2, 82, 77, -2, 81, 87, 76, 65, -2, 68, 71, 74, 67, -2, 66, 67, 81, 65, 80, 71, 78, 82, 77, 80, com.google.common.base.Ascii.CAN};
                }

                {
                    this.A01 = new java.io.FileOutputStream(file2);
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws java.io.IOException {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    flush();
                    try {
                        this.A01.getFD().sync();
                    } catch (java.io.IOException e) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A00(0, 10, 70), A00(10, 31, 126), e);
                    }
                    this.A01.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public final void flush() throws java.io.IOException {
                    this.A01.flush();
                }

                @Override // java.io.OutputStream
                public final void write(int i) throws java.io.IOException {
                    this.A01.write(i);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr) throws java.io.IOException {
                    this.A01.write(bArr);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
                    this.A01.write(bArr, i, i2);
                }
            };
        } catch (java.io.FileNotFoundException e) {
            java.io.File parentFile = this.A01.getParentFile();
            java.lang.String A00 = A00(30, 16, 116);
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    final java.io.File parent = this.A01;
                    return new java.io.OutputStream(parent) { // from class: com.facebook.ads.redexgen.X.3z
                        public static byte[] A02;
                        public boolean A00 = false;
                        public final java.io.FileOutputStream A01;

                        static {
                            A01();
                        }

                        public static java.lang.String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
                            }
                            return new java.lang.String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{-25, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.SI, 9, -20, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 36, 63, 71, 74, 67, 66, -2, 82, 77, -2, 81, 87, 76, 65, -2, 68, 71, 74, 67, -2, 66, 67, 81, 65, 80, 71, 78, 82, 77, 80, com.google.common.base.Ascii.CAN};
                        }

                        {
                            this.A01 = new java.io.FileOutputStream(parent);
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() throws java.io.IOException {
                            if (this.A00) {
                                return;
                            }
                            this.A00 = true;
                            flush();
                            try {
                                this.A01.getFD().sync();
                            } catch (java.io.IOException e2) {
                                com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A00(0, 10, 70), A00(10, 31, 126), e2);
                            }
                            this.A01.close();
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public final void flush() throws java.io.IOException {
                            this.A01.flush();
                        }

                        @Override // java.io.OutputStream
                        public final void write(int i) throws java.io.IOException {
                            this.A01.write(i);
                        }

                        @Override // java.io.OutputStream
                        public final void write(byte[] bArr) throws java.io.IOException {
                            this.A01.write(bArr);
                        }

                        @Override // java.io.OutputStream
                        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
                            this.A01.write(bArr, i, i2);
                        }
                    };
                } catch (java.io.FileNotFoundException e2) {
                    throw new java.io.IOException(A00 + this.A01, e2);
                }
            }
            throw new java.io.IOException(A00 + this.A01, e);
        }
    }

    public final java.io.InputStream A04() throws java.io.FileNotFoundException {
        A01();
        return new java.io.FileInputStream(this.A01);
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.close();
        this.A00.delete();
    }

    public final boolean A07() {
        return this.A01.exists() || this.A00.exists();
    }
}
