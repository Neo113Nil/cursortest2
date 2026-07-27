package io.appmetrica.analytics.billingv6.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import m0.AbstractC1115c;
import m0.C1116d;
import m0.C1120h;
import m0.O;
import m0.u;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5241b;

    public a(b bVar, C1120h c1120h) {
        this.f5240a = bVar;
        this.f5241b = c1120h;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f5240a;
        C1120h c1120h = this.f5241b;
        bVar.getClass();
        if (c1120h.f10046a != 0) {
            bVar.f5246e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0293h.S("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f5242a;
            AbstractC1115c abstractC1115c = bVar.f5243b;
            UtilsProvider utilsProvider = bVar.f5244c;
            d dVar = bVar.f5245d;
            i iVar = new i(billingConfig, abstractC1115c, utilsProvider, str, dVar, bVar.f5246e);
            dVar.f5251b.add(iVar);
            if (bVar.f5243b.b()) {
                AbstractC1115c abstractC1115c2 = bVar.f5243b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                C1116d c1116d = (C1116d) abstractC1115c2;
                if (!c1116d.b()) {
                    C1120h c1120h2 = O.f9977k;
                    c1116d.H(2, 11, c1120h2);
                    iVar.onPurchaseHistoryResponse(c1120h2, null);
                } else if (C1116d.m(new u(c1116d, str, iVar, 3), 30000L, new A.a(c1116d, 15, iVar), c1116d.D(), c1116d.q()) == null) {
                    C1120h n3 = c1116d.n();
                    c1116d.H(25, 11, n3);
                    iVar.onPurchaseHistoryResponse(n3, null);
                }
            } else {
                bVar.f5245d.a(iVar);
                bVar.f5246e.onUpdateFinished();
            }
        }
    }
}
