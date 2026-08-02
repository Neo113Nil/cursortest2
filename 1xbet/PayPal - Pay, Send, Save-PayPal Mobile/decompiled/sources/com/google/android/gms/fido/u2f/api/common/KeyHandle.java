package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class KeyHandle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.KeyHandle> CREATOR = new com.google.android.gms.fido.u2f.api.common.zze();
    private final int zza;
    private final byte[] zzb;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzc;
    private final java.util.List zzd;

    KeyHandle(int i, byte[] bArr, java.lang.String str, java.util.List list) {
        this.zza = i;
        this.zzb = bArr;
        try {
            this.zzc = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.android.gms.fido.u2f.api.common.KeyHandle parseFromJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        try {
            try {
                return new com.google.android.gms.fido.u2f.api.common.KeyHandle(android.util.Base64.decode(jSONObject.getString(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE), 8), com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), jSONObject.has("transports") ? com.google.android.gms.fido.common.Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
            } catch (java.lang.IllegalArgumentException e) {
                throw new org.json.JSONException(e.toString());
            }
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e2) {
            throw new org.json.JSONException(e2.toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.KeyHandle)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.KeyHandle keyHandle = (com.google.android.gms.fido.u2f.api.common.KeyHandle) obj;
        if (!java.util.Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        java.util.List list2 = this.zzd;
        if (list2 == null && keyHandle.zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.zzd) != null && list2.containsAll(list) && keyHandle.zzd.containsAll(this.zzd);
    }

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.zzb);
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(hashCode), this.zzc, this.zzd);
    }

    public org.json.JSONObject toJson() {
        return zza();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getBytes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final org.json.JSONObject zza() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, android.util.Base64.encodeToString(bArr, 11));
            }
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion = this.zzc;
            if (protocolVersion != null) {
                jSONObject.put("version", protocolVersion.toString());
            }
            if (this.zzd != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.google.android.gms.fido.common.Transport) it.next()).toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        java.util.List list = this.zzd;
        return java.lang.String.format("{keyHandle: %s, version: %s, transports: %s}", com.google.android.gms.common.util.Base64Utils.encode(this.zzb), this.zzc, list == null ? "null" : list.toString());
    }

    public KeyHandle(byte[] bArr, com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion, java.util.List<com.google.android.gms.fido.common.Transport> list) {
        this.zza = 1;
        this.zzb = bArr;
        this.zzc = protocolVersion;
        this.zzd = list;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public java.util.List<com.google.android.gms.fido.common.Transport> getTransports() {
        return this.zzd;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    public byte[] getBytes() {
        return this.zzb;
    }
}
