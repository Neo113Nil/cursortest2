package o1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: o1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370h extends AbstractC1380a {
    public static final Parcelable.Creator<C1370h> CREATOR = new B1.c(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f11551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11553c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11554d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11555e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11556f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11557g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11558h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11559i;

    public C1370h(int i2, int i3, int i6, long j2, long j6, String str, String str2, int i7, int i8) {
        this.f11551a = i2;
        this.f11552b = i3;
        this.f11553c = i6;
        this.f11554d = j2;
        this.f11555e = j6;
        this.f11556f = str;
        this.f11557g = str2;
        this.f11558h = i7;
        this.f11559i = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11551a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f11552b);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(this.f11553c);
        AbstractC0169a.T(parcel, 4, 8);
        parcel.writeLong(this.f11554d);
        AbstractC0169a.T(parcel, 5, 8);
        parcel.writeLong(this.f11555e);
        AbstractC0169a.O(parcel, 6, this.f11556f);
        AbstractC0169a.O(parcel, 7, this.f11557g);
        AbstractC0169a.T(parcel, 8, 4);
        parcel.writeInt(this.f11558h);
        AbstractC0169a.T(parcel, 9, 4);
        parcel.writeInt(this.f11559i);
        AbstractC0169a.S(parcel, R5);
    }
}
