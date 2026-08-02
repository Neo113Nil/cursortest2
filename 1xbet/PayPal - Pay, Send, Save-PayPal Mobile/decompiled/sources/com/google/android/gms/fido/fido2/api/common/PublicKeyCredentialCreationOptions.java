package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzan();
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
    private final java.lang.String zzl;
    private android.os.ResultReceiver zzm;

    PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, java.util.List list, java.lang.Double d, java.util.List list2, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria, java.lang.Integer num, com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding, java.lang.String str, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions, java.lang.String str2, android.os.ResultReceiver resultReceiver) {
        this.zzm = resultReceiver;
        if (str2 != null) {
            try {
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zza = zza(new org.json.JSONObject(str2));
                this.zza = zza.zza;
                this.zzb = zza.zzb;
                this.zzc = zza.zzc;
                this.zzd = zza.zzd;
                this.zze = zza.zze;
                this.zzf = zza.zzf;
                this.zzg = zza.zzg;
                this.zzh = zza.zzh;
                this.zzi = zza.zzi;
                this.zzj = zza.zzj;
                this.zzk = zza.zzk;
                this.zzl = str2;
                return;
            } catch (org.json.JSONException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }
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
            } catch (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                throw new java.lang.IllegalArgumentException(e2);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
        this.zzl = null;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zza(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.google.android.gms.internal.fido.zzbl zzc;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder();
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity> creator = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR;
        builder.setRp(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity> creator2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR;
        builder.setUser(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        builder.setChallenge(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE)));
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> creator3 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR;
            try {
                zzc = com.google.android.gms.internal.fido.zzbl.zzd(new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (java.lang.IllegalArgumentException unused) {
                zzc = com.google.android.gms.internal.fido.zzbl.zzc();
            }
            if (zzc.zzb()) {
                arrayList.add(zzc.zza());
            }
        }
        builder.setParameters(arrayList);
        if (jSONObject.has(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT)) {
            builder.setTimeoutSeconds(java.lang.Double.valueOf(jSONObject.getDouble(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT) / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.zza(jSONArray2.getJSONObject(i2)));
            }
            builder.setExcludeList(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria> creator4 = com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR;
            builder.setAuthenticatorSelection(new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? java.lang.Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
            builder.setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.zza(jSONObject.getJSONObject(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)));
        }
        if (jSONObject.has("attestation")) {
            try {
                builder.setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(jSONObject.getString("attestation")));
            } catch (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                builder.setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.NONE);
            }
        }
        return builder.build();
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredentialCreationOptions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialCreationOptions.zzb) && java.util.Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zze, publicKeyCredentialCreationOptions.zze) && this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) && publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) && (((list = this.zzf) == null && publicKeyCredentialCreationOptions.zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf))) && com.google.android.gms.common.internal.Objects.equal(this.zzg, publicKeyCredentialCreationOptions.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, publicKeyCredentialCreationOptions.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, publicKeyCredentialCreationOptions.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, publicKeyCredentialCreationOptions.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, publicKeyCredentialCreationOptions.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zzl, publicKeyCredentialCreationOptions.zzl);
    }

    public int hashCode() {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        int hashCode = java.util.Arrays.hashCode(this.zzc);
        return com.google.android.gms.common.internal.Objects.hashCode(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, java.lang.Integer.valueOf(hashCode), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        if (!com.google.android.gms.internal.fido.zzia.zzd()) {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder builder = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder();
        builder.setRp(this.zza);
        builder.setUser(this.zzb);
        builder.setChallenge(this.zzc);
        builder.setParameters(this.zzd);
        builder.setTimeoutSeconds(this.zze);
        builder.setExcludeList(this.zzf);
        builder.setAuthenticatorSelection(this.zzg);
        builder.setRequestId(this.zzh);
        builder.setTokenBinding(this.zzi);
        builder.setAttestationConveyancePreference(this.zzj);
        builder.setAuthenticationExtensions(this.zzk);
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    public final java.lang.String toString() {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = this.zzk;
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = this.zzi;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
        java.util.List list = this.zzf;
        java.util.List list2 = this.zzd;
        byte[] bArr = this.zzc;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(publicKeyCredentialUserEntity);
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(bArr);
        java.lang.String valueOf3 = java.lang.String.valueOf(list2);
        java.lang.String valueOf4 = java.lang.String.valueOf(list);
        java.lang.String valueOf5 = java.lang.String.valueOf(authenticatorSelectionCriteria);
        java.lang.String valueOf6 = java.lang.String.valueOf(tokenBinding);
        java.lang.String valueOf7 = java.lang.String.valueOf(attestationConveyancePreference);
        java.lang.String valueOf8 = java.lang.String.valueOf(authenticationExtensions);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialCreationOptions{\n rp=");
        sb.append(valueOf);
        sb.append(", \n user=");
        sb.append(valueOf2);
        sb.append(", \n challenge=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append(", \n parameters=");
        sb.append(valueOf3);
        sb.append(", \n timeoutSeconds=");
        sb.append(this.zze);
        sb.append(", \n excludeList=");
        sb.append(valueOf4);
        sb.append(", \n authenticatorSelection=");
        sb.append(valueOf5);
        sb.append(", \n requestId=");
        sb.append(this.zzh);
        sb.append(", \n tokenBinding=");
        sb.append(valueOf6);
        sb.append(", \n attestationConveyancePreference=");
        sb.append(valueOf7);
        sb.append(", \n authenticationExtensions=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, getJsonString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PublicKeyCredentialCreationOptions(java.lang.String str) {
        try {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zza = zza(new org.json.JSONObject(str));
            this.zza = zza.zza;
            this.zzb = zza.zzb;
            this.zzc = zza.zzc;
            this.zzd = zza.zzd;
            this.zze = zza.zze;
            this.zzf = zza.zzf;
            this.zzg = zza.zzg;
            this.zzh = zza.zzh;
            this.zzi = zza.zzi;
            this.zzj = zza.zzj;
            this.zzk = zza.zzk;
            this.zzl = str;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
        return this.zzi;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
        return this.zze;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
        return this.zzh;
    }

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

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions build() {
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
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.zzk, null, null);
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setChallenge(byte[] bArr) {
            this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setParameters(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> list) {
            this.zzd = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRp(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.zza = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialRpEntity);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setUser(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.zzb = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(publicKeyCredentialUserEntity);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding) {
            this.zzi = tokenBinding;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zze = d;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRequestId(java.lang.Integer num) {
            this.zzh = num;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setExcludeList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> list) {
            this.zzf = list;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticatorSelection(com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.zzg = authenticatorSelectionCriteria;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            this.zzk = authenticationExtensions;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference) {
            this.zzj = attestationConveyancePreference;
            return this;
        }
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> getParameters() {
        return this.zzd;
    }

    public java.lang.String getJsonString() {
        return this.zzl;
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getExcludeList() {
        return this.zzf;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    public java.lang.String getAttestationConveyancePreferenceAsString() {
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }
}
