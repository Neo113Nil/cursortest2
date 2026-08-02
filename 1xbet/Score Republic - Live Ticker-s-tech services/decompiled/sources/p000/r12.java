package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r12 extends AbstractC0823w0 {
    public static final Parcelable.Creator<r12> CREATOR = new jm1(19);

    /* JADX INFO: renamed from: j */
    public final List f6664j;

    public r12(ArrayList arrayList) {
        this.f6664j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r12) {
            return this.f6664j.equals(((r12) obj).f6664j);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (p12 p12Var : this.f6664j) {
            if (!z) {
                sb.append(", ");
            }
            p12Var.m3841b(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4660n(parcel, 2, this.f6664j);
        t22.m4665s(parcel, iM4663q);
    }
}
