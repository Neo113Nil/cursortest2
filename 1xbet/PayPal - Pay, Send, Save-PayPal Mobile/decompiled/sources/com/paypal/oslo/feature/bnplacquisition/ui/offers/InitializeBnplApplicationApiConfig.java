package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/InitializeBnplApplicationApiConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getShouldCall", "()Z", "shouldCall", "getIncludeAnnualIncome", "includeAnnualIncome", "getIncludeNationalIdentification", "includeNationalIdentification", "getIncludePaymentFundingInstruments", "includePaymentFundingInstruments", "getIncludeSelectedPaymentFundingInstrument", "includeSelectedPaymentFundingInstrument", "getIncludeCountryCode", "includeCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitializeBnplApplicationApiConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    public InitializeBnplApplicationApiConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final boolean getShouldCall() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
        return i == 1 || i == 2;
    }

    public final boolean getIncludeAnnualIncome() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] != 1;
    }

    public final boolean getIncludeNationalIdentification() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] != 1;
    }

    public final boolean getIncludePaymentFundingInstruments() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 1;
    }

    public final boolean getIncludeSelectedPaymentFundingInstrument() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 1;
    }

    public final boolean getIncludeCountryCode() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.InitializeBnplApplicationApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.IT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
