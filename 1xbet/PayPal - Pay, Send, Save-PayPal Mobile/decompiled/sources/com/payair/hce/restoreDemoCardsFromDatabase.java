package com.payair.hce;

/* loaded from: classes4.dex */
public final class restoreDemoCardsFromDatabase extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 4 - (s * 2);
        int i4 = b * 2;
        byte[] bArr2 = new byte[i4 + 1];
        ?? r8 = 115 - (s2 * 3);
        if (bArr == null) {
            byte b2 = r8;
            int i5 = 0;
            int i6 = i3;
            i3++;
            int i7 = i6 + (-b2);
            i = i5;
            i2 = i7;
            int i8 = i2;
            int i9 = i3;
            bArr2[i] = (byte) i8;
            i5 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i9];
            i6 = i8;
            i3 = i9;
            i3++;
            int i72 = i6 + (-b2);
            i = i5;
            i2 = i72;
            int i82 = i2;
            int i92 = i3;
            bArr2[i] = (byte) i82;
            i5 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            int i822 = i2;
            int i922 = i3;
            bArr2[i] = (byte) i822;
            i5 = i + 1;
            if (i == i4) {
            }
        }
    }

    /* synthetic */ restoreDemoCardsFromDatabase(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = DigitizedCardProfile + 21;
        values = i % 128;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "￼\t\ufff7\u0006", (elapsedRealtimeNanos > 1L ? 1 : (elapsedRealtimeNanos == 1L ? 0 : -1)) * 98, 2 >> (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 17), android.view.View.MeasureSpec.getSize(0) + 4, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(false, "￼\t\ufff7\u0006", (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 103, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, android.view.View.MeasureSpec.getSize(0) + 4, objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        int i2 = DigitizedCardProfile + 15;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private restoreDemoCardsFromDatabase() {
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        DigitizedCardProfile = (values + 63) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        values = (DigitizedCardProfile + 45) % 128;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 113) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 43, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2073, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 60038));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('e' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.keyCodeFromString("") + 3543, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            $11 = ($10 + 97) % 128;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.indexOf("", "") + 3543, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        values = 1;
        valueOf = 1889207114;
    }

    static void init$0() {
        $$a = new byte[]{40, 78, 110, 117};
        $$b = 17;
    }
}
