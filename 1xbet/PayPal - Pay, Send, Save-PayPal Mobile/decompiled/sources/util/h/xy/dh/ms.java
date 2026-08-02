package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ms extends util.h.xy.dh.rk {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            rjVar.getHighSpeedVideoFpsRangesFor(z, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, this.f1212);
        } else {
            rjVar.getHighSpeedVideoFpsRangesFor(z, 49, this.f1212);
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i2 | 29) << 1) - (i2 ^ 29)) % 128;
        if (z) {
            Camera2StreamConfigurationMap = ((i2 & 11) + (i2 | 11)) % 128;
            i = 4;
        } else {
            Camera2StreamConfigurationMap = ((i2 & 87) + (i2 | 87)) % 128;
            i = 3;
        }
        int length = this.f1212.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i4 ^ 9) + ((i4 & 9) << 1)) % 128;
            int highSpeedVideoFpsRanges = this.f1212[i3].mo26279().getHighSpeedVideoFpsRanges(true);
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i5 = highSpeedVideoFpsRanges * com.knotapi.knot.utilities.Constants.ID_KROGER;
            int i6 = -(-(i * com.knotapi.knot.utilities.Constants.ID_KROGER));
            int i7 = (highSpeedVideoFpsRanges ^ i) | (highSpeedVideoFpsRanges & i);
            int i8 = ~identityHashCode;
            int i9 = ~highSpeedVideoFpsRanges;
            int i10 = ~(i9 | i8);
            int i11 = ~i;
            int i12 = (~((highSpeedVideoFpsRanges ^ i11) | (i11 & highSpeedVideoFpsRanges))) | (~((identityHashCode ^ highSpeedVideoFpsRanges) | (highSpeedVideoFpsRanges & identityHashCode)));
            int i13 = ~((i9 ^ i8) | (i9 & i8) | i);
            i = ((((((i5 & i6) + (i5 | i6)) + (((i7 & i8) | (i7 ^ i8)) * (-369))) - (~(((i ^ i10) | (i10 & i)) * (-369)))) - 1) - (~(((i13 & i12) | (i12 ^ i13)) * 369))) - 1;
            int i14 = (i3 ^ (-45)) + ((i3 & (-45)) << 1);
            i3 = (i14 ^ 46) + ((i14 & 46) << 1);
            int i15 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i15 & 29) + (i15 | 29)) % 128;
        }
        int i16 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (((i16 | 63) << 1) - (i16 ^ 63)) % 128;
        return i;
    }

    ms(util.h.xy.dh.c[] cVarArr) {
        super(false, cVarArr);
    }

    public ms(util.h.xy.dh.d dVar) {
        super(dVar, false);
    }

    public ms() {
    }
}
