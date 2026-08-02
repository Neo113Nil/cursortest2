package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzn implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(com.google.android.libraries.places.widget.internal.photoviewer.zzd.CREATOR.createFromParcel(parcel));
        }
        return new com.google.android.libraries.places.widget.internal.photoviewer.zzo(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.widget.internal.photoviewer.zzo[i];
    }
}
