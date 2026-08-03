package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticatorErrorResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzl();
    private final com.google.android.gms.fido.fido2.api.common.ErrorCode zza;
    private final java.lang.String zzb;
    private final int zzc;

    AuthenticatorErrorResponse(int i, java.lang.String str, int i2) {
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.ErrorCode.toErrorCode(i);
            this.zzb = str;
            this.zzc = i2;
        } catch (com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticatorErrorResponse.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticatorErrorResponse.zzb) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(authenticatorErrorResponse.zzc));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.android.gms.fido.fido2.api.common.ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public java.lang.String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Integer.valueOf(this.zzc));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
