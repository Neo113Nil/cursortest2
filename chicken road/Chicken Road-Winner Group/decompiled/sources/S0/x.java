package S0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x extends T0.a {
    public static final Parcelable.Creator<x> CREATOR = new H.j(12);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f1369a;

    /* renamed from: b, reason: collision with root package name */
    public P0.d[] f1370b;

    /* renamed from: c, reason: collision with root package name */
    public int f1371c;

    /* renamed from: d, reason: collision with root package name */
    public C0060c f1372d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        Bundle bundle = this.f1369a;
        if (bundle != null) {
            int Q3 = F2.b.Q(parcel, 1);
            parcel.writeBundle(bundle);
            F2.b.R(parcel, Q3);
        }
        F2.b.O(parcel, 2, this.f1370b, i3);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(this.f1371c);
        F2.b.M(parcel, 4, this.f1372d, i3);
        F2.b.R(parcel, Q2);
    }
}
