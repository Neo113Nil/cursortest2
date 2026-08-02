package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class ClearRegistryRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearRegistryRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.ClearRegistryRequest clearRegistryRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, clearRegistryRequest.getDeleteAll());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, clearRegistryRequest.getClearTypedRegistryOption(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearRegistryRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption = null;
        boolean z = true;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                clearTypedRegistryOption = (com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.ClearRegistryRequest(z, clearTypedRegistryOption);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearRegistryRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.ClearRegistryRequest[i];
    }
}
