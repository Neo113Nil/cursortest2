package Q2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class X0 extends AbstractC2187a {
    public static final Parcelable.Creator<X0> CREATOR = new C0354d0(8);

    /* renamed from: A, reason: collision with root package name */
    public final String f4948A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f4949B;

    /* renamed from: C, reason: collision with root package name */
    public final M f4950C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4951D;

    /* renamed from: E, reason: collision with root package name */
    public final String f4952E;

    /* renamed from: F, reason: collision with root package name */
    public final List f4953F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4954G;

    /* renamed from: H, reason: collision with root package name */
    public final String f4955H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4956I;
    public final long J;

    /* renamed from: k, reason: collision with root package name */
    public final int f4957k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4958l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f4959m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4960n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4961o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4962p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4963q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4964r;

    /* renamed from: s, reason: collision with root package name */
    public final String f4965s;

    /* renamed from: t, reason: collision with root package name */
    public final T0 f4966t;

    /* renamed from: u, reason: collision with root package name */
    public final Location f4967u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4968v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f4969w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f4970x;

    /* renamed from: y, reason: collision with root package name */
    public final List f4971y;

    /* renamed from: z, reason: collision with root package name */
    public final String f4972z;

    public X0(int i, long j5, Bundle bundle, int i5, List list, boolean z3, int i6, boolean z5, String str, T0 t02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z6, M m5, int i7, String str5, List list3, int i8, String str6, int i9, long j6) {
        this.f4957k = i;
        this.f4958l = j5;
        this.f4959m = bundle == null ? new Bundle() : bundle;
        this.f4960n = i5;
        this.f4961o = list;
        this.f4962p = z3;
        this.f4963q = i6;
        this.f4964r = z5;
        this.f4965s = str;
        this.f4966t = t02;
        this.f4967u = location;
        this.f4968v = str2;
        this.f4969w = bundle2 == null ? new Bundle() : bundle2;
        this.f4970x = bundle3;
        this.f4971y = list2;
        this.f4972z = str3;
        this.f4948A = str4;
        this.f4949B = z6;
        this.f4950C = m5;
        this.f4951D = i7;
        this.f4952E = str5;
        this.f4953F = list3 == null ? new ArrayList() : list3;
        this.f4954G = i8;
        this.f4955H = str6;
        this.f4956I = i9;
        this.J = j6;
    }

    public final boolean a(X0 x02) {
        if (AbstractC2107A.A(x02)) {
            return this.f4957k == x02.f4957k && this.f4958l == x02.f4958l && U2.j.a(this.f4959m, x02.f4959m) && this.f4960n == x02.f4960n && m3.v.g(this.f4961o, x02.f4961o) && this.f4962p == x02.f4962p && this.f4963q == x02.f4963q && this.f4964r == x02.f4964r && m3.v.g(this.f4965s, x02.f4965s) && m3.v.g(this.f4966t, x02.f4966t) && m3.v.g(this.f4967u, x02.f4967u) && m3.v.g(this.f4968v, x02.f4968v) && U2.j.a(this.f4969w, x02.f4969w) && U2.j.a(this.f4970x, x02.f4970x) && m3.v.g(this.f4971y, x02.f4971y) && m3.v.g(this.f4972z, x02.f4972z) && m3.v.g(this.f4948A, x02.f4948A) && this.f4949B == x02.f4949B && this.f4951D == x02.f4951D && m3.v.g(this.f4952E, x02.f4952E) && m3.v.g(this.f4953F, x02.f4953F) && this.f4954G == x02.f4954G && m3.v.g(this.f4955H, x02.f4955H) && this.f4956I == x02.f4956I;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X0) {
            return a((X0) obj) && this.J == ((X0) obj).J;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4957k), Long.valueOf(this.f4958l), this.f4959m, Integer.valueOf(this.f4960n), this.f4961o, Boolean.valueOf(this.f4962p), Integer.valueOf(this.f4963q), Boolean.valueOf(this.f4964r), this.f4965s, this.f4966t, this.f4967u, this.f4968v, this.f4969w, this.f4970x, this.f4971y, this.f4972z, this.f4948A, Boolean.valueOf(this.f4949B), Integer.valueOf(this.f4951D), this.f4952E, this.f4953F, Integer.valueOf(this.f4954G), this.f4955H, Integer.valueOf(this.f4956I), Long.valueOf(this.J)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f4957k);
        AbstractC2036a.n0(parcel, 2, 8);
        parcel.writeLong(this.f4958l);
        AbstractC2036a.b0(parcel, 3, this.f4959m);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f4960n);
        AbstractC2036a.h0(parcel, 5, this.f4961o);
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeInt(this.f4962p ? 1 : 0);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f4963q);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f4964r ? 1 : 0);
        AbstractC2036a.f0(parcel, 9, this.f4965s);
        AbstractC2036a.e0(parcel, 10, this.f4966t, i);
        AbstractC2036a.e0(parcel, 11, this.f4967u, i);
        AbstractC2036a.f0(parcel, 12, this.f4968v);
        AbstractC2036a.b0(parcel, 13, this.f4969w);
        AbstractC2036a.b0(parcel, 14, this.f4970x);
        AbstractC2036a.h0(parcel, 15, this.f4971y);
        AbstractC2036a.f0(parcel, 16, this.f4972z);
        AbstractC2036a.f0(parcel, 17, this.f4948A);
        AbstractC2036a.n0(parcel, 18, 4);
        parcel.writeInt(this.f4949B ? 1 : 0);
        AbstractC2036a.e0(parcel, 19, this.f4950C, i);
        AbstractC2036a.n0(parcel, 20, 4);
        parcel.writeInt(this.f4951D);
        AbstractC2036a.f0(parcel, 21, this.f4952E);
        AbstractC2036a.h0(parcel, 22, this.f4953F);
        AbstractC2036a.n0(parcel, 23, 4);
        parcel.writeInt(this.f4954G);
        AbstractC2036a.f0(parcel, 24, this.f4955H);
        AbstractC2036a.n0(parcel, 25, 4);
        parcel.writeInt(this.f4956I);
        AbstractC2036a.n0(parcel, 26, 8);
        parcel.writeLong(this.J);
        AbstractC2036a.m0(parcel, k02);
    }
}
