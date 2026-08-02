package util.h.xy.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class a {
    private static byte[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static short[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static final /* synthetic */ util.h.xy.ak.a[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static int getOutputMinFrameDuration = 1;
    private static int getOutputSizes;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.ak.a f74;
    private final java.util.concurrent.locks.Lock getOutputStallDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f75;

    private a(java.lang.String str) {
    }

    public static util.h.xy.ak.a valueOf(java.lang.String str) {
        int i = getInputFormats + 49;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ak.a aVar = (util.h.xy.ak.a) java.lang.Enum.valueOf(util.h.xy.ak.a.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getInputFormats = (getOutputMinFrameDuration + 49) % 128;
        return aVar;
    }

    public static util.h.xy.ak.a[] values() {
        int i = getInputFormats + 55;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ak.a[] aVarArr = getInputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return (util.h.xy.ak.a[]) aVarArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoSizes();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 1448366351, (short) ((-16777309) - android.graphics.Color.rgb(0, 0, 0)), (byte) ((-1) - android.view.MotionEvent.axisFromString("")), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 99, (-825189684) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            util.h.xy.ak.a aVar = new util.h.xy.ak.a(((java.lang.String) objArr[0]).intern());
            f74 = aVar;
            int i = getInputFormats;
            getOutputMinFrameDuration = (i + 49) % 128;
            getOutputMinFrameDuration = (i + 51) % 128;
            getInputSizeshNQ4ISI = new util.h.xy.ak.a[]{aVar};
            getOutputFormats = util.h.xy.ak.ra.class.getName();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.da.ra m24959(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        try {
            try {
                util.h.xy.da.mc.m26263(context);
                getHighSpeedVideoFpsRanges();
                util.h.xy.db.a m27720 = util.h.xy.z.ra.m27720();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1448366445, (short) ((-69) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 102, android.widget.ExpandableListView.getPackedPositionType(0L) - 825189662, objArr);
                util.h.xy.da.mb.a mo26090 = util.h.xy.da.mb.m26261(((java.lang.String) objArr[0]).intern().getBytes()).mo26090(util.h.xy.da.a.f1152);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 1448366439, (short) (110 - android.view.View.combineMeasuredStates(0, 0)), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.view.KeyEvent.keyCodeFromString("") - 68, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 825189678, objArr2);
                util.h.xy.da.mb mo26094 = mo26090.mo26095(((java.lang.String) objArr2[0]).intern(), m27720).mo26094();
                this.getOutputStallDurationlomOqCM.lock();
                this.f75.mo26073(mo26094);
                this.getOutputStallDurationlomOqCM.unlock();
                int i = getOutputMinFrameDuration + 45;
                int i2 = i % 128;
                getInputFormats = i2;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.da.ra raVar = this.f75;
                int i3 = i2 + 5;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 != 0) {
                    return raVar;
                }
                throw null;
            } catch (util.h.xy.da.b e) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-1448366401) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (122 - android.view.View.MeasureSpec.getMode(0)), (byte) android.view.View.resolveSizeAndState(0, 0, 0), (-66) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-825189678) - android.graphics.Color.blue(0), objArr3);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(505, ((java.lang.String) objArr3[0]).intern(), e);
            }
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m24961() {
        getOutputMinFrameDuration = (getInputFormats + 21) % 128;
        try {
            getHighSpeedVideoFpsRanges();
            boolean mo26079 = this.f75.mo26079();
            int i = getInputFormats + 53;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                return mo26079;
            }
            throw null;
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24960() {
        int i = getOutputMinFrameDuration + 111;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges();
            util.h.xy.ak.d.m24967(this.f75);
            getInputFormats = (getOutputMinFrameDuration + 51) % 128;
        } else {
            getHighSpeedVideoFpsRanges();
            util.h.xy.ak.d.m24967(this.f75);
            throw new java.lang.NullPointerException();
        }
    }

    private void getHighSpeedVideoFpsRanges() throws util.h.xy.da.b {
        int i = getOutputMinFrameDuration + 83;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.f75 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1448366358, (short) android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 99, (-825189653) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            this.f75 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        int i2 = getInputFormats + 45;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        util.h.xy.ak.a.getHighSpeedVideoFpsRanges = (r8 + 111) % 128;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        if (r3 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputSizes ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 19) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
            byte[] bArr = Camera2StreamConfigurationMap;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 87;
                getHighSpeedVideoFpsRanges = i8 % 128;
                i6 = (byte) (((byte) (i8 % 2 == 0 ? Camera2StreamConfigurationMap[i >> ((int) (getHighSpeedVideoSizesFor * (-2689713159175858216L)))] | (-2689713159175858216L) : Camera2StreamConfigurationMap[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getHighSpeedVideoSizes[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i9 = getHighResolutionOutputSizeshNQ4ISI;
            int i10 = i9 + 57;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 == 0) {
                i4 = ((i - i6) % 5) * ((int) (getHighSpeedVideoSizesFor - 2689713159175858216L));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = Camera2StreamConfigurationMap;
            if (bArr3 != null) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = getHighResolutionOutputSizeshNQ4ISI + 3;
                    getHighSpeedVideoFpsRanges = i12 % 128;
                    if (i12 % 2 == 0) {
                        bArr4[i11] = (byte) (bArr3[i11] ^ (-2689713159175858216L));
                    } else {
                        bArr4[i11] = (byte) (bArr3[i11] ^ (-2689713159175858216L));
                        i11++;
                    }
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    byte[] bArr5 = Camera2StreamConfigurationMap;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoSizes;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = -1309325643;
        getOutputSizes = -408873036;
        getHighSpeedVideoFpsRangesFor = -695307611;
        Camera2StreamConfigurationMap = new byte[]{-99, -99, com.visa.cbp.getEncExpo.registerForActivityResult, -97, -111, -60, 71, 72, 64, 93, 71, 126, -77, 64, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 81, 108, -88, 71, 72, 83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 109, -85, 76, 84, 93, 123, 107, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -125, 72, 64, 89, 77, 85, 107, -76, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 76, 71, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 75, 87, 108, 93, 84, -93, 82, 73, 80, -87, 65, 19, -32, 93, 84, -93, 65, -75, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 91, 73, -85, 73, 89, 83, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.registerForActivityResult, 92, 84, -83, 81, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 1, -32, 93, 80, 94, 92, 106, 113, -102, -90, 123, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SYN, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, 17, 9, 1, -121, -118, -78, -110, -122, -70, -70, -40, -40, -40, -40, -40};
    }
}
