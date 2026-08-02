package my.com.softspace.ssfasstapsdk.internal.configuration;

/* loaded from: classes17.dex */
public class SDKPogConfiguration implements sspog.SSPOGProperties {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.Boolean CoroutineDebuggingKt;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.Boolean getInputFormats;
    private java.lang.Boolean getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private long getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private long getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.String isOutputSupportedFor;
    private long isOutputSupportedForhNQ4ISI;
    private long toString;
    private java.lang.String unwrapAs;

    @Override // sspog.SSPOGProperties
    public boolean isLogEnable() {
        return false;
    }

    @Override // sspog.SSPOGProperties
    public long getMinimumRefreshInterval() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // sspog.SSPOGProperties
    public long getRefreshInterval() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.String getAccesskey() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.String getSecretkey() {
        return this.isOutputSupportedFor;
    }

    @Override // sspog.SSPOGProperties
    @java.lang.Deprecated
    public java.lang.String getGoogleApiKey() {
        return this.getOutputFormats;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.String getPlayProjectNumber() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.Boolean isEnableAttestation() {
        return this.getInputFormats;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.Boolean isEnableSSPOGAppLifecycleService() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.String foregroundServiceTitle() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // sspog.SSPOGProperties
    public java.lang.String foregroundServiceContent() {
        return this.getOutputMinFrameDuration;
    }

    @Override // sspog.SSPOGProperties
    public android.graphics.drawable.Drawable getAppIcon() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.String getKeyLoadingHost() {
        return this.unwrapAs;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.String getKeyLoadingHostCertPinning() {
        return this.getOutputSizes;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.String getHost() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // my.com.softspace.common.CommonProperties
    public long getConnectTimeout() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // my.com.softspace.common.CommonProperties
    public long getReadTimeout() {
        return this.toString;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.String getCertificatePinning() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.Boolean getStrictHttp() {
        return this.CoroutineDebuggingKt;
    }

    @Override // my.com.softspace.common.CommonProperties
    public java.lang.String getKeyLoadingCACert() {
        return this.getOutputStallDuration;
    }

    @Override // my.com.softspace.common.CommonProperties
    public long getKeepAliveDuration() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // sspog.SSPOGProperties, my.com.softspace.common.CommonProperties
    public java.lang.String getClientID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setMinRefreshInterval(long j) {
        this.isOutputSupportedForhNQ4ISI = j;
    }

    public void setRefreshInterval(long j) {
        this.getValidOutputFormatsForInputhNQ4ISI = j;
    }

    public void setAccessKey(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public void setSecretKey(java.lang.String str) {
        this.isOutputSupportedFor = str;
    }

    @java.lang.Deprecated
    public void setGoogleApiKey(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public void setGooglePlayProjNum(java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
    }

    public void setHost(java.lang.String str) {
        this.getOutputSizeshNQ4ISI = str;
    }

    public void setConnectionTimeout(long j) {
        this.getHighSpeedVideoFpsRanges = j;
    }

    public void setReadTimeout(long j) {
        this.toString = j;
    }

    public void setCertificatePinning(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public void setStrictHttp(java.lang.Boolean bool) {
        this.CoroutineDebuggingKt = bool;
    }

    public void setEnableAttestation(java.lang.Boolean bool) {
        this.getInputFormats = bool;
    }

    public void setEnableForegroundService(java.lang.Boolean bool) {
        this.getInputSizeshNQ4ISI = bool;
    }

    public void setForegroundServiceTitle(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public void setForegroundServiceContent(java.lang.String str) {
        this.getOutputMinFrameDuration = str;
    }

    public void setAppIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRangesFor = drawable;
    }

    public void setKeyloadingHost(java.lang.String str) {
        this.unwrapAs = str;
    }

    public void setKeyLoadingHostCertPinning(java.lang.String str) {
        this.getOutputSizes = str;
    }

    public void setKeyLoadingCACert(java.lang.String str) {
        this.getOutputStallDuration = str;
    }

    public void setKeepAliveDuration(long j) {
        this.getOutputMinFrameDurationlomOqCM = j;
    }

    public void setClientID(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
