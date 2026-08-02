package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
public class SoftwarePackageInfo {
    private final boolean Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public SoftwarePackageInfo(java.lang.String str, java.lang.String str2, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = z;
    }

    final org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("packageId", this.getHighSpeedVideoFpsRanges);
            jSONObject.putOpt("appName", this.getHighResolutionOutputSizeshNQ4ISI);
            jSONObject.putOpt("hasEntry", java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
