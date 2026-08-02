package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private java.util.Hashtable getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.d m26357() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d();
        java.util.Enumeration elements = this.getHighSpeedVideoFpsRangesFor.elements();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        while (elements.hasMoreElements()) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 9;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                elements.nextElement();
                throw new java.lang.ArithmeticException();
            }
            java.lang.Object nextElement = elements.nextElement();
            if (nextElement instanceof java.util.Vector) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 9;
                getHighSpeedVideoFpsRanges = i2 % 128;
                java.util.Enumeration elements2 = ((java.util.Vector) nextElement).elements();
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                while (elements2.hasMoreElements()) {
                    dVar.m26290(util.h.xy.dj.mb.m26383(elements2.nextElement()));
                }
                int i3 = getHighSpeedVideoFpsRanges + 65;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 2;
                }
            } else {
                dVar.m26290(util.h.xy.dj.mb.m26383(nextElement));
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = (((i5 | 111) << 1) - (i5 ^ 111)) % 128;
            }
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i6 | 27) << 1) - (i6 ^ 27)) % 128;
        }
        int i7 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i7 & 67) + (i7 | 67)) % 128;
        return dVar;
    }
}
