package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0936z2;
import p000.kh1;
import p000.lh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0936z2(14);

    /* JADX INFO: renamed from: j */
    public final lh1 f576j;

    public ParcelImpl(Parcel parcel) {
        this.f576j = new kh1(parcel).m2866h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new kh1(parcel).m2869k(this.f576j);
    }
}
