package m0;

/* loaded from: classes.dex */
public final class d extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<m0.d> CREATOR = new C.l(11);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8051c;

    public d(java.lang.String str) {
        this.f8049a = str;
        this.f8051c = 1L;
        this.f8050b = -1;
    }

    public final long a() {
        long j2 = this.f8051c;
        return j2 == -1 ? this.f8050b : j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof m0.d) {
            m0.d dVar = (m0.d) obj;
            java.lang.String str = this.f8049a;
            if (((str != null && str.equals(dVar.f8049a)) || (str == null && dVar.f8049a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f8049a, java.lang.Long.valueOf(a())});
    }

    public final java.lang.String toString() {
        o0.i iVar = new o0.i(this);
        iVar.a(this.f8049a, "name");
        iVar.a(java.lang.Long.valueOf(a()), "version");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.D(parcel, 1, this.f8049a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f8050b);
        long a2 = a();
        a.AbstractC0059a.I(parcel, 3, 8);
        parcel.writeLong(a2);
        a.AbstractC0059a.H(parcel, G);
    }

    public d(java.lang.String str, int i2, long j2) {
        this.f8049a = str;
        this.f8050b = i2;
        this.f8051c = j2;
    }
}
