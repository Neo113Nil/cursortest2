package util.h.xy.by;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˋ' uses external variables
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
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static final /* synthetic */ util.h.xy.by.ra[] getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.by.ra f1070;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f1071;
    private final java.util.concurrent.locks.Lock getOutputStallDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputSizes = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputStallDuration = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputFormats = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputMinFrameDuration = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getInputFormats = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();

    private ra(java.lang.String str) {
    }

    public static util.h.xy.by.ra valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 83;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.by.ra raVar = (util.h.xy.by.ra) java.lang.Enum.valueOf(util.h.xy.by.ra.class, str);
        if (i % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    public static util.h.xy.by.ra[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 1;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.by.ra[] raVarArr = getHighSpeedVideoSizes;
        if (i % 2 != 0) {
            return (util.h.xy.by.ra[]) raVarArr.clone();
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufffb\uffff\u0004\t\n\ufff7\u0004\ufff9", android.graphics.Color.green(0) + 8, 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 239 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), false, objArr);
        util.h.xy.by.ra raVar = new util.h.xy.by.ra(((java.lang.String) objArr[0]).intern());
        f1070 = raVar;
        int i = (getHighSpeedVideoSizesFor + 49) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        getHighSpeedVideoSizesFor = (i + 35) % 128;
        getHighSpeedVideoSizes = new util.h.xy.by.ra[]{raVar};
        getInputSizeshNQ4ISI = util.h.xy.by.ra.class.getName();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 51) % 128;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i4 + 99) % 128;
        Camera2StreamConfigurationMap = (i4 + 87) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 121) % 128;
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25823(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            try {
                util.h.xy.da.mc.m26263(context);
                getHighResolutionOutputSizeshNQ4ISI();
                util.h.xy.db.a m27719 = util.h.xy.z.ra.m27719();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("￼\ufffb\ufffb\ufffa\ufff9'\uffff�\ufffb", android.view.Gravity.getAbsoluteGravity(0, 0) + 9, 6 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.MotionEvent.axisFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, true, objArr);
                util.h.xy.da.mb.a mo26090 = util.h.xy.da.mb.m26261(((java.lang.String) objArr[0]).intern().getBytes()).mo26090(util.h.xy.da.a.f1152);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("￼\u0002\u0000\uffc9\uffdf\u0000\u0011\u0004\ufffe\u0000￡\u0004\t\u0002\u0000\r￫\r\u0004\t\u000f￨￼\t￼\u0002\u0000\r￫\r\n\u000b\u0000\r\u000f\u0014￮\u000f\n\r", android.view.KeyEvent.getDeadChar(0, 0) + 40, 28 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 266 - android.graphics.Color.red(0), false, objArr2);
                util.h.xy.da.mb mo26094 = mo26090.mo26095(((java.lang.String) objArr2[0]).intern(), m27719).mo26094();
                if (!this.f1071.mo26080()) {
                    this.f1071.mo26073(mo26094);
                }
                if (util.h.xy.by.b.f1066.m25794()) {
                    util.h.xy.by.b.f1066.m25793();
                }
                if (util.h.xy.by.mb.f1069.m25820()) {
                    util.h.xy.ak.d.m24966(util.h.xy.by.mb.f1069.m25819(context), this.f1071);
                    util.h.xy.by.mb.f1069.m25821();
                }
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 45) % 128;
            } catch (util.h.xy.da.b e) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\b\u0003\u000e\ufffb\u0006\u0003\u0014\ufffb\u000e\u0003\t\bﾺ\uffff\u0012�\uffff\n\u000e\u0003\t\b￪\f\t\u0010\u0003\r\u0003\t\b\u0003\b\u0001ﾺ\r\u000e\t\f\ufffb\u0001\uffffﾺ\u0003", 43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.blue(0) + 22, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, false, objArr3);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr3[0]).intern(), e);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25822() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 63) % 128;
        try {
            getHighResolutionOutputSizeshNQ4ISI();
        } catch (util.h.xy.da.b unused) {
        }
        try {
            this.getOutputStallDurationlomOqCM.lock();
            this.getOutputSizes.lock();
            this.getOutputStallDuration.lock();
            this.getOutputFormats.lock();
            this.getOutputMinFrameDuration.lock();
            this.getInputFormats.lock();
            this.getOutputSizeshNQ4ISI.lock();
            try {
                if (this.f1071.mo26080()) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 19) % 128;
                    this.f1071.mo26074();
                }
            } catch (java.lang.Exception unused2) {
            }
            util.h.xy.ak.d.m24967(this.f1071);
            this.getOutputStallDurationlomOqCM.unlock();
            this.getOutputSizes.unlock();
            this.getOutputStallDuration.unlock();
            this.getOutputFormats.unlock();
            this.getOutputMinFrameDuration.unlock();
            this.getInputFormats.unlock();
            this.getOutputSizeshNQ4ISI.unlock();
            int i = getHighSpeedVideoFpsRangesFor + 53;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.unlock();
            this.getOutputSizes.unlock();
            this.getOutputStallDuration.unlock();
            this.getOutputFormats.unlock();
            this.getOutputMinFrameDuration.unlock();
            this.getInputFormats.unlock();
            this.getOutputSizeshNQ4ISI.unlock();
            throw th;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.da.b {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 121) % 128;
        if (this.f1071 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\t\u0001\u0001\u0000\ufff7\ufffa\t", (-16777209) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 7, android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, true, objArr);
            this.f1071 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 35) % 128;
    }

    static void Camera2StreamConfigurationMap() {
        getHighResolutionOutputSizeshNQ4ISI = -1231763917;
    }
}
