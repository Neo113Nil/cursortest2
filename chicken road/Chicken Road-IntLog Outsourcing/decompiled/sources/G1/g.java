package G1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import o1.q;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class g extends AbstractC1380a {
    public static final Parcelable.Creator<g> CREATOR = new B1.c(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f924a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.b f925b;

    /* renamed from: c, reason: collision with root package name */
    public final q f926c;

    public g(int i2, l1.b bVar, q qVar) {
        this.f924a = i2;
        this.f925b = bVar;
        this.f926c = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f924a);
        AbstractC0169a.N(parcel, 2, this.f925b, i2);
        AbstractC0169a.N(parcel, 3, this.f926c, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
