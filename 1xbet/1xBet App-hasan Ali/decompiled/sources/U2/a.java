package U2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class a extends AbstractC2187a {
    public static final Parcelable.Creator<a> CREATOR = new C2.a(12);

    /* renamed from: k, reason: collision with root package name */
    public final String f5852k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5853l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5854m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5855n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5856o;

    public a(String str, int i, int i5, boolean z3, boolean z5) {
        this.f5852k = str;
        this.f5853l = i;
        this.f5854m = i5;
        this.f5855n = z3;
        this.f5856o = z5;
    }

    public static a a() {
        return new a(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f5852k);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f5853l);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f5854m);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f5855n ? 1 : 0);
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeInt(this.f5856o ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i, int i5, boolean z3, boolean z5) {
        this(r1.toString(), i, i5, z3, z5);
        String str;
        if (z3) {
            str = "0";
        } else {
            str = "1";
        }
        StringBuilder w5 = AbstractC2107A.w("afma-sdk-a-v", i, ".", i5, ".");
        w5.append(str);
    }
}
