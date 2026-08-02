package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class CreateCredentialRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CreateCredentialRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, createCredentialRequest.getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, createCredentialRequest.getCredentialData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 3, createCredentialRequest.getCandidateQueryData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, createCredentialRequest.getOrigin(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, createCredentialRequest.getRequestJson(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, createCredentialRequest.getResultReceiver(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CreateCredentialRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        android.os.Bundle bundle = null;
        android.os.Bundle bundle2 = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        android.os.ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    bundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    resultReceiver = (android.os.ResultReceiver) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.ResultReceiver.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.CreateCredentialRequest(str, bundle, bundle2, str2, str3, resultReceiver);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CreateCredentialRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.CreateCredentialRequest[i];
    }
}
