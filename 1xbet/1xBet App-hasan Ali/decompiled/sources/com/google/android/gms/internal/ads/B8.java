package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class B8 extends AbstractC2187a {
    public static final Parcelable.Creator<B8> CREATOR = new C1812y0(23);

    /* renamed from: k, reason: collision with root package name */
    public final int f7770k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7771l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7772m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7773n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7774o;

    /* renamed from: p, reason: collision with root package name */
    public final Q2.V0 f7775p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7776q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7777r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7778s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7779t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7780u;

    public B8(int i, boolean z3, int i5, boolean z5, int i6, Q2.V0 v02, boolean z6, int i7, int i8, boolean z7, int i9) {
        this.f7770k = i;
        this.f7771l = z3;
        this.f7772m = i5;
        this.f7773n = z5;
        this.f7774o = i6;
        this.f7775p = v02;
        this.f7776q = z6;
        this.f7777r = i7;
        this.f7779t = z7;
        this.f7778s = i8;
        this.f7780u = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f7770k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f7771l ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f7772m);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f7773n ? 1 : 0);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f7774o);
        AbstractC2036a.e0(parcel, 6, this.f7775p, i);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f7776q ? 1 : 0);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f7777r);
        AbstractC2036a.n0(parcel, 9, 4);
        parcel.writeInt(this.f7778s);
        AbstractC2036a.n0(parcel, 10, 4);
        parcel.writeInt(this.f7779t ? 1 : 0);
        AbstractC2036a.n0(parcel, 11, 4);
        parcel.writeInt(this.f7780u);
        AbstractC2036a.m0(parcel, k02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B8(M2.c cVar) {
        this(4, cVar.f3606a, cVar.f3607b, cVar.f3609d, cVar.f3610e, r0 != null ? new Q2.V0(r0) : null, cVar.f3611g, cVar.f3608c, 0, false, 0);
        J2.s sVar = cVar.f;
    }
}
