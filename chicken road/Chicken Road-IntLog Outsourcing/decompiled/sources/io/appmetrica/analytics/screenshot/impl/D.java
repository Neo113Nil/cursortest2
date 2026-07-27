package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9960a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9961b;

    public D(boolean z, F f3) {
        this.f9960a = z;
        this.f9961b = f3;
    }

    public final F a() {
        return this.f9961b;
    }

    public final boolean b() {
        return this.f9960a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f9960a + ", config=" + this.f9961b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f9960a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f9961b, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(j0 j0Var) {
        this(r0, r3 != null ? new F(r3) : null);
        boolean b6 = j0Var.b();
        k0 a6 = j0Var.a();
    }
}
