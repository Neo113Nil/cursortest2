package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class ClearCreationOptionsRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearCreationOptionsRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.ClearCreationOptionsRequest clearCreationOptionsRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, clearCreationOptionsRequest.getDeleteAll());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, clearCreationOptionsRequest.getClearTypedRegistryOption(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearCreationOptionsRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedCreationOption = null;
        boolean z = true;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                clearTypedCreationOption = (com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.ClearCreationOptionsRequest(z, clearTypedCreationOption);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearCreationOptionsRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.ClearCreationOptionsRequest[i];
    }
}
