package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setMaxHeight extends com.payair.hce.setEms implements com.payair.hce.setMinEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static char values;
    private static char writeReplace;
    byte[] DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setEllipsize setellipsize = new com.payair.hce.setEllipsize(((com.payair.hce.setMaxHeight) objArr[0]).DigitizedCardProfile);
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 21) % 128;
        return setellipsize;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (b * 3);
        int i5 = (i * 4) + 110;
        byte[] bArr = $$a;
        int i6 = 1 - (b2 * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i4;
            int i10 = (-i4) + i7;
            int i11 = i9 + 1;
            i2 = i8;
            i5 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i9 = i4;
            i4 = bArr[i4];
            i8 = i3;
            i7 = i12;
            int i102 = (-i4) + i7;
            int i112 = i9 + 1;
            i2 = i8;
            i5 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        $10 = (i2 + 31) % 128;
        if (str != null) {
            int i3 = i2 + 55;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson % 1];
            } else {
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            }
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                $11 = ($10 + 125) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i7 = c2 + i5;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 62, android.view.View.MeasureSpec.getSize(0) + 1335, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i8 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 62, android.text.TextUtils.indexOf("", "") + 1335, (char) android.view.View.MeasureSpec.getSize(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53, 3543 - android.text.TextUtils.indexOf("", "", 0), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    public setMaxHeight(byte[] bArr) {
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("鶄簪㺌㽯䊣➨\udb35ﶓ᭷됬麪趼㲗惒㺧㮢\uf10a쥁\uefed껭㏱埾", 21 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        this.DigitizedCardProfile = bArr;
    }

    @Override // com.payair.hce.setMinEms
    public final java.io.InputStream values() {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(this.DigitizedCardProfile);
        int i = RecordsJson + 23;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return byteArrayInputStream;
        }
        throw null;
    }

    public byte[] valueOf() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 41;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return this.DigitizedCardProfile;
        }
        throw null;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
        int AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(valueOf());
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 7;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return AlternateContactlessPaymentDataJson2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setMaxHeight) {
            boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, ((com.payair.hce.setMaxHeight) setems).DigitizedCardProfile);
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 11;
            RecordsJson = i % 128;
            if (i % 2 != 0) {
                return AlternateContactlessPaymentDataJson2;
            }
            throw new java.lang.ArithmeticException();
        }
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 17;
        RecordsJson = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 125) % 128;
        com.payair.hce.setEms aid = getAid();
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 63) % 128;
        return aid;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setEllipsize setellipsize = new com.payair.hce.setEllipsize(this.DigitizedCardProfile);
        int i = RecordsJson + 77;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setellipsize;
        }
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue287\uf0a9", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(com.payair.hce.isPlayStorePossiblyUpdating.values(this.DigitizedCardProfile)));
        java.lang.String obj = sb.toString();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 27;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        values = (char) 53165;
        valueOf = (char) 45573;
        AlternateContactlessPaymentDataJson = (char) 58808;
        writeReplace = (char) 54010;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms DigitizedCardProfile() {
        return (com.payair.hce.setEms) DigitizedCardProfile(new java.lang.Object[]{this}, 569994652, -569994652, java.lang.System.identityHashCode(this));
    }
}
