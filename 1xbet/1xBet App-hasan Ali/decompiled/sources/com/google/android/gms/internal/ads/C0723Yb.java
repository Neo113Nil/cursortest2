package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;
import k4.AbstractC2036a;
import n3.AbstractC2187a;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723Yb extends AbstractC2187a {
    public static final Parcelable.Creator<C0723Yb> CREATOR = new C0730Zb(0);

    /* renamed from: k, reason: collision with root package name */
    public final View f12334k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f12335l;

    public C0723Yb(IBinder iBinder, IBinder iBinder2) {
        this.f12334k = (View) BinderC2361b.t1(BinderC2361b.h1(iBinder));
        this.f12335l = (Map) BinderC2361b.t1(BinderC2361b.h1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.d0(parcel, 1, new BinderC2361b(this.f12334k));
        AbstractC2036a.d0(parcel, 2, new BinderC2361b(this.f12335l));
        AbstractC2036a.m0(parcel, k02);
    }
}
