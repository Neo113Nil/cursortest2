package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u0019\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0004\u001a\u0019\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u0019\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel$ActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware.CARD_SHIPPED_ACTION_NAME, "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel$ActionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", "paymentSecurity", "setupAutopay", "setAsPreferred", "addAuthorizedUser", "setupNotifications", "creditLimitIncrease", "updateIncome"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrioritizedAccountActionsCardPreviewDataKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel cardShipped(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware.CARD_SHIPPED_ACTION_NAME, "Card shipped", "Activate it here when it arrives.", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.Package.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel paymentSecurity$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return paymentSecurity(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel paymentSecurity(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("paymentSecurity", "Add Payment Security", "Protect your card from unexpected events", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.Shield.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setupAutopay$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return setupAutopay(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setupAutopay(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("setupAutopay", "Set up autopay", "Always be on time for your card payments", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.ArrowsClockwise.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setAsPreferred$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return setAsPreferred(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setAsPreferred(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("setAsPreferred", "Set as preferred", "Save this card as your preferred way to pay online with PayPal", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.Star.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel addAuthorizedUser$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return addAuthorizedUser(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel addAuthorizedUser(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("addAuthorizedUser", "Add authorized users", "Share your credit line with up to 6 family members or friends.", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.PersonPlus.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setupNotifications$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return setupNotifications(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel setupNotifications(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("setupNotifications", "Set up notifications", "Keep track of your account activity and receive updates", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.Bell.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel creditLimitIncrease$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return creditLimitIncrease(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel creditLimitIncrease(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("creditLimitIncrease", "Credit limit increase", "Request a higher credit limit and enjoy more flexibility.", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.MoneyBill.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel updateIncome$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        }
        return updateIncome(actionType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel updateIncome(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel("updateIncome", "Update your income", "Get the right credit limit offer by updating your income.", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(com.paypal.pds.core.Icon.MoneyBill.INSTANCE), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, actionType);
    }
}
