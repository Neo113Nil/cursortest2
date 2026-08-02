package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0936z2;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0936z2(8);

    /* JADX INFO: renamed from: j */
    public final String f259j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f260k;

    /* JADX INFO: renamed from: l */
    public final CharSequence f261l;

    /* JADX INFO: renamed from: m */
    public final CharSequence f262m;

    /* JADX INFO: renamed from: n */
    public final Bitmap f263n;

    /* JADX INFO: renamed from: o */
    public final Uri f264o;

    /* JADX INFO: renamed from: p */
    public final Bundle f265p;

    /* JADX INFO: renamed from: q */
    public final Uri f266q;

    /* JADX INFO: renamed from: r */
    public Object f267r;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f259j = str;
        this.f260k = charSequence;
        this.f261l = charSequence2;
        this.f262m = charSequence3;
        this.f263n = bitmap;
        this.f264o = uri;
        this.f265p = bundle;
        this.f266q = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f260k) + ", " + ((Object) this.f261l) + ", " + ((Object) this.f262m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.f267r;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f259j);
            builder.setTitle(this.f260k);
            builder.setSubtitle(this.f261l);
            builder.setDescription(this.f262m);
            builder.setIconBitmap(this.f263n);
            builder.setIconUri(this.f264o);
            builder.setExtras(this.f265p);
            builder.setMediaUri(this.f266q);
            objBuild = builder.build();
            this.f267r = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
