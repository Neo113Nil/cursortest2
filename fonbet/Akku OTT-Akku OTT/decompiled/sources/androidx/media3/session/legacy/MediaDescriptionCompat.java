package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.UnstableApi;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
/* loaded from: classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: androidx.media3.session.legacy.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    @SuppressLint({"InlinedApi"})
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;

    @Nullable
    private final CharSequence description;

    @Nullable
    private MediaDescription descriptionFwk;

    @Nullable
    private final Bundle extras;

    @Nullable
    private final Bitmap icon;

    @Nullable
    private final Uri iconUri;

    @Nullable
    private final String mediaId;

    @Nullable
    private final Uri mediaUri;

    @Nullable
    private final CharSequence subtitle;

    @Nullable
    private final CharSequence title;

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @Nullable
        public static Uri getMediaUri(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void setMediaUri(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class Builder {

        @Nullable
        private CharSequence description;

        @Nullable
        private Bundle extras;

        @Nullable
        private Bitmap icon;

        @Nullable
        private Uri iconUri;

        @Nullable
        private String mediaId;

        @Nullable
        private Uri mediaUri;

        @Nullable
        private CharSequence subtitle;

        @Nullable
        private CharSequence title;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mediaId, this.title, this.subtitle, this.description, this.icon, this.iconUri, this.extras, this.mediaUri);
        }

        public Builder setDescription(@Nullable CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public Builder setExtras(@Nullable Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public Builder setIconBitmap(@Nullable Bitmap bitmap) {
            this.icon = bitmap;
            return this;
        }

        public Builder setIconUri(@Nullable Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setMediaId(@Nullable String str) {
            this.mediaId = str;
            return this;
        }

        public Builder setMediaUri(@Nullable Uri uri) {
            this.mediaUri = uri;
            return this;
        }

        public Builder setSubtitle(@Nullable CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(@Nullable String str, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable Bitmap bitmap, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable Uri uri2) {
        this.mediaId = str;
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.description = charSequence3;
        this.icon = bitmap;
        this.iconUri = uri;
        this.extras = bundle;
        this.mediaUri = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(MediaDescription mediaDescription) {
        Builder builder = new Builder();
        builder.setMediaId(mediaDescription.getMediaId());
        builder.setTitle(mediaDescription.getTitle());
        builder.setSubtitle(mediaDescription.getSubtitle());
        builder.setDescription(mediaDescription.getDescription());
        builder.setIconBitmap(mediaDescription.getIconBitmap());
        builder.setIconUri(mediaDescription.getIconUri());
        Bundle unparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(mediaDescription.getExtras());
        if (unparcelWithClassLoader != null) {
            unparcelWithClassLoader = new Bundle(unparcelWithClassLoader);
        }
        Uri uri = null;
        if (unparcelWithClassLoader != null) {
            Uri uri2 = (Uri) unparcelWithClassLoader.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
            if (uri2 != null) {
                if (unparcelWithClassLoader.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && unparcelWithClassLoader.size() == 2) {
                    unparcelWithClassLoader = null;
                } else {
                    unparcelWithClassLoader.remove(DESCRIPTION_KEY_MEDIA_URI);
                    unparcelWithClassLoader.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                }
            }
            uri = uri2;
        }
        builder.setExtras(unparcelWithClassLoader);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(Api23Impl.getMediaUri(mediaDescription));
        }
        MediaDescriptionCompat build = builder.build();
        build.descriptionFwk = mediaDescription;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.description;
    }

    @Nullable
    public Bundle getExtras() {
        return this.extras;
    }

    @Nullable
    public Bitmap getIconBitmap() {
        return this.icon;
    }

    @Nullable
    public Uri getIconUri() {
        return this.iconUri;
    }

    public MediaDescription getMediaDescription() {
        MediaDescription mediaDescription = this.descriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.mediaId);
        builder.setTitle(this.title);
        builder.setSubtitle(this.subtitle);
        builder.setDescription(this.description);
        builder.setIconBitmap(this.icon);
        builder.setIconUri(this.iconUri);
        builder.setExtras(this.extras);
        Api23Impl.setMediaUri(builder, this.mediaUri);
        MediaDescription build = builder.build();
        this.descriptionFwk = build;
        return build;
    }

    @Nullable
    public String getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public Uri getMediaUri() {
        return this.mediaUri;
    }

    @Nullable
    public CharSequence getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.title;
    }

    public String toString() {
        return ((Object) this.title) + ", " + ((Object) this.subtitle) + ", " + ((Object) this.description);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        getMediaDescription().writeToParcel(parcel, i);
    }
}
