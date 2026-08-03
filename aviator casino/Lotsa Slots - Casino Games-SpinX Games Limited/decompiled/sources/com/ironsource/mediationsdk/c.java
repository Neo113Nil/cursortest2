package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class c {
    private static final java.lang.String k = "IronSource";
    private static final java.lang.String l = "com.ironsource.adapters";
    private static final java.lang.String m = "aps";
    private static final com.ironsource.mediationsdk.c n = new com.ironsource.mediationsdk.c();
    private static final java.lang.Object o = new java.lang.Object();
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.Boolean e;
    private final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.ironsource.V3 i = new com.ironsource.V3();
    private final com.ironsource.C3116jc j = new com.ironsource.C3116jc();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> f6405a = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> b = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> f = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<com.ironsource.mediationsdk.IronSource.a, org.json.JSONObject> g = new java.util.concurrent.ConcurrentHashMap<>();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6406a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            f6406a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6406a[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6406a[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f6406a[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public static com.ironsource.mediationsdk.c b() {
        return n;
    }

    public void a(java.util.Map<java.lang.String, java.lang.Boolean> map) {
        synchronized (o) {
            this.i.a(map, this.f6405a, this.b);
        }
    }

    public void c(boolean z) {
        java.util.Iterator<com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> it = this.b.values().iterator();
        while (it.hasNext()) {
            a(it.next().getAdapterBaseInterface(), z);
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> d() {
        return this.f;
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> e() {
        return this.b;
    }

    public void f() {
        this.f6405a.clear();
        this.b.clear();
    }

    public void g() {
        synchronized (o) {
            this.i.b(this.b);
        }
    }

    public void b(java.lang.String str, java.lang.String str2) {
        this.c = str;
        this.d = str2;
    }

    public void c(java.lang.String str, java.util.List<java.lang.String> list) {
        synchronized (o) {
            this.f.put(str, list);
            if (!this.f6405a.isEmpty()) {
                com.ironsource.mediationsdk.utils.IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                b(str, list);
            }
            a(str, list);
        }
    }

    public void b(boolean z) {
        synchronized (o) {
            this.i.a(z);
            this.i.a(this.f6405a, this.b);
        }
    }

    public com.ironsource.mediationsdk.AbstractAdapter a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public com.ironsource.mediationsdk.AbstractAdapter a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, org.json.JSONObject jSONObject, boolean z) {
        java.lang.String str;
        java.lang.String b = b(networkSettings);
        java.lang.String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (o) {
            if (this.f6405a.containsKey(b)) {
                return this.f6405a.get(b);
            }
            com.ironsource.mediationsdk.AbstractAdapter a2 = a(b, providerTypeForReflection);
            if (a2 == null) {
                b(b + " adapter was not loaded");
                return null;
            }
            a2.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            try {
                str = a2.getCoreSDKVersion();
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                java.lang.String str2 = "error while retrieving coreSDKVersion " + a2.getProviderName() + ": " + th.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
                str = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            c(b + " was allocated (adapter version: " + a2.getVersion() + ", sdk version: " + str + ")");
            c(a2);
            this.j.a(a2);
            a(a2);
            this.i.a(a2, networkSettings);
            b(a2);
            a(jSONObject, a2, providerTypeForReflection);
            this.f6405a.put(b, a2);
            return a2;
        }
    }

    private void b(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        java.lang.Boolean bool = this.e;
        if (bool == null || !(adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface)) {
            return;
        }
        try {
            ((com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    private void c(final com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (final java.lang.String str : this.f.keySet()) {
            final java.util.List<java.lang.String> list = this.f.get(str);
            if (list != null && (adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface)) {
                a(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.mediationsdk.c.b(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface.this, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void b(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        java.lang.Boolean bool = this.e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                java.lang.String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, java.lang.String str, java.util.List list) {
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(final com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (final java.lang.String str : this.f.keySet()) {
            final java.util.List<java.lang.String> list = this.f.get(str);
            if (list != null) {
                a(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.mediationsdk.c.b(com.ironsource.mediationsdk.AbstractAdapter.this, str, list);
                    }
                }, abstractAdapter.getProviderName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, java.lang.String str, java.util.List list) {
        abstractAdapter.setMetaData(str, list);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void b(final java.lang.String str, final java.util.List<java.lang.String> list) {
        for (final com.ironsource.mediationsdk.AbstractAdapter abstractAdapter : this.f6405a.values()) {
            a(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.mediationsdk.c.a(com.ironsource.mediationsdk.AbstractAdapter.this, str, list);
                }
            }, abstractAdapter.getProviderName());
        }
    }

    private java.lang.String c(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + aVar.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Missing package definition for " + networkSettings.getProviderTypeForReflection());
    }

    private void c(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private java.lang.String b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter> c() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        for (java.lang.String str : this.b.keySet()) {
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper = this.b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    public com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid) {
        java.lang.String c;
        java.lang.String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            c = b(networkSettings);
        } else {
            c = c(networkSettings, aVar, uuid);
        }
        if (this.b.containsKey(c)) {
            return this.b.get(c).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a2 = a(c, providerTypeForReflection, networkSettings);
        return (a2 != null || networkSettings.isCustomNetwork()) ? a2 : a(networkSettings, aVar, c);
    }

    private void a(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, java.lang.String str) {
        if (str.equalsIgnoreCase("IronSource") && this.h.compareAndSet(false, true)) {
            c("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.c, this.d, jSONObject);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
            }
        }
    }

    private org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar) {
        int i = com.ironsource.mediationsdk.c.a.f6406a[aVar.ordinal()];
        if (i == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private com.ironsource.mediationsdk.AbstractAdapter a(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(a(str2));
            return (com.ironsource.mediationsdk.AbstractAdapter) cls.getMethod(com.ironsource.mediationsdk.utils.IronSourceConstants.START_ADAPTER, java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    public void b(com.ironsource.mediationsdk.t tVar) {
        if (a(tVar)) {
            this.j.a(tVar);
            tVar.a(this.f6405a.values(), this.b.values());
            tVar.b();
            if (com.ironsource.environment.StringUtils.toLowerCase(tVar.a()).equals(m)) {
                a(tVar.allData());
            }
        }
    }

    private static java.lang.String a(java.lang.String str) {
        return "com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    private java.lang.String a(java.lang.String str, com.ironsource.mediationsdk.IronSource.a aVar) {
        return "com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + com.ironsource.environment.StringUtils.toLowerCase(a(aVar)) + "." + str + a(aVar) + "Adapter";
    }

    private void b(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private java.lang.String a(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i = com.ironsource.mediationsdk.c.a.f6406a[aVar.ordinal()];
        if (i == 1) {
            return "Rewarded";
        }
        if (i == 2) {
            return "Interstitial";
        }
        if (i == 3) {
            return "Banner";
        }
        if (i != 4) {
            return null;
        }
        return "NativeAd";
    }

    public void a(boolean z) {
        synchronized (o) {
            this.e = java.lang.Boolean.valueOf(z);
            java.util.Iterator<com.ironsource.mediationsdk.AbstractAdapter> it = this.f6405a.values().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            java.util.Iterator<com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> it2 = this.b.values().iterator();
            while (it2.hasNext()) {
                b(it2.next().getAdapterBaseInterface());
            }
        }
    }

    public void a(boolean z, java.lang.String str) {
        for (com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
            if (adapterBaseWrapper.getSettings().getProviderTypeForReflection().equalsIgnoreCase(str)) {
                a(adapterBaseWrapper.getAdapterBaseInterface(), z);
            }
        }
    }

    private void a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, boolean z) {
        if (adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface) {
            try {
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface) adapterBaseInterface).setTestMode(z);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String str = "error while setting testMode of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, java.lang.String str, java.util.List list) {
        abstractAdapter.setMetaData(str, list);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(final java.lang.String str, final java.util.List<java.lang.String> list) {
        for (com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
            final com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface)) {
                a(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.c$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.mediationsdk.c.a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface.this, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, java.lang.String str, java.util.List list) {
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(java.lang.Runnable runnable, java.lang.String str) {
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str2 = "Error while setting meta-data for adapter " + str + ": " + th.getLocalizedMessage();
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof com.ironsource.mediationsdk.SetAPSInterface) || this.g.size() == 0) {
            return;
        }
        for (com.ironsource.mediationsdk.IronSource.a aVar : this.g.keySet()) {
            try {
                org.json.JSONObject jSONObject = this.g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((com.ironsource.mediationsdk.SetAPSInterface) adapterBaseInterface).setAPSData(com.ironsource.Ff.a(aVar), jSONObject);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        if (!com.ironsource.environment.StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) || this.g.size() == 0) {
            return;
        }
        for (com.ironsource.mediationsdk.IronSource.a aVar : this.g.keySet()) {
            try {
                org.json.JSONObject jSONObject = this.g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof com.ironsource.mediationsdk.SetAPSInterface)) {
                    ((com.ironsource.mediationsdk.SetAPSInterface) abstractAdapter).setAPSData(com.ironsource.Ff.a(aVar), jSONObject);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.g.clear();
    }

    private com.ironsource.mediationsdk.s a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str) {
        com.ironsource.mediationsdk.AbstractAdapter a2 = a(networkSettings, b(networkSettings, aVar), false);
        if (a2 != null) {
            com.ironsource.mediationsdk.s sVar = new com.ironsource.mediationsdk.s(a2);
            this.b.put(str, new com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(sVar, networkSettings));
            return sVar;
        }
        java.lang.String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
        return null;
    }

    private void a(java.lang.String str, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.j.a(new com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.b.put(str, new com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        java.lang.String a2;
        if (networkSettings.isCustomNetwork() && android.text.TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            a2 = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            a2 = a(str2);
        }
        try {
            com.ironsource.mediationsdk.adunit.adapter.BaseAdapter baseAdapter = (com.ironsource.mediationsdk.adunit.adapter.BaseAdapter) java.lang.Class.forName(a2).newInstance();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.info(a2 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (java.lang.Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                java.lang.String str3 = "failed to load " + a2;
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str3);
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            }
            return null;
        }
    }

    public com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid) {
        com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a2 = a(networkSettings, aVar);
        if (a2 != null || networkSettings.isCustomNetwork()) {
            return a2;
        }
        com.ironsource.mediationsdk.AbstractAdapter a3 = a(networkSettings);
        if (a3 != null) {
            return com.ironsource.mediationsdk.a.a(a3, networkSettings, aVar, uuid);
        }
        java.lang.String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
        return null;
    }

    private com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar) {
        boolean isCustomNetwork = networkSettings.isCustomNetwork();
        if (isCustomNetwork && android.text.TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        java.lang.String a2 = a(networkSettings, aVar, isCustomNetwork, a(networkSettings, aVar, isCustomNetwork));
        try {
            return a(a2, networkSettings);
        } catch (java.lang.Exception e) {
            if (isCustomNetwork) {
                a(e, a2);
            }
            return null;
        }
    }

    private java.lang.String a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, boolean z) {
        if (z) {
            return networkSettings.getCustomNetworkAdapterName(aVar);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    private java.lang.String a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, boolean z, java.lang.String str) {
        if (z) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return a(str, aVar);
    }

    private com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(java.lang.String str, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) throws java.lang.Exception {
        return (com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter) java.lang.Class.forName(str).getConstructor(com.ironsource.mediationsdk.model.NetworkSettings.class).newInstance(networkSettings);
    }

    private void a(java.lang.Exception exc, java.lang.String str) {
        java.lang.String str2 = "Failed to load adapter class: " + str;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2 + " - " + exc.getMessage());
    }

    private void a(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            com.ironsource.F9.i().a(new com.ironsource.C3360x5(enumC3378y5, jSONObject));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(com.ironsource.mediationsdk.t tVar) {
        if (tVar.allData().length() == 0) {
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!android.text.TextUtils.isEmpty(tVar.a())) {
            return true;
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    private void a(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(com.ironsource.mediationsdk.IronSource.a.BANNER.toString())) {
                a(com.unity3d.mediation.LevelPlay.AdFormat.BANNER, optJSONObject);
            } else if (next.equalsIgnoreCase(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.toString())) {
                a(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, optJSONObject);
            } else if (next.equalsIgnoreCase(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.toString())) {
                a(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, optJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.unity3d.mediation.LevelPlay.AdFormat adFormat, org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.toString());
                if (!this.f6405a.isEmpty()) {
                    for (com.ironsource.mediationsdk.AbstractAdapter abstractAdapter : this.f6405a.values()) {
                        if (com.ironsource.environment.StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) && (abstractAdapter instanceof com.ironsource.mediationsdk.SetAPSInterface)) {
                            ((com.ironsource.mediationsdk.SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                    }
                }
                for (com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
                    if (com.ironsource.environment.StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(m)) {
                        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                synchronized (o) {
                    this.g.put(com.ironsource.Ff.b(adFormat), jSONObject2);
                }
                return;
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String str = "error while setting APSData: " + e.getLocalizedMessage();
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
                return;
            }
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        b("APSData is empty");
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> a() {
        return this.f6405a;
    }

    public static boolean a(java.lang.String str, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(java.lang.String str, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
