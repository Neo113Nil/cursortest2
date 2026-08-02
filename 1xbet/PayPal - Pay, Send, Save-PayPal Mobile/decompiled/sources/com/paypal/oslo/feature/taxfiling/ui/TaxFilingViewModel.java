package com.paypal.oslo.feature.taxfiling.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxfiling/ui/TaxFilingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taxfiling/provider/TaxFillingConfigurationProvider;", "taxFillingConfigurationProvider", "<init>", "(Lcom/paypal/oslo/feature/taxfiling/provider/TaxFillingConfigurationProvider;)V", "", "source", "getTaxFilingUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxfiling/provider/TaxFillingConfigurationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxFilingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TaxFilingViewModel(com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider taxFillingConfigurationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxFillingConfigurationProvider, "");
        this.getHighSpeedVideoSizes = taxFillingConfigurationProvider;
    }

    public final java.lang.String getTaxFilingUrl(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taxfiling.LoggerKt.log, "started_tax_filing_flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", source)), null, 4, null);
        java.lang.String obj = android.net.Uri.parse(this.getHighSpeedVideoSizes.getTaxFilingServiceUrl()).buildUpon().appendQueryParameter("entry_point", source).build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
