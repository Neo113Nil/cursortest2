package com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJq\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0012\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014Ji\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0012\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J}\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0012\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00122\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0081\u0001\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0012\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00122\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00122\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseUtils;", "", "<init>", "()V", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "dataResult", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;", "extractSuccess$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;", "S", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "firstDataResult", "secondDataResult", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "error", "Lkotlin/Function2;", "combiner", "Larrow/core/Ior;", "combineBothSuccess$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;Lkotlin/jvm/functions/Function2;)Larrow/core/Ior;", "combineRightSuccess$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;Lkotlin/jvm/functions/Function2;)Larrow/core/Ior;", "fallbackError", "handleBothResults$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;Larrow/core/Ior;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;Lkotlin/jvm/functions/Function2;)Larrow/core/Ior;", "combineResults$shopping_rewards_prodRelease", "(Larrow/core/Ior;Larrow/core/Ior;Lkotlin/jvm/functions/Function2;)Larrow/core/Ior;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseCaseUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils();

    private UseCaseUtils() {
    }

    public final <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> extractSuccess$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResult, "");
        if (dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) {
            return (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult;
        }
        return null;
    }

    public final <S, T, U> arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> combineBothSuccess$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<S> firstDataResult, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> secondDataResult, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError error, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends U> combiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combiner, "");
        return new arrow.core.Ior.Both(error, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(firstDataResult.getCorrelationId(), combiner.invoke(firstDataResult.getData(), secondDataResult.getData())));
    }

    public final <S, T, U> arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> combineRightSuccess$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<S> firstDataResult, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> secondDataResult, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends U> combiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combiner, "");
        return new arrow.core.Ior.Right(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(firstDataResult.getCorrelationId(), combiner.invoke(firstDataResult.getData(), secondDataResult.getData())));
    }

    public final <S, T, U> arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> handleBothResults$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<S> firstDataResult, arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> secondDataResult, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError fallbackError, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends U> combiner) {
        arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> combineRightSuccess$shopping_rewards_prodRelease;
        arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> combineBothSuccess$shopping_rewards_prodRelease;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fallbackError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combiner, "");
        if (secondDataResult instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) secondDataResult;
            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> extractSuccess$shopping_rewards_prodRelease = extractSuccess$shopping_rewards_prodRelease((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue());
            if (extractSuccess$shopping_rewards_prodRelease != null) {
                com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils useCaseUtils = INSTANCE;
                com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> extractSuccess$shopping_rewards_prodRelease2 = useCaseUtils.extractSuccess$shopping_rewards_prodRelease(firstDataResult);
                return (extractSuccess$shopping_rewards_prodRelease2 == null || (combineBothSuccess$shopping_rewards_prodRelease = useCaseUtils.combineBothSuccess$shopping_rewards_prodRelease(extractSuccess$shopping_rewards_prodRelease2, extractSuccess$shopping_rewards_prodRelease, (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) both.getLeftValue(), combiner)) == null) ? new arrow.core.Ior.Left(fallbackError) : combineBothSuccess$shopping_rewards_prodRelease;
            }
            return new arrow.core.Ior.Left(both.getLeftValue());
        }
        if (secondDataResult instanceof arrow.core.Ior.Left) {
            return new arrow.core.Ior.Left(((arrow.core.Ior.Left) secondDataResult).getValue());
        }
        if (!(secondDataResult instanceof arrow.core.Ior.Right)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> extractSuccess$shopping_rewards_prodRelease3 = extractSuccess$shopping_rewards_prodRelease((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) secondDataResult).getValue());
        if (extractSuccess$shopping_rewards_prodRelease3 != null) {
            com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils useCaseUtils2 = INSTANCE;
            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> extractSuccess$shopping_rewards_prodRelease4 = useCaseUtils2.extractSuccess$shopping_rewards_prodRelease(firstDataResult);
            return (extractSuccess$shopping_rewards_prodRelease4 == null || (combineRightSuccess$shopping_rewards_prodRelease = useCaseUtils2.combineRightSuccess$shopping_rewards_prodRelease(extractSuccess$shopping_rewards_prodRelease4, extractSuccess$shopping_rewards_prodRelease3, combiner)) == null) ? new arrow.core.Ior.Left(fallbackError) : combineRightSuccess$shopping_rewards_prodRelease;
        }
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown.INSTANCE);
    }

    public final <S, T, U> arrow.core.Ior<com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<U>> combineResults$shopping_rewards_prodRelease(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<S>> firstDataResult, arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> secondDataResult, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends U> combiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondDataResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combiner, "");
        if (firstDataResult instanceof arrow.core.Ior.Left) {
            return new arrow.core.Ior.Left(((arrow.core.Ior.Left) firstDataResult).getValue());
        }
        if (firstDataResult instanceof arrow.core.Ior.Right) {
            return handleBothResults$shopping_rewards_prodRelease((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) firstDataResult).getValue(), secondDataResult, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown.INSTANCE, combiner);
        }
        if (!(firstDataResult instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) firstDataResult;
        return handleBothResults$shopping_rewards_prodRelease((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue(), secondDataResult, (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) both.getLeftValue(), combiner);
    }
}
