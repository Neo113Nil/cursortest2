package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H0 extends K0 {
    public static final Parcelable.Creator<H0> CREATOR = new C1812y0(8);

    /* renamed from: l, reason: collision with root package name */
    public final String f9297l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9298m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9299n;

    public H0(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f9297l = readString;
        this.f9298m = parcel.readString();
        this.f9299n = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H0.class == obj.getClass()) {
            H0 h02 = (H0) obj;
            if (Objects.equals(this.f9298m, h02.f9298m) && Objects.equals(this.f9297l, h02.f9297l) && Objects.equals(this.f9299n, h02.f9299n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9297l;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f9298m;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.f9299n;
        return (((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": language=" + this.f9297l + ", description=" + this.f9298m + ", text=" + this.f9299n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10099k);
        parcel.writeString(this.f9297l);
        parcel.writeString(this.f9299n);
    }

    public H0(String str, String str2, String str3) {
        super("COMM");
        this.f9297l = str;
        this.f9298m = str2;
        this.f9299n = str3;
    }
}
