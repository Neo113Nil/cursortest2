package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsViewModel$getActivityWidgetDataTransformer$1;", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformationConfig;", "getTransformationConfig", "()Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformationConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolDetailsViewModel$getActivityWidgetDataTransformer$1 implements com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel getHighSpeedVideoFpsRangesFor;

    PoolDetailsViewModel$getActivityWidgetDataTransformer$1(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = poolDetailsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer
    public final com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformationConfig getTransformationConfig() {
        final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel = this.getHighSpeedVideoFpsRangesFor;
        final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1.m17680$r8$lambda$_riuf3OSMuf7fvg_32JCrsfhFQ(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.this, str, (com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext) obj, (java.lang.String) obj2);
            }
        };
        final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function2 function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1.$r8$lambda$FotKwiCQMXRIRsdbrWE0TpEVGG8(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.this, (com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext) obj, (com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo) obj2);
            }
        };
        final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel3 = this.getHighSpeedVideoFpsRangesFor;
        return new com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformationConfig(function2, function22, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$getActivityWidgetDataTransformer$1.$r8$lambda$JsVnnEhM3RDPj9Q4MMrYAWTKRos(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.this, (com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext) obj, (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType) obj2);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo $r8$lambda$FotKwiCQMXRIRsdbrWE0TpEVGG8(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext, com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo activityAmountInfo) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetTransformContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAmountInfo, "");
        z = poolDetailsViewModel.getHighSpeedVideoSizesFor;
        return (z && activityWidgetTransformContext.isAnonymousContribution()) ? activityAmountInfo.copy(com.paypal.oslo.feature.pools.constants.PoolsConstants.ActivityWidget.WIDGET_ANONYMOUS_AMOUNT_TEXT, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown.INSTANCE) : activityAmountInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityAvatarType $r8$lambda$JsVnnEhM3RDPj9Q4MMrYAWTKRos(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext, com.paypal.oslo.feature.activity.api.models.ActivityAvatarType activityAvatarType) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetTransformContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAvatarType, "");
        z = poolDetailsViewModel.getHighSpeedVideoSizesFor;
        return (z && activityWidgetTransformContext.isAnonymousContribution()) ? new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar(com.paypal.pds.core.Icon.Person.INSTANCE, null, 2, null) : activityAvatarType;
    }

    /* renamed from: $r8$lambda$_riuf3OSMuf7fvg_32JCrsf-hFQ, reason: not valid java name */
    public static /* synthetic */ java.lang.String m17680$r8$lambda$_riuf3OSMuf7fvg_32JCrsfhFQ(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, java.lang.String str, com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext, java.lang.String str2) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetTransformContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        z = poolDetailsViewModel.getHighSpeedVideoSizesFor;
        return (z && activityWidgetTransformContext.isAnonymousContribution()) ? str : str2;
    }
}
