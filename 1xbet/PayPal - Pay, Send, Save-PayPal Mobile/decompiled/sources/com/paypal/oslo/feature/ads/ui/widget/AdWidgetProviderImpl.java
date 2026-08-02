package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetProviderImpl;", "Lcom/paypal/oslo/feature/ads/api/provider/AdWidgetProvider;", "Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl$Factory;", "widgetFactory", "<init>", "(Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl$Factory;)V", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "config", "Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "createWidget", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)Lcom/paypal/oslo/feature/ads/api/widget/AdWidget;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetImpl$Factory;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdWidgetProviderImpl implements com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AdWidgetProviderImpl(com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.Camera2StreamConfigurationMap = factory;
    }

    @Override // com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider
    public final com.paypal.oslo.feature.ads.api.widget.AdWidget createWidget(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return this.Camera2StreamConfigurationMap.create(config);
    }
}
