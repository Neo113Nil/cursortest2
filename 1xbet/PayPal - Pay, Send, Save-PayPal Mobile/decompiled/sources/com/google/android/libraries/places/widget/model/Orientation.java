package com.google.android.libraries.places.widget.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/Orientation;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "HORIZONTAL", "VERTICAL"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Orientation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.model.Orientation> CREATOR;
    public static final com.google.android.libraries.places.widget.model.Orientation HORIZONTAL;
    public static final com.google.android.libraries.places.widget.model.Orientation VERTICAL;
    private static final /* synthetic */ com.google.android.libraries.places.widget.model.Orientation[] zza;
    private static final /* synthetic */ kotlin.enums.EnumEntries zzb;

    static {
        com.google.android.libraries.places.widget.model.Orientation orientation = new com.google.android.libraries.places.widget.model.Orientation("HORIZONTAL", 0);
        HORIZONTAL = orientation;
        com.google.android.libraries.places.widget.model.Orientation orientation2 = new com.google.android.libraries.places.widget.model.Orientation("VERTICAL", 1);
        VERTICAL = orientation2;
        com.google.android.libraries.places.widget.model.Orientation[] orientationArr = {orientation, orientation2};
        zza = orientationArr;
        zzb = kotlin.enums.EnumEntriesKt.enumEntries(orientationArr);
        CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzg
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.google.android.libraries.places.widget.model.Orientation.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ java.lang.Object[] newArray(int i) {
                return new com.google.android.libraries.places.widget.model.Orientation[i];
            }
        };
    }

    private Orientation(java.lang.String str, int i) {
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

    public static com.google.android.libraries.places.widget.model.Orientation[] values() {
        return (com.google.android.libraries.places.widget.model.Orientation[]) zza.clone();
    }

    public static com.google.android.libraries.places.widget.model.Orientation valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.widget.model.Orientation) java.lang.Enum.valueOf(com.google.android.libraries.places.widget.model.Orientation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.google.android.libraries.places.widget.model.Orientation> getEntries() {
        return zzb;
    }
}
