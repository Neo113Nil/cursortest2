package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setChildIndicatorBoundsRelative {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.setChildIndicatorBoundsRelative[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setChildIndicatorBoundsRelative DigitizedCardProfile;
    private static int getProfileVersion;
    private static int valueOf;
    private static int values;
    private static com.payair.hce.setChildIndicatorBoundsRelative writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i2 * 3) + 4;
        int i5 = i * 4;
        int i6 = 115 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            i6 = i7;
            i3 = 0;
            i6 += i8;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i4];
            i6 += i8;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    private setChildIndicatorBoundsRelative(java.lang.String str, int i) {
    }

    public static com.payair.hce.setChildIndicatorBoundsRelative valueOf(java.lang.String str) {
        int i = getProfileVersion + 7;
        values = i % 128;
        com.payair.hce.setChildIndicatorBoundsRelative setchildindicatorboundsrelative = (com.payair.hce.setChildIndicatorBoundsRelative) java.lang.Enum.valueOf(com.payair.hce.setChildIndicatorBoundsRelative.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getProfileVersion + 101;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return setchildindicatorboundsrelative;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setChildIndicatorBoundsRelative[] values() {
        int i = getProfileVersion + 85;
        values = i % 128;
        com.payair.hce.setChildIndicatorBoundsRelative[] setchildindicatorboundsrelativeArr = AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return (com.payair.hce.setChildIndicatorBoundsRelative[]) setchildindicatorboundsrelativeArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(4 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), false, "\ufffe\ufffe\t�", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 3 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        writeReplace = new com.payair.hce.setChildIndicatorBoundsRelative(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(7 - android.text.TextUtils.indexOf("", ""), false, "\u0007￼\ufff5\u0000\u0000\u0003\u000b", 248 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 7 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        com.payair.hce.setChildIndicatorBoundsRelative setchildindicatorboundsrelative = new com.payair.hce.setChildIndicatorBoundsRelative(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = setchildindicatorboundsrelative;
        AlternateContactlessPaymentDataJson = new com.payair.hce.setChildIndicatorBoundsRelative[]{writeReplace, setchildindicatorboundsrelative};
        getProfileVersion = (values + 117) % 128;
    }

    private static void a(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 125) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            $10 = ($11 + 67) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2072, (char) (android.text.TextUtils.getTrimmedLength("") + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 53, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3542, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $11 = ($10 + 29) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 53, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3543, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = 1889207245;
    }

    static void init$0() {
        $$a = new byte[]{62, -127, kotlin.io.encoding.Base64.padSymbol, 101};
        $$b = 147;
    }
}
