package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909z implements android.os.Parcelable {
    public static final io.appmetrica.analytics.screenshot.impl.C0908y CREATOR = new io.appmetrica.analytics.screenshot.impl.C0908y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7593a;

    public C0909z(boolean z2) {
        this.f7593a = z2;
    }

    public final boolean a() {
        return this.f7593a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f7593a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeByte(this.f7593a ? (byte) 1 : (byte) 0);
    }

    public C0909z(io.appmetrica.analytics.screenshot.impl.h0 h0Var) {
        this(h0Var.a());
    }
}
