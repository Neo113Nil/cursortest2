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
public final class rc {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static final /* synthetic */ util.h.xy.n.rc[] getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static char[] getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.n.rc f2267;
    private android.content.Context getInputSizeshNQ4ISI = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.da.ra f2270 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f2273 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f2271 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    public util.h.xy.da.ra f2272 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    public util.h.xy.da.ra f2269 = null;

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.da.ra f2274 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    public util.h.xy.da.ra f2268 = null;

    private rc(java.lang.String str) {
    }

    public static util.h.xy.n.rc valueOf(java.lang.String str) {
        getInputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
        util.h.xy.n.rc rcVar = (util.h.xy.n.rc) java.lang.Enum.valueOf(util.h.xy.n.rc.class, str);
        int i = getHighSpeedVideoFpsRanges + 95;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return rcVar;
        }
        throw null;
    }

    public static util.h.xy.n.rc[] values() {
        getHighSpeedVideoFpsRanges = (getInputFormats + 5) % 128;
        util.h.xy.n.rc[] rcVarArr = (util.h.xy.n.rc[]) getHighSpeedVideoSizes.clone();
        getHighSpeedVideoFpsRanges = (getInputFormats + 13) % 128;
        return rcVarArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((minimumFlingVelocity >> 16) + 8, 22 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0), objArr);
        util.h.xy.n.rc rcVar = new util.h.xy.n.rc(((java.lang.String) objArr[0]).intern());
        f2267 = rcVar;
        int i = getHighSpeedVideoFpsRanges;
        getInputFormats = (i + 57) % 128;
        getInputFormats = (i + 91) % 128;
        getHighSpeedVideoSizes = new util.h.xy.n.rc[]{rcVar};
        getOutputMinFrameDuration = util.h.xy.n.rc.class.getName();
        getInputFormats = (getHighSpeedVideoFpsRanges + 115) % 128;
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26989() {
        int i = getHighSpeedVideoFpsRanges;
        getInputFormats = (i + 21) % 128;
        int i2 = i + 31;
        try {
            getInputFormats = i2 % 128;
        } catch (util.h.xy.da.b unused) {
        }
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.f2270 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 4, android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (15467 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
            this.f2270 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        if (this.f2268 == null) {
            util.h.xy.da.ma maVar2 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 3, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, (char) (34749 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
            this.f2268 = util.h.xy.da.d.m26260(maVar2, ((java.lang.String) objArr2[0]).intern());
            getInputFormats = (getHighSpeedVideoFpsRanges + 73) % 128;
        }
        if (this.f2273 == null) {
            getHighSpeedVideoFpsRanges = (getInputFormats + 47) % 128;
            util.h.xy.da.ma maVar3 = util.h.xy.da.ma.f1156;
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(3 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.view.View.resolveSize(0, 0) + 6, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
                this.f2273 = util.h.xy.da.d.m26260(maVar3, ((java.lang.String) objArr3[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (this.f2271 == null) {
            util.h.xy.da.ma maVar4 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(3 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
            this.f2271 = util.h.xy.da.d.m26260(maVar4, ((java.lang.String) objArr4[0]).intern());
        }
        if (this.f2272 == null) {
            util.h.xy.da.ma maVar5 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(4 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39173), objArr5);
            this.f2272 = util.h.xy.da.d.m26260(maVar5, ((java.lang.String) objArr5[0]).intern());
        }
        if (this.f2269 == null) {
            util.h.xy.da.ma maVar6 = util.h.xy.da.ma.f1156;
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(4 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), 15 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (55077 - android.graphics.Color.alpha(0)), objArr6);
            this.f2269 = util.h.xy.da.d.m26260(maVar6, ((java.lang.String) objArr6[0]).intern());
        }
        if (this.f2274 == null) {
            util.h.xy.da.ma maVar7 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.ImageFormat.getBitsPerPixel(0) + 4, 18 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr7);
            this.f2274 = util.h.xy.da.d.m26260(maVar7, ((java.lang.String) objArr7[0]).intern());
        }
        int i3 = getInputFormats + 31;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        util.h.xy.ak.d.m24967(this.f2270);
        util.h.xy.ak.d.m24967(this.f2273);
        util.h.xy.ak.d.m24967(this.f2271);
        util.h.xy.ak.d.m24967(this.f2272);
        util.h.xy.ak.d.m24967(this.f2274);
        util.h.xy.ak.d.m24967(this.f2269);
        util.h.xy.ak.d.m24967(this.f2268);
        getHighSpeedVideoFpsRanges = (getInputFormats + 15) % 128;
        getInputFormats = (getHighSpeedVideoFpsRanges + 15) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = new char[]{41013, 35155, 62103, 7123, 12981, 18802, 40030, 46392, 52990, 40030, 46392, 52985, 1368, 11326, 22526, 19323, 25117, 6622, 40030, 46392, 52986, 40008, 46377, 52894, 57447, 14808, 21169, 25638, 48526};
        Camera2StreamConfigurationMap = 5233779222118905191L;
    }
}
