package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0877d6 extends E5 implements InterfaceC1189k6 {

    /* renamed from: k, reason: collision with root package name */
    public O3.c f13098k;

    @Override // com.google.android.gms.internal.ads.InterfaceC1189k6
    public final void a0(C0387u0 c0387u0) {
        O3.c cVar = this.f13098k;
        if (cVar != null) {
            cVar.c(c0387u0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1189k6
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1189k6
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1189k6
    public final void p() {
        O3.c cVar = this.f13098k;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i == 2) {
                p();
            } else if (i == 3) {
                C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
                F5.b(parcel);
                a0(c0387u0);
            } else if (i != 4 && i != 5) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1189k6
    public final void a() {
    }
}
