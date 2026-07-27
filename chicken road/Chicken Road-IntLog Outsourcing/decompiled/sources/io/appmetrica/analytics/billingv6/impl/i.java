package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import G0.r;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f6079a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0053c f6080b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f6081c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6082d;

    /* renamed from: e, reason: collision with root package name */
    public final d f6083e;

    /* renamed from: f, reason: collision with root package name */
    public final n f6084f;

    public i(BillingConfig billingConfig, AbstractC0053c abstractC0053c, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f6079a = billingConfig;
        this.f6080b = abstractC0053c;
        this.f6081c = utilsProvider;
        this.f6082d = str;
        this.f6083e = dVar;
        this.f6084f = nVar;
    }

    @Override // G0.r
    public final void onPurchaseHistoryResponse(C0060j c0060j, List list) {
        this.f6081c.getWorkerExecutor().execute(new g(this, c0060j, list));
    }
}
