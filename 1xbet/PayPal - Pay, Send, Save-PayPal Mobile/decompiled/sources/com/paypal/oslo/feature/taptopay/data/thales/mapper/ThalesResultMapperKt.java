package com.paypal.oslo.feature.taptopay.data.thales.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "E", "Lcom/paypal/android/taptopay/domain/Result;", "Larrow/core/Either;", "toEither", "(Lcom/paypal/android/taptopay/domain/Result;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThalesResultMapperKt {
    public static final <S, E> arrow.core.Either<E, S> toEither(com.paypal.android.taptopay.domain.Result<? extends S, E> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
            return arrow.core.EitherKt.right(((com.paypal.android.taptopay.domain.Result.Success) result).getResult());
        }
        if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            return arrow.core.EitherKt.left(((com.paypal.android.taptopay.domain.Result.Failure) result).getError());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
