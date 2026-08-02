package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ex extends com.facetec.sdk.es {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static int f3559a;
    private static int c;
    private static int d;
    private static byte[] e;
    private static int f;
    private static int g;
    private static short[] j;
    private final java.lang.Object b;

    private static java.lang.String $$g(int i, short s, int i2) {
        int i3 = i * 4;
        int i4 = (s * 3) + 68;
        byte[] bArr = $$c;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i5++;
            i4 += bArr[i5];
        }
    }

    public static /* synthetic */ java.lang.Object b(int i, java.lang.Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i2);
        int i8 = ~((~i6) | i2);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i2) | i)) | i7;
        int i11 = i2 + i + i5 + ((-1814252664) * i3) + (2073254503 * i4);
        int i12 = i11 * i11;
        int i13 = ((-1919122223) * i2) + 1408767311 + ((-1919121035) * i) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + ((-1919121629) * i5) + ((-390511720) * i3) + (1804971285 * i4) + (255066112 * i12);
        return ((((((((((i2 * (-223937157)) + 1943797760) + (i * 1745420935)) + (i9 * 1162804602)) + (i7 * 1162804602)) + (i10 * (-1162804602))) + (i5 * (-1386741760))) + (i3 * (-1631584256))) + (i4 * (-1368915968))) + (i12 * (-1053032448))) + ((i13 * i13) * 379846656) != 1 ? c(objArr) : d(objArr);
    }

    static void init$0() {
        $$a = new byte[]{38, -127, -81, 60};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
    }

    static void init$1() {
        $$c = new byte[]{75, 92, 44, com.visa.cbp.getEncExpo.onUnminimized};
        $$f = 86;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void q(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = (s * 2) + 99;
        int i3 = b + 4;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i3++;
            i5 = bArr[i3];
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public ex(java.lang.Boolean bool) {
        this.b = java.util.Objects.requireNonNull(bool);
    }

    public ex(java.lang.Number number) {
        this.b = java.util.Objects.requireNonNull(number);
    }

    public ex(java.lang.String str) {
        this.b = java.util.Objects.requireNonNull(str);
    }

    public final boolean m() {
        int i = f + 17;
        g = i % 128;
        boolean z = this.b instanceof java.lang.Boolean;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
        return z;
    }

    @Override // com.facetec.sdk.es
    public final boolean h() {
        g = (f + 87) % 128;
        java.lang.Object obj = null;
        if (m()) {
            f = (g + 99) % 128;
            boolean booleanValue = ((java.lang.Boolean) this.b).booleanValue();
            int i = f + 5;
            g = i % 128;
            if (i % 2 != 0) {
                return booleanValue;
            }
            throw null;
        }
        boolean parseBoolean = java.lang.Boolean.parseBoolean(c());
        int i2 = g + 103;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            return parseBoolean;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean o() {
        int i = (f + 29) % 128;
        g = i;
        boolean z = this.b instanceof java.lang.Number;
        int i2 = i + 41;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return z;
    }

    @Override // com.facetec.sdk.es
    public final java.lang.Number b() {
        int i = (f + 43) % 128;
        g = i;
        java.lang.Object obj = this.b;
        if (!(obj instanceof java.lang.Number)) {
            if (obj instanceof java.lang.String) {
                return new com.facetec.sdk.fo((java.lang.String) obj);
            }
            throw new java.lang.UnsupportedOperationException("Primitive is neither a number nor a string");
        }
        int i2 = i + 5;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            return (java.lang.Number) obj;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        com.facetec.sdk.ex exVar = (com.facetec.sdk.ex) objArr[0];
        int i = (g + 7) % 128;
        f = i;
        boolean z = exVar.b instanceof java.lang.String;
        int i2 = i + 87;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // com.facetec.sdk.es
    public final java.lang.String c() {
        g = (f + 109) % 128;
        java.lang.Object obj = this.b;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (!o()) {
            if (m()) {
                return ((java.lang.Boolean) this.b).toString();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected value type: ");
            sb.append(this.b.getClass());
            throw new java.lang.AssertionError(sb.toString());
        }
        int i = g + 111;
        f = i % 128;
        if (i % 2 == 0) {
            return b().toString();
        }
        b().toString();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0267, code lost:
    
        if (r2 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0290, code lost:
    
        r7 = com.facetec.sdk.ex.j;
        r0.b = r0.b - 1;
        r0.c = (char) (r0.d + (((short) (((short) (r7[r8] ^ 1009991189275744878L)) + r27)) ^ r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026c, code lost:
    
        r7 = com.facetec.sdk.ex.e;
        r0.b = r0.b - 1;
        r0.c = (char) (r0.d + (((byte) (((byte) (r7[r8] ^ 1009991189275744878L)) + r27)) ^ r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026a, code lost:
    
        if (r2 != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void p(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(f3559a)};
            java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
            if (d2 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                d2 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2223, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, 1792780429, false, $$g(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 111) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = e;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        $11 = ($10 + 29) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) android.graphics.Color.red(0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 94, 23 - android.text.TextUtils.getCapsMode("", 0, 0), 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = e;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(c)};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-852176267);
                    if (d4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2222 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 24 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1792780429, false, $$g(b4, b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue()] ^ 1009991189275744878L)) + ((int) (f3559a ^ 1009991189275744878L)));
                } else {
                    intValue = (short) (((short) (j[i2 + ((int) (c ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (f3559a ^ 1009991189275744878L)));
                }
            }
            if (intValue > 0) {
                int i6 = $11;
                $10 = (i6 + 119) % 128;
                int i7 = (int) (c ^ 1009991189275744878L);
                if (z) {
                    $10 = (i6 + 81) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                hmVar.b = ((i2 + intValue) - 2) + i7 + i4;
                java.lang.Object[] objArr5 = {hmVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(d), sb};
                java.lang.Object d5 = com.facetec.sdk.al.d(-1371371196);
                if (d5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    d5 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 886, 31 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 162395068, false, $$g(b6, b7, (byte) (-b7)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).append(hmVar.c);
                hmVar.d = hmVar.c;
                byte[] bArr4 = e;
                if (bArr4 != null) {
                    $11 = ($10 + 85) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $11 + 15;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            bArr5[i8] = (byte) (bArr4[i8] * 1009991189275744878L);
                            i8--;
                        } else {
                            bArr5[i8] = (byte) (bArr4[i8] ^ 1009991189275744878L);
                            i8++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                hmVar.e = 1;
                while (hmVar.e < intValue) {
                    int i10 = $11 + 15;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 74 / 0;
                    }
                    sb.append(hmVar.c);
                    hmVar.d = hmVar.c;
                    hmVar.e++;
                }
            }
            java.lang.String sb2 = sb.toString();
            int i12 = $10 + 77;
            $11 = i12 % 128;
            if (i12 % 2 != 0) {
                objArr[0] = sb2;
            } else {
                int i13 = 62 / 0;
                objArr[0] = sb2;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.facetec.sdk.es
    public final double d() {
        double doubleValue;
        if (!o()) {
            return java.lang.Double.parseDouble(c());
        }
        int i = f + 61;
        g = i % 128;
        if (i % 2 == 0) {
            doubleValue = b().doubleValue();
            int i2 = 49 / 0;
        } else {
            doubleValue = b().doubleValue();
        }
        int i3 = f + 49;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return doubleValue;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.facetec.sdk.es
    public final long a() {
        if (!o()) {
            return java.lang.Long.parseLong(c());
        }
        int i = f + 35;
        g = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            b().longValue();
            obj.hashCode();
            throw null;
        }
        long longValue = b().longValue();
        int i2 = f + 75;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return longValue;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        int parseInt;
        com.facetec.sdk.ex exVar = (com.facetec.sdk.ex) objArr[0];
        int i = g + 57;
        f = i % 128;
        if (i % 2 != 0) {
            exVar.o();
            throw null;
        }
        if (exVar.o()) {
            parseInt = exVar.b().intValue();
        } else {
            parseInt = java.lang.Integer.parseInt(exVar.c());
            int i2 = g + 13;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                return java.lang.Integer.valueOf(parseInt);
            }
            int i3 = 61 / 0;
        }
        return java.lang.Integer.valueOf(parseInt);
    }

    public final int hashCode() {
        if (this.b != null) {
            if (e(this)) {
                long longValue = b().longValue();
                int i = (int) ((longValue >>> 32) ^ longValue);
                g = (f + 45) % 128;
                return i;
            }
            java.lang.Object obj = this.b;
            if (obj instanceof java.lang.Number) {
                long doubleToLongBits = java.lang.Double.doubleToLongBits(b().doubleValue());
                return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
            }
            int hashCode = obj.hashCode();
            int i2 = g + 35;
            f = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
            }
            return hashCode;
        }
        f = (g + 111) % 128;
        return 31;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            g = (f + 79) % 128;
            if (getClass() == obj.getClass()) {
                com.facetec.sdk.ex exVar = (com.facetec.sdk.ex) obj;
                if (this.b == null) {
                    return exVar.b == null;
                }
                if (e(this) && e(exVar)) {
                    if (b().longValue() == exVar.b().longValue()) {
                        g = (f + 125) % 128;
                        return true;
                    }
                    f = (g + 97) % 128;
                    return false;
                }
                java.lang.Object obj2 = this.b;
                if (!(obj2 instanceof java.lang.Number) || !(exVar.b instanceof java.lang.Number)) {
                    return obj2.equals(exVar.b);
                }
                double doubleValue = b().doubleValue();
                double doubleValue2 = exVar.b().doubleValue();
                if (doubleValue != doubleValue2) {
                    f = (g + 27) % 128;
                    if (java.lang.Double.isNaN(doubleValue)) {
                        int i = f + 67;
                        g = i % 128;
                        if (i % 2 == 0) {
                            java.lang.Double.isNaN(doubleValue2);
                            java.lang.Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        if (java.lang.Double.isNaN(doubleValue2)) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean e(com.facetec.sdk.ex exVar) {
        int i = f;
        g = (i + 31) % 128;
        java.lang.Object obj = exVar.b;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        if (number instanceof java.math.BigInteger) {
            return true;
        }
        g = (i + 29) % 128;
        if ((number instanceof java.lang.Long) || (number instanceof java.lang.Integer)) {
            return true;
        }
        int i2 = i + 87;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
            if (number instanceof java.lang.Short) {
                return true;
            }
        } else if (number instanceof java.lang.Short) {
            return true;
        }
        return number instanceof java.lang.Byte;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f = 0;
        g = 1;
        c = -1463092051;
        f3559a = -1358030312;
        d = 1367380932;
        e = new byte[]{-111, -97, Byte.MAX_VALUE, -112, com.visa.cbp.getEncExpo.registerForActivityResult, 110, -111, 66, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 99, -112, 110, -100, 125, -109, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 100, 99, -112, 110, -100, 125, -109, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 109, 71, -79, -105, 107, -101, 101, 102, -124, -100, 125, -109, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 120, -43, 106, 47, -92, -107, -108, -109, com.visa.cbp.getEncExpo.IResultReceiver2, -104, 99, 99, 108, 108, -127, -112, 123, -123, 104, 103, -99, 110, -109, 124, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -90, -105, 107, 104, 108, -127, -112, 43, -90, -100, 125, -109, 111, 91, -83, 105, com.visa.cbp.getEncExpo.registerForActivityResult, -110, 99, -108, 82, -46, -108, 104, 42, 111, 111, -111, -105, 100, 111, -99, 103, 104, -108, 108, 108, -127, -112, com.visa.cbp.getEncExpo.IResultReceiver2, 89, -83, 105, com.visa.cbp.getEncExpo.registerForActivityResult, -110, 99, -108, 82, -46, -108, 104, 42, -94, -102, -109, 108, 47, -111, 126, -106, -105, 107, 104, 108, -127, -112, 43, -90, -105, 107, 104, 108, -127, -112, 43, -90, -100, 125, -109, 111, 91, -83, 105, com.visa.cbp.getEncExpo.registerForActivityResult, -110, 99, -108, 82, -46, -108, 104, 42, 110, 110, 110, 110, 110, 110, 110, 110};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] e(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 3304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ex.e(int, int):java.lang.Object[]");
    }

    @Override // com.facetec.sdk.es
    public final int e() {
        int c2 = com.facetec.sdk.gr.b.c();
        return ((java.lang.Integer) b(-1040148992, new java.lang.Object[]{this}, 1040148993, com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), c2)).intValue();
    }

    public final boolean k() {
        int c2 = com.facetec.sdk.gr.b.c();
        return ((java.lang.Boolean) b(132102006, new java.lang.Object[]{this}, -132102006, com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), c2)).booleanValue();
    }
}
