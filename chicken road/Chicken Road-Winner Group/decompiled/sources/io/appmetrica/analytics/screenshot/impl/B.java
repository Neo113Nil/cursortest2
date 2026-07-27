package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8976a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8977b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8978c;

    public B(boolean z3, List list, long j3) {
        this.f8976a = z3;
        this.f8977b = list;
        this.f8978c = j3;
    }

    public final long a() {
        return this.f8978c;
    }

    public final boolean b() {
        return this.f8976a;
    }

    public final List c() {
        return this.f8977b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f8976a + ", mediaStoreColumnNames=" + this.f8977b + ", detectWindowSeconds=" + this.f8978c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f8976a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f8977b);
        parcel.writeLong(this.f8978c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
