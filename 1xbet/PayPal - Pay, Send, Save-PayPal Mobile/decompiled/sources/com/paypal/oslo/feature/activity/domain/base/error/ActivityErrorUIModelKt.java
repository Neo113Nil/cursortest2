package com.paypal.oslo.feature.activity.domain.base.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;", "toDomainErrorUIModel", "(Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;)Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;", "Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityGenericErrorActivityImpl;", "toErrorUIModel", "(Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityGenericErrorActivityImpl;)Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityErrorUIModelKt {
    public static final com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel toDomainErrorUIModel(com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError iActivityDomainError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityDomainError, "");
        com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl activityGenericErrorActivityImpl = iActivityDomainError instanceof com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl ? (com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl) iActivityDomainError : null;
        if (activityGenericErrorActivityImpl != null) {
            return toErrorUIModel(activityGenericErrorActivityImpl);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel toErrorUIModel(com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl activityGenericErrorActivityImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityGenericErrorActivityImpl, "");
        int i = com.paypal.oslo.feature.activity.R.string.feature_activity_details_error_screen_title;
        int i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_details_error_screen_subtitle;
        return new com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_retry_text, activityGenericErrorActivityImpl.getErrorMessage(), activityGenericErrorActivityImpl.getCallError());
    }
}
