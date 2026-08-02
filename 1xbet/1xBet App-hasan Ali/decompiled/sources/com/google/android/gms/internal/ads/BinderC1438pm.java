package com.google.android.gms.internal.ads;

import T2.C0437o;
import T2.C0438p;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1438pm extends AbstractBinderC1248lc {

    /* renamed from: k, reason: collision with root package name */
    public final C0634Ld f15037k;

    /* renamed from: l, reason: collision with root package name */
    public final C1428pc f15038l;

    public BinderC1438pm(C0634Ld c0634Ld, C1428pc c1428pc) {
        this.f15037k = c0634Ld;
        this.f15038l = c1428pc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void C2(C0438p c0438p) {
        c0438p.getClass();
        this.f15037k.c(new C0437o(c0438p.f5730k, c0438p.f5731l));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void M2(ParcelFileDescriptor parcelFileDescriptor, C1428pc c1428pc) {
        this.f15037k.b(new C1842ym(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c1428pc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void h0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f15037k.b(new C1842ym(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f15038l));
    }
}
