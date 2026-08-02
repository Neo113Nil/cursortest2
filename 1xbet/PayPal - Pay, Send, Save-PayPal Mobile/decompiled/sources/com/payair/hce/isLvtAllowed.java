package com.payair.hce;

/* loaded from: classes4.dex */
abstract class isLvtAllowed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getCiacDecline;
    private static char getProfileVersion;
    final com.payair.hce.checkPermission AlternateContactlessPaymentDataJson;
    final com.payair.hce.setLvtAllowed DigitizedCardProfile;
    private java.util.concurrent.atomic.AtomicBoolean valueOf;
    final com.payair.hce.getDetailedMessage values;
    private final com.payair.hce.delete writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 3;
        int i4 = 4 - (b * 2);
        int i5 = 110 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i5 += i7;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public abstract void AlternateContactlessPaymentDataJson();

    isLvtAllowed(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㉏젾旕ጵ䓰\ue591䟓鉼", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, objArr);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
        com.payair.hce.getDetailedMessage getdetailedmessage = (com.payair.hce.getDetailedMessage) com.payair.hce.onGetCertOperationUnsuccessful.writeReplace(new java.lang.Object[]{ongetcertoperationunsuccessful}, 298765468, -298765468, java.lang.System.identityHashCode(ongetcertoperationunsuccessful));
        this.values = getdetailedmessage;
        this.DigitizedCardProfile = (com.payair.hce.setLvtAllowed) com.payair.hce.onGetCertOperationUnsuccessful.writeReplace(new java.lang.Object[]{ongetcertoperationunsuccessful}, 259530221, -259530220, java.lang.System.identityHashCode(ongetcertoperationunsuccessful));
        this.writeReplace = new com.payair.hce.delete(getdetailedmessage, (com.payair.hce.getStatusMessage) com.payair.hce.onGetCertOperationUnsuccessful.writeReplace(new java.lang.Object[]{ongetcertoperationunsuccessful}, 535122107, -535122105, java.lang.System.identityHashCode(ongetcertoperationunsuccessful)));
        this.valueOf = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isLvtAllowed islvtallowed = (com.payair.hce.isLvtAllowed) objArr[0];
        try {
            com.payair.hce.Initializer AlternateContactlessPaymentDataJson = islvtallowed.values.AlternateContactlessPaymentDataJson((byte[]) objArr[1]);
            com.payair.hce.Initializer initializer = new com.payair.hce.Initializer((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)));
            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
            return initializer;
        } catch (java.security.GeneralSecurityException e) {
            new java.lang.Object[]{e};
            return null;
        }
    }

    final byte[] writeReplace(com.payair.hce.Initializer initializer) {
        try {
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializer}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializer)));
            AlternateContactlessPaymentDataJson.writeReplace();
            AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            byte[] DigitizedCardProfile = this.values.DigitizedCardProfile(new com.payair.hce.Initializer(AlternateContactlessPaymentDataJson.DigitizedCardProfile()));
            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 101) % 128;
            return DigitizedCardProfile;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    final byte[] DigitizedCardProfile(java.lang.String str) {
        int i = getCiacDecline + 55;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            this.writeReplace.AlternateContactlessPaymentDataJson(str.getBytes());
            throw null;
        }
        byte[] AlternateContactlessPaymentDataJson = this.writeReplace.AlternateContactlessPaymentDataJson(str.getBytes());
        int i2 = getCiacDecline + 103;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 47;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        $10 = ($11 + 97) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            $11 = ($10 + 15) % 128;
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 62, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1334, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (IccPrivateKeyCrtComponentsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777154) - android.graphics.Color.rgb(0, 0, 0), 1335 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 53, 3542 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.os.Process.myPid() >> 22))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    final boolean valueOf(java.lang.String str, byte[] bArr, byte[] bArr2) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 111;
        getCiacDecline = i % 128;
        boolean valueOf = this.writeReplace.valueOf(str, bArr, bArr2);
        if (i % 2 != 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    final void DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 61) % 128;
        if (this.writeReplace.valueOf() && !writeReplace()) {
            new com.payair.hce.enableScreenShotProtection(this).start();
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 85;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public void values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 57;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            this.valueOf.compareAndSet(true, false);
        } else {
            this.valueOf.compareAndSet(false, true);
        }
        int i2 = getCiacDecline + 75;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void valueOf() {
        getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 25) % 128;
        this.valueOf.compareAndSet(true, false);
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 87) % 128;
    }

    public boolean writeReplace() {
        int i = getCiacDecline + 85;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            this.valueOf.get();
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.valueOf.get();
        getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
        return z;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getCiacDecline = 1;
        IccPrivateKeyCrtComponentsJson = (char) 41742;
        getAid = (char) 54667;
        getProfileVersion = (char) 45602;
        RecordsJson = (char) 34834;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 128;
    }

    final com.payair.hce.Initializer DigitizedCardProfile(byte[] bArr) {
        return (com.payair.hce.Initializer) DigitizedCardProfile(new java.lang.Object[]{this, bArr}, 296170914, -296170914, java.lang.System.identityHashCode(this));
    }
}
