package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class N0 extends K0 {
    public static final Parcelable.Creator<N0> CREATOR = new C1812y0(11);

    /* renamed from: l, reason: collision with root package name */
    public final int f10760l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10761m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10762n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f10763o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f10764p;

    public N0(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f10760l = i;
        this.f10761m = i5;
        this.f10762n = i6;
        this.f10763o = iArr;
        this.f10764p = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.K0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N0.class == obj.getClass()) {
            N0 n02 = (N0) obj;
            if (this.f10760l == n02.f10760l && this.f10761m == n02.f10761m && this.f10762n == n02.f10762n && Arrays.equals(this.f10763o, n02.f10763o) && Arrays.equals(this.f10764p, n02.f10764p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10764p) + ((Arrays.hashCode(this.f10763o) + ((((((this.f10760l + 527) * 31) + this.f10761m) * 31) + this.f10762n) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10760l);
        parcel.writeInt(this.f10761m);
        parcel.writeInt(this.f10762n);
        parcel.writeIntArray(this.f10763o);
        parcel.writeIntArray(this.f10764p);
    }

    public N0(Parcel parcel) {
        super("MLLT");
        this.f10760l = parcel.readInt();
        this.f10761m = parcel.readInt();
        this.f10762n = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = AbstractC1260lo.f14419a;
        this.f10763o = createIntArray;
        this.f10764p = parcel.createIntArray();
    }
}
