package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticatorAssertionResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzj();
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;

    AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
        this.zzd = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr4);
        this.zze = bArr5;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) obj;
        return java.util.Arrays.equals(this.zza, authenticatorAssertionResponse.zza) && java.util.Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) && java.util.Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) && java.util.Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) && java.util.Arrays.equals(this.zze, authenticatorAssertionResponse.zze);
    }

    public byte[] getAuthenticatorData() {
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

    public byte[] getSignature() {
        return this.zzd;
    }

    public byte[] getUserHandle() {
        return this.zze;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zze)));
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
        zza.zzb("authenticatorData", zzd3.zze(bArr3, 0, bArr3.length));
        com.google.android.gms.internal.fido.zzbf zzd4 = com.google.android.gms.internal.fido.zzbf.zzd();
        byte[] bArr4 = this.zzd;
        zza.zzb(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, zzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            zza.zzb("userHandle", com.google.android.gms.internal.fido.zzbf.zzd().zze(bArr5, 0, bArr5.length));
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
}
