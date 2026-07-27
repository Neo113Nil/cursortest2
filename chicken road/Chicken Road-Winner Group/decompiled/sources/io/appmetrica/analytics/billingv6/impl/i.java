package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;
import m0.InterfaceC1128p;

/* loaded from: classes.dex */
public final class i implements InterfaceC1128p {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5267a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1115c f5268b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5269c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5270d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5271e;
    public final n f;

    public i(BillingConfig billingConfig, AbstractC1115c abstractC1115c, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f5267a = billingConfig;
        this.f5268b = abstractC1115c;
        this.f5269c = utilsProvider;
        this.f5270d = str;
        this.f5271e = dVar;
        this.f = nVar;
    }

    @Override // m0.InterfaceC1128p
    public final void onPurchaseHistoryResponse(C1120h c1120h, List list) {
        this.f5269c.getWorkerExecutor().execute(new g(this, c1120h, list));
    }
}
