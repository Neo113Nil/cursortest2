package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes3.dex */
public final class DeviceCVMEligibilityResult {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport getHighResolutionOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport getHighSpeedVideoFpsRanges;

    DeviceCVMEligibilityResult(android.content.Context context) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f603);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getHighSpeedVideoFpsRanges = util.h.xy.aa.rb.m24534(context);
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.aa.rb.m24533(context);
    }

    public final com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport getBiometricsSupport() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f603);
        sb.append(util.h.xy.al.ra.f833);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport biometricsSupport = this.getHighSpeedVideoFpsRanges;
        int i = getHighSpeedVideoSizes + 85;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return biometricsSupport;
        }
        throw null;
    }

    public final com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport getDeviceKeyguardSupport() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f603);
        sb.append(util.h.xy.al.ra.f346);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport deviceKeyguardSupport = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 7) % 128;
        return deviceKeyguardSupport;
    }
}
