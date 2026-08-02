package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class ImportCredentialsForDeviceSetupRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, importCredentialsForDeviceSetupRequest.getRequestJson(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, importCredentialsForDeviceSetupRequest.getUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 3, importCredentialsForDeviceSetupRequest.getRequestData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        android.net.Uri uri = null;
        android.os.Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.net.Uri.CREATOR);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest(str, uri, bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest[i];
    }
}
