package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 implements Parcelable {
    public static final Parcelable.Creator<p50> CREATOR = new C0936z2(4);

    /* JADX INFO: renamed from: j */
    public String f5989j;

    /* JADX INFO: renamed from: k */
    public int f5990k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5989j);
        parcel.writeInt(this.f5990k);
    }
}
