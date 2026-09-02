package p0;

/* renamed from: p0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972x extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0972x> CREATOR = new C.l(19);

    /* renamed from: a, reason: collision with root package name */
    public android.os.Bundle f8296a;

    /* renamed from: b, reason: collision with root package name */
    public m0.d[] f8297b;

    /* renamed from: c, reason: collision with root package name */
    public int f8298c;

    /* renamed from: d, reason: collision with root package name */
    public p0.C0951c f8299d;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        android.os.Bundle bundle = this.f8296a;
        if (bundle != null) {
            int G2 = a.AbstractC0059a.G(parcel, 1);
            parcel.writeBundle(bundle);
            a.AbstractC0059a.H(parcel, G2);
        }
        a.AbstractC0059a.E(parcel, 2, this.f8297b, i2);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(this.f8298c);
        a.AbstractC0059a.C(parcel, 4, this.f8299d, i2);
        a.AbstractC0059a.H(parcel, G);
    }
}
