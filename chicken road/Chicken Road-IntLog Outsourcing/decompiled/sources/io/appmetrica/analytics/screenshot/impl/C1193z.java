package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193z implements Parcelable {
    public static final C1192y CREATOR = new C1192y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10061a;

    public C1193z(boolean z) {
        this.f10061a = z;
    }

    public final boolean a() {
        return this.f10061a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f10061a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f10061a ? (byte) 1 : (byte) 0);
    }

    public C1193z(h0 h0Var) {
        this(h0Var.a());
    }
}
