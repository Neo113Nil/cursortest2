package arrow.core.raise.context;

@kotlin.Metadata(d1 = {"arrow/core/raise/context/RaiseContextualKt__BuildersKt", "arrow/core/raise/context/RaiseContextualKt__RaiseAccumulateCombineContextKt", "arrow/core/raise/context/RaiseContextualKt__RaiseAccumulateContextKt", "arrow/core/raise/context/RaiseContextualKt__RaiseAccumulateNelContextKt", "arrow/core/raise/context/RaiseContextualKt__RaiseContextKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RaiseContextualKt {
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A accumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.accumulate(raise, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> accumulating(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.accumulating(raiseAccumulate, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.Raise<? super Error> raise, arrow.core.Either<? extends Error, ? extends A> either) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bind(raise, either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.lang.Object bind(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bind(raise, function2, continuation);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> A bind(arrow.core.raise.ResultRaise resultRaise, java.lang.Object obj) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bind(resultRaise, obj);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, arrow.core.Option<? extends A> option) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bind((arrow.core.raise.SingletonRaise) singletonRaise, (arrow.core.Option) option);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, A a2) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bind(singletonRaise, a2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllEither(raise, iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.List<? extends arrow.core.Either<? extends Error, ? extends A>> list) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllEither((arrow.core.raise.Raise) raise, (java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.Map<K, ? extends arrow.core.Either<? extends Error, ? extends A>> map) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllEither(raise, map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.Set<? extends arrow.core.Either<? extends Error, ? extends A>> set) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllEither((arrow.core.raise.Raise) raise, (java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.lang.Iterable<? extends A> iterable) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllNullable(singletonRaise, iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.List<? extends A> list) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllNullable((arrow.core.raise.SingletonRaise) singletonRaise, (java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Map<K, ? extends A> map) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllNullable(singletonRaise, map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Set<? extends A> set) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllNullable((arrow.core.raise.SingletonRaise) singletonRaise, (java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.lang.Iterable<? extends arrow.core.Option<? extends A>> iterable) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllOption(singletonRaise, iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.List<? extends arrow.core.Option<? extends A>> list) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllOption((arrow.core.raise.SingletonRaise) singletonRaise, (java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Map<K, ? extends arrow.core.Option<? extends A>> map) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllOption(singletonRaise, map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Set<? extends arrow.core.Option<? extends A>> set) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllOption((arrow.core.raise.SingletonRaise) singletonRaise, (java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<java.util.List<A>> bindAllOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.bindAllOrAccumulate(raiseAccumulate, iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.List<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.lang.Iterable<? extends kotlin.Result<? extends A>> iterable) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllResult(resultRaise, iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.List<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.List<? extends kotlin.Result<? extends A>> list) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllResult(resultRaise, (java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, A> java.util.Map<K, A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.Map<K, ? extends kotlin.Result<? extends A>> map) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllResult(resultRaise, map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.Set<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.Set<? extends kotlin.Result<? extends A>> set) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.bindAllResult(resultRaise, (java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bindNel(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.bindNel(raiseAccumulate, either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindNelOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.bindNelOrAccumulate(raiseAccumulate, either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends Error, ? extends A> either) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.bindOrAccumulate(raiseAccumulate, either);
    }

    public static final <Error, A> arrow.core.Either<Error, A> either(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__BuildersKt.either(function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> void ensure(arrow.core.raise.Raise<? super Error> raise, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.ensure(raise, z, function0);
    }

    @arrow.core.raise.RaiseDSL
    @kotlin.IgnorableReturnValue
    public static final <Error, B> B ensureNotNull(arrow.core.raise.Raise<? super Error> raise, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        return (B) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.ensureNotNull(raise, b, function0);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, B> arrow.core.raise.RaiseAccumulate.Value<B> ensureNotNullOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.ensureNotNullOrAccumulate(raiseAccumulate, b, function0);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> void ensureOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.ensureOrAccumulate(raiseAccumulate, z, function0);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.forEachAccumulating(raise, iterable, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.forEachAccumulating(raise, iterable, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Iterator<? extends A> it, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.forEachAccumulating(raise, it, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, java.util.Iterator<? extends A> it, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.forEachAccumulating(raise, it, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.forEachAccumulating(raise, sequence, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.forEachAccumulating(raise, sequence, function2, function22);
    }

    public static final void impure(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super kotlin.Unit>, kotlin.Unit> function1) {
        arrow.core.raise.context.RaiseContextualKt__BuildersKt.impure(function1);
    }

    public static final <Error, A> arrow.core.Ior<Error, A> ior(kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.IorRaise<Error>, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__BuildersKt.ior(function2, function1);
    }

    public static final <Error, A> arrow.core.Ior<arrow.core.NonEmptyList<Error>, A> iorNel(kotlin.jvm.functions.Function2<? super arrow.core.NonEmptyList<? extends Error>, ? super arrow.core.NonEmptyList<? extends Error>, ? extends arrow.core.NonEmptyList<? extends Error>> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.IorRaise<arrow.core.NonEmptyList<Error>>, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__BuildersKt.iorNel(function2, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.mapOrAccumulate(raise, iterable, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function22) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.mapOrAccumulate(raise, iterable, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.mapOrAccumulate(raise, sequence, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function22) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.mapOrAccumulate(raise, sequence, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.mapOrAccumulate(raiseAccumulate, iterable, function2);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate--YW8gn4, reason: not valid java name */
    public static final <Error, A, B> java.util.Set<B> m9718mapOrAccumulateYW8gn4(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Set<? extends A> set, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.m9725mapOrAccumulateYW8gn4(raise, set, function2);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate--YW8gn4, reason: not valid java name */
    public static final <Error, A, B> java.util.Set<B> m9719mapOrAccumulateYW8gn4(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.Set<? extends A> set, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.m9723mapOrAccumulateYW8gn4(raiseAccumulate, set, function2);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate-l8IBlHg, reason: not valid java name */
    public static final <Error, A, B> java.util.List<B> m9720mapOrAccumulatel8IBlHg(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.List<? extends A> list, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.m9726mapOrAccumulatel8IBlHg(raise, list, function2);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate-l8IBlHg, reason: not valid java name */
    public static final <Error, A, B> java.util.List<B> m9721mapOrAccumulatel8IBlHg(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.List<? extends A> list, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.m9724mapOrAccumulatel8IBlHg(raiseAccumulate, list, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapValuesOrAccumulate(arrow.core.raise.Raise<? super Error> raise, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function22) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.mapValuesOrAccumulate(raise, map, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapValuesOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.mapValuesOrAccumulate(raiseAccumulate, map, function2);
    }

    public static final <A> A nullable(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise, ? extends A> function1) {
        return (A) arrow.core.raise.context.RaiseContextualKt__BuildersKt.nullable(function1);
    }

    public static final <A> arrow.core.Option<A> option(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super arrow.core.None>, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__BuildersKt.option(function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> java.lang.Void raise(arrow.core.raise.Raise<? super Error> raise, Error error) {
        return arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.raise(raise, error);
    }

    public static final <A> java.lang.Object result(kotlin.jvm.functions.Function1<? super arrow.core.raise.ResultRaise, ? extends A> function1) {
        return arrow.core.raise.context.RaiseContextualKt__BuildersKt.result(function1);
    }

    public static final <A> A singleton(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super A>, ? extends A> function1) {
        return (A) arrow.core.raise.context.RaiseContextualKt__BuildersKt.singleton(function0, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, OtherError, A> A withError(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function1<? super OtherError, ? extends Error> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super OtherError>, ? extends A> function12) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseContextKt.withError(raise, function1, function12);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A withNel(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? extends A> function1) {
        return (A) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateContextKt.withNel(raiseAccumulate, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I, J> J zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends I> function19, kotlin.jvm.functions.Function9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function9) {
        return (J) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function18, function19, function9);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I> I zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function8) {
        return (I) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function18, function8);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H> H zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function7) {
        return (H) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function7);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G> G zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function6) {
        return (G) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function6);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F> F zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function5<? super A, ? super B, ? super C, ? super D, ? super E, ? extends F> function5) {
        return (F) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function5);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E> E zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function4<? super A, ? super B, ? super C, ? super D, ? extends E> function4) {
        return (E) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function14, function4);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D> D zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends D> function3) {
        return (D) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function13, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C> C zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function2) {
        return (C) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateNelContextKt.zipOrAccumulate(raise, function1, function12, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I, J> J zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends I> function19, kotlin.jvm.functions.Function9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function9) {
        return (J) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function18, function19, function9);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I> I zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function8) {
        return (I) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function18, function8);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H> H zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function7) {
        return (H) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function7);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G> G zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function6) {
        return (G) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function6);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F> F zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function5<? super A, ? super B, ? super C, ? super D, ? super E, ? extends F> function5) {
        return (F) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function5);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E> E zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function4<? super A, ? super B, ? super C, ? super D, ? extends E> function4) {
        return (E) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function4);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D> D zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends D> function3) {
        return (D) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function13, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C> C zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function22) {
        return (C) arrow.core.raise.context.RaiseContextualKt__RaiseAccumulateCombineContextKt.zipOrAccumulate(raise, function2, function1, function12, function22);
    }
}
