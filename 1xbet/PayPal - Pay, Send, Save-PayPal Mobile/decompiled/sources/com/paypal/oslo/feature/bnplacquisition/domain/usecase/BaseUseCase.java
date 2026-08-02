package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0001\u0010\t*\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\nH\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0001\u0010\t2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "<init>", "()V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "toUseCaseResult", "(Larrow/core/Ior;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "error", "onNetworkResultError", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseUseCase<R> {
    public static final int $stable = 0;

    public abstract java.lang.Object invoke(R r, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation);

    protected final <T> com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, ? extends T> ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Left) {
            return onNetworkResultError((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError) ((arrow.core.Ior.Left) ior).getValue());
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return onResponseData(((arrow.core.Ior.Right) ior).getValue());
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        if (both.getRightValue() == null) {
            return onNetworkResultError((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError) both.getLeftValue());
        }
        return onResponseData(both.getRightValue());
    }

    protected com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> onNetworkResultError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet("");
        }
        if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError("", ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError) error).getStatusCode());
        }
        if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError("");
        }
        if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL) {
            return com.paypal.oslo.feature.bnplacquisition.domain.usecase.UseCaseResultUtilKt.mapGraphQLError((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL) error);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    protected <T> com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> onResponseData(T data) {
        if (data == null) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData("");
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success("", data);
    }
}
