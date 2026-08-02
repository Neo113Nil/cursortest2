package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: Q2.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395y0 extends AbstractC2187a {
    public static final Parcelable.Creator<C0395y0> CREATOR = new C0354d0(1);

    /* renamed from: k, reason: collision with root package name */
    public final int f5063k;

    public C0395y0(int i) {
        this.f5063k = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f5063k);
        AbstractC2036a.m0(parcel, k02);
    }
}
