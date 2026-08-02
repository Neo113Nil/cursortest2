package util.h.xy.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.n.ra[] getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static short[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static byte[] getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputStallDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.n.ra f2261;

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f2263 = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.da.ra f2262 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f2265 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    public util.h.xy.da.ra f2264 = null;

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.da.ra f2266 = null;

    private ra(java.lang.String str) {
    }

    public static util.h.xy.n.ra valueOf(java.lang.String str) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 3) % 128;
        util.h.xy.n.ra raVar = (util.h.xy.n.ra) java.lang.Enum.valueOf(util.h.xy.n.ra.class, str);
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 53) % 128;
        return raVar;
    }

    public static util.h.xy.n.ra[] values() {
        int i = getOutputMinFrameDuration + 97;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.n.ra[] raVarArr = (util.h.xy.n.ra[]) getHighSpeedVideoFpsRanges.clone();
        int i2 = getInputSizeshNQ4ISI + 105;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return raVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(941788219 - (maximumDrawingCacheSize >> 24), (short) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) android.view.View.resolveSize(0, 0), (-91) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-731361524) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        util.h.xy.n.ra raVar = new util.h.xy.n.ra(((java.lang.String) objArr[0]).intern());
        f2261 = raVar;
        int i = (getInputSizeshNQ4ISI + 119) % 128;
        getOutputMinFrameDuration = i;
        getInputSizeshNQ4ISI = (i + 45) % 128;
        getHighSpeedVideoFpsRanges = new util.h.xy.n.ra[]{raVar};
        getHighSpeedVideoFpsRangesFor = util.h.xy.n.ra.class.getName();
        int i2 = getOutputMinFrameDuration + 103;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26987() {
        int i;
        boolean z = false;
        try {
            getHighSpeedVideoFpsRanges();
            if (!this.f2263.mo26079()) {
                int i2 = getInputSizeshNQ4ISI + 107;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    this.f2262.mo26079();
                    throw new java.lang.ArithmeticException();
                }
                if (!this.f2262.mo26079() && !this.f2265.mo26079()) {
                    getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 43) % 128;
                    if (!this.f2266.mo26079()) {
                        if (this.f2264.mo26079()) {
                        }
                        i = getOutputMinFrameDuration + 79;
                        getInputSizeshNQ4ISI = i % 128;
                        if (i % 2 == 0) {
                            return z;
                        }
                        throw null;
                    }
                }
            }
            z = true;
            i = getOutputMinFrameDuration + 79;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
            }
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26988() {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 75) % 128;
        try {
            getHighSpeedVideoFpsRanges();
            util.h.xy.ak.d.m24967(this.f2263);
            util.h.xy.ak.d.m24967(this.f2262);
            util.h.xy.ak.d.m24967(this.f2265);
            util.h.xy.ak.d.m24967(this.f2266);
            util.h.xy.ak.d.m24967(this.f2264);
        } catch (util.h.xy.da.b unused) {
        }
        int i = getInputSizeshNQ4ISI + 9;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private void getHighSpeedVideoFpsRanges() throws util.h.xy.da.b {
        if (this.f2263 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(941788204 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (short) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), android.widget.ExpandableListView.getPackedPositionChild(0L) - 93, android.view.MotionEvent.axisFromString("") - 731361502, objArr);
            this.f2263 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        if (this.f2262 == null) {
            util.h.xy.da.ma maVar2 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 941788207, (short) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 95, (-731361503) - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
            this.f2262 = util.h.xy.da.d.m26260(maVar2, ((java.lang.String) objArr2[0]).intern());
        }
        if (this.f2265 == null) {
            util.h.xy.da.ma maVar3 = util.h.xy.da.ma.f1156;
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 941788211, (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) - 94, android.graphics.Color.blue(0) - 731361503, objArr3);
                this.f2265 = util.h.xy.da.d.m26260(maVar3, ((java.lang.String) objArr3[0]).intern());
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 109) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (this.f2264 == null) {
            util.h.xy.da.ma maVar4 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(941788213 + android.view.View.combineMeasuredStates(0, 0), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 94, (-731361503) - android.graphics.Color.green(0), objArr4);
            this.f2264 = util.h.xy.da.d.m26260(maVar4, ((java.lang.String) objArr4[0]).intern());
        }
        if (this.f2266 == null) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 55) % 128;
            util.h.xy.da.ma maVar5 = util.h.xy.da.ma.f1156;
            int offsetAfter = 941788216 - android.text.TextUtils.getOffsetAfter("", 0);
            short windowTouchSlop = (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            byte scrollBarSize = (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
            int i = getOutputMinFrameDuration + 89;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(offsetAfter, windowTouchSlop, scrollBarSize, (-94) >>> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >>> 38), (-731361503) >> (android.view.ViewConfiguration.getMaximumFlingVelocity() - 80), objArr5);
                this.f2266 = util.h.xy.da.d.m26260(maVar5, ((java.lang.String) objArr5[0]).intern());
                return;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(offsetAfter, windowTouchSlop, scrollBarSize, (-94) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 731361503, objArr6);
            this.f2266 = util.h.xy.da.d.m26260(maVar5, ((java.lang.String) objArr6[0]).intern());
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputStallDuration ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 67) % 128;
            byte[] bArr = getOutputFormats;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 115) % 128;
                i5 = (byte) (((byte) (getOutputFormats[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getInputFormats[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i7 = (int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L));
            if (z2) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 81) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputFormats;
            if (bArr3 != null) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 65) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = getHighSpeedVideoSizes + 19;
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 != 0) {
                        bArr4[i8] = (byte) (bArr3[i8] | (-2689713159175858216L));
                    } else {
                        bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                        i8++;
                    }
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 67) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getInputFormats;
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

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = 545022988;
        getOutputStallDuration = -408873030;
        getHighSpeedVideoSizesFor = -868833562;
        getOutputFormats = new byte[]{-36, 10, -40, -34, 10, -40, -33, 10, -40, -48, 10, -40, 38, com.google.common.base.Ascii.VT, -40, -38, 45, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -39, -35, -35, -40, -40, -40, -40, -40, -40};
    }
}
