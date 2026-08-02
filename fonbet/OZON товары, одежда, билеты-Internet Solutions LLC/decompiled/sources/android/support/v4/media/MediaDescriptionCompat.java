package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f36867a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f36868b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f36869c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f36870d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f36871e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f36872f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f36873g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f36874h;

    /* renamed from: i, reason: collision with root package name */
    private MediaDescription f36875i;

    final class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private String f36876a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f36877b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f36878c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f36879d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f36880e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f36881f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f36882g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f36883h;

        public final MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f36876a, this.f36877b, this.f36878c, this.f36879d, this.f36880e, this.f36881f, this.f36882g, this.f36883h);
        }

        public final void b(CharSequence charSequence) {
            this.f36879d = charSequence;
        }

        public final void c(Bundle bundle) {
            this.f36882g = bundle;
        }

        public final void d(Bitmap bitmap) {
            this.f36880e = bitmap;
        }

        public final void e(Uri uri) {
            this.f36881f = uri;
        }

        public final void f(String str) {
            this.f36876a = str;
        }

        public final void g(Uri uri) {
            this.f36883h = uri;
        }

        public final void h(CharSequence charSequence) {
            this.f36878c = charSequence;
        }

        public final void i(CharSequence charSequence) {
            this.f36877b = charSequence;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f36867a = str;
        this.f36868b = charSequence;
        this.f36869c = charSequence2;
        this.f36870d = charSequence3;
        this.f36871e = bitmap;
        this.f36872f = uri;
        this.f36873g = bundle;
        this.f36874h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle d11 = b.d(mediaDescription);
        if (d11 != null) {
            d11 = MediaSessionCompat.a(d11);
        }
        Uri uri = d11 != null ? (Uri) d11.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (!d11.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || d11.size() != 2) {
                d11.remove("android.support.v4.media.description.MEDIA_URI");
                d11.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            dVar.c(bundle);
            if (uri == null) {
                dVar.g(uri);
            } else {
                dVar.g(c.a(mediaDescription));
            }
            MediaDescriptionCompat a11 = dVar.a();
            a11.f36875i = mediaDescription;
            return a11;
        }
        bundle = d11;
        dVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a112 = dVar.a();
        a112.f36875i = mediaDescription;
        return a112;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f36868b) + ", " + ((Object) this.f36869c) + ", " + ((Object) this.f36870d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        MediaDescription mediaDescription = this.f36875i;
        if (mediaDescription == null) {
            MediaDescription.Builder b11 = b.b();
            b.n(b11, this.f36867a);
            b.p(b11, this.f36868b);
            b.o(b11, this.f36869c);
            b.j(b11, this.f36870d);
            b.l(b11, this.f36871e);
            b.m(b11, this.f36872f);
            b.k(b11, this.f36873g);
            c.b(b11, this.f36874h);
            mediaDescription = b.a(b11);
            this.f36875i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i11);
    }
}
