package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e12 extends AbstractC0823w0 implements Comparable {
    public static final Parcelable.Creator<e12> CREATOR = new jm1(13);

    /* JADX INFO: renamed from: j */
    public final int f1902j;

    /* JADX INFO: renamed from: k */
    public final n12[] f1903k;

    /* JADX INFO: renamed from: l */
    public final String[] f1904l;

    /* JADX INFO: renamed from: m */
    public final TreeMap f1905m = new TreeMap();

    public e12(int i, n12[] n12VarArr, String[] strArr) {
        this.f1902j = i;
        this.f1903k = n12VarArr;
        for (n12 n12Var : n12VarArr) {
            this.f1905m.put(n12Var.f5250j, n12Var);
        }
        this.f1904l = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f1902j - ((e12) obj).f1902j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e12)) {
            return false;
        }
        e12 e12Var = (e12) obj;
        return this.f1902j == e12Var.f1902j && zg1.m5907r(this.f1905m, e12Var.f1905m) && Arrays.equals(this.f1904l, e12Var.f1904l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f1902j);
        sb.append(", (");
        Iterator it = this.f1905m.values().iterator();
        while (it.hasNext()) {
            sb.append((n12) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f1904l;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f1902j);
        t22.m4659m(parcel, 3, this.f1903k, i);
        String[] strArr = this.f1904l;
        if (strArr != null) {
            int iM4663q2 = t22.m4663q(parcel, 4);
            parcel.writeStringArray(strArr);
            t22.m4665s(parcel, iM4663q2);
        }
        t22.m4665s(parcel, iM4663q);
    }
}
