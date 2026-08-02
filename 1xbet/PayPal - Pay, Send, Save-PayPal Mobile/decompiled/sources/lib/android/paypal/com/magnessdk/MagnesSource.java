package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public enum MagnesSource {
    PAYPAL(10),
    SIMILITY(17),
    VENMO(18),
    ZETTLE(13),
    HONEY(14),
    XOOM(15),
    OTHER_PP(16);

    private int getHighSpeedVideoFpsRanges;

    public final int getVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    static int getHighSpeedVideoFpsRanges() {
        return PAYPAL.getVersion();
    }

    MagnesSource(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }
}
