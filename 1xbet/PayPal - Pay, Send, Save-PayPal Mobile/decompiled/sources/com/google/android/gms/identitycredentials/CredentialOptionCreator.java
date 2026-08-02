package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class CredentialOptionCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CredentialOption> {
    static void writeToParcel(com.google.android.gms.identitycredentials.CredentialOption credentialOption, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, credentialOption.getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 3, credentialOption.getCandidateQueryData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, credentialOption.getRequestMatcher(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, credentialOption.getRequestType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, credentialOption.getProtocolType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CredentialOption createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = "";
        java.lang.String str2 = str;
        java.lang.String str3 = str2;
        android.os.Bundle bundle = null;
        android.os.Bundle bundle2 = null;
        java.lang.String str4 = null;
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
                    str4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.CredentialOption[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.CredentialOption[i];
    }
}
