package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0936z2;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0936z2(17);

    /* JADX INFO: renamed from: j */
    public final int f269j;

    /* JADX INFO: renamed from: k */
    public final float f270k;

    public RatingCompat(int i, float f) {
        this.f269j = i;
        this.f270k = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f269j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f269j);
        sb.append(" rating=");
        float f = this.f270k;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f269j);
        parcel.writeFloat(this.f270k);
    }
}
