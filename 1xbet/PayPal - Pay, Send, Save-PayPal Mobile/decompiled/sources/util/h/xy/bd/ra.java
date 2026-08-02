package util.h.xy.bd;

/* loaded from: classes18.dex */
public class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 94;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.bd.b m25373(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 11) + ((i & 11) << 1)) % 128;
        if (bArr[1] == -88) {
            util.h.xy.bd.b m25374 = new util.h.xy.bd.rb().m25374(bArr);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (((i2 | 59) << 1) - (i2 ^ 59)) % 128;
            return m25374;
        }
        util.h.xy.bd.b m25375 = new util.h.xy.bd.rc().m25375(bArr);
        int i3 = getHighSpeedVideoSizes;
        int i4 = (i3 & 1) + (i3 | 1);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return m25375;
        }
        throw new java.lang.ArithmeticException();
    }
}
