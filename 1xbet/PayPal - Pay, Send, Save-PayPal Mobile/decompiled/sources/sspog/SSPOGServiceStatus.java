package sspog;

/* loaded from: classes18.dex */
public class SSPOGServiceStatus {
    private java.lang.String message;
    private java.lang.String status;

    public SSPOGServiceStatus() {
    }

    public SSPOGServiceStatus(java.lang.String str, java.lang.String str2) {
        this.status = str;
        this.message = str2;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String str) {
        this.status = str;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SSPOGServiceStatus{status='");
        sb.append(this.status);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("'}");
        return sb.toString();
    }
}
