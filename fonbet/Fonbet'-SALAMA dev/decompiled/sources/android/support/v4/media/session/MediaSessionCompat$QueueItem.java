package android.support.v4.media.session;

import W5.AbstractC0486a1;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8012b;

    /* renamed from: c, reason: collision with root package name */
    public MediaSession.QueueItem f8013c;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f8011a = mediaDescriptionCompat;
        this.f8012b = j;
        this.f8013c = queueItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f8011a);
        sb.append(", Id=");
        return AbstractC0486a1.i(sb, this.f8012b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f8011a.writeToParcel(parcel, i7);
        parcel.writeLong(this.f8012b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f8011a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f8012b = parcel.readLong();
    }
}
