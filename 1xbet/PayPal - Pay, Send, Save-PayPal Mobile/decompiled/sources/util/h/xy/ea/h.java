package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class h extends util.h.xy.ea.ri {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    @Override // util.h.xy.ea.ri
    public final java.lang.Object clone() {
        util.h.xy.ea.h hVar = new util.h.xy.ea.h();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 21) + (i | 21)) % 128;
        return hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 29) + (i | 29);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        boolean z = obj instanceof util.h.xy.ea.h;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (z) {
            return true;
        }
        int i3 = i + 15;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int hashCode() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 27) % 128;
        return 3;
    }

    public h() {
        super(3);
    }
}
