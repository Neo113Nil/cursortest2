package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends R.a {
    public static final Parcelable.Creator<g> CREATOR = new K.c(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430c;

    /* renamed from: d, reason: collision with root package name */
    public final long f431d;

    /* renamed from: e, reason: collision with root package name */
    public final long f432e;

    /* renamed from: f, reason: collision with root package name */
    public final String f433f;

    /* renamed from: g, reason: collision with root package name */
    public final String f434g;

    /* renamed from: h, reason: collision with root package name */
    public final int f435h;

    /* renamed from: i, reason: collision with root package name */
    public final int f436i;

    public g(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f428a = i2;
        this.f429b = i3;
        this.f430c = i4;
        this.f431d = j2;
        this.f432e = j3;
        this.f433f = str;
        this.f434g = str2;
        this.f435h = i5;
        this.f436i = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f428a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f429b);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(this.f430c);
        V.a.N(parcel, 4, 8);
        parcel.writeLong(this.f431d);
        V.a.N(parcel, 5, 8);
        parcel.writeLong(this.f432e);
        V.a.I(parcel, 6, this.f433f);
        V.a.I(parcel, 7, this.f434g);
        V.a.N(parcel, 8, 4);
        parcel.writeInt(this.f435h);
        V.a.N(parcel, 9, 4);
        parcel.writeInt(this.f436i);
        V.a.M(parcel, L);
    }
}
