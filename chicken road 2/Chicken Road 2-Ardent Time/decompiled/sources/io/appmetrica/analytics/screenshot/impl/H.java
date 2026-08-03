package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class H implements android.os.Parcelable {
    public static final io.appmetrica.analytics.screenshot.impl.G CREATOR = new io.appmetrica.analytics.screenshot.impl.G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7497a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7498b;

    public H(boolean z2, long j2) {
        this.f7497a = z2;
        this.f7498b = j2;
    }

    public final long a() {
        return this.f7498b;
    }

    public final boolean b() {
        return this.f7497a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f7497a + ", delaySeconds=" + this.f7498b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeByte(this.f7497a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7498b);
    }

    public H(io.appmetrica.analytics.screenshot.impl.l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
