package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class ExportCredentialsToDeviceSetupRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, exportCredentialsToDeviceSetupRequest.getUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, exportCredentialsToDeviceSetupRequest.getRequestData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.net.Uri uri = null;
        android.os.Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.net.Uri.CREATOR);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest(uri, bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest[i];
    }
}
