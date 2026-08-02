package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0089c8;
import p000.C0936z2;
import p000.hn0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: j */
    public final Bundle f268j;

    static {
        C0089c8 c0089c8 = new C0089c8(0);
        c0089c8.put("android.media.metadata.TITLE", 1);
        c0089c8.put("android.media.metadata.ARTIST", 1);
        c0089c8.put("android.media.metadata.DURATION", 0);
        c0089c8.put("android.media.metadata.ALBUM", 1);
        c0089c8.put("android.media.metadata.AUTHOR", 1);
        c0089c8.put("android.media.metadata.WRITER", 1);
        c0089c8.put("android.media.metadata.COMPOSER", 1);
        c0089c8.put("android.media.metadata.COMPILATION", 1);
        c0089c8.put("android.media.metadata.DATE", 1);
        c0089c8.put("android.media.metadata.YEAR", 0);
        c0089c8.put("android.media.metadata.GENRE", 1);
        c0089c8.put("android.media.metadata.TRACK_NUMBER", 0);
        c0089c8.put("android.media.metadata.NUM_TRACKS", 0);
        c0089c8.put("android.media.metadata.DISC_NUMBER", 0);
        c0089c8.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0089c8.put("android.media.metadata.ART", 2);
        c0089c8.put("android.media.metadata.ART_URI", 1);
        c0089c8.put("android.media.metadata.ALBUM_ART", 2);
        c0089c8.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0089c8.put("android.media.metadata.USER_RATING", 3);
        c0089c8.put("android.media.metadata.RATING", 3);
        c0089c8.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0089c8.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0089c8.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0089c8.put("android.media.metadata.DISPLAY_ICON", 2);
        c0089c8.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0089c8.put("android.media.metadata.MEDIA_ID", 1);
        c0089c8.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0089c8.put("android.media.metadata.MEDIA_URI", 1);
        c0089c8.put("android.media.metadata.ADVERTISEMENT", 0);
        c0089c8.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0936z2(9);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f268j = parcel.readBundle(hn0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f268j);
    }
}
