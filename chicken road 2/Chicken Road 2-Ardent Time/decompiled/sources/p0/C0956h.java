package p0;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956h extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0956h> CREATOR = new C.l(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f8256a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8257b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8258c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8260e;

    public C0956h(int i2, int i3, int i4, boolean z2, boolean z3) {
        this.f8256a = i2;
        this.f8257b = z2;
        this.f8258c = z3;
        this.f8259d = i3;
        this.f8260e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8256a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f8257b ? 1 : 0);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(this.f8258c ? 1 : 0);
        a.AbstractC0059a.I(parcel, 4, 4);
        parcel.writeInt(this.f8259d);
        a.AbstractC0059a.I(parcel, 5, 4);
        parcel.writeInt(this.f8260e);
        a.AbstractC0059a.H(parcel, G);
    }
}
