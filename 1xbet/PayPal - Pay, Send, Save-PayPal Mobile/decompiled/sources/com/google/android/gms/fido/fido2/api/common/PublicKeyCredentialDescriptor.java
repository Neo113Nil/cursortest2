package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final java.util.List zzd;
    private static final com.google.android.gms.internal.fido.zzcf zza = com.google.android.gms.internal.fido.zzcf.zzm(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzap();

    /* loaded from: classes8.dex */
    public static class UnsupportedPubKeyCredDescriptorException extends java.lang.Exception {
        public UnsupportedPubKeyCredDescriptorException(java.lang.String str) {
            super(str);
        }

        public UnsupportedPubKeyCredDescriptorException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public PublicKeyCredentialDescriptor(java.lang.String str, com.google.android.gms.internal.fido.zzgx zzgxVar, java.util.List<com.google.android.gms.fido.common.Transport> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            this.zzb = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(str);
            this.zzc = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgxVar);
            this.zzd = list;
        } catch (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor zza(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor(jSONObject.getString("type"), android.util.Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? com.google.android.gms.fido.common.Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !com.google.android.gms.common.internal.Objects.equal(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        java.util.List list2 = this.zzd;
        if (list2 == null && publicKeyCredentialDescriptor.zzd == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.zzd) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd);
    }

    public byte[] getId() {
        return this.zzc.zzm();
    }

    public java.lang.String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String encodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getId());
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzd);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialDescriptor{\n type=");
        sb.append(valueOf);
        sb.append(", \n id=");
        sb.append(encodeUrlSafeNoPadding);
        sb.append(", \n transports=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialDescriptor(java.lang.String str, byte[] bArr, java.util.List<com.google.android.gms.fido.common.Transport> list) {
        this(str, com.google.android.gms.internal.fido.zzgx.zzl(bArr, 0, bArr.length), list);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
        return this.zzb;
    }

    public java.util.List<com.google.android.gms.fido.common.Transport> getTransports() {
        return this.zzd;
    }

    public com.google.android.gms.internal.fido.zzgx getIdAsByteString() {
        return this.zzc;
    }
}
