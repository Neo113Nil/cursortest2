package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/UpdateApplicationAndFetchRepaymentsApiConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getShouldCall", "()Z", "shouldCall"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateApplicationAndFetchRepaymentsApiConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    public UpdateApplicationAndFetchRepaymentsApiConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final boolean getShouldCall() {
        return com.paypal.oslo.feature.bnplacquisition.ui.offers.UpdateApplicationAndFetchRepaymentsApiConfig.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCpi().ordinal()] == 1;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
