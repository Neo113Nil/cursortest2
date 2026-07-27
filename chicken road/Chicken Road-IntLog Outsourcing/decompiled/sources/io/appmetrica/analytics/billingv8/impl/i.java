package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import G0.InterfaceC0068s;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InterfaceC0068s {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f6132a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0053c f6133b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f6134c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6135d;

    /* renamed from: e, reason: collision with root package name */
    public final d f6136e;

    /* renamed from: f, reason: collision with root package name */
    public final n f6137f;

    public i(BillingConfig billingConfig, AbstractC0053c abstractC0053c, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f6132a = billingConfig;
        this.f6133b = abstractC0053c;
        this.f6134c = utilsProvider;
        this.f6135d = str;
        this.f6136e = dVar;
        this.f6137f = nVar;
    }

    @Override // G0.InterfaceC0068s
    public final void onQueryPurchasesResponse(C0060j c0060j, List list) {
        this.f6134c.getWorkerExecutor().execute(new g(this, c0060j, list));
    }
}
