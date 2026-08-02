package com.paypal.oslo.feature.debitcard.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0002\u0010\b*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\"¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Input", "Output", "", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;", "Lkotlin/Function1;", "transform", "toUseCaseResult", "(Larrow/core/Ior;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "p0", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UseCase<Input, Output> {
    java.lang.Object invoke(Input input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends Output>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <Input, Output, T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<Output> toUseCaseResult(com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<Input, Output> useCase, arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase.super.toUseCaseResult(ior, function1);
        }
    }

    private static com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError p0) {
        if (p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.Network.NoInternet) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet(null, com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR);
        }
        if (p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.Network.HttpError) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.Network.HttpError httpError = (com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.Network.HttpError) p0;
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError(httpError.getCode(), httpError.getCorrelationId(), httpError.getMessage());
        }
        if (p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.Network.UnknownNetworkError) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.UnknownNetworkError(null, "An unknown network error occurred");
        }
        if (p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError) {
            return com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCaseUtilKt.mapGraphQLError((com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError) p0);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    default <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<Output> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends Output> function1) {
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success success;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoDataFoundError noDataFoundError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (ior instanceof arrow.core.Ior.Left) {
            success = Camera2StreamConfigurationMap((com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue());
        } else {
            if (ior instanceof arrow.core.Ior.Right) {
                a.d dVar = (java.lang.Object) ((arrow.core.Ior.Right) ior).getValue();
                if (dVar != null) {
                    noDataFoundError = new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success(null, function1.invoke(dVar));
                } else {
                    noDataFoundError = new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoDataFoundError(null, null, 3, null);
                }
                return noDataFoundError;
            }
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            a.d dVar2 = (java.lang.Object) both.getRightValue();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError dataResultError = (com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError) leftValue;
            if (dVar2 == null) {
                success = Camera2StreamConfigurationMap(dataResultError);
            } else {
                success = new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success(null, function1.invoke(dVar2));
            }
        }
        noDataFoundError = success;
        return noDataFoundError;
    }
}
