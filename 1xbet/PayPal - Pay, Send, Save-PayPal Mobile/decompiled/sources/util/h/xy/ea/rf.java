package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class rf extends util.h.xy.ea.ri {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private util.h.xy.ec.ma getHighSpeedVideoSizes;

    @Override // util.h.xy.ea.ri
    public final java.lang.Object clone() {
        util.h.xy.ea.rf rfVar = new util.h.xy.ea.rf(this.getHighSpeedVideoSizes);
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 55) + ((i & 55) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return rfVar;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
        if (!(obj instanceof util.h.xy.ea.rf)) {
            int i2 = (i ^ 19) + ((i & 19) << 1);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            return i2 % 2 == 0;
        }
        boolean equals = this.getHighSpeedVideoSizes.equals(((util.h.xy.ea.rf) obj).getHighSpeedVideoSizes);
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i3 | 23) << 1) - (i3 ^ 23)) % 128;
        return equals;
    }

    public final int hashCode() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 53) << 1) - (i ^ 53);
        getHighSpeedVideoFpsRanges = i2 % 128;
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 101) % 128;
        return hashCode;
    }

    public rf(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger, byte[] bArr) {
        this(new util.h.xy.ec.ma(bVar, bigInteger, bArr));
    }

    public rf(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger) {
        this(bVar, bigInteger, null);
    }

    public rf(byte[] bArr) {
        this(null, null, bArr);
    }

    private rf(util.h.xy.ec.ma maVar) {
        super(0);
        this.getHighSpeedVideoSizes = maVar;
    }
}
