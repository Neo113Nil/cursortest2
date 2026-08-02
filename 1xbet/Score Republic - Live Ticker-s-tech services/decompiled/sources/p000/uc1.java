package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<uc1> CREATOR = new C0936z2(20);

    /* JADX INFO: renamed from: j */
    public final int f7795j;

    /* JADX INFO: renamed from: k */
    public List f7796k;

    public uc1(int i, List list) {
        this.f7795j = i;
        this.f7796k = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f7795j);
        t22.m4660n(parcel, 2, this.f7796k);
        t22.m4665s(parcel, iM4663q);
    }
}
