package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class SoftwareInfo {
    private final java.util.List<my.com.softspace.sspog.attest.SoftwarePackageInfo> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.Boolean getOutputFormats;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputStallDurationlomOqCM;
    private final java.lang.String getOutputStallDuration = "ANDROID";
    private final java.lang.String Camera2StreamConfigurationMap = android.os.Build.VERSION.BASE_OS;
    private final java.lang.Integer getOutputSizes = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
    private final java.lang.String getOutputSizeshNQ4ISI = android.os.Build.VERSION.RELEASE;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = android.os.Build.VERSION.INCREMENTAL;
    private final java.lang.String getHighSpeedVideoFpsRanges = android.os.Build.VERSION.CODENAME;
    private final java.lang.String isOutputSupportedForhNQ4ISI = android.os.Build.TYPE;
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI = android.os.Build.VERSION.SECURITY_PATCH;
    private final java.lang.String getInputSizeshNQ4ISI = android.os.Build.FINGERPRINT;
    private final java.lang.String getHighSpeedVideoSizesFor = android.os.Build.HOST;
    private final java.lang.String isOutputSupportedFor = android.os.Build.USER;
    private final java.lang.String getOutputMinFrameDuration = android.os.Build.DISPLAY;
    private final java.lang.String getInputFormats = android.os.Build.ID;

    SoftwareInfo(android.content.Context context, boolean z, boolean z2) {
        this.getOutputStallDurationlomOqCM = null;
        if (z) {
            this.getOutputFormats = java.lang.Boolean.FALSE;
        } else {
            this.getOutputFormats = java.lang.Boolean.valueOf(android.provider.Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 1 || android.provider.Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1);
        }
        if (z2) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.util.List<android.content.pm.ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            for (android.content.pm.ApplicationInfo applicationInfo : installedApplications) {
                this.getHighSpeedVideoFpsRangesFor.add(new my.com.softspace.sspog.attest.SoftwarePackageInfo(applicationInfo.packageName, packageManager.getApplicationLabel(applicationInfo).toString(), packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null));
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.getOutputStallDurationlomOqCM = java.lang.System.getProperty(com.datadog.trace.bootstrap.instrumentation.api.Tags.OS_VERSION);
        this.getOutputMinFrameDurationlomOqCM = java.lang.System.getProperty("os.arch");
        this.getHighSpeedVideoSizes = java.lang.System.getProperty("java.vm.version");
    }

    final org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("id", this.getInputFormats);
            jSONObject.putOpt(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, this.getOutputMinFrameDuration);
            jSONObject.putOpt(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Fingerprint, this.getInputSizeshNQ4ISI);
            jSONObject.putOpt("user", this.isOutputSupportedFor);
            jSONObject.putOpt(com.datadog.android.log.LogAttributes.HOST, this.getHighSpeedVideoSizesFor);
            jSONObject.putOpt("type", this.isOutputSupportedForhNQ4ISI);
            jSONObject.putOpt(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, this.getOutputStallDuration);
            jSONObject.putOpt("baseOs", this.Camera2StreamConfigurationMap);
            jSONObject.putOpt("codename", this.getHighSpeedVideoFpsRanges);
            jSONObject.putOpt("buildId", this.getHighResolutionOutputSizeshNQ4ISI);
            jSONObject.putOpt("release", this.getOutputSizeshNQ4ISI);
            jSONObject.putOpt("sdk", this.getOutputSizes);
            jSONObject.putOpt("securityPatch", this.getValidOutputFormatsForInputhNQ4ISI);
            jSONObject.putOpt("developerOptionEnabled", this.getOutputFormats);
            jSONObject.putOpt("kernelVersion", this.getOutputStallDurationlomOqCM);
            jSONObject.putOpt("artVersion", this.getHighSpeedVideoSizes);
            jSONObject.putOpt("osarch", this.getOutputMinFrameDurationlomOqCM);
            java.util.List<my.com.softspace.sspog.attest.SoftwarePackageInfo> list = this.getHighSpeedVideoFpsRangesFor;
            if (list != null && list.size() > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<my.com.softspace.sspog.attest.SoftwarePackageInfo> it = this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().Camera2StreamConfigurationMap());
                }
                jSONObject.putOpt("applications", jSONArray);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
