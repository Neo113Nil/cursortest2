package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class F0 extends K0 {
    public static final Parcelable.Creator<F0> CREATOR = new C1812y0(6);

    /* renamed from: l, reason: collision with root package name */
    public final String f8639l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8640m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8641n;

    /* renamed from: o, reason: collision with root package name */
    public final long f8642o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8643p;

    /* renamed from: q, reason: collision with root package name */
    public final K0[] f8644q;

    public F0(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f8639l = readString;
        this.f8640m = parcel.readInt();
        this.f8641n = parcel.readInt();
        this.f8642o = parcel.readLong();
        this.f8643p = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8644q = new K0[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f8644q[i5] = (K0) parcel.readParcelable(K0.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.K0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F0.class == obj.getClass()) {
            F0 f02 = (F0) obj;
            if (this.f8640m == f02.f8640m && this.f8641n == f02.f8641n && this.f8642o == f02.f8642o && this.f8643p == f02.f8643p && Objects.equals(this.f8639l, f02.f8639l) && Arrays.equals(this.f8644q, f02.f8644q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8639l;
        return ((((((((this.f8640m + 527) * 31) + this.f8641n) * 31) + ((int) this.f8642o)) * 31) + ((int) this.f8643p)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8639l);
        parcel.writeInt(this.f8640m);
        parcel.writeInt(this.f8641n);
        parcel.writeLong(this.f8642o);
        parcel.writeLong(this.f8643p);
        K0[] k0Arr = this.f8644q;
        parcel.writeInt(k0Arr.length);
        for (K0 k02 : k0Arr) {
            parcel.writeParcelable(k02, 0);
        }
    }

    public F0(String str, int i, int i5, long j5, long j6, K0[] k0Arr) {
        super("CHAP");
        this.f8639l = str;
        this.f8640m = i;
        this.f8641n = i5;
        this.f8642o = j5;
        this.f8643p = j6;
        this.f8644q = k0Arr;
    }
}
