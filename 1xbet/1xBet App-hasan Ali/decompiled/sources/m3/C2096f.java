package m3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: m3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096f extends AbstractC2187a {
    public static final Parcelable.Creator<C2096f> CREATOR = new C2.a(27);

    /* renamed from: k, reason: collision with root package name */
    public final l f18044k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18045l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18046m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f18047n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18048o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f18049p;

    public C2096f(l lVar, boolean z3, boolean z5, int[] iArr, int i, int[] iArr2) {
        this.f18044k = lVar;
        this.f18045l = z3;
        this.f18046m = z5;
        this.f18047n = iArr;
        this.f18048o = i;
        this.f18049p = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.e0(parcel, 1, this.f18044k, i);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f18045l ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f18046m ? 1 : 0);
        int[] iArr = this.f18047n;
        if (iArr != null) {
            int k03 = AbstractC2036a.k0(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC2036a.m0(parcel, k03);
        }
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f18048o);
        int[] iArr2 = this.f18049p;
        if (iArr2 != null) {
            int k04 = AbstractC2036a.k0(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC2036a.m0(parcel, k04);
        }
        AbstractC2036a.m0(parcel, k02);
    }
}
