package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class F implements android.os.Parcelable {
    public static final io.appmetrica.analytics.screenshot.impl.E CREATOR = new io.appmetrica.analytics.screenshot.impl.E();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0909z f7494a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.H f7495b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.B f7496c;

    public F(io.appmetrica.analytics.screenshot.impl.C0909z c0909z, io.appmetrica.analytics.screenshot.impl.H h2, io.appmetrica.analytics.screenshot.impl.B b2) {
        this.f7494a = c0909z;
        this.f7495b = h2;
        this.f7496c = b2;
    }

    public final io.appmetrica.analytics.screenshot.impl.C0909z a() {
        return this.f7494a;
    }

    public final io.appmetrica.analytics.screenshot.impl.B b() {
        return this.f7496c;
    }

    public final io.appmetrica.analytics.screenshot.impl.H c() {
        return this.f7495b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f7494a + ", serviceCaptorConfig=" + this.f7495b + ", contentObserverCaptorConfig=" + this.f7496c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeParcelable(this.f7494a, i2);
        parcel.writeParcelable(this.f7495b, i2);
        parcel.writeParcelable(this.f7496c, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(io.appmetrica.analytics.screenshot.impl.k0 k0Var) {
        this(r2, r3, r5 != null ? new io.appmetrica.analytics.screenshot.impl.B(r5) : null);
        io.appmetrica.analytics.screenshot.impl.h0 a2 = k0Var.a();
        io.appmetrica.analytics.screenshot.impl.C0909z c0909z = a2 != null ? new io.appmetrica.analytics.screenshot.impl.C0909z(a2) : null;
        io.appmetrica.analytics.screenshot.impl.l0 c2 = k0Var.c();
        io.appmetrica.analytics.screenshot.impl.H h2 = c2 != null ? new io.appmetrica.analytics.screenshot.impl.H(c2) : null;
        io.appmetrica.analytics.screenshot.impl.i0 b2 = k0Var.b();
    }
}
