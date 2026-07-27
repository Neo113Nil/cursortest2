package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;
import m0.InterfaceC1127o;

/* loaded from: classes.dex */
public final class f implements InterfaceC1127o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5255a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1115c f5256b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5257c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.a f5258d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5259e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5260g;

    public f(String str, AbstractC1115c abstractC1115c, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f5255a = str;
        this.f5256b = abstractC1115c;
        this.f5257c = utilsProvider;
        this.f5258d = hVar;
        this.f5259e = list;
        this.f = dVar;
        this.f5260g = nVar;
    }

    @Override // m0.InterfaceC1127o
    public final void onProductDetailsResponse(C1120h c1120h, List list) {
        this.f5257c.getWorkerExecutor().execute(new e(this, c1120h, list));
    }
}
