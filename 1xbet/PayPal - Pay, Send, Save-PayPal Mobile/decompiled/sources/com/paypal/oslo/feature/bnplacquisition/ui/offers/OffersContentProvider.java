package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0011\u0010\u001c\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\bR\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersContentProvider;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "configContext", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "headerSubtitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "amount", "inlineSubtitle", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifier", "continueButtonText", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getHeaderTitle", "headerTitle", "getEmoneyContent", "emoneyContent", "footer", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getFooter", "choosePlanError", "getChoosePlanError", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItemContent;", "offerItemContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItemContent;", "getOfferItemContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItemContent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersContentProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.commonui.utils.RefText choosePlanError;
    private final com.paypal.oslo.core.commonui.utils.RefText footer;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent offerItemContent;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent;

    @javax.inject.Inject
    public OffersContentProvider(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.Camera2StreamConfigurationMap = configContext;
        this.toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        this.footer = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_footer, new java.lang.Object[0]);
        this.choosePlanError = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_choose_plan_error, new java.lang.Object[0]);
        this.offerItemContent = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent(configContext.getCountry());
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getHeaderTitle() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_title, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText headerSubtitle() {
        if (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getCountry().ordinal()] == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_header_subtitle, new java.lang.Object[0]);
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.utils.RefText inlineSubtitle$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider offersContentProvider, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return offersContentProvider.inlineSubtitle(str);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText inlineSubtitle(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        if (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getCountry().ordinal()] == 2) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_header_subtitle_loan_amount, amount);
        }
        return null;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getEmoneyContent() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_header_subtitle_modal_label, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getFooter() {
        return this.footer;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText continueButtonText(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        if (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getCountry().ordinal()] == 1) {
            int i = creditProductIdentifier == null ? -1 : com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersContentProvider.WhenMappings.$EnumSwitchMapping$1[creditProductIdentifier.ordinal()];
            if (i == 1) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_continue_with, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_in_4, new java.lang.Object[0]));
            }
            if (i == 2) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_continue_with, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_monthly, new java.lang.Object[0]));
            }
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_continue, new java.lang.Object[0]);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_continue, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getChoosePlanError() {
        return this.choosePlanError;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent getOfferItemContent() {
        return this.offerItemContent;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
