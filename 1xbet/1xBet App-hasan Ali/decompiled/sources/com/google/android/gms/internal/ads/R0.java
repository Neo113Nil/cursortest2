package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class R0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<R0> CREATOR = new C1812y0(15);

    /* renamed from: k, reason: collision with root package name */
    public final long f11296k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11297l;

    /* renamed from: m, reason: collision with root package name */
    public final long f11298m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11299n;

    /* renamed from: o, reason: collision with root package name */
    public final long f11300o;

    public R0(long j5, long j6, long j7, long j8, long j9) {
        this.f11296k = j5;
        this.f11297l = j6;
        this.f11298m = j7;
        this.f11299n = j8;
        this.f11300o = j9;
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
        if (obj != null && R0.class == obj.getClass()) {
            R0 r02 = (R0) obj;
            if (this.f11296k == r02.f11296k && this.f11297l == r02.f11297l && this.f11298m == r02.f11298m && this.f11299n == r02.f11299n && this.f11300o == r02.f11300o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f11296k;
        int i = ((int) (j5 ^ (j5 >>> 32))) + 527;
        long j6 = this.f11300o;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.f11299n;
        long j9 = j8 ^ (j8 >>> 32);
        long j10 = this.f11298m;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f11297l;
        return (((((((i * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) j11)) * 31) + ((int) j9)) * 31) + ((int) j7);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11296k + ", photoSize=" + this.f11297l + ", photoPresentationTimestampUs=" + this.f11298m + ", videoStartPosition=" + this.f11299n + ", videoSize=" + this.f11300o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11296k);
        parcel.writeLong(this.f11297l);
        parcel.writeLong(this.f11298m);
        parcel.writeLong(this.f11299n);
        parcel.writeLong(this.f11300o);
    }

    public /* synthetic */ R0(Parcel parcel) {
        this.f11296k = parcel.readLong();
        this.f11297l = parcel.readLong();
        this.f11298m = parcel.readLong();
        this.f11299n = parcel.readLong();
        this.f11300o = parcel.readLong();
    }
}
