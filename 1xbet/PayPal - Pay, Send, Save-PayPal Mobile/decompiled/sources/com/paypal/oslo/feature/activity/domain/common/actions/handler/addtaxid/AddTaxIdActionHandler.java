package com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/addtaxid/AddTaxIdActionHandler;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;", "activityDeepLinkNavigationProvider", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "invokeAddTaxIdActions$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "", "generateAddTaxIdDeepLinkUrl$activity_prodRelease", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddTaxIdActionHandler {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AddTaxIdActionHandler(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDeepLinkNavigationProvider, "");
        this.getHighSpeedVideoFpsRanges = activityComposeConfig;
        this.getHighSpeedVideoFpsRangesFor = activityDeepLinkNavigationProvider;
    }

    public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult invokeAddTaxIdActions$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        com.paypal.oslo.core.navigation.AppNavigator navigator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        int i = com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler.WhenMappings.$EnumSwitchMapping$0[activityActionModel.getType().ordinal()];
        if (i == 1 || i == 2) {
            this.getHighSpeedVideoFpsRangesFor.handleDeepLink$activity_prodRelease(generateAddTaxIdDeepLinkUrl$activity_prodRelease());
        } else if (i == 3 && (navigator = this.getHighSpeedVideoFpsRanges.getNavigator()) != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler.$r8$lambda$HmukLio5RnOiQ5Ea3qPZQ457LRM(com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf(activityActionModel.getType())));
    }

    public final java.lang.String generateAddTaxIdDeepLinkUrl$activity_prodRelease() {
        java.lang.String obj = new android.net.Uri.Builder().path(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityPaypalDeepLinks.KEY_PATH_ADD_DEEP_LINK_TAX_ID).appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_POLICY_NAME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_POLICY_NAME_IRS_1099_K).appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_CONTEXTUAL_MESSAGE, "true").appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_ATTEMPT_INTENTION, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_ATTEMPT_INTENTION_TIN_COLLECTION_TDC).appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_INVOCATION_PAGE, "activity_details").appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_ACKNOWLEDGEMENT_SCREEN, "true").appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_PP_FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_PP_FLOW_TDC_ACTION_CARD).appendQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SKIP_SUCCESS_SCREEN, "true").build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HmukLio5RnOiQ5Ea3qPZQ457LRM(com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler addTaxIdActionHandler, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_POLICY_NAME_IRS_1099_K, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_ATTEMPT_INTENTION_TAX_ON_HOLD, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_INVOCATION_PAGE_EDUCATIONAL_SHEET, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_PP_FLOW_EDUCATIONAL_SHEET_NATIVE, (java.lang.String) null, "false", 16, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CONFIRM_TAX_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
