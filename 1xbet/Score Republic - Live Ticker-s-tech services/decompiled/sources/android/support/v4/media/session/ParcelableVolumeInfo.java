package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0936z2;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0936z2(15);

    /* JADX INFO: renamed from: j */
    public int f275j;

    /* JADX INFO: renamed from: k */
    public int f276k;

    /* JADX INFO: renamed from: l */
    public int f277l;

    /* JADX INFO: renamed from: m */
    public int f278m;

    /* JADX INFO: renamed from: n */
    public int f279n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f275j);
        parcel.writeInt(this.f277l);
        parcel.writeInt(this.f278m);
        parcel.writeInt(this.f279n);
        parcel.writeInt(this.f276k);
    }
}
