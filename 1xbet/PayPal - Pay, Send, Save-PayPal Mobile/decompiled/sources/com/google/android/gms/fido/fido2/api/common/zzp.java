package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
final class zzp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        try {
            return com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(java.lang.Integer.valueOf(parcel.readInt()).intValue());
        } catch (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier[i];
    }

    zzp() {
    }
}
