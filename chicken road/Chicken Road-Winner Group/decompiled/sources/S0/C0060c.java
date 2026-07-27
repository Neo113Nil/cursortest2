package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: S0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060c extends T0.a {
    public static final Parcelable.Creator<C0060c> CREATOR = new H.j(13);

    /* renamed from: a, reason: collision with root package name */
    public final h f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1301c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1303e;
    public final int[] f;

    public C0060c(h hVar, boolean z3, boolean z4, int[] iArr, int i3, int[] iArr2) {
        this.f1299a = hVar;
        this.f1300b = z3;
        this.f1301c = z4;
        this.f1302d = iArr;
        this.f1303e = i3;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.M(parcel, 1, this.f1299a, i3);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f1300b ? 1 : 0);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(this.f1301c ? 1 : 0);
        int[] iArr = this.f1302d;
        if (iArr != null) {
            int Q3 = F2.b.Q(parcel, 4);
            parcel.writeIntArray(iArr);
            F2.b.R(parcel, Q3);
        }
        F2.b.S(parcel, 5, 4);
        parcel.writeInt(this.f1303e);
        int[] iArr2 = this.f;
        if (iArr2 != null) {
            int Q4 = F2.b.Q(parcel, 6);
            parcel.writeIntArray(iArr2);
            F2.b.R(parcel, Q4);
        }
        F2.b.R(parcel, Q2);
    }
}
