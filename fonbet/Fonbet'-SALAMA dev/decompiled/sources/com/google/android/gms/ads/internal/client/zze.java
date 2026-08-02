package com.google.android.gms.ads.internal.client;

import B2.e;
import F2.D0;
import F2.F0;
import Y4.D;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y2.C1797a;
import y2.n;
import y2.v;

/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new e(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10722c;

    /* renamed from: d, reason: collision with root package name */
    public zze f10723d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f10724e;

    public zze(int i7, String str, String str2, zze zzeVar, IBinder iBinder) {
        this.f10720a = i7;
        this.f10721b = str;
        this.f10722c = str2;
        this.f10723d = zzeVar;
        this.f10724e = iBinder;
    }

    public final C1797a j() {
        zze zzeVar = this.f10723d;
        return new C1797a(this.f10720a, this.f10721b, this.f10722c, zzeVar != null ? new C1797a(zzeVar.f10720a, zzeVar.f10721b, zzeVar.f10722c, null) : null);
    }

    public final n k() {
        F0 d02;
        zze zzeVar = this.f10723d;
        C1797a c1797a = zzeVar == null ? null : new C1797a(zzeVar.f10720a, zzeVar.f10721b, zzeVar.f10722c, null);
        IBinder iBinder = this.f10724e;
        if (iBinder == null) {
            d02 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d02 = queryLocalInterface instanceof F0 ? (F0) queryLocalInterface : new D0(iBinder);
        }
        return new n(this.f10720a, this.f10721b, this.f10722c, c1797a, d02 != null ? new v(d02) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10720a);
        D.s0(parcel, 2, this.f10721b, false);
        D.s0(parcel, 3, this.f10722c, false);
        D.r0(parcel, 4, this.f10723d, i7, false);
        D.n0(parcel, 5, this.f10724e);
        D.z0(x02, parcel);
    }
}
