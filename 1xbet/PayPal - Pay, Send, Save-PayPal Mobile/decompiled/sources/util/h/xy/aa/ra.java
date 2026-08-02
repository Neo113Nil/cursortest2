package util.h.xy.aa;

/* loaded from: classes18.dex */
public class ra implements com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMCancellationSignal {
    static int Camera2StreamConfigurationMap = 33;
    static int getHighResolutionOutputSizeshNQ4ISI;
    private android.os.CancellationSignal getHighSpeedVideoFpsRanges = new android.os.CancellationSignal();
    androidx.core.os.CancellationSignal getHighSpeedVideoSizes = new androidx.core.os.CancellationSignal();

    static {
        int i = 33 % 2;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMCancellationSignal
    public void cancel() {
        int i;
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f665);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bf.mb.f938.m25426().m25400();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            if (!this.getHighSpeedVideoSizes.isCanceled()) {
                this.getHighSpeedVideoSizes.cancel();
                int i2 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i2 & 75) + (i2 | 75)) % 128;
            }
        } else {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = (i3 & 113) + (i3 | 113);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                this.getHighSpeedVideoFpsRanges.isCanceled();
                throw null;
            }
            if (this.getHighSpeedVideoFpsRanges.isCanceled()) {
                i = getHighResolutionOutputSizeshNQ4ISI + 9;
            } else {
                this.getHighSpeedVideoFpsRanges.cancel();
                i = getHighResolutionOutputSizeshNQ4ISI + 75;
            }
            Camera2StreamConfigurationMap = i % 128;
        }
        int i5 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i5 | 89) << 1) - (i5 ^ 89)) % 128;
    }

    final android.os.CancellationSignal getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 11) + ((i & 11) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        android.os.CancellationSignal cancellationSignal = this.getHighSpeedVideoFpsRanges;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return cancellationSignal;
        }
        throw null;
    }
}
