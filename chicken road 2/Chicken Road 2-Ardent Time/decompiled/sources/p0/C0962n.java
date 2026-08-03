package p0;

/* renamed from: p0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962n extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0962n> CREATOR = new C.l(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f8273a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.IBinder f8274b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.b f8275c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8276d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8277e;

    public C0962n(int i2, android.os.IBinder iBinder, m0.b bVar, boolean z2, boolean z3) {
        this.f8273a = i2;
        this.f8274b = iBinder;
        this.f8275c = bVar;
        this.f8276d = z2;
        this.f8277e = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Object c0948c;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0.C0962n)) {
            return false;
        }
        p0.C0962n c0962n = (p0.C0962n) obj;
        if (this.f8275c.equals(c0962n.f8275c)) {
            java.lang.Object obj2 = null;
            android.os.IBinder iBinder = this.f8274b;
            if (iBinder == null) {
                c0948c = null;
            } else {
                int i2 = p0.AbstractBinderC0949a.f8221b;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c0948c = queryLocalInterface instanceof p0.InterfaceC0953e ? (p0.InterfaceC0953e) queryLocalInterface : new p0.C0948C(iBinder);
            }
            android.os.IBinder iBinder2 = c0962n.f8274b;
            if (iBinder2 != null) {
                int i3 = p0.AbstractBinderC0949a.f8221b;
                android.os.IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof p0.InterfaceC0953e ? (p0.InterfaceC0953e) queryLocalInterface2 : new p0.C0948C(iBinder2);
            }
            if (p0.AbstractC0966r.e(c0948c, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8273a);
        android.os.IBinder iBinder = this.f8274b;
        if (iBinder != null) {
            int G2 = a.AbstractC0059a.G(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            a.AbstractC0059a.H(parcel, G2);
        }
        a.AbstractC0059a.C(parcel, 3, this.f8275c, i2);
        a.AbstractC0059a.I(parcel, 4, 4);
        parcel.writeInt(this.f8276d ? 1 : 0);
        a.AbstractC0059a.I(parcel, 5, 4);
        parcel.writeInt(this.f8277e ? 1 : 0);
        a.AbstractC0059a.H(parcel, G);
    }
}
