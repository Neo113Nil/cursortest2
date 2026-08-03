package com.ironsource;

/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3152lc implements com.ironsource.InterfaceC3134kc {
    @Override // com.ironsource.InterfaceC3134kc
    public void a(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            com.ironsource.sdk.IronSourceNetwork.destroyAd(adInstance);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}
