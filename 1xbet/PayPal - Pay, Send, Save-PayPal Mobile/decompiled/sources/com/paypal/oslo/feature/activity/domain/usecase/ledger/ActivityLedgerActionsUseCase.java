package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerActionsUseCase;", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityActionsBaseUseCase;", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "activityBaseActionHandler", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerActionsUseCase extends com.paypal.oslo.feature.activity.domain.usecase.common.ActivityActionsBaseUseCase {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public ActivityLedgerActionsUseCase(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        super(activityBaseActionsProvider, activityFeatureManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBaseActionsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
    }

    @Override // com.paypal.oslo.feature.activity.domain.usecase.common.ActivityActionsBaseUseCase
    public final java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult> continuation) {
        return super.invoke(activityActionModel, continuation);
    }
}
