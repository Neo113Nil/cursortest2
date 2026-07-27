package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import m0.C1120h;
import m0.InterfaceC1129q;

/* loaded from: classes.dex */
public final class k implements InterfaceC1129q {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f5324a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.a f5325b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5326c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5327d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5328e;
    public final n f;

    public k(UtilsProvider utilsProvider, o2.a aVar, List list, List list2, d dVar, n nVar) {
        this.f5324a = utilsProvider;
        this.f5325b = aVar;
        this.f5326c = list;
        this.f5327d = list2;
        this.f5328e = dVar;
        this.f = nVar;
    }

    @Override // m0.InterfaceC1129q
    public final void onQueryPurchasesResponse(C1120h c1120h, List list) {
        this.f5324a.getWorkerExecutor().execute(new j(this, c1120h, list));
    }
}
