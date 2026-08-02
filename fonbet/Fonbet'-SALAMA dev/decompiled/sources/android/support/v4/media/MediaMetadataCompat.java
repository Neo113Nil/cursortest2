package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final r.b f7987d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f7988e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f7989f;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f7990x;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f7991a;

    /* renamed from: b, reason: collision with root package name */
    public MediaMetadata f7992b;

    /* renamed from: c, reason: collision with root package name */
    public MediaDescriptionCompat f7993c;

    static {
        r.b bVar = new r.b();
        f7987d = bVar;
        bVar.put("android.media.metadata.TITLE", 1);
        bVar.put("android.media.metadata.ARTIST", 1);
        bVar.put("android.media.metadata.DURATION", 0);
        bVar.put("android.media.metadata.ALBUM", 1);
        bVar.put("android.media.metadata.AUTHOR", 1);
        bVar.put("android.media.metadata.WRITER", 1);
        bVar.put("android.media.metadata.COMPOSER", 1);
        bVar.put("android.media.metadata.COMPILATION", 1);
        bVar.put("android.media.metadata.DATE", 1);
        bVar.put("android.media.metadata.YEAR", 0);
        bVar.put("android.media.metadata.GENRE", 1);
        bVar.put("android.media.metadata.TRACK_NUMBER", 0);
        bVar.put("android.media.metadata.NUM_TRACKS", 0);
        bVar.put("android.media.metadata.DISC_NUMBER", 0);
        bVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        bVar.put("android.media.metadata.ART", 2);
        bVar.put("android.media.metadata.ART_URI", 1);
        bVar.put("android.media.metadata.ALBUM_ART", 2);
        bVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        bVar.put("android.media.metadata.USER_RATING", 3);
        bVar.put("android.media.metadata.RATING", 3);
        bVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bVar.put("android.media.metadata.DISPLAY_ICON", 2);
        bVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bVar.put("android.media.metadata.MEDIA_ID", 1);
        bVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        bVar.put("android.media.metadata.MEDIA_URI", 1);
        bVar.put("android.media.metadata.ADVERTISEMENT", 0);
        bVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f7988e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f7989f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f7990x = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Z2.a(17);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f7991a = bundle2;
        t.Z(bundle2);
    }

    public final MediaDescriptionCompat a() {
        Bitmap bitmap;
        Uri uri;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f7993c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String b7 = b("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        Bundle bundle = this.f7991a;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < 3) {
                String[] strArr = f7988e;
                if (i8 >= strArr.length) {
                    break;
                }
                int i9 = i8 + 1;
                CharSequence charSequence2 = bundle.getCharSequence(strArr[i8]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i7] = charSequence2;
                    i7++;
                }
                i8 = i9;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i10 = 0;
        while (true) {
            String[] strArr2 = f7989f;
            if (i10 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (Bitmap) bundle.getParcelable(strArr2[i10]);
            } catch (Exception e7) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e7);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            String[] strArr3 = f7990x;
            if (i11 >= strArr3.length) {
                uri = null;
                break;
            }
            String b8 = b(strArr3[i11]);
            if (!TextUtils.isEmpty(b8)) {
                uri = Uri.parse(b8);
                break;
            }
            i11++;
        }
        String b9 = b("android.media.metadata.MEDIA_URI");
        Uri parse = !TextUtils.isEmpty(b9) ? Uri.parse(b9) : null;
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(b7, charSequence3, charSequence4, charSequence5, bitmap, uri, !bundle2.isEmpty() ? bundle2 : null, parse);
        this.f7993c = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final String b(String str) {
        CharSequence charSequence = this.f7991a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f7991a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f7991a = parcel.readBundle(t.class.getClassLoader());
    }
}
