package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\u000b"}, d2 = {"V", "Lcom/apollographql/apollo/api/Optional;", "fallback", "getOrElse", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "mapper", "map", "(Lcom/apollographql/apollo/api/Optional;Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/api/Optional;", "Lcom/apollographql/apollo/api/Optional$Present;", "(Lcom/apollographql/apollo/api/Optional$Present;Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/api/Optional$Present;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OptionalKt {
    public static final <V> V getOrElse(com.apollographql.apollo.api.Optional<? extends V> optional, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional instanceof com.apollographql.apollo.api.Optional.Present ? (V) ((com.apollographql.apollo.api.Optional.Present) optional).getValue() : v;
    }

    public static final <V, R> com.apollographql.apollo.api.Optional<R> map(com.apollographql.apollo.api.Optional<? extends V> optional, kotlin.jvm.functions.Function1<? super V, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (optional instanceof com.apollographql.apollo.api.Optional.Absent) {
            return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        if (optional instanceof com.apollographql.apollo.api.Optional.Present) {
            return com.apollographql.apollo.api.Optional.INSTANCE.present(function1.invoke((java.lang.Object) ((com.apollographql.apollo.api.Optional.Present) optional).getValue()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <V, R> com.apollographql.apollo.api.Optional.Present<R> map(com.apollographql.apollo.api.Optional.Present<V> present, kotlin.jvm.functions.Function1<? super V, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(present, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return com.apollographql.apollo.api.Optional.INSTANCE.present(function1.invoke(present.getValue()));
    }
}
