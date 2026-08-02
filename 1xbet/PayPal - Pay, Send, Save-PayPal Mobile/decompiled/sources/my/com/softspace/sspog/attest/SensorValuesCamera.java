package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class SensorValuesCamera extends my.com.softspace.sspog.attest.SensorValues {
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    SensorValuesCamera() {
    }

    @Override // my.com.softspace.sspog.attest.SensorValues
    final org.json.JSONObject getHighSpeedVideoFpsRanges() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            this.getHighSpeedVideoFpsRanges = false;
        }
        org.json.JSONObject highSpeedVideoFpsRanges = super.getHighSpeedVideoFpsRanges();
        try {
            highSpeedVideoFpsRanges.putOpt(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (org.json.JSONException unused) {
        }
        return highSpeedVideoFpsRanges;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(new java.util.Date().getTime());
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    public final void getHighSpeedVideoSizes(long j, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = true;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(j);
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }
}
