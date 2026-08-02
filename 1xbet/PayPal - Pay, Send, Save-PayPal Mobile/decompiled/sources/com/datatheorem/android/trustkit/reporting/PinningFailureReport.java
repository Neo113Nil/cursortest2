package com.datatheorem.android.trustkit.reporting;

/* loaded from: classes8.dex */
public class PinningFailureReport implements java.io.Serializable {
    private final java.lang.String Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.util.List<java.lang.String> getHighSpeedVideoSizes;
    private final java.util.Date getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final java.util.Set<com.datatheorem.android.trustkit.config.PublicKeyPin> getOutputMinFrameDuration;
    private final com.datatheorem.android.trustkit.pinning.PinningValidationResult getOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.String> getOutputStallDuration;
    private final java.lang.String getOutputStallDurationlomOqCM;

    PinningFailureReport(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, boolean z, boolean z2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.Date date, java.util.Set<com.datatheorem.android.trustkit.config.PublicKeyPin> set, com.datatheorem.android.trustkit.pinning.PinningValidationResult pinningValidationResult) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getOutputStallDurationlomOqCM = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getInputFormats = str5;
        this.getOutputFormats = z;
        this.getInputSizeshNQ4ISI = z2;
        this.getOutputStallDuration = list;
        this.getHighSpeedVideoSizes = list2;
        this.getHighSpeedVideoSizesFor = date;
        this.getOutputMinFrameDuration = set;
        this.getOutputSizeshNQ4ISI = pinningValidationResult;
    }

    final org.json.JSONObject getHighSpeedVideoFpsRangesFor() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("app-bundle-id", this.getHighSpeedVideoFpsRanges);
            jSONObject.put("app-version", java.lang.String.valueOf(this.Camera2StreamConfigurationMap));
            jSONObject.put("app-vendor-id", this.getHighSpeedVideoFpsRangesFor);
            jSONObject.put("app-platform", "ANDROID");
            jSONObject.put("trustkit-version", com.datatheorem.android.trustkit.BuildConfig.VERSION_NAME);
            jSONObject.put("hostname", this.getOutputStallDurationlomOqCM);
            jSONObject.put("port", this.getHighResolutionOutputSizeshNQ4ISI);
            jSONObject.put("noted-hostname", this.getInputFormats);
            jSONObject.put("include-subdomains", this.getOutputFormats);
            jSONObject.put("enforce-pinning", this.getInputSizeshNQ4ISI);
            jSONObject.put("validation-result", this.getOutputSizeshNQ4ISI.ordinal());
            jSONObject.put("date-time", android.text.format.DateFormat.format("yyyy-MM-dd'T'HH:mm:ssZ", this.getHighSpeedVideoSizesFor));
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<java.lang.String> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("validated-certificate-chain", jSONArray);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator<java.lang.String> it2 = this.getOutputStallDuration.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("served-certificate-chain", jSONArray2);
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            for (com.datatheorem.android.trustkit.config.PublicKeyPin publicKeyPin : this.getOutputMinFrameDuration) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("pin-sha256=\"");
                sb.append(publicKeyPin.toString());
                sb.append("\"");
                jSONArray3.put(sb.toString());
            }
            jSONObject.put("known-pins", jSONArray3);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON error for report: ");
            sb2.append(toString());
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    public java.lang.String toString() {
        try {
            return getHighSpeedVideoFpsRangesFor().toString(2);
        } catch (org.json.JSONException unused) {
            return getHighSpeedVideoFpsRangesFor().toString();
        }
    }

    public java.lang.String getNotedHostname() {
        return this.getInputFormats;
    }

    public java.lang.String getServerHostname() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.datatheorem.android.trustkit.pinning.PinningValidationResult getValidationResult() {
        return this.getOutputSizeshNQ4ISI;
    }
}
