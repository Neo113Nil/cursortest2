package m3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class j extends AbstractC2187a {
    public static final Parcelable.Creator<j> CREATOR = new C2.a(22);

    /* renamed from: k, reason: collision with root package name */
    public final int f18067k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18068l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18069m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18070n;

    /* renamed from: o, reason: collision with root package name */
    public final long f18071o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18072p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18073q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18074r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18075s;

    public j(int i, int i5, int i6, long j5, long j6, String str, String str2, int i7, int i8) {
        this.f18067k = i;
        this.f18068l = i5;
        this.f18069m = i6;
        this.f18070n = j5;
        this.f18071o = j6;
        this.f18072p = str;
        this.f18073q = str2;
        this.f18074r = i7;
        this.f18075s = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f18067k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f18068l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f18069m);
        AbstractC2036a.n0(parcel, 4, 8);
        parcel.writeLong(this.f18070n);
        AbstractC2036a.n0(parcel, 5, 8);
        parcel.writeLong(this.f18071o);
        AbstractC2036a.f0(parcel, 6, this.f18072p);
        AbstractC2036a.f0(parcel, 7, this.f18073q);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f18074r);
        AbstractC2036a.n0(parcel, 9, 4);
        parcel.writeInt(this.f18075s);
        AbstractC2036a.m0(parcel, k02);
    }
}
