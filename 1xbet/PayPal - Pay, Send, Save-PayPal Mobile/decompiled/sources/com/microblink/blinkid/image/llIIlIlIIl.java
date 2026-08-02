package com.microblink.blinkid.image;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.microblink.blinkid.image.Image(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.microblink.blinkid.image.Image[i];
    }
}
