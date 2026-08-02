package com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/invoice/InvoiceActionHandler;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "invokeInvoiceActions", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "", "invoiceID", "", "navigateToUPRInvoiceFlow$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Ljava/lang/String;)V", "navigateToInvoiceFlow$activity_prodRelease", "(Ljava/lang/String;)V", "getInvoiceId$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InvoiceActionHandler {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public InvoiceActionHandler(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        this.getHighSpeedVideoFpsRanges = activityComposeConfig;
    }

    public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult invokeInvoiceActions(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        java.lang.String invoiceId$activity_prodRelease = getInvoiceId$activity_prodRelease(activityActionModel);
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        java.lang.String str = invoiceId$activity_prodRelease;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.isUPRInvoiceTransaction(activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getActivityType() : null, activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getActivityFlags() : null)) {
                navigateToUPRInvoiceFlow$activity_prodRelease(activityActionModel, invoiceId$activity_prodRelease);
            } else {
                navigateToInvoiceFlow$activity_prodRelease(invoiceId$activity_prodRelease);
            }
        } else {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("handleNavigationActionOperation", "Failed to build invoice URL for VIEW_INVOICE_RECEIPT - no valid URL or ID found");
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf(activityActionModel.getType())));
    }

    public final void navigateToUPRInvoiceFlow$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, final java.lang.String invoiceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceID, "");
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getActivityType() : null;
        int i = activityType == null ? -1 : com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler.WhenMappings.$EnumSwitchMapping$0[activityType.ordinal()];
        if (i == 1) {
            com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
            if (navigator != null) {
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler.$r8$lambda$taOFiAm6OuxBTRck48mYh8vz_eY(invoiceID, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (i == 2) {
            com.paypal.oslo.core.navigation.AppNavigator navigator2 = this.getHighSpeedVideoFpsRanges.getNavigator();
            if (navigator2 != null) {
                navigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler.$r8$lambda$wFaF_D0V8DmidjA8QO2b07ObLYM(invoiceID, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("navigateToUPRInvoiceFlow", "Unsupported activity type for UPR invoice flow. Expected INVOICE or PAYMENT.");
    }

    public final void navigateToInvoiceFlow$activity_prodRelease(final java.lang.String invoiceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceID, "");
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler.$r8$lambda$mK6l2VtP0AlA5gymRiQmbjZmmn0(invoiceID, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r2) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getInvoiceId$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        if (activityActionsTransactionInfo != null) {
            str = activityActionsTransactionInfo.getInvoiceId();
            if (str != null) {
                if (kotlin.text.StringsKt.isBlank(str)) {
                    str = null;
                }
            }
            str = activityActionsTransactionInfo.getTransactionId();
            if (str != null) {
            }
        }
        str = null;
        if (str != null) {
            return com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.toUPRPurchaseInvoiceIdIfApplicable(str, activityActionModel);
        }
        return null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mK6l2VtP0AlA5gymRiQmbjZmmn0(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_INVOICE_SOURCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$taOFiAm6OuxBTRck48mYh8vz_eY(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wFaF_D0V8DmidjA8QO2b07ObLYM(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPurchaseDetailsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
