package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class md implements util.h.xy.ea.e, util.h.xy.ea.rd {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final util.h.xy.dh.i getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.ea.e
    /* renamed from: ˎ */
    public final util.h.xy.dh.i mo26482() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 109;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.i iVar = this.getHighSpeedVideoFpsRangesFor;
        int i3 = i + 115;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return iVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ea.mc
    /* renamed from: ˊ */
    public final void mo26484(java.io.OutputStream outputStream) throws java.io.IOException, util.h.xy.ea.d {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 77) << 1) - (i ^ 77);
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2;
        outputStream.write(this.getHighSpeedVideoFpsRanges);
        if (i3 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = getHighSpeedVideoSizes + 15;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public md(util.h.xy.dh.i iVar, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = iVar;
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    public md(byte[] bArr) {
        this(util.h.xy.dj.ra.f1320, bArr);
    }
}
