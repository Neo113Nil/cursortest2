package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C1193z f9962a;

    /* renamed from: b, reason: collision with root package name */
    public final H f9963b;

    /* renamed from: c, reason: collision with root package name */
    public final B f9964c;

    public F(C1193z c1193z, H h3, B b6) {
        this.f9962a = c1193z;
        this.f9963b = h3;
        this.f9964c = b6;
    }

    public final C1193z a() {
        return this.f9962a;
    }

    public final B b() {
        return this.f9964c;
    }

    public final H c() {
        return this.f9963b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f9962a + ", serviceCaptorConfig=" + this.f9963b + ", contentObserverCaptorConfig=" + this.f9964c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f9962a, i2);
        parcel.writeParcelable(this.f9963b, i2);
        parcel.writeParcelable(this.f9964c, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a6 = k0Var.a();
        C1193z c1193z = a6 != null ? new C1193z(a6) : null;
        l0 c2 = k0Var.c();
        H h3 = c2 != null ? new H(c2) : null;
        i0 b6 = k0Var.b();
    }
}
