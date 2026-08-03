package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class PublicKeyCredentialParameters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzan();
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

    public com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
        return this.zza;
    }

    public java.lang.String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 3, java.lang.Integer.valueOf(getAlgorithmIdAsInteger()), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
