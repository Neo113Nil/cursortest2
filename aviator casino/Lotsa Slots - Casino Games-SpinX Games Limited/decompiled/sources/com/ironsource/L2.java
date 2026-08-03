package com.ironsource;

/* loaded from: classes5.dex */
public class L2 extends com.ironsource.AbstractC3230q0 {
    private final java.lang.ref.WeakReference<com.ironsource.O2> j;
    private final com.ironsource.L2.a k;
    private final com.ironsource.M2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(com.ironsource.C3212p0 tools, com.ironsource.M2 adUnitData, com.ironsource.O2 listener) {
        super(tools, adUnitData, listener, null, 8, null);
        java.lang.String format;
        int b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.j = new java.lang.ref.WeakReference<>(listener);
        this.k = new com.ironsource.L2.a();
        this.l = adUnitData;
        com.ironsource.C3064gd g = g();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || android.text.TextUtils.isEmpty(g.c())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            format = java.lang.String.format("can't load banner - %s", java.util.Arrays.copyOf(new java.lang.Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = com.ironsource.B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            com.ironsource.mediationsdk.logger.IronLog.API.error(a(format));
            a(b, format);
        }
    }

    private final com.ironsource.mediationsdk.ISBannerSize l() {
        return f().a(this.l.b().i());
    }

    @Override // com.ironsource.AbstractC3230q0
    public com.ironsource.C3265s0 b() {
        return new com.ironsource.S2(this.l.b(), a(l()));
    }

    private final class a extends com.ironsource.AbstractC3230q0.a implements com.ironsource.D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.D2
        public void a(com.ironsource.B2 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.L2.this.a(instance.q()));
            com.ironsource.O2 o2 = (com.ironsource.O2) com.ironsource.L2.this.j.get();
            if (o2 != null) {
                o2.g();
            }
        }

        @Override // com.ironsource.AbstractC3230q0.a, com.ironsource.F
        public void b(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            com.ironsource.InterfaceC3391z0 i = com.ironsource.L2.this.i();
            if (i != null) {
                i.a(instance.e());
            }
        }

        @Override // com.ironsource.D2
        public void c(com.ironsource.B2 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.L2.this.a(instance.q()));
            com.ironsource.O2 o2 = (com.ironsource.O2) com.ironsource.L2.this.j.get();
            if (o2 != null) {
                o2.h();
            }
        }

        @Override // com.ironsource.D2
        public void b(com.ironsource.B2 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.L2.this.a(instance.q()));
            com.ironsource.O2 o2 = (com.ironsource.O2) com.ironsource.L2.this.j.get();
            if (o2 != null) {
                o2.j();
            }
        }
    }

    public final void a(com.ironsource.InterfaceC3389yg interfaceC3389yg, com.ironsource.InterfaceC3391z0 displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (interfaceC3389yg != null) {
            a(new com.ironsource.F2(interfaceC3389yg), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC3230q0
    protected com.ironsource.E a() {
        return new com.ironsource.E() { // from class: com.ironsource.L2$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final com.ironsource.B a(com.ironsource.C c, com.ironsource.I i) {
                com.ironsource.B a2;
                a2 = com.ironsource.L2.a(com.ironsource.L2.this, c, i);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.B a(com.ironsource.L2 this$0, com.ironsource.C instanceData, com.ironsource.I adInstancePayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new com.ironsource.B2(new com.ironsource.V0(this$0.f(), com.ironsource.F0.b.PROVIDER), instanceData, adInstancePayload, this$0.k);
    }

    private final com.ironsource.mediationsdk.ISBannerSize a(com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return com.ironsource.mediationsdk.ISBannerSize.BANNER;
    }
}
