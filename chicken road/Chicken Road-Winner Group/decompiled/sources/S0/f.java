package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends T0.a {
    public static final Parcelable.Creator<f> CREATOR = new H.j(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f1319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1321c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1322d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1323e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1324g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1325h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1326i;

    public f(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f1319a = i3;
        this.f1320b = i4;
        this.f1321c = i5;
        this.f1322d = j3;
        this.f1323e = j4;
        this.f = str;
        this.f1324g = str2;
        this.f1325h = i6;
        this.f1326i = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1319a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f1320b);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(this.f1321c);
        F2.b.S(parcel, 4, 8);
        parcel.writeLong(this.f1322d);
        F2.b.S(parcel, 5, 8);
        parcel.writeLong(this.f1323e);
        F2.b.N(parcel, 6, this.f);
        F2.b.N(parcel, 7, this.f1324g);
        F2.b.S(parcel, 8, 4);
        parcel.writeInt(this.f1325h);
        F2.b.S(parcel, 9, 4);
        parcel.writeInt(this.f1326i);
        F2.b.R(parcel, Q2);
    }
}
