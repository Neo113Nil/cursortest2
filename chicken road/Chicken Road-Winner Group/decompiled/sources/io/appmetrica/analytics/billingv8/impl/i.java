package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;
import m0.InterfaceC1129q;

/* loaded from: classes.dex */
public final class i implements InterfaceC1129q {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5316a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1115c f5317b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5319d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5320e;
    public final n f;

    public i(BillingConfig billingConfig, AbstractC1115c abstractC1115c, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f5316a = billingConfig;
        this.f5317b = abstractC1115c;
        this.f5318c = utilsProvider;
        this.f5319d = str;
        this.f5320e = dVar;
        this.f = nVar;
    }

    @Override // m0.InterfaceC1129q
    public final void onQueryPurchasesResponse(C1120h c1120h, List list) {
        this.f5318c.getWorkerExecutor().execute(new g(this, c1120h, list));
    }
}
