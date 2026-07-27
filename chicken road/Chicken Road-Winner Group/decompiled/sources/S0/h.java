package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h extends T0.a {
    public static final Parcelable.Creator<h> CREATOR = new H.j(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f1330a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1332c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1334e;

    public h(int i3, boolean z3, boolean z4, int i4, int i5) {
        this.f1330a = i3;
        this.f1331b = z3;
        this.f1332c = z4;
        this.f1333d = i4;
        this.f1334e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1330a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f1331b ? 1 : 0);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(this.f1332c ? 1 : 0);
        F2.b.S(parcel, 4, 4);
        parcel.writeInt(this.f1333d);
        F2.b.S(parcel, 5, 4);
        parcel.writeInt(this.f1334e);
        F2.b.R(parcel, Q2);
    }
}
