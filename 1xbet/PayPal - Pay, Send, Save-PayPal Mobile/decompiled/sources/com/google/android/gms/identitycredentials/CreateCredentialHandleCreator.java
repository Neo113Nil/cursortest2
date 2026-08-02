package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class CreateCredentialHandleCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CreateCredentialHandle> {
    static void writeToParcel(com.google.android.gms.identitycredentials.CreateCredentialHandle createCredentialHandle, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, createCredentialHandle.getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, createCredentialHandle.getCreateCredentialResponse(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CreateCredentialHandle createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.app.PendingIntent pendingIntent = null;
        com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.app.PendingIntent.CREATOR);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                createCredentialResponse = (com.google.android.gms.identitycredentials.CreateCredentialResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.identitycredentials.CreateCredentialResponse.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CreateCredentialHandle[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.CreateCredentialHandle[i];
    }
}
