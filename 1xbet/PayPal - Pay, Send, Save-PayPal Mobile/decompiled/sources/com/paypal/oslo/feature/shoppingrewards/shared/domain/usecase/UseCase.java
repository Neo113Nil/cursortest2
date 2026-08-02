package com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0002\u0010\b*\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0002\u0010\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Input", "Output", "", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lkotlin/Function1;", "transform", "toUseCaseResult", "(Larrow/core/Ior;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "error", "onDataResultError", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "dataResult", "onResponseData", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UseCase<Input, Output> {
    java.lang.Object invoke(Input input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends Output>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <Input, Output, T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> toUseCaseResult(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<Input, Output> useCase, arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase.super.toUseCaseResult(ior, function1);
        }

        @java.lang.Deprecated
        public static <Input, Output> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<Input, Output> useCase, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResultError, "");
            return com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase.super.onDataResultError(dataResultError);
        }

        @java.lang.Deprecated
        public static <Input, Output, T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<Input, Output> useCase, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResult, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase.super.onResponseData(dataResult, function1);
        }
    }

    default <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.Either<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> either = ior.toEither();
        if (either instanceof arrow.core.Either.Right) {
            return onResponseData((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Either.Right) either).getValue(), function1);
        }
        if (either instanceof arrow.core.Either.Left) {
            return onDataResultError((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) ((arrow.core.Either.Left) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    default com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet(null, 1, null);
        }
        if (error instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError) {
            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError httpError = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError) error;
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError(httpError.getCorrelationId(), httpError.getCode());
        }
        if (error instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic(error.getCorrelationId());
        }
        if (!(error instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData(((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError) error).getCorrelationId());
    }

    default <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<Output> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, ? extends Output> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        if (dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData(((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty) dataResult).getCorrelationId());
        }
        if (!(dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult;
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success(success.getCorrelationId(), transform.invoke((java.lang.Object) success.getData()));
    }
}
