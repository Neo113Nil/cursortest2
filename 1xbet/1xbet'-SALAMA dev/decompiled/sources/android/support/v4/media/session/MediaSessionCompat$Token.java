package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f8017c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8015a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q0.d f8018d = null;

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.f8016b = obj;
        this.f8017c = dVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f8015a) {
            dVar = this.f8017c;
        }
        return dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f8016b;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f8016b == null;
        }
        Object obj3 = mediaSessionCompat$Token.f8016b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f8016b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable((Parcelable) this.f8016b, i7);
    }
}
