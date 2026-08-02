package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1865z8 extends E5 implements I8 {

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f16548k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f16549l;

    /* renamed from: m, reason: collision with root package name */
    public final double f16550m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16551n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16552o;

    public BinderC1865z8(Drawable drawable, Uri uri, double d5, int i, int i5) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f16548k = drawable;
        this.f16549l = uri;
        this.f16550m = d5;
        this.f16551n = i;
        this.f16552o = i5;
    }

    public static I8 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof I8 ? (I8) queryLocalInterface : new H8(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final Uri b() {
        return this.f16549l;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final InterfaceC2360a c() {
        return new BinderC2361b(this.f16548k);
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final double d() {
        return this.f16550m;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final int i() {
        return this.f16552o;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final int j() {
        return this.f16551n;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC2360a c5 = c();
            parcel2.writeNoException();
            F5.e(parcel2, c5);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            F5.d(parcel2, this.f16549l);
            return true;
        }
        if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeDouble(this.f16550m);
            return true;
        }
        if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeInt(this.f16551n);
            return true;
        }
        if (i != 5) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f16552o);
        return true;
    }
}
