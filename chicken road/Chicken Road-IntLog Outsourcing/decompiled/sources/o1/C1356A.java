package o1;

import a.AbstractC0169a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: o1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356A extends AbstractC1380a {
    public static final Parcelable.Creator<C1356A> CREATOR = new B1.c(28);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f11498a;

    /* renamed from: b, reason: collision with root package name */
    public l1.d[] f11499b;

    /* renamed from: c, reason: collision with root package name */
    public int f11500c;

    /* renamed from: d, reason: collision with root package name */
    public C1367e f11501d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.L(parcel, 1, this.f11498a);
        AbstractC0169a.P(parcel, 2, this.f11499b, i2);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(this.f11500c);
        AbstractC0169a.N(parcel, 4, this.f11501d, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
