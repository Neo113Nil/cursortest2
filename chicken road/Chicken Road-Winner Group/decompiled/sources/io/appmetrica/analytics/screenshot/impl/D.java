package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8979a;

    /* renamed from: b, reason: collision with root package name */
    public final F f8980b;

    public D(boolean z3, F f) {
        this.f8979a = z3;
        this.f8980b = f;
    }

    public final F a() {
        return this.f8980b;
    }

    public final boolean b() {
        return this.f8979a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f8979a + ", config=" + this.f8980b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f8979a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f8980b, i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(j0 j0Var) {
        this(r0, r3 != null ? new F(r3) : null);
        boolean b3 = j0Var.b();
        k0 a3 = j0Var.a();
    }
}
