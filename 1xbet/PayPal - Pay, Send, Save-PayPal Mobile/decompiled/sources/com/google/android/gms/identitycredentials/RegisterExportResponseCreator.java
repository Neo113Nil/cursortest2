package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class RegisterExportResponseCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.RegisterExportResponse> {
    static void writeToParcel(com.google.android.gms.identitycredentials.RegisterExportResponse registerExportResponse, android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.RegisterExportResponse createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.RegisterExportResponse();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.RegisterExportResponse[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.RegisterExportResponse[i];
    }
}
