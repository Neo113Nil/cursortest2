package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class GetCredentialRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.GetCredentialRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getCredentialRequest.getCredentialOptions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, getCredentialRequest.getData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getCredentialRequest.getOrigin(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getCredentialRequest.getResultReceiver(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.GetCredentialRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayList = null;
        android.os.Bundle bundle = null;
        java.lang.String str = null;
        android.os.ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.identitycredentials.CredentialOption.CREATOR);
            } else if (fieldId == 2) {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            } else if (fieldId == 3) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                resultReceiver = (android.os.ResultReceiver) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.ResultReceiver.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.GetCredentialRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.GetCredentialRequest[i];
    }
}
