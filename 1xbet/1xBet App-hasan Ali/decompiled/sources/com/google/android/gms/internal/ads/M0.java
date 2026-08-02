package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M0 extends K0 {
    public static final Parcelable.Creator<M0> CREATOR = new C1812y0(10);

    /* renamed from: l, reason: collision with root package name */
    public final String f10566l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10567m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10568n;

    public M0(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f10566l = readString;
        this.f10567m = parcel.readString();
        this.f10568n = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M0.class == obj.getClass()) {
            M0 m02 = (M0) obj;
            if (Objects.equals(this.f10567m, m02.f10567m) && Objects.equals(this.f10566l, m02.f10566l) && Objects.equals(this.f10568n, m02.f10568n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10566l;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f10567m;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.f10568n;
        return (((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": domain=" + this.f10566l + ", description=" + this.f10567m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10099k);
        parcel.writeString(this.f10566l);
        parcel.writeString(this.f10568n);
    }

    public M0(String str, String str2, String str3) {
        super("----");
        this.f10566l = str;
        this.f10567m = str2;
        this.f10568n = str3;
    }
}
