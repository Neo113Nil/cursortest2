package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialCreationOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzak();
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;
    private final byte[] zzc;
    private final java.util.List zzd;
    private final java.lang.Double zze;
    private final java.util.List zzf;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;
    private final java.lang.Integer zzh;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;
    private final com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;
        private byte[] zzc;
        private java.util.List zzd;
        private java.lang.Double zze;
        private java.util.List zzf;
        private com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;
        private java.lang.Integer zzh;
        private com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;
        private com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions build() {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
            byte[] bArr = this.zzc;
            java.util.List list = this.zzd;
            java.lang.Double d = this.zze;
            java.util.List list2 = this.zzf;
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
            java.lang.Integer num = this.zzh;
            com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = this.zzi;
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference = this.zzj;
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.zzk);
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference) {
            this.zzj = attestationConveyancePreference;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            this.zzk = authenticationExtensions;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticatorSelection(com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.zzg = authenticatorSelectionCriteria;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setChallenge(byte[] bArr) {
            this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setExcludeList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> list) {
            this.zzf = list;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setParameters(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> list) {
            this.zzd = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRequestId(java.lang.Integer num) {
            this.zzh = num;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRp(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.zza = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialRpEntity);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zze = d;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding) {
            this.zzi = tokenBinding;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setUser(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.zzb = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialUserEntity);
            return this;
        }
    }

    PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, java.util.List list, java.lang.Double d, java.util.List list2, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria, java.lang.Integer num, com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding, java.lang.String str, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
        this.zza = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        this.zzb = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzd = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zze = d;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(str);
            } catch (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredentialCreationOptions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialCreationOptions.zzb) && java.util.Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zze, publicKeyCredentialCreationOptions.zze) && this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) && publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) && (((list = this.zzf) == null && publicKeyCredentialCreationOptions.zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf))) && com.google.android.gms.common.internal.Objects.equal(this.zzg, publicKeyCredentialCreationOptions.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, publicKeyCredentialCreationOptions.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, publicKeyCredentialCreationOptions.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, publicKeyCredentialCreationOptions.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, publicKeyCredentialCreationOptions.zzk);
    }

    public com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }

    public java.lang.String getAttestationConveyancePreferenceAsString() {
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zzc;
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getExcludeList() {
        return this.zzf;
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> getParameters() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
        return this.zzh;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
        return this.zzi;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getRp(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getUser(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getChallenge(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getParameters(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 6, getTimeoutSeconds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 7, getExcludeList(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, getAuthenticatorSelection(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 9, getRequestId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, getTokenBinding(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, getAttestationConveyancePreferenceAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, getAuthenticationExtensions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
