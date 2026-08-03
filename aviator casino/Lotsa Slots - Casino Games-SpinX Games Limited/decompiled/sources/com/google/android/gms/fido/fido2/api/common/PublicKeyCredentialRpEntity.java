package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialRpEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzap();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public PublicKeyCredentialRpEntity(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        this.zzc = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, publicKeyCredentialRpEntity.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, publicKeyCredentialRpEntity.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredentialRpEntity.zzc);
    }

    public java.lang.String getIcon() {
        return this.zzc;
    }

    public java.lang.String getId() {
        return this.zza;
    }

    public java.lang.String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
