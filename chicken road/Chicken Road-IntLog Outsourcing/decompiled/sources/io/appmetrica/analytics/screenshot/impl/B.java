package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import b2.AbstractC0279e;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9957a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9959c;

    public B(boolean z, List list, long j2) {
        this.f9957a = z;
        this.f9958b = list;
        this.f9959c = j2;
    }

    public final long a() {
        return this.f9959c;
    }

    public final boolean b() {
        return this.f9957a;
    }

    public final List c() {
        return this.f9958b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableContentObserverCaptorConfig(enabled=");
        sb.append(this.f9957a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f9958b);
        sb.append(", detectWindowSeconds=");
        return AbstractC0279e.g(sb, this.f9959c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f9957a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f9958b);
        parcel.writeLong(this.f9959c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
