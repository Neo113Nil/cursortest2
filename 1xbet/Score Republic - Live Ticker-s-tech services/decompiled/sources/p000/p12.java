package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 extends AbstractC0823w0 {
    public static final Parcelable.Creator<p12> CREATOR = new jm1(18);

    /* JADX INFO: renamed from: j */
    public final String f5961j;

    /* JADX INFO: renamed from: k */
    public final String f5962k;

    /* JADX INFO: renamed from: l */
    public final n12 f5963l;

    /* JADX INFO: renamed from: m */
    public final boolean f5964m;

    public p12(String str, String str2, n12 n12Var, boolean z) {
        this.f5961j = str;
        this.f5962k = str2;
        this.f5963l = n12Var;
        this.f5964m = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m3841b(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f5961j);
        sb.append(", ");
        sb.append(this.f5962k);
        sb.append(", ");
        this.f5963l.m3465b(sb);
        sb.append(", ");
        sb.append(this.f5964m);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p12)) {
            return false;
        }
        p12 p12Var = (p12) obj;
        return zg1.m5907r(this.f5961j, p12Var.f5961j) && zg1.m5907r(this.f5962k, p12Var.f5962k) && zg1.m5907r(this.f5963l, p12Var.f5963l) && this.f5964m == p12Var.f5964m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m3841b(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f5961j);
        t22.m4658l(parcel, 3, this.f5962k);
        t22.m4657k(parcel, 4, this.f5963l, i);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f5964m ? 1 : 0);
        t22.m4665s(parcel, iM4663q);
    }
}
