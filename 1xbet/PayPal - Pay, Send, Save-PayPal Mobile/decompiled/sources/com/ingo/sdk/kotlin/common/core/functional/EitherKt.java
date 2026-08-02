package com.ingo.sdk.kotlin.common.core.functional;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a[\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n0\u0003¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a1\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\b\u0002\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\b\u0002\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0017\u0010\u0016"}, d2 = {"A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lkotlin/Function1;", "f", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "fn", "flatMap", "(Lcom/ingo/sdk/kotlin/common/core/functional/Either;Lkotlin/jvm/functions/Function1;)Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "map", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getOrElse", "(Lcom/ingo/sdk/kotlin/common/core/functional/Either;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "getLeftOrThrow", "(Lcom/ingo/sdk/kotlin/common/core/functional/Either;Ljava/lang/Exception;)Ljava/lang/Object;", "getRightOrThrow"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EitherKt {
    public static final <A, B, C> kotlin.jvm.functions.Function1<A, C> c(final kotlin.jvm.functions.Function1<? super A, ? extends B> function1, final kotlin.jvm.functions.Function1<? super B, ? extends C> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.core.functional.EitherKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke(function1.invoke(obj));
                return invoke;
            }
        };
    }

    public static final <T, L, R> com.ingo.sdk.kotlin.common.core.functional.Either<L, T> flatMap(com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends R> either, kotlin.jvm.functions.Function1<? super R, ? extends com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(((com.ingo.sdk.kotlin.common.core.functional.Either.Left) either).getA());
        }
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) {
            return function1.invoke((java.lang.Object) ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) either).getB());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T, L, R> com.ingo.sdk.kotlin.common.core.functional.Either<L, T> map(com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends R> either, kotlin.jvm.functions.Function1<? super R, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return flatMap(either, c(function1, new com.ingo.sdk.kotlin.common.core.functional.EitherKt$map$1(either)));
    }

    public static final <L, R> R getOrElse(com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends R> either, R r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            return r;
        }
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) {
            return (R) ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) either).getB();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ java.lang.Object getLeftOrThrow$default(com.ingo.sdk.kotlin.common.core.functional.Either either, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            exc = new java.lang.Exception("Default Throw Exception");
        }
        return getLeftOrThrow(either, exc);
    }

    public static final <L, R> L getLeftOrThrow(com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends R> either, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            return (L) ((com.ingo.sdk.kotlin.common.core.functional.Either.Left) either).getA();
        }
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) {
            throw exc;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ java.lang.Object getRightOrThrow$default(com.ingo.sdk.kotlin.common.core.functional.Either either, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            exc = new java.lang.Exception("Default Throw Exception");
        }
        return getRightOrThrow(either, exc);
    }

    public static final <L, R> R getRightOrThrow(com.ingo.sdk.kotlin.common.core.functional.Either<? extends L, ? extends R> either, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Left) {
            throw exc;
        }
        if (either instanceof com.ingo.sdk.kotlin.common.core.functional.Either.Right) {
            return (R) ((com.ingo.sdk.kotlin.common.core.functional.Either.Right) either).getB();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
