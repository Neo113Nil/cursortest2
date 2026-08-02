package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzn implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        com.google.android.libraries.places.internal.zzaml zzamlVar = (com.google.android.libraries.places.internal.zzaml) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzaml.class, parcel.readString());
        com.google.android.libraries.places.internal.zzamj zzamjVar = (com.google.android.libraries.places.internal.zzamj) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzamj.class, parcel.readString());
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add((com.google.android.libraries.places.internal.zzamg) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzamg.class, parcel.readString()));
        }
        return new com.google.android.libraries.places.widget.internal.placedetails.zzo(zzamlVar, zzamjVar, arrayList, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.widget.internal.placedetails.zzo[i];
    }
}
