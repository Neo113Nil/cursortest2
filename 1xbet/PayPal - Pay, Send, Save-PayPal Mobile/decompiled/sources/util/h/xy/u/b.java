package util.h.xy.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static final /* synthetic */ util.h.xy.u.b[] getOutputFormats;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.u.b f2432;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.u.b f2433;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.u.b f2434;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.u.b f2435;
    private java.lang.String getHighSpeedVideoSizesFor;
    private final byte getInputFormats;

    public static util.h.xy.u.b valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 93;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.u.b bVar = (util.h.xy.u.b) java.lang.Enum.valueOf(util.h.xy.u.b.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = getOutputMinFrameDuration + 57;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.u.b[] values() {
        int i = getHighSpeedVideoSizes + 67;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.u.b[] bVarArr = (util.h.xy.u.b[]) getOutputFormats.clone();
        int i2 = getOutputMinFrameDuration + 47;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return bVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(14 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.Gravity.getAbsoluteGravity(0, 0) + 15, (-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) android.graphics.Color.blue(0), objArr2);
            util.h.xy.u.b bVar = new util.h.xy.u.b(intern, 0, (byte) 1, ((java.lang.String) objArr2[0]).intern());
            f2435 = bVar;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap('9' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 15 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (558 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.Gravity.getAbsoluteGravity(0, 0) + 9, 14 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 511), objArr4);
            util.h.xy.u.b bVar2 = new util.h.xy.u.b(intern2, 1, (byte) 2, ((java.lang.String) objArr4[0]).intern());
            f2432 = bVar2;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, 24 - android.graphics.Color.green(0), (char) (14469 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, 24 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 14469), objArr6);
            util.h.xy.u.b bVar3 = new util.h.xy.u.b(intern3, 2, (byte) 3, ((java.lang.String) objArr6[0]).intern());
            f2433 = bVar3;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.getTrimmedLength("") + 7, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 62627), objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.getOffsetAfter("", 0) + 7, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 62627), objArr8);
            util.h.xy.u.b bVar4 = new util.h.xy.u.b(intern4, 3, (byte) -1, ((java.lang.String) objArr8[0]).intern());
            f2434 = bVar4;
            getHighSpeedVideoSizes = (getOutputMinFrameDuration + 47) % 128;
            getOutputFormats = new util.h.xy.u.b[]{bVar, bVar2, bVar3, bVar4};
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private b(java.lang.String str, int i, byte b, java.lang.String str2) {
        this.getInputFormats = b;
        this.getHighSpeedVideoSizesFor = str2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27489() {
        int i = getOutputMinFrameDuration + 35;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return new byte[]{this.getInputFormats};
        }
        byte[] bArr = new byte[0];
        bArr[0] = this.getInputFormats;
        return bArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.u.b m27488(byte b) {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 89) % 128;
        util.h.xy.u.b[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            int i2 = getOutputMinFrameDuration;
            getHighSpeedVideoSizes = (i2 + 89) % 128;
            util.h.xy.u.b bVar = values[i];
            if (bVar.getInputFormats == b) {
                if (bVar != f2434) {
                    return bVar;
                }
                int i3 = i2 + 101;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    util.h.xy.f.b.f2201.m26750();
                    throw null;
                }
                util.h.xy.u.b m26750 = util.h.xy.f.b.f2201.m26750();
                int i4 = getOutputMinFrameDuration + 57;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    return m26750;
                }
                throw new java.lang.ArithmeticException();
            }
            i++;
            getHighSpeedVideoSizes = (i2 + 105) % 128;
        }
        return null;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = getHighSpeedVideoSizes;
        getOutputMinFrameDuration = (i + 33) % 128;
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        int i2 = i + 83;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 87) % 128;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 55) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = new char[]{40007, 44967, 64400, 2023, 21472, 40913, 43825, 63266, 782, 20344, 39777, 42832, 62138, 16053, 19072, 40557, 44421, 63912, 1492, 20953, 40432, 43291, 62723, 315, 42183, 38698, 49939, 16236, 27489, 42825, 37817, 53166, 15235, 30719, 41977, 40921, 26871, 23302, 3901, 62290, 42821, 27495, 24464};
        getHighResolutionOutputSizeshNQ4ISI = 6048651602092404715L;
    }
}
