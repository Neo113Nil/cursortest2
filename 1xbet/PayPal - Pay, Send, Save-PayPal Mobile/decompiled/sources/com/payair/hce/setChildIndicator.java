package com.payair.hce;

/* loaded from: classes4.dex */
public final class setChildIndicator {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static int values;
    private static int writeReplace;
    private java.util.LinkedList<java.lang.String> AlternateContactlessPaymentDataJson = new java.util.LinkedList<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 4) + 4;
        int i6 = 1 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i3 = i5;
            int i7 = i6;
            i4 = 0;
            i5 += i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i5 += i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i2 = 0;
            i5 = (b * 4) + 115;
            i3 = i5;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public setChildIndicator() {
    }

    private setChildIndicator(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            this.AlternateContactlessPaymentDataJson.add(str);
        }
    }

    public final com.payair.hce.setChildIndicator AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = writeReplace + 47;
        values = i % 128;
        if (i % 2 == 0) {
            this.AlternateContactlessPaymentDataJson.add(str);
            writeReplace = (values + 15) % 128;
            return this;
        }
        this.AlternateContactlessPaymentDataJson.add(str);
        throw null;
    }

    public final java.lang.String writeReplace() {
        values = (writeReplace + 109) % 128;
        java.lang.String removeLast = this.AlternateContactlessPaymentDataJson.removeLast();
        writeReplace = (values + 75) % 128;
        return removeLast;
    }

    public final java.util.List<java.lang.String> valueOf() {
        int i = (writeReplace + 25) % 128;
        values = i;
        java.util.LinkedList<java.lang.String> linkedList = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 25;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return linkedList;
        }
        throw null;
    }

    public final int DigitizedCardProfile() {
        int i = writeReplace + 47;
        values = i % 128;
        if (i % 2 != 0) {
            this.AlternateContactlessPaymentDataJson.size();
            throw null;
        }
        int size = this.AlternateContactlessPaymentDataJson.size();
        int i2 = writeReplace + 65;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return size;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setChildIndicator setchildindicator = (com.payair.hce.setChildIndicator) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "￣\u001e", 138 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
        java.util.Iterator<java.lang.String> it = setchildindicator.AlternateContactlessPaymentDataJson.iterator();
        boolean z = false;
        while (it.hasNext()) {
            writeReplace = (values + 19) % 128;
            java.lang.String next = it.next();
            if (z) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(false, "\u0000", android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1 - android.view.View.MeasureSpec.getMode(0), objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
            }
            sb.append(next);
            writeReplace = (values + 21) % 128;
            z = true;
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(false, "￢\u001f", 138 - android.os.Process.getGidForName(""), 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 3 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        java.lang.String obj = sb.toString();
        int i = writeReplace + 35;
        values = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object obj) {
        int i = values + 39;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            values = (i2 + 21) % 128;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.AlternateContactlessPaymentDataJson.equals(((com.payair.hce.setChildIndicator) obj).AlternateContactlessPaymentDataJson)) {
            return true;
        }
        writeReplace = (values + 71) % 128;
        return false;
    }

    public final int hashCode() {
        int i = values + 19;
        writeReplace = i % 128;
        int hashCode = this.AlternateContactlessPaymentDataJson.hashCode();
        if (i % 2 != 0) {
            return hashCode;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setChildIndicator values(java.lang.String str) {
        int i = values + 31;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (str == null) {
            com.payair.hce.setChildIndicator setchildindicator = new com.payair.hce.setChildIndicator();
            writeReplace = (values + 27) % 128;
            return setchildindicator;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "\u0017￩", 146 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, objArr);
        return new com.payair.hce.setChildIndicator(str.split(((java.lang.String) objArr[0]).intern()));
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = ($11 + 5) % 128;
        $10 = i4;
        if (str != null) {
            int i5 = i4 + 9;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 73) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i6 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.os.Process.myPid() >> 22), 2072 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (60037 - android.graphics.Color.argb(0, 0, 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 53, 3543 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 11) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $10 = ($11 + 79) % 128;
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 3543 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        values = 0;
        writeReplace = 1;
        valueOf = 1889207084;
    }

    static void init$0() {
        $$a = new byte[]{65, -108, -120, -80};
        $$b = 102;
    }

    public final java.lang.String toString() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1879673599, -1879673599, java.lang.System.identityHashCode(this));
    }
}
