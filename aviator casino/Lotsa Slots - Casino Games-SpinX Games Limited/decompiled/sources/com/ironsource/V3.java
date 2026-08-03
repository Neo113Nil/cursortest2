package com.ironsource;

/* loaded from: classes5.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.T9 f6009a;
    private java.lang.Boolean b;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> c;
    private final com.ironsource.InterfaceC3362x7 d;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper, java.lang.String> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.V3.a f6010a = new com.ironsource.V3.a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return it.getSettings().getProviderTypeForReflection();
        }
    }

    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> f6011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap) {
            super(1);
            this.f6011a = concurrentHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.String provider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
            return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(this.f6011a.get(provider), java.lang.Boolean.TRUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final java.lang.Boolean c(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap;
        java.lang.String providerTypeForReflection = networkSettings != null ? networkSettings.getProviderTypeForReflection() : null;
        if (providerTypeForReflection == null || providerTypeForReflection.length() == 0 || (concurrentHashMap = this.c) == null) {
            return null;
        }
        return concurrentHashMap.get(providerTypeForReflection);
    }

    private final void d() {
        this.c = null;
        this.f6009a.b();
    }

    public final java.lang.Boolean a() {
        return this.b;
    }

    public final com.ironsource.InterfaceC3362x7 b() {
        return this.d;
    }

    public V3(com.ironsource.T9 globalDataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f6009a = globalDataWriter;
        this.d = com.ironsource.Jb.u.d().a();
    }

    private final java.lang.Boolean b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        if (networkSettings == null || networkSettings.isCustomNetwork() || !networkSettings.getApplicationSettings().has(com.ironsource.W3.f6039a)) {
            return null;
        }
        return java.lang.Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(com.ironsource.W3.f6039a));
    }

    public final void a(boolean z) {
        d();
        this.b = java.lang.Boolean.valueOf(z);
    }

    private final void a(java.util.Map<java.lang.String, java.lang.Boolean> map) {
        c();
        this.c = new java.util.concurrent.ConcurrentHashMap<>(map);
    }

    private final void c() {
        this.b = null;
        this.f6009a.a();
    }

    public final void a(java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.AbstractAdapter> adapters, java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        java.util.Iterator<? extends com.ironsource.mediationsdk.AbstractAdapter> it = adapters.values().iterator();
        while (it.hasNext()) {
            a(it.next(), (com.ironsource.mediationsdk.model.NetworkSettings) null);
        }
        for (com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void b(java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> concurrentHashMap = this.c;
        if (concurrentHashMap == null) {
            return;
        }
        if (networkAdapters.isEmpty()) {
            this.f6009a.b();
        } else {
            this.f6009a.a(kotlin.collections.CollectionsKt.toList(kotlin.sequences.SequencesKt.toSet(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(networkAdapters.values()), com.ironsource.V3.a.f6010a), new com.ironsource.V3.b(concurrentHashMap)))));
        }
    }

    public /* synthetic */ V3(com.ironsource.T9 t9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.T9() : t9);
    }

    public final void a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            java.lang.Boolean a2 = a(networkSettings);
            if (a2 == null || !(adapter instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface)) {
                return;
            }
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface) adapter).setConsent(a2.booleanValue());
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String providerName = networkSettings != null ? networkSettings.getProviderName() : null;
            java.lang.String str = "error while setting consent of " + providerName + ": " + th.getLocalizedMessage();
            a(str);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
        }
    }

    public final void a(com.ironsource.mediationsdk.AbstractAdapter adapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            java.lang.Boolean a2 = a(networkSettings);
            if (a2 != null) {
                adapter.setNewConsent(a2.booleanValue());
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            a(str);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
        }
    }

    private final java.lang.Boolean a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        java.lang.Boolean b2 = b(networkSettings);
        if (b2 != null) {
            return b2;
        }
        java.lang.Boolean c = c(networkSettings);
        return c == null ? this.b : c;
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Boolean> networkConsents, java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.AbstractAdapter> adapters, java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        a(networkConsents);
        a(adapters, networkAdapters);
        b(networkAdapters);
    }

    private final void a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            com.ironsource.F9.i().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void a(int i) {
        org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(false);
        try {
            b2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, i + ";" + this.d.G(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext()));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(kotlin.ExceptionsKt.stackTraceToString(e));
        }
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.CONSENT_TCF_CODE, b2));
    }

    public final void a(int i, java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.model.NetworkSettings> providerSettings) {
        org.json.JSONObject applicationSettings;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        java.lang.String G = this.d.G(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.API;
        ironLog.general("TCF Additional Consent: " + G);
        ironLog.general("CMP ID: " + i);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        java.util.Collection<? extends com.ironsource.mediationsdk.model.NetworkSettings> values = providerSettings.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings = (com.ironsource.mediationsdk.model.NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), com.ironsource.mediationsdk.utils.IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(com.ironsource.W3.f6039a)) {
                arrayList.add(obj);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (hashSet.add(((com.ironsource.mediationsdk.model.NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings2 : arrayList2) {
            com.ironsource.mediationsdk.logger.IronLog ironLog2 = com.ironsource.mediationsdk.logger.IronLog.API;
            java.lang.String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            org.json.JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? java.lang.Boolean.valueOf(applicationSettings2.optBoolean(com.ironsource.W3.f6039a)) : null));
        }
    }
}
