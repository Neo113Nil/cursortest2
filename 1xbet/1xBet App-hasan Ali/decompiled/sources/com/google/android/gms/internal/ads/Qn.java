package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class Qn extends E5 implements InterfaceC1202kb {

    /* renamed from: k, reason: collision with root package name */
    public final C1394on f11257k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Dn f11258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qn(Dn dn, C1394on c1394on) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f11258l = dn;
        this.f11257k = c1394on;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1202kb
    public final void q(C0387u0 c0387u0) {
        ((Hn) this.f11257k.f14850c).a3(c0387u0);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0694Ua c0687Ta;
        C1394on c1394on = this.f11257k;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c0687Ta = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c0687Ta = queryLocalInterface instanceof InterfaceC0694Ua ? (InterfaceC0694Ua) queryLocalInterface : new C0687Ta(readStrongBinder);
            }
            F5.b(parcel);
            this.f11258l.f8365d = c0687Ta;
            ((Hn) c1394on.f14850c).n();
        } else if (i == 2) {
            String readString = parcel.readString();
            F5.b(parcel);
            ((Hn) c1394on.f14850c).D2(readString, 0);
        } else {
            if (i != 3) {
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
