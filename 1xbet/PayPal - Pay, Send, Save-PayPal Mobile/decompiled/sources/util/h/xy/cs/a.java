package util.h.xy.cs;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;

    static final class b {
        public static final util.h.xy.cs.b getHighSpeedVideoFpsRanges = new util.h.xy.cs.ra();
        private static int getHighSpeedVideoSizes = 1;
        private static int getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 87) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.cs.b m26021() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 103) + (i | 103);
        getHighSpeedVideoSizes = i2 % 128;
        util.h.xy.cs.b bVar = util.h.xy.cs.a.b.getHighSpeedVideoFpsRanges;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i3 & 3) + (i3 | 3)) % 128;
        return bVar;
    }
}
