package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C1044z f8981a;

    /* renamed from: b, reason: collision with root package name */
    public final H f8982b;

    /* renamed from: c, reason: collision with root package name */
    public final B f8983c;

    public F(C1044z c1044z, H h3, B b3) {
        this.f8981a = c1044z;
        this.f8982b = h3;
        this.f8983c = b3;
    }

    public final C1044z a() {
        return this.f8981a;
    }

    public final B b() {
        return this.f8983c;
    }

    public final H c() {
        return this.f8982b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f8981a + ", serviceCaptorConfig=" + this.f8982b + ", contentObserverCaptorConfig=" + this.f8983c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f8981a, i3);
        parcel.writeParcelable(this.f8982b, i3);
        parcel.writeParcelable(this.f8983c, i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a3 = k0Var.a();
        C1044z c1044z = a3 != null ? new C1044z(a3) : null;
        l0 c3 = k0Var.c();
        H h3 = c3 != null ? new H(c3) : null;
        i0 b3 = k0Var.b();
    }
}
