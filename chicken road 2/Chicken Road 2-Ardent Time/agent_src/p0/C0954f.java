package p0;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954f extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0954f> CREATOR = new C.l(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f8244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8246c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8247d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8248e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f8249f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f8250g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8251h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8252i;

    public C0954f(int i2, int i3, int i4, long j2, long j3, java.lang.String str, java.lang.String str2, int i5, int i6) {
        this.f8244a = i2;
        this.f8245b = i3;
        this.f8246c = i4;
        this.f8247d = j2;
        this.f8248e = j3;
        this.f8249f = str;
        this.f8250g = str2;
        this.f8251h = i5;
        this.f8252i = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8244a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f8245b);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(this.f8246c);
        a.AbstractC0059a.I(parcel, 4, 8);
        parcel.writeLong(this.f8247d);
        a.AbstractC0059a.I(parcel, 5, 8);
        parcel.writeLong(this.f8248e);
        a.AbstractC0059a.D(parcel, 6, this.f8249f);
        a.AbstractC0059a.D(parcel, 7, this.f8250g);
        a.AbstractC0059a.I(parcel, 8, 4);
        parcel.writeInt(this.f8251h);
        a.AbstractC0059a.I(parcel, 9, 4);
        parcel.writeInt(this.f8252i);
        a.AbstractC0059a.H(parcel, G);
    }
}
