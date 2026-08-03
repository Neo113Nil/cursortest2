package p0;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951c extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0951c> CREATOR = new C.l(20);

    /* renamed from: a, reason: collision with root package name */
    public final p0.C0956h f8222a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8223b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8224c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8225d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8226e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8227f;

    public C0951c(p0.C0956h c0956h, boolean z2, boolean z3, int[] iArr, int i2, int[] iArr2) {
        this.f8222a = c0956h;
        this.f8223b = z2;
        this.f8224c = z3;
        this.f8225d = iArr;
        this.f8226e = i2;
        this.f8227f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.C(parcel, 1, this.f8222a, i2);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f8223b ? 1 : 0);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(this.f8224c ? 1 : 0);
        int[] iArr = this.f8225d;
        if (iArr != null) {
            int G2 = a.AbstractC0059a.G(parcel, 4);
            parcel.writeIntArray(iArr);
            a.AbstractC0059a.H(parcel, G2);
        }
        a.AbstractC0059a.I(parcel, 5, 4);
        parcel.writeInt(this.f8226e);
        int[] iArr2 = this.f8227f;
        if (iArr2 != null) {
            int G3 = a.AbstractC0059a.G(parcel, 6);
            parcel.writeIntArray(iArr2);
            a.AbstractC0059a.H(parcel, G3);
        }
        a.AbstractC0059a.H(parcel, G);
    }
}
