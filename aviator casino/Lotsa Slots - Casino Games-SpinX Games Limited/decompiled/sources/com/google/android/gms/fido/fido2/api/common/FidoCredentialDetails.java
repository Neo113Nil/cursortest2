package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class FidoCredentialDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzy();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final boolean zze;
    private final boolean zzf;

    FidoCredentialDetails(java.lang.String str, java.lang.String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zze = z;
        this.zzf = z2;
    }

    public static com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails fidoCredentialDetails = (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, fidoCredentialDetails.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, fidoCredentialDetails.zzb) && java.util.Arrays.equals(this.zzc, fidoCredentialDetails.zzc) && java.util.Arrays.equals(this.zzd, fidoCredentialDetails.zzd) && this.zze == fidoCredentialDetails.zze && this.zzf == fidoCredentialDetails.zzf;
    }

    public byte[] getCredentialId() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public java.lang.String getUserDisplayName() {
        return this.zzb;
    }

    public byte[] getUserId() {
        return this.zzc;
    }

    public java.lang.String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(this.zzf));
    }

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
