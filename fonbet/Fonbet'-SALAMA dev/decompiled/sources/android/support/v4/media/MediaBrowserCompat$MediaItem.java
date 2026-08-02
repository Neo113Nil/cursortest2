package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new Z2.a(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f7976a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDescriptionCompat f7977b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(mediaDescriptionCompat.f7978a)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f7976a = i7;
        this.f7977b = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f7976a + ", mDescription=" + this.f7977b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7976a);
        this.f7977b.writeToParcel(parcel, i7);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f7976a = parcel.readInt();
        this.f7977b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
