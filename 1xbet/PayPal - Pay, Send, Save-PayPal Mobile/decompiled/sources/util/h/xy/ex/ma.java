package util.h.xy.ex;

/* loaded from: classes5.dex */
public final class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26736(long j, long[] jArr, int i) {
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 83) << 1) - (i2 ^ 83)) % 128;
        long m26739 = util.h.xy.ex.ra.m26739(util.h.xy.ex.ra.m26739(util.h.xy.ex.ra.m26739(util.h.xy.ex.ra.m26739(util.h.xy.ex.ra.m26739(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = m26739 & (-6148914691236517206L);
        int i3 = -(-(i * 407));
        int i4 = ~i;
        int i5 = ~(i4 | i);
        int i6 = i4 | 1;
        int i7 = ~((i6 ^ i) | (i6 & i));
        int i8 = ((((i3 ^ lib.android.paypal.com.magnessdk.g.e) + ((i3 & lib.android.paypal.com.magnessdk.g.e) << 1)) - (~(((i5 & i7) | (i5 ^ i7)) * (-406)))) - 1) + ((~((i4 ^ 1) | (i4 & 1))) * (-406));
        int i9 = ~((i & (-2)) | (i ^ (-2)));
        int i10 = ~((i ^ i4) | (i & i4));
        int i11 = ((i10 ^ i9) | (i10 & i9)) * 406;
        jArr[(i8 ^ i11) + ((i11 & i8) << 1)] = (m26739 << 1) & (-6148914691236517206L);
        int i12 = getHighSpeedVideoSizes + 101;
        getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
