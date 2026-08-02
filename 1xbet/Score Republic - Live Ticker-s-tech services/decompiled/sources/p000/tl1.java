package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<tl1> CREATOR = new C0936z2(24);

    /* JADX INFO: renamed from: j */
    public final List f7529j;

    /* JADX INFO: renamed from: k */
    public final String f7530k;

    public tl1(String str, ArrayList arrayList) {
        this.f7529j = arrayList;
        this.f7530k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        List<String> list = this.f7529j;
        if (list != null) {
            int iM4663q2 = t22.m4663q(parcel, 1);
            parcel.writeStringList(list);
            t22.m4665s(parcel, iM4663q2);
        }
        t22.m4658l(parcel, 2, this.f7530k);
        t22.m4665s(parcel, iM4663q);
    }
}
