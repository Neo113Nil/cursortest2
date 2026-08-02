package util.h.xy.au;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class d {
    private static final /* synthetic */ util.h.xy.au.d[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getInputSizeshNQ4ISI;
    private static char[] getOutputFormats;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.au.d f863;

    private d(java.lang.String str) {
    }

    public static util.h.xy.au.d valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        util.h.xy.au.d dVar = (util.h.xy.au.d) java.lang.Enum.valueOf(util.h.xy.au.d.class, str);
        if (i % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    public static util.h.xy.au.d[] values() {
        int i = getHighSpeedVideoFpsRanges + 117;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.au.d[] dVarArr = Camera2StreamConfigurationMap;
        if (i % 2 == 0) {
            return (util.h.xy.au.d[]) dVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.au.d[] dVarArr;
        getHighSpeedVideoSizes();
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(9 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), 104 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            util.h.xy.au.d dVar = new util.h.xy.au.d(((java.lang.String) objArr[0]).intern());
            f863 = dVar;
            int i = getHighSpeedVideoFpsRanges + 95;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                dVarArr = new util.h.xy.au.d[1];
                dVarArr[1] = dVar;
            } else {
                dVarArr = new util.h.xy.au.d[]{dVar};
            }
            Camera2StreamConfigurationMap = dVarArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25121(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 15;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (inputMethod == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26, android.graphics.Color.red(0), (char) android.view.View.resolveSize(0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            int i2 = getInputSizeshNQ4ISI + 61;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0 ? str.length() <= 10 : str.length() <= 49) {
                getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 117) % 128;
                return;
            }
        }
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(21 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13945), objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25120(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 49) % 128;
        if (str == null) {
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(indexOf + 27, 45 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (52591 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            int i = getInputSizeshNQ4ISI + 105;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0 ? str.length() <= 64 : str.length() <= 8) {
                getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 53) % 128;
                return;
            }
        }
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((longPressTimeout >> 16) + 26, 46 - android.graphics.Color.green(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 52592), objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25122(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData) {
        if (walletAccountData == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(33 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 72 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (14377 - android.text.TextUtils.getTrimmedLength("")), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (walletAccountData.getAccountId() == null || walletAccountData.getAccountId().length() == 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(31 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 72, (char) (14377 - android.view.KeyEvent.getDeadChar(0, 0)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRangesFor))) ^ c;
            rbVar.f2651++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 11) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = new char[]{40008, 48404, 56967, 63493, 6553, 15174, 21646, 30265, 38829, 45370, 53920, 60460, 3557, 12119, 18632, 27156, 35807, 42309, 50899, 57344, 491, 9079, 31999, 40549, 49133, 43573, 35683, 59617, 52847, 12256, 3455, 25340, 16449, 41345, 34627, 58564, 55824, 15315, 6441, 32439, 23660, 48575, 37683, 61619, 54833, 14209, 20797, 28784, 5098, 13686, 54499, 63077, 39340, 47965, 23235, 31824, 8130, 8514, 49368, 57969, 34237, 42792, 18174, 26667, 2983, 11579, 52434, 60943, 45469, 21263, 29327, 5129, 42111, 34098, 59058, 49205, 8609, 827, 27882, 19988, 44947, 35096, 60041, 54292, 13698, 5987, 28850, 21113, 46073, 40311, 65263, 55337, 14813, 6988, 17562, 42571, 34767, 57695, 49782, 9127, 3389, 28331, 18475, 43433, 40008, 48436, 56996, 63524, 6572, 15144, 21664, 30233};
        getHighSpeedVideoFpsRangesFor = -2103384975356936838L;
    }
}
