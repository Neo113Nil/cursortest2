package com.google.android.gms.identitycredentials;

/* loaded from: classes8.dex */
public final class ClearTypedRegistryOptionCreator implements android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption> {
    static void writeToParcel(com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, clearTypedRegistryOption.getDeleteAllForType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, clearTypedRegistryOption.getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, clearTypedRegistryOption.getDeleteIdlessRegistry());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, clearTypedRegistryOption.getRegistryIds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        boolean z = false;
        boolean z2 = false;
        java.util.ArrayList<java.lang.String> arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 2) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption(z, str, z2, arrayList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption[] newArray(int i) {
        return new com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption[i];
    }
}
