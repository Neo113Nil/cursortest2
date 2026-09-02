package p0;

/* renamed from: p0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957i extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0957i> CREATOR = new C.l(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f8261a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f8262b;

    public C0957i(int i2, java.util.List list) {
        this.f8261a = i2;
        this.f8262b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8261a);
        a.AbstractC0059a.F(parcel, 2, this.f8262b);
        a.AbstractC0059a.H(parcel, G);
    }
}
