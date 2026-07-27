package o1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372j extends AbstractC1380a {
    public static final Parcelable.Creator<C1372j> CREATOR = new B1.c(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f11563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11564b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11566d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11567e;

    public C1372j(int i2, boolean z, boolean z5, int i3, int i6) {
        this.f11563a = i2;
        this.f11564b = z;
        this.f11565c = z5;
        this.f11566d = i3;
        this.f11567e = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11563a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f11564b ? 1 : 0);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(this.f11565c ? 1 : 0);
        AbstractC0169a.T(parcel, 4, 4);
        parcel.writeInt(this.f11566d);
        AbstractC0169a.T(parcel, 5, 4);
        parcel.writeInt(this.f11567e);
        AbstractC0169a.S(parcel, R5);
    }
}
