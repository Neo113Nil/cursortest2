package h1;

import H.j;
import S0.n;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends T0.a {
    public static final Parcelable.Creator<e> CREATOR = new j(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.b f4992b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4993c;

    public e(int i3, P0.b bVar, n nVar) {
        this.f4991a = i3;
        this.f4992b = bVar;
        this.f4993c = nVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f4991a);
        F2.b.M(parcel, 2, this.f4992b, i3);
        F2.b.M(parcel, 3, this.f4993c, i3);
        F2.b.R(parcel, Q2);
    }
}
