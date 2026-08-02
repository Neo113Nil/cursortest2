package com.paypal.oslo.feature.activity.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetProviderImpl;", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;", "widgetFactory", "<init>", "(Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;)V", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "config", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "createWidget", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;)Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetProviderImpl implements com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ActivityWidgetProviderImpl(com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.getHighSpeedVideoSizes = factory;
    }

    @Override // com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider
    public final com.paypal.oslo.feature.activity.api.widget.IActivityWidget createWidget(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return this.getHighSpeedVideoSizes.create(config);
    }
}
