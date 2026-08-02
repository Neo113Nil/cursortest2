package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class O0 extends K0 {
    public static final Parcelable.Creator<O0> CREATOR = new C1812y0(12);

    /* renamed from: l, reason: collision with root package name */
    public final String f10889l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f10890m;

    public O0(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f10889l = readString;
        this.f10890m = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O0.class == obj.getClass()) {
            O0 o02 = (O0) obj;
            if (Objects.equals(this.f10889l, o02.f10889l) && Arrays.equals(this.f10890m, o02.f10890m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10889l;
        return Arrays.hashCode(this.f10890m) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": owner=" + this.f10889l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10889l);
        parcel.writeByteArray(this.f10890m);
    }

    public O0(String str, byte[] bArr) {
        super("PRIV");
        this.f10889l = str;
        this.f10890m = bArr;
    }
}
