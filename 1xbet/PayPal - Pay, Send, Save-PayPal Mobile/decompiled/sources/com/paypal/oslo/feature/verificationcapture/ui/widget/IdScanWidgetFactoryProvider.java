package com.paypal.oslo.feature.verificationcapture.ui.widget;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/widget/IdScanWidgetFactoryProvider;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "createWidget", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdScanWidgetFactoryProvider implements com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IdScanWidgetFactoryProvider() {
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.setProvider(this);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider
    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface createWidget() {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl();
    }
}
