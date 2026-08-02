package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1843yn extends E5 implements InterfaceC0934eb {

    /* renamed from: k, reason: collision with root package name */
    public final C1394on f16475k;

    public BinderC1843yn(C1394on c1394on) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
        this.f16475k = c1394on;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0934eb
    public final void q(C0387u0 c0387u0) {
        ((Hn) this.f16475k.f14850c).a3(c0387u0);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        C1394on c1394on = this.f16475k;
        if (i == 2) {
            ((Hn) c1394on.f14850c).n();
        } else if (i == 3) {
            String readString = parcel.readString();
            F5.b(parcel);
            ((Hn) c1394on.f14850c).D2(readString, 0);
        } else {
            if (i != 4) {
                return false;
            }
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            q(c0387u0);
        }
        parcel2.writeNoException();
        return true;
    }
}
