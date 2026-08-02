package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class PublicKeyCredentialParameters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaq();
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zza;
    private final com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier zzb;

    public PublicKeyCredentialParameters(java.lang.String str, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(str);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(java.lang.Integer.valueOf(i));
            try {
                this.zzb = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(i);
            } catch (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } catch (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters publicKeyCredentialParameters = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public java.lang.String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(cOSEAlgorithmIdentifier);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialParameters{\n type=");
        sb.append(valueOf);
        sb.append(", \n algorithm=");
        sb.append(valueOf2);
        sb.append("\n }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 3, java.lang.Integer.valueOf(getAlgorithmIdAsInteger()), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
        return this.zza;
    }

    public com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }
}
