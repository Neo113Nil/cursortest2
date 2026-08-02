package com.paypal.oslo.feature.activity.data.error;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/error/ActivityErrorMapperImpl;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "mapToDomainError", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityErrorMapperImpl implements com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivityErrorMapperImpl() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError mapToDomainError(java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        int i = 2;
        com.paypal.oslo.core.network.graphql.error.CallError callError = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (exception instanceof java.net.UnknownHostException) {
            return new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NO_INTERNET_CONNECTION, callError, i, objArr3 == true ? 1 : 0);
        }
        java.lang.String message = exception.getMessage();
        if (message == null) {
            message = "Something went wrong";
        }
        return new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(message, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
    }
}
