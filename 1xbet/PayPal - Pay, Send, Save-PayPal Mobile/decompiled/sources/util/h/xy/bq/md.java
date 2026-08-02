package util.h.xy.bq;

/* loaded from: classes5.dex */
public class md implements com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, util.h.xy.bq.e {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int[] getHighSpeedVideoSizesFor = null;
    private static boolean getInputFormats = false;
    private static int getInputSizeshNQ4ISI = 0;
    private static char[] getOutputFormats = null;
    private static final byte[][] getOutputMinFrameDuration;
    private static int getOutputMinFrameDurationlomOqCM = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.util.HashMap<java.lang.String, java.lang.String> f1027;
    private byte[] ArtificialStackFrames;
    private byte[] accessartificialFrame;
    private final byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private final byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[] toString;
    private byte[] unwrapAs;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = util.h.xy.bq.md.class.getName();
        getOutputMinFrameDuration = new byte[][]{f1013, f1010, f1009, f1015, f1004, f1024, f1003, f1020, f1011, f1019};
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        f1027 = hashMap;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{653475812, -1996362069}, android.text.TextUtils.indexOf("", "", 0, 0) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-942103800, -1926555981}, 3 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        hashMap.put(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{949783242, 110989306}, 4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 128, "\u008f\u0083\u008e", objArr4);
            hashMap.put(intern2, ((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-655017212, -957639484}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{849577357, -1974998398}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, objArr6);
            hashMap.put(intern3, ((java.lang.String) objArr6[0]).intern());
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-962153127, -1558173846}, 5 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 113) % 128;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 127, "\u0091\u0090\u0082", objArr8);
            hashMap.put(intern4, ((java.lang.String) objArr8[0]).intern());
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0093\u0094\u0093\u0092", objArr9);
            java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.View.getDefaultSize(0, 0), "\u008f\u0095\u008c", objArr10);
            hashMap.put(intern5, ((java.lang.String) objArr10[0]).intern());
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1979184691, -1085212266}, android.view.KeyEvent.normalizeMetaState(0) + 4, objArr11);
            java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1181766724, 371036813}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr12);
            hashMap.put(intern6, ((java.lang.String) objArr12[0]).intern());
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-583939866, 1135029700}, 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr13);
            java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0096\u008d\u0083", objArr14);
            hashMap.put(intern7, ((java.lang.String) objArr14[0]).intern());
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0098\u0094\u0097\u0092", objArr15);
            java.lang.String intern8 = ((java.lang.String) objArr15[0]).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.MotionEvent.axisFromString("") + 128, "\u008c\u0099\u0083", objArr16);
            hashMap.put(intern8, ((java.lang.String) objArr16[0]).intern());
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{144820862, -236071909}, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr17);
            java.lang.String intern9 = ((java.lang.String) objArr17[0]).intern();
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u008c\u009a\u0095", objArr18);
            hashMap.put(intern9, ((java.lang.String) objArr18[0]).intern());
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0093\u009b\u0097\u0092", objArr19);
            java.lang.String intern10 = ((java.lang.String) objArr19[0]).intern();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1538340544, 2040621689}, 3 - android.view.KeyEvent.keyCodeFromString(""), objArr20);
            hashMap.put(intern10, ((java.lang.String) objArr20[0]).intern());
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.getOffsetAfter("", 0), "\u009e\u009d\u009c\u0092", objArr21);
            java.lang.String intern11 = ((java.lang.String) objArr21[0]).intern();
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{679326278, 1996919538}, 4 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr22);
            hashMap.put(intern11, ((java.lang.String) objArr22[0]).intern());
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0092\u009c\u009e\u0092", objArr23);
            java.lang.String intern12 = ((java.lang.String) objArr23[0]).intern();
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u008b\u0086\u0096", objArr24);
            hashMap.put(intern12, ((java.lang.String) objArr24[0]).intern());
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{791454142, 1860473655}, 5 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr25);
            java.lang.String intern13 = ((java.lang.String) objArr25[0]).intern();
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.combineMeasuredStates(0, 0) + 127, "\u008c\u008b\u0096", objArr26);
            hashMap.put(intern13, ((java.lang.String) objArr26[0]).intern());
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.blue(0) + 127, "\u009e\u0097\u009e\u0092", objArr27);
            java.lang.String intern14 = ((java.lang.String) objArr27[0]).intern();
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1329118117, 1987142939}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, objArr28);
            hashMap.put(intern14, ((java.lang.String) objArr28[0]).intern());
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0093\u009c\u009f\u0092", objArr29);
            java.lang.String intern15 = ((java.lang.String) objArr29[0]).intern();
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0086\u0088\u009a", objArr30);
            hashMap.put(intern15, ((java.lang.String) objArr30[0]).intern());
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0092\u0092\u0094\u0092", objArr31);
            java.lang.String intern16 = ((java.lang.String) objArr31[0]).intern();
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0085\u008a\u0091", objArr32);
            hashMap.put(intern16, ((java.lang.String) objArr32[0]).intern());
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{333223740, 876033627}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, objArr33);
            java.lang.String intern17 = ((java.lang.String) objArr33[0]).intern();
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u008f\u008b\u0086", objArr34);
            hashMap.put(intern17, ((java.lang.String) objArr34[0]).intern());
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0098\u0098\u009d\u0092", objArr35);
            java.lang.String intern18 = ((java.lang.String) objArr35[0]).intern();
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{974057200, -1170319386}, 3 - android.view.KeyEvent.keyCodeFromString(""), objArr36);
            hashMap.put(intern18, ((java.lang.String) objArr36[0]).intern());
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.KeyEvent.getDeadChar(0, 0), "\u0092\u0092\u0098\u0092", objArr37);
            java.lang.String intern19 = ((java.lang.String) objArr37[0]).intern();
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{776240264, 906277072}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr38);
            hashMap.put(intern19, ((java.lang.String) objArr38[0]).intern());
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.graphics.Color.red(0), "\u0092\u009e\u009b\u0092", objArr39);
            java.lang.String intern20 = ((java.lang.String) objArr39[0]).intern();
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0083\u008a\u0089", objArr40);
            hashMap.put(intern20, ((java.lang.String) objArr40[0]).intern());
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u009d\u0093\u009b\u0092", objArr41);
            java.lang.String intern21 = ((java.lang.String) objArr41[0]).intern();
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u008b\u008a\u0089", objArr42);
            hashMap.put(intern21, ((java.lang.String) objArr42[0]).intern());
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1435440118, -1537208587}, 4 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr43);
            java.lang.String intern22 = ((java.lang.String) objArr43[0]).intern();
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{655974148, 642566524}, 3 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr44);
            hashMap.put(intern22, ((java.lang.String) objArr44[0]).intern());
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1794919029, 988353224}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr45);
            java.lang.String intern23 = ((java.lang.String) objArr45[0]).intern();
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1033624153, 1217876402}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3, objArr46);
            hashMap.put(intern23, ((java.lang.String) objArr46[0]).intern());
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1963047426, 553919074}, android.view.KeyEvent.getDeadChar(0, 0) + 4, objArr47);
            java.lang.String intern24 = ((java.lang.String) objArr47[0]).intern();
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "\u008f\u0087 ", objArr48);
            hashMap.put(intern24, ((java.lang.String) objArr48[0]).intern());
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getMode(0) + 127, "\u0093\u009f\u009b\u0092", objArr49);
            java.lang.String intern25 = ((java.lang.String) objArr49[0]).intern();
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-975395013, 437624372}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, objArr50);
            hashMap.put(intern25, ((java.lang.String) objArr50[0]).intern());
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0097\u009f\u009b\u0092", objArr51);
            java.lang.String intern26 = ((java.lang.String) objArr51[0]).intern();
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008f\u0091 ", objArr52);
            hashMap.put(intern26, ((java.lang.String) objArr52[0]).intern());
            getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 119) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public md(byte[] bArr) {
        this.toString = new byte[0];
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0082\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25056 = util.h.xy.ar.a.m25056(bArr, getOutputMinFrameDuration);
        this.getValidOutputFormatsForInputhNQ4ISI = util.h.xy.ar.b.m25074(m25056.get(java.nio.ByteBuffer.wrap(f1013)).m25110());
        this.getOutputSizeshNQ4ISI = m25056.get(java.nio.ByteBuffer.wrap(f1010)).m25110();
        this.unwrapAs = m25056.get(java.nio.ByteBuffer.wrap(f1009)).m25110();
        if (m25056.get(java.nio.ByteBuffer.wrap(f1015)) != null) {
            this.toString = m25056.get(java.nio.ByteBuffer.wrap(f1015)).m25110();
        }
        this.ArtificialStackFrames = m25056.get(java.nio.ByteBuffer.wrap(f1004)).m25110();
        if (m25056.get(java.nio.ByteBuffer.wrap(f1020)) != null) {
            this.getOutputStallDurationlomOqCM = m25056.get(java.nio.ByteBuffer.wrap(f1020)).m25110();
        } else {
            this.getOutputStallDurationlomOqCM = new byte[]{0};
        }
        util.h.xy.ar.mb mbVar = m25056.get(java.nio.ByteBuffer.wrap(f1024));
        this.accessartificialFrame = mbVar != null ? mbVar.m25110() : null;
        util.h.xy.ar.mb mbVar2 = m25056.get(java.nio.ByteBuffer.wrap(f1003));
        this.isOutputSupportedForhNQ4ISI = mbVar2 != null ? mbVar2.m25110() : null;
        util.h.xy.ar.mb mbVar3 = m25056.get(java.nio.ByteBuffer.wrap(f1011));
        this.getOutputStallDuration = mbVar3 != null ? mbVar3.m25110() : null;
        util.h.xy.ar.mb mbVar4 = m25056.get(java.nio.ByteBuffer.wrap(f1019));
        this.getOutputSizes = mbVar4 != null ? mbVar4.m25110() : null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoSizesFor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i3 = 0;
            while (i3 < length3) {
                int i4 = getHighSpeedVideoFpsRangesFor + 59;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    iArr6[i3] = (int) (iArr5[i3] / (-5569649899877129369L));
                    i3 %= 1;
                } else {
                    iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i5 = 0; i5 < 16; i5++) {
                cVar.f2627 ^= iArr4[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 95) % 128;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public java.lang.String getAid() {
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 63) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, 892007788, -737141774}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = this.getValidOutputFormatsForInputhNQ4ISI;
        int i = getInputSizeshNQ4ISI + 115;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public byte[] getRawAmount() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = getInputSizeshNQ4ISI;
        getOutputMinFrameDurationlomOqCM = (i + 119) % 128;
        int i2 = i + 67;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 >>> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() - 115), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            }
            return this.getOutputSizeshNQ4ISI;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce A[LOOP:0: B:12:0x00ca->B:14:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double getAmount() {
        int i;
        int i2;
        double d;
        double d2;
        double d3;
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 103) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "\u0081\u0088\u0087\u0085\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int length = this.getOutputSizeshNQ4ISI.length;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = f1027;
        if (hashMap.containsKey(util.h.xy.ar.b.m25074(this.unwrapAs))) {
            int i3 = getInputSizeshNQ4ISI + 113;
            getOutputMinFrameDurationlomOqCM = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    i = java.util.Currency.getInstance(hashMap.get(util.h.xy.ar.b.m25074(this.unwrapAs))).getDefaultFractionDigits();
                    try {
                        throw null;
                    } catch (java.lang.IllegalArgumentException unused) {
                        java.lang.String str = f1027.get(util.h.xy.ar.b.m25074(this.unwrapAs));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 127, "\u008b\u008a\u0089", objArr3);
                        if (str == ((java.lang.String) objArr3[0]).intern()) {
                            i = 4;
                        }
                        if (i != 0) {
                        }
                        double d4 = 0.0d;
                        i2 = 0;
                        while (i2 < length) {
                        }
                        if (i != 2) {
                        }
                        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
                        numberFormat.setMaximumFractionDigits(i);
                        numberFormat.setMinimumFractionDigits(i);
                        numberFormat.setGroupingUsed(false);
                        return java.lang.Double.parseDouble(numberFormat.format(d4));
                    }
                }
                i = java.util.Currency.getInstance(hashMap.get(util.h.xy.ar.b.m25074(this.unwrapAs))).getDefaultFractionDigits();
            } catch (java.lang.IllegalArgumentException unused2) {
                i = 2;
            }
        } else {
            i = 2;
        }
        if (i != 0) {
            if (i == 2) {
                length--;
            } else {
                length -= 2;
                getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 95) % 128;
            }
        }
        double d42 = 0.0d;
        i2 = 0;
        while (i2 < length) {
            byte b = this.getOutputSizeshNQ4ISI[i2];
            d42 = (d42 * 100.0d) + (((b & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) + (b & com.google.common.base.Ascii.SI);
            i2++;
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 9) % 128;
        }
        if (i != 2) {
            byte b2 = this.getOutputSizeshNQ4ISI[length];
            d42 += ((((b2 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) + (b2 & com.google.common.base.Ascii.SI)) / 100.0d;
            getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 13) % 128;
        } else {
            if (i == 3) {
                byte[] bArr = this.getOutputSizeshNQ4ISI;
                byte b3 = bArr[length];
                d = (d42 * 10.0d) + ((b3 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) + ((b3 & com.google.common.base.Ascii.SI) / 10.0d);
                byte b4 = bArr[length + 1];
                d2 = (((b4 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) + (b4 & com.google.common.base.Ascii.SI);
                d3 = 1000.0d;
            } else if (i == 4) {
                byte[] bArr2 = this.getOutputSizeshNQ4ISI;
                byte b5 = bArr2[length];
                d = d42 + (((((b5 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) + (b5 & com.google.common.base.Ascii.SI)) / 100.0d);
                byte b6 = bArr2[length + 1];
                d2 = (((b6 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) + (b6 & com.google.common.base.Ascii.SI);
                d3 = 10000.0d;
            }
            d42 = d + (d2 / d3);
        }
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getInstance(java.util.Locale.US);
        numberFormat2.setMaximumFractionDigits(i);
        numberFormat2.setMinimumFractionDigits(i);
        numberFormat2.setGroupingUsed(false);
        return java.lang.Double.parseDouble(numberFormat2.format(d42));
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor + 73;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputFormats;
        if (cArr2 != null) {
            int i4 = getHighSpeedVideoFpsRangesFor + 15;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getInputFormats) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 41) % 128;
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public byte[] getCurrencyCode() {
        getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 5) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, android.graphics.Color.blue(0) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 35) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "\u0082\u0082\u0085\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            byte[] m25103 = util.h.xy.ar.b.m25103(this.unwrapAs);
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 79) % 128;
            return m25103;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public byte[] getTrxDate() {
        int i = getOutputMinFrameDurationlomOqCM + 71;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 3 >> (android.view.ViewConfiguration.getJumpTapTimeout() + 8), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMinVolume() > 1.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) + 32, "\u008c\u0081\u0085\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return util.h.xy.ar.b.m25103(this.toString);
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u008c\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        return util.h.xy.ar.b.m25103(this.toString);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public byte getTrxType() {
        int i = getOutputMinFrameDurationlomOqCM + 49;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 4 / android.text.TextUtils.indexOf("", "", 0), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, -1991335768, 1974117228}, (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)) * 100, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return this.ArtificialStackFrames[0];
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 4 - android.text.TextUtils.indexOf("", "", 0), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, -1991335768, 1974117228}, 7 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        return this.ArtificialStackFrames[0];
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus getDigitalizedCardStatus() {
        int i = getInputSizeshNQ4ISI + 49;
        int i2 = i % 128;
        getOutputMinFrameDurationlomOqCM = i2;
        int i3 = i % 2;
        int[] iArr = {-2042247171, 270453418};
        getInputSizeshNQ4ISI = (i2 + 9) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(iArr, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 5, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, 2064357396, 1338935821}, android.text.TextUtils.getOffsetBefore("", 0) + 8, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return this.isOutputSupportedFor;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public java.lang.String getTrxId() {
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 35) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, -422607715, -1874299636}, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 8, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            java.lang.String m25074 = util.h.xy.ar.b.m25074(this.getOutputStallDuration);
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 119) % 128;
            return m25074;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25568(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus) {
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 55) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 4 - android.text.TextUtils.getTrimmedLength(""), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008d\u0082\u008c\u008d\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.isOutputSupportedFor = digitalizedCardStatus;
        int i = getInputSizeshNQ4ISI + 109;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public void wipe() {
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 7) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2042247171, 270453418}, 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-925397163, -392861311, 700205633, -1629476231}, 4 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ar.b.m25100(this.getOutputSizeshNQ4ISI, this.unwrapAs, this.toString, this.ArtificialStackFrames);
        int i = getOutputMinFrameDurationlomOqCM + 75;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return com.gemalto.mfs.mwsdk.payment.engine.CardScheme.VISA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = com.gemalto.mfs.mwsdk.payment.engine.CardScheme.VISA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return com.gemalto.mfs.mwsdk.payment.engine.CardScheme.PURE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return com.gemalto.mfs.mwsdk.payment.engine.CardScheme.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        util.h.xy.bq.md.getInputSizeshNQ4ISI = (util.h.xy.bq.md.getOutputMinFrameDurationlomOqCM + 33) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        return com.gemalto.mfs.mwsdk.payment.engine.CardScheme.MASTERCARD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0023, code lost:
    
        if (r4.getOutputStallDurationlomOqCM[0] == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4.getOutputStallDurationlomOqCM[1] == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r0 = r4.getOutputStallDurationlomOqCM[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r0 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r0 = util.h.xy.bq.md.getOutputMinFrameDurationlomOqCM + 37;
        util.h.xy.bq.md.getInputSizeshNQ4ISI = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if ((r0 % 2) != 0) goto L17;
     */
    @Override // com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.gemalto.mfs.mwsdk.payment.engine.CardScheme getScheme() {
        int i = getInputSizeshNQ4ISI + 125;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ar.b.m25074(this.getOutputStallDurationlomOqCM);
        } else {
            util.h.xy.ar.b.m25074(this.getOutputStallDurationlomOqCM);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25569() {
        byte[] bArr = this.getOutputSizes;
        if (bArr == null) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 37) % 128;
            return false;
        }
        if (bArr[0] != 1) {
            return false;
        }
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 91) % 128;
        return true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m25567() {
        int i = getOutputMinFrameDurationlomOqCM + 93;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.accessartificialFrame;
        if (bArr == null) {
            return null;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        util.h.xy.ar.b.m25095(this.accessartificialFrame);
        int i2 = getInputSizeshNQ4ISI + 11;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        if (i2 % 2 != 0) {
            return copyOf;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m25570() {
        byte[] bArr = this.isOutputSupportedForhNQ4ISI;
        if (bArr != null) {
            int i = getOutputMinFrameDurationlomOqCM + 89;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                if (bArr.length > 0) {
                    byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                    util.h.xy.ar.b.m25095(this.isOutputSupportedForhNQ4ISI);
                    return copyOf;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 25) % 128;
        return null;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = new int[]{1395747065, 1113794909, 285045361, -1133323083, 1881923458, -996212191, 618239174, 1883090987, -1480034465, -675148779, -1839034646, -754042445, 428455138, -1549275175, 1617841797, -1650333948, 1003580790, 994712428};
        getOutputFormats = new char[]{64302, 64319, 64293, 64320, 64315, 64300, 64317, 64289, 64297, 64277, 64299, 64318, 64303, 64316, 64312, 64294, 64290, 64322, 64332, 64328, 64292, 64295, 64335, 64330, 64301, 64291, 64309, 64333, 64331, 64334, 64329, 64298};
        getHighResolutionOutputSizeshNQ4ISI = -1074857102;
        getInputFormats = true;
        getHighSpeedVideoFpsRanges = true;
    }
}
