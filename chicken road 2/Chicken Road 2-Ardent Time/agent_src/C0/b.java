package C0;

/* loaded from: classes.dex */
public final class b extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<C0.b> CREATOR = new C.l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Intent f104c;

    public b(int i2, int i3, android.content.Intent intent) {
        this.f102a = i2;
        this.f103b = i3;
        this.f104c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f102a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f103b);
        a.AbstractC0059a.C(parcel, 3, this.f104c, i2);
        a.AbstractC0059a.H(parcel, G);
    }
}
