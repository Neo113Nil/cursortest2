package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialDescriptor extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zzb;
    private final byte[] zzc;
    private final java.util.List zzd;
    private static final com.google.android.gms.internal.fido.zzau zza = com.google.android.gms.internal.fido.zzau.zzi(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzam();

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedPubKeyCredDescriptorException extends java.lang.Exception {
        public UnsupportedPubKeyCredDescriptorException(java.lang.String str) {
            super(str);
        }

        public UnsupportedPubKeyCredDescriptorException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public PublicKeyCredentialDescriptor(java.lang.String str, byte[] bArr, java.util.List<com.google.android.gms.fido.common.Transport> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            this.zzb = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(str);
            this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            this.zzd = list;
        } catch (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !java.util.Arrays.equals(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        java.util.List list2 = this.zzd;
        if (list2 == null && publicKeyCredentialDescriptor.zzd == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.zzd) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd);
    }

    public byte[] getId() {
        return this.zzc;
    }

    public java.util.List<com.google.android.gms.fido.common.Transport> getTransports() {
        return this.zzd;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
        return this.zzb;
    }

    public java.lang.String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
