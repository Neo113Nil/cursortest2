package com.payair.hce;

/* loaded from: classes4.dex */
public final class CardTrackConstructionDataJson implements com.payair.hce.getTrack2Equivalent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char[] AlternateContactlessPaymentDataJson;
    private static final java.lang.String[] valueOf;
    private static long writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i * 4;
        int i5 = b + 4;
        byte[] bArr = $$a;
        ?? r8 = 99 - (b2 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b3 = r8;
            i2 = 0;
            int i6 = i5;
            int i7 = i6;
            i3 = i5 + b3;
            i5 = i7;
            int i8 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            b3 = bArr[i8];
            int i9 = i3;
            i6 = i8;
            i5 = i9;
            int i72 = i6;
            i3 = i5 + b3;
            i5 = i72;
            int i82 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            int i822 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    @Override // com.payair.hce.getTrack2Equivalent
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, int i) throws java.io.IOException {
        getremotepaymentdata.writeReplace(valueOf[i]);
    }

    @Override // com.payair.hce.getTrack2Equivalent
    public final void DigitizedCardProfile(com.payair.hce.getRemotePaymentData getremotepaymentdata, int i) throws java.io.IOException {
        getremotepaymentdata.DigitizedCardProfile(valueOf[i]);
    }

    private static void a(char c, int i, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, (android.os.Process.myTid() >> 22) + 381, (char) (62387 - android.view.MotionEvent.axisFromString("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (byte) -1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3966 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.KeyEvent.normalizeMetaState(0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.getDeadChar(0, 0), 211 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.MeasureSpec.getSize(0), 212 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) (android.view.MotionEvent.axisFromString("") + 12606), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 11, android.graphics.Color.red(0), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((char) (1493 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 19 - android.graphics.Color.red(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, objArr2);
        java.lang.String str2 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((char) (63751 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, 30 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        java.lang.String str3 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((char) (42862 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 9 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        java.lang.String str4 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((char) (42903 - android.text.TextUtils.indexOf("", "")), 2 - android.view.KeyEvent.keyCodeFromString(""), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 60, objArr5);
        java.lang.String str5 = (java.lang.String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 58212), 4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 62 - (android.os.Process.myTid() >> 22), objArr6);
        java.lang.String str6 = (java.lang.String) objArr6[0];
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a((char) android.graphics.Color.alpha(0), 2 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 65 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr7);
        java.lang.String str7 = (java.lang.String) objArr7[0];
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a((char) (52893 - android.view.View.combineMeasuredStates(0, 0)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 68, objArr8);
        java.lang.String str8 = (java.lang.String) objArr8[0];
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 16 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 74 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
        java.lang.String str9 = (java.lang.String) objArr9[0];
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 23162), 34 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 89, objArr10);
        java.lang.String str10 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 3 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, objArr11);
        java.lang.String str11 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a((char) (3227 - android.view.View.getDefaultSize(0, 0)), android.view.View.MeasureSpec.getSize(0) + 10, 127 - android.graphics.Color.red(0), objArr12);
        java.lang.String str12 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a((char) android.text.TextUtils.indexOf("", "", 0), 23 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 136 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr13);
        java.lang.String str13 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((char) (24833 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 14 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myPid() >> 22) + 160, objArr14);
        java.lang.String str14 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 6496), android.text.TextUtils.getTrimmedLength("") + 17, 174 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr15);
        java.lang.String str15 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a((char) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 18, android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, objArr16);
        java.lang.String str16 = (java.lang.String) objArr16[0];
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a((char) (android.os.Process.myTid() >> 22), android.view.View.resolveSizeAndState(0, 0, 0) + 15, android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, objArr17);
        java.lang.String str17 = (java.lang.String) objArr17[0];
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29670), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, 224 - android.text.TextUtils.indexOf("", "", 0), objArr18);
        java.lang.String str18 = (java.lang.String) objArr18[0];
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41058), 11 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 228 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr19);
        java.lang.String str19 = (java.lang.String) objArr19[0];
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        a((char) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, 239 - android.view.View.resolveSize(0, 0), objArr20);
        java.lang.String str20 = (java.lang.String) objArr20[0];
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        a((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51710), 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 241 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr21);
        java.lang.String str21 = (java.lang.String) objArr21[0];
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        a((char) android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 255, objArr22);
        java.lang.String str22 = (java.lang.String) objArr22[0];
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        a((char) (27808 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), android.graphics.Color.blue(0) + 3, 270 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr23);
        java.lang.String str23 = (java.lang.String) objArr23[0];
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a((char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17771), 12 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, objArr24);
        java.lang.String str24 = (java.lang.String) objArr24[0];
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 9 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 283, objArr25);
        java.lang.String str25 = (java.lang.String) objArr25[0];
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        a((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 61530), 15 - android.graphics.Color.argb(0, 0, 0, 0), 293 - android.view.KeyEvent.keyCodeFromString(""), objArr26);
        java.lang.String str26 = (java.lang.String) objArr26[0];
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        a((char) android.graphics.Color.red(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, 308 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr27);
        java.lang.String str27 = (java.lang.String) objArr27[0];
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        a((char) (14459 - android.view.View.resolveSize(0, 0)), 2 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 315 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr28);
        java.lang.String str28 = (java.lang.String) objArr28[0];
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 45421), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24, 317 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr29);
        java.lang.String str29 = (java.lang.String) objArr29[0];
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        a((char) (android.view.MotionEvent.axisFromString("") + 1), android.view.View.getDefaultSize(0, 0) + 17, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.visa.cbp.getCertUsage.isReperso, objArr30);
        java.lang.String str30 = (java.lang.String) objArr30[0];
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a((char) (31802 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3 - android.graphics.Color.alpha(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 360, objArr31);
        java.lang.String str31 = (java.lang.String) objArr31[0];
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18821), 23 - android.graphics.Color.alpha(0), 363 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr32);
        java.lang.String str32 = (java.lang.String) objArr32[0];
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 5 - android.text.TextUtils.indexOf("", "", 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 385, objArr33);
        java.lang.String str33 = (java.lang.String) objArr33[0];
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50631), 16 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 390, objArr34);
        java.lang.String str34 = (java.lang.String) objArr34[0];
        java.lang.Object[] objArr35 = new java.lang.Object[1];
        a((char) (android.view.MotionEvent.axisFromString("") + 1), 17 - android.graphics.ImageFormat.getBitsPerPixel(0), 405 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr35);
        java.lang.String str35 = (java.lang.String) objArr35[0];
        java.lang.Object[] objArr36 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50777), 3 - android.view.View.combineMeasuredStates(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, objArr36);
        java.lang.String str36 = (java.lang.String) objArr36[0];
        java.lang.Object[] objArr37 = new java.lang.Object[1];
        a((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 7 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 428 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr37);
        java.lang.String str37 = (java.lang.String) objArr37[0];
        java.lang.Object[] objArr38 = new java.lang.Object[1];
        a((char) (34955 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 435, objArr38);
        java.lang.String str38 = (java.lang.String) objArr38[0];
        java.lang.Object[] objArr39 = new java.lang.Object[1];
        a((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 21105), 14 - android.os.Process.getGidForName(""), 446 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr39);
        java.lang.String str39 = (java.lang.String) objArr39[0];
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 461 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr40);
        java.lang.String str40 = (java.lang.String) objArr40[0];
        java.lang.Object[] objArr41 = new java.lang.Object[1];
        a((char) (9696 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 31 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 474 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr41);
        java.lang.String str41 = (java.lang.String) objArr41[0];
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30228), 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.Color.green(0) + 505, objArr42);
        java.lang.String str42 = (java.lang.String) objArr42[0];
        java.lang.Object[] objArr43 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.getCapsMode("", 0, 0) + 20867), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, 514 - android.view.View.MeasureSpec.getMode(0), objArr43);
        java.lang.String str43 = (java.lang.String) objArr43[0];
        java.lang.Object[] objArr44 = new java.lang.Object[1];
        a((char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57917), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, 524 - android.view.View.resolveSizeAndState(0, 0, 0), objArr44);
        java.lang.String str44 = (java.lang.String) objArr44[0];
        java.lang.Object[] objArr45 = new java.lang.Object[1];
        a((char) (41243 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), android.text.TextUtils.getOffsetBefore("", 0) + 14, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 530, objArr45);
        java.lang.String str45 = (java.lang.String) objArr45[0];
        java.lang.Object[] objArr46 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 30464), 10 - android.view.KeyEvent.getDeadChar(0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 545, objArr46);
        java.lang.String str46 = (java.lang.String) objArr46[0];
        java.lang.Object[] objArr47 = new java.lang.Object[1];
        a((char) android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, 556 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr47);
        java.lang.String str47 = (java.lang.String) objArr47[0];
        java.lang.Object[] objArr48 = new java.lang.Object[1];
        a((char) (33901 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.text.TextUtils.getOffsetAfter("", 0) + 6, 562 - android.view.View.resolveSize(0, 0), objArr48);
        java.lang.String str48 = (java.lang.String) objArr48[0];
        java.lang.Object[] objArr49 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - ',', 568 - (android.os.Process.myTid() >> 22), objArr49);
        java.lang.String str49 = (java.lang.String) objArr49[0];
        java.lang.Object[] objArr50 = new java.lang.Object[1];
        a((char) android.view.View.MeasureSpec.getSize(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 573, objArr50);
        java.lang.String str50 = (java.lang.String) objArr50[0];
        java.lang.Object[] objArr51 = new java.lang.Object[1];
        a((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, android.widget.ExpandableListView.getPackedPositionType(0L) + 575, objArr51);
        java.lang.String str51 = (java.lang.String) objArr51[0];
        java.lang.Object[] objArr52 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.getTrimmedLength("") + 41045), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, android.view.View.MeasureSpec.getSize(0) + 580, objArr52);
        java.lang.String str52 = (java.lang.String) objArr52[0];
        java.lang.Object[] objArr53 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 16460), 16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR, objArr53);
        java.lang.String str53 = (java.lang.String) objArr53[0];
        java.lang.Object[] objArr54 = new java.lang.Object[1];
        a((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46762), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, android.view.Gravity.getAbsoluteGravity(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, objArr54);
        java.lang.String str54 = (java.lang.String) objArr54[0];
        java.lang.Object[] objArr55 = new java.lang.Object[1];
        a((char) (33437 - android.graphics.ImageFormat.getBitsPerPixel(0)), 22 - (android.os.Process.myTid() >> 22), 613 - android.text.TextUtils.indexOf("", "", 0), objArr55);
        java.lang.String str55 = (java.lang.String) objArr55[0];
        java.lang.Object[] objArr56 = new java.lang.Object[1];
        a((char) (android.graphics.Color.red(0) + 32360), 9 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 635 - android.graphics.Color.green(0), objArr56);
        java.lang.String str56 = (java.lang.String) objArr56[0];
        java.lang.Object[] objArr57 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12817), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, android.graphics.Color.alpha(0) + 644, objArr57);
        java.lang.String str57 = (java.lang.String) objArr57[0];
        java.lang.Object[] objArr58 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 19, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 649, objArr58);
        java.lang.String str58 = (java.lang.String) objArr58[0];
        java.lang.Object[] objArr59 = new java.lang.Object[1];
        a((char) (android.os.Process.myPid() >> 22), 5 - android.view.MotionEvent.axisFromString(""), 667 - android.text.TextUtils.indexOf("", "", 0, 0), objArr59);
        java.lang.String str59 = (java.lang.String) objArr59[0];
        java.lang.Object[] objArr60 = new java.lang.Object[1];
        a((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 30134), 11 - android.view.View.MeasureSpec.getMode(0), 673 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr60);
        java.lang.String str60 = (java.lang.String) objArr60[0];
        java.lang.Object[] objArr61 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 26833), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, 684 - android.text.TextUtils.getTrimmedLength(""), objArr61);
        java.lang.String str61 = (java.lang.String) objArr61[0];
        java.lang.Object[] objArr62 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), ';' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 695 - android.text.TextUtils.getOffsetAfter("", 0), objArr62);
        java.lang.String str62 = (java.lang.String) objArr62[0];
        java.lang.Object[] objArr63 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 706 - android.graphics.Color.green(0), objArr63);
        java.lang.String str63 = (java.lang.String) objArr63[0];
        java.lang.Object[] objArr64 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, 720 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr64);
        java.lang.String str64 = (java.lang.String) objArr64[0];
        java.lang.Object[] objArr65 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.getTrimmedLength("") + 49331), 23 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 724 - android.os.Process.getGidForName(""), objArr65);
        java.lang.String str65 = (java.lang.String) objArr65[0];
        java.lang.Object[] objArr66 = new java.lang.Object[1];
        a((char) (15118 - android.view.View.combineMeasuredStates(0, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 25, android.view.View.MeasureSpec.getMode(0) + 748, objArr66);
        java.lang.String str66 = (java.lang.String) objArr66[0];
        java.lang.Object[] objArr67 = new java.lang.Object[1];
        a((char) (64635 - android.graphics.Color.blue(0)), 13 - (android.os.Process.myPid() >> 22), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 773, objArr67);
        java.lang.String str67 = (java.lang.String) objArr67[0];
        java.lang.Object[] objArr68 = new java.lang.Object[1];
        a((char) android.view.View.resolveSizeAndState(0, 0, 0), 8 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 786 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr68);
        java.lang.String str68 = (java.lang.String) objArr68[0];
        java.lang.Object[] objArr69 = new java.lang.Object[1];
        a((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 12 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.resolveSize(0, 0) + 794, objArr69);
        java.lang.String str69 = (java.lang.String) objArr69[0];
        java.lang.Object[] objArr70 = new java.lang.Object[1];
        a((char) (9715 - (android.os.Process.myPid() >> 22)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED, objArr70);
        java.lang.String str70 = (java.lang.String) objArr70[0];
        java.lang.Object[] objArr71 = new java.lang.Object[1];
        a((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 815, objArr71);
        java.lang.String str71 = (java.lang.String) objArr71[0];
        java.lang.Object[] objArr72 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42064), 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 830 - (android.os.Process.myPid() >> 22), objArr72);
        java.lang.String str72 = (java.lang.String) objArr72[0];
        java.lang.Object[] objArr73 = new java.lang.Object[1];
        a((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 16 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 843 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr73);
        java.lang.String str73 = (java.lang.String) objArr73[0];
        java.lang.Object[] objArr74 = new java.lang.Object[1];
        a((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 858 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr74);
        java.lang.String str74 = (java.lang.String) objArr74[0];
        java.lang.Object[] objArr75 = new java.lang.Object[1];
        a((char) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 9, android.view.View.getDefaultSize(0, 0) + 871, objArr75);
        java.lang.String str75 = (java.lang.String) objArr75[0];
        java.lang.Object[] objArr76 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 880, objArr76);
        java.lang.String str76 = (java.lang.String) objArr76[0];
        java.lang.Object[] objArr77 = new java.lang.Object[1];
        a((char) (android.graphics.Color.alpha(0) + 64815), 10 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 892, objArr77);
        java.lang.String str77 = (java.lang.String) objArr77[0];
        java.lang.Object[] objArr78 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 23 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 902 - android.view.View.getDefaultSize(0, 0), objArr78);
        java.lang.String str78 = (java.lang.String) objArr78[0];
        java.lang.Object[] objArr79 = new java.lang.Object[1];
        a((char) (android.graphics.Color.red(0) + 56719), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', 926 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr79);
        java.lang.String str79 = (java.lang.String) objArr79[0];
        java.lang.Object[] objArr80 = new java.lang.Object[1];
        a((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - android.view.View.MeasureSpec.getMode(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 927, objArr80);
        java.lang.String str80 = (java.lang.String) objArr80[0];
        java.lang.Object[] objArr81 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 939 - android.os.Process.getGidForName(""), objArr81);
        java.lang.String str81 = (java.lang.String) objArr81[0];
        java.lang.Object[] objArr82 = new java.lang.Object[1];
        a((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 4 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 941 - (android.os.Process.myTid() >> 22), objArr82);
        java.lang.String str82 = (java.lang.String) objArr82[0];
        java.lang.Object[] objArr83 = new java.lang.Object[1];
        a((char) android.text.TextUtils.indexOf("", "", 0, 0), 21 - android.text.TextUtils.indexOf("", "", 0, 0), 944 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr83);
        java.lang.String str83 = (java.lang.String) objArr83[0];
        java.lang.Object[] objArr84 = new java.lang.Object[1];
        a((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 15 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 966 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr84);
        java.lang.String str84 = (java.lang.String) objArr84[0];
        java.lang.Object[] objArr85 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 60382), android.view.View.resolveSize(0, 0) + 22, android.view.Gravity.getAbsoluteGravity(0, 0) + 981, objArr85);
        java.lang.String str85 = (java.lang.String) objArr85[0];
        java.lang.Object[] objArr86 = new java.lang.Object[1];
        a((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 7 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1003 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr86);
        java.lang.String str86 = (java.lang.String) objArr86[0];
        java.lang.Object[] objArr87 = new java.lang.Object[1];
        a((char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getMode(0) + 1, android.text.TextUtils.getCapsMode("", 0, 0) + 1011, objArr87);
        java.lang.String str87 = (java.lang.String) objArr87[0];
        java.lang.Object[] objArr88 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", "", 0) + 28676), android.view.KeyEvent.normalizeMetaState(0) + 11, android.view.View.MeasureSpec.getMode(0) + 1012, objArr88);
        java.lang.String str88 = (java.lang.String) objArr88[0];
        java.lang.Object[] objArr89 = new java.lang.Object[1];
        a((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 25982), 2 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.KeyEvent.getDeadChar(0, 0) + 1023, objArr89);
        java.lang.String str89 = (java.lang.String) objArr89[0];
        java.lang.Object[] objArr90 = new java.lang.Object[1];
        a((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, 1026 - android.graphics.Color.green(0), objArr90);
        java.lang.String str90 = (java.lang.String) objArr90[0];
        java.lang.Object[] objArr91 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 14313), 11 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1048 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr91);
        java.lang.String str91 = (java.lang.String) objArr91[0];
        java.lang.Object[] objArr92 = new java.lang.Object[1];
        a((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.getSize(0) + 22, android.text.TextUtils.getOffsetAfter("", 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, objArr92);
        java.lang.String str92 = (java.lang.String) objArr92[0];
        java.lang.Object[] objArr93 = new java.lang.Object[1];
        a((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7517), android.view.MotionEvent.axisFromString("") + 18, android.graphics.Color.alpha(0) + 1080, objArr93);
        valueOf = new java.lang.String[]{str80, str7, str64, str50, str4, str61, (java.lang.String) objArr93[0], str20, str76, str43, str28, str34, str42, str63, str8, str71, str27, str89, str23, str90, str88, str40, str31, str78, str44, str60, str70, str77, str32, str59, str13, str85, str14, str16, str62, str82, str75, str69, str, str57, str17, str56, str79, str68, str30, str11, str26, str2, str37, str10, str3, str12, str35, str92, str52, str65, str6, str38, str86, str47, str73, str33, str81, str66, str39, str22, str5, str25, str74, str87, str15, str72, str46, str29, str45, str53, str91, str19, str54, str67, str58, str48, str51, str18, str24, str49, str36, str9, str83, str41, str21, str84, str55};
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30};
        $$b = 117;
    }

    static void valueOf() {
        char[] cArr = new char[1097];
        java.nio.ByteBuffer.wrap("oñPc\u0010ÀÑF\u0091\u0082R0\u0012\u009dÓ\u0004\u0093{Sî\u0014W[\u001ad\u0088$+å\u00ad¥QfÆ&uçí§\u009cg\u001b \u008fà(¡Õa@\"ýâh¢\rc\u0086#+§Ø\u0098YØñ\u0019uY\u008d\u009a\u0016Ú¼\u001b\u0019[X\u009bÈÜX\u001cê]\u0007\u009d\u008eÞ!\u001e¼^Í\u009fJßÁ\u0010|ù\u0082Æ\u0003\u0086¸G!\u0007ÕÄ^\u0084þEz\u0005\u0004Å\u009aù\\ÆØ½¿\u0082\"Â\u009b\u0003\u001e^ËaN\u0090p¯ãï\\.Én;\u00ad¦^Øa^!äàz \u009ac\u000f#\u0086â1¢[bÚ%aåë¤:d\u00ad'\u0006\u0004¦;4{\u0099º\u0012úó9eyÂ¸Cø28\u008f\u007f\u0015¿\u0085þF>ô}_½Ðý·<2|\u0093³-óó2\u007frõ±Tñ\"1\u0085p\u0019°\u008b÷f7évX¶Ãö¸52u\u0085^ÎaK!ìRwmö-MìÔ¬ o«/\u000bî\u008e®ãnp^ÆaL!Úàl ®c\u0016#¿â\u0012¢NbÌ%dåö¤\u0001d\u0098'\u001cçª§ßfO&àém©\u009bh\u001a(«?í\u0000l@×\u0081NÁº\u00021B\u0091\u0083\rÃg\u0003ùD@\u0084ÁÅ'\u0005ºG\u0080x\u00018¾ù\u0013¹ÕzQ:åûe»\u001e{\u0083<5ü\u008e½E}Í>rþå¾\u0082^ÌaP!áày \u0086c\u001b#ªâ1¢[bÖ%nåó¤\u0006d\u008b'6ç\u0094§ÊfF^ßaV!áàV \u0099c<#¹â<¢\u001cbë%}åþ¤\fd\u0094'}-9\u0012¸R\u0007þ§Á0\u0081\u009a@\u001b\u0000éÃl\u0083ÇBJ\u00027Â\u0095\u0085\u000bE\u0087^ßa^!ý\u0094ó«tëÂ*^j³©5é¯(\u0004hl¨óïD/Ã^ÊaQ!ìàm \u0096c\u000f#»â:¢Kbö%låü¤$d\u009a'62E\rÈM{\u001b¥$7d\u0087¥\u001båñ&zfÐ§`ç='¤`\u0001^ÌaP!âàr \u0080c\u0011#\u008bâ>¢[bÞ®\u0092\u0091\u000fÑ±\u0010/PÂ\u0093OÓì\u0012cR\u0012\u0092¥Õ7\u0015´TR\u0094ï×r^ÙaZ!ýàl \u0086c\u0010#¡f\u009dY\u0012ï°Ð3\u0090\u0095Q&\u0011ðÒs\u0092ÌSA\u0013#Ó±\u0094\u0016T\u009b\u0015mÕü\u0096aVÀ\u0016§×6\u0097\u0087X\u001c\u0018öÙ{\u0099ÃZ^\u001a1^ËaL!ýào ºc\u0012#«â\f¢JbÌ%|åö¤\u0000d\u0091'\u0004çº§Ö\"ü\u001da]Û\u0017@(Êh]©ëé\b*\u0097j:«¸ëÊ+Mlà¬ví\u0087-0n\u00ad®\u000bîL/Èo| ðà\u001b!\u009ca-^ßa|!ùà| Ü\u009b\u0013¤\u0085ä&%´eL¦\u0085æB'æg\u0092§\u001eà± 6aË¡Râé\"c^ÎaJ!ûàw \u008ac\u0011#»â6¢LbÞ%{åö¤\u0000d\u0091'\nç±§ÚfR\u0098\u0097§\u000fç²^ýaz!ËàV ½c:#\u008câ\u000bÖ`éá©ZhÃ(7ë¼«\u001cj\u0080*êêt\u00adÍ\f\u00ad3-s\u0096²\u000bòó1kqÿ°@ð:0\u008aw\u0011·\u0083ö\u007f6çuP^ÆaL!Ìàp \u0081c\u000b#®â<¢[bÓ%jåì¤\u001c{\u0011D\u008c\u0004$Å¥\u0085BFÎ\u0006qÇô\u0087\u0095G#\u0000¿À.\u0081ÄAA\u0002óÂt\u0082\u001cC\u0085\u0003#Ì³\u008c`MÁ\riÎí\u008e\u0095N\u000e\u000f¤Ï\u0004\u0088ÑHT\tñ(Ü\u0017FWû\u0096|Ö\u0095\u0015\u001fU¨\u0094\u0003Ô^\u000f\\0Ýpu±ññ\t2\u0092r8³\u009aóÏ3U¼à\u0083gÃÑ\u0002MB \u0081&Á\u0081ÿÙÀa\u0080úAg\u0001\u0086Â\u001d\u0082¤C0\u0003QÃÀ\u0084PDå\u0005\u0000Å\u0085)É\u0016JVá\u0097{×\u0086\u0014\u0011T¨\u0095\u000fÕN\u0015Ñ^ßaO!üàz ©c\u001c#¦Ú«å1¥\u0081d9$ççy^ÄaZ!öàl^ÎaV!ÿ^ÄaZ!öàV \u008bþ\u0099Á\u001c\u0081·@\u0007\u0000ÕÃN\u0083ÿBf\u001e\u0087!\u0000a± #àî#WcÐ¢vâ\u0010\"\u0080e*¥¼äM$øgf§êèG×Æ\u0097}Vä\u0016\u0010Õ\u009b\u0095;T¿\u0014ÀÜEãÓ£pbâ\"\u001aáÐ¡\u0012`® ßàR§ågs&\u0084æ\u0002¥¥e(%^äÏ¤Ukà+\u0005ê\u0080 \u0084\u001f8_\u008a\u009e\u0007Þæ\u001dy]Î\u009cXÜ)lÚSN\u0013ðÒD\u0092\u0099^ÆaL!Ûàm \u008ec\u0011#¼â6¢[bì%zåï¤\u001fd\u0090'=ç«§Êf[^ßaj!áà^ \u009bc\u001c+i\u0014èTZ\u0095ÂÕ8\u0016®V\u001c\u0097§×ø\u0017dPÜ6\u000e\t\u009cI1\u0088ªÈK\u000bÍKj\u008aÚÊ\u0087\n\u001eM»^ÝaZ!ìàp \u009dc\u001b#\u0099â>¢CbÊ%j^ÊaG!ÿàv \u009dc\u001e#»â6¢@bÑ%Kåþ¤\u001bd\u009a^ÄaZ!äàV \u008b\u009e\u007f¡ãáR Ø`=£¯ã\b\"\u0080bù¢\u007fåÏ%ad¸¤\u001fç\u0099'\u001fgo¦åæS)Âi\u0017¨©è\u0005eâZc\u001aØÛA\u009bµX>\u0018\u009eÙ\u0002\u0099iYð\u001eSÞÔ\u009f%_®\u001c\u0011Ü\u0083\u009cä]w\u001dÄÒC\u0092¤S?\u0013\u0082Ð\u0014\u0090r¢¡\u009d)Ý\u0090\u001c#\\ñ\u009fjßÑ\u001eV^5\u009e°Ù\u001d\u0019\u008bXz^ËaL!ýào «c\u001e#»â>^ÈaO!ààM \u008ac\f#¿â0¢AbÌ%j{)D¯\u0004\u001dÅ\u008a\u0085JFé\u0006NÇß\u0087µG#\u0000\u0092^ÌaS!ààl \u008ac6#¡â+¢JbÑ%{åÊ¤=d¶ú\u009aÅ\u0001\u0085¼D=\u0004ÆÇ_\u0087ëFj\u0006\u001bÆ¤\u0081:A¶^Âa\\!çàv \u009fc<#®â-¢Kbï%}åð¤\td\u0096'#çº^Øa]!ìàT \u008ac\u0006#\u0099â:¢]bÌ%fåð¤\u0001^ÛaM!îà| \u0084c;#®â+¢N^Ìa^!ýà{ ¿c\u0010#¼â6¢[bÖ%`åñ£ã\u009cfÜÒ\u001d}]¡\u009e#Þ\u008b\u001f1_n\u009fô^ÌaP!áàk \u008ec\u001c#»â3¢JbÌ%|åÊ¤\u0002d\u009b'\u001cçº§ÜfL&æép©\u0081h4(ªë&\u0083P^ËaZ!ùàv \u008cc\u001a#\u009dâ0¢@bË%Dåú¤\u0016^Þ^Áa~!ûà|^ÆaL!üàj \u008ac\r#\u008eâ/¢_bÓ%fåü¤\u000ed\u008b'&ç°§Áf{&îék©\u008e^Ìa^!ýà{ ¬c\u0010#ºâ1¢[bÍ%våÜ¤\u0000d\u009b'*µ\u0011\u008a\u008dÊ<\u000b¶KS\u0088ÁÈf\tîI\u0097\u0089\u0011Î¡\u000e\u0012OÓ\u008f[Ìÿ\fgL\u001c\u008d\u0096Í\u0016\u0002£BF\u0083Ã^Ía^!üàz ¿c\u001e#»â7^Ú.È\u0011RQê\u0090xÐ¯\u0013\u001eS¨\u00927ÒB\u0012ÕUn;¢\u0004'D\u0098^ÛaM!îà| \u0084cM#\u008câ0¢AbÌ%{åí¤\u001ad\u009c';ç¶§ÀfQ&Ëé~©\u009bh\u001ei\u0004V\u0085\u0016>×§\u0097STØ\u0014xÕü\u0095\u0082U\u000e^Ìa[!ààs Þc-#ªâ3¢NbË%jåû¤+d\u009e';ç¾§ãfZ&áéx©\u009bh\u0017C\u0086|\u0000<½ý-½Ô~U>Ãÿd¿\u001d\u007f\u00808%ø¤¹Uyå:púõº\u0090".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1097);
        AlternateContactlessPaymentDataJson = cArr;
        writeReplace = 6934800920367030591L;
    }
}
