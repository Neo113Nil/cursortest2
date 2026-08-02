package com.payair.hce;

/* loaded from: classes10.dex */
final class setCardLayoutDescription {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final java.lang.String AlternateContactlessPaymentDataJson;
    public static final java.lang.String DigitizedCardProfile;
    public static final com.payair.hce.DeleteCardResponseEncrypted IccPrivateKeyCrtComponentsJson;
    public static final com.payair.hce.getCardProfile RecordsJson;
    public static final com.payair.hce.setCardProfile SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] SdkCoreBusinessLogicModuleImpl;
    public static final com.payair.hce.ProvisionResponseEncrypted getAid;
    private static long getCiacDecline;
    public static final com.payair.hce.getIsRedigitization getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    public static final com.payair.hce.setExpiryTimestamp getProfileVersion;
    public static final java.lang.String valueOf;
    public static final java.lang.String values;
    public static final java.lang.String writeReplace;

    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2 = i * 4;
        int i3 = (s * 4) + 99;
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i4);
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i8];
                i4 = i8;
                i6 = i7;
            }
        }
    }

    setCardLayoutDescription() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        int i3;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 51) % 128;
        while (true) {
            i3 = 2;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            $11 = ($10 + 29) % 128;
            int i4 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48, 381 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.text.TextUtils.indexOf("", "", 0) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, (byte) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getCiacDecline), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34, 3965 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.View.MeasureSpec.getSize(0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.MeasureSpec.getMode(0), android.graphics.Color.rgb(0, 0, 0) + 16777428, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 3) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 211 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                java.lang.Class<?>[] clsArr = new java.lang.Class[i3];
                clsArr[0] = java.lang.Object.class;
                clsArr[1] = java.lang.Object.class;
                obj4 = cls2.getMethod("d", clsArr);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            i3 = 2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getPaymentFci = 1;
        DigitizedCardProfile();
        android.text.TextUtils.indexOf("", "", 0);
        android.os.SystemClock.uptimeMillis();
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.graphics.Color.green(0);
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.view.ViewConfiguration.getPressedStateDuration();
        android.util.TypedValue.complexToFloat(0);
        android.view.ViewConfiguration.getScrollFriction();
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.view.ViewConfiguration.getEdgeSlop();
        android.text.TextUtils.getCapsMode("", 0, 0);
        android.view.ViewConfiguration.getPressedStateDuration();
        android.text.TextUtils.indexOf("", "", 0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        android.view.ViewConfiguration.getJumpTapTimeout();
        android.text.TextUtils.getTrimmedLength("");
        android.view.ViewConfiguration.getScrollBarSize();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.View.combineMeasuredStates(0, 0);
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.media.AudioTrack.getMinVolume();
        android.view.ViewConfiguration.getKeyRepeatTimeout();
        android.view.ViewConfiguration.getFadingEdgeLength();
        android.view.View.MeasureSpec.getMode(0);
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.os.Process.myPid();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.ViewConfiguration.getScrollFriction();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.graphics.Color.blue(0);
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        android.graphics.Color.argb(0, 0, 0, 0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.text.TextUtils.getOffsetAfter("", 0);
        android.text.TextUtils.indexOf("", "", 0, 0);
        android.view.ViewConfiguration.getScrollFriction();
        android.view.MotionEvent.axisFromString("");
        android.graphics.Color.rgb(0, 0, 0);
        android.os.Process.getGidForName("");
        android.view.KeyEvent.keyCodeFromString("");
        android.view.KeyEvent.getDeadChar(0, 0);
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.view.ViewConfiguration.getEdgeSlop();
        android.view.View.resolveSize(0, 0);
        android.os.Process.getElapsedCpuTime();
        android.view.ViewConfiguration.getZoomControlsTimeout();
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.view.ViewConfiguration.getScrollFriction();
        android.view.ViewConfiguration.getLongPressTimeout();
        android.graphics.PointF.length(0.0f, 0.0f);
        android.view.ViewConfiguration.getScrollBarSize();
        android.view.View.MeasureSpec.getSize(0);
        android.graphics.ImageFormat.getBitsPerPixel(0);
        android.os.SystemClock.currentThreadTimeMillis();
        android.text.TextUtils.indexOf("", "", 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        android.view.ViewConfiguration.getEdgeSlop();
        android.os.Process.getElapsedCpuTime();
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.text.TextUtils.getOffsetBefore("", 0);
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.View.combineMeasuredStates(0, 0);
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.view.ViewConfiguration.getKeyRepeatTimeout();
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        android.view.KeyEvent.keyCodeFromString("");
        android.view.View.MeasureSpec.getSize(0);
        android.view.ViewConfiguration.getZoomControlsTimeout();
        android.view.MotionEvent.axisFromString("");
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        android.graphics.Color.green(0);
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.text.TextUtils.getCapsMode("", 0, 0);
        android.view.ViewConfiguration.getScrollBarSize();
        android.os.SystemClock.elapsedRealtimeNanos();
        android.view.ViewConfiguration.getTapTimeout();
        android.os.SystemClock.elapsedRealtimeNanos();
        android.view.ViewConfiguration.getTouchSlop();
        android.view.View.MeasureSpec.getSize(0);
        android.os.Process.getElapsedCpuTime();
        android.view.View.MeasureSpec.getSize(0);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.view.KeyEvent.getDeadChar(0, 0);
        android.view.ViewConfiguration.getLongPressTimeout();
        android.os.Process.getThreadPriority(0);
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.View.MeasureSpec.getSize(0);
        android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        android.graphics.Color.green(0);
        android.view.MotionEvent.axisFromString("");
        android.text.TextUtils.getTrimmedLength("");
        android.os.SystemClock.uptimeMillis();
        android.view.ViewConfiguration.getTapTimeout();
        android.os.Process.myPid();
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.text.TextUtils.getOffsetAfter("", 0);
        android.view.ViewConfiguration.getScrollBarSize();
        android.view.MotionEvent.axisFromString("");
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.view.ViewConfiguration.getTouchSlop();
        android.os.SystemClock.uptimeMillis();
        android.text.TextUtils.getOffsetBefore("", 0);
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.view.ViewConfiguration.getScrollBarSize();
        android.view.KeyEvent.getModifierMetaStateMask();
        android.os.SystemClock.currentThreadTimeMillis();
        android.view.ViewConfiguration.getTouchSlop();
        android.os.SystemClock.elapsedRealtimeNanos();
        android.graphics.Color.rgb(0, 0, 0);
        android.view.ViewConfiguration.getEdgeSlop();
        android.os.SystemClock.currentThreadTimeMillis();
        android.view.ViewConfiguration.getJumpTapTimeout();
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        android.view.ViewConfiguration.getZoomControlsTimeout();
        android.view.ViewConfiguration.getFadingEdgeLength();
        android.os.Process.getElapsedCpuTime();
        android.os.SystemClock.elapsedRealtime();
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.graphics.Color.alpha(0);
        android.view.ViewConfiguration.getDoubleTapTimeout();
        android.view.ViewConfiguration.getScrollFriction();
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        android.widget.ExpandableListView.getPackedPositionGroup(0L);
        android.view.View.combineMeasuredStates(0, 0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.View.MeasureSpec.getSize(0);
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.view.ViewConfiguration.getJumpTapTimeout();
        android.text.TextUtils.indexOf("", "", 0);
        android.view.ViewConfiguration.getZoomControlsTimeout();
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.View.combineMeasuredStates(0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.view.KeyEvent.keyCodeFromString("");
        android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.graphics.Color.rgb(0, 0, 0);
        android.view.ViewConfiguration.getScrollFriction();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1096 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (5810 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(1098 - android.os.Process.getGidForName(""), (char) (android.graphics.Color.alpha(0) + 8826), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 12, objArr2);
        writeReplace = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern, ((java.lang.String) objArr2[0]).intern()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1096, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5810), 4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(1111 - android.graphics.Color.green(0), (char) (14950 - android.graphics.Color.alpha(0)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, objArr4);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1129, (char) (53645 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1130, (char) android.graphics.Color.green(0), 10 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
        DigitizedCardProfile = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern3, new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(((java.lang.String) objArr6[0]).intern().getBytes()))}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(android.view.View.combineMeasuredStates(0, 0) + 1129, (char) (53645 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), android.os.Process.getGidForName("") + 3, objArr7);
        java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a((doubleTapTimeout >> 16) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameEnd, (char) (android.view.View.resolveSize(0, 0) + 18488), android.text.TextUtils.getTrimmedLength("") + 5, objArr8);
        values = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern4, new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(((java.lang.String) objArr8[0]).intern().getBytes()))}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1146, (char) android.view.KeyEvent.keyCodeFromString(""), android.view.View.getDefaultSize(0, 0) + 2, objArr9);
        java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(102 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 59841), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, objArr10);
        AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern5, ((java.lang.String) objArr10[0]).intern()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(1146 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.View.getDefaultSize(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr11);
        java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(1148 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr12);
        valueOf = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern6, ((java.lang.String) objArr12[0]).intern()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        getProfileVersion = com.payair.hce.setExpiryTimestamp.DigitizedCardProfile;
        getAid = com.payair.hce.ProvisionResponseEncrypted.values;
        IccPrivateKeyCrtComponentsJson = com.payair.hce.DeleteCardResponseEncrypted.valueOf;
        RecordsJson = com.payair.hce.getCardProfile.DigitizedCardProfile;
        SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.setCardProfile.writeReplace;
        getCvrMaskAnd = com.payair.hce.getIsRedigitization.writeReplace;
        getGpoResponse = (getPaymentFci + 7) % 128;
    }

    static void DigitizedCardProfile() {
        char[] cArr = new char[1150];
        java.nio.ByteBuffer.wrap("\u000b)Èþ\u008c\u008b@]\u0004mØ7\u009dÏQ\u009d\u0015¡éz\u00ad\u0003bÙ&âúÅ¾@r\u001469\u000bÊÏ\u009c\u0083¬Gz\u001b\rØØ\u009c\u009eP±\u0014Gè\u0013¬&aõ%\u0087ùP½bq\t6Ò\níÎ±\u0082KF\u0016\u001a(ßú\u0093\u0081WZ+cï1¬Ã`\u0095$§øp¼\u001epY5ü\t\u0088Í]\u0081nE8\u001aÈÞ\u0096\u0092¡Ã¸\u0000\u0014D\u0012\u0088°Ìô\u0010¥UV\u0099\u0007Ý8!ée\u009aªKî|2-vÞº\u008fþ ÃQ\u0007\u0002K3\u008fàÓ\u0097\u0010FTt\u0098)Ü¯ \u008ad¸^\u009e\u009dGÙ5\u0015ì^é\u009d8Ù=\u0015ìW]\u0094\u008fÐ÷\u001c.^\u009f\u009dGÙ:\u0015ä·^t\u008e^\u009d\u009dLÙ;\u00886Kç\u000f\u0094ÃE\u0087r[#\u001eÐÒ\u0081\u0096¾jo.\u001cáÍ¥ú^\u0096\u009d8Ù;\u0015åQÚ\u008düÈp\u0004^@\u0011¼·øµ7`sZ¯tëö'Õc\u008f^\u007f\u009a$Öj\u0012ËN¸\u008diÉ^\u0005\u0002A\u0080½§ùå4Cp0¬èè£$¿co_T\u009b}×û\u0013©O\u0090\u008a>Æ6\u0002ã~Õº\u0086ùz5Tq\u0012\u00adÅé¯%\u009f`D\\J\u0098ïÔ¯\u0010\u0088O|\u008b.Ç`\u0003Å\u007f·ºcöT2\bn\u0086ªÜæ\u008d%}a/^\u0096\u009d8Ù;\u0015ëQÛ\u008d\u008bÈy\u0004,ß\u0018\u001c¶Xµ\u0094dÐU\f\u0006I÷\u0085ÐÁ\u0099==¥\u008cf\"\"!îóªÁv\u00923cÿ2»{GÜ\u0085NFà\u0002ãÎ0\u008a\u0003VS\u0013¡ßôgÒ¤|à\u007f,«h\u009f´Èñ==lyS\u0085\u0082Áñ\u000e J\u0017\u0096FÒµ\u001e\u0092ZËgO^\u0096\u009d8Ù;\u0015îQÛ\u008d\u008cÈy\u0004(@\u0017¼Æøµ7dsS¯\u0002ëñ' cù^~^\u0096\u009d8Ù;\u0015\u009fQÛ\u008d\u0088Èy\u0004(@\u0017¼ÇåØ&vbw®Óê\u00956Ås?¿d\"náÀ¥Åib-#ñw´\u0081xÐ<éÀ>\u0084MK\u009c\u000f«Óú\u0097\t[Xcÿ QäT(ðl²°æõ\u00109A}~\u0081¯ÅÜ\n\rN:\u0092kÖ\u0098\u001aÉ÷Ç4ipl¼Éø\u008a$Þa(\u00adyé@\u0015\u0097Qä\u009e5Ú\u0002\u0006SB \u008eñ^\u0096\u009d8Ù=\u0015äQÛ\u008d\u0088Èy\u0004(@\u0017¼Ä^\u0097\u009d;Ù=\u0015\u009fQÛ\u008d\u008aÈy\u0004(@\u0017¼Æøµ7dsS¯\u0002ëñ' c\u008f^~\u009a-Ö\u001c\u0012ËN¸\u008diÉ[\u0005\u0006A\u0080½¥ù\u0097^\u0097\u009d;Ù=\u0015\u009dQÛ\u008d\u008aÈy\u0004(@\u0017¼Æøµ7dsS¯\u0002ëñ' c\u008f^~\u009a-Ö\u001c\u0012ÊNÌ\u008diÉ[^\u0097\u009d:Ù=\u0015\u009fQÒ\u008d\u008bÈy\u0004Y@\u001e¼Ãøµ7asZ¯tëò'§c\u008f^z\u009a$Öj\u0012ÏNÉ\u008diÉP\u0005\u000fA\u0087½¥ù\u0096Y\u0096\u009a<Þ>\u0012éVÓ\u008aýÏx\u0003+G\u0016»Áÿ½0\u0013tR¨\u0000ìð §d\u0087Yz\u009d,Ñ\u0018\u0015ÏIÍ\u008ajÎ(\u0002\u0006Fõº\u00adþä3Bw0«éï¢#¾dnXU\u009c{Ðù\u0014¬H\u0098\u008dMÁ?\u0005\u0091y×½\u0080þr2\"v\u0019ª·î\u00ad\"\u009bgL[>\u009fãÓ\u00ad\u0017\u0089H|\u008c&À\u0015\u0004ÍxÃ½eñ&5\u0000ið\u00ad×áù\"\u007ff.Z\u001a\u009eÈÒ±\u0017\u001fKR\u008frÃõ\u0007¡L\u0003\u008f¡Ë¦\u0007pCB\u009f\u0010Úä\u0016¸R\u008f®]ê/%ü^\u009e\u009d<Ù5\u0015ì^\u009e\u009d?Ù5\u0015ì^\u009f\u009dOÙ<\u0015èQÛ\u008d\u008aÈy\u0004(@\u0017¼Æøµ7dsS¯\u0002ëñ' c\u008f^~\u009a-Ö\u001c\u0012ËNº\u008diÉX\u0005\u0007Aö½¥ù\u00944Cp2¬áèÐ$¿cn_+\u009bz^é\u009d8Ù=\u0015ìQÛ\u008d\u008aÈy\u0004(@\u0017¼Æøµ7d\u0097ªTz\u0010\bÜÙ\u0098îD·^\u009b\u009dOÙ=\u0015ì±¬r|6\u000fúÛ¾èb¹'Jë\u001a¯$Sõ\u0017\u0086ØW\u009c`@1\u0004ÂÈ\u0093\u008c¼±Mu\u001e9/ýø¡\u0089bZ&kê4®ÅR\u0096\u0016§Ûp\u009f\u0001CÒ\u0007ãË\u008c\u008c]°\u0018tIÞä\u001d2YF\u0095\u0097Ñ \rñH\u0002\u0084SÀl<½xÎ·\u001f^é\u009d8ÙK\u0015\u009aQ\u00ad\u008düÈ\u000f\u0004^@a¼°øÃ7\u0012^\u0098\u009dIÙ=\u0015\u0099QÓ\u008d\u0088Èy\u0004*@\u0016¼Ïø½7dsZ¯\u0006ëñ'¨c\u008e^~\u009a-Ö\u001e\u0012ËN¸\u008diÉX\u0005\u0005Aö½¥ù\u00954Cp0¬áèÑý\u001d>Ìz¸¶\u0018òV.\rkü§¯ã\u0092\u001fA[0\u0094áÐß\f\u0083Ht\u0084!À\nýó9¨u\u0098±Ní>.ìjÝ\u0004ÐÇ\u0001\u0083uOÑ\u000b\u009b×À\u00921^b\u001a^æ\u0087¢õm,)\u0012õN±¹}à9Ç\u0004>Àe\u008cUH\u0083\u0014ó×!\u0093\u0010_N\u001b¾çí£Ýn\u000b*yö©²\u0099Ú6\u0019ç]\u0093\u00917Õ}\t&L×\u0080\u0084Ä¸8\u001a|\u0013³Ê÷ô+¨o_£\u0006ç!ÚØ\u001e\u0083R³\u0096eÊ\u0015\tÇMö\u0081¨ÅX9\u000b};°íô\u009f(Ol\u007f^\u0099\u009d8Ù>\u0015åQÓ\u008d\u008eÈy\u0004]@\u0014¼Äø°7dsW¯\u0003ëô'©c\u008d^\u000b\u009a(Ö\u001f\u0012ÎN³\u008dlÉ[\u0005\u0005A\u0083½¡ù\u00904Gp6¬åèÖ$¼cn_^\u009b\r×\u008a\u0013¯O\u009b\u008aOÆE\u0002\u0090~Õº÷ùq5&q\u0017\u00adÁé®%\u009e`I\\J\u0098ëÔÝ\u0010øOx\u008b'Ç\u0016\u0003Å\u007f´ºcöR2\u0001nôªÞæ\u008e%|a,]\u0013\u0099ÍÕ¹\u0010iLW\u0088\u0007Äü\u0000Ò|\u0091»3÷13áoÏ«¼æk\"]\u001e\nZú\u0096\u00adÒî\u0011GM1\u0089\u0094ÅÔ\u0001\u0083|r¸!ô\u00100ÿl®¨\u009dçH#9\u001fè[Ù\u0097\u008bÒ\u007f\u000e!J\u0015\u0086ÅÂ³\u0001`}X¹võí1¯m\u008d¨}ä+ \u0018\u000e0Í\u0091\u0089\u0096EF\u0001zÝ'\u0098ÐTô\u0010½ìm¨\u0019gÍ#þÿª»]w\u00003$\u000e¢Ê\u0081\u0086¶Bg\u001e\u001aÝÅ\u0099òU¬\u0011*í\b©9dî \u009füL¸\u007ft\u00153Ç\u000f÷Ë¤\u0087#C\u0006\u001f1Úà\u0096ìR9.|ê^©Úeþ!¾ýh¹\u0006uD0à\fãÈB\u0084t@Q\u001fÑÛ\u008e\u0097¿Sl/\u001dêÊ¦ûb¨>]úw¶'uÕ1\u0085\rºÉd\u0085\u0010@À\u001cþØ®^î\u009dNÙ=\u0015ìQÛ\u008d\u008aÈy\u0004(@\u0017¼Âø·7fsS¯\u0001^î\u009dNÙ=\u0015ìQÛ\u008d\u008aÈy\u0004(@\u0017¼Âø´7dsR¯\u0002^\u009f\u009dNÙ=\u0015ìQÛ\u008d\u008aÈy\u0004(@\u0017¼Æøµ7dsS¯\u0002ëñ' c\u008f^~\u009a-Ö\u001c\u0012ËNº\u008diÉX\u0005\u0007Aö½¥ù\u00944Cp2¬áèÐ$¿cn_]\u009b\fM²\u008ecÊ\u0010\u0006ÁBö\u009e§ÛT\u0017\u0005S:¯ëë\u0098$I`~¼/øÜ4\u008dp¢MS\u0089\u0000Å1\u0001æ]\u0097\u009eDÚu\u0016*RÛ®\u0088ê¹'nc\u001f¿Ìûý^ë\u009d;Ù[\u0015\u0095Q¨\u008dÿÈ\u0016\u0004U@h¼´øÌ7\u0018s&¯më\u0091'Ùcñ\u0010ÒÓ\u0001\u0097s[¡\u001f\u0097ÃÄ^\u0096\u009d;Ù<\u0015éQÙ\u008d\u008aÈ}\u0004+@\u0016¼ÅøÃ7csP¯\u0003ëù'Ñcü^\f\u009a*Ö\u0015\u0012¹N³\u008diÉ*\u0005sAÿ½\u00adù\u009242pF¬ãèÙ=&þôH$\u008b\u008aÏ\u008c\u0003V|ì¿BûF7âs¡¯øê\n&$bl\u009eÍÚÏ\u0015\u001cdð§^ãZ/þk½·äò\u0016>8zp\u0086ÑÂÓ\r\u0000I<\u0095\u0012Ñ\u0094\u001dÃYéd\u0019\u008f\u0017LÃ^â\u009d\u001fÙ~\u0015¨Q\u008e\u008dÈÈ\n\u0004y@U¼\u0092\u0016ÓÕ#\u0091W]\u008d\u0019§^\u0097\u009dI^\u009f\u009dL".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1150);
        SdkCoreBusinessLogicModuleImpl = cArr;
        getCiacDecline = -2426573825704288898L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$b = 72;
    }
}
