package com.payair.hce;

/* loaded from: classes4.dex */
public final class getRequiredConverters extends java.io.ObjectInputStream {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int getAid;
    private static char valueOf;
    private static int values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (b * 63) + 4;
        int i6 = 66 - (i2 * 2);
        byte[] bArr = $$a;
        int i7 = 99 - (i * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i7 = i6;
            i4 = 0;
            i7 = i7 + i5 + 1;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i5;
            i5 = bArr[i5];
            i7 = i7 + i5 + 1;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (s * 4);
        int i5 = (b * 2) + 110;
        int i6 = i * 3;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += -i5;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            int i9 = i3 + 1;
            if (i2 == 0 - i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i8 = i10;
            i4 += -i5;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            int i92 = i3 + 1;
            if (i2 == 0 - i6) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i5;
            bArr2[i2] = (byte) i4;
            int i922 = i3 + 1;
            if (i2 == 0 - i6) {
            }
        }
    }

    public getRequiredConverters(java.io.InputStream inputStream) throws java.io.IOException {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    protected final java.lang.Class<?> resolveClass(java.io.ObjectStreamClass objectStreamClass) throws java.io.IOException, java.lang.ClassNotFoundException {
        if (!objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.class.getName())) {
            getAid = (values + 3) % 128;
            if (!objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreAlternateContactlessPaymentDataImpl.class.getName())) {
                java.lang.String name2 = objectStreamClass.getName();
                byte[] bArr = $$a;
                byte b = bArr[10];
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(b, b, bArr[30], objArr);
                if (!name2.equals(java.lang.Class.forName((java.lang.String) objArr[0]).getName())) {
                    int i = values + 101;
                    getAid = i % 128;
                    if (i % 2 == 0) {
                        objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreCardRiskManagementDataImpl.class.getName());
                        throw null;
                    }
                    if (!objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreCardRiskManagementDataImpl.class.getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreContactlessPaymentDataImpl.class.getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreIccPrivateKeyCrtComponentsImpl.class.getName())) {
                        getAid = (values + 49) % 128;
                        if (!objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreMagstripeCvmIssuerOptionsImpl.class.getName())) {
                            java.lang.String name3 = objectStreamClass.getName();
                            byte b2 = bArr[10];
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(b2, bArr[30], b2, objArr2);
                            if (!name3.equals(java.lang.Class.forName((java.lang.String) objArr2[0]).getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreMppLiteModuleImpl.class.getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl.class.getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreRemotePaymentDataImpl.class.getName()) && !objectStreamClass.getName().equals(java.lang.String[].class.getName())) {
                                values = (getAid + 57) % 128;
                                if (!objectStreamClass.getName().equals(byte[].class.getName()) && !objectStreamClass.getName().equals(com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl[].class.getName())) {
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    b("䖵캠\udaec\uefb9呣叞㧕隥⫎İ䛟犐⫠\uf4bb﹝至瀧\uec5b狓탔왗\uefa3彈픔籼쒔⪈剆忬爡緶汄\uf7f0執ᲈ㯊", android.text.TextUtils.getOffsetAfter("", 0) + 36, objArr3);
                                    throw new java.io.InvalidClassException(((java.lang.String) objArr3[0]).intern(), objectStreamClass.getName());
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.resolveClass(objectStreamClass);
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 47) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            $10 = ($11 + 59) % 128;
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $10 = ($11 + 21) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (writeReplace ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.graphics.ImageFormat.getBitsPerPixel(0), 1335 - (android.os.Process.myTid() >> 22), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61, 1335 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((short) 0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53, 3544 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            int i5 = $10 + 37;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void init$1() {
        $$d = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson = (char) 12143;
        valueOf = (char) 26354;
        writeReplace = (char) 40972;
        DigitizedCardProfile = (char) 43084;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -107, com.google.common.base.Ascii.SUB, -98, com.google.common.base.Ascii.VT, -3, com.visa.cbp.getEncExpo.startTransaction, 62, -13, 17, 0, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF, com.visa.cbp.getEncExpo.onUnminimized, -3, 16, -15, -55, 62, 2, 2, com.visa.cbp.getEncExpo.onUnminimized, 6, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -3, 16, -15, -55, 65, 1, -4, -10, 2, 2, -8, -56, 36, 16, 6, -41, 43, 2, -14, -36, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -3, -11, 4, -10, 13, -1, -40, 34, -9, 1, -7, -23, 33, -12, 16, -10, -8, -29, 35, 2, -5, com.google.common.base.Ascii.VT, -3, com.visa.cbp.getEncExpo.startTransaction, 62, -13, 17, 0, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF, com.visa.cbp.getEncExpo.onUnminimized, -3, 16, -15, -55, 62, 2, 2, com.visa.cbp.getEncExpo.onUnminimized, 6, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -3, 16, -15, -55, 65, 1, -4, -10, 2, 2, -8, -56, 36, 16, 6, -41, 43, 2, -14, -25, -11, 36, 0, 6, -46, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -10, -37, 41, -1, 1, -17, com.google.common.base.Ascii.FF, -36, 32, 3, -12, 5, -2, 4, -43, 35, 2, -5};
        $$b = 176;
    }
}
