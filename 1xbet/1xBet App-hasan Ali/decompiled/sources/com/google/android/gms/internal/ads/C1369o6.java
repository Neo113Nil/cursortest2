package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369o6 extends AbstractC2187a {
    public static final Parcelable.Creator<C1369o6> CREATOR = new C1812y0(21);

    /* renamed from: k, reason: collision with root package name */
    public ParcelFileDescriptor f14768k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14769l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14770m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14771n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14772o;

    public C1369o6(ParcelFileDescriptor parcelFileDescriptor, boolean z3, boolean z5, long j5, boolean z6) {
        this.f14768k = parcelFileDescriptor;
        this.f14769l = z3;
        this.f14770m = z5;
        this.f14771n = j5;
        this.f14772o = z6;
    }

    public final synchronized long a() {
        return this.f14771n;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f14768k == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f14768k);
        this.f14768k = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.f14769l;
    }

    public final synchronized boolean e() {
        return this.f14768k != null;
    }

    public final synchronized boolean f() {
        return this.f14770m;
    }

    public final synchronized boolean g() {
        return this.f14772o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        int k02 = AbstractC2036a.k0(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f14768k;
        }
        AbstractC2036a.e0(parcel, 2, parcelFileDescriptor, i);
        boolean c5 = c();
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(c5 ? 1 : 0);
        boolean f = f();
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(f ? 1 : 0);
        long a5 = a();
        AbstractC2036a.n0(parcel, 5, 8);
        parcel.writeLong(a5);
        boolean g5 = g();
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeInt(g5 ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    public C1369o6() {
        this(null, false, false, 0L, false);
    }
}
