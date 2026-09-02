package C0;

/* loaded from: classes.dex */
public final class f extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<C0.f> CREATOR = new C.l(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f108a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.b f109b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.C0962n f110c;

    public f(int i2, m0.b bVar, p0.C0962n c0962n) {
        this.f108a = i2;
        this.f109b = bVar;
        this.f110c = c0962n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f108a);
        a.AbstractC0059a.C(parcel, 2, this.f109b, i2);
        a.AbstractC0059a.C(parcel, 3, this.f110c, i2);
        a.AbstractC0059a.H(parcel, G);
    }
}
