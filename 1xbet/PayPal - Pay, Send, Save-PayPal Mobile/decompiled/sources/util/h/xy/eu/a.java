package util.h.xy.eu;

/* loaded from: classes18.dex */
public abstract class a implements util.h.xy.eu.ra {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public abstract java.math.BigInteger m26711();

    /* renamed from: ᐝ, reason: contains not printable characters */
    public abstract int m26712();

    public java.lang.String toString() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 77) % 128;
        java.lang.String bigInteger = m26711().toString(16);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 93) % 128;
        return bigInteger;
    }
}
