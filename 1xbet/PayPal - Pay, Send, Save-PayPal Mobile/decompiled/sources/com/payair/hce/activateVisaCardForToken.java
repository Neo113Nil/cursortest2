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
public final class activateVisaCardForToken {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.activateVisaCardForToken[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.activateVisaCardForToken DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    public static final com.payair.hce.activateVisaCardForToken valueOf;
    private static int values;
    public static final com.payair.hce.activateVisaCardForToken writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 115 - (s3 * 4);
        int i3 = s2 * 4;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            int i7 = 0;
            int i8 = (-i4) + i6;
            i = i7;
            int i9 = i5;
            i2 = i8;
            i4 = i9;
            int i10 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i2;
            i5 = i10;
            i4 = bArr[i10];
            i7 = i + 1;
            i6 = i11;
            int i82 = (-i4) + i6;
            i = i7;
            int i92 = i5;
            i2 = i82;
            i4 = i92;
            int i102 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        } else {
            i = 0;
            int i1022 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        }
    }

    private activateVisaCardForToken(java.lang.String str, int i) {
    }

    public static com.payair.hce.activateVisaCardForToken valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 9) % 128;
        com.payair.hce.activateVisaCardForToken activatevisacardfortoken = (com.payair.hce.activateVisaCardForToken) java.lang.Enum.valueOf(com.payair.hce.activateVisaCardForToken.class, str);
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 37) % 128;
        return activatevisacardfortoken;
    }

    public static com.payair.hce.activateVisaCardForToken[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 119;
        getProfileVersion = i % 128;
        com.payair.hce.activateVisaCardForToken[] activatevisacardfortokenArr = AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return (com.payair.hce.activateVisaCardForToken[]) activatevisacardfortokenArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(8 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), false, "\t\ufffe\ufff8\ufff9\u0004\u0002\ufffa\b", 83 - android.view.KeyEvent.keyCodeFromString(""), 3 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        com.payair.hce.activateVisaCardForToken activatevisacardfortoken = new com.payair.hce.activateVisaCardForToken(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = activatevisacardfortoken;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, "\u0003\ufffe\u0001\ufff6\u0003\u0004\ufffe\t\ufff6\u0003\u0007\ufffa\t", 83 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
        com.payair.hce.activateVisaCardForToken activatevisacardfortoken2 = new com.payair.hce.activateVisaCardForToken(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = activatevisacardfortoken2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(7 - android.view.Gravity.getAbsoluteGravity(0, 0), true, "\uffff\ufffe\ufffb\ufffe\u0005\ufffe\u0007", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 87, (-16777211) - android.graphics.Color.rgb(0, 0, 0), objArr3);
        com.payair.hce.activateVisaCardForToken activatevisacardfortoken3 = new com.payair.hce.activateVisaCardForToken(((java.lang.String) objArr3[0]).intern(), 2);
        DigitizedCardProfile = activatevisacardfortoken3;
        AlternateContactlessPaymentDataJson = new com.payair.hce.activateVisaCardForToken[]{activatevisacardfortoken, activatevisacardfortoken2, activatevisacardfortoken3};
        int i = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $11 + 117;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 43, 2073 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) -1, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 53, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3543, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $10 = ($11 + 7) % 128;
            char[] cArr3 = new char[i];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i) {
                int i6 = $11 + 125;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i - digitizedCardJson11.DigitizedCardProfile) >> 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 3543 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 53, 3543 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, -26, -116};
        $$b = 135;
    }

    static void valueOf() {
        values = 1889207145;
    }
}
