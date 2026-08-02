package com.payair.hce;

/* loaded from: classes10.dex */
final class setAdditionalCheckTable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static byte[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getPaymentFci;
    private static int getProfileVersion;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String valueOf = "";
    private java.lang.String values;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.String substring;
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = "";
        for (int i4 = 0; i4 < str.length(); i4++) {
            getPaymentFci = (getCvrMaskAnd + 27) % 128;
            java.lang.String num = java.lang.Integer.toString(str.charAt(i4), 16);
            if (num.length() == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                int myPid = android.os.Process.myPid();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(428605432 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), (-80) - (myPid >> 22), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 1024368985 - android.view.MotionEvent.axisFromString(""), (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(num);
                substring = sb.toString();
            } else {
                substring = num.substring(0, 2);
                int i5 = getCvrMaskAnd + 71;
                getPaymentFci = i5 % 128;
                int i6 = i5 % 2;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(substring);
            str2 = sb2.toString();
        }
        return str2;
    }

    private static void c(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2 = s + 4;
        int i3 = i * 3;
        byte[] bArr = $$a;
        int i4 = s2 + 104;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (-i2) + i5;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i7;
            i4 = (-bArr[i8]) + i4;
            i2 = i8;
        }
    }

    setAdditionalCheckTable() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 4, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000", false, objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{6, 2, 67, 0}, "\u0001\u0001", false, objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
        this.AlternateContactlessPaymentDataJson = null;
        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int indexOf = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(428605359 - resolveOpacity, indexOf - 68, (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4), 1024368987 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        this.writeReplace = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{8, 3, 130, 0}, "\u0000\u0000\u0000", true, objArr4);
        this.IccPrivateKeyCrtComponentsJson = ((java.lang.String) objArr4[0]).intern();
    }

    public final com.payair.hce.setAdditionalCheckTable writeReplace(java.lang.String str) {
        int i = getCvrMaskAnd;
        int i2 = i + 35;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            this.valueOf = str;
            getPaymentFci = (i + 51) % 128;
            return this;
        }
        this.valueOf = str;
        throw null;
    }

    public final com.payair.hce.setAdditionalCheckTable valueOf(java.lang.String str) {
        int i = getPaymentFci + 39;
        this.DigitizedCardProfile = str;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final com.payair.hce.setAdditionalCheckTable values(java.lang.String str) {
        int i = getCvrMaskAnd + 35;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.AlternateContactlessPaymentDataJson = str;
            return this;
        }
        this.AlternateContactlessPaymentDataJson = str;
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String values() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        byte maximumFlingVelocity = (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 78);
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(428605370 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-35) - android.graphics.Color.green(0), maximumFlingVelocity, 1024368996 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(valueOf());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{11, 8, 53, 0}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000", false, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(428605416 + packedPositionGroup, lastIndexOf - 70, (byte) (android.view.View.getDefaultSize(0, 0) + 120), 1024368995 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{19, 10, 0, 0}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", false, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(DigitizedCardProfile());
        byte scrollBarSize = (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 126);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(428605424 - android.view.MotionEvent.axisFromString(""), (-73) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), scrollBarSize, 1024368995 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(new int[]{29, 68, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false, objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        java.lang.String obj = sb.toString();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{97, 2, 175, 2}, "\u0000\u0001", false, objArr7);
        java.lang.String str = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr7[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        getPaymentFci = (getCvrMaskAnd + 115) % 128;
        return str;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = RecordsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[0] = java.lang.Integer.valueOf(cArr[i6]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.red(0), android.text.TextUtils.indexOf("", c, 0, 0) + 2808, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[i2];
                        c(0, (short) -1, (short) 5, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 109) % 128;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i3) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i7 = $10 + 79;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 44, 2836 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c(0, (short) -1, (short) 3, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.resolveSizeAndState(0, 0, 0), 2836 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c(0, (short) -1, (short) 3, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2928 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        c(0, (short) -1, (short) 7, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c2 = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 34, 212 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i3) {
                cArr6[getaccounttype.writeReplace] = cArr3[(i3 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            $11 = ($10 + 93) % 128;
            int i12 = 0;
            while (true) {
                getaccounttype.writeReplace = i12;
                if (getaccounttype.writeReplace >= i3) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i12 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
        long j;
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getAid)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.os.Process.myPid() >> 22) + 29, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr2 = getCiacDecline;
                long j2 = 0;
                if (bArr2 != null) {
                    int i6 = $10 + 25;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i7 = 0;
                    while (i7 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.Process.getElapsedCpuTime() > j2 ? 1 : (android.os.Process.getElapsedCpuTime() == j2 ? 0 : -1)), 5089 - (android.os.SystemClock.uptimeMillis() > j2 ? 1 : (android.os.SystemClock.uptimeMillis() == j2 ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j2 = 0;
                    }
                    $10 = ($11 + 101) % 128;
                    bArr2 = bArr;
                }
                if (bArr2 == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreBusinessLogicModuleImpl[i + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ j)) + i5;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getProfileVersion), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.getDefaultSize(0, 0) + 2364, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c(0, (short) -1, (short) 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = getCiacDecline;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            int i8 = 0;
                            while (i8 < length2) {
                                int i9 = $10 + 61;
                                $11 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    bArr4[i8] = (byte) (bArr3[i8] * (-4897270311952305750L));
                                } else {
                                    bArr4[i8] = (byte) (bArr3[i8] ^ (-4897270311952305750L));
                                    i8++;
                                }
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            $10 = ($11 + 89) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        $11 = ($10 + 41) % 128;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr5 = getCiacDecline;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = SdkCoreBusinessLogicModuleImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                int i10 = $11 + 121;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    byte[] bArr6 = getCiacDecline;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 29, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                    }
                    i4 = ((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] / (-4897270311952305750L))) >>> ((int) (getAid / (-4897270311952305750L)));
                } else {
                    byte[] bArr7 = getCiacDecline;
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                    }
                    i4 = ((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).intValue()] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L)));
                }
                intValue = (byte) i4;
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private java.lang.String valueOf() {
        java.lang.String intern;
        java.lang.String obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{99, 2, 117, 2}, "\u0001\u0000", false, objArr);
        java.lang.String intern2 = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(intern2);
        sb.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this.valueOf}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj2 = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{101, 2, 0, 2}, "\u0001\u0000", true, objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String obj3 = sb2.toString();
        if (this.values.length() >= 2) {
            intern = this.values;
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{6, 2, 67, 0}, "\u0001\u0001", false, objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
        }
        if (intern.length() >= 26) {
            intern = intern.substring(0, 26);
            getPaymentFci = (getCvrMaskAnd + 105) % 128;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj3);
        sb3.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{intern}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj4 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj4);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{101, 2, 0, 2}, "\u0001\u0000", true, objArr4);
        sb4.append(((java.lang.String) objArr4[0]).intern());
        java.lang.String obj5 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(obj5);
        sb5.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this.DigitizedCardProfile.substring(0, 4)}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj6 = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(obj6);
        sb6.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this.IccPrivateKeyCrtComponentsJson}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj7 = sb6.toString();
        if (this.valueOf.length() + this.writeReplace.length() > 29) {
            int length = 29 - this.valueOf.length();
            if (this.writeReplace.length() <= length) {
                length = this.writeReplace.length();
            }
            java.lang.String substring = this.writeReplace.substring(0, length);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(obj7);
            sb7.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{substring}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
            obj = sb7.toString();
            getPaymentFci = (getCvrMaskAnd + 43) % 128;
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(obj7);
            sb8.append((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this.writeReplace}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis()));
            obj = sb8.toString();
        }
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        byte b = (byte) ((-109) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(428605432 - (maximumDrawingCacheSize >> 24), (-79) - (edgeSlop >> 16), b, offsetBefore + 1024368991, (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr5[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    private java.lang.String DigitizedCardProfile() {
        int i = getPaymentFci + 69;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            if (this.AlternateContactlessPaymentDataJson == null) {
                com.payair.hce.setCrmCountryCode setcrmcountrycode = new com.payair.hce.setCrmCountryCode();
                setcrmcountrycode.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile).DigitizedCardProfile(this.valueOf);
                this.AlternateContactlessPaymentDataJson = setcrmcountrycode.AlternateContactlessPaymentDataJson();
                getPaymentFci = (getCvrMaskAnd + 37) % 128;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{103, 4, 0, 0}, "\u0001\u0001\u0000\u0000", false, objArr);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), this.AlternateContactlessPaymentDataJson}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getPaymentFci = 1;
        RecordsJson = new char[]{16853, 16891, 16890, 16891, 16888, 16888, 16895, 16804, 16786, 16760, 16762, 16889, 16826, 16829, 16804, 16809, 16811, 16811, 16809, 16850, 16881, 16880, 16888, 16893, 16895, 16895, 16885, 16885, 16884, 16850, 16881, 16880, 16889, 16891, 16885, 16881, 16881, 16880, 16885, 16886, 16892, 16888, 16881, 16880, 16880, 16884, 16894, 16891, 16881, 16885, 16895, 16895, 16893, 16891, 16883, 16882, 16887, 16886, 16895, 16891, 16880, 16887, 16894, 16891, 16883, 16886, 16895, 16888, 16881, 16885, 16893, 16892, 16895, 16891, 16881, 16882, 16890, 16892, 16894, 16891, 16881, 16883, 16882, 16885, 16892, 16888, 16881, 16885, 16895, 16895, 16893, 16889, 16881, 16882, 16893, 16895, 16895, 16829, 16684, 16794, 16742, 16876, 16883, 16850, 16881, 16880, 16882};
        SdkCoreAlternateContactlessPaymentDataImpl = -110087685;
        getAid = 520368635;
        getProfileVersion = -571117700;
        getCiacDecline = new byte[]{-82, -82, -82, -82, -82, -82, -82, -82, -82, -82, -82, -82, 13, -14, 14, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, -30, com.google.common.base.Ascii.RS, -27, -27, -24, com.google.common.base.Ascii.NAK, 17, -14, 14, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, -30, com.google.common.base.Ascii.RS, -26, -28, -24, com.google.common.base.Ascii.NAK, 16, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, -26, com.google.common.base.Ascii.SUB, -11, com.google.common.base.Ascii.NAK, -24, com.google.common.base.Ascii.NAK, 56, -60, -46, 44, -48, 41, 45, 34, -33, 44, -41, 41, -47, 41, -40, 37, 56, -86, -86, -86, -86, -86, -86};
    }

    private static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str}, -1043378162, 1043378162, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{124, -43, -124, -86};
        $$b = 102;
    }
}
