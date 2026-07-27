package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final g f5175a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f5180a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f5181b = config != null ? this.f5175a.fromModel(config) : null;
        return tVar;
    }

    public r(g gVar) {
        this.f5175a = gVar;
    }

    public /* synthetic */ r(g gVar, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(t tVar) {
        boolean z3 = tVar.f5180a;
        g gVar = this.f5175a;
        s sVar = tVar.f5181b;
        gVar.getClass();
        return new RemoteBillingConfig(z3, new BillingConfig(sVar.f5177a, sVar.f5178b));
    }
}
