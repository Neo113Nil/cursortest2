package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class Error {
    public static final java.lang.String JSON_ERROR_CODE = "errorCode";
    public static final java.lang.String JSON_ERROR_MESSAGE = "errorMessage";
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;
    private final java.lang.String zzb;

    public org.json.JSONObject toJsonObject() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            java.lang.String str = this.zzb;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        if (this.zzb == null) {
            return java.lang.String.format(java.util.Locale.ENGLISH, "{errorCode: %d}", java.lang.Integer.valueOf(this.zza.getCode()));
        }
        com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode = this.zza;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        int code = errorCode.getCode();
        return java.lang.String.format(locale, "{errorCode: %d, errorMessage: %s}", java.lang.Integer.valueOf(code), this.zzb);
    }

    public java.lang.String getErrorMessage() {
        return this.zzb;
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode() {
        return this.zza;
    }

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode, java.lang.String str) {
        this.zza = errorCode;
        this.zzb = str;
    }

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }
}
