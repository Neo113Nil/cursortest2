package com.google.android.gms.internal.ads;

import T2.C0437o;
import T2.C0438p;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1393om extends AbstractBinderC1248lc {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1483qm f14847k;

    public BinderC1393om(AbstractC1483qm abstractC1483qm) {
        this.f14847k = abstractC1483qm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void C2(C0438p c0438p) {
        C0634Ld c0634Ld = this.f14847k.f15168k;
        c0438p.getClass();
        c0634Ld.c(new C0437o(c0438p.f5730k, c0438p.f5731l));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void M2(ParcelFileDescriptor parcelFileDescriptor, C1428pc c1428pc) {
        this.f14847k.f15168k.b(new C1842ym(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c1428pc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void h0(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC1483qm abstractC1483qm = this.f14847k;
        abstractC1483qm.f15168k.b(new C1842ym(autoCloseInputStream, abstractC1483qm.f15172o));
    }
}
