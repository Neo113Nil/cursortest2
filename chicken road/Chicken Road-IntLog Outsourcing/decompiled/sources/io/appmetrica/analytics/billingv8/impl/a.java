package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0051a;
import G0.C0060j;
import g4.AbstractC0466k;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6105b;

    public a(b bVar, C0060j c0060j) {
        this.f6104a = bVar;
        this.f6105b = c0060j;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f6104a;
        C0060j c0060j = this.f6105b;
        bVar.getClass();
        if (c0060j.f862a != 0) {
            bVar.f6110e.onUpdateFinished();
            return;
        }
        if (!bVar.f6107b.b()) {
            bVar.f6110e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0466k.A0("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f6106a;
            AbstractC0053c abstractC0053c = bVar.f6107b;
            UtilsProvider utilsProvider = bVar.f6108c;
            d dVar = bVar.f6109d;
            i iVar = new i(billingConfig, abstractC0053c, utilsProvider, str, dVar, bVar.f6110e);
            dVar.f6115b.add(iVar);
            AbstractC0053c abstractC0053c2 = bVar.f6107b;
            C0051a c0051a = new C0051a(1);
            c0051a.f813b = str;
            abstractC0053c2.d(c0051a.c(), iVar);
        }
    }
}
