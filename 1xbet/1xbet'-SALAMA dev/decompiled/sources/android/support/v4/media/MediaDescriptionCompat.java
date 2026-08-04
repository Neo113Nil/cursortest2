package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Z2.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f7979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f7980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f7981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f7982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f7983f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f7984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Uri f7985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = f.g(mediaDescription);
        CharSequence charSequenceI = f.i(mediaDescription);
        CharSequence charSequenceH = f.h(mediaDescription);
        CharSequence charSequenceC = f.c(mediaDescription);
        Bitmap bitmapE = f.e(mediaDescription);
        Uri uriF = f.f(mediaDescription);
        Bundle bundleD = f.d(mediaDescription);
        if (bundleD != null) {
            bundleD = t.B0(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = g.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.f7986z = mediaDescription;
        return mediaDescriptionCompat;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.f7986z;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = f.b();
        f.n(builderB, this.f7978a);
        f.p(builderB, this.f7979b);
        f.o(builderB, this.f7980c);
        f.j(builderB, this.f7981d);
        f.l(builderB, this.f7982e);
        f.m(builderB, this.f7983f);
        f.k(builderB, this.f7984x);
        g.b(builderB, this.f7985y);
        MediaDescription mediaDescriptionA = f.a(builderB);
        this.f7986z = mediaDescriptionA;
        return mediaDescriptionA;
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
