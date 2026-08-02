package com.google.android.gms.auth.blockstore.restorecredential;

/* loaded from: classes8.dex */
public final class GetRestoreCredentialResponseCreator implements android.os.Parcelable.Creator<com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse> {
    static void writeToParcel(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse getRestoreCredentialResponse, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 1, getRestoreCredentialResponse.getResponseBundle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader) != 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse[] newArray(int i) {
        return new com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse[i];
    }
}
