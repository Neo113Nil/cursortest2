package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882zh implements InterfaceC0808bi, Wh {

    /* renamed from: k, reason: collision with root package name */
    public final Lq f16756k;

    public C1882zh(Lq lq) {
        this.f16756k = lq;
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void d(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void j(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        Lq lq = this.f16756k;
        C0660Pb c0660Pb = lq.f10496d0;
        if (c0660Pb == null || !c0660Pb.f11080a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (lq.f10496d0.f11081b.isEmpty()) {
            return;
        }
        arrayList.add(lq.f10496d0.f11081b);
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void u(Context context) {
    }
}
