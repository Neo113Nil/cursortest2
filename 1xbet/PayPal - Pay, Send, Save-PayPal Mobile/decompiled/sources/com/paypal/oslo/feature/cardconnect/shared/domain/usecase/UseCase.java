package com.paypal.oslo.feature.cardconnect.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0002\u0010\b*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0002\u0010\b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u000bH\"¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\nH\"¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/usecase/UseCase;", "Input", "Output", "", "request", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "Lkotlin/Function1;", "transform", "toUseCaseResult", "(Larrow/core/Ior;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface UseCase<Input, Output> {
    java.lang.Object invoke(Input input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<? extends Output>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <Input, Output, T> com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<Output> toUseCaseResult(com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase<Input, Output> useCase, arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase.super.toUseCaseResult(ior, function1);
        }
    }

    private static <T> com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<Output> getHighSpeedVideoSizes(T p0, kotlin.jvm.functions.Function1<? super T, ? extends Output> p1) {
        if (p0 != null) {
            return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success(p1.invoke(p0));
        }
        return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError(null, null, 3, null);
    }

    private static com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError p0) {
        if (p0 instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.NoInternet) {
            return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet(null, com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR);
        }
        if (p0 instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError) {
            com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError httpError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError) p0;
            return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError(httpError.getCode(), httpError.getCorrelationId(), httpError.getMessage());
        }
        if (p0 instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError) {
            return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError(null, "An unknown network error occurred");
        }
        if (p0 instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError) {
            return com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCaseUtilKt.mapGraphQLError((com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError) p0);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    default <T> com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<Output> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
        com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (ior instanceof arrow.core.Ior.Left) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            highSpeedVideoFpsRanges = getHighSpeedVideoSizes(((arrow.core.Ior.Right) ior).getValue(), function1);
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            java.lang.Object rightValue = both.getRightValue();
            highSpeedVideoFpsRanges = rightValue == null ? getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError) leftValue) : getHighSpeedVideoSizes(rightValue, function1);
        }
        return highSpeedVideoFpsRanges;
    }
}
