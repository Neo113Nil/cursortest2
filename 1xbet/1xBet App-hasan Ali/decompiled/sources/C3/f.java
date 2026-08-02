package C3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import m3.r;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class f extends AbstractC2187a {
    public static final Parcelable.Creator<f> CREATOR = new C2.a(3);

    /* renamed from: k, reason: collision with root package name */
    public final int f845k;

    /* renamed from: l, reason: collision with root package name */
    public final j3.b f846l;

    /* renamed from: m, reason: collision with root package name */
    public final r f847m;

    public f(int i, j3.b bVar, r rVar) {
        this.f845k = i;
        this.f846l = bVar;
        this.f847m = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f845k);
        AbstractC2036a.e0(parcel, 2, this.f846l, i);
        AbstractC2036a.e0(parcel, 3, this.f847m, i);
        AbstractC2036a.m0(parcel, k02);
    }
}
