package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g12 extends AbstractC0823w0 {
    public static final Parcelable.Creator<g12> CREATOR = new jm1(14);

    /* JADX INFO: renamed from: j */
    public final String f2575j;

    /* JADX INFO: renamed from: k */
    public final byte[] f2576k;

    /* JADX INFO: renamed from: l */
    public final String f2577l;

    /* JADX INFO: renamed from: m */
    public final e12[] f2578m;

    /* JADX INFO: renamed from: n */
    public final TreeMap f2579n = new TreeMap();

    /* JADX INFO: renamed from: o */
    public final boolean f2580o;

    /* JADX INFO: renamed from: p */
    public final long f2581p;

    public g12(String str, String str2, e12[] e12VarArr, boolean z, byte[] bArr, long j) {
        this.f2575j = str;
        this.f2577l = str2;
        this.f2578m = e12VarArr;
        this.f2580o = z;
        this.f2576k = bArr;
        this.f2581p = j;
        for (e12 e12Var : e12VarArr) {
            this.f2579n.put(Integer.valueOf(e12Var.f1902j), e12Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        return zg1.m5907r(this.f2575j, g12Var.f2575j) && zg1.m5907r(this.f2577l, g12Var.f2577l) && this.f2579n.equals(g12Var.f2579n) && this.f2580o == g12Var.f2580o && Arrays.equals(this.f2576k, g12Var.f2576k) && this.f2581p == g12Var.f2581p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2575j, this.f2577l, this.f2579n, Boolean.valueOf(this.f2580o), this.f2576k, Long.valueOf(this.f2581p)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f2575j);
        sb.append("', '");
        sb.append(this.f2577l);
        sb.append("', (");
        Iterator it = this.f2579n.values().iterator();
        while (it.hasNext()) {
            sb.append((e12) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f2580o);
        sb.append(", ");
        byte[] bArr = this.f2576k;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f2581p);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f2575j);
        t22.m4658l(parcel, 3, this.f2577l);
        t22.m4659m(parcel, 4, this.f2578m, i);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f2580o ? 1 : 0);
        t22.m4653g(parcel, 6, this.f2576k);
        t22.m4662p(parcel, 7, 8);
        parcel.writeLong(this.f2581p);
        t22.m4665s(parcel, iM4663q);
    }
}
