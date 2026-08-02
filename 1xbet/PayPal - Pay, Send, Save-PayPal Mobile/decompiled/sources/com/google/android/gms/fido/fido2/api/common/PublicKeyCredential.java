package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class PublicKeyCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredential> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzao();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse zzd;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse zze;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse zzf;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzg;
    private final java.lang.String zzh;
    private java.lang.String zzi;

    private PublicKeyCredential(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.fido.zzgx zzgxVar, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, java.lang.String str3, java.lang.String str4) {
        boolean z = false;
        com.google.android.gms.common.internal.Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Must provide id and rawId if not an error response.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVar;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
        this.zzi = null;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredential deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredential)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential publicKeyCredential = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredential.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredential.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredential.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, publicKeyCredential.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, publicKeyCredential.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, publicKeyCredential.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, publicKeyCredential.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    public byte[] getRawId() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
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

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public java.lang.String toJson() {
        return zza().toString();
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzc;
        byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
        java.lang.String str = this.zzb;
        java.lang.String str2 = this.zza;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        java.lang.String str3 = this.zzh;
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zzm);
        java.lang.String valueOf = java.lang.String.valueOf(authenticatorAttestationResponse);
        java.lang.String valueOf2 = java.lang.String.valueOf(authenticatorAssertionResponse);
        java.lang.String valueOf3 = java.lang.String.valueOf(authenticatorErrorResponse);
        java.lang.String valueOf4 = java.lang.String.valueOf(authenticationExtensionsClientOutputs);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredential{\n id='");
        sb.append(str2);
        sb.append("', \n type='");
        sb.append(str);
        sb.append("', \n rawId=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append(", \n registerResponse=");
        sb.append(valueOf);
        sb.append(", \n signResponse=");
        sb.append(valueOf2);
        sb.append(", \n errorResponse=");
        sb.append(valueOf3);
        sb.append(", \n extensionsClientOutputs=");
        sb.append(valueOf4);
        sb.append(", \n authenticatorAttachment='");
        sb.append(str3);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (com.google.android.gms.internal.fido.zzia.zzc()) {
            this.zzi = zza().toString();
        }
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zzi = null;
    }

    public final org.json.JSONObject zza() {
        org.json.JSONObject jSONObject;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzc;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put("rawId", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zzc.zzm()));
            }
            java.lang.String str = this.zzh;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            java.lang.String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject2.put("type", str2);
            }
            java.lang.String str3 = this.zza;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            java.lang.String str4 = "response";
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.zza();
            } else {
                com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.zza();
                } else {
                    com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObject = authenticatorErrorResponse.zza();
                        str4 = "error";
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                return jSONObject2;
            }
            if (z) {
                jSONObject2.put("clientExtensionResults", new org.json.JSONObject());
            }
            return jSONObject2;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException("Error encoding PublicKeyCredential to JSON object", e);
        }
    }

    PublicKeyCredential(java.lang.String str, java.lang.String str2, byte[] bArr, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, java.lang.String str3, java.lang.String str4) {
        this(str, str2, bArr == null ? null : com.google.android.gms.internal.fido.zzgx.zzl(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private java.lang.String zza;
        private com.google.android.gms.internal.fido.zzgx zzb;
        private com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse zzc;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzd;
        private java.lang.String zze;

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential build() {
            com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse authenticatorResponse = this.zzc;
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential(this.zza, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse ? (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) authenticatorResponse : null, this.zzd, this.zze);
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setRawId(byte[] bArr) {
            this.zzb = bArr == null ? null : com.google.android.gms.internal.fido.zzgx.zzl(bArr, 0, bArr.length);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setResponse(com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse authenticatorResponse) {
            this.zzc = authenticatorResponse;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setRawId(com.google.android.gms.internal.fido.zzgx zzgxVar) {
            this.zzb = zzgxVar;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticatorAttachment(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.zzd = authenticationExtensionsClientOutputs;
            return this;
        }
    }

    public java.lang.String getType() {
        return this.zzb;
    }

    public com.google.android.gms.internal.fido.zzgx getRawIdAsByteString() {
        return this.zzc;
    }

    public java.lang.String getId() {
        return this.zza;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    public java.lang.String getAuthenticatorAttachment() {
        return this.zzh;
    }
}
