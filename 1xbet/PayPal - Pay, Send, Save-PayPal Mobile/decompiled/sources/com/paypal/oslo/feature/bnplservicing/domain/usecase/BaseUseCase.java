package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0001\u0010\t*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0001\u0010\t2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0001\u0010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "<init>", "()V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "", "canPartialError", "toUseCaseResult", "(Larrow/core/Ior;Z)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "onNetworkResultErrors", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "onPartialErrors", "(Ljava/util/List;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseUseCase<R> {
    public static final int $stable = 0;

    public abstract java.lang.Object invoke(R r, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation);

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult toUseCaseResult$default(com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase baseUseCase, arrow.core.Ior ior, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toUseCaseResult");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return baseUseCase.toUseCaseResult(ior, z);
    }

    protected com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?> onNetworkResultErrors(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> errors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError bNPLError = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) errors);
        if (bNPLError instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet("");
        }
        if (bNPLError instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError) {
            com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError httpError = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError) bNPLError;
            java.lang.String message = httpError.getMessage();
            if (message == null) {
                message = "";
            }
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError("", message, httpError.getStatusCode());
        }
        if (bNPLError instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic("", "Unknown Network Error");
        }
        if (bNPLError instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL) {
            com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL graphQL = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL) bNPLError;
            java.lang.String debugId = graphQL.getExtensions().getDebugId();
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic(debugId != null ? debugId : "", graphQL.getMessage());
        }
        if (bNPLError != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic("", "Unknown Error");
    }

    protected <T> com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?> onResponseData(T data) {
        if (data == null) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData("", "response.data is null");
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success("", data);
    }

    protected <T> com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?> onPartialErrors(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> errors, T data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
        if (data != null) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess("", data, errors);
        }
        return onNetworkResultErrors(errors);
    }

    protected final <T> com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?> toUseCaseResult(arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends T> ior, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (!z) {
            arrow.core.Either<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends T> either = ior.toEither();
            if (either instanceof arrow.core.Either.Right) {
                return onResponseData(((arrow.core.Either.Right) either).getValue());
            }
            if (either instanceof arrow.core.Either.Left) {
                return onNetworkResultErrors((java.util.List) ((arrow.core.Either.Left) either).getValue());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (ior instanceof arrow.core.Ior.Left) {
            return onNetworkResultErrors((java.util.List) ((arrow.core.Ior.Left) ior).getValue());
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return onResponseData(((arrow.core.Ior.Right) ior).getValue());
        }
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            return onPartialErrors((java.util.List) both.getLeftValue(), both.getRightValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
