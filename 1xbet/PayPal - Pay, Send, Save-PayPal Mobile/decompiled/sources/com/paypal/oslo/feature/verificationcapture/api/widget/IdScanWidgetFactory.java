package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "create", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;", "factoryProvider", "", "setProvider", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;)V", "resetProvider", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;", "Provider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdScanWidgetFactory {
    private static volatile com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider getHighSpeedVideoSizes;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory();
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "createWidget", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Provider {
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface createWidget();
    }

    private IdScanWidgetFactory() {
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface create() {
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider provider = getHighSpeedVideoSizes;
        if (provider == null) {
            throw new java.lang.IllegalStateException("IdScanWidget is not available. Ensure the verification-capture module is included in your dependencies.".toString());
        }
        return provider.createWidget();
    }

    @kotlin.jvm.JvmStatic
    public static final void setProvider(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider factoryProvider) {
        synchronized (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factoryProvider, "");
            if (getHighSpeedVideoSizes != null && getHighSpeedVideoSizes != factoryProvider) {
                throw new java.lang.IllegalStateException("IdScanWidgetFactory provider is already set and cannot be reassigned.".toString());
            }
            getHighSpeedVideoSizes = factoryProvider;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void resetProvider() {
        synchronized (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.class) {
            getHighSpeedVideoSizes = null;
        }
    }
}
