package o1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p1.AbstractC1380a;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373k extends AbstractC1380a {
    public static final Parcelable.Creator<C1373k> CREATOR = new B1.c(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f11568a;

    /* renamed from: b, reason: collision with root package name */
    public List f11569b;

    public C1373k(int i2, List list) {
        this.f11568a = i2;
        this.f11569b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11568a);
        AbstractC0169a.Q(parcel, 2, this.f11569b);
        AbstractC0169a.S(parcel, R5);
    }
}
