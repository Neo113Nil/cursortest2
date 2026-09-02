package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006d extends R.a {
    public static final Parcelable.Creator<C0006d> CREATOR = new K.c(12);

    /* renamed from: a, reason: collision with root package name */
    public final i f406a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f407b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f410e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f411f;

    public C0006d(i iVar, boolean z2, boolean z3, int[] iArr, int i2, int[] iArr2) {
        this.f406a = iVar;
        this.f407b = z2;
        this.f408c = z3;
        this.f409d = iArr;
        this.f410e = i2;
        this.f411f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.H(parcel, 1, this.f406a, i2);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f407b ? 1 : 0);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(this.f408c ? 1 : 0);
        int[] iArr = this.f409d;
        if (iArr != null) {
            int L2 = V.a.L(parcel, 4);
            parcel.writeIntArray(iArr);
            V.a.M(parcel, L2);
        }
        V.a.N(parcel, 5, 4);
        parcel.writeInt(this.f410e);
        int[] iArr2 = this.f411f;
        if (iArr2 != null) {
            int L3 = V.a.L(parcel, 6);
            parcel.writeIntArray(iArr2);
            V.a.M(parcel, L3);
        }
        V.a.M(parcel, L);
    }
}
