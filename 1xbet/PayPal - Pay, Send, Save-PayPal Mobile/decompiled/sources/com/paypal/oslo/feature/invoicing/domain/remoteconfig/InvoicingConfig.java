package com.paypal.oslo.feature.invoicing.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/domain/remoteconfig/InvoicingConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "viewInvoicePathUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getViewInvoicePathUrl", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "viewInvoicePathUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvoicingConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingConfig INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingConfig.class, "viewInvoicePathUrl", "getViewInvoicePathUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: viewInvoicePathUrl$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty viewInvoicePathUrl;

    private InvoicingConfig() {
        super("invoicing", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.APP_CONFIG);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getViewInvoicePathUrl() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) viewInvoicePathUrl.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    static {
        com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingConfig invoicingConfig = new com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingConfig();
        INSTANCE = invoicingConfig;
        viewInvoicePathUrl = invoicingConfig.create("/invoice/payerView/details", "view_invoice_path_url");
        $stable = 8;
    }
}
