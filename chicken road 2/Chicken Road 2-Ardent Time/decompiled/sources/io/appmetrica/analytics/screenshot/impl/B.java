package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class B implements android.os.Parcelable {
    public static final io.appmetrica.analytics.screenshot.impl.A CREATOR = new io.appmetrica.analytics.screenshot.impl.A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f7490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7491c;

    public B(boolean z2, java.util.List list, long j2) {
        this.f7489a = z2;
        this.f7490b = list;
        this.f7491c = j2;
    }

    public final long a() {
        return this.f7491c;
    }

    public final boolean b() {
        return this.f7489a;
    }

    public final java.util.List c() {
        return this.f7490b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f7489a + ", mediaStoreColumnNames=" + this.f7490b + ", detectWindowSeconds=" + this.f7491c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeByte(this.f7489a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f7490b);
        parcel.writeLong(this.f7491c);
    }

    public B(io.appmetrica.analytics.screenshot.impl.i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
