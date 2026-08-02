package com.paypal.oslo.feature.activity.domain.usecase.common;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;)V", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "transactionTileNavigationTypes", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "navResultRequestId", "", "invoke-VU73JmE", "(Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;Ljava/lang/String;)V", "invoke", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityNavigationUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivityNavigationUseCase(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        this.getHighSpeedVideoFpsRangesFor = activityComposeConfig;
    }

    /* renamed from: invoke-VU73JmE$default, reason: not valid java name */
    public static /* synthetic */ void m11789invokeVU73JmE$default(com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        activityNavigationUseCase.m11790invokeVU73JmE(transactionTileNavigationTypes, str);
    }

    /* renamed from: invoke-VU73JmE, reason: not valid java name */
    public final void m11790invokeVU73JmE(final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes, java.lang.String navResultRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTileNavigationTypes, "");
        if (navResultRequestId != null) {
            com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRangesFor.getNavigator();
            if (navigator != null) {
                navigator.m11575navigateForResultInternaluBl809w(navResultRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase.$r8$lambda$AuQkDmtpp5L_ddJrjtEmRLt0E44(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (!(transactionTileNavigationTypes instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation) && !(transactionTileNavigationTypes instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation) && !(transactionTileNavigationTypes instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation) && !(transactionTileNavigationTypes instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        final androidx.navigation3.runtime.NavKey destinationKey = transactionTileNavigationTypes.getDestinationKey();
        com.paypal.oslo.core.navigation.AppNavigator navigator2 = this.getHighSpeedVideoFpsRangesFor.getNavigator();
        if (navigator2 != null) {
            navigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase.$r8$lambda$mdnmbG1hg7pGQRO5Yd0VB90QcB8(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AuQkDmtpp5L_ddJrjtEmRLt0E44(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(transactionTileNavigationTypes.getDestinationKey());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mdnmbG1hg7pGQRO5Yd0VB90QcB8(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
