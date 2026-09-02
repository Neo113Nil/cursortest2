package j0;

/* loaded from: classes.dex */
public final class b extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<j0.b> CREATOR = new C.l(8);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7940b;

    public b(java.lang.String str, int i2) {
        this.f7939a = str;
        this.f7940b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.D(parcel, 1, this.f7939a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f7940b);
        a.AbstractC0059a.H(parcel, G);
    }
}
