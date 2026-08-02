package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountFeatureMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot unenrolledAccountFeaturesSnapshot) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unenrolledAccountFeaturesSnapshot, "");
        java.lang.String name2 = unenrolledAccountFeaturesSnapshot.getName();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(unenrolledAccountFeaturesSnapshot.getTitle());
        java.lang.String description = unenrolledAccountFeaturesSnapshot.getDescription();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel(name2, uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(description != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(description) : null), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.CreditImageToCreditAvatarUiModelMapperKt.toUiModel(unenrolledAccountFeaturesSnapshot.getIcon(), com.paypal.pds.core.Icon.NoIcon.INSTANCE));
    }
}
