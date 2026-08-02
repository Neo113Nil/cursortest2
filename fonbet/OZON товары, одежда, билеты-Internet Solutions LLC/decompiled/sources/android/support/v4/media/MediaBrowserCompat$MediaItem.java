package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f36865a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDescriptionCompat f36866b;

    final class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem[] newArray(int i11) {
            return new MediaBrowserCompat$MediaItem[i11];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f36865a = parcel.readInt();
        this.f36866b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        return "MediaItem{mFlags=" + this.f36865a + ", mDescription=" + this.f36866b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36865a);
        this.f36866b.writeToParcel(parcel, i11);
    }
}
