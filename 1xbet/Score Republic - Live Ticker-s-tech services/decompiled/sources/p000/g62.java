package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 extends AbstractC0823w0 {
    public static final Parcelable.Creator<g62> CREATOR = new jm1(26);

    /* JADX INFO: renamed from: j */
    public final List f2636j;

    public g62(ArrayList arrayList) {
        this.f2636j = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static g62 m1992b(e32... e32VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(e32VarArr[0].f1946j));
        return new g62(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        List list = this.f2636j;
        if (list != null) {
            int iM4663q2 = t22.m4663q(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            t22.m4665s(parcel, iM4663q2);
        }
        t22.m4665s(parcel, iM4663q);
    }
}
