package com.mastercard.mpsdk.card.profile.v1;

/* loaded from: classes4.dex */
public class DigitizedCardProfileV1Json implements com.mastercard.mpsdk.card.profile.DigitizedCardProfile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static long values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "businessLogicModule")
    public com.mastercard.mpsdk.card.profile.v1.BusinessLogicModuleV1Json businessLogicModule;

    @com.payair.hce.setSelectionFromTop(valueOf = "digitizedCardId")
    public java.lang.String digitizedCardId;

    @com.payair.hce.setSelectionFromTop(valueOf = "maximumPinTry")
    public int maximumPinTry;

    @com.payair.hce.setSelectionFromTop(valueOf = "mppLiteModule")
    public com.mastercard.mpsdk.card.profile.v1.MppLiteModuleV1Json mppLiteModule;

    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = 113 - i2;
        byte[] bArr = $$a;
        int i5 = i * 4;
        int i6 = 3 - (i3 * 4);
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i4 = i5 + i6;
            i6 = i6;
            i7 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4 += bArr[i8];
                i6 = i8;
                i7 = i9;
            }
        }
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("픆ꔍ㕑蕭ᕱ\ue514甅", 28686 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        writeReplace = (DigitizedCardProfile + 99) % 128;
        return DigitizedCardProfile2;
    }

    public static com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json valueOf(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr);
        new java.lang.Object[]{str};
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(str.getBytes()));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json digitizedCardProfileV1Json = (com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = writeReplace + 41;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return digitizedCardProfileV1Json;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 103;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1890, (char) (android.view.View.combineMeasuredStates(0, 0) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 64, 1444 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (29682 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 1, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $11 = ($10 + 73) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 64, 1443 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 1, 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.mastercard.mpsdk.card.profile.DigitizedCardProfile
    public com.payair.hce.getStatusCodeFromServer getProfileVersion() {
        int i = DigitizedCardProfile + 95;
        writeReplace = i % 128;
        com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
        if (i % 2 != 0) {
            return getstatuscodefromserver;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        writeReplace = 1;
        values = -1217980506930109532L;
    }

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$b = 17;
    }
}
