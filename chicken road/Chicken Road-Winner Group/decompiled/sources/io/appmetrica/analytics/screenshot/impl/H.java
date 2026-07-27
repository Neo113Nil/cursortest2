package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8984a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8985b;

    public H(boolean z3, long j3) {
        this.f8984a = z3;
        this.f8985b = j3;
    }

    public final long a() {
        return this.f8985b;
    }

    public final boolean b() {
        return this.f8984a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f8984a + ", delaySeconds=" + this.f8985b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f8984a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8985b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
