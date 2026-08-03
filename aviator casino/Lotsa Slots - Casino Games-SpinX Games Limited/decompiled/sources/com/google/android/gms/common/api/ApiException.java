package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class ApiException extends java.lang.Exception {

    @java.lang.Deprecated
    protected final com.google.android.gms.common.api.Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(com.google.android.gms.common.api.Status status) {
        super(r4.toString());
        int statusCode = status.getStatusCode();
        java.lang.String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(statusCode).length() + 2 + java.lang.String.valueOf(statusMessage).length());
        sb.append(statusCode);
        sb.append(": ");
        sb.append(statusMessage);
        this.mStatus = status;
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
