package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class RegisterResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterResponseData> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzi();
    private final byte[] zza;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;
    private final java.lang.String zzc;

    public RegisterResponseData(byte[] bArr) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1;
        this.zzc = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.RegisterResponseData)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.RegisterResponseData registerResponseData = (com.google.android.gms.fido.u2f.api.common.RegisterResponseData) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, registerResponseData.zzb) && java.util.Arrays.equals(this.zza, registerResponseData.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzc, registerResponseData.zzc);
    }

    public int getVersionCode() {
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN;
        int ordinal = this.zzb.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                return -1;
            }
        }
        return i;
    }

    public int hashCode() {
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion = this.zzb;
        int hashCode = java.util.Arrays.hashCode(this.zza);
        return com.google.android.gms.common.internal.Objects.hashCode(protocolVersion, java.lang.Integer.valueOf(hashCode), this.zzc);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public org.json.JSONObject toJsonObject() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("registrationData", android.util.Base64.encodeToString(this.zza, 11));
            jSONObject.put("version", this.zzb.toString());
            java.lang.String str = this.zzc;
            if (str != null) {
                jSONObject.put(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA, android.util.Base64.encodeToString(str.getBytes(), 11));
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.fido.zzbi zza = com.google.android.gms.internal.fido.zzbj.zza(this);
        zza.zzb("protocolVersion", this.zzb);
        com.google.android.gms.internal.fido.zzgf zzf = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] bArr = this.zza;
        zza.zzb("registerData", zzf.zzg(bArr, 0, bArr.length));
        java.lang.String str = this.zzc;
        if (str != null) {
            zza.zzb("clientDataString", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getRegisterData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getClientDataString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RegisterResponseData(byte[] bArr, com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion, java.lang.String str) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion) com.google.android.gms.common.internal.Preconditions.checkNotNull(protocolVersion);
        com.google.android.gms.common.internal.Preconditions.checkArgument(protocolVersion != com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN);
        if (protocolVersion == com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str == null);
            this.zzc = null;
        } else {
            this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        }
    }

    RegisterResponseData(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.zza = bArr;
        try {
            this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public byte[] getRegisterData() {
        return this.zza;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public java.lang.String getClientDataString() {
        return this.zzc;
    }
}
