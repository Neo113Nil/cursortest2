package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 extends AbstractC0823w0 implements Comparable {
    public static final Parcelable.Creator<u12> CREATOR = new jm1(20);

    /* JADX INFO: renamed from: j */
    public final int f7643j;

    /* JADX INFO: renamed from: k */
    public final int f7644k;

    public u12(int i, int i2) {
        this.f7643j = i;
        this.f7644k = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u12 u12Var = (u12) obj;
        int i = u12Var.f7643j;
        int i2 = this.f7643j;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = u12Var.f7644k;
        int i4 = this.f7644k;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (p000.u12) r3).f7643j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f7644k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        return (obj instanceof u12) && (i2 = this.f7643j) >= i && i2 <= i && (i4 = this.f7644k) >= i3 && i4 <= i3;
    }

    public final int hashCode() {
        return (this.f7643j * 31) + this.f7644k;
    }

    public final String toString() {
        int i = this.f7643j;
        int length = String.valueOf(i).length();
        int i2 = this.f7644k;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f7643j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f7644k);
        t22.m4665s(parcel, iM4663q);
    }
}
