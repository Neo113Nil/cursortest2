package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialUserEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzar();
    private final byte[] zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public PublicKeyCredentialUserEntity(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) obj;
        return java.util.Arrays.equals(this.zza, publicKeyCredentialUserEntity.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    public java.lang.String getDisplayName() {
        return this.zzd;
    }

    public java.lang.String getIcon() {
        return this.zzc;
    }

    public byte[] getId() {
        return this.zza;
    }

    public java.lang.String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
