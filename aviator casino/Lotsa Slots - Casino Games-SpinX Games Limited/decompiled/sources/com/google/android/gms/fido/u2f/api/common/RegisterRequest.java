package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public class RegisterRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterRequest> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;
    private final int zza;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;
    private final byte[] zzc;
    private final java.lang.String zzd;

    RegisterRequest(int i, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.zza = i;
        try {
            this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisterRequest parseFromJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        try {
            try {
                try {
                    return new com.google.android.gms.fido.u2f.api.common.RegisterRequest(com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), android.util.Base64.decode(jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE), 8), jSONObject.has(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID) ? jSONObject.getString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID) : null);
                } catch (java.lang.IllegalArgumentException e) {
                    throw new org.json.JSONException(e.getMessage());
                }
            } catch (java.lang.IllegalArgumentException e2) {
                throw new org.json.JSONException(e2.toString());
            }
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e3) {
            throw new org.json.JSONException(e3.toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequest)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.RegisterRequest registerRequest = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) obj;
        if (!java.util.Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        java.lang.String str = this.zzd;
        if (str == null) {
            if (registerRequest.zzd != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.zzd)) {
            return false;
        }
        return true;
    }

    public java.lang.String getAppId() {
        return this.zzd;
    }

    public byte[] getChallengeValue() {
        return this.zzc;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int hashCode = ((java.util.Arrays.hashCode(this.zzc) + 31) * 31) + this.zzb.hashCode();
        java.lang.String str = this.zzd;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("version", this.zzb.toString());
            jSONObject.put(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, android.util.Base64.encodeToString(this.zzc, 11));
            java.lang.String str = this.zzd;
            if (str != null) {
                jSONObject.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getChallengeValue(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RegisterRequest(com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion, byte[] bArr, java.lang.String str) {
        this.zza = 1;
        this.zzb = (com.google.android.gms.fido.u2f.api.common.ProtocolVersion) com.google.android.gms.common.internal.Preconditions.checkNotNull(protocolVersion);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        if (protocolVersion == com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 65, "invalid challengeValue length for V1");
        }
        this.zzd = str;
    }
}
