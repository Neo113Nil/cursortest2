package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends jh1 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f4375d;

    /* JADX INFO: renamed from: e */
    public final Parcel f4376e;

    /* JADX INFO: renamed from: f */
    public final int f4377f;

    /* JADX INFO: renamed from: g */
    public final int f4378g;

    /* JADX INFO: renamed from: h */
    public final String f4379h;

    /* JADX INFO: renamed from: i */
    public int f4380i;

    /* JADX INFO: renamed from: j */
    public int f4381j;

    /* JADX INFO: renamed from: k */
    public int f4382k;

    public kh1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0089c8(0), new C0089c8(0), new C0089c8(0));
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final kh1 mo2859a() {
        Parcel parcel = this.f4376e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f4381j;
        if (i == this.f4377f) {
            i = this.f4378g;
        }
        return new kh1(parcel, iDataPosition, i, AbstractC0024an.m285h(new StringBuilder(), this.f4379h, "  "), this.f3929a, this.f3930b, this.f3931c);
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: e */
    public final boolean mo2863e(int i) {
        while (true) {
            int i2 = this.f4381j;
            int i3 = this.f4382k;
            if (i2 >= this.f4378g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f4381j;
            Parcel parcel = this.f4376e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f4382k = parcel.readInt();
            this.f4381j += i5;
        }
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: i */
    public final void mo2867i(int i) {
        int i2 = this.f4380i;
        SparseIntArray sparseIntArray = this.f4375d;
        Parcel parcel = this.f4376e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4380i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public kh1(Parcel parcel, int i, int i2, String str, C0089c8 c0089c8, C0089c8 c0089c9, C0089c8 c0089c10) {
        super(c0089c8, c0089c9, c0089c10);
        this.f4375d = new SparseIntArray();
        this.f4380i = -1;
        this.f4382k = -1;
        this.f4376e = parcel;
        this.f4377f = i;
        this.f4378g = i2;
        this.f4381j = i;
        this.f4379h = str;
    }
}
