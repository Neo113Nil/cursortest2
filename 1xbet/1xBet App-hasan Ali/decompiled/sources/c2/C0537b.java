package c2;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.AbstractC2107A;
import r.C2327e;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537b extends AbstractC0536a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7400d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7401e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7402g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7403h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f7404j;

    /* renamed from: k, reason: collision with root package name */
    public int f7405k;

    public C0537b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2327e(0), new C2327e(0), new C2327e(0));
    }

    @Override // c2.AbstractC0536a
    public final C0537b a() {
        Parcel parcel = this.f7401e;
        int dataPosition = parcel.dataPosition();
        int i = this.f7404j;
        if (i == this.f) {
            i = this.f7402g;
        }
        return new C0537b(parcel, dataPosition, i, AbstractC2107A.u(new StringBuilder(), this.f7403h, "  "), this.f7397a, this.f7398b, this.f7399c);
    }

    @Override // c2.AbstractC0536a
    public final boolean e(int i) {
        while (this.f7404j < this.f7402g) {
            int i5 = this.f7405k;
            if (i5 == i) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f7404j;
            Parcel parcel = this.f7401e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f7405k = parcel.readInt();
            this.f7404j += readInt;
        }
        return this.f7405k == i;
    }

    @Override // c2.AbstractC0536a
    public final void h(int i) {
        int i5 = this.i;
        SparseIntArray sparseIntArray = this.f7400d;
        Parcel parcel = this.f7401e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C0537b(Parcel parcel, int i, int i5, String str, C2327e c2327e, C2327e c2327e2, C2327e c2327e3) {
        super(c2327e, c2327e2, c2327e3);
        this.f7400d = new SparseIntArray();
        this.i = -1;
        this.f7405k = -1;
        this.f7401e = parcel;
        this.f = i;
        this.f7402g = i5;
        this.f7404j = i;
        this.f7403h = str;
    }
}
