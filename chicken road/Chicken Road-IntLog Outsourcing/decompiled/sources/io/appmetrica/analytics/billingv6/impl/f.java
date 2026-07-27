package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import G0.InterfaceC0067q;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0067q {

    /* renamed from: a, reason: collision with root package name */
    public final String f6066a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0053c f6067b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f6068c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1430a f6069d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6070e;

    /* renamed from: f, reason: collision with root package name */
    public final d f6071f;

    /* renamed from: g, reason: collision with root package name */
    public final n f6072g;

    public f(String str, AbstractC0053c abstractC0053c, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f6066a = str;
        this.f6067b = abstractC0053c;
        this.f6068c = utilsProvider;
        this.f6069d = hVar;
        this.f6070e = list;
        this.f6071f = dVar;
        this.f6072g = nVar;
    }

    @Override // G0.InterfaceC0067q
    public final void onProductDetailsResponse(C0060j c0060j, List list) {
        this.f6068c.getWorkerExecutor().execute(new e(this, c0060j, list));
    }
}
