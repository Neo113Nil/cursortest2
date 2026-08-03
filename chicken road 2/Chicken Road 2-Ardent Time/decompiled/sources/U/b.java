package U;

/* loaded from: classes.dex */
public final class b extends U.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f1720d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Parcel f1721e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1723g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f1724h;

    /* renamed from: i, reason: collision with root package name */
    public int f1725i;

    /* renamed from: j, reason: collision with root package name */
    public int f1726j;

    /* renamed from: k, reason: collision with root package name */
    public int f1727k;

    public b(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l.C0924b(), new l.C0924b(), new l.C0924b());
    }

    @Override // U.a
    public final U.b a() {
        android.os.Parcel parcel = this.f1721e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1726j;
        if (i2 == this.f1722f) {
            i2 = this.f1723g;
        }
        return new U.b(parcel, dataPosition, i2, B1.a.j(new java.lang.StringBuilder(), this.f1724h, "  "), this.f1717a, this.f1718b, this.f1719c);
    }

    @Override // U.a
    public final boolean e(int i2) {
        while (this.f1726j < this.f1723g) {
            int i3 = this.f1727k;
            if (i3 == i2) {
                return true;
            }
            if (java.lang.String.valueOf(i3).compareTo(java.lang.String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1726j;
            android.os.Parcel parcel = this.f1721e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1727k = parcel.readInt();
            this.f1726j += readInt;
        }
        return this.f1727k == i2;
    }

    @Override // U.a
    public final void h(int i2) {
        int i3 = this.f1725i;
        android.util.SparseIntArray sparseIntArray = this.f1720d;
        android.os.Parcel parcel = this.f1721e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1725i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(android.os.Parcel parcel, int i2, int i3, java.lang.String str, l.C0924b c0924b, l.C0924b c0924b2, l.C0924b c0924b3) {
        super(c0924b, c0924b2, c0924b3);
        this.f1720d = new android.util.SparseIntArray();
        this.f1725i = -1;
        this.f1727k = -1;
        this.f1721e = parcel;
        this.f1722f = i2;
        this.f1723g = i3;
        this.f1726j = i2;
        this.f1724h = str;
    }
}
