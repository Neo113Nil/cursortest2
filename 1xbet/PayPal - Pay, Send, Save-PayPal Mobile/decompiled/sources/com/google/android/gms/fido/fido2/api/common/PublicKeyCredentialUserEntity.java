package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzau();
    private final com.google.android.gms.internal.fido.zzgx zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public PublicKeyCredentialUserEntity(com.google.android.gms.internal.fido.zzgx zzgxVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgxVar);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredentialUserEntity.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    public byte[] getId() {
        return this.zza.zzm();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zza.zzm());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialUserEntity{\n id=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append(", \n name='");
        sb.append(this.zzb);
        sb.append("', \n icon='");
        sb.append(this.zzc);
        sb.append("', \n displayName='");
        sb.append(this.zzd);
        sb.append("'}");
        return sb.toString();
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PublicKeyCredentialUserEntity(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(com.google.android.gms.internal.fido.zzgx.zzl(r3, 0, r3.length), str, str2, str3);
        byte[] bArr2 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
    }

    public java.lang.String getName() {
        return this.zzb;
    }

    public com.google.android.gms.internal.fido.zzgx getIdAsByteString() {
        return this.zza;
    }

    public java.lang.String getIcon() {
        return this.zzc;
    }

    public java.lang.String getDisplayName() {
        return this.zzd;
    }
}
