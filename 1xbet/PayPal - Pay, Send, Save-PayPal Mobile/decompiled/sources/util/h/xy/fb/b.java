package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.Integer m26828(int i) {
        int i2 = (getHighSpeedVideoSizes + 47) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i2 + 15;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m26830(int i, int i2) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
        int rotateLeft = java.lang.Integer.rotateLeft(i, i2);
        int i3 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 121) + ((i3 & 121) << 1)) % 128;
        return rotateLeft;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m26829(int i) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
        int numberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 21;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return numberOfLeadingZeros;
        }
        throw null;
    }
}
