package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import G0.C0054d;
import G0.C0060j;
import G0.O;
import G0.w;
import g4.AbstractC0466k;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6052b;

    public a(b bVar, C0060j c0060j) {
        this.f6051a = bVar;
        this.f6052b = c0060j;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f6051a;
        C0060j c0060j = this.f6052b;
        bVar.getClass();
        if (c0060j.f862a != 0) {
            bVar.f6057e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0466k.A0("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f6053a;
            AbstractC0053c abstractC0053c = bVar.f6054b;
            UtilsProvider utilsProvider = bVar.f6055c;
            d dVar = bVar.f6056d;
            i iVar = new i(billingConfig, abstractC0053c, utilsProvider, str, dVar, bVar.f6057e);
            dVar.f6062b.add(iVar);
            if (bVar.f6054b.b()) {
                AbstractC0053c abstractC0053c2 = bVar.f6054b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                C0054d c0054d = (C0054d) abstractC0053c2;
                if (!c0054d.b()) {
                    C0060j c0060j2 = O.f781k;
                    c0054d.H(2, 11, c0060j2);
                    iVar.onPurchaseHistoryResponse(c0060j2, null);
                } else if (C0054d.m(new w(c0054d, str, iVar, 3), 30000L, new A0.a(c0054d, iVar, 11, false), c0054d.D(), c0054d.q()) == null) {
                    C0060j n6 = c0054d.n();
                    c0054d.H(25, 11, n6);
                    iVar.onPurchaseHistoryResponse(n6, null);
                }
            } else {
                bVar.f6056d.a(iVar);
                bVar.f6057e.onUpdateFinished();
            }
        }
    }
}
