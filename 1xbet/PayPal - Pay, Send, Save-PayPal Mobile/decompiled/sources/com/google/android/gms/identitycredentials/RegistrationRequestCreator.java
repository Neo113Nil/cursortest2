package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class RegistrationRequestCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.RegistrationRequest> {
    static void writeToParcel(com.google.android.gms.identitycredentials.RegistrationRequest registrationRequest, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, registrationRequest.getCredentials(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, registrationRequest.getMatcher(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, registrationRequest.getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, registrationRequest.getRequestType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, registrationRequest.getProtocolTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, registrationRequest.getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, registrationRequest.getFulfillmentActionName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.RegistrationRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.List emptyList = java.util.Collections.emptyList();
        java.lang.String str = "";
        java.lang.String str2 = str;
        java.lang.String str3 = str2;
        java.lang.String str4 = str3;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 2:
                    bArr2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    emptyList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 6:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.RegistrationRequest(bArr, bArr2, str, str2, emptyList, str3, str4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.RegistrationRequest[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.RegistrationRequest[i];
    }
}
