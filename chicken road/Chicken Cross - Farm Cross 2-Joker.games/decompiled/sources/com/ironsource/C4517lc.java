package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4517lc implements InterfaceC4499kc {
    @Override // com.ironsource.InterfaceC4499kc
    public void a(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}
