package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends java.lang.Exception {

    @java.lang.Deprecated
    protected final com.google.android.gms.common.api.Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(com.google.android.gms.common.api.Status status) {
        super(r2.toString());
        int statusCode = status.getStatusCode();
        java.lang.String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(statusCode).length() + 2 + java.lang.String.valueOf(statusMessage).length());
        sb.append(statusCode);
        sb.append(": ");
        sb.append(statusMessage);
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }
}
