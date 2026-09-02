package d0;

import Q.o;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056e extends R.a {
    public static final Parcelable.Creator<C0056e> CREATOR = new K.c(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f898a;

    /* renamed from: b, reason: collision with root package name */
    public final N.b f899b;

    /* renamed from: c, reason: collision with root package name */
    public final o f900c;

    public C0056e(int i2, N.b bVar, o oVar) {
        this.f898a = i2;
        this.f899b = bVar;
        this.f900c = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f898a);
        V.a.H(parcel, 2, this.f899b, i2);
        V.a.H(parcel, 3, this.f900c, i2);
        V.a.M(parcel, L);
    }
}
