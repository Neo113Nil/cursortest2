package io.appmetrica.analytics.billingv8.impl;

import B2.v;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f5303c;

    public e(f fVar, C1120h c1120h, QueryProductDetailsResult queryProductDetailsResult) {
        this.f5301a = fVar;
        this.f5302b = c1120h;
        this.f5303c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f5301a;
        C1120h c1120h = this.f5302b;
        List productDetailsList = this.f5303c.getProductDetailsList();
        fVar.getClass();
        if (c1120h.f10046a != 0 || productDetailsList.isEmpty()) {
            fVar.f5309g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f5306c;
            o2.a aVar = fVar.f5307d;
            List list = fVar.f5308e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, aVar, list, productDetailsList, dVar, fVar.f5309g);
            dVar.f5300b.add(kVar);
            if (fVar.f5305b.b()) {
                AbstractC1115c abstractC1115c = fVar.f5305b;
                v vVar = new v(2);
                vVar.f184b = fVar.f5304a;
                abstractC1115c.d(vVar.a(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.f5309g.onUpdateFinished();
            }
        }
        f fVar2 = this.f5301a;
        fVar2.f.a(fVar2);
    }
}
