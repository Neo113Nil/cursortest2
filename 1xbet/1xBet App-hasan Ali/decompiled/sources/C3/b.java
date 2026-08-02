package C3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class b extends AbstractC2187a {
    public static final Parcelable.Creator<b> CREATOR = new C2.a(1);

    /* renamed from: k, reason: collision with root package name */
    public final int f839k;

    /* renamed from: l, reason: collision with root package name */
    public final int f840l;

    /* renamed from: m, reason: collision with root package name */
    public final Intent f841m;

    public b(int i, int i5, Intent intent) {
        this.f839k = i;
        this.f840l = i5;
        this.f841m = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f839k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f840l);
        AbstractC2036a.e0(parcel, 3, this.f841m, i);
        AbstractC2036a.m0(parcel, k02);
    }
}
