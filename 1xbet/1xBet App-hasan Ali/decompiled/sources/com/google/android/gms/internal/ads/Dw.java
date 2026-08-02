package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class Dw extends AbstractC1672uw {

    /* renamed from: z, reason: collision with root package name */
    public Cw f8420z;

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void j() {
        Cw cw = this.f8420z;
        if (cw != null) {
            cw.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void u(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void v() {
        Cw cw = this.f8420z;
        if (cw != null) {
            try {
                cw.f8110m.execute(cw);
            } catch (RejectedExecutionException e3) {
                cw.f8111n.g(e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void x(int i) {
        this.f15935v = null;
        if (i == 1) {
            this.f8420z = null;
        }
    }
}
