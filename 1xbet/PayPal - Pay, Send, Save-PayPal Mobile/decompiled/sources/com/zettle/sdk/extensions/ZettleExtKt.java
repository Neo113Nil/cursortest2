package com.zettle.sdk.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"T", "", "E", "Lcom/izettle/android/core/data/result/Result;", "Lkotlin/Result;", "toKotlinResult", "(Lcom/izettle/android/core/data/result/Result;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleExtKt {
    public static final <T, E extends java.lang.Throwable> java.lang.Object toKotlinResult(com.izettle.android.core.data.result.Result<? extends T, ? extends E> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.izettle.android.core.data.result.Success) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(((com.izettle.android.core.data.result.Success) result).getValue());
        }
        if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure((java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) result).getError()));
    }
}
