package my.com.softspace.sspog;

/* loaded from: classes17.dex */
public class SSPOGInstanceInfo {
    private java.lang.Long Camera2StreamConfigurationMap;
    private java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getOutputMinFrameDuration;

    public java.lang.String getDeviceId() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDeviceId(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.String getInstanceId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setInstanceId(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.Long getSessionId() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setSessionId(java.lang.Long l) {
        this.Camera2StreamConfigurationMap = l;
    }

    public java.lang.String getToken() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setToken(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public java.lang.String getTokenSignature() {
        return this.getOutputMinFrameDuration;
    }

    public void setTokenSignature(java.lang.String str) {
        this.getOutputMinFrameDuration = str;
    }

    public java.lang.Long getAttestId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setAttestId(java.lang.Long l) {
        this.getHighResolutionOutputSizeshNQ4ISI = l;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SSPOGInstanceInfo{deviceId='");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("', instanceId='");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("', sessionId=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", token='");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("', tokenSignature='");
        sb.append(this.getOutputMinFrameDuration);
        sb.append("', attestId=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
