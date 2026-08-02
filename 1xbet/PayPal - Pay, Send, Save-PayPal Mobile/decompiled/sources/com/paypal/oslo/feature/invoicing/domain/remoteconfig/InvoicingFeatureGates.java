package com.paypal.oslo.feature.invoicing.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/domain/remoteconfig/InvoicingFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "viewInvoiceEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getViewInvoiceEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "viewInvoiceEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvoicingFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingFeatureGates.class, "viewInvoiceEnabled", "getViewInvoiceEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: viewInvoiceEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty viewInvoiceEnabled;

    private InvoicingFeatureGates() {
        super("invoicing");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getViewInvoiceEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) viewInvoiceEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    static {
        com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingFeatureGates invoicingFeatureGates = new com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingFeatureGates();
        INSTANCE = invoicingFeatureGates;
        viewInvoiceEnabled = invoicingFeatureGates.create("view_invoice_enabled");
        $stable = 8;
    }
}
