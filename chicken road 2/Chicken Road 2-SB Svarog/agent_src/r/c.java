package r;

import android.os.Parcel;
import android.util.SparseIntArray;
import f.C0025a;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1145d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1146e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1148g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1149h;

    /* renamed from: i, reason: collision with root package name */
    public int f1150i;

    /* renamed from: j, reason: collision with root package name */
    public int f1151j;

    /* renamed from: k, reason: collision with root package name */
    public int f1152k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0025a(), new C0025a(), new C0025a());
    }

    @Override // r.b
    public final c a() {
        Parcel parcel = this.f1146e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1151j;
        if (i2 == this.f1147f) {
            i2 = this.f1148g;
        }
        return new c(parcel, dataPosition, i2, this.f1149h + "  ", this.f1142a, this.f1143b, this.f1144c);
    }

    @Override // r.b
    public final boolean e(int i2) {
        while (this.f1151j < this.f1148g) {
            int i3 = this.f1152k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1151j;
            Parcel parcel = this.f1146e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1152k = parcel.readInt();
            this.f1151j += readInt;
        }
        return this.f1152k == i2;
    }

    @Override // r.b
    public final void h(int i2) {
        int i3 = this.f1150i;
        SparseIntArray sparseIntArray = this.f1145d;
        Parcel parcel = this.f1146e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1150i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0025a c0025a, C0025a c0025a2, C0025a c0025a3) {
        super(c0025a, c0025a2, c0025a3);
        this.f1145d = new SparseIntArray();
        this.f1150i = -1;
        this.f1152k = -1;
        this.f1146e = parcel;
        this.f1147f = i2;
        this.f1148g = i3;
        this.f1151j = i2;
        this.f1149h = str;
    }
}
