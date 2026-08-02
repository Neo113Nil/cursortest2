package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzj();
    private final com.google.android.gms.internal.fido.zzgx zza;
    private final com.google.android.gms.internal.fido.zzgx zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final com.google.android.gms.internal.fido.zzgx zzd;
    private final com.google.android.gms.internal.fido.zzgx zze;

    AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
        com.google.android.gms.internal.fido.zzgx zzl = com.google.android.gms.internal.fido.zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        com.google.android.gms.internal.fido.zzgx zzl2 = com.google.android.gms.internal.fido.zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
        com.google.android.gms.internal.fido.zzgx zzl3 = com.google.android.gms.internal.fido.zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr4);
        com.google.android.gms.internal.fido.zzgx zzl4 = com.google.android.gms.internal.fido.zzgx.zzl(bArr9, 0, bArr9.length);
        com.google.android.gms.internal.fido.zzgx zzl5 = bArr5 == null ? null : com.google.android.gms.internal.fido.zzgx.zzl(bArr5, 0, bArr5.length);
        this.zza = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl);
        this.zzb = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl2);
        this.zzc = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl3);
        this.zzd = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl4);
        this.zze = zzl5;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticatorAssertionResponse.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticatorAssertionResponse.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticatorAssertionResponse.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, authenticatorAssertionResponse.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, authenticatorAssertionResponse.zze);
    }

    public byte[] getAuthenticatorData() {
        return this.zzc.zzm();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    @java.lang.Deprecated
    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public byte[] getSignature() {
        return this.zzd.zzm();
    }

    public byte[] getUserHandle() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zza)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zzb)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zzc)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zzd)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zze)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.fido.zzbi zza = com.google.android.gms.internal.fido.zzbj.zza(this);
        com.google.android.gms.internal.fido.zzgf zzf = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zza.zzb(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(keyHandle, 0, keyHandle.length));
        com.google.android.gms.internal.fido.zzgf zzf2 = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zza.zzb("clientDataJSON", zzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        com.google.android.gms.internal.fido.zzgf zzf3 = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] authenticatorData = getAuthenticatorData();
        zza.zzb("authenticatorData", zzf3.zzg(authenticatorData, 0, authenticatorData.length));
        com.google.android.gms.internal.fido.zzgf zzf4 = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] signature = getSignature();
        zza.zzb("signature", zzf4.zzg(signature, 0, signature.length));
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            zza.zzb("userHandle", com.google.android.gms.internal.fido.zzgf.zzf().zzg(userHandle, 0, userHandle.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final org.json.JSONObject zza() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("clientDataJSON", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            jSONObject.put("authenticatorData", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getAuthenticatorData()));
            jSONObject.put("signature", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getSignature()));
            if (this.zze != null) {
                jSONObject.put("userHandle", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getUserHandle()));
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public com.google.android.gms.internal.fido.zzgx getUserHandleAsByteString() {
        return this.zze;
    }

    public com.google.android.gms.internal.fido.zzgx getSignatureAsByteString() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public com.google.android.gms.internal.fido.zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    public com.google.android.gms.internal.fido.zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    public com.google.android.gms.internal.fido.zzgx getAuthenticatorDataAsByteString() {
        return this.zzc;
    }
}
