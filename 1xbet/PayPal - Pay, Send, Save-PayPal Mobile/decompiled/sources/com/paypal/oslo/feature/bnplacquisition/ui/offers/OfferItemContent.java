package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItemContent;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)V", "", "amount", "", "installmentCount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "(Ljava/lang/String;ILcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "subtitle", "apr", "badgeText", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "nominalInterestRate", "aprLabel", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "detailFields", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "Camera2StreamConfigurationMap", "getTotalLabel", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "totalLabel", "getDueTodayLabel", "dueTodayLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OfferItemContent {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.Country Camera2StreamConfigurationMap;

    public OfferItemContent(com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        this.Camera2StreamConfigurationMap = country;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTotalLabel() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_total, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDueTodayLabel() {
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_due_today, new java.lang.Object[0]);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText title(java.lang.String amount, int installmentCount, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_title_monthly_no_count, amount);
            }
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
        }
        if (creditProductIdentifier == com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_payment_frequency_title_short_term, amount);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_title_monthly, amount, java.lang.Integer.valueOf(installmentCount));
    }

    public final com.paypal.oslo.core.commonui.utils.RefText subtitle(java.lang.String amount, int installmentCount, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_subtitle_installments, java.lang.Integer.valueOf(installmentCount));
            }
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
        }
        if (creditProductIdentifier == com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_installment_count_subtitle_short_term, java.lang.Integer.valueOf(installmentCount));
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_subtitle, amount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText badgeText(java.lang.String apr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apr, "");
        if (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()] == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_badge, apr);
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
    }

    public final com.paypal.oslo.core.commonui.utils.RefText aprLabel(java.lang.String apr, java.lang.String nominalInterestRate) {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
            }
            if (nominalInterestRate != null) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_interest_no_apr, new java.lang.Object[0]);
            }
            return null;
        }
        if (apr != null) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offer_item_apr, apr);
        }
        if (nominalInterestRate != null) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_nominal_annual_rate, nominalInterestRate);
        }
        return null;
    }

    public final java.util.List<com.paypal.oslo.core.commonui.utils.RefText> detailFields(java.lang.String nominalInterestRate, java.lang.String apr) {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItemContent.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
        if (i == 1 || i != 2) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (nominalInterestRate != null) {
            arrayList.add(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_fixed_interest_pa, nominalInterestRate));
        }
        if (apr != null) {
            arrayList.add(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_offers_item_annual_percentage_rate_text, apr));
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }
}
