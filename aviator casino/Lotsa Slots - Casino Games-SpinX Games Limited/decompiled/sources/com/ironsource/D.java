package com.ironsource;

/* loaded from: classes5.dex */
public final class D implements com.ironsource.E0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5662a;
    private final com.ironsource.C b;
    private final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> c;

    public D(com.ironsource.V0 adTools, com.ironsource.C instanceData, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.f5662a = adTools;
        this.b = instanceData;
        this.c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 event) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter = this.c;
            java.lang.String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.Intrinsics.checkNotNull(networkAdapter);
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter2 = this.c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.Intrinsics.checkNotNull(networkAdapter2);
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(com.ironsource.C3212p0.a(this.f5662a, "could not get adapter version for event data " + this.b.x(), (java.lang.String) null, 2, (java.lang.Object) null));
        }
        java.lang.String i = this.b.k().i();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "instanceData.adapterConfig.subProviderId");
        hashMap.put("spId", i);
        java.lang.String a2 = this.b.k().a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "instanceData.adapterConfig.adSourceNameForEvents");
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, a2);
        hashMap.put("instanceType", java.lang.Integer.valueOf(this.b.t()));
        java.lang.String serverData = this.b.o().k();
        com.ironsource.V0 v0 = this.f5662a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        java.lang.String e2 = v0.e(serverData);
        if (!android.text.TextUtils.isEmpty(e2)) {
            hashMap.put("dynamicDemandSource", e2);
        }
        hashMap.put("sessionDepth", java.lang.Integer.valueOf(this.b.w()));
        if (!android.text.TextUtils.isEmpty(this.b.v().getCustomNetwork())) {
            java.lang.String customNetwork = this.b.v().getCustomNetwork();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
