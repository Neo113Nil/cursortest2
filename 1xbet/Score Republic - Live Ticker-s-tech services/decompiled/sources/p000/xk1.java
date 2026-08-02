package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<xk1> CREATOR = new C0936z2(21);

    /* JADX INFO: renamed from: j */
    public final int f8981j;

    /* JADX INFO: renamed from: k */
    public final int f8982k;

    /* JADX INFO: renamed from: l */
    public final Intent f8983l;

    public xk1(int i, int i2, Intent intent) {
        this.f8981j = i;
        this.f8982k = i2;
        this.f8983l = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f8981j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f8982k);
        t22.m4657k(parcel, 3, this.f8983l, i);
        t22.m4665s(parcel, iM4663q);
    }
}
