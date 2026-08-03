package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public class ErrorResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ErrorResponseData> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzd();
    public static final java.lang.String JSON_ERROR_CODE = "errorCode";
    public static final java.lang.String JSON_ERROR_MESSAGE = "errorMessage";
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;
    private final java.lang.String zzb;

    ErrorResponseData(int i, java.lang.String str) {
        this.zza = com.google.android.gms.fido.u2f.api.common.ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.ErrorResponseData)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.ErrorResponseData errorResponseData = (com.google.android.gms.fido.u2f.api.common.ErrorResponseData) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, errorResponseData.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, errorResponseData.zzb);
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public java.lang.String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public final org.json.JSONObject toJsonObject() {
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
        com.google.android.gms.internal.fido.zzaj zza = com.google.android.gms.internal.fido.zzak.zza(this);
        zza.zza("errorCode", this.zza.getCode());
        java.lang.String str = this.zzb;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode) {
        this.zza = (com.google.android.gms.fido.u2f.api.common.ErrorCode) com.google.android.gms.common.internal.Preconditions.checkNotNull(errorCode);
        this.zzb = null;
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode, java.lang.String str) {
        this.zza = (com.google.android.gms.fido.u2f.api.common.ErrorCode) com.google.android.gms.common.internal.Preconditions.checkNotNull(errorCode);
        this.zzb = str;
    }
}
