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
public final class replenishAllCards {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.replenishAllCards AlternateContactlessPaymentDataJson;
    private static com.payair.hce.replenishAllCards DigitizedCardProfile;
    private static long IccPrivateKeyCrtComponentsJson;
    private static final /* synthetic */ com.payair.hce.replenishAllCards[] RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.replenishAllCards valueOf;
    private static com.payair.hce.replenishAllCards values;
    public static final com.payair.hce.replenishAllCards writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = s2 * 3;
        int i5 = (i * 4) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            i2 = 0;
            i5 += -i6;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i5 += -i6;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            int i7 = (s * 4) + 99;
            i2 = 0;
            i3 = i5;
            i5 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    private replenishAllCards(java.lang.String str, int i) {
    }

    public static com.payair.hce.replenishAllCards valueOf(java.lang.String str) {
        int i = getProfileVersion + 7;
        getAid = i % 128;
        com.payair.hce.replenishAllCards replenishallcards = (com.payair.hce.replenishAllCards) java.lang.Enum.valueOf(com.payair.hce.replenishAllCards.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getAid = (getProfileVersion + 75) % 128;
        return replenishallcards;
    }

    public static com.payair.hce.replenishAllCards[] values() {
        getAid = (getProfileVersion + 83) % 128;
        com.payair.hce.replenishAllCards[] replenishallcardsArr = (com.payair.hce.replenishAllCards[]) RecordsJson.clone();
        getAid = (getProfileVersion + 115) % 128;
        return replenishallcardsArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getProfileVersion = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(4 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        com.payair.hce.replenishAllCards replenishallcards = new com.payair.hce.replenishAllCards(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = replenishallcards;
        int axisFromString = android.view.MotionEvent.axisFromString("");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(axisFromString + 11, 5 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString("") + 63550), objArr2);
        values = new com.payair.hce.replenishAllCards(((java.lang.String) objArr2[0]).intern(), 1);
        int size = android.view.View.MeasureSpec.getSize(0);
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(size + 9, trimmedLength + 14, (char) (17366 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr3);
        DigitizedCardProfile = new com.payair.hce.replenishAllCards(((java.lang.String) objArr3[0]).intern(), 2);
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((minimumFlingVelocity >> 16) + 23, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, (char) (android.view.View.MeasureSpec.getSize(0) + 56306), objArr4);
        AlternateContactlessPaymentDataJson = new com.payair.hce.replenishAllCards(((java.lang.String) objArr4[0]).intern(), 3);
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 6, 46 - (android.os.Process.myPid() >> 22), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr5);
        com.payair.hce.replenishAllCards replenishallcards2 = new com.payair.hce.replenishAllCards(((java.lang.String) objArr5[0]).intern(), 4);
        valueOf = replenishallcards2;
        RecordsJson = new com.payair.hce.replenishAllCards[]{replenishallcards, values, DigitizedCardProfile, AlternateContactlessPaymentDataJson, replenishallcards2};
        int i = getAid + 39;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static com.payair.hce.replenishAllCards valueOf() {
        int i = getProfileVersion + 107;
        getAid = i % 128;
        if (i % 2 == 0) {
            return writeReplace;
        }
        throw null;
    }

    public static com.payair.hce.replenishAllCards AlternateContactlessPaymentDataJson() {
        int i = (getAid + 27) % 128;
        getProfileVersion = i;
        com.payair.hce.replenishAllCards replenishallcards = writeReplace;
        int i2 = i + 69;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return replenishallcards;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            $11 = ($10 + 115) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 48, 380 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (62389 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 35, 4014 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-16736993) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
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
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 35, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str = new java.lang.String(cArr);
        $11 = ($10 + 11) % 128;
        objArr[0] = str;
    }

    public static com.payair.hce.replenishAllCards valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile getcmscformatteddigitizedcardprofile) {
        int i = getAid;
        getProfileVersion = (i + 105) % 128;
        if (getcmscformatteddigitizedcardprofile != null) {
            getProfileVersion = (i + 101) % 128;
            if (getcmscformatteddigitizedcardprofile.IccPrivateKeyCrtComponentsJson() != com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.RecordsJson) {
                if (getcmscformatteddigitizedcardprofile.IccPrivateKeyCrtComponentsJson() == com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.writeReplace && getcmscformatteddigitizedcardprofile.writeReplace()) {
                    return values;
                }
                if (getcmscformatteddigitizedcardprofile.IccPrivateKeyCrtComponentsJson() == com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.DigitizedCardProfile && getcmscformatteddigitizedcardprofile.writeReplace()) {
                    return DigitizedCardProfile;
                }
                com.payair.hce.replenishAllCards replenishallcards = writeReplace;
                int i2 = getProfileVersion + 119;
                getAid = i2 % 128;
                if (i2 % 2 == 0) {
                    return replenishallcards;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return valueOf;
    }

    public static com.payair.hce.replenishAllCards writeReplace(com.payair.hce.readDsrpImk readdsrpimk, com.payair.hce.getTransactionCredentialData gettransactioncredentialdata) {
        if (readdsrpimk.AlternateContactlessPaymentDataJson()) {
            return writeReplace;
        }
        if (gettransactioncredentialdata == null || !gettransactioncredentialdata.RecordsJson()) {
            return valueOf;
        }
        if (!gettransactioncredentialdata.AlternateContactlessPaymentDataJson()) {
            if (!gettransactioncredentialdata.writeReplace()) {
                if (gettransactioncredentialdata.getProfileVersion()) {
                    getProfileVersion = (getAid + 1) % 128;
                    return DigitizedCardProfile;
                }
                return writeReplace;
            }
            getAid = (getProfileVersion + 71) % 128;
            return values;
        }
        int i = getAid + 39;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw new java.lang.ArithmeticException();
    }

    static void init$0() {
        $$a = new byte[]{115, 113, -43, -44};
        $$b = 27;
    }

    static void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{24289, 7763, 57223, 40179, 42718, 58988, 10171, 25793, 42003, 58795, 8956, 25124, 41792, 57492, 7465, 23936, 40027, 57133, 8183, 24145, 39197, 55757, 6311, 34066, 50592, 1143, 18189, 34783, 50791, 304, 16872, 32908, 50008, 1020, 17059, 36203, 52245, 3268, 20329, 36394, 52976, 2442, 18496, 35060, 52128, 2682, 24314, 7762, 57218, 40184, 23596, 7559, 56019};
        IccPrivateKeyCrtComponentsJson = -2910609969397555684L;
    }
}
