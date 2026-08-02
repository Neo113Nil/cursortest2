package com.paypal.oslo.feature.activity.domain.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "", "navigateToPackageIfApplicable", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Z", "", "sourcePage", "navigateToPromotionalRewardIfApplicable", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityComposeConfigKt {
    public static final boolean navigateToPackageIfApplicable(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        if (com.paypal.oslo.api.graphql.schema.type.ActivityType.PACKAGE != (activityTransactionModel != null ? activityTransactionModel.getType() : null)) {
            return false;
        }
        com.paypal.oslo.core.navigation.AppNavigator navigator = activityComposeConfig.getNavigator();
        if (navigator == null) {
            return true;
        }
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt.m11788$r8$lambda$yRqzNy3zdX397eeCAP566xM2k4(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return true;
    }

    public static final boolean navigateToPromotionalRewardIfApplicable(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (com.paypal.oslo.api.graphql.schema.type.ActivityType.REWARDS != (activityTransactionModel != null ? activityTransactionModel.getType() : null)) {
            return false;
        }
        com.paypal.oslo.core.navigation.AppNavigator navigator = activityComposeConfig.getNavigator();
        if (navigator == null) {
            return true;
        }
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt.$r8$lambda$jndAq8LRM32fM86CVpZ6WhuXPuM(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jndAq8LRM32fM86CVpZ6WhuXPuM(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toPromotionalRewardDestinationsKey(activityTransactionModel, str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yRqzNy3zd-X397eeCAP566xM2k4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11788$r8$lambda$yRqzNy3zdX397eeCAP566xM2k4(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toPackageDetailsDestinationsKey(activityTransactionModel));
        return kotlin.Unit.INSTANCE;
    }
}
