package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzao();
    private final byte[] zza;
    private final java.lang.Double zzb;
    private final java.lang.String zzc;
    private final java.util.List zzd;
    private final java.lang.Integer zze;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
    private final com.google.android.gms.fido.fido2.api.common.zzay zzg;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;
    private final java.lang.Long zzi;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private byte[] zza;
        private java.lang.Double zzb;
        private java.lang.String zzc;
        private java.util.List zzd;
        private java.lang.Integer zze;
        private com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
        private com.google.android.gms.fido.fido2.api.common.zzay zzg;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;

        public Builder() {
        }

        public Builder(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.zza = publicKeyCredentialRequestOptions.getChallenge();
                this.zzb = publicKeyCredentialRequestOptions.getTimeoutSeconds();
                this.zzc = publicKeyCredentialRequestOptions.getRpId();
                this.zzd = publicKeyCredentialRequestOptions.getAllowList();
                this.zze = publicKeyCredentialRequestOptions.getRequestId();
                this.zzf = publicKeyCredentialRequestOptions.getTokenBinding();
                this.zzg = publicKeyCredentialRequestOptions.zza();
                this.zzh = publicKeyCredentialRequestOptions.getAuthenticationExtensions();
            }
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions build() {
            byte[] bArr = this.zza;
            java.lang.Double d = this.zzb;
            java.lang.String str = this.zzc;
            java.util.List list = this.zzd;
            java.lang.Integer num = this.zze;
            com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = this.zzf;
            com.google.android.gms.fido.fido2.api.common.zzay zzayVar = this.zzg;
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions(bArr, d, str, list, num, tokenBinding, zzayVar == null ? null : zzayVar.toString(), this.zzh, null);
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAllowList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> list) {
            this.zzd = list;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            this.zzh = authenticationExtensions;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setChallenge(byte[] bArr) {
            this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRequestId(java.lang.Integer num) {
            this.zze = num;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRpId(java.lang.String str) {
            this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zzb = d;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding) {
            this.zzf = tokenBinding;
            return this;
        }
    }

    PublicKeyCredentialRequestOptions(byte[] bArr, java.lang.Double d, java.lang.String str, java.util.List list, java.lang.Integer num, com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding, java.lang.String str2, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions, java.lang.Long l) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = d;
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzd = list;
        this.zze = num;
        this.zzf = tokenBinding;
        this.zzi = l;
        if (str2 != null) {
            try {
                this.zzg = com.google.android.gms.fido.fido2.api.common.zzay.zza(str2);
            } catch (com.google.android.gms.fido.fido2.api.common.zzax e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = authenticationExtensions;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) obj;
        return java.util.Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialRequestOptions.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredentialRequestOptions.zzc) && (((list = this.zzd) == null && publicKeyCredentialRequestOptions.zzd == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.zzd) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd))) && com.google.android.gms.common.internal.Objects.equal(this.zze, publicKeyCredentialRequestOptions.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, publicKeyCredentialRequestOptions.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, publicKeyCredentialRequestOptions.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, publicKeyCredentialRequestOptions.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, publicKeyCredentialRequestOptions.zzi);
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getAllowList() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
        return this.zze;
    }

    public java.lang.String getRpId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
        return this.zzf;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getRpId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getAllowList(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 6, getRequestId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getTokenBinding(), i, false);
        com.google.android.gms.fido.fido2.api.common.zzay zzayVar = this.zzg;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, zzayVar == null ? null : zzayVar.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getAuthenticationExtensions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fido.fido2.api.common.zzay zza() {
        return this.zzg;
    }
}
