package Q0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f5751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5755i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5756k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p122r.b(), new p122r.b(), new p122r.b());
    }

    @Override // Q0.b
    public final c a() {
        Parcel parcel = this.f5751e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.j;
        if (i7 == this.f5752f) {
            i7 = this.f5753g;
        }
        return new c(parcel, iDataPosition, i7, k.i(new StringBuilder(), this.f5754h, "  "), this.f5747a, this.f5748b, this.f5749c);
    }

    @Override // Q0.b
    public final boolean e(int i7) {
        while (this.j < this.f5753g) {
            int i8 = this.f5756k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.j;
            Parcel parcel = this.f5751e;
            parcel.setDataPosition(i9);
            int i10 = parcel.readInt();
            this.f5756k = parcel.readInt();
            this.j += i10;
        }
        return this.f5756k == i7;
    }

    @Override // Q0.b
    public final void i(int i7) {
        int i8 = this.f5755i;
        SparseIntArray sparseIntArray = this.f5750d;
        Parcel parcel = this.f5751e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(iDataPosition - i9);
            parcel.setDataPosition(iDataPosition);
        }
        this.f5755i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i8, String str, p122r.b bVar, p122r.b bVar2, p122r.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f5750d = new SparseIntArray();
        this.f5755i = -1;
        this.f5756k = -1;
        this.f5751e = parcel;
        this.f5752f = i7;
        this.f5753g = i8;
        this.j = i7;
        this.f5754h = str;
    }
}
