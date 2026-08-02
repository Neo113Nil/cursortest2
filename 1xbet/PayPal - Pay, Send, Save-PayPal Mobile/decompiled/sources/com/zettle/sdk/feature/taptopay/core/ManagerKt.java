package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "exposeSettingsAnalytics", "()Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "exposeTippingAnalytics", "()Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ManagerKt {
    public static final com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics exposeSettingsAnalytics() {
        return com.zettle.sdk.feature.taptopay.core.Manager.INSTANCE.getSettingsAnalytics$core_publicRelease();
    }

    public static final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics exposeTippingAnalytics() {
        return com.zettle.sdk.feature.taptopay.core.Manager.INSTANCE.getTippingAnalytics$core_publicRelease();
    }
}
