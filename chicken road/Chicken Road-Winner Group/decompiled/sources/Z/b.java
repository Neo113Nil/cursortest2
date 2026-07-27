package Z;

import android.os.Parcel;
import android.util.SparseIntArray;
import p.C1152b;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1763d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1764e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1765g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1766h;

    /* renamed from: i, reason: collision with root package name */
    public int f1767i;

    /* renamed from: j, reason: collision with root package name */
    public int f1768j;

    /* renamed from: k, reason: collision with root package name */
    public int f1769k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1152b(), new C1152b(), new C1152b());
    }

    @Override // Z.a
    public final b a() {
        Parcel parcel = this.f1764e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1768j;
        if (i3 == this.f) {
            i3 = this.f1765g;
        }
        return new b(parcel, dataPosition, i3, B0.c.l(new StringBuilder(), this.f1766h, "  "), this.f1760a, this.f1761b, this.f1762c);
    }

    @Override // Z.a
    public final boolean e(int i3) {
        while (this.f1768j < this.f1765g) {
            int i4 = this.f1769k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f1768j;
            Parcel parcel = this.f1764e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1769k = parcel.readInt();
            this.f1768j += readInt;
        }
        return this.f1769k == i3;
    }

    @Override // Z.a
    public final void h(int i3) {
        int i4 = this.f1767i;
        SparseIntArray sparseIntArray = this.f1763d;
        Parcel parcel = this.f1764e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1767i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, C1152b c1152b, C1152b c1152b2, C1152b c1152b3) {
        super(c1152b, c1152b2, c1152b3);
        this.f1763d = new SparseIntArray();
        this.f1767i = -1;
        this.f1769k = -1;
        this.f1764e = parcel;
        this.f = i3;
        this.f1765g = i4;
        this.f1768j = i3;
        this.f1766h = str;
    }
}
