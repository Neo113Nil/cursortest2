package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class RegisteredKey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisteredKey> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzj();
    java.lang.String zza;
    private final com.google.android.gms.fido.u2f.api.common.KeyHandle zzb;
    private final java.lang.String zzc;

    public RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisteredKey parseFromJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new com.google.android.gms.fido.u2f.api.common.RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle.parseFromJson(jSONObject), jSONObject.has(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE) ? jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE) : null, jSONObject.has("appId") ? jSONObject.getString("appId") : null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.RegisteredKey registeredKey = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (registeredKey.zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.zza)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        java.lang.String str2 = this.zzc;
        if (str2 == null) {
            if (registeredKey.zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.zzc)) {
            return false;
        }
        return true;
    }

    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.zza;
            if (str != null) {
                jSONObject.put(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, str);
            }
            org.json.JSONObject zza = this.zzb.zza();
            java.util.Iterator<java.lang.String> keys = zza.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject.put(next, zza.get(next));
            }
            java.lang.String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, android.util.Base64.encodeToString(this.zzb.getBytes(), 11));
            if (this.zzb.getProtocolVersion() != com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.zzb.getProtocolVersion().toString());
            }
            if (this.zzb.getTransports() != null) {
                jSONObject.put("transports", this.zzb.getTransports().toString());
            }
            java.lang.String str = this.zza;
            if (str != null) {
                jSONObject.put(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, str);
            }
            java.lang.String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getKeyHandle(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getChallengeValue(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle keyHandle, java.lang.String str, java.lang.String str2) {
        this.zzb = (com.google.android.gms.fido.u2f.api.common.KeyHandle) com.google.android.gms.common.internal.Preconditions.checkNotNull(keyHandle);
        this.zza = str;
        this.zzc = str2;
    }

    public int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.zzb.hashCode();
        java.lang.String str2 = this.zzc;
        return ((((hashCode + 31) * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public com.google.android.gms.fido.u2f.api.common.KeyHandle getKeyHandle() {
        return this.zzb;
    }

    public java.lang.String getChallengeValue() {
        return this.zza;
    }

    public java.lang.String getAppId() {
        return this.zzc;
    }
}
