package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.internal.photoviewer.zzo> CREATOR = new com.google.android.libraries.places.widget.internal.photoviewer.zzn();
    private final java.util.List zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.util.List zza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        java.util.List list = this.zza;
        parcel.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.places.widget.internal.photoviewer.zzd) it.next()).writeToParcel(parcel, i);
        }
    }

    public final java.lang.String toString() {
        java.util.List list = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(list.toString().length() + 43);
        sb.append("ParcelablePhotoPageDataList(photoPageData=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.libraries.places.widget.internal.photoviewer.zzo) && kotlin.jvm.internal.Intrinsics.areEqual(this.zza, ((com.google.android.libraries.places.widget.internal.photoviewer.zzo) obj).zza);
    }

    public zzo(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }
}
