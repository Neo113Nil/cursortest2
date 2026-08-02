package util.h.xy.bu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class c {
    private static final /* synthetic */ util.h.xy.bu.c[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.bu.c f1051;
    private byte[] getHighSpeedVideoSizesFor;
    private util.h.xy.d.md getInputSizeshNQ4ISI = null;
    private byte[] getOutputFormats;

    private c(java.lang.String str) {
    }

    public static util.h.xy.bu.c valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 23) % 128;
        util.h.xy.bu.c cVar = (util.h.xy.bu.c) java.lang.Enum.valueOf(util.h.xy.bu.c.class, str);
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 99) % 128;
        return cVar;
    }

    public static util.h.xy.bu.c[] values() {
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 25) % 128;
        util.h.xy.bu.c[] cVarArr = (util.h.xy.bu.c[]) Camera2StreamConfigurationMap.clone();
        int i = getOutputMinFrameDuration + 23;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return cVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0) + 8;
        int pressedStateDuration = (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2;
        int i = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 87;
        int i2 = getHighSpeedVideoFpsRanges + 61;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = "\ufff9\ufffb\uffff\u0004\t\n\ufff7\u0004".toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[resolveSizeAndState];
        raVar.f2649 = 0;
        while (raVar.f2649 < resolveSizeAndState) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i);
            int i3 = raVar.f2649;
            cArr[i3] = (char) (cArr[i3] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (pressedStateDuration > 0) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            raVar.f2648 = pressedStateDuration;
            char[] cArr2 = new char[resolveSizeAndState];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, resolveSizeAndState);
            java.lang.System.arraycopy(cArr2, 0, cArr, resolveSizeAndState - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, resolveSizeAndState - raVar.f2648);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 47;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.bu.c cVar = new util.h.xy.bu.c(str.intern());
        f1051 = cVar;
        int i5 = (getHighSpeedVideoSizes + 41) % 128;
        getOutputMinFrameDuration = i5;
        int i6 = (i5 + 83) % 128;
        getHighSpeedVideoSizes = i6;
        Camera2StreamConfigurationMap = new util.h.xy.bu.c[]{cVar};
        int i7 = i6 + 19;
        getOutputMinFrameDuration = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25654() {
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 93) % 128;
        byte[] bArr = this.getOutputFormats;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 23) % 128;
        return copyOf;
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25651(byte[] bArr) {
        int i = getHighSpeedVideoSizes + 61;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            this.getOutputFormats = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.getOutputFormats = java.util.Arrays.copyOf(bArr, bArr.length);
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25648() {
        int i = getOutputMinFrameDuration + 9;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.getHighSpeedVideoSizesFor;
            java.util.Arrays.copyOf(bArr, bArr.length);
            throw null;
        }
        byte[] bArr2 = this.getHighSpeedVideoSizesFor;
        byte[] copyOf = java.util.Arrays.copyOf(bArr2, bArr2.length);
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 111) % 128;
        return copyOf;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25653(byte[] bArr) {
        int i = getOutputMinFrameDuration + 105;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoSizesFor = bArr;
        } else {
            this.getHighSpeedVideoSizesFor = bArr;
            throw null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25652() {
        int i = getHighSpeedVideoSizes + 31;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ar.b.m25095(this.getHighSpeedVideoSizesFor);
            this.getInputSizeshNQ4ISI = null;
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 27) % 128;
        } else {
            util.h.xy.ar.b.m25095(this.getHighSpeedVideoSizesFor);
            this.getInputSizeshNQ4ISI = null;
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25649() {
        int i = getOutputMinFrameDuration + 95;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25095(this.getOutputFormats);
            this.getInputSizeshNQ4ISI = null;
        } else {
            util.h.xy.ar.b.m25095(this.getOutputFormats);
            this.getInputSizeshNQ4ISI = null;
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25647(util.h.xy.d.md mdVar) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 63;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = mdVar;
            getOutputMinFrameDuration = (i + 75) % 128;
        } else {
            this.getInputSizeshNQ4ISI = mdVar;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.d.md m25650() {
        int i = getOutputMinFrameDuration + 59;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.d.md mdVar = this.getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i2 + 43) % 128;
        return mdVar;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRangesFor = -1231763813;
    }
}
