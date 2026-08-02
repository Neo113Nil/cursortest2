package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class mf extends util.h.xy.ea.ri {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.ec.ma getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.ea.ri
    public final java.lang.Object clone() {
        util.h.xy.ea.mf mfVar = new util.h.xy.ea.mf(this.getHighResolutionOutputSizeshNQ4ISI);
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 111) + (i | 111);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return mfVar;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!(obj instanceof util.h.xy.ea.mf)) {
            return false;
        }
        boolean equals = this.getHighResolutionOutputSizeshNQ4ISI.equals(((util.h.xy.ea.mf) obj).getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 37) % 128;
        return equals;
    }

    public final int hashCode() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        getHighSpeedVideoSizes = i2 % 128;
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        if (i2 % 2 == 0) {
            return hashCode;
        }
        throw new java.lang.ArithmeticException();
    }

    public mf(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger, byte[] bArr) {
        this(new util.h.xy.ec.ma(bVar, bigInteger, bArr));
    }

    public mf(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger) {
        this(bVar, bigInteger, null);
    }

    public mf(byte[] bArr) {
        this(null, null, bArr);
    }

    private mf(util.h.xy.ec.ma maVar) {
        super(2);
        this.getHighResolutionOutputSizeshNQ4ISI = maVar;
    }
}
