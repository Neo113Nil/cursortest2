package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044z implements Parcelable {
    public static final C1043y CREATOR = new C1043y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9079a;

    public C1044z(boolean z3) {
        this.f9079a = z3;
    }

    public final boolean a() {
        return this.f9079a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f9079a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f9079a ? (byte) 1 : (byte) 0);
    }

    public C1044z(h0 h0Var) {
        this(h0Var.a());
    }
}
