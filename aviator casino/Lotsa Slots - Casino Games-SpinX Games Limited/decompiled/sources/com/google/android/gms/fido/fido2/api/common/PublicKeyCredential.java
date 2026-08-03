package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredential> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzal();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final byte[] zzc;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse zzd;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse zze;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse zzf;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzg;
    private final java.lang.String zzh;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder {
        private java.lang.String zza;
        private byte[] zzb;
        private com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse zzc;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzd;
        private java.lang.String zze;

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential build() {
            com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse authenticatorResponse = this.zzc;
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential(this.zza, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) authenticatorResponse : null, this.zzd, this.zze);
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.zzd = authenticationExtensionsClientOutputs;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticatorAttachment(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setRawId(byte[] bArr) {
            this.zzb = bArr;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setResponse(com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse authenticatorResponse) {
            this.zzc = authenticatorResponse;
            return this;
        }
    }

    PublicKeyCredential(java.lang.String str, java.lang.String str2, byte[] bArr, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, java.lang.String str3) {
        boolean z = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredential deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredential)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential publicKeyCredential = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredential.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredential.zzb) && java.util.Arrays.equals(this.zzc, publicKeyCredential.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, publicKeyCredential.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, publicKeyCredential.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, publicKeyCredential.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, publicKeyCredential.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    public java.lang.String getAuthenticatorAttachment() {
        return this.zzh;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    public java.lang.String getId() {
        return this.zza;
    }

    public byte[] getRawId() {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse getResponse() {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new java.lang.IllegalStateException("No response set.");
    }

    public java.lang.String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
