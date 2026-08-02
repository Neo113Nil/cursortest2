package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class SensorValues {
    java.lang.Integer Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Long getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;

    SensorValues() {
        this(false, -1, -1L, "NA");
    }

    SensorValues(java.lang.Integer num, java.lang.Long l, java.lang.String str) {
        this(true, num, l, str);
    }

    private SensorValues(boolean z, java.lang.Integer num, java.lang.Long l, java.lang.String str) {
        this.Camera2StreamConfigurationMap = num;
        this.getHighSpeedVideoFpsRangesFor = l;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = z;
    }

    org.json.JSONObject getHighSpeedVideoFpsRanges() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("availability", java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
            if (this.getHighSpeedVideoFpsRanges) {
                jSONObject.putOpt("accuracy", this.Camera2StreamConfigurationMap);
                jSONObject.putOpt("timestamp", this.getHighSpeedVideoFpsRangesFor);
                jSONObject.putOpt("reading", this.getHighSpeedVideoSizes);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
