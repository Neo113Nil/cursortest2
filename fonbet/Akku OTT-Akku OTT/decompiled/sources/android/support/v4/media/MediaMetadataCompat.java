package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.ArrayMap;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final ArrayMap<String, Integer> c;
    public final Bundle a;
    public MediaMetadata b;

    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        c = arrayMap;
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TITLE, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ARTIST, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_AUTHOR, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_WRITER, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPOSER, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPILATION, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DATE, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_YEAR, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_GENRE, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART, 2);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART_URI, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART, 2);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_USER_RATING, 3);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_RATING, 3);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 2);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 1);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
