package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class R0 extends AbstractC2187a {
    public static final Parcelable.Creator<R0> CREATOR = new C0354d0(4);

    /* renamed from: k, reason: collision with root package name */
    public final String f4935k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4936l;

    /* renamed from: m, reason: collision with root package name */
    public final X0 f4937m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4938n;

    public R0(String str, int i, X0 x02, int i5) {
        this.f4935k = str;
        this.f4936l = i;
        this.f4937m = x02;
        this.f4938n = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r02 = (R0) obj;
        return this.f4935k.equals(r02.f4935k) && this.f4936l == r02.f4936l && this.f4937m.a(r02.f4937m);
    }

    public final int hashCode() {
        return Objects.hash(this.f4935k, Integer.valueOf(this.f4936l), this.f4937m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f4935k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4936l);
        AbstractC2036a.e0(parcel, 3, this.f4937m, i);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f4938n);
        AbstractC2036a.m0(parcel, k02);
    }
}
