package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771aq implements InterfaceC1592t5 {
    public static final Parcelable.Creator<C0771aq> CREATOR = new C0730Zb(12);

    /* renamed from: k, reason: collision with root package name */
    public final long f12722k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12723l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12724m;

    public C0771aq(long j5, long j6, long j7) {
        this.f12722k = j5;
        this.f12723l = j6;
        this.f12724m = j7;
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
        if (!(obj instanceof C0771aq)) {
            return false;
        }
        C0771aq c0771aq = (C0771aq) obj;
        return this.f12722k == c0771aq.f12722k && this.f12723l == c0771aq.f12723l && this.f12724m == c0771aq.f12724m;
    }

    public final int hashCode() {
        long j5 = this.f12722k;
        int i = ((int) (j5 ^ (j5 >>> 32))) + 527;
        long j6 = this.f12724m;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.f12723l;
        return (((i * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + ((int) j7);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f12722k + ", modification time=" + this.f12723l + ", timescale=" + this.f12724m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12722k);
        parcel.writeLong(this.f12723l);
        parcel.writeLong(this.f12724m);
    }

    public /* synthetic */ C0771aq(Parcel parcel) {
        this.f12722k = parcel.readLong();
        this.f12723l = parcel.readLong();
        this.f12724m = parcel.readLong();
    }
}
