package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q0 extends K0 {
    public static final Parcelable.Creator<Q0> CREATOR = new C1812y0(14);

    /* renamed from: l, reason: collision with root package name */
    public final String f11143l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11144m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q0(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f11143l = parcel.readString();
        this.f11144m = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q0.class == obj.getClass()) {
            Q0 q02 = (Q0) obj;
            if (this.f10099k.equals(q02.f10099k) && Objects.equals(this.f11143l, q02.f11143l) && Objects.equals(this.f11144m, q02.f11144m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10099k.hashCode() + 527;
        String str = this.f11143l;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i = hashCode * 31;
        String str2 = this.f11144m;
        return ((i + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": url=" + this.f11144m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10099k);
        parcel.writeString(this.f11143l);
        parcel.writeString(this.f11144m);
    }

    public Q0(String str, String str2, String str3) {
        super(str);
        this.f11143l = str2;
        this.f11144m = str3;
    }
}
