package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class BrowserPublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzo();
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions zza;
    private final android.net.Uri zzb;
    private final byte[] zzc;

    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions zza;
        private android.net.Uri zzb;
        private byte[] zzc;

        public final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions build() {
            return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions(this.zza, this.zzb, this.zzc);
        }

        public final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setClientDataHash(byte[] bArr) {
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(bArr);
            this.zzc = bArr;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setOrigin(android.net.Uri uri) {
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(uri);
            this.zzb = uri;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setPublicKeyCredentialRequestOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            this.zza = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
            return this;
        }
    }

    BrowserPublicKeyCredentialRequestOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, android.net.Uri uri, byte[] bArr) {
        this.zza = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
        zzc(uri);
        this.zzb = uri;
        zzd(bArr);
        this.zzc = bArr;
    }

    public static com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    private static android.net.Uri zzc(android.net.Uri uri) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(uri);
        com.google.android.gms.common.internal.Preconditions.checkArgument(uri.getScheme() != null, "origin scheme must be non-empty");
        com.google.android.gms.common.internal.Preconditions.checkArgument(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] zzd(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, browserPublicKeyCredentialRequestOptions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, browserPublicKeyCredentialRequestOptions.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
        return this.zza.getRequestId();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public final java.lang.String toString() {
        byte[] bArr = this.zzc;
        android.net.Uri uri = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(uri);
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=");
        sb.append(valueOf);
        sb.append(", \n origin=");
        sb.append(valueOf2);
        sb.append(", \n clientDataHash=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getPublicKeyCredentialRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getOrigin(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getClientDataHash(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions getPublicKeyCredentialRequestOptions() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public android.net.Uri getOrigin() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public byte[] getClientDataHash() {
        return this.zzc;
    }

    static /* synthetic */ byte[] zzb(byte[] bArr) {
        zzd(bArr);
        return bArr;
    }

    static /* synthetic */ android.net.Uri zza(android.net.Uri uri) {
        zzc(uri);
        return uri;
    }
}
