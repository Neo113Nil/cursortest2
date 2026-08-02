package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class getUrl {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static final /* synthetic */ com.payair.hce.getUrl[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] valueOf;
    public static final com.payair.hce.getUrl values;
    public static final com.payair.hce.getUrl writeReplace;

    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = 99 - (s * 3);
        byte[] bArr = $$a;
        int i4 = i + 4;
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i3 = i4 + i6;
            i4 = i4;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            int i9 = i4 + 1;
            if (i8 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i7 = i8;
                i3 = bArr[i9] + i3;
                i4 = i9;
            }
        }
    }

    private getUrl(java.lang.String str, int i) {
    }

    public static com.payair.hce.getUrl valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 71) % 128;
        com.payair.hce.getUrl geturl = (com.payair.hce.getUrl) java.lang.Enum.valueOf(com.payair.hce.getUrl.class, str);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
        return geturl;
    }

    public static com.payair.hce.getUrl[] values() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        com.payair.hce.getUrl[] geturlArr = (com.payair.hce.getUrl[]) DigitizedCardProfile.clone();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 67) % 128;
        return geturlArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson();
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(12 - modifierMetaStateMask, android.view.View.resolveSizeAndState(0, 0, 0), (char) (43635 - (android.os.Process.myPid() >> 22)), objArr);
        com.payair.hce.getUrl geturl = new com.payair.hce.getUrl(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = geturl;
        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        int myTid = android.os.Process.myTid();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 14, 13 - (myTid >> 22), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        com.payair.hce.getUrl geturl2 = new com.payair.hce.getUrl(((java.lang.String) objArr2[0]).intern(), 1);
        values = geturl2;
        DigitizedCardProfile = new com.payair.hce.getUrl[]{geturl, geturl2};
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 57;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            $10 = ($11 + 91) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 382, (char) (android.graphics.Color.green(0) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(-1, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777181) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", "", 0) + 3966, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 212 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.graphics.Color.blue(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                int i4 = $11 + 59;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 4;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 83) % 128;
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = new char[]{62602, 49340, 40146, 26870, 9244, 61478, 52313, 39028, 21914, 8609, 64979, 51695, 34052, 24317, 27343, 13987, 49800, 36452, 23111, 26166, 12811, 65512, 35784, 22449, 25473, 12155, 64342};
        AlternateContactlessPaymentDataJson = 1650940311804668558L;
    }

    static void init$0() {
        $$a = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$b = 23;
    }
}
