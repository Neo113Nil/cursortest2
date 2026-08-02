package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Cn extends E5 implements InterfaceC1024gb {

    /* renamed from: k, reason: collision with root package name */
    public final C1394on f8086k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Dn f8087l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn(Dn dn, C1394on c1394on) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f8087l = dn;
        this.f8086k = c1394on;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1024gb
    public final void q(C0387u0 c0387u0) {
        ((Hn) this.f8086k.f14850c).a3(c0387u0);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        C0666Qa c0666Qa;
        Dn dn = this.f8087l;
        C1394on c1394on = this.f8086k;
        if (i == 1) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            dn.f8365d = (View) BinderC2361b.t1(h1);
            ((Hn) c1394on.f14850c).n();
        } else if (i == 2) {
            String readString = parcel.readString();
            F5.b(parcel);
            ((Hn) c1394on.f14850c).D2(readString, 0);
        } else if (i == 3) {
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            q(c0387u0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c0666Qa = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c0666Qa = queryLocalInterface instanceof C0666Qa ? (C0666Qa) queryLocalInterface : new C0666Qa(readStrongBinder);
            }
            F5.b(parcel);
            dn.f8366e = c0666Qa;
            ((Hn) c1394on.f14850c).n();
        }
        parcel2.writeNoException();
        return true;
    }
}
