package com.ironsource;

/* renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3368xd implements com.ironsource.InterfaceC3386yd {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f6839a;
    private final com.ironsource.AbstractC3355x0 b;
    private final kotlin.jvm.functions.Function1<com.ironsource.V0, com.ironsource.V0> c;

    /* renamed from: com.ironsource.xd$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.ironsource.V0, com.ironsource.V0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3368xd.a f6840a = new com.ironsource.C3368xd.a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.V0 invoke(com.ironsource.V0 tools) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
            return new com.ironsource.V0(tools, com.ironsource.F0.b.PROVIDER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3368xd(com.ironsource.V0 adUnitTools, com.ironsource.AbstractC3355x0 adUnitData, kotlin.jvm.functions.Function1<? super com.ironsource.V0, ? extends com.ironsource.V0> createProviderTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createProviderTools, "createProviderTools");
        this.f6839a = adUnitTools;
        this.b = adUnitData;
        this.c = createProviderTools;
    }

    private final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> b(java.util.List<java.lang.String> list) {
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(list);
        java.util.HashMap hashMap = new java.util.HashMap(list.size());
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.b.m()) {
            if (set.contains(networkSettings.getProviderInstanceName())) {
                java.lang.String providerInstanceName = networkSettings.getProviderInstanceName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "provider.providerInstanceName");
                hashMap.put(providerInstanceName, networkSettings);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings2 = (com.ironsource.mediationsdk.model.NetworkSettings) hashMap.get((java.lang.String) it.next());
            if (networkSettings2 != null) {
                arrayList.add(networkSettings2);
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.InterfaceC3386yd
    public java.util.List<com.ironsource.C3075h6> a(java.util.List<java.lang.String> instances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instances, "instances");
        if (instances.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> b = b(instances);
        com.ironsource.C3178n2 a2 = a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
        java.util.Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (com.ironsource.mediationsdk.model.NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C3368xd(com.ironsource.V0 v0, com.ironsource.AbstractC3355x0 abstractC3355x0, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC3355x0, (i & 4) != 0 ? com.ironsource.C3368xd.a.f6840a : function1);
    }

    private final com.ironsource.C3075h6 a(com.ironsource.C3178n2 c3178n2, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.I i = new com.ironsource.I(this.f6839a, this.b, networkSettings);
        return new com.ironsource.C3075h6(this.c.invoke(this.f6839a), new com.ironsource.C(this.b, networkSettings, c3178n2, new com.ironsource.C3016e1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new com.ironsource.C3232q2(networkSettings.getProviderInstanceName()), this.f6839a.f(), true), i);
    }

    private final com.ironsource.C3178n2 a() {
        return new com.ironsource.C3178n2("", new org.json.JSONObject(), null, 0, "");
    }
}
