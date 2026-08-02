package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class setExpiryTimestamp {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.setExpiryTimestamp[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setExpiryTimestamp DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static com.payair.hce.setExpiryTimestamp valueOf;
    private static com.payair.hce.setExpiryTimestamp values;
    private static long writeReplace;

    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = 113 - b;
        byte[] bArr = $$a;
        int i3 = i * 3;
        int i4 = 4 - (s * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 += i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i6 = bArr[i4];
                i4++;
                i2 += i6;
            }
        }
    }

    private setExpiryTimestamp(java.lang.String str, int i) {
    }

    public static com.payair.hce.setExpiryTimestamp valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 35) % 128;
        com.payair.hce.setExpiryTimestamp setexpirytimestamp = (com.payair.hce.setExpiryTimestamp) java.lang.Enum.valueOf(com.payair.hce.setExpiryTimestamp.class, str);
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 87) % 128;
        return setexpirytimestamp;
    }

    public static com.payair.hce.setExpiryTimestamp[] values() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 57) % 128;
        com.payair.hce.setExpiryTimestamp[] setexpirytimestampArr = (com.payair.hce.setExpiryTimestamp[]) AlternateContactlessPaymentDataJson.clone();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 45) % 128;
        return setexpirytimestampArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ு韫㎑\udf4d筽", 39979 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        valueOf = new com.payair.hce.setExpiryTimestamp(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("ெ翂\ue3ea埾\udb98侸", android.view.View.MeasureSpec.getSize(0) + 29717, objArr2);
        values = new com.payair.hce.setExpiryTimestamp(((java.lang.String) objArr2[0]).intern(), 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("ௐౖӴᴜᖾⷃ♥", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1949, objArr3);
        com.payair.hce.setExpiryTimestamp setexpirytimestamp = new com.payair.hce.setExpiryTimestamp(((java.lang.String) objArr3[0]).intern(), 2);
        DigitizedCardProfile = setexpirytimestamp;
        AlternateContactlessPaymentDataJson = new com.payair.hce.setExpiryTimestamp[]{valueOf, values, setexpirytimestamp};
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 51;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = $11 + 125;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 31, android.graphics.Color.rgb(0, 0, 0) + 16779106, (char) (3599 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() - (writeReplace * (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 64, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1443, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29681));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 1, (short) 0, objArr5);
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
            } else {
                int i4 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1891 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (3600 - android.view.View.MeasureSpec.getSize(0)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(0, (byte) 0, (short) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (writeReplace ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.resolveSize(0, 0), android.graphics.Color.alpha(0) + 1443, (char) (29682 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(0, (byte) 1, (short) 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $11 = ($10 + 85) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1442, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29683));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(0, (byte) 1, (short) 0, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        java.lang.String str2 = new java.lang.String(cArr);
        $11 = ($10 + 35) % 128;
        objArr[0] = str2;
    }

    static void DigitizedCardProfile() {
        writeReplace = -7853317525538505459L;
    }

    static void init$0() {
        $$a = new byte[]{35, -24, 78, -57};
        $$b = 82;
    }
}
