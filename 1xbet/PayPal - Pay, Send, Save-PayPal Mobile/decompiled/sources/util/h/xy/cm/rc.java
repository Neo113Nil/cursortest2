package util.h.xy.cm;

/* loaded from: classes18.dex */
public final class rc extends util.h.xy.du.mb {
    private static long Camera2StreamConfigurationMap = 0;
    private static java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static java.util.Hashtable getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static java.util.Hashtable getOutputFormats;
    private static java.util.Hashtable getOutputMinFrameDuration;
    private static char[] getOutputSizeshNQ4ISI;
    private static java.util.Set getOutputStallDuration;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 125) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 49) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        getOutputMinFrameDuration = new java.util.Hashtable();
        getOutputFormats = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
        getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        getOutputStallDuration = new java.util.HashSet();
        java.util.Hashtable hashtable = getOutputMinFrameDuration;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(19 - android.graphics.ImageFormat.getBitsPerPixel(0), 165 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(19 - android.graphics.ImageFormat.getBitsPerPixel(0), 185 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (161 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr2);
        hashtable.put(intern, new util.h.xy.dh.i(((java.lang.String) objArr2[0]).intern()));
        java.util.Hashtable hashtable2 = getOutputMinFrameDuration;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 11, 205 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-16777196) - android.graphics.Color.rgb(0, 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 185, (char) (160 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4);
            hashtable2.put(intern2, new util.h.xy.dh.i(((java.lang.String) objArr4[0]).intern()));
            java.util.Hashtable hashtable3 = getOutputMinFrameDuration;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20, 216 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 38158), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 20, 236 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (54399 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr6);
            hashtable3.put(intern3, new util.h.xy.dh.i(((java.lang.String) objArr6[0]).intern()));
            java.util.Hashtable hashtable4 = getOutputMinFrameDuration;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 11, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 255, (char) android.view.View.combineMeasuredStates(0, 0), objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 20, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, (char) (54448 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr8);
            hashtable4.put(intern4, new util.h.xy.dh.i(((java.lang.String) objArr8[0]).intern()));
            java.util.Hashtable hashtable5 = getOutputMinFrameDuration;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 264 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 53141), objArr9);
            java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(21 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 235 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (54400 - android.graphics.Color.argb(0, 0, 0, 0)), objArr10);
            hashtable5.put(intern5, new util.h.xy.dh.i(((java.lang.String) objArr10[0]).intern()));
            java.util.Hashtable hashtable6 = getOutputMinFrameDuration;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(21 - android.view.View.MeasureSpec.getMode(0), 275 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 19725), objArr11);
            java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 21, 296 - android.text.TextUtils.indexOf("", "", 0), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr12);
            hashtable6.put(intern6, new util.h.xy.dh.i(((java.lang.String) objArr12[0]).intern()));
            java.util.Hashtable hashtable7 = getOutputMinFrameDuration;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 316 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr13);
            java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 20, 296 - android.graphics.Color.red(0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr14);
            hashtable7.put(intern7, new util.h.xy.dh.i(((java.lang.String) objArr14[0]).intern()));
            java.util.Hashtable hashtable8 = getOutputMinFrameDuration;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 328 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (35442 - android.graphics.Color.blue(0)), objArr15);
            hashtable8.put(((java.lang.String) objArr15[0]).intern(), util.h.xy.du.ra.f1609);
            java.util.Hashtable hashtable9 = getOutputMinFrameDuration;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 13, 351 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString("") + 60014), objArr16);
            hashtable9.put(((java.lang.String) objArr16[0]).intern(), util.h.xy.du.ra.f1609);
            java.util.Hashtable hashtable10 = getOutputMinFrameDuration;
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 23, android.view.View.combineMeasuredStates(0, 0) + 363, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr17);
            hashtable10.put(((java.lang.String) objArr17[0]).intern(), util.h.xy.du.ra.f1602);
            java.util.Hashtable hashtable11 = getOutputMinFrameDuration;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 387, (char) (13112 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr18);
            hashtable11.put(((java.lang.String) objArr18[0]).intern(), util.h.xy.du.ra.f1602);
            java.util.Hashtable hashtable12 = getOutputMinFrameDuration;
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(23 - android.widget.ExpandableListView.getPackedPositionType(0L), android.view.View.getDefaultSize(0, 0) + 399, (char) (517 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr19);
            hashtable12.put(((java.lang.String) objArr19[0]).intern(), util.h.xy.du.ra.f1608);
            java.util.Hashtable hashtable13 = getOutputMinFrameDuration;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 422, (char) android.graphics.Color.alpha(0), objArr20);
            hashtable13.put(((java.lang.String) objArr20[0]).intern(), util.h.xy.du.ra.f1608);
            java.util.Hashtable hashtable14 = getOutputMinFrameDuration;
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 23, android.view.Gravity.getAbsoluteGravity(0, 0) + 435, (char) android.graphics.Color.green(0), objArr21);
            hashtable14.put(((java.lang.String) objArr21[0]).intern(), util.h.xy.du.ra.f1612);
            java.util.Hashtable hashtable15 = getOutputMinFrameDuration;
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 458, (char) (android.view.View.resolveSize(0, 0) + 52567), objArr22);
            hashtable15.put(((java.lang.String) objArr22[0]).intern(), util.h.xy.du.ra.f1612);
            java.util.Hashtable hashtable16 = getOutputMinFrameDuration;
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 471 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 12522), objArr23);
            hashtable16.put(((java.lang.String) objArr23[0]).intern(), util.h.xy.du.ra.f1603);
            java.util.Hashtable hashtable17 = getOutputMinFrameDuration;
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(20 - android.text.TextUtils.getCapsMode("", 0, 0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 489, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 5914), objArr24);
            hashtable17.put(((java.lang.String) objArr24[0]).intern(), util.h.xy.du.ra.f1603);
            java.util.Hashtable hashtable18 = getOutputMinFrameDuration;
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 509, (char) (40314 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr25);
            hashtable18.put(((java.lang.String) objArr25[0]).intern(), util.h.xy.du.ra.f1603);
            java.util.Hashtable hashtable19 = getOutputMinFrameDuration;
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 529, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr26);
            hashtable19.put(((java.lang.String) objArr26[0]).intern(), util.h.xy.du.ra.f1603);
            java.util.Hashtable hashtable20 = getOutputMinFrameDuration;
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19, 549 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr27);
            hashtable20.put(((java.lang.String) objArr27[0]).intern(), util.h.xy.du.ra.f1603);
            java.util.Hashtable hashtable21 = getOutputMinFrameDuration;
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, 569 - android.view.View.combineMeasuredStates(0, 0), (char) (44749 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr28);
            java.lang.String intern8 = ((java.lang.String) objArr28[0]).intern();
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(20 - android.view.KeyEvent.normalizeMetaState(0), 296 - android.graphics.Color.red(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr29);
            hashtable21.put(intern8, new util.h.xy.dh.i(((java.lang.String) objArr29[0]).intern()));
            java.util.Hashtable hashtable22 = getOutputMinFrameDuration;
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 26, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 581, (char) (android.view.KeyEvent.normalizeMetaState(0) + 37200), objArr30);
            hashtable22.put(((java.lang.String) objArr30[0]).intern(), util.h.xy.dx.a.f1805);
            java.util.Hashtable hashtable23 = getOutputMinFrameDuration;
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, 606 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (29372 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr31);
            hashtable23.put(((java.lang.String) objArr31[0]).intern(), util.h.xy.dx.a.f1805);
            java.util.Hashtable hashtable24 = getOutputMinFrameDuration;
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) + 26, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_NOT_FOUND, (char) (23971 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr32);
            hashtable24.put(((java.lang.String) objArr32[0]).intern(), util.h.xy.dx.a.f1793);
            java.util.Hashtable hashtable25 = getOutputMinFrameDuration;
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - android.graphics.Color.blue(0), 647 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 36490), objArr33);
            hashtable25.put(((java.lang.String) objArr33[0]).intern(), util.h.xy.dx.a.f1793);
            java.util.Hashtable hashtable26 = getOutputMinFrameDuration;
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(26 - android.graphics.Color.green(0), 664 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.text.TextUtils.indexOf("", "") + 38161), objArr34);
            hashtable26.put(((java.lang.String) objArr34[0]).intern(), util.h.xy.dx.a.f1792);
            java.util.Hashtable hashtable27 = getOutputMinFrameDuration;
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 690, (char) android.view.View.combineMeasuredStates(0, 0), objArr35);
            hashtable27.put(((java.lang.String) objArr35[0]).intern(), util.h.xy.dx.a.f1792);
            java.util.Hashtable hashtable28 = getOutputMinFrameDuration;
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr36);
            java.lang.String intern9 = ((java.lang.String) objArr36[0]).intern();
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, 717 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.graphics.Color.red(0) + 59121), objArr37);
            hashtable28.put(intern9, new util.h.xy.dh.i(((java.lang.String) objArr37[0]).intern()));
            java.util.Hashtable hashtable29 = getOutputMinFrameDuration;
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 11, 734 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 49725), objArr38);
            java.lang.String intern10 = ((java.lang.String) objArr38[0]).intern();
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(18 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 718 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59121), objArr39);
            hashtable29.put(intern10, new util.h.xy.dh.i(((java.lang.String) objArr39[0]).intern()));
            java.util.Hashtable hashtable30 = getOutputMinFrameDuration;
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 745 - android.graphics.Color.red(0), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 36445), objArr40);
            hashtable30.put(((java.lang.String) objArr40[0]).intern(), util.h.xy.dq.mb.f1505);
            java.util.Hashtable hashtable31 = getOutputMinFrameDuration;
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 758, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 35518), objArr41);
            hashtable31.put(((java.lang.String) objArr41[0]).intern(), util.h.xy.dq.mb.f1493);
            java.util.Hashtable hashtable32 = getOutputMinFrameDuration;
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 771 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50436), objArr42);
            hashtable32.put(((java.lang.String) objArr42[0]).intern(), util.h.xy.dq.mb.f1491);
            java.util.Hashtable hashtable33 = getOutputMinFrameDuration;
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 13, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 784, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 26360), objArr43);
            hashtable33.put(((java.lang.String) objArr43[0]).intern(), util.h.xy.dq.mb.f1494);
            java.util.Hashtable hashtable34 = getOutputMinFrameDuration;
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 13, 797 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr44);
            hashtable34.put(((java.lang.String) objArr44[0]).intern(), util.h.xy.eb.c.f1980);
            java.util.Hashtable hashtable35 = getOutputMinFrameDuration;
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 810 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr45);
            hashtable35.put(((java.lang.String) objArr45[0]).intern(), util.h.xy.eb.c.f1983);
            java.util.Hashtable hashtable36 = getOutputMinFrameDuration;
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 825 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr46);
            hashtable36.put(((java.lang.String) objArr46[0]).intern(), util.h.xy.eb.c.f1987);
            java.util.Hashtable hashtable37 = getOutputMinFrameDuration;
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 840 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr47);
            hashtable37.put(((java.lang.String) objArr47[0]).intern(), util.h.xy.eb.c.f1988);
            java.util.Hashtable hashtable38 = getOutputMinFrameDuration;
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, 855 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (46444 - android.view.View.MeasureSpec.getMode(0)), objArr48);
            hashtable38.put(((java.lang.String) objArr48[0]).intern(), util.h.xy.eb.c.f2010);
            java.util.Hashtable hashtable39 = getOutputMinFrameDuration;
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 869 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr49);
            hashtable39.put(((java.lang.String) objArr49[0]).intern(), util.h.xy.eb.c.f1980);
            java.util.Hashtable hashtable40 = getOutputMinFrameDuration;
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getSize(0) + 20, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 884, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 27232), objArr50);
            hashtable40.put(((java.lang.String) objArr50[0]).intern(), util.h.xy.dg.ma.f1188);
            java.util.Hashtable hashtable41 = getOutputMinFrameDuration;
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 20, android.text.TextUtils.indexOf("", "", 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16767), objArr51);
            hashtable41.put(((java.lang.String) objArr51[0]).intern(), util.h.xy.dg.ma.f1188);
            java.util.Hashtable hashtable42 = getOutputMinFrameDuration;
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(22 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.MeasureSpec.getSize(0) + 923, (char) (10668 - android.graphics.Color.alpha(0)), objArr52);
            hashtable42.put(((java.lang.String) objArr52[0]).intern(), util.h.xy.dg.ma.f1182);
            java.util.Hashtable hashtable43 = getOutputMinFrameDuration;
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 944, (char) (47393 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr53);
            hashtable43.put(((java.lang.String) objArr53[0]).intern(), util.h.xy.dg.ma.f1182);
            java.util.Hashtable hashtable44 = getOutputMinFrameDuration;
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(26 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 973, (char) android.view.View.getDefaultSize(0, 0), objArr54);
            hashtable44.put(((java.lang.String) objArr54[0]).intern(), util.h.xy.dg.ma.f1182);
            java.util.Hashtable hashtable45 = getHighSpeedVideoFpsRangesFor;
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20, 296 - android.view.View.MeasureSpec.getSize(0), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr55);
            util.h.xy.dh.i iVar = new util.h.xy.dh.i(((java.lang.String) objArr55[0]).intern());
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.view.View.resolveSize(0, 0), 316 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr56);
            hashtable45.put(iVar, ((java.lang.String) objArr56[0]).intern());
            java.util.Hashtable hashtable46 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar2 = util.h.xy.du.ra.f1609;
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 13, 350 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (60014 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr57);
            hashtable46.put(iVar2, ((java.lang.String) objArr57[0]).intern());
            java.util.Hashtable hashtable47 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar3 = util.h.xy.du.ra.f1602;
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 13, android.graphics.Color.blue(0) + 386, (char) (13113 - android.view.KeyEvent.getDeadChar(0, 0)), objArr58);
            hashtable47.put(iVar3, ((java.lang.String) objArr58[0]).intern());
            java.util.Hashtable hashtable48 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar4 = util.h.xy.du.ra.f1608;
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 13, 422 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr59);
            hashtable48.put(iVar4, ((java.lang.String) objArr59[0]).intern());
            java.util.Hashtable hashtable49 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar5 = util.h.xy.du.ra.f1612;
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 458, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52567), objArr60);
            hashtable49.put(iVar5, ((java.lang.String) objArr60[0]).intern());
            java.util.Hashtable hashtable50 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar6 = util.h.xy.dg.ma.f1188;
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getTrimmedLength("") + 20, android.view.View.resolveSize(0, 0) + 883, (char) (27232 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr61);
            hashtable50.put(iVar6, ((java.lang.String) objArr61[0]).intern());
            java.util.Hashtable hashtable51 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar7 = util.h.xy.dg.ma.f1182;
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 22, 924 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10667), objArr62);
            hashtable51.put(iVar7, ((java.lang.String) objArr62[0]).intern());
            java.util.Hashtable hashtable52 = getHighSpeedVideoFpsRangesFor;
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(20 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, (char) (54400 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), objArr63);
            util.h.xy.dh.i iVar8 = new util.h.xy.dh.i(((java.lang.String) objArr63[0]).intern());
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 10, android.text.TextUtils.getCapsMode("", 0, 0) + 255, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr64);
            hashtable52.put(iVar8, ((java.lang.String) objArr64[0]).intern());
            java.util.Hashtable hashtable53 = getHighSpeedVideoFpsRangesFor;
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19, android.view.View.resolveSize(0, 0) + 185, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 161), objArr65);
            util.h.xy.dh.i iVar9 = new util.h.xy.dh.i(((java.lang.String) objArr65[0]).intern());
            java.lang.Object[] objArr66 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.view.View.getDefaultSize(0, 0), android.view.View.MeasureSpec.getSize(0) + 205, (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr66);
            hashtable53.put(iVar9, ((java.lang.String) objArr66[0]).intern());
            java.util.Hashtable hashtable54 = getHighSpeedVideoFpsRangesFor;
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 18, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 717, (char) (59121 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr67);
            util.h.xy.dh.i iVar10 = new util.h.xy.dh.i(((java.lang.String) objArr67[0]).intern());
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr68);
            hashtable54.put(iVar10, ((java.lang.String) objArr68[0]).intern());
            java.util.Hashtable hashtable55 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar11 = util.h.xy.eb.c.f1980;
            java.lang.Object[] objArr69 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 798, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr69);
            hashtable55.put(iVar11, ((java.lang.String) objArr69[0]).intern());
            java.util.Hashtable hashtable56 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar12 = util.h.xy.eb.c.f1983;
            java.lang.Object[] objArr70 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 15, android.graphics.Color.blue(0) + 810, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr70);
            hashtable56.put(iVar12, ((java.lang.String) objArr70[0]).intern());
            java.util.Hashtable hashtable57 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar13 = util.h.xy.eb.c.f1987;
            java.lang.Object[] objArr71 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 15, 825 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr71);
            hashtable57.put(iVar13, ((java.lang.String) objArr71[0]).intern());
            java.util.Hashtable hashtable58 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar14 = util.h.xy.eb.c.f1988;
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, 840 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr72);
            hashtable58.put(iVar14, ((java.lang.String) objArr72[0]).intern());
            java.util.Hashtable hashtable59 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar15 = util.h.xy.eb.c.f2010;
            java.lang.Object[] objArr73 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 16, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 855, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 46445), objArr73);
            hashtable59.put(iVar15, ((java.lang.String) objArr73[0]).intern());
            java.util.Hashtable hashtable60 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar16 = util.h.xy.dr.mb.f1522;
            java.lang.Object[] objArr74 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 315, (char) android.view.View.combineMeasuredStates(0, 0), objArr74);
            hashtable60.put(iVar16, ((java.lang.String) objArr74[0]).intern());
            java.util.Hashtable hashtable61 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar17 = util.h.xy.dr.mb.f1528;
            java.lang.Object[] objArr75 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.graphics.Color.red(0), 706 - android.view.View.MeasureSpec.getSize(0), (char) android.view.View.combineMeasuredStates(0, 0), objArr75);
            hashtable61.put(iVar17, ((java.lang.String) objArr75[0]).intern());
            java.util.Hashtable hashtable62 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar18 = util.h.xy.dq.mb.f1505;
            java.lang.Object[] objArr76 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 13, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 745, (char) (36444 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr76);
            hashtable62.put(iVar18, ((java.lang.String) objArr76[0]).intern());
            java.util.Hashtable hashtable63 = getHighSpeedVideoFpsRangesFor;
            util.h.xy.dh.i iVar19 = util.h.xy.dq.mb.f1493;
            java.lang.Object[] objArr77 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 759 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.View.resolveSize(0, 0) + 35518), objArr77);
            hashtable63.put(iVar19, ((java.lang.String) objArr77[0]).intern());
            java.util.Hashtable hashtable64 = getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.dh.i iVar20 = util.h.xy.du.ra.f1610;
            java.lang.Object[] objArr78 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 997 - android.view.View.MeasureSpec.getSize(0), (char) (5513 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr78);
            hashtable64.put(iVar20, ((java.lang.String) objArr78[0]).intern());
            java.util.Hashtable hashtable65 = getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.dh.i iVar21 = util.h.xy.eb.c.f2027;
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1000 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr79);
            hashtable65.put(iVar21, ((java.lang.String) objArr79[0]).intern());
            getOutputStallDuration.add(util.h.xy.eb.c.f1980);
            getOutputStallDuration.add(util.h.xy.eb.c.f1983);
            getOutputStallDuration.add(util.h.xy.eb.c.f1987);
            getOutputStallDuration.add(util.h.xy.eb.c.f1988);
            getOutputStallDuration.add(util.h.xy.eb.c.f2010);
            getOutputStallDuration.add(util.h.xy.eb.c.f2034);
            getOutputStallDuration.add(util.h.xy.dq.mb.f1505);
            getOutputStallDuration.add(util.h.xy.dq.mb.f1493);
            getOutputStallDuration.add(util.h.xy.dg.ma.f1188);
            getOutputStallDuration.add(util.h.xy.dg.ma.f1182);
            util.h.xy.ed.a aVar = new util.h.xy.ed.a(util.h.xy.dr.mb.f1521, util.h.xy.dh.ry.f1213);
            java.util.Hashtable hashtable66 = getOutputFormats;
            java.lang.Object[] objArr80 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 471, (char) (12521 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr80);
            hashtable66.put(((java.lang.String) objArr80[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(aVar, 20));
            util.h.xy.ed.a aVar2 = new util.h.xy.ed.a(util.h.xy.dq.mb.f1509, util.h.xy.dh.ry.f1213);
            java.util.Hashtable hashtable67 = getOutputFormats;
            java.lang.Object[] objArr81 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(20 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.View.MeasureSpec.getMode(0) + 489, (char) (5913 - android.text.TextUtils.getOffsetAfter("", 0)), objArr81);
            hashtable67.put(((java.lang.String) objArr81[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(aVar2, 28));
            util.h.xy.ed.a aVar3 = new util.h.xy.ed.a(util.h.xy.dq.mb.f1469, util.h.xy.dh.ry.f1213);
            java.util.Hashtable hashtable68 = getOutputFormats;
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 20, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 509, (char) (40313 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr82);
            hashtable68.put(((java.lang.String) objArr82[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(aVar3, 32));
            util.h.xy.ed.a aVar4 = new util.h.xy.ed.a(util.h.xy.dq.mb.f1473, util.h.xy.dh.ry.f1213);
            java.util.Hashtable hashtable69 = getOutputFormats;
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 20, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 529, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr83);
            hashtable69.put(((java.lang.String) objArr83[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(aVar4, 48));
            util.h.xy.ed.a aVar5 = new util.h.xy.ed.a(util.h.xy.dq.mb.f1483, util.h.xy.dh.ry.f1213);
            java.util.Hashtable hashtable70 = getOutputFormats;
            java.lang.Object[] objArr84 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 20, 549 - android.text.TextUtils.indexOf("", "", 0), (char) android.text.TextUtils.indexOf("", "", 0), objArr84);
            hashtable70.put(((java.lang.String) objArr84[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(aVar5, 64));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static util.h.xy.du.d getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ed.a aVar, int i) {
        util.h.xy.du.d dVar = new util.h.xy.du.d(aVar, new util.h.xy.ed.a(util.h.xy.du.ra.f1623, aVar), new util.h.xy.dh.f(i), new util.h.xy.dh.f(1L));
        int i2 = getInputSizeshNQ4ISI + 47;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    private static util.h.xy.ed.e getHighSpeedVideoFpsRangesFor(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            util.h.xy.cm.mc mcVar = new util.h.xy.cm.mc(x500Principal.getEncoded());
            int i = getInputFormats + 31;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return mcVar;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException unused) {
            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 17, android.view.ViewConfiguration.getWindowTouchSlop() >> 8, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    public rc(java.lang.String str, javax.security.auth.x500.X500Principal x500Principal, java.security.PublicKey publicKey, util.h.xy.dh.rk rkVar, java.security.PrivateKey privateKey) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        this(str, getHighSpeedVideoFpsRangesFor(x500Principal), publicKey, rkVar, privateKey, null);
    }

    public rc(java.lang.String str, util.h.xy.ed.e eVar, java.security.PublicKey publicKey, util.h.xy.dh.rk rkVar, java.security.PrivateKey privateKey, java.lang.String str2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        java.lang.Object invoke;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ued42碪욘Ⳡ몊4渟\uf47e䉅ꦡ㞟鶝\uebf5熁\udf11┌덿ᥕ撿\uf285壡ꛅ\u0ccf", 38370 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        java.lang.String str3 = (java.lang.String) objArr[0];
        java.lang.String m26854 = util.h.xy.fb.rd.m26854(str);
        util.h.xy.dh.i iVar = (util.h.xy.dh.i) getOutputMinFrameDuration.get(m26854);
        if (iVar == null) {
            try {
                iVar = new util.h.xy.dh.i(m26854);
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 33, 18 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
        }
        try {
            if (eVar == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(24 - android.text.TextUtils.indexOf("", "", 0, 0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 50, (char) android.view.View.MeasureSpec.getSize(0), objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            if (publicKey == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 74 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16804339), objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            }
            if (getOutputStallDuration.contains(iVar)) {
                this.f1584 = new util.h.xy.ed.a(iVar);
            } else if (getOutputFormats.containsKey(m26854)) {
                this.f1584 = new util.h.xy.ed.a(iVar, (util.h.xy.dh.c) getOutputFormats.get(m26854));
            } else {
                this.f1584 = new util.h.xy.ed.a(iVar, util.h.xy.dh.ry.f1213);
            }
            try {
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ued42뤤䖄ဎ벲䭺ៃꎰ丵\u1a8fꄃ䷳ᡍ\ua48f炎Ἶꮚ癹˫\ua95c痧Ƽ갏", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21613, objArr5);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ued4f㰤侎饖꣢渚Ա咓昅뇽", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 53609, objArr6);
                    this.f1583 = new util.h.xy.du.ma(eVar, util.h.xy.ed.mc.m26512((util.h.xy.dh.l) util.h.xy.dh.mi.m26324((byte[]) cls.getMethod((java.lang.String) objArr6[0], null).invoke(publicKey, null))), rkVar);
                    if (str2 == null) {
                        java.lang.Class<?> cls2 = java.lang.Class.forName(str3);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\ued4fꖨ粖㟎컒脢堂ጊꩮ絆㖿", 18661 - android.view.View.MeasureSpec.getMode(0), objArr7);
                        invoke = cls2.getMethod((java.lang.String) objArr7[0], java.lang.String.class).invoke(null, str);
                    } else {
                        java.lang.Class<?> cls3 = java.lang.Class.forName(str3);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\ued4fꖨ粖㟎컒脢堂ጊꩮ絆㖿", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18661, objArr8);
                        invoke = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class, java.lang.String.class).invoke(null, str, str2);
                    }
                    java.lang.Class<?> cls4 = java.lang.Class.forName(str3);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ued41\uf2e9툟뉑鏇猪单わ", android.view.View.MeasureSpec.getSize(0) + 8111, objArr9);
                    java.lang.String str4 = (java.lang.String) objArr9[0];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ued42좄ꛄ鰮稲做ྃ\ue5d0쌵륯靃犓⣍ٯﱎ\uda59놑濃䔣⍫᥉\uf4b2틓蠺", android.view.View.getDefaultSize(0, 0) + 9677, objArr10);
                    cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr10[0])).invoke(invoke, privateKey);
                    try {
                        util.h.xy.du.ma maVar = this.f1583;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, 125 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (48281 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr11);
                        try {
                            java.lang.Object[] objArr12 = {maVar.m26322(((java.lang.String) objArr11[0]).intern())};
                            java.lang.Class<?> cls5 = java.lang.Class.forName(str3);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("\ued5d忙衎響❘釈", 45697 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
                            cls5.getMethod((java.lang.String) objArr13[0], byte[].class).invoke(invoke, objArr12);
                            java.lang.Class<?> cls6 = java.lang.Class.forName(str3);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("\ued5b䢒ꛩ᰿", android.view.Gravity.getAbsoluteGravity(0, 0) + 42451, objArr14);
                            this.f1585 = new util.h.xy.dh.rw((byte[]) cls6.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(38 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr15);
                        sb.append(((java.lang.String) objArr15[0]).intern());
                        sb.append(e);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                } catch (java.io.IOException unused2) {
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 23, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 101, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7395), objArr16);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr16[0]).intern());
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override // util.h.xy.dh.mh
    /* renamed from: ᐝ */
    public final byte[] mo25969() {
        int i = (getInputSizeshNQ4ISI + 115) % 128;
        getInputFormats = i;
        getInputSizeshNQ4ISI = (i + 11) % 128;
        try {
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(3 - (intValue >> 22), (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) (48282 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
                return m26322(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.toString());
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = 4106190287844662963L;
    }

    static void Camera2StreamConfigurationMap() {
        char[] cArr = new char[1003];
        java.nio.ByteBuffer.wrap("\u009cbñÖG\u0003Õ\u0004*\u00ad¸¯\u000e&c\u0094ñßG\u0011Õx*¡¸ý\u000e\u001fc\u009bñÊG\fÕr\u009cTñÙG\u0006ÕM*¶¸ø\u000e+cÛñÂG\u000eÕz*½¸è\u000eKc\u0080ñÙG\u0004Õ7*¹¸ú\u000eIc\u008añ\u0085G)Õt*¶¸\b\u000eVc\u009añëG0Õo\u009crñÂG\u000fÕI*¼¸ì\u000e1cÛñÜG\u0012Õn*§¸©\u000eQc\u009añßGAÕu*¨¸£\u000eWc\u009añÉG7õ\u0082\u00981.ü¼¼CCÑ\u001fg\u0096\nc\u0098'.í¼ÎCMÑ\u000fg¿\nr\u0098x.ü¼\u008bCJÑPg¨\ny\u0098v.Æ¼\u0097CXÑâ\u0080\u0086í2[çÉà6I¤K\u0012Ä\u007fqí6[ìÉ\u009d6R¤M\u0012«\u007fdí-[éÉ\u009a6J¤G\u0012¶\u007fní8 ßMhû¥\u009cdñÏG\u000eÕF*©¸û\u000e,c\u0094ñßGGÕx*½¸ê\u000ePc\u0091ñÂG\u000fÕp*í¸×\u000e{c¼ñ\u0085G8Õt*µ¸\t\u000e\u0013c\u009bñúG$Õ~*¤¸\u0004\u000eYcÃñ´Go\u009cLñóG_Õt*\u0090¸Û\u000e\rc©ñâG&ÕX*\u009d¸Ê\u000emc¬ñûG5Õ^*\u0082¸Í\u009c\u0091ñ8GþÕ¬*@¸\u001a\u000eÔctñ!G÷Õ\u008f*G¸\u001c\u000e§czñ;GîÕ\u0087*B¸\u0010\u009cLñóG_Õt*\u0090¸Û\u000e\rc©ñâG&\tBdýÒV@z¿\u009e-Õ\u009b\u0003ö§dìÒ(@V¿\u0093-Ä\u009bcö¢dõÒ;@P¿\u008c-ÃH°%\u0019\u0093ß\u0001\u008dþal;Úõ·U%\u0000\u0093Ö\u0001®þfl=Ú\u0086·[%\u001a\u0093Ï\u0001¦þcl7\u009cLñóGXÕt*\u0090¸Û\u000e\rc©ñâG&SÅ>r\u0088º\u001aâå\u0006wMÁ\u009b¬ >c\u0088ÄÑ^¼ó\n \u0098\u001eg\u0082õÊC\u001d.¿¼ï\n8\u0098Pg\u009aõËCp.«¼þ\n=\u0098Og\u0088õÀC{\u009c0ñ\u0099G_Õ\r*á¸»\u000eucÕñ\u0080GVÕ.*æ¸½\u000e\u0006cÛñ\u009aGOÕ&*ã¸¶\u009cRñÿG,Õ\u0012*\u008e¸Æ\u000e\u0011c³ñãG4Õ\\\u0016 {\u008dÍ^_c \u00992É\u0084`éÀ{\u0097Í]_= ò2º\u0084\béÉ{\u009aÍA_< ï2¥\u0084\u0002éÒ{\u0099v<\u001b\u0091\u00adB?\u007fÀ\u0085RÕä|\u0089Ü\u001b\u008b\u00adA?!ÀîR¦\u009cRñÿG,Õ\u0011*ì¸¹\u000e\u0012c²ñåG/ÕO*\u0080¸È\u000ezc»ñèG3ÕN*\u009d¸×\u000epc ñë¯kÂÆt\u0015æ(\u0019Õ\u008b\u0080=+P\u008bÂÜt\u0016æv\u0019¹\u008bñ\u009eWóúE)×\u0015(äº¾\f\u0017a·óàE*×J(\u0085ºÍ\f\u007fa¾óíE6×K(\u0098ºÒ\fua¥óî\u009cRñÿG,Õ\u0010*á¸»\u000e\u0012c²ñåG/ÕO*\u0080¸È\u009cRñÿG,Õ\u0016*è¸½\u000e\u0012c²ñåG/ÕO*\u0080¸È\u000ezc»ñèG3ÕN*\u009d¸×\u000epc ñëQ\u0005<¨\u008a{\u0018Aç¿uêÃE®å<²\u008ax\u0018\u0018ç×u\u009f¬¸Á\u0015wÆåø\u001ad\u0088,>ûSYÁ\twÞå¶\u001ax\u0088->\u0091SRÁ\u0006wÍåÌ\u008bKææP5Â\b=ò¯¢\u0019\u000bt«æüP6ÂV=\u0099¯Ñ\u0019gt¢æöP5ÂI=\u0092¯«\u0001(l\u0085ÚVHk·\u0096%Ã\u0093hþÈl\u009fÚUH5·ú%²\u0093\u0004þÁl\u0095ÚVH*·ñ%È\u009cRñÿG,Õ\u0010*á¸»\u000e\u0012c²ñåG/ÕO*\u0080¸È\u000e~c»ñïG,ÕP*\u008b¸²\u009cRñÿG,Õ\u0016*è¸½\u000e\u0012c²ñåG/ÕO*\u0080¸È\u000e~c»ñïG,ÕP*\u008b¸²2\u009e_)éá{¹\u0084]\u0016\u0016 ÀÍe_4éë{á\r\u0003`®ÖmD6»Ä)\u009b\u009f$ò\u0099`ÙÖ`D\u0004»×)\u0091\u009f=òö`ºÖtD\t»Þ)\u0081\u009f0òï`¡ÖBD\u000e»Ùîï\u0083B5\u0081§ÚX(Êw|È\u0011u\u008355\u008c§èX;Ê}|Ñ\u0011\u001a\u0083VÁ÷¬Z\u001a\u0099\u0088Âw0åoSÐ>i¬%\u001a\u0094\u0088ðw#åeSÉ>\u0002¬N\u001a\u0080\u0088ýw*åuSÄ>\u001b¬U\u001a¶\u0088úw-\u0012Ú\u007fwÉ´[ï¤\u001d6B\u0080ýíD\u007f\bÉ¹[Ý¤\u000e6H\u0080äí/\u007fc\tBdïÒ,@w¿\u0085-Ú\u009bfößd\u0096Ò!@E¿\u0096-Ð\u009b|ö·dûÒ5@H¿\u009f-À\u009bqö®dàÒ\u0003@O¿\u0098\u009cSñþG=Õf*\u0094¸Ë\u000ewcÎñ\u0087G0ÕT*\u0087¸Á\u000emc¦ñê\u009cRñÿG,Õ\u0012*\u008e¸Æ\u000e\u0011c³ñõG4Õ\\zÁ\u0017h¡®3üÌ\u0010^Jè\u0084\u0085$\u0017q¡¦3ÜÌ\u0016^Hèà\u00850\u0017t¡£^x3Ù\u0085\u0011\u0017Iè\u00adzæÌ0¡\u00953Ä\u0085\u001b\u0017\u0011\u0012\u000e\u007f£Ép[M¤·6ç\u0080Níî\u007f¹És[\u0005¤Ü6\u0094\u0016ì{AÍ\u0092_¯ R2\u0007\u0084¬é\f{[Í\u0091_ç >2vYW4ú\u0082)\u0010\u0015ïä}¾Ë\u0017¦·4à\u0082*\u0010\\ï\u0085}Íúª\u0097\u0007!Ô³îL\u0010ÞEhê\u0005J\u0097\u001d!×³¡LxÞ0\u009cRñÿG,Õ\u0012*\u008e¸Æ\u000e\u0011c³ñôG$ÕY*\u0080¸È\u009cRñÿG,Õ\u0011*ë¸»\u000e\u0012c²ñåG/ÕX*\u0090¸Í\u000elc´\u009cRñÿG,Õ\u0011*ì¸¹\u000e\u0012c²ñåG/ÕX*\u0090¸Í\u000elc´\u009cRñÿG,Õ\u0010*á¸»\u000e\u0012c²ñåG/ÕX*\u0090¸Í\u000elc´)>D\u0093ò@`z\u009f\u0084\rÑ»~ÖÞD\u0089òC`4\u009fü\r¡»\u0000ÖØ\u009cDñôG)Õp*\u0098¸Ø\u000e\fc¯ñùG4ÕU*\u0092¸¸ö&\u009b\u0098-^¿\u0017@\u008aÒÛd\u0014\tª\u009b\u0086-N¿)@ûÒ®d\u0010\tÆ\u009b\u009f-2¿C@\u009cÒÓÝ8°\u0086\u0006@\u0094\tk\u0094ùÅO\n\"µ°\u0098\u0006P\u00947kåù°O\u000e\"Ø°\u0081\u0006,\u0094]k\u0082ùÌµêØTn\u0092üÛ\u0003F\u0091\u0017'ØJfØJn\u0082üå\u00037\u0091`'ÐJ\u001eØHn\u009eüï\u0003R\u0091\u001b'¤Js%fHØþ\u001elW\u0093Ê\u0001\u009b·TÚêHÆþ\u000eli\u0093»\u0001ì·\\Ú\u0092HÄþ\u0012lc\u0093Þ\u0001\u0097·(ÚÿH¨þIl\u0001\u0093×\u0001l\u009cFñøG>Õw*ê¸»\u000etcÊñæG.ÕI*\u009b¸Î\u000epc¦ñÿGRÕ#*ü¸³\u000e\u0014cÝñ\u0095GkÕ \u0089ÚämR¥\u009cEñäG,".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1003);
        getOutputSizeshNQ4ISI = cArr;
        Camera2StreamConfigurationMap = -9060954254176161353L;
    }
}
