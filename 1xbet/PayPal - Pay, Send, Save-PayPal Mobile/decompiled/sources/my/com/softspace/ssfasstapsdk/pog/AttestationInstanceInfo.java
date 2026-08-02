package my.com.softspace.ssfasstapsdk.pog;

/* loaded from: classes17.dex */
public class AttestationInstanceInfo {
    private java.lang.String deviceId;
    private java.lang.String instanceId;
    private java.lang.Long sessionId;
    private java.lang.String token;
    private java.lang.String tokenSignature;

    public java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(java.lang.String str) {
        this.deviceId = str;
    }

    public java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(java.lang.String str) {
        this.instanceId = str;
    }

    public java.lang.Long getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(java.lang.Long l) {
        this.sessionId = l;
    }

    public java.lang.String getToken() {
        return this.token;
    }

    public void setToken(java.lang.String str) {
        this.token = str;
    }

    public java.lang.String getTokenSignature() {
        return this.tokenSignature;
    }

    public void setTokenSignature(java.lang.String str) {
        this.tokenSignature = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AttestationInstanceInfo{deviceId='");
        sb.append(this.deviceId);
        sb.append("', instanceId='");
        sb.append(this.instanceId);
        sb.append("', sessionId=");
        sb.append(this.sessionId);
        sb.append(", token='");
        sb.append(this.token);
        sb.append("', tokenSignature='");
        sb.append(this.tokenSignature);
        sb.append("'}");
        return sb.toString();
    }
}
