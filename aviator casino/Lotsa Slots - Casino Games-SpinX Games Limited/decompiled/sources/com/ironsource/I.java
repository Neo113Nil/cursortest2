package com.ironsource;

/* loaded from: classes5.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3355x0 f5747a;
    private final com.ironsource.mediationsdk.model.NetworkSettings b;
    private final kotlin.Lazy c;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.V0 f5748a;
        final /* synthetic */ com.ironsource.I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.ironsource.V0 v0, com.ironsource.I i) {
            super(0);
            this.f5748a = v0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> invoke() {
            return this.f5748a.a(this.b.e(), this.b.a(), this.b.d());
        }
    }

    public I(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f5747a = adUnitData;
        this.b = providerSettings;
        this.c = kotlin.LazyKt.lazy(new com.ironsource.I.a(adTools, this));
    }

    public final com.ironsource.mediationsdk.IronSource.a a() {
        return this.f5747a.b().a();
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> b() {
        return (com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter) this.c.getValue();
    }

    public final java.lang.String c() {
        java.lang.String providerName = this.b.getProviderName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final java.util.UUID d() {
        return this.f5747a.b().b();
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings e() {
        return this.b;
    }
}
