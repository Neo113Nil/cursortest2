package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductFeatureEligibilityStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ProductFeatureEligibilityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = productFeatureEligibilityStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 1);
        INELIGIBLE = productFeatureEligibilityStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus[] productFeatureEligibilityStatusArr = {productFeatureEligibilityStatus, productFeatureEligibilityStatus2};
        getHighResolutionOutputSizeshNQ4ISI = productFeatureEligibilityStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(productFeatureEligibilityStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
