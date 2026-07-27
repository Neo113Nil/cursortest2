package io.appmetrica.analytics.billingv8.impl;

import B2.v;
import e2.AbstractC0293h;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import m0.AbstractC1115c;
import m0.C1120h;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5290b;

    public a(b bVar, C1120h c1120h) {
        this.f5289a = bVar;
        this.f5290b = c1120h;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f5289a;
        C1120h c1120h = this.f5290b;
        bVar.getClass();
        if (c1120h.f10046a != 0) {
            bVar.f5295e.onUpdateFinished();
            return;
        }
        if (!bVar.f5292b.b()) {
            bVar.f5295e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0293h.S("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f5291a;
            AbstractC1115c abstractC1115c = bVar.f5292b;
            UtilsProvider utilsProvider = bVar.f5293c;
            d dVar = bVar.f5294d;
            i iVar = new i(billingConfig, abstractC1115c, utilsProvider, str, dVar, bVar.f5295e);
            dVar.f5300b.add(iVar);
            AbstractC1115c abstractC1115c2 = bVar.f5292b;
            v vVar = new v(2);
            vVar.f184b = str;
            abstractC1115c2.d(vVar.a(), iVar);
        }
    }
}
