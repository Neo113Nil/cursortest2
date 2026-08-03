package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class D implements android.os.Parcelable {
    public static final io.appmetrica.analytics.screenshot.impl.C CREATOR = new io.appmetrica.analytics.screenshot.impl.C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7492a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.F f7493b;

    public D(boolean z2, io.appmetrica.analytics.screenshot.impl.F f2) {
        this.f7492a = z2;
        this.f7493b = f2;
    }

    public final io.appmetrica.analytics.screenshot.impl.F a() {
        return this.f7493b;
    }

    public final boolean b() {
        return this.f7492a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f7492a + ", config=" + this.f7493b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeByte(this.f7492a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f7493b, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(io.appmetrica.analytics.screenshot.impl.j0 j0Var) {
        this(r0, r3 != null ? new io.appmetrica.analytics.screenshot.impl.F(r3) : null);
        boolean b2 = j0Var.b();
        io.appmetrica.analytics.screenshot.impl.k0 a2 = j0Var.a();
    }
}
