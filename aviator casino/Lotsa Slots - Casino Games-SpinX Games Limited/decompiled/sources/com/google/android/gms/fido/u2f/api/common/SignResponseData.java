package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public class SignResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.SignResponseData> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzl();
    public static final java.lang.String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final java.lang.String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final java.lang.String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final java.lang.String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    @java.lang.Deprecated
    public SignResponseData(byte[] bArr, java.lang.String str, byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.SignResponseData)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.SignResponseData signResponseData = (com.google.android.gms.fido.u2f.api.common.SignResponseData) obj;
        return java.util.Arrays.equals(this.zza, signResponseData.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, signResponseData.zzb) && java.util.Arrays.equals(this.zzc, signResponseData.zzc) && java.util.Arrays.equals(this.zzd, signResponseData.zzd);
    }

    public java.lang.String getClientDataString() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public org.json.JSONObject toJsonObject() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(JSON_RESPONSE_DATA_KEY_HANDLE, android.util.Base64.encodeToString(this.zza, 11));
            jSONObject.put(JSON_RESPONSE_DATA_CLIENT_DATA, android.util.Base64.encodeToString(this.zzb.getBytes(), 11));
            jSONObject.put(JSON_RESPONSE_DATA_SIGNATURE_DATA, android.util.Base64.encodeToString(this.zzc, 11));
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.fido.zzaj zza = com.google.android.gms.internal.fido.zzak.zza(this);
        com.google.android.gms.internal.fido.zzbf zzd = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr = this.zza;
        zza.zzb(JSON_RESPONSE_DATA_KEY_HANDLE, zzd.zze(bArr, 0, bArr.length));
        zza.zzb("clientDataString", this.zzb);
        com.google.android.gms.internal.fido.zzbf zzd2 = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr2 = this.zzc;
        zza.zzb(JSON_RESPONSE_DATA_SIGNATURE_DATA, zzd2.zze(bArr2, 0, bArr2.length));
        com.google.android.gms.internal.fido.zzbf zzd3 = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr3 = this.zzd;
        zza.zzb("application", zzd3.zze(bArr3, 0, bArr3.length));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getClientDataString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getSignatureData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SignResponseData(byte[] bArr, java.lang.String str, byte[] bArr2, byte[] bArr3) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
    }
}
