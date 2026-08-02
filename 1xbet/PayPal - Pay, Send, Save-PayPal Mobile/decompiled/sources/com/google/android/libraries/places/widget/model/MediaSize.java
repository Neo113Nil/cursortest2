package com.google.android.libraries.places.widget.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/google/android/libraries/places/widget/model/MediaSize;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "SMALL", "MEDIUM", "LARGE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaSize implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.model.MediaSize> CREATOR;
    public static final com.google.android.libraries.places.widget.model.MediaSize LARGE;
    public static final com.google.android.libraries.places.widget.model.MediaSize MEDIUM;
    public static final com.google.android.libraries.places.widget.model.MediaSize SMALL;
    private static final /* synthetic */ com.google.android.libraries.places.widget.model.MediaSize[] zza;
    private static final /* synthetic */ kotlin.enums.EnumEntries zzb;

    static {
        com.google.android.libraries.places.widget.model.MediaSize mediaSize = new com.google.android.libraries.places.widget.model.MediaSize("SMALL", 0);
        SMALL = mediaSize;
        com.google.android.libraries.places.widget.model.MediaSize mediaSize2 = new com.google.android.libraries.places.widget.model.MediaSize("MEDIUM", 1);
        MEDIUM = mediaSize2;
        com.google.android.libraries.places.widget.model.MediaSize mediaSize3 = new com.google.android.libraries.places.widget.model.MediaSize("LARGE", 2);
        LARGE = mediaSize3;
        com.google.android.libraries.places.widget.model.MediaSize[] mediaSizeArr = {mediaSize, mediaSize2, mediaSize3};
        zza = mediaSizeArr;
        zzb = kotlin.enums.EnumEntriesKt.enumEntries(mediaSizeArr);
        CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzf
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.google.android.libraries.places.widget.model.MediaSize.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ java.lang.Object[] newArray(int i) {
                return new com.google.android.libraries.places.widget.model.MediaSize[i];
            }
        };
    }

    private MediaSize(java.lang.String str, int i) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }

    public static com.google.android.libraries.places.widget.model.MediaSize[] values() {
        return (com.google.android.libraries.places.widget.model.MediaSize[]) zza.clone();
    }

    public static com.google.android.libraries.places.widget.model.MediaSize valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.widget.model.MediaSize) java.lang.Enum.valueOf(com.google.android.libraries.places.widget.model.MediaSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.google.android.libraries.places.widget.model.MediaSize> getEntries() {
        return zzb;
    }
}
