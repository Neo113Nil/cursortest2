package io.appmetrica.analytics.billingv6.impl;

import B2.v;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import m0.AbstractC1115c;
import m0.C1120h;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5254c;

    public e(f fVar, C1120h c1120h, List list) {
        this.f5252a = fVar;
        this.f5253b = c1120h;
        this.f5254c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f5252a;
        C1120h c1120h = this.f5253b;
        List list = this.f5254c;
        fVar.getClass();
        if (c1120h.f10046a != 0 || list.isEmpty()) {
            fVar.f5260g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f5257c;
            o2.a aVar = fVar.f5258d;
            List list2 = fVar.f5259e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, aVar, list2, list, dVar, fVar.f5260g);
            dVar.f5251b.add(kVar);
            if (fVar.f5256b.b()) {
                AbstractC1115c abstractC1115c = fVar.f5256b;
                v vVar = new v(2);
                vVar.f184b = fVar.f5255a;
                abstractC1115c.d(vVar.a(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.f5260g.onUpdateFinished();
            }
        }
        f fVar2 = this.f5252a;
        fVar2.f.a(fVar2);
    }
}
