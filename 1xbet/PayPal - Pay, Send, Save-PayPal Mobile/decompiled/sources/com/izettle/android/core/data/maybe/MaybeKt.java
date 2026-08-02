package com.izettle.android.core.data.maybe;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aK\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0013\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "T1", "Lcom/izettle/android/core/data/maybe/Maybe;", "Lkotlin/Function1;", "mapper", "flatMap", "(Lcom/izettle/android/core/data/maybe/Maybe;Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/core/data/maybe/Maybe;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "ifSome", "Lkotlin/Function0;", "ifEmpty", "fold", "(Lcom/izettle/android/core/data/maybe/Maybe;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lcom/izettle/android/core/data/maybe/Maybe;)Ljava/lang/Object;", "Lcom/izettle/android/core/data/maybe/Just;", "just", "(Ljava/lang/Object;)Lcom/izettle/android/core/data/maybe/Just;", "map", "orNull"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MaybeKt {
    public static final <T, T1> com.izettle.android.core.data.maybe.Maybe<T1> map(com.izettle.android.core.data.maybe.Maybe<? extends T> maybe, kotlin.jvm.functions.Function1<? super T, ? extends T1> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maybe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (maybe instanceof com.izettle.android.core.data.maybe.Just) {
            return new com.izettle.android.core.data.maybe.Just(function1.invoke((java.lang.Object) ((com.izettle.android.core.data.maybe.Just) maybe).getValue()));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(maybe, com.izettle.android.core.data.maybe.None.INSTANCE)) {
            return com.izettle.android.core.data.maybe.None.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T, T1> com.izettle.android.core.data.maybe.Maybe<T1> flatMap(com.izettle.android.core.data.maybe.Maybe<? extends T> maybe, kotlin.jvm.functions.Function1<? super T, ? extends com.izettle.android.core.data.maybe.Maybe<? extends T1>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maybe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (maybe instanceof com.izettle.android.core.data.maybe.Just) {
            return function1.invoke((java.lang.Object) ((com.izettle.android.core.data.maybe.Just) maybe).getValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(maybe, com.izettle.android.core.data.maybe.None.INSTANCE)) {
            return com.izettle.android.core.data.maybe.None.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> T orNull(com.izettle.android.core.data.maybe.Maybe<? extends T> maybe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maybe, "");
        if (maybe instanceof com.izettle.android.core.data.maybe.Just) {
            return (T) ((com.izettle.android.core.data.maybe.Just) maybe).getValue();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(maybe, com.izettle.android.core.data.maybe.None.INSTANCE)) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> T get(com.izettle.android.core.data.maybe.Maybe<? extends T> maybe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maybe, "");
        if (maybe instanceof com.izettle.android.core.data.maybe.Just) {
            return (T) ((com.izettle.android.core.data.maybe.Just) maybe).getValue();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(maybe, com.izettle.android.core.data.maybe.None.INSTANCE)) {
            throw new java.lang.IllegalArgumentException("'None' doesn't have a value");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T, R> R fold(com.izettle.android.core.data.maybe.Maybe<? extends T> maybe, kotlin.jvm.functions.Function1<? super T, ? extends R> function1, kotlin.jvm.functions.Function0<? extends R> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maybe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (maybe instanceof com.izettle.android.core.data.maybe.Just) {
            return function1.invoke((java.lang.Object) ((com.izettle.android.core.data.maybe.Just) maybe).getValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(maybe, com.izettle.android.core.data.maybe.None.INSTANCE)) {
            return function0.invoke();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> com.izettle.android.core.data.maybe.Just<T> just(T t) {
        return new com.izettle.android.core.data.maybe.Just<>(t);
    }
}
