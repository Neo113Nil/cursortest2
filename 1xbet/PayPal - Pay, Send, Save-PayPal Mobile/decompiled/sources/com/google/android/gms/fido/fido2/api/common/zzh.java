package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzh> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzi();
    private final boolean zza;
    private final com.google.android.gms.internal.fido.zzgx zzb;

    public zzh(boolean z, com.google.android.gms.internal.fido.zzgx zzgxVar) {
        this.zza = z;
        this.zzb = zzgxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzh)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzh zzhVar = (com.google.android.gms.fido.fido2.api.common.zzh) obj;
        return this.zza == zzhVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        boolean z = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(z), this.zzb);
    }

    public final java.lang.String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + zza().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, z);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, zzb(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final org.json.JSONObject zza() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.zza) {
                jSONObject.put("enabled", true);
            }
            byte[] zzb = zzb();
            if (zzb != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("first", android.util.Base64.encodeToString(java.util.Arrays.copyOf(zzb, 32), 11));
                if (zzb.length == 64) {
                    jSONObject2.put("second", android.util.Base64.encodeToString(java.util.Arrays.copyOfRange(zzb, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final byte[] zzb() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
