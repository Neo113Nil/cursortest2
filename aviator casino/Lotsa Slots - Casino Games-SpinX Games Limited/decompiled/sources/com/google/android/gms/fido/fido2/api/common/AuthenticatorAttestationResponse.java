package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzk();
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final java.lang.String[] zzd;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String[] strArr) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
        this.zzd = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) obj;
        return java.util.Arrays.equals(this.zza, authenticatorAttestationResponse.zza) && java.util.Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) && java.util.Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @java.lang.Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public java.lang.String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.fido.zzaj zza = com.google.android.gms.internal.fido.zzak.zza(this);
        com.google.android.gms.internal.fido.zzbf zzd = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr = this.zza;
        zza.zzb(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzd.zze(bArr, 0, bArr.length));
        com.google.android.gms.internal.fido.zzbf zzd2 = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        com.google.android.gms.internal.fido.zzbf zzd3 = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr3 = this.zzc;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", java.util.Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
