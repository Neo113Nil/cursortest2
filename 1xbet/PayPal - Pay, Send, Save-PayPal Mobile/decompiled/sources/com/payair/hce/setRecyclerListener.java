package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setRecyclerListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.setRecyclerListener[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setRecyclerListener DigitizedCardProfile;
    private static int getProfileVersion;
    public static final com.payair.hce.setRecyclerListener valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (i2 * 4);
        int i5 = 1 - (b * 4);
        int i6 = (i * 3) + 115;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 += -i7;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    private setRecyclerListener(java.lang.String str, int i) {
    }

    public static com.payair.hce.setRecyclerListener valueOf(java.lang.String str) {
        int i = getProfileVersion + 67;
        writeReplace = i % 128;
        com.payair.hce.setRecyclerListener setrecyclerlistener = (com.payair.hce.setRecyclerListener) java.lang.Enum.valueOf(com.payair.hce.setRecyclerListener.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        writeReplace = (getProfileVersion + 47) % 128;
        return setrecyclerlistener;
    }

    public static com.payair.hce.setRecyclerListener[] values() {
        int i = writeReplace + 29;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setRecyclerListener[] setrecyclerlistenerArr = (com.payair.hce.setRecyclerListener[]) AlternateContactlessPaymentDataJson.clone();
        int i2 = writeReplace + 71;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return setrecyclerlistenerArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        getProfileVersion = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(6 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, "\ufffa\u000b\u0006\ufff9\u0001￼", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 179, android.text.TextUtils.indexOf("", "") + 2, objArr);
        com.payair.hce.setRecyclerListener setrecyclerlistener = new com.payair.hce.setRecyclerListener(((java.lang.String) objArr[0]).intern(), 0);
        valueOf = setrecyclerlistener;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(16777221 + android.graphics.Color.rgb(0, 0, 0), false, "\r\ufff5\u0006\u0006\ufff5", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 183, 1 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        com.payair.hce.setRecyclerListener setrecyclerlistener2 = new com.payair.hce.setRecyclerListener(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = setrecyclerlistener2;
        AlternateContactlessPaymentDataJson = new com.payair.hce.setRecyclerListener[]{setrecyclerlistener, setrecyclerlistener2};
        int i = getProfileVersion + 23;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 95) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 44, android.view.KeyEvent.normalizeMetaState(0) + 2073, (char) (60037 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                    byte b = $$a[2];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 3543 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 89) % 128;
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
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.normalizeMetaState(0), 3543 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{117, 33, 0, 124};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
    }

    static void valueOf() {
        values = 1889207050;
    }
}
