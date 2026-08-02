package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
public final class zzam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.zzam> CREATOR = new com.google.android.libraries.places.widget.zzal();
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
            parcel.writeString(((com.google.android.libraries.places.widget.PlaceSearchFragment.Content) it.next()).name());
        }
    }

    public final java.lang.String toString() {
        java.util.List list = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(list).length() + 31);
        sb.append("ParcelableContentList(content=");
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
        return (obj instanceof com.google.android.libraries.places.widget.zzam) && kotlin.jvm.internal.Intrinsics.areEqual(this.zza, ((com.google.android.libraries.places.widget.zzam) obj).zza);
    }

    public zzam(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }
}
