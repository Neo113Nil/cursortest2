package Q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class c1 extends AbstractC2187a {
    public static final Parcelable.Creator<c1> CREATOR = new C0354d0(11);

    /* renamed from: k, reason: collision with root package name */
    public final String f4998k;

    /* renamed from: l, reason: collision with root package name */
    public long f4999l;

    /* renamed from: m, reason: collision with root package name */
    public C0387u0 f5000m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f5001n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5002o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5003p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5004q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5005r;

    public c1(String str, long j5, C0387u0 c0387u0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f4998k = str;
        this.f4999l = j5;
        this.f5000m = c0387u0;
        this.f5001n = bundle;
        this.f5002o = str2;
        this.f5003p = str3;
        this.f5004q = str4;
        this.f5005r = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f4998k);
        long j5 = this.f4999l;
        AbstractC2036a.n0(parcel, 2, 8);
        parcel.writeLong(j5);
        AbstractC2036a.e0(parcel, 3, this.f5000m, i);
        AbstractC2036a.b0(parcel, 4, this.f5001n);
        AbstractC2036a.f0(parcel, 5, this.f5002o);
        AbstractC2036a.f0(parcel, 6, this.f5003p);
        AbstractC2036a.f0(parcel, 7, this.f5004q);
        AbstractC2036a.f0(parcel, 8, this.f5005r);
        AbstractC2036a.m0(parcel, k02);
    }
}
