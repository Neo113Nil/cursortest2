package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I0 extends K0 {
    public static final Parcelable.Creator<I0> CREATOR = new C1812y0(9);

    /* renamed from: l, reason: collision with root package name */
    public final String f9509l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9510m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9511n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f9512o;

    public I0(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f9509l = readString;
        this.f9510m = parcel.readString();
        this.f9511n = parcel.readString();
        this.f9512o = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I0.class == obj.getClass()) {
            I0 i02 = (I0) obj;
            if (Objects.equals(this.f9509l, i02.f9509l) && Objects.equals(this.f9510m, i02.f9510m) && Objects.equals(this.f9511n, i02.f9511n) && Arrays.equals(this.f9512o, i02.f9512o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9509l;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f9510m;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.f9511n;
        return Arrays.hashCode(this.f9512o) + (((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": mimeType=" + this.f9509l + ", filename=" + this.f9510m + ", description=" + this.f9511n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9509l);
        parcel.writeString(this.f9510m);
        parcel.writeString(this.f9511n);
        parcel.writeByteArray(this.f9512o);
    }

    public I0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9509l = str;
        this.f9510m = str2;
        this.f9511n = str3;
        this.f9512o = bArr;
    }
}
