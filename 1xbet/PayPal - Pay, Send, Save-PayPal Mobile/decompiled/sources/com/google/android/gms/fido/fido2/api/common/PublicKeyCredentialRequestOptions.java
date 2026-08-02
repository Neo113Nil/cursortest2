package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class PublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzar();
    private final byte[] zza;
    private final java.lang.Double zzb;
    private final java.lang.String zzc;
    private final java.util.List zzd;
    private final java.lang.Integer zze;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement zzg;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;
    private final java.lang.Long zzi;
    private android.os.ResultReceiver zzj;

    PublicKeyCredentialRequestOptions(byte[] bArr, java.lang.Double d, java.lang.String str, java.util.List list, java.lang.Integer num, com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding, java.lang.String str2, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions, java.lang.Long l, java.lang.String str3, android.os.ResultReceiver resultReceiver) {
        this.zzj = resultReceiver;
        if (str3 == null || !com.google.android.gms.internal.fido.zzia.zzc()) {
            this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            this.zzb = d;
            this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            this.zzd = list;
            this.zze = num;
            this.zzf = tokenBinding;
            this.zzi = l;
            if (str2 != null) {
                try {
                    this.zzg = com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement.fromString(str2);
                } catch (com.google.android.gms.fido.fido2.api.common.zzbc e) {
                    throw new java.lang.IllegalArgumentException(e);
                }
            } else {
                this.zzg = null;
            }
            this.zzh = authenticationExtensions;
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder builder = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder();
            builder.setChallenge(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE)));
            if (jSONObject.has(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT)) {
                builder.setTimeoutSeconds(java.lang.Double.valueOf(jSONObject.getDouble(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT) / 1000.0d));
            } else if (jSONObject.has("timeoutSeconds")) {
                builder.setTimeoutSeconds(java.lang.Double.valueOf(jSONObject.getDouble("timeoutSeconds")));
            }
            builder.setRpId(jSONObject.getString("rpId"));
            org.json.JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.zza(jSONArray.getJSONObject(i)));
                }
                builder.setAllowList(arrayList);
            }
            if (jSONObject.has("requestId")) {
                builder.setRequestId(java.lang.Integer.valueOf(jSONObject.getInt("requestId")));
            }
            if (jSONObject.has("tokenBinding")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                builder.setTokenBinding(new com.google.android.gms.fido.fido2.api.common.TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null));
            }
            if (jSONObject.has("userVerification")) {
                builder.zzc(com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement.fromString(jSONObject.getString("userVerification")));
            }
            if (jSONObject.has("authenticationExtensions")) {
                builder.setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.zza(jSONObject.getJSONObject("authenticationExtensions")));
            } else if (jSONObject.has(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
                builder.setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.zza(jSONObject.getJSONObject(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)));
            }
            if (jSONObject.has("longRequestId")) {
                builder.zza(java.lang.Long.valueOf(jSONObject.getLong("longRequestId")));
            }
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions build = builder.build();
            this.zza = build.zza;
            this.zzb = build.zzb;
            this.zzc = build.zzc;
            this.zzd = build.zzd;
            this.zze = build.zze;
            this.zzf = build.zzf;
            this.zzg = build.zzg;
            this.zzh = build.zzh;
            this.zzi = build.zzi;
        } catch (com.google.android.gms.fido.fido2.api.common.zzbc | org.json.JSONException e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
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

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.zza);
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(hashCode), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        if (!com.google.android.gms.internal.fido.zzia.zzd()) {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder builder = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder(this);
        builder.zzb(null);
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    public final java.lang.String toString() {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = this.zzh;
        com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement = this.zzg;
        com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = this.zzf;
        java.util.List list = this.zzd;
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zza);
        java.lang.String valueOf = java.lang.String.valueOf(list);
        java.lang.String valueOf2 = java.lang.String.valueOf(tokenBinding);
        java.lang.String valueOf3 = java.lang.String.valueOf(userVerificationRequirement);
        java.lang.String valueOf4 = java.lang.String.valueOf(authenticationExtensions);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialRequestOptions{\n challenge=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append(", \n timeoutSeconds=");
        sb.append(this.zzb);
        sb.append(", \n rpId='");
        sb.append(this.zzc);
        sb.append("', \n allowList=");
        sb.append(valueOf);
        sb.append(", \n requestId=");
        sb.append(this.zze);
        sb.append(", \n tokenBinding=");
        sb.append(valueOf2);
        sb.append(", \n userVerification=");
        sb.append(valueOf3);
        sb.append(", \n authenticationExtensions=");
        sb.append(valueOf4);
        sb.append(", \n longRequestId=");
        sb.append(this.zzi);
        sb.append("}");
        return sb.toString();
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
        com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement = this.zzg;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getAuthenticationExtensions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.Long zzc() {
        return this.zzi;
    }

    public static final class Builder {
        private byte[] zza;
        private java.lang.Double zzb;
        private java.lang.String zzc;
        private java.util.List zzd;
        private java.lang.Integer zze;
        private com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
        private com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement zzg;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;
        private java.lang.Long zzi;
        private android.os.ResultReceiver zzj;

        public Builder(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.zza = publicKeyCredentialRequestOptions.getChallenge();
                this.zzb = publicKeyCredentialRequestOptions.getTimeoutSeconds();
                this.zzc = publicKeyCredentialRequestOptions.getRpId();
                this.zzd = publicKeyCredentialRequestOptions.getAllowList();
                this.zze = publicKeyCredentialRequestOptions.getRequestId();
                this.zzf = publicKeyCredentialRequestOptions.getTokenBinding();
                this.zzg = publicKeyCredentialRequestOptions.zzb();
                this.zzh = publicKeyCredentialRequestOptions.getAuthenticationExtensions();
                this.zzi = publicKeyCredentialRequestOptions.zzc();
                this.zzj = publicKeyCredentialRequestOptions.zza();
            }
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions build() {
            byte[] bArr = this.zza;
            java.lang.Double d = this.zzb;
            java.lang.String str = this.zzc;
            java.util.List list = this.zzd;
            java.lang.Integer num = this.zze;
            com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = this.zzf;
            com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement = this.zzg;
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions(bArr, d, str, list, num, tokenBinding, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), this.zzh, this.zzi, null, this.zzj);
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setChallenge(byte[] bArr) {
            this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRpId(java.lang.String str) {
            this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder zzc(com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement) {
            this.zzg = userVerificationRequirement;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder zzb(android.os.ResultReceiver resultReceiver) {
            this.zzj = null;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder zza(java.lang.Long l) {
            this.zzi = l;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding) {
            this.zzf = tokenBinding;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zzb = d;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRequestId(java.lang.Integer num) {
            this.zze = num;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            this.zzh = authenticationExtensions;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAllowList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> list) {
            this.zzd = list;
            return this;
        }

        public Builder() {
        }
    }

    public final com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement zzb() {
        return this.zzg;
    }

    public final android.os.ResultReceiver zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
        return this.zzf;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
        return this.zzb;
    }

    public java.lang.String getRpId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getAllowList() {
        return this.zzd;
    }
}
