package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;
import m0.InterfaceC1127o;

/* loaded from: classes.dex */
public final class f implements InterfaceC1127o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5304a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1115c f5305b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5306c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.a f5307d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5308e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5309g;

    public f(String str, AbstractC1115c abstractC1115c, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f5304a = str;
        this.f5305b = abstractC1115c;
        this.f5306c = utilsProvider;
        this.f5307d = hVar;
        this.f5308e = list;
        this.f = dVar;
        this.f5309g = nVar;
    }

    public final void onProductDetailsResponse(C1120h c1120h, QueryProductDetailsResult queryProductDetailsResult) {
        this.f5306c.getWorkerExecutor().execute(new e(this, c1120h, queryProductDetailsResult));
    }

    @Override // m0.InterfaceC1127o
    public abstract /* synthetic */ void onProductDetailsResponse(C1120h c1120h, List list);
}
