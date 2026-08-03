package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class r implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.g f3479a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.t fromModel(io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig remoteBillingConfig) {
        io.appmetrica.analytics.billing.impl.t tVar = new io.appmetrica.analytics.billing.impl.t();
        tVar.f3484a = remoteBillingConfig.getEnabled();
        io.appmetrica.analytics.billing.internal.config.BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f3485b = config != null ? this.f3479a.fromModel(config) : null;
        return tVar;
    }

    public r(io.appmetrica.analytics.billing.impl.g gVar) {
        this.f3479a = gVar;
    }

    public /* synthetic */ r(io.appmetrica.analytics.billing.impl.g gVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.billing.impl.g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig toModel(io.appmetrica.analytics.billing.impl.t tVar) {
        boolean z2 = tVar.f3484a;
        io.appmetrica.analytics.billing.impl.g gVar = this.f3479a;
        io.appmetrica.analytics.billing.impl.s sVar = tVar.f3485b;
        gVar.getClass();
        return new io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig(z2, new io.appmetrica.analytics.billing.internal.config.BillingConfig(sVar.f3481a, sVar.f3482b));
    }
}
