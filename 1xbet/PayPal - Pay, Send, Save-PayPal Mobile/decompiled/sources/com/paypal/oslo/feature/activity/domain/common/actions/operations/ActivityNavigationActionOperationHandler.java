package com.paypal.oslo.feature.activity.domain.common.actions.operations;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityNavigationActionOperationHandler;", "", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/invoice/InvoiceActionHandler;", "activityInvoiceActionHandler", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/pay/PayActionHandler;", "activityPayActionHandler", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/addtaxid/AddTaxIdActionHandler;", "activityAddTaxIdActionHandler", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;", "activityDeepLinkNavigationProvider", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/invoice/InvoiceActionHandler;Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/pay/PayActionHandler;Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/addtaxid/AddTaxIdActionHandler;Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "handleNavigationActionOperation$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/invoice/InvoiceActionHandler;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/pay/PayActionHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/addtaxid/AddTaxIdActionHandler;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityNavigationActionOperationHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivityNavigationActionOperationHandler(com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler invoiceActionHandler, com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler payActionHandler, com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler addTaxIdActionHandler, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceActionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payActionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addTaxIdActionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDeepLinkNavigationProvider, "");
        this.getHighSpeedVideoFpsRangesFor = invoiceActionHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = payActionHandler;
        this.getHighSpeedVideoSizes = addTaxIdActionHandler;
        this.Camera2StreamConfigurationMap = activityDeepLinkNavigationProvider;
    }

    public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult handleNavigationActionOperation$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        int i = com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler.WhenMappings.$EnumSwitchMapping$0[activityActionModel.getType().ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRangesFor.invokeInvoiceActions(activityActionModel);
        }
        if (i == 2) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invokePayAction$activity_prodRelease(activityActionModel);
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.getHighSpeedVideoSizes.invokeAddTaxIdActions$activity_prodRelease(activityActionModel);
        }
        java.lang.String url = activityActionModel.getUrl();
        if (url != null && !kotlin.text.StringsKt.isBlank(url)) {
            this.Camera2StreamConfigurationMap.handleDeepLink$activity_prodRelease(activityActionModel.getUrl());
        } else {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("handleNavigationActionOperation", "url is null or blank for action type: ".concat(java.lang.String.valueOf(activityActionModel.getType())));
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf(activityActionModel.getType())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CONFIRM_TAX_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
