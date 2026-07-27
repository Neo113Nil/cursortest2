package o1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367e extends AbstractC1380a {
    public static final Parcelable.Creator<C1367e> CREATOR = new C1357B(1);

    /* renamed from: a, reason: collision with root package name */
    public final C1372j f11529a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11530b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11531c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11532d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11533e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11534f;

    public C1367e(C1372j c1372j, boolean z, boolean z5, int[] iArr, int i2, int[] iArr2) {
        this.f11529a = c1372j;
        this.f11530b = z;
        this.f11531c = z5;
        this.f11532d = iArr;
        this.f11533e = i2;
        this.f11534f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.N(parcel, 1, this.f11529a, i2);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f11530b ? 1 : 0);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(this.f11531c ? 1 : 0);
        int[] iArr = this.f11532d;
        if (iArr != null) {
            int R6 = AbstractC0169a.R(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0169a.S(parcel, R6);
        }
        AbstractC0169a.T(parcel, 5, 4);
        parcel.writeInt(this.f11533e);
        int[] iArr2 = this.f11534f;
        if (iArr2 != null) {
            int R7 = AbstractC0169a.R(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0169a.S(parcel, R7);
        }
        AbstractC0169a.S(parcel, R5);
    }
}
