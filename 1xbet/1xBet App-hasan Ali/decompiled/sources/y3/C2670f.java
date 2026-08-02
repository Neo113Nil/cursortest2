package y3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: y3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2670f extends AbstractC2187a {
    public static final Parcelable.Creator<C2670f> CREATOR = new C2671g(0);

    /* renamed from: k, reason: collision with root package name */
    public final long f21225k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21226l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21227m;

    /* renamed from: n, reason: collision with root package name */
    public final String f21228n;

    /* renamed from: o, reason: collision with root package name */
    public final String f21229o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21230p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f21231q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21232r;

    public C2670f(long j5, long j6, boolean z3, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f21225k = j5;
        this.f21226l = j6;
        this.f21227m = z3;
        this.f21228n = str;
        this.f21229o = str2;
        this.f21230p = str3;
        this.f21231q = bundle;
        this.f21232r = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 8);
        parcel.writeLong(this.f21225k);
        AbstractC2036a.n0(parcel, 2, 8);
        parcel.writeLong(this.f21226l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f21227m ? 1 : 0);
        AbstractC2036a.f0(parcel, 4, this.f21228n);
        AbstractC2036a.f0(parcel, 5, this.f21229o);
        AbstractC2036a.f0(parcel, 6, this.f21230p);
        AbstractC2036a.b0(parcel, 7, this.f21231q);
        AbstractC2036a.f0(parcel, 8, this.f21232r);
        AbstractC2036a.m0(parcel, k02);
    }
}
