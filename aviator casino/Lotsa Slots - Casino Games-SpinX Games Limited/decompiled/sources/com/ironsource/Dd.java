package com.ironsource;

/* loaded from: classes5.dex */
public final class Dd {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5672a;
    private final java.util.List<com.ironsource.C3367xc> b;
    private final com.ironsource.AbstractC3355x0 c;
    private final com.ironsource.mediationsdk.IronSource.a d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5673a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f5673a = iArr;
        }
    }

    public static final class b extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ com.ironsource.mediationsdk.model.NetworkSettings c;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface d;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdData e;

        b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
            this.c = networkSettings;
            this.d = adapterBaseInterface;
            this.e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.Dd dd = com.ironsource.Dd.this;
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings = this.c;
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter = this.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            dd.a(networkSettings, networkAdapter, this.e);
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a(java.lang.Throwable t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            com.ironsource.Dd.this.f5672a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.c.getProviderName() + " - " + t);
        }
    }

    public Dd(com.ironsource.V0 adUnitTools, com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.util.List<com.ironsource.C3367xc> providers, com.ironsource.AbstractC3355x0 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f5672a = adUnitTools;
        this.b = providers;
        this.c = adUnitData;
        this.d = a(adFormat);
    }

    public final void a() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f5672a, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.util.Iterator<com.ironsource.C3367xc> it = this.b.iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.model.NetworkSettings f = it.next().f();
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(f, this.d, randomUUID);
            if (a(f, b2)) {
                com.ironsource.Gf.f5727a.b(new com.ironsource.Dd.b(f, b2, this.c.a(f)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(java.lang.String str, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        com.ironsource.V0 v0 = this.f5672a;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        ironLog.verbose(com.ironsource.C3212p0.a(v0, format, (java.lang.String) null, 2, (java.lang.Object) null));
    }

    private final boolean a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        com.ironsource.V0 v0 = this.f5672a;
        com.ironsource.mediationsdk.IronSource.a aVar = this.d;
        java.lang.String providerInstanceName = networkSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        if (v0.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.d));
    }

    private final com.ironsource.mediationsdk.IronSource.a a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        int i = com.ironsource.Dd.a.f5673a[adFormat.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.mediationsdk.IronSource.a.BANNER;
        }
        if (i == 4) {
            return com.ironsource.mediationsdk.IronSource.a.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
