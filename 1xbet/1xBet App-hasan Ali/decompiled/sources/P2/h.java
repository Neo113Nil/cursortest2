package P2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class h extends AbstractC2187a {
    public static final Parcelable.Creator<h> CREATOR = new C2.a(7);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4742k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4743l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4744m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4745n;

    /* renamed from: o, reason: collision with root package name */
    public final float f4746o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4747p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4748q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4749r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4750s;

    public h(boolean z3, boolean z5, String str, boolean z6, float f, int i, boolean z7, boolean z8, boolean z9) {
        this.f4742k = z3;
        this.f4743l = z5;
        this.f4744m = str;
        this.f4745n = z6;
        this.f4746o = f;
        this.f4747p = i;
        this.f4748q = z7;
        this.f4749r = z8;
        this.f4750s = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4742k ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f4743l ? 1 : 0);
        AbstractC2036a.f0(parcel, 4, this.f4744m);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f4745n ? 1 : 0);
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeFloat(this.f4746o);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f4747p);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f4748q ? 1 : 0);
        AbstractC2036a.n0(parcel, 9, 4);
        parcel.writeInt(this.f4749r ? 1 : 0);
        AbstractC2036a.n0(parcel, 10, 4);
        parcel.writeInt(this.f4750s ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    public h(boolean z3, boolean z5, boolean z6, float f, boolean z7, boolean z8, boolean z9) {
        this(z3, z5, null, z6, f, -1, z7, z8, z9);
    }
}
