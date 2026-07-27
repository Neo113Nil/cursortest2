package h0;

import android.os.Parcel;
import android.util.SparseIntArray;
import b2.AbstractC0279e;
import r.C1392b;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5763d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f5764e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5765f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5766g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5767h;

    /* renamed from: i, reason: collision with root package name */
    public int f5768i;

    /* renamed from: j, reason: collision with root package name */
    public int f5769j;

    /* renamed from: k, reason: collision with root package name */
    public int f5770k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1392b(), new C1392b(), new C1392b());
    }

    @Override // h0.a
    public final b a() {
        Parcel parcel = this.f5764e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f5769j;
        if (i2 == this.f5765f) {
            i2 = this.f5766g;
        }
        return new b(parcel, dataPosition, i2, AbstractC0279e.h(new StringBuilder(), this.f5767h, "  "), this.f5760a, this.f5761b, this.f5762c);
    }

    @Override // h0.a
    public final boolean e(int i2) {
        while (this.f5769j < this.f5766g) {
            int i3 = this.f5770k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i6 = this.f5769j;
            Parcel parcel = this.f5764e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f5770k = parcel.readInt();
            this.f5769j += readInt;
        }
        return this.f5770k == i2;
    }

    @Override // h0.a
    public final void h(int i2) {
        int i3 = this.f5768i;
        SparseIntArray sparseIntArray = this.f5763d;
        Parcel parcel = this.f5764e;
        if (i3 >= 0) {
            int i6 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f5768i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C1392b c1392b, C1392b c1392b2, C1392b c1392b3) {
        super(c1392b, c1392b2, c1392b3);
        this.f5763d = new SparseIntArray();
        this.f5768i = -1;
        this.f5770k = -1;
        this.f5764e = parcel;
        this.f5765f = i2;
        this.f5766g = i3;
        this.f5769j = i2;
        this.f5767h = str;
    }
}
