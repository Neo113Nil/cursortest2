package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857z0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<C1857z0> CREATOR;

    /* renamed from: k, reason: collision with root package name */
    public final String f16519k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16520l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16521m;

    /* renamed from: n, reason: collision with root package name */
    public final long f16522n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f16523o;

    /* renamed from: p, reason: collision with root package name */
    public int f16524p;

    static {
        C1649uH c1649uH = new C1649uH();
        c1649uH.c("application/id3");
        new C1407p(c1649uH);
        C1649uH c1649uH2 = new C1649uH();
        c1649uH2.c("application/x-scte35");
        new C1407p(c1649uH2);
        CREATOR = new C1812y0(0);
    }

    public C1857z0(Parcel parcel) {
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f16519k = readString;
        this.f16520l = parcel.readString();
        this.f16521m = parcel.readLong();
        this.f16522n = parcel.readLong();
        this.f16523o = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final /* synthetic */ void d(C1412p4 c1412p4) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1857z0.class == obj.getClass()) {
            C1857z0 c1857z0 = (C1857z0) obj;
            if (this.f16521m == c1857z0.f16521m && this.f16522n == c1857z0.f16522n && Objects.equals(this.f16519k, c1857z0.f16519k) && Objects.equals(this.f16520l, c1857z0.f16520l) && Arrays.equals(this.f16523o, c1857z0.f16523o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f16524p;
        if (i != 0) {
            return i;
        }
        String str = this.f16519k;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f16520l;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j5 = this.f16522n;
        long j6 = this.f16521m;
        int hashCode3 = Arrays.hashCode(this.f16523o) + ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        this.f16524p = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16519k + ", id=" + this.f16522n + ", durationMs=" + this.f16521m + ", value=" + this.f16520l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16519k);
        parcel.writeString(this.f16520l);
        parcel.writeLong(this.f16521m);
        parcel.writeLong(this.f16522n);
        parcel.writeByteArray(this.f16523o);
    }
}
