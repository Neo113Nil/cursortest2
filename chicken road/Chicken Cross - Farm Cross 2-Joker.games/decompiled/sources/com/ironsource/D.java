package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7589a;
    private final C b;
    private final BaseAdAdapter<?, ?> c;

    public D(T0 adTools, C instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.f7589a = adTools;
        this.b = instanceData;
        this.c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.c;
            String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter);
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter2);
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.checkNotNull(str2);
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(C4577p0.a(this.f7589a, "could not get adapter version for event data " + this.b.x(), (String) null, 2, (Object) null));
        }
        String i = this.b.k().i();
        Intrinsics.checkNotNullExpressionValue(i, "instanceData.adapterConfig.subProviderId");
        hashMap.put("spId", i);
        String a2 = this.b.k().a();
        Intrinsics.checkNotNullExpressionValue(a2, "instanceData.adapterConfig.adSourceNameForEvents");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, a2);
        hashMap.put("instanceType", Integer.valueOf(this.b.t()));
        String serverData = this.b.o().k();
        T0 t0 = this.f7589a;
        Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        String e2 = t0.e(serverData);
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("dynamicDemandSource", e2);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.b.w()));
        if (!TextUtils.isEmpty(this.b.v().getCustomNetwork())) {
            String customNetwork = this.b.v().getCustomNetwork();
            Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
