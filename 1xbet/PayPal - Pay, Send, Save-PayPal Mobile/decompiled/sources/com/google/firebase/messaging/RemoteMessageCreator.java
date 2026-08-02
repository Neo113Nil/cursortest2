package com.google.firebase.messaging;

/* loaded from: classes4.dex */
public class RemoteMessageCreator implements android.os.Parcelable.Creator<com.google.firebase.messaging.RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.google.firebase.messaging.RemoteMessage createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader) == 2) {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.firebase.messaging.RemoteMessage(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.google.firebase.messaging.RemoteMessage[] newArray(int i) {
        return new com.google.firebase.messaging.RemoteMessage[i];
    }

    static void writeToParcel(com.google.firebase.messaging.RemoteMessage remoteMessage, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, remoteMessage.bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
