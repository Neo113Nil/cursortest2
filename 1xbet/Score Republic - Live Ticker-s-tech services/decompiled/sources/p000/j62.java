package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 extends AbstractC0823w0 {
    public static final Parcelable.Creator<j62> CREATOR = new jm1(27);

    /* JADX INFO: renamed from: j */
    public final List f3831j;

    public j62(ArrayList arrayList) {
        this.f3831j = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4660n(parcel, 1, this.f3831j);
        t22.m4665s(parcel, iM4663q);
    }
}
