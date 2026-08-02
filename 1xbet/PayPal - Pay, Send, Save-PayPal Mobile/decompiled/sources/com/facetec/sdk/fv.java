package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fv {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f3581a;
    private static int b;
    private static int c;
    private static short[] d;
    private static int e;
    private static int f;
    private static int g;
    private static long h;
    private static char[] j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b2, byte b3, short s) {
        int i;
        int i2;
        int i3 = 3 - (b3 * 2);
        byte[] bArr = $$a;
        int i4 = 1 - (s * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i2 = i3;
            int i5 = i4;
            i = 0;
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i5 = bArr[i2];
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3 = b2 + 68;
            i2 = i3;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{102, 77, -36, 111};
        $$b = 109;
    }

    public static com.facetec.sdk.es b(com.facetec.sdk.gt gtVar) throws com.facetec.sdk.ew {
        boolean z;
        try {
            try {
                gtVar.f();
                try {
                    com.facetec.sdk.es b2 = com.facetec.sdk.gj.z.b(gtVar);
                    int i = g + 25;
                    f = i % 128;
                    if (i % 2 != 0) {
                        return b2;
                    }
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (java.io.EOFException e2) {
                    e = e2;
                    z = false;
                    if (z) {
                        com.facetec.sdk.eq eqVar = com.facetec.sdk.eq.b;
                        f = (g + 111) % 128;
                        return eqVar;
                    }
                    throw new com.facetec.sdk.ev(e);
                }
            } catch (java.io.EOFException e3) {
                e = e3;
                z = true;
            }
        } catch (com.facetec.sdk.gv e4) {
            throw new com.facetec.sdk.ev(e4);
        } catch (java.io.IOException e5) {
            throw new com.facetec.sdk.et(e5);
        } catch (java.lang.NumberFormatException e6) {
            throw new com.facetec.sdk.ev(e6);
        }
    }

    public static void c(com.facetec.sdk.es esVar, com.facetec.sdk.gu guVar) throws java.io.IOException {
        int i = f + 15;
        g = i % 128;
        if (i % 2 == 0) {
            com.facetec.sdk.gj.z.a(guVar, esVar);
            int i2 = g + 109;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
                return;
            }
            return;
        }
        com.facetec.sdk.gj.z.a(guVar, esVar);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void k(char c2, int i, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(j[i + i3])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) (45150 - android.text.TextUtils.getTrimmedLength("")), 2149 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1926116241, false, $$c((byte) ($$b & 183), b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(h), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    byte b3 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1833 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.ImageFormat.getBitsPerPixel(0) + 25, -1880730373, false, $$c((byte) 38, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) ((-1) - android.os.Process.getGidForName("")), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2340, android.text.TextUtils.indexOf("", "", 0) + 24, -1839099840, false, $$c((byte) 34, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr5 = {hhVar, hhVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
                if (d5 == null) {
                    byte b5 = (byte) 0;
                    d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2341 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1839099840, false, $$c((byte) 34, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                int i5 = 34 / 0;
            } else {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr6 = {hhVar, hhVar};
                java.lang.Object d6 = com.facetec.sdk.al.d(898558648);
                if (d6 == null) {
                    byte b6 = (byte) 0;
                    d6 = com.facetec.sdk.al.c((char) android.view.Gravity.getAbsoluteGravity(0, 0), 2341 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.getTrimmedLength("") + 24, -1839099840, false, $$c((byte) 34, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d6).invoke(null, objArr6);
            }
        }
        java.lang.String str = new java.lang.String(cArr);
        int i6 = $10 + 81;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static java.io.Writer c(java.lang.Appendable appendable) {
        int i = (f + 85) % 128;
        g = i;
        if (!(appendable instanceof java.io.Writer)) {
            return new com.facetec.sdk.fv.a(appendable);
        }
        f = (i + 89) % 128;
        return (java.io.Writer) appendable;
    }

    static final class a extends java.io.Writer {

        /* renamed from: a, reason: collision with root package name */
        private final com.facetec.sdk.fv.a.b f3582a = new com.facetec.sdk.fv.a.b(0);
        private final java.lang.Appendable b;

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
            return append(charSequence);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
            return append(charSequence, i, i2);
        }

        a(java.lang.Appendable appendable) {
            this.b = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
            com.facetec.sdk.fv.a.b bVar = this.f3582a;
            bVar.e = cArr;
            bVar.b = null;
            this.b.append(this.f3582a, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws java.io.IOException {
            this.b.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(java.lang.String str, int i, int i2) throws java.io.IOException {
            java.util.Objects.requireNonNull(str);
            this.b.append(str, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence) throws java.io.IOException {
            this.b.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
            this.b.append(charSequence, i, i2);
            return this;
        }

        public static class b implements java.lang.CharSequence {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static char[] f3583a;
            private static int c;
            private static boolean d;
            private static int h;
            private static boolean i;
            private static int j;
            java.lang.String b;
            char[] e;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i2, int i3, int i4) {
                int i5;
                byte[] bArr = $$c;
                int i6 = 122 - i2;
                int i7 = 4 - (i4 * 3);
                int i8 = i3 * 4;
                byte[] bArr2 = new byte[1 - i8];
                if (bArr == null) {
                    int i9 = i7;
                    int i10 = 0;
                    i7++;
                    i6 = (-i6) + i9;
                    i5 = i10;
                    bArr2[i5] = (byte) i6;
                    if (i5 == 0 - i8) {
                        return new java.lang.String(bArr2, 0);
                    }
                    int i11 = i5 + 1;
                    i9 = i6;
                    i6 = bArr[i7];
                    i10 = i11;
                    i7++;
                    i6 = (-i6) + i9;
                    i5 = i10;
                    bArr2[i5] = (byte) i6;
                    if (i5 == 0 - i8) {
                    }
                } else {
                    i5 = 0;
                    bArr2[i5] = (byte) i6;
                    if (i5 == 0 - i8) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void g(int i2, short s, byte b, java.lang.Object[] objArr) {
                int i3;
                int i4 = 4 - (b * 3);
                int i5 = (i2 * 4) + 99;
                byte[] bArr = $$a;
                int i6 = s * 3;
                byte[] bArr2 = new byte[i6 + 1];
                if (bArr == null) {
                    i5 = i6;
                    int i7 = i4;
                    int i8 = 0;
                    i5 += -i4;
                    i4 = i7 + 1;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i9 = i3 + 1;
                    i7 = i4;
                    i4 = bArr[i4];
                    i8 = i9;
                    i5 += -i4;
                    i4 = i7 + 1;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{121, 74, -2, com.google.common.base.Ascii.EM};
                $$b = 99;
            }

            static void init$1() {
                $$c = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -40, 39, -26};
                $$d = 111;
            }

            private b() {
            }

            /* synthetic */ b(byte b) {
                this();
            }

            @Override // java.lang.CharSequence
            public int length() {
                int i2 = j;
                int i3 = i2 + 119;
                h = i3 % 128;
                java.lang.Object obj = null;
                if (i3 % 2 == 0) {
                    int length = this.e.length;
                    obj.hashCode();
                    throw null;
                }
                int length2 = this.e.length;
                int i4 = i2 + 87;
                h = i4 % 128;
                if (i4 % 2 != 0) {
                    return length2;
                }
                throw null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                int i3 = h;
                int i4 = i3 + 45;
                j = i4 % 128;
                if (i4 % 2 != 0) {
                    char c2 = this.e[i2];
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                char c3 = this.e[i2];
                int i5 = i3 + 107;
                j = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 65 / 0;
                }
                return c3;
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int i2, int i3) {
                java.lang.String str = new java.lang.String(this.e, i2, i3 - i2);
                int i4 = h + 33;
                j = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // java.lang.CharSequence
            public java.lang.String toString() {
                int i2 = h + 33;
                j = i2 % 128;
                if (i2 % 2 == 0) {
                    if (this.b == null) {
                        this.b = new java.lang.String(this.e);
                        h = (j + 65) % 128;
                    }
                    return this.b;
                }
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void f(int[] iArr, java.lang.String str, int i2, java.lang.String str2, java.lang.Object[] objArr) {
                long j2;
                java.lang.String str3 = str2;
                int i3 = $11;
                int i4 = i3 + 75;
                $10 = i4 % 128;
                byte[] bArr = str3;
                if (i4 % 2 != 0) {
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (str3 != null) {
                    $10 = (i3 + 121) % 128;
                    bArr = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                char[] charArray = str != null ? str.toCharArray() : str;
                com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
                char[] cArr = f3583a;
                int i5 = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            objArr2[i5] = java.lang.Integer.valueOf(cArr[i6]);
                            java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                            if (d2 == null) {
                                byte b = (byte) i5;
                                d2 = com.facetec.sdk.al.c((char) android.text.TextUtils.getCapsMode("", i5, i5), android.view.Gravity.getAbsoluteGravity(i5, i5) + 1811, android.graphics.Color.alpha(i5) + 23, -1157014744, false, $$e((byte) 57, b, b), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                            i6++;
                            $10 = ($11 + 51) % 128;
                            i5 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c)};
                java.lang.Object d3 = com.facetec.sdk.al.d(-1796435875);
                long j3 = 0;
                if (d3 == null) {
                    byte b2 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 16777878, (android.os.Process.myTid() >> 22) + 23, 855894693, false, $$e((byte) 56, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                int i7 = 870267758;
                if (i) {
                    hnVar.c = bArr2.length;
                    char[] cArr3 = new char[hnVar.c];
                    hnVar.f3629a = 0;
                    while (hnVar.f3629a < hnVar.c) {
                        cArr3[hnVar.f3629a] = (char) (cArr[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i2] - intValue);
                        java.lang.Object[] objArr4 = {hnVar, hnVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(i7);
                        if (d4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            j2 = 0;
                            d4 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > j3 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j3 ? 0 : -1))), 1236 - android.view.View.resolveSize(0, 0), 24 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1808776810, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        } else {
                            j2 = j3;
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                        j3 = j2;
                        i7 = 870267758;
                    }
                    objArr[0] = new java.lang.String(cArr3);
                    return;
                }
                if (d) {
                    $11 = ($10 + 23) % 128;
                    hnVar.c = charArray.length;
                    char[] cArr4 = new char[hnVar.c];
                    hnVar.f3629a = 0;
                    while (hnVar.f3629a < hnVar.c) {
                        cArr4[hnVar.f3629a] = (char) (cArr[charArray[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                        java.lang.Object[] objArr5 = {hnVar, hnVar};
                        java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                        if (d5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            d5 = com.facetec.sdk.al.c((char) android.view.View.combineMeasuredStates(0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1236, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -1808776810, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    }
                    objArr[0] = new java.lang.String(cArr4);
                    return;
                }
                int i8 = 0;
                hnVar.c = iArr.length;
                char[] cArr5 = new char[hnVar.c];
                while (true) {
                    hnVar.f3629a = i8;
                    if (hnVar.f3629a >= hnVar.c) {
                        objArr[0] = new java.lang.String(cArr5);
                        return;
                    } else {
                        cArr5[hnVar.f3629a] = (char) (cArr[iArr[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                        i8 = hnVar.f3629a + 1;
                    }
                }
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                j = 0;
                h = 1;
                f3583a = new char[]{5757, 5747, 5760, 5729, 5730, 5745, 5759, 5746, 5763, 5751, 5750, 5731, 5744, 5728, 5711, 5733, 5790, 5814, 5815, 5709, 5755, 5752, 5735, 5748, 5758, 5813};
                c = -1919674684;
                d = true;
                i = true;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:(2:38|39)|(2:41|(3:43|44|45))(4:83|84|85|(6:87|51|52|(1:54)(5:57|58|59|60|(2:62|(1:64)(5:65|66|67|68|(2:70|(2:72|73)))))|55|56)(1:88))|50|51|52|(0)(0)|55|56) */
            /* JADX WARN: Removed duplicated region for block: B:54:0x06d8  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x06e7 A[Catch: Exception -> 0x08c0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x08c0, blocks: (B:52:0x06b5, B:57:0x06e7, B:60:0x0747, B:62:0x074f, B:65:0x07a8, B:68:0x07ce, B:76:0x08b1, B:77:0x08b7, B:80:0x08b9, B:81:0x08bf, B:67:0x07b2, B:59:0x06f1), top: B:51:0x06b5, inners: #0, #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] c(int i2, int i3) {
                java.lang.Object[] objArr;
                java.lang.Object[] objArr2;
                char c2;
                java.lang.String str;
                java.io.File file;
                java.io.File file2;
                j = (h + 97) % 128;
                try {
                    int threadPriority = android.os.Process.getThreadPriority(0);
                    int i4 = -(-(((threadPriority & 20) + (threadPriority | 20)) >> 6));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f(null, null, (i4 & 127) + (i4 | 127), "\u008e\u0084\u008d\u008c\u0084\u008b\u008b\u008a\u0089\u0088\u0084\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    int indexOf = android.text.TextUtils.indexOf("", "", 0);
                    int d2 = com.facetec.sdk.nq.d.d();
                    int i5 = (indexOf * 503) + 63881;
                    int i6 = -(-(((indexOf ^ 127) | (indexOf & 127)) * (-502)));
                    int i7 = ~indexOf;
                    int i8 = ~((i7 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i7 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i9 = ~d2;
                    int i10 = ~((i7 ^ i9) | (i9 & i7));
                    int i11 = indexOf | 127;
                    int i12 = i9 | i7;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    f(null, null, (((((i5 & i6) + (i5 | i6)) - (~((((i10 ^ i8) | (i10 & i8)) | (~((i11 ^ d2) | (i11 & d2)))) * (-502)))) - 1) - (~(((~((i12 & 127) | (i12 ^ 127))) | (~((r12 ^ d2) | (d2 & r12)))) * 502))) - 1, "\u0088\u0084\u0087\u0087\u0086\u0085\u0084\u0083\u0088\u008a\u0091\u0087\u008b\u0081\u008d\u0081\u0090\u008f", objArr4);
                    java.lang.String[] strArr = {(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 2) {
                            objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1]};
                            int i14 = ~((int) android.os.SystemClock.elapsedRealtime());
                            int i15 = (((~(798981567 | i14)) * 52) - 420489265) + (((~(630811070 | i14)) | (~((-193887526) | i14)) | 168170497) * (-52)) + (((~(i14 | (-630811071))) | 605094042) * 52);
                            int d3 = com.facetec.sdk.nq.d.d();
                            int i16 = i15 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
                            int i17 = -(-(i3 * (-282)));
                            int i18 = (i16 & i17) + (i16 | i17);
                            int i19 = ~i15;
                            int i20 = ~((i19 ^ i3) | (i19 & i3));
                            int i21 = ~((i19 & d3) | (i19 ^ d3));
                            int i22 = ((i20 ^ i21) | (i20 & i21)) * (-283);
                            int i23 = (i18 & i22) + (i22 | i18);
                            int i24 = ~i3;
                            int i25 = (~((i15 ^ i24) | (i15 & i24))) * 283;
                            int i26 = (i19 ^ i24) | (i19 & i24);
                            int i27 = (i23 ^ i25) + ((i25 & i23) << 1) + ((~((d3 ^ i26) | (d3 & i26))) * 283);
                            int i28 = i27 << 13;
                            int i29 = (~(i28 & i27)) & (i28 | i27);
                            int i30 = i29 ^ (i29 >>> 17);
                            int i31 = i30 << 5;
                            ((int[]) objArr[3])[0] = (~(i30 & i31)) & (i30 | i31);
                            break;
                        }
                        int i32 = h;
                        j = ((i32 & 93) + (i32 | 93)) % 128;
                        java.lang.String str2 = strArr[i13];
                        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                        int i33 = (scrollBarSize * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) - 35814;
                        int i34 = ~scrollBarSize;
                        int i35 = ~((i34 & 127) | (i34 ^ 127));
                        int i36 = ~((i34 ^ i2) | (i34 & i2));
                        int i37 = -(-(((i35 & i36) | (i35 ^ i36)) * (-283)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        f(null, null, ((((i33 ^ i37) + ((i33 & i37) << 1)) + ((~(scrollBarSize | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 283)) - (~((~(((i34 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i34 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) | i2)) * 283))) - 1, "\u0087\u0086\u0085\u0084\u0083\u0092\u0082\u008a\u0092\u008e\u0081\u008a\u0088\u008e\u008b\u0090", objArr5);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        if (((java.lang.Boolean) cls.getMethod(str2, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                            objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2 ^ 1}, new int[1]};
                            int i38 = ~i2;
                            int i39 = ((((~((-36177777) | i2)) | (~(788520819 | i38))) * (-318)) - 530565087) + (((~(117344113 | i2)) | 671176706) * (-318)) + (((~((-117344114) | i2)) | (-707354483)) * 318);
                            int i40 = -(-(i39 * (-495)));
                            int i41 = ((i40 | (-7920)) << 1) - (i40 ^ (-7920));
                            int i42 = ~i39;
                            int i43 = ~(i42 | (-17));
                            int i44 = ~((i2 ^ (-17)) | (i2 & (-17)));
                            int i45 = -(-((i43 | i44) * 992));
                            int i46 = ~((i42 ^ (-17)) | (i42 & (-17)));
                            int i47 = (i46 ^ i44) | (i46 & i44);
                            int i48 = (i38 ^ 16) | (i38 & 16);
                            int i49 = ~((i48 ^ i39) | (i48 & i39));
                            int i50 = (i41 & i45) + (i41 | i45) + (((i49 ^ i47) | (i47 & i49)) * (-496));
                            int i51 = (i39 | i2) * 496;
                            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                            int d4 = com.facetec.sdk.nq.d.d();
                            int i53 = ~i52;
                            int i54 = ~((i53 ^ i3) | (i53 & i3));
                            int i55 = ~d4;
                            int i56 = ~((i55 & i3) | (i55 ^ i3));
                            int i57 = (i52 * 55) + (i3 * (-107)) + (((i54 ^ i56) | (i54 & i56)) * (-108));
                            int i58 = ~i3;
                            int i59 = -(-(((~((i53 ^ d4) | (i53 & d4))) | (~(i58 | i52)) | (~((i55 ^ i52) | (i55 & i52)))) * 54));
                            int i60 = ~((i52 ^ i58) | (i52 & i58));
                            int i61 = (((i57 ^ i59) + ((i59 & i57) << 1)) - (~(((d4 ^ i60) | (d4 & i60)) * 54))) - 1;
                            int i62 = i61 << 13;
                            int i63 = ((~i62) & i61) | ((~i61) & i62);
                            int i64 = i63 >>> 17;
                            int i65 = (~(i63 & i64)) & (i63 | i64);
                            int i66 = i65 << 5;
                            ((int[]) objArr[3])[0] = (i65 & (~i66)) | ((~i65) & i66);
                            com.facetec.sdk.nq.d.d();
                            break;
                        }
                        i13++;
                        com.facetec.sdk.nq.d.d();
                    }
                } catch (java.lang.Exception unused) {
                    objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2 ^ 2}, new int[]{(~(r3 & r4)) & r10}};
                    int i67 = -(-(((((~((-550172506) | r3)) | (~(274526090 | i2))) * com.visa.cbp.getCertUsage.getODAData) - 771244051) + (((~((~i2) | 274526090)) | (~((-550172506) | i2))) * com.visa.cbp.getCertUsage.getODAData) + 16));
                    int i68 = (i3 ^ i67) + ((i67 & i3) << 1);
                    int i69 = (i68 << 13) ^ i68;
                    int i70 = i69 >>> 17;
                    int i71 = (i69 & (~i70)) | ((~i69) & i70);
                    int i72 = i71 << 5;
                    int i73 = i71 | i72;
                }
                if (i2 != ((int[]) objArr[2])[0]) {
                    int i74 = h;
                    int i75 = ((i74 | 125) << 1) - (i74 ^ 125);
                    j = i75 % 128;
                    if (i75 % 2 != 0) {
                        int i76 = 87 / 0;
                    }
                    return objArr;
                }
                try {
                    java.lang.Object d5 = com.facetec.sdk.al.d(-1447165611);
                    if (d5 == null) {
                        char modifierMetaStateMask = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 18952);
                        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        byte b = (byte) 0;
                        byte b2 = b;
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        g(b, b2, b2, objArr6);
                        d5 = com.facetec.sdk.al.c(modifierMetaStateMask, (scrollBarFadeDuration >> 16) + 2102, 25 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 240221101, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
                    long j2 = -1520549477;
                    long j3 = 868;
                    long j4 = -1;
                    long j5 = j2 ^ j4;
                    long j6 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    long j7 = j6 ^ j4;
                    long j8 = longValue ^ j4;
                    long j9 = j5 | j8;
                    long j10 = (-245494843) + (j3 * j2) + (j3 * longValue) + ((-867) * (((j5 | j7) ^ j4) | ((j8 | j7) ^ j4))) + (((j9 ^ j4) | ((j5 | j6) ^ j4) | ((j8 | j6) ^ j4)) * (-1734)) + (((((j5 | longValue) | j6) ^ j4) | ((j9 | j7) ^ j4) | (j4 ^ (j6 | (j8 | j2)))) * 867);
                    int i77 = ((int) (j10 >> 32)) & ((((((~((-34362798) | i2)) | (~(1402863613 | i2))) * 69) - 633894214) + ((((~((-1108203454) | i2)) | 1073840656) | (~(329022957 | i2))) * (-69))) - 1143285440);
                    int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i78 = ((int) j10) & ((((((~((-173539337) | maxMemory)) | (~((-1610765747) | maxMemory))) * 69) - 339666500) + ((((~(maxMemory | (-534258185))) | 360718848) | (~((-1971484595) | maxMemory))) * (-69))) - 1977763175);
                    if (((i78 ^ i77) | (i77 & i78)) == 1) {
                        objArr2 = new java.lang.Object[]{null, new int[]{i2}, new int[]{(~(i2 & 10)) & (i2 | 10)}, new int[1]};
                        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                        int i79 = ~elapsedCpuTime;
                        int i80 = ((((~((-289933061) | elapsedCpuTime)) | (~((-236163289) | i79))) * 920) - 1983764709) + (((~((-298602248) | i79)) | 289933060) * 920) + (((~(elapsedCpuTime | (-8669188))) | (~(i79 | (-289933061))) | (~((-236163289) | elapsedCpuTime))) * 920);
                        int d6 = com.facetec.sdk.nq.d.d();
                        int i81 = i80 * (-987);
                        int i82 = ~i80;
                        int i83 = ~d6;
                        int i84 = (i82 ^ i83) | (i82 & i83);
                        int i85 = i80 | 16;
                        int i86 = (((i81 | 15824) << 1) - (i81 ^ 15824)) + (((~((i84 & 16) | (i84 ^ 16))) | (~((i85 & d6) | (i85 ^ d6)))) * 988);
                        int i87 = ((i82 ^ 16) | (i82 & 16)) * (-988);
                        int i88 = ~((i82 & (-17)) | (i82 ^ (-17)));
                        int i89 = ~((d6 ^ i82) | (d6 & i82));
                        int i90 = (i89 ^ i88) | (i89 & i88);
                        int i91 = i83 | 16;
                        int i92 = ~((i80 ^ i91) | (i91 & i80));
                        int i93 = ((((i86 | i87) << 1) - (i87 ^ i86)) - (~(((i90 ^ i92) | (i90 & i92)) * 988))) - 1;
                        int i94 = ((i3 | i93) << 1) - (i3 ^ i93);
                        int i95 = i94 << 13;
                        int i96 = (i94 & (~i95)) | ((~i94) & i95);
                        int i97 = i96 ^ (i96 >>> 17);
                        int i98 = i97 << 5;
                        int[] iArr = (int[]) objArr2[3];
                        int i99 = (i97 & (~i98)) | ((~i97) & i98);
                        c2 = 0;
                        iArr[0] = i99;
                    } else {
                        objArr2 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[]{r1}};
                        int i100 = ((((~((-76546177) | i2)) | 708837467) * 449) - 65681619) + (((~((~i2) | (-76546177))) | 708837467) * 449);
                        int i101 = (i3 ^ i100) + ((i100 & i3) << 1);
                        int i102 = (i101 << 13) ^ i101;
                        int i103 = i102 >>> 17;
                        int i104 = (~(i102 & i103)) & (i102 | i103);
                        int i105 = i104 << 5;
                        int i106 = (~(i104 & i105)) & (i104 | i105);
                        c2 = 0;
                    }
                    if (i2 != ((int[]) objArr2[2])[c2]) {
                        int d7 = com.facetec.sdk.nq.d.d();
                        int i107 = ~d7;
                        int i108 = -(-(((268644354 & i107) | (268644354 ^ i107)) * (-192)));
                        int i109 = (1769625322 & i108) + (i108 | 1769625322);
                        int i110 = ~(i107 | 338636867);
                        int i111 = ((i110 ^ 34654124) | (34654124 & i110)) * (-384);
                        int i112 = ~(((-34654125) & d7) | ((-34654125) ^ d7));
                        int i113 = ~((i107 ^ 338636867) | (i107 & 338636867) | 303298478);
                        int i114 = (i113 ^ i112) | (i113 & i112);
                        int i115 = ~(d7 | (-69992514));
                        int d8 = com.facetec.sdk.nq.d.d();
                        int i116 = ~((189897406 & d8) | (189897406 ^ d8));
                        int i117 = (i116 ^ 1621114880) | (1621114880 & i116);
                        int i118 = ~d8;
                        int i119 = (i118 ^ 1756482210) | (1756482210 & i118);
                        int i120 = ~(i119 | (-189897407));
                        int i121 = (((i117 ^ i120) | (i117 & i120)) * (-470)) - 1013600285;
                        int i122 = ~((d8 ^ 1811012286) | (1811012286 & d8));
                        int i123 = ~((i119 & (-189897407)) | (i119 ^ (-189897407)));
                        int i124 = -(-(((i122 ^ i123) | (i122 & i123)) * 470));
                        if ((((i109 ^ i111) + ((i109 & i111) << 1)) - (~(((i115 ^ i114) | (i115 & i114)) * 192))) - 1 <= ((i121 | i124) << 1) - (i124 ^ i121)) {
                            j = (h + 53) % 128;
                            return objArr2;
                        }
                        java.lang.Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        f(null, null, 127 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), "\u0088\u0084\u008c\u0090\u0088\u008d\u0097\u008d\u008b\u0084\u0088\u0088\u0086\u008c\u0093\u0087\u008b\u0081\u008c\u0090\u0088\u008d\u0093\u0087\u0086\u0085\u0084\u008e\u0093\u0096\u0084\u008b\u0088\u0084\u0095\u0093\u0082\u0094\u0082\u0093", objArr7);
                        file2 = new java.io.File((java.lang.String) objArr7[0]);
                    } catch (java.lang.Exception unused2) {
                    }
                    if (file2.canRead()) {
                        java.io.FileReader fileReader = new java.io.FileReader(file2);
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            int i125 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            int d9 = com.facetec.sdk.nq.d.d();
                            int i126 = i125 * (-445);
                            int i127 = ~i125;
                            int i128 = ~d9;
                            int i129 = -(-(((~((i128 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i128 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) | (~((i127 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i127 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)))) * 446));
                            int i130 = ~((i127 ^ 127) | (i127 & 127));
                            int i131 = i125 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                            int i132 = ~((i131 ^ d9) | (i131 & d9));
                            int i133 = (((((((-56515) | i126) << 1) - (i126 ^ (-56515))) - (~i129)) - 1) - (~(((i132 ^ i130) | (i132 & i130)) * 446))) - 1;
                            int i134 = (~(i127 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 446;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            f(null, null, (i133 & i134) + (i134 | i133), "\u0098\u008a\u008b", objArr8);
                            if (!readLine.equals((java.lang.String) objArr8[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                str = readLine;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                f(null, null, 126 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))), "\u008e\u0084\u0096\u0085\u0090\u008b\u0084\u0097\u0084\u008c\u0090\u0088\u008d\u0099\u0093\u0096\u0084\u008b\u0088\u0084\u0095\u0093\u0082\u0094\u0082\u0093\u008c\u008a\u0088\u0098\u0093", objArr9);
                                file = new java.io.File((java.lang.String) objArr9[0]);
                                if (file.canRead()) {
                                    int i135 = h;
                                    j = ((i135 ^ 11) + ((i135 & 11) << 1)) % 128;
                                } else {
                                    try {
                                        java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                        int i136 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i137 = ~i136;
                                        int i138 = ~((i137 ^ 127) | (i137 & 127));
                                        int i139 = ~((i2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                        int i140 = (i138 ^ i139) | (i138 & i139);
                                        int i141 = ~i2;
                                        int i142 = ~((i141 & 127) | (i141 ^ 127));
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        f(null, null, (i136 * (-1975)) + 125603 + (((~(i137 | 127)) | i2) * 988) + (((~(i136 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) | (~(i136 | i141))) * (-1976)) + (((i140 & i142) | (i140 ^ i142)) * 988), "\u009a", objArr10);
                                        if (readLine2.equals((java.lang.String) objArr10[0])) {
                                            int i143 = -android.view.View.resolveSize(0, 0);
                                            int d10 = com.facetec.sdk.nq.d.d();
                                            int i144 = (i143 * (-464)) - 117983;
                                            int i145 = ~i143;
                                            int i146 = ~(d10 | 127);
                                            int i147 = -(-(((i146 ^ i145) | (i146 & i145)) * (-465)));
                                            int i148 = (i144 & i147) + (i144 | i147);
                                            int i149 = ~((i145 ^ d10) | (i145 & d10));
                                            int i150 = ((i149 ^ 127) | (i149 & 127)) * 930;
                                            int i151 = (d10 ^ 127) | (d10 & 127);
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            f(null, null, (((i148 | i150) << 1) - (i150 ^ i148)) + (((i145 ^ i151) | (i145 & i151)) * 465), "\u008b\u008a\u0097\u0087\u008b\u0081\u008c\u0090\u0088\u008d\u0093\u0087\u008b\u0081\u008c\u0090\u0088\u008d\u0093\u0087\u0086\u0085\u0084\u008e\u0093\u0096\u0084\u008b\u0088\u0084\u0095\u0093\u0082\u0094\u0082\u0093", objArr11);
                                            java.io.File file3 = new java.io.File((java.lang.String) objArr11[0]);
                                            if (file3.canRead()) {
                                                try {
                                                    java.lang.String readLine3 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    f(null, null, android.graphics.Color.red(0) + 127, "\u009a", objArr12);
                                                    if (readLine3.equals((java.lang.String) objArr12[0])) {
                                                        int i152 = h;
                                                        j = ((i152 & 71) + (i152 | 71)) % 128;
                                                        if (str != null) {
                                                            j = (i152 + 109) % 128;
                                                            int i153 = ~i2;
                                                            java.lang.Object[] objArr13 = {str, new int[]{i2}, new int[]{(i2 & (-21)) | (i153 & 20)}, new int[1]};
                                                            int i154 = (((771163801 | i153) * (-757)) - 1390989698) + ((~((-33611843) | i2)) * 1514) + (((~((-53534795) | i153)) | 19922952 | (~(804775643 | i2))) * 757);
                                                            int d11 = com.facetec.sdk.nq.d.d();
                                                            int i155 = ~((d11 ^ i154) | (d11 & i154));
                                                            int i156 = ~(i154 | 16);
                                                            int i157 = ~i154;
                                                            int i158 = ((-1745) - (~(-(-(i154 * 111))))) + (((i155 ^ (-17)) | (i155 & (-17))) * (-220)) + (((i155 ^ i156) | (i155 & i156)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i154 | (-17))) | (~((i157 & 16) | (i157 ^ 16)))) * 110);
                                                            int i159 = ~i3;
                                                            int i160 = ~i158;
                                                            int i161 = ~((i160 ^ i159) | (i160 & i159));
                                                            int i162 = ~(i159 | i153);
                                                            int i163 = (i161 ^ i162) | (i161 & i162);
                                                            int i164 = (i3 & i158) | (i158 ^ i3);
                                                            int i165 = ~((i164 ^ i2) | (i2 & i164));
                                                            int i166 = (i158 * 758) + (i3 * (-756)) + (((i153 ^ i158) | (i153 & i158)) * (-757)) + ((~((i159 & i158) | (i159 ^ i158) | i2)) * 1514) + (((i165 & i163) | (i163 ^ i165)) * 757);
                                                            int i167 = i166 << 13;
                                                            int i168 = ((~i167) & i166) | ((~i166) & i167);
                                                            int i169 = i168 >>> 17;
                                                            int i170 = (~(i168 & i169)) & (i168 | i169);
                                                            ((int[]) objArr13[3])[0] = i170 ^ (i170 << 5);
                                                            return objArr13;
                                                        }
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                java.lang.Object[] objArr14 = {null, new int[]{i2}, new int[]{i2}, new int[]{(~(r1 & r2)) & r3}};
                                int i171 = ~i2;
                                int i172 = ~(790626239 | i2);
                                int i173 = (((~((-773846838) | i171)) | 34072356 | i172) * (-502)) + 749152123 + ((i172 | (~((-739774482) | i171))) * 502);
                                int i174 = i173 * 375;
                                int i175 = -(-(i3 * (-747)));
                                int i176 = ~i173;
                                int i177 = ~((i176 ^ i3) | (i176 & i3));
                                int i178 = ~(i171 | i173);
                                int i179 = (((i174 | i175) << 1) - (i174 ^ i175)) + (((i178 & i177) | (i177 ^ i178)) * (-374));
                                int i180 = ~i3;
                                int i181 = (~((i180 & i173) | (i173 ^ i180))) * 748;
                                int i182 = ((i179 | i181) << 1) - (i181 ^ i179);
                                int i183 = ~((i180 ^ i176) | (i180 & i176));
                                int i184 = -(-(((i178 ^ i183) | (i183 & i178)) * 374));
                                int i185 = (i182 ^ i184) + ((i184 & i182) << 1);
                                int i186 = i185 << 13;
                                int i187 = (~(i186 & i185)) & (i186 | i185);
                                int i188 = i187 >>> 17;
                                int i189 = (~(i187 & i188)) & (i187 | i188);
                                int i190 = i189 << 5;
                                int i191 = i189 | i190;
                                return objArr14;
                            }
                            fileReader.close();
                            bufferedReader.close();
                        } finally {
                        }
                    } else {
                        int i192 = h;
                        int i193 = (i192 & 83) + (i192 | 83);
                        j = i193 % 128;
                        if (i193 % 2 != 0) {
                            throw null;
                        }
                    }
                    str = null;
                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                    f(null, null, 126 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))), "\u008e\u0084\u0096\u0085\u0090\u008b\u0084\u0097\u0084\u008c\u0090\u0088\u008d\u0099\u0093\u0096\u0084\u008b\u0088\u0084\u0095\u0093\u0082\u0094\u0082\u0093\u008c\u008a\u0088\u0098\u0093", objArr92);
                    file = new java.io.File((java.lang.String) objArr92[0]);
                    if (file.canRead()) {
                    }
                    java.lang.Object[] objArr142 = {null, new int[]{i2}, new int[]{i2}, new int[]{(~(i189 & i190)) & i191}};
                    int i1712 = ~i2;
                    int i1722 = ~(790626239 | i2);
                    int i1732 = (((~((-773846838) | i1712)) | 34072356 | i1722) * (-502)) + 749152123 + ((i1722 | (~((-739774482) | i1712))) * 502);
                    int i1742 = i1732 * 375;
                    int i1752 = -(-(i3 * (-747)));
                    int i1762 = ~i1732;
                    int i1772 = ~((i1762 ^ i3) | (i1762 & i3));
                    int i1782 = ~(i1712 | i1732);
                    int i1792 = (((i1742 | i1752) << 1) - (i1742 ^ i1752)) + (((i1782 & i1772) | (i1772 ^ i1782)) * (-374));
                    int i1802 = ~i3;
                    int i1812 = (~((i1802 & i1732) | (i1732 ^ i1802))) * 748;
                    int i1822 = ((i1792 | i1812) << 1) - (i1812 ^ i1792);
                    int i1832 = ~((i1802 ^ i1762) | (i1802 & i1762));
                    int i1842 = -(-(((i1782 ^ i1832) | (i1832 & i1782)) * 374));
                    int i1852 = (i1822 ^ i1842) + ((i1842 & i1822) << 1);
                    int i1862 = i1852 << 13;
                    int i1872 = (~(i1862 & i1852)) & (i1862 | i1852);
                    int i1882 = i1872 >>> 17;
                    int i1892 = (~(i1872 & i1882)) & (i1872 | i1882);
                    int i1902 = i1892 << 5;
                    int i1912 = i1892 | i1902;
                    return objArr142;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(int i, short s, int i2, int i3, byte b2, java.lang.Object[] objArr) {
        long j2;
        int i4;
        com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(c)};
            java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
            if (d2 == null) {
                byte b3 = (byte) 0;
                d2 = com.facetec.sdk.al.c((char) android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 2222, android.graphics.ImageFormat.getBitsPerPixel(0) + 25, 1792780429, false, $$c(b3, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = f3581a;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), 94 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 23, 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j2 = 1009991189275744878L;
                    intValue = (short) (((short) (d[i2 + ((int) (e ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (c ^ 1009991189275744878L)));
                    if (intValue > 0) {
                        hmVar.b = ((i2 + intValue) - 2) + ((int) (e ^ j2)) + i5;
                        java.lang.Object[] objArr4 = {hmVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(b), sb};
                        java.lang.Object d4 = com.facetec.sdk.al.d(-1371371196);
                        if (d4 == null) {
                            byte b4 = (byte) 3;
                            byte b5 = (byte) (b4 - 3);
                            d4 = com.facetec.sdk.al.c((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.View.combineMeasuredStates(0, 0) + 885, android.text.TextUtils.getCapsMode("", 0, 0) + 32, 162395068, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).append(hmVar.c);
                        hmVar.d = hmVar.c;
                        byte[] bArr3 = f3581a;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                $10 = ($11 + 43) % 128;
                                bArr4[i7] = (byte) (bArr3[i7] ^ 1009991189275744878L);
                            }
                            $11 = ($10 + 45) % 128;
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        hmVar.e = 1;
                        while (hmVar.e < intValue) {
                            if (z) {
                                byte[] bArr5 = f3581a;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((byte) (((byte) (bArr5[r7] ^ 1009991189275744878L)) + s)) ^ b2));
                                $10 = ($11 + 83) % 128;
                            } else {
                                short[] sArr = d;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r7] ^ 1009991189275744878L)) + s)) ^ b2));
                            }
                            sb.append(hmVar.c);
                            hmVar.d = hmVar.c;
                            hmVar.e++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                int i8 = $11 + 9;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    byte[] bArr6 = f3581a;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(e)};
                    java.lang.Object d5 = com.facetec.sdk.al.d(-852176267);
                    if (d5 == null) {
                        byte b6 = (byte) 0;
                        d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2222 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.getTrimmedLength("") + 24, 1792780429, false, $$c(b6, b6, b6), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    i4 = ((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue()] ^ 1009991189275744878L)) << ((int) (c ^ 1009991189275744878L));
                } else {
                    byte[] bArr7 = f3581a;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(e)};
                    java.lang.Object d6 = com.facetec.sdk.al.d(-852176267);
                    if (d6 == null) {
                        byte b7 = (byte) 0;
                        d6 = com.facetec.sdk.al.c((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2221, android.graphics.Color.alpha(0) + 24, 1792780429, false, $$c(b7, b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    i4 = ((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) d6).invoke(null, objArr6)).intValue()] ^ 1009991189275744878L)) + ((int) (c ^ 1009991189275744878L));
                }
                intValue = (byte) i4;
            }
            j2 = 1009991189275744878L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        f = 1;
        e = 336450569;
        c = -1358030222;
        b = -591782760;
        f3581a = new byte[]{100, -120, 114, -124, -123, 118, -122, 116, -95, -93, -125, 120, 94, -87, 125, -125, 120, 62, -55, 69, com.visa.cbp.getEncExpo.IResultReceiver, 124, -105, -80, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -122, -120, 116, 126, -111, 125, 113, -58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -108, 104, -106, 116, 109, 107, -115, 111, -126, 93, 110, 111, 104, -101, 99, -72, -111, 123, -74, 80, 103, -122, 104, -76, -79, 41, 110, 111, 104, -101, 99, -72, -111, 122, -98, 109, -9, com.google.common.base.Ascii.SYN, -8, 36, 33, -71, -2, -1, -8, com.google.common.base.Ascii.VT, -13, 40, 1, -22, 14, 18, -51, -2, -1, -8, com.google.common.base.Ascii.VT, -13, 40, 1, -21, 38, -36, -5, com.google.common.base.Ascii.GS, -1, -107, -24, 7, -27, 18, -21, 56, 1, -82, 18, com.google.common.base.Ascii.GS, -27, 18, -21, com.google.common.base.Ascii.CAN, 33, -34, -17, -18, -23, com.google.common.base.Ascii.SUB, -30, com.google.common.base.Ascii.EM, -100, -58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 45, -41, com.visa.cbp.getEncExpo.startTransaction, 56, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 60, 47, -30, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 108, 108, -99, 64, -127, -101, 99, -109, 109, 103, 116, 71, -92, -104, 39, -33, 99, 108, -108, 99, -102, 105, 80, -81, -98, -97, -104, 107, -109, 104, Byte.MIN_VALUE, com.google.common.base.Ascii.US, -30, -20, 16, 2, -30, com.google.common.base.Ascii.SYN, -17, -25, 103, 59, 63, -57, 45, 62, 39, -35, -51, 47, -62, -58, 63, -63, -55, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.RS, 41, -122, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 62, 9, -119, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -63, 46, -62, -50, 121, -15, -41, 41, -53, -127, -114, 121, -127, 97, -115, -119, -87, 89, -125, 114, -127, com.google.common.base.Ascii.ESC, -20, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -33, -14, -8, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -48, -8, 104, -35, 63, -46, -42, 47, -47, -39, 46, 33, 14, 38, 37, -41, -15, 6, -106, 46, 33, 46, com.google.common.base.Ascii.EM, com.visa.cbp.getEncExpo.registerForActivityResult, 41, 39, -37, -47, 62, -46, -34, 105, -31, -57, 57, -37, -107, -44, 46, -40, -39, 42, -38, 40, -3, -1, -33, 36, 2, 59, -50, 33, 36, -41, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -3, 0, -48, 33};
        j = new char[]{27773, 58098, 29044, 51181, 22095, 42168, 15167, 35232, 6165, 28298, 64981, 19572, 49896, 20818, 42955, 13884, 33976, 27771, 58105, 29028, 51151, 22081, 42162, 15152, 35311, 6161, 28288, 65014, 19553, 49891, 20829, 42968, 13943, 33978, 6954, 27102, 63549, 20351, 56808, 11375, 41680, 12613, 34746, 5637, 25764, 64280, 18818, 55547, 12140, 48584, 27773, 58098, 29044, 51181, 22095, 42168, 15167, 35232, 6165, 28298, 64977, 19579, 49888, 20828, 33980, 2631, 39371, 12147, 48873, 27771, 58105, 29028, 51151, 22081, 42162, 15152, 35311, 6161, 28288, 65014, 19553, 49891, 20829, 42968, 13943, 33978, 6954, 27102, 63550, 20343, 56812, 11370, 41680, 12630, 34730, 5690, 25760, 46125, 15010, 43326, 8072, 36364, 31978, 58224, 20980, 49249, 46810, 9658, 37937, 6847, 35077, 32661, 61034, 23803, 50019, 45509};
        h = 5838010663670375063L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v105, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.Class<java.io.InputStream>] */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r8v179, types: [java.lang.Class[]] */
    public static java.lang.Object[] a(android.content.Context context, int i, int i2) {
        java.lang.Object obj;
        if (context == null) {
            java.lang.Object[] objArr = {null, new int[]{i}, new int[]{i}, new int[1]};
            int nextInt = new java.util.Random().nextInt();
            int i3 = ~((~nextInt) | (-16812325));
            int i4 = (((~(88509796 | nextInt)) | 841510920 | i3) * (-470)) + 1197839763 + (((~(nextInt | 930020716)) | i3) * 470);
            int i5 = (i4 << 1) - i4;
            int i6 = ((i2 | i5) << 1) - (i5 ^ i2);
            int i7 = i6 << 13;
            int i8 = ((~i7) & i6) | ((~i6) & i7);
            int i9 = i8 >>> 17;
            int i10 = (i8 & (~i9)) | ((~i8) & i9);
            int i11 = i10 << 5;
            ((int[]) objArr[3])[0] = (i10 & (~i11)) | ((~i10) & i11);
            return objArr;
        }
        try {
            try {
                int i12 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int d2 = com.facetec.sdk.ly.d();
                int i13 = (i12 * (-109)) - 722392756;
                int i14 = ~i12;
                int i15 = -(-(((~(d2 | (-1941177996))) | i14) * (-220)));
                int i16 = ~((i12 ^ (-1941177996)) | (i12 & (-1941177996)));
                int i17 = ~((d2 & (-1941177996)) | (d2 ^ (-1941177996)));
                int i18 = ((((i13 | i15) << 1) - (i13 ^ i15)) - (~(((i17 ^ i16) | (i16 & i17)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) - 1;
                int i19 = ((~((i12 ^ 1941177995) | (1941177995 & i12))) | (~(i14 | (-1941177996)))) * 110;
                short modifierMetaStateMask = (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                int i20 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                int i21 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                i(((i18 | i19) << 1) - (i18 ^ i19), modifierMetaStateMask, (1157378457 ^ i20) + ((i20 & 1157378457) << 1), (i21 & (-28)) + (i21 | (-28)), (byte) ((-21) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr2);
                obj = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr2[0]), 2);
                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                short packedPositionType = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                int i22 = -android.view.View.getDefaultSize(0, 0);
                int i23 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                int d3 = com.facetec.sdk.ly.d();
                int i24 = ~windowTouchSlop;
                int i25 = ~d3;
                int i26 = ~((windowTouchSlop ^ 4) | (windowTouchSlop & 4));
                int i27 = ~((i24 ^ i25) | (i25 & i24));
                int i28 = i26 | i27;
                int i29 = ~(windowTouchSlop | d3);
                int i30 = (windowTouchSlop & (-5)) | (windowTouchSlop ^ (-5));
                int i31 = ~((i30 & d3) | (i30 ^ d3));
                byte b2 = (byte) (((windowTouchSlop * (-337)) - 1695) + (((i28 ^ i29) | (i29 & i28)) * (-338)) + ((~((i24 ^ (-5)) | (i24 & (-5)))) * 338) + (((i27 & i31) | (i27 ^ i31)) * 338));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                i((keyRepeatTimeout >> 16) - 1941178035, packedPositionType, (1157378495 ^ i22) + ((1157378495 & i22) << 1), ((i23 | (-29)) << 1) - (i23 ^ (-29)), b2, objArr3);
                try {
                    java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    int i32 = rgb * 495;
                    int i33 = ((-458187876) & i32) + (i32 | (-458187876));
                    int i34 = -(-(((1924400779 & rgb) | (1924400779 ^ rgb)) * (-988)));
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    int i36 = ~i;
                    int i37 = ~rgb;
                    int i38 = ((-1924400780) | i37 | i36) * 494;
                    int i39 = ((i35 | i38) << 1) - (i35 ^ i38);
                    int i40 = ~((i37 & 1924400779) | (1924400779 ^ i37));
                    int i41 = ~((-1924400780) | i36);
                    int i42 = (i40 & i41) | (i40 ^ i41);
                    int i43 = ~((rgb ^ (-1924400780)) | ((-1924400780) & rgb));
                    int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * 494));
                    short tapTimeout = (short) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                    int i45 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int blue = android.graphics.Color.blue(0);
                    int d4 = com.facetec.sdk.ly.d();
                    int i46 = -(-(blue * (-963)));
                    int i47 = (((i46 | (-964)) << 1) - (i46 ^ (-964))) - 18335;
                    int i48 = ~blue;
                    int i49 = ~((d4 ^ 18) | (d4 & 18));
                    int i50 = -(-(((i48 ^ i49) | (i49 & i48)) * (-964)));
                    int i51 = (i47 & i50) + (i47 | i50);
                    int i52 = -(-(((~((~d4) | 18)) | (~((blue & 18) | (blue ^ 18)))) * (-964)));
                    byte b3 = (byte) ((i51 & i52) + (i52 | i51));
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        i(((i39 | i44) << 1) - (i44 ^ i39), tapTimeout, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 1157378456, (-29) - (~i45), b3, objArr5);
                        try {
                            obj[0] = java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr4);
                            int i53 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                            short indexOf = (short) android.text.TextUtils.indexOf("", "", 0, 0);
                            int i54 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                            int i55 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            i((-1941178037) - (~i53), indexOf, (1157378525 & i54) + (i54 | 1157378525), (-30) - (~capsMode), (byte) (((i55 | 107) << 1) - (i55 ^ 107)), objArr6);
                            try {
                                java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                                int i56 = -(-android.view.View.getDefaultSize(0, 0));
                                short jumpTapTimeout = (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i57 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i58 = -(android.os.Process.myPid() >> 22);
                                int i59 = i58 * 50;
                                int i60 = ~((i36 ^ 28) | (i36 & 28));
                                int i61 = ~((i58 ^ 28) | (i58 & 28));
                                int i62 = ~i58;
                                int i63 = ~((i62 ^ i36) | (i62 & i36));
                                int i64 = (i63 ^ 28) | (i63 & 28);
                                int i65 = ~(i58 | i);
                                int i66 = (((((i59 | 2813) << 1) - (i59 ^ 2813)) - (~(((i60 ^ i61) | (i60 & i61)) * 98))) - 1) + (((i64 ^ i65) | (i64 & i65)) * (-49));
                                int i67 = ~((i ^ 28) | (i & 28));
                                int i68 = ~((i58 ^ (-29)) | (i58 & (-29)));
                                int i69 = -(-(((i68 ^ i67) | (i68 & i67)) * 49));
                                int i70 = -android.graphics.Color.argb(0, 0, 0, 0);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                i((-1941177997) - (~i56), jumpTapTimeout, ((1157378457 | i57) << 1) - (i57 ^ 1157378457), (i66 & i69) + (i66 | i69), (byte) ((i70 ^ (-19)) + ((i70 & (-19)) << 1)), objArr8);
                                obj[1] = java.lang.Class.forName((java.lang.String) objArr8[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                                try {
                                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int d5 = com.facetec.sdk.ly.d();
                                    int i71 = makeMeasureSpec * 829;
                                    int i72 = (1376169855 ^ i71) + ((i71 & 1376169855) << 1);
                                    int i73 = ~makeMeasureSpec;
                                    int i74 = ~((i73 ^ 1941178004) | (1941178004 & i73));
                                    int i75 = ~d5;
                                    int i76 = ~((i75 & makeMeasureSpec) | (i75 ^ makeMeasureSpec) | (-1941178005));
                                    int i77 = -(-(((i74 & i76) | (i74 ^ i76)) * (-828)));
                                    int i78 = (i72 & i77) + (i77 | i72);
                                    int i79 = (makeMeasureSpec ^ (-1941178005)) | ((-1941178005) & makeMeasureSpec);
                                    int i80 = -(-(((i75 ^ i79) | (i75 & i79)) * (-828)));
                                    short offsetAfter = (short) android.text.TextUtils.getOffsetAfter("", 0);
                                    int i81 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    i((((i78 | i80) << 1) - (i80 ^ i78)) + ((~i79) * 828), offsetAfter, (1157378557 & i81) + (1157378557 | i81), (-29) - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), (byte) (120 - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr9);
                                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                    int i82 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int i83 = i82 * 141;
                                    int i84 = (i83 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE) + ((i83 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE) << 1);
                                    int i85 = (i84 & (-140)) + (i84 | (-140));
                                    int i86 = ~i82;
                                    int i87 = -(-((~((~i36) | i36)) * (-280)));
                                    int i88 = (i85 ^ i87) + ((i85 & i87) << 1);
                                    int i89 = ~((i82 ^ i36) | (i82 & i36));
                                    int i90 = (i89 ^ i86) | (i89 & i86);
                                    int i91 = (~i86) | i86;
                                    int i92 = ~((i91 ^ i) | (i91 & i));
                                    int i93 = -(-(((i90 ^ i92) | (i90 & i92)) * 140));
                                    char c2 = (char) ((i88 & i93) + (i93 | i88));
                                    int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
                                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    k(c2, indexOf2, (maxKeyCode & 17) + (maxKeyCode | 17), objArr10);
                                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], null).invoke(context, null);
                                    try {
                                        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                                        short argb = (short) android.graphics.Color.argb(0, 0, 0, 0);
                                        int i94 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                        int i95 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i96 = -android.graphics.Color.argb(0, 0, 0, 0);
                                        byte b4 = (byte) ((i96 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + ((i96 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1));
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        i((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) - 1941178006, argb, 1157378555 - (~i94), (i95 ^ (-30)) + ((i95 & (-30)) << 1), b4, objArr11);
                                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        int i97 = -android.view.View.MeasureSpec.getMode(0);
                                        int i98 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                        short s = (short) ((~i98) + (i98 << 1));
                                        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                                        int i99 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        i((((-1941177999) | i97) << 1) - (i97 ^ (-1941177999)), s, ((1157378580 | offsetBefore) << 1) - (offsetBefore ^ 1157378580), ((i99 | (-29)) << 1) - (i99 ^ (-29)), (byte) ((bitsPerPixel ^ 81) + ((bitsPerPixel & 81) << 1)), objArr12);
                                        try {
                                            java.lang.Object[] objArr13 = {cls2.getMethod((java.lang.String) objArr12[0], null).invoke(context, null), 64};
                                            char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                                            int i100 = -(-android.text.TextUtils.indexOf("", "", 0, 0));
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            k(resolveOpacity, (scrollBarSize >> 8) + 17, (i100 & 33) + (i100 | 33), objArr14);
                                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                            char indexOf3 = (char) android.text.TextUtils.indexOf("", "", 0);
                                            int i101 = -android.view.KeyEvent.normalizeMetaState(0);
                                            int i102 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            k(indexOf3, 49 - (~i101), (i102 & 15) + (i102 | 15), objArr15);
                                            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr15[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr13);
                                            int i103 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                            short keyCodeFromString = (short) android.view.KeyEvent.keyCodeFromString("");
                                            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int i104 = lastIndexOf * 530;
                                            int i105 = ((i104 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) << 1) - (i104 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO);
                                            int i106 = ((i105 | (-14840)) << 1) - (i105 ^ (-14840));
                                            int i107 = ~((i36 ^ lastIndexOf) | (i36 & lastIndexOf));
                                            int i108 = ~(lastIndexOf | (-28));
                                            int i109 = -(-(((i107 ^ i108) | (i107 & i108)) * 529));
                                            int i110 = (i106 ^ i109) + ((i106 & i109) << 1);
                                            int i111 = ~((lastIndexOf & i) | (lastIndexOf ^ i));
                                            int i112 = ((i111 ^ 27) | (i111 & 27)) * 529;
                                            int myPid = android.os.Process.myPid() >> 22;
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            i((-1941178006) - (~i103), keyCodeFromString, (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 1157378593, (i110 ^ i112) + ((i112 & i110) << 1), (byte) ((myPid ^ 11) + ((myPid & 11) << 1)), objArr16);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                            int i113 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                            int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            short s2 = (short) ((lastIndexOf2 ^ 1) + ((lastIndexOf2 & 1) << 1));
                                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            int i114 = packedPositionGroup * (-1939);
                                            int i115 = ~((1157378624 ^ i36) | (1157378624 & i36));
                                            int i116 = ((((-1466787648) | i114) << 1) - (i114 ^ (-1466787648))) + (((~(((-1157378625) ^ packedPositionGroup) | ((-1157378625) & packedPositionGroup))) | i115) * (-970));
                                            int i117 = ~packedPositionGroup;
                                            int i118 = (~((1157378624 ^ i117) | (1157378624 & i117))) * 1940;
                                            int i119 = (i116 ^ i118) + ((i118 & i116) << 1);
                                            int i120 = ~((i117 ^ (-1157378625)) | ((-1157378625) & i117));
                                            int i121 = -(-(((i120 ^ i115) | (i120 & i115)) * 970));
                                            int lastIndexOf3 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i122 = (lastIndexOf3 * 236) - 13188;
                                            int i123 = ~lastIndexOf3;
                                            int i124 = ((~(i123 | i36)) | (-28)) * (-235);
                                            int i125 = ((i122 | i124) << 1) - (i122 ^ i124);
                                            int i126 = -(-(((~(i123 | i)) | (-28)) * (-470)));
                                            int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                                            int i128 = ~(lastIndexOf3 | 27);
                                            int i129 = (i123 & (-28)) | (i123 ^ (-28));
                                            int i130 = ~((i129 ^ i) | (i129 & i));
                                            int i131 = ((i128 ^ i130) | (i128 & i130)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                                            int i132 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int d6 = com.facetec.sdk.ly.d();
                                            int i133 = i132 * 960;
                                            int i134 = ((-243459) ^ i133) + ((i133 & (-243459)) << 1);
                                            int i135 = ~d6;
                                            java.lang.Object obj2 = obj;
                                            int i136 = ~((i135 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i135 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            java.lang.String str = "";
                                            int i137 = ~((i132 ^ d6) | (i132 & d6));
                                            int i138 = ((i136 ^ i137) | (i137 & i136)) * 959;
                                            int i139 = (i134 & i138) + (i138 | i134);
                                            int i140 = (122752 ^ i139) + ((i139 & 122752) << 1);
                                            int i141 = ~((d6 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (d6 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i142 = ~((i132 ^ i135) | (i132 & i135));
                                            int i143 = -(-(((i141 ^ i142) | (i142 & i141)) * 959));
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            i((i113 | (-1941177988)) + ((-1941177988) & i113), s2, (i119 & i121) + (i121 | i119), ((i127 | i131) << 1) - (i131 ^ i127), (byte) ((i140 ^ i143) + ((i140 & i143) << 1)), objArr17);
                                            java.lang.Object[] objArr18 = (java.lang.Object[]) cls4.getField((java.lang.String) objArr17[0]).get(invoke2);
                                            int length = objArr18.length;
                                            int i144 = 0;
                                            while (i144 < length) {
                                                java.lang.Object obj3 = objArr18[i144];
                                                int i145 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int i146 = i145 * (-515);
                                                int i147 = ~(((-59647) & i) | ((-59647) ^ i));
                                                int i148 = ~((i36 ^ i145) | (i36 & i145));
                                                int i149 = (i147 & i148) | (i147 ^ i148);
                                                int i150 = ~((i36 ^ 59646) | (i36 & 59646));
                                                int i151 = ~i145;
                                                int i152 = (-59647) | i151;
                                                int i153 = ~((i152 & i) | (i152 ^ i));
                                                int i154 = ~((i151 ^ i36) | (i151 & i36) | 59646);
                                                char c3 = (char) ((((((30836982 & i146) + (i146 | 30836982)) + (((i149 ^ i150) | (i149 & i150)) * (-516))) - (~(-(-(((i153 & i154) | (i153 ^ i154)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))))) - 1) + (((~((i151 ^ 59646) | (i151 & 59646))) | i150) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                                                int trimmedLength = android.text.TextUtils.getTrimmedLength(str);
                                                int i155 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                k(c3, (trimmedLength ^ 64) + ((trimmedLength & 64) << 1), (i155 ^ 5) + ((i155 & 5) << 1), objArr19);
                                                obj = (java.lang.String) objArr19[0];
                                                try {
                                                    obj = new java.lang.Object[]{obj};
                                                    int mode = android.view.View.MeasureSpec.getMode(0);
                                                    short resolveOpacity2 = (short) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    int i156 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int i157 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                    i(mode - 1941177996, resolveOpacity2, ((1157378633 | i156) << 1) - (1157378633 ^ i156), (i157 & (-29)) + (i157 | (-29)), (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 82), objArr20);
                                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                                    java.lang.String str2 = str;
                                                    int i158 = -android.text.TextUtils.getCapsMode(str2, 0, 0);
                                                    int i159 = i158 * (-344);
                                                    int i160 = (2045300776 & i159) + (i159 | 2045300776);
                                                    int i161 = ~i158;
                                                    int i162 = (1941177998 ^ i161) | (1941177998 & i161);
                                                    int i163 = ~i162;
                                                    int i164 = ~((i161 ^ i) | (i161 & i));
                                                    int i165 = ((i163 ^ i164) | (i163 & i164)) * 345;
                                                    int i166 = ~((i161 & i36) | (i161 ^ i36));
                                                    int i167 = ~((i158 & 1941177998) | (1941177998 ^ i158));
                                                    short indexOf4 = (short) android.text.TextUtils.indexOf(str2, str2, 0, 0);
                                                    int red = android.graphics.Color.red(0);
                                                    int i168 = -(-android.os.Process.getGidForName(str2));
                                                    java.lang.Object[] objArr21 = objArr18;
                                                    int i169 = length;
                                                    int i170 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    int i171 = i144;
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    i((i160 & i165) + (i160 | i165) + (((i167 & i166) | (i166 ^ i167)) * 345) + ((~((i162 & i) | (i162 ^ i))) * 345), indexOf4, (red & 1157378671) + (red | 1157378671), (i168 & (-28)) + (i168 | (-28)), (byte) ((i170 ^ (-30)) + ((i170 & (-30)) << 1)), objArr22);
                                                    java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr22[0], java.lang.String.class).invoke(null, obj);
                                                    try {
                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                        k((char) android.graphics.Color.blue(0), 69 - android.text.TextUtils.indexOf(str2, str2), android.view.MotionEvent.axisFromString(str2) + 29, objArr23);
                                                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                        int i172 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                        int i173 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        short s3 = (short) ((~i173) + (i173 << 1));
                                                        int i174 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                                        int i175 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int i176 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                        i((((-1941177987) | i172) << 1) - (i172 ^ (-1941177987)), s3, ((1157378682 | i174) << 1) - (i174 ^ 1157378682), (i175 ^ (-29)) + ((i175 & (-29)) << 1), (byte) ((i176 & 108) + (i176 | 108)), objArr24);
                                                        obj = (java.lang.String) objArr24[0];
                                                        try {
                                                            java.lang.Object[] objArr25 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod(obj, null).invoke(obj3, null))};
                                                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                                            short longPressTimeout = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int i177 = -(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                            int i178 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int d7 = com.facetec.sdk.ly.d();
                                                            int i179 = (i178 * (-518)) - 42476;
                                                            int i180 = ~i178;
                                                            int i181 = ~d7;
                                                            int i182 = ~(i181 | i180);
                                                            int i183 = ((i182 & 82) | (i182 ^ 82)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                                            int i184 = (i180 ^ i181) | (i181 & i180);
                                                            int i185 = ~((i184 ^ 82) | (i184 & 82));
                                                            int i186 = ~((i178 ^ 82) | (i178 & 82) | d7);
                                                            byte b5 = (byte) ((((i179 | i183) << 1) - (i179 ^ i183)) + (((i185 & i186) | (i185 ^ i186)) * (-519)) + ((i178 | (~((d7 ^ 82) | (d7 & 82)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                            i((fadingEdgeLength & (-1941177996)) + (fadingEdgeLength | (-1941177996)), longPressTimeout, 1157378632 - (~i177), (scrollBarFadeDuration & (-29)) + (scrollBarFadeDuration | (-29)), b5, objArr26);
                                                            ?? cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                            int i187 = -(-android.text.TextUtils.indexOf(str2, str2));
                                                            int i188 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                            int i189 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int d8 = com.facetec.sdk.ly.d();
                                                            int i190 = ~i189;
                                                            int i191 = ~((d8 ^ 19) | (d8 & 19));
                                                            int i192 = ~((i190 & 19) | (i190 ^ 19));
                                                            int i193 = ~d8;
                                                            int i194 = ~((i193 ^ 19) | (i193 & 19));
                                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                            k((char) (((55376 | i187) << 1) - (i187 ^ 55376)), ((i188 | 97) << 1) - (i188 ^ 97), (i189 * (-381)) + 3648 + (i190 * (-191)) + (((i189 & i191) | (i189 ^ i191)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (((i192 & i194) | (i194 ^ i192)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE), objArr27);
                                                            obj = java.io.InputStream.class;
                                                            java.lang.Object invoke4 = cls7.getMethod((java.lang.String) objArr27[0], new java.lang.Class[]{obj}).invoke(invoke3, objArr25);
                                                            ?? r7 = obj2;
                                                            int length2 = r7.length;
                                                            int i195 = 0;
                                                            int i196 = 2;
                                                            obj = r7;
                                                            while (i195 < i196) {
                                                                ?? r3 = obj[i195];
                                                                try {
                                                                    int indexOf5 = android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    int d9 = com.facetec.sdk.ly.d();
                                                                    int i197 = indexOf5 * (-947);
                                                                    int i198 = ~indexOf5;
                                                                    int i199 = ~(d9 | 1941177994);
                                                                    int i200 = (363052729 ^ i197) + ((i197 & 363052729) << 1) + (((i198 & i199) | (i199 ^ i198)) * (-948));
                                                                    int i201 = (i198 & 1941177994) | (i198 ^ 1941177994);
                                                                    int i202 = ~d9;
                                                                    int i203 = -(-((~((i202 ^ i201) | (i202 & i201))) * (-948)));
                                                                    short pressedStateDuration = (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                    int indexOf6 = android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                    int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                    int d10 = com.facetec.sdk.ly.d();
                                                                    int i204 = windowTouchSlop2 * (-183);
                                                                    int i205 = ~windowTouchSlop2;
                                                                    int i206 = ~d10;
                                                                    java.lang.Object obj4 = obj;
                                                                    int i207 = (i205 ^ i206) | (i205 & i206);
                                                                    int i208 = i195;
                                                                    int i209 = ~(i207 | (-29));
                                                                    int i210 = (i206 ^ 28) | (i206 & 28);
                                                                    int i211 = ~((i210 ^ windowTouchSlop2) | (i210 & windowTouchSlop2));
                                                                    java.lang.Object obj5 = invoke4;
                                                                    int i212 = (i204 ^ 5307) + ((i204 & 5307) << 1) + (((i209 & i211) | (i209 ^ i211)) * (-184));
                                                                    int i213 = ~((i205 ^ 28) | (i205 & 28));
                                                                    int i214 = ~i207;
                                                                    int i215 = (i213 ^ i214) | (i213 & i214);
                                                                    int i216 = ~(i206 | 28);
                                                                    int i217 = -(-(((i215 ^ i216) | (i215 & i216)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                                                    int i218 = -android.text.TextUtils.getTrimmedLength(str2);
                                                                    int i219 = ~i218;
                                                                    int i220 = (i219 ^ (-67)) | (i219 & (-67));
                                                                    int i221 = ~((i220 ^ i36) | (i220 & i36));
                                                                    int i222 = ~(i218 | 66);
                                                                    int i223 = (i221 ^ i222) | (i222 & i221);
                                                                    int i224 = ~(i | 66);
                                                                    int i225 = (i219 ^ i36) | (i219 & i36);
                                                                    byte b6 = (byte) ((((((((i218 * 69) - 4422) - (~(((i223 & i224) | (i223 ^ i224)) * (-68)))) - 1) - (~(-(-((~((i225 & 66) | (i225 ^ 66))) * (-68)))))) - 1) - (~((i219 | (~((i36 & (-67)) | (i36 ^ (-67))))) * 68))) - 1);
                                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                    i((i200 ^ i203) + ((i203 & i200) << 1) + (((1941177994 ^ indexOf5) | (indexOf5 & 1941177994)) * 948), pressedStateDuration, (1157378694 ^ indexOf6) + ((1157378694 & indexOf6) << 1), (((i212 | i217) << 1) - (i212 ^ i217)) + (((windowTouchSlop2 ^ (-29)) | (windowTouchSlop2 & (-29))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), b6, objArr28);
                                                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                                    int i226 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                                                    short scrollDefaultDelay = (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                    int i227 = -android.text.TextUtils.getTrimmedLength(str2);
                                                                    int i228 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    int i229 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                    obj = (byte) (((i229 | (-80)) << 1) - (i229 ^ (-80)));
                                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                    i(((-1941177999) & i226) + (i226 | (-1941177999)), scrollDefaultDelay, ((1157378727 | i227) << 1) - (i227 ^ 1157378727), (i228 ^ (-29)) + ((i228 & (-29)) << 1), obj, objArr29);
                                                                    if (r3.equals(cls8.getMethod((java.lang.String) objArr29[0], null).invoke(obj5, null))) {
                                                                        java.lang.Object[] objArr30 = {null, new int[]{i}, new int[]{(i & (-2)) | (i36 & 1)}, new int[1]};
                                                                        int i230 = (((~(803726323 | i36)) * 52) - 111136081) + (((~(256156658 | i36)) | (~((-568541938) | i36)) | 547569665) * (-52)) + (((~(i36 | (-256156659))) | 235184386) * 52);
                                                                        int i231 = (i230 & 16) + (i230 | 16);
                                                                        int d11 = com.facetec.sdk.ly.d();
                                                                        int i232 = i231 * (-495);
                                                                        int i233 = -(-(i2 * (-495)));
                                                                        int i234 = (i232 & i233) + (i232 | i233);
                                                                        int i235 = ~i231;
                                                                        int i236 = ~((i235 & d11) | (i235 ^ d11));
                                                                        int i237 = ~i2;
                                                                        int i238 = ((~(i237 | i235)) | i236) * 992;
                                                                        int i239 = ((i234 | i238) << 1) - (i234 ^ i238);
                                                                        int i240 = ~((i235 ^ i237) | (i237 & i235));
                                                                        int i241 = (i240 ^ i236) | (i236 & i240);
                                                                        int i242 = i231 | (~d11);
                                                                        int i243 = ~((i242 ^ i2) | (i242 & i2));
                                                                        int i244 = -(-(((i243 ^ i241) | (i243 & i241)) * (-496)));
                                                                        int i245 = (((i239 & i244) + (i244 | i239)) - (~(((d11 & i2) | (i2 ^ d11)) * 496))) - 1;
                                                                        int i246 = i245 << 13;
                                                                        int i247 = (~(i246 & i245)) & (i246 | i245);
                                                                        int i248 = i247 ^ (i247 >>> 17);
                                                                        int i249 = i248 << 5;
                                                                        ((int[]) objArr30[3])[0] = (~(i248 & i249)) & (i248 | i249);
                                                                        return objArr30;
                                                                    }
                                                                    i195 = (i208 ^ 1) + ((i208 & 1) << 1);
                                                                    invoke4 = obj5;
                                                                    i196 = 2;
                                                                    obj = obj4;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i144 = i171 + 1;
                                                            objArr18 = objArr21;
                                                            str = str2;
                                                            length = i169;
                                                            obj2 = obj;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (java.lang.Throwable th3) {
                                                        java.lang.Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        java.lang.Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                        obj = i2;
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        java.lang.Throwable cause9 = th.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th10) {
                    th = th10;
                }
            } catch (java.lang.Throwable unused2) {
                obj = i2;
            }
        } catch (java.lang.Throwable unused3) {
        }
        java.lang.Object[] objArr31 = {null, new int[]{i}, new int[]{i}, new int[]{(r1 & (~r2)) | r3}};
        int i250 = (obj - (~((((((-310380261) | (~i)) * (-490)) + 1681070257) + (((~(i | (-310675197))) | 294936) * 490)) + 1531604464))) - 1;
        int i251 = i250 << 13;
        int i252 = (~(i250 & i251)) & (i250 | i251);
        int i253 = i252 >>> 17;
        int i254 = (~(i252 & i253)) & (i252 | i253);
        int i255 = i254 << 5;
        int i256 = (~i254) & i255;
        return objArr31;
    }
}
