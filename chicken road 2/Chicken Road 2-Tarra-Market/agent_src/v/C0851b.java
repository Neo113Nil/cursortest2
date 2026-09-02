package v;

import android.os.Parcel;
import android.util.SparseIntArray;
import p.AbstractC0819i;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851b extends AbstractC0850a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f6734d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f6735e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6736f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6737g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6738h;

    /* renamed from: i, reason: collision with root package name */
    public int f6739i;

    /* renamed from: j, reason: collision with root package name */
    public int f6740j;

    /* renamed from: k, reason: collision with root package name */
    public int f6741k;

    public C0851b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f.b(), new f.b(), new f.b());
    }

    @Override // v.AbstractC0850a
    public final C0851b a() {
        Parcel parcel = this.f6735e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f6740j;
        if (i2 == this.f6736f) {
            i2 = this.f6737g;
        }
        return new C0851b(parcel, dataPosition, i2, AbstractC0819i.b(new StringBuilder(), this.f6738h, "  "), this.f6731a, this.f6732b, this.f6733c);
    }

    @Override // v.AbstractC0850a
    public final boolean e(int i2) {
        while (this.f6740j < this.f6737g) {
            int i3 = this.f6741k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f6740j;
            Parcel parcel = this.f6735e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f6741k = parcel.readInt();
            this.f6740j += readInt;
        }
        return this.f6741k == i2;
    }

    @Override // v.AbstractC0850a
    public final void h(int i2) {
        int i3 = this.f6739i;
        SparseIntArray sparseIntArray = this.f6734d;
        Parcel parcel = this.f6735e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f6739i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C0851b(Parcel parcel, int i2, int i3, String str, f.b bVar, f.b bVar2, f.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f6734d = new SparseIntArray();
        this.f6739i = -1;
        this.f6741k = -1;
        this.f6735e = parcel;
        this.f6736f = i2;
        this.f6737g = i3;
        this.f6740j = i2;
        this.f6738h = str;
    }
}
