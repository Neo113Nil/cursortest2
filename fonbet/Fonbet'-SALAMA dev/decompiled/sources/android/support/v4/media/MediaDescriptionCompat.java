package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Z2.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f7978a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f7979b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f7980c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f7981d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f7982e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f7983f;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f7984x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f7985y;

    /* renamed from: z, reason: collision with root package name */
    public MediaDescription f7986z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7978a = str;
        this.f7979b = charSequence;
        this.f7980c = charSequence2;
        this.f7981d = charSequence3;
        this.f7982e = bitmap;
        this.f7983f = uri;
        this.f7984x = bundle;
        this.f7985y = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String g3 = f.g(mediaDescription);
        CharSequence i7 = f.i(mediaDescription);
        CharSequence h6 = f.h(mediaDescription);
        CharSequence c3 = f.c(mediaDescription);
        Bitmap e7 = f.e(mediaDescription);
        Uri f7 = f.f(mediaDescription);
        Bundle d7 = f.d(mediaDescription);
        if (d7 != null) {
            d7 = t.B0(d7);
        }
        Uri uri = d7 != null ? (Uri) d7.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (d7.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d7.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = g.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g3, i7, h6, c3, e7, f7, bundle, uri);
                mediaDescriptionCompat.f7986z = mediaDescription;
                return mediaDescriptionCompat;
            }
            d7.remove("android.support.v4.media.description.MEDIA_URI");
            d7.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = d7;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g3, i7, h6, c3, e7, f7, bundle, uri);
        mediaDescriptionCompat2.f7986z = mediaDescription;
        return mediaDescriptionCompat2;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.f7986z;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b7 = f.b();
        f.n(b7, this.f7978a);
        f.p(b7, this.f7979b);
        f.o(b7, this.f7980c);
        f.j(b7, this.f7981d);
        f.l(b7, this.f7982e);
        f.m(b7, this.f7983f);
        f.k(b7, this.f7984x);
        g.b(b7, this.f7985y);
        MediaDescription a2 = f.a(b7);
        this.f7986z = a2;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f7979b) + ", " + ((Object) this.f7980c) + ", " + ((Object) this.f7981d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        b().writeToParcel(parcel, i7);
    }
}
