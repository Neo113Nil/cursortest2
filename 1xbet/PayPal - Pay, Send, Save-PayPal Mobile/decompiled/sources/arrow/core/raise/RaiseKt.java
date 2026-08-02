package arrow.core.raise;

@kotlin.Metadata(d1 = {"arrow/core/raise/RaiseKt__BuildersKt", "arrow/core/raise/RaiseKt__EffectKt", "arrow/core/raise/RaiseKt__ErrorHandlersKt", "arrow/core/raise/RaiseKt__FoldKt", "arrow/core/raise/RaiseKt__MappersKt", "arrow/core/raise/RaiseKt__RaiseAccumulateKt", "arrow/core/raise/RaiseKt__RaiseKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RaiseKt {
    public static final java.lang.String RaiseCancellationExceptionCaptured = "kotlin.coroutines.cancellation.CancellationException should never get swallowed. Always re-throw it if captured.This swallows the exception of Arrow's Raise, and leads to unexpected behavior.When working with Arrow prefer Either.catch or arrow.core.raise.catch to automatically rethrow CancellationException.";

    public static final <Error> arrow.core.raise.RaiseAccumulate<Error> IorRaiseAccumulate(arrow.core.raise.Raise<? super Error> raise, java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2) {
        return arrow.core.raise.RaiseKt__BuildersKt.IorRaiseAccumulate(raise, atomicReference, function2);
    }

    public static final <Error, A, B> B _fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends B> function12, kotlin.jvm.functions.Function1<? super Error, ? extends B> function13, kotlin.jvm.functions.Function1<? super A, ? extends B> function14) {
        return (B) arrow.core.raise.RaiseKt__FoldKt._fold(function1, function12, function13, function14);
    }

    public static final <Error, A, B> B _foldOrThrow(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends B> function12, kotlin.jvm.functions.Function1<? super A, ? extends B> function13) {
        return (B) arrow.core.raise.RaiseKt__FoldKt._foldOrThrow(function1, function12, function13);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> A _merge(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super A>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt._merge(function1);
    }

    public static final <Error, A> A accumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__RaiseAccumulateKt.accumulate(raise, function1);
    }

    public static final <Error, A, R> R accumulate(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? extends A>, ? extends R> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function12) {
        return (R) arrow.core.raise.RaiseKt__RaiseAccumulateKt.accumulate(function1, function12);
    }

    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> accumulating(arrow.core.raise.Accumulate<Error> accumulate, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.accumulating(accumulate, function1);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: catch, reason: not valid java name */
    public static final <A> A m9691catch(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.m9704catch(function0, function1);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: catch, reason: not valid java name */
    public static final <A, B> B m9692catch(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super A, ? extends B> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends B> function12) {
        return (B) arrow.core.raise.RaiseKt__RaiseKt.m9705catch(function0, function1, function12);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <Error, A> kotlin.jvm.functions.Function1<arrow.core.raise.Raise<? super Error>, A> m9693catch(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super java.lang.Throwable, ? extends A> function2) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.m9699catch(function1, function2);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <Error, A> kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> m9694catch(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.m9700catch(function2);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <Error, A> kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> m9695catch(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super arrow.core.raise.Raise<? super Error>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function3) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.m9701catch(function2, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final /* synthetic */ <T extends java.lang.Throwable, A> A catchReified(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super T, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.catchReified(function0, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final /* synthetic */ <T extends java.lang.Throwable, A, B> B catchReified(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super A, ? extends B> function1, kotlin.jvm.functions.Function1<? super T, ? extends B> function12) {
        return (B) arrow.core.raise.RaiseKt__RaiseKt.catchReified(function0, function1, function12);
    }

    public static final <Error, A> kotlin.jvm.functions.Function1<arrow.core.raise.Raise<? super Error>, A> eagerEffect(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__EffectKt.eagerEffect(function1);
    }

    public static final <Error, A> kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> effect(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2) {
        return arrow.core.raise.RaiseKt__EffectKt.effect(function2);
    }

    public static final <Error, A> arrow.core.Either<Error, A> either(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.either(function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> void ensure(arrow.core.raise.Raise<? super Error> raise, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        arrow.core.raise.RaiseKt__RaiseKt.ensure(raise, z, function0);
    }

    @arrow.core.raise.RaiseDSL
    @kotlin.IgnorableReturnValue
    public static final <Error, B> B ensureNotNull(arrow.core.raise.Raise<? super Error> raise, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        return (B) arrow.core.raise.RaiseKt__RaiseKt.ensureNotNull(raise, b, function0);
    }

    public static final <Error, B> arrow.core.raise.RaiseAccumulate.Value<B> ensureNotNullOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.ensureNotNullOrAccumulate(accumulate, b, function0);
    }

    public static final <Error> arrow.core.raise.RaiseAccumulate.Value<kotlin.Unit> ensureOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.ensureOrAccumulate(accumulate, z, function0);
    }

    public static final <Error, A, B> B fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends B> function12, kotlin.jvm.functions.Function1<? super A, ? extends B> function13) {
        return (B) arrow.core.raise.RaiseKt__FoldKt.fold(function1, function12, function13);
    }

    public static final <Error, A, B> B fold(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends B> function12, kotlin.jvm.functions.Function1<? super Error, ? extends B> function13, kotlin.jvm.functions.Function1<? super A, ? extends B> function14) {
        return (B) arrow.core.raise.RaiseKt__FoldKt.fold(function1, function12, function13, function14);
    }

    public static final <Error, A, B> java.lang.Object fold(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function23, kotlin.coroutines.Continuation<? super B> continuation) {
        return arrow.core.raise.RaiseKt__FoldKt.fold(function2, function22, function23, continuation);
    }

    public static final <Error, A, B> java.lang.Object fold(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function23, kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> function24, kotlin.coroutines.Continuation<? super B> continuation) {
        return arrow.core.raise.RaiseKt__FoldKt.fold(function2, function22, function23, function24, continuation);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, iterable, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, iterable, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Iterator<? extends A> it, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, it, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, java.util.Iterator<? extends A> it, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, it, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function2) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, sequence, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> void forEachAccumulating(arrow.core.raise.Raise<? super Error> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, kotlin.Unit> function22) {
        arrow.core.raise.RaiseKt__RaiseAccumulateKt.forEachAccumulating(raise, sequence, function2, function22);
    }

    public static final <A> A get(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<?>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__EffectKt.get(function1);
    }

    public static final <A> java.lang.Object get(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<?>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.RaiseKt__EffectKt.get(function2, continuation);
    }

    public static final <Error, A> A getOrElse(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends A> function12) {
        return (A) arrow.core.raise.RaiseKt__ErrorHandlersKt.getOrElse(function1, function12);
    }

    public static final <Error, A> java.lang.Object getOrElse(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function1<? super Error, ? extends A> function1, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.getOrElse(function2, function1, continuation);
    }

    public static final <Error, A> A getOrNull(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__MappersKt.getOrNull(function1);
    }

    public static final <Error, A> java.lang.Object getOrNull(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.getOrNull(function2, continuation);
    }

    public static final <A> A getValue(arrow.core.raise.RaiseAccumulate.Value<? extends A> value, java.lang.Void r1, kotlin.reflect.KProperty<?> kProperty) {
        return (A) arrow.core.raise.RaiseKt__RaiseAccumulateKt.getValue(value, r1, kProperty);
    }

    public static final void impure(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super kotlin.Unit>, kotlin.Unit> function1) {
        arrow.core.raise.RaiseKt__BuildersKt.impure(function1);
    }

    public static final <Error, A> arrow.core.Ior<Error, A> ior(kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.IorRaise<Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.ior(function2, function1);
    }

    public static final <Error, A> arrow.core.Ior<Error, A> iorAccumulate(kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.iorAccumulate(function2, function1);
    }

    public static final <Error, A> arrow.core.Ior<arrow.core.NonEmptyList<Error>, A> iorNel(kotlin.jvm.functions.Function2<? super arrow.core.NonEmptyList<? extends Error>, ? super arrow.core.NonEmptyList<? extends Error>, ? extends arrow.core.NonEmptyList<? extends Error>> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.IorRaise<arrow.core.NonEmptyList<Error>>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.iorNel(function2, function1);
    }

    public static final <Error, OtherError, A> kotlin.jvm.functions.Function1<arrow.core.raise.Raise<? super OtherError>, A> mapError(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends OtherError> function12) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.mapError(function1, function12);
    }

    public static final <Error, OtherError, A> kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super OtherError>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> mapError(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super OtherError>, ? extends java.lang.Object> function22) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.mapError(function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, iterable, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function22) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, iterable, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, sequence, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function22) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, sequence, function2, function22);
    }

    @kotlin.Deprecated(message = "Deprecated to allow for future alignment with stdlib Map#map returning List", replaceWith = @kotlin.ReplaceWith(expression = "mapValuesOrAccumulate(map, transform)", imports = {}))
    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, map, function2);
    }

    @kotlin.Deprecated(message = "Deprecated to allow for future alignment with stdlib Map#map returning List", replaceWith = @kotlin.ReplaceWith(expression = "mapValuesOrAccumulate(map, combine, transform)", imports = {}))
    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapOrAccumulate(arrow.core.raise.Raise<? super Error> raise, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function22) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapOrAccumulate(raise, map, function2, function22);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate--YW8gn4, reason: not valid java name */
    public static final <Error, A, B> java.util.Set<B> m9696mapOrAccumulateYW8gn4(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Set<? extends A> set, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.m9702mapOrAccumulateYW8gn4(raise, set, function2);
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate-l8IBlHg, reason: not valid java name */
    public static final <Error, A, B> java.util.List<B> m9697mapOrAccumulatel8IBlHg(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.List<? extends A> list, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.m9703mapOrAccumulatel8IBlHg(raise, list, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapValuesOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapValuesOrAccumulate(raise, map, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapValuesOrAccumulate(arrow.core.raise.Raise<? super Error> raise, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function22) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.mapValuesOrAccumulate(raise, map, function2, function22);
    }

    public static final <A> A merge(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super A>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__EffectKt.merge(function1);
    }

    public static final <A> java.lang.Object merge(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super A>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.RaiseKt__EffectKt.merge(function2, continuation);
    }

    public static final <A> A nullable(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__BuildersKt.nullable(function1);
    }

    public static final <A> arrow.core.Option<A> option(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super arrow.core.None>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.option(function1);
    }

    public static final <R> R raisedOrRethrow(java.util.concurrent.CancellationException cancellationException, arrow.core.raise.DefaultRaise defaultRaise) {
        return (R) arrow.core.raise.RaiseKt__FoldKt.raisedOrRethrow(cancellationException, defaultRaise);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A recover(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends A> function12) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.recover(function1, function12);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A recover(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends A> function12, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends A> function13) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.recover(function1, function12, function13);
    }

    public static final <Error, OtherError, A> kotlin.jvm.functions.Function1<arrow.core.raise.Raise<? super OtherError>, A> recover(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super OtherError>, ? super Error, ? extends A> function2) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.recover(function1, function2);
    }

    public static final <Error, OtherError, A> kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super OtherError>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> recover(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super arrow.core.raise.Raise<? super OtherError>, ? super Error, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function3) {
        return arrow.core.raise.RaiseKt__ErrorHandlersKt.recover(function2, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final /* synthetic */ <T extends java.lang.Throwable, Error, A> A recoverReified(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends A> function12, kotlin.jvm.functions.Function1<? super T, ? extends A> function13) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.recoverReified(function1, function12, function13);
    }

    public static final <A> java.lang.Object result(kotlin.jvm.functions.Function1<? super arrow.core.raise.ResultRaise, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__BuildersKt.result(function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> A singleton(kotlin.jvm.functions.Function0<? extends A> function0, kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super A>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__BuildersKt.singleton(function0, function1);
    }

    public static final <Error, A> arrow.core.Either<Error, A> toEither(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__MappersKt.toEither(function1);
    }

    public static final <Error, A> java.lang.Object toEither(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends Error, ? extends A>> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.toEither(function2, continuation);
    }

    public static final <Error, A> arrow.core.Ior<Error, A> toIor(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__MappersKt.toIor(function1);
    }

    public static final <Error, A> java.lang.Object toIor(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends Error, ? extends A>> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.toIor(function2, continuation);
    }

    public static final <Error, A> arrow.core.Option<A> toOption(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends arrow.core.Option<? extends A>> function12) {
        return arrow.core.raise.RaiseKt__MappersKt.toOption(function1, function12);
    }

    public static final <Error, A> java.lang.Object toOption(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super arrow.core.Option<? extends A>>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super arrow.core.Option<? extends A>> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.toOption(function2, function22, continuation);
    }

    public static final <A> java.lang.Object toResult(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super java.lang.Throwable>, ? extends A> function1) {
        return arrow.core.raise.RaiseKt__MappersKt.toResult(function1);
    }

    public static final <Error, A> java.lang.Object toResult(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super Error, ? extends kotlin.Result<? extends A>> function12) {
        return arrow.core.raise.RaiseKt__MappersKt.toResult(function1, function12);
    }

    public static final <A> java.lang.Object toResult(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super java.lang.Throwable>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.toResult(function2, continuation);
    }

    public static final <Error, A> java.lang.Object toResult(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>> continuation) {
        return arrow.core.raise.RaiseKt__MappersKt.toResult(function2, function22, continuation);
    }

    public static final <Error> arrow.core.raise.Accumulate<Error> tolerant(arrow.core.raise.Accumulate<Error> accumulate, arrow.core.raise.Raise<? super arrow.core.raise.RaiseAccumulate.Value> raise) {
        return arrow.core.raise.RaiseKt__RaiseAccumulateKt.tolerant(accumulate, raise);
    }

    public static final <Error, A> A traced(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1, kotlin.jvm.functions.Function2<? super arrow.core.raise.Trace, ? super Error, kotlin.Unit> function2) {
        return (A) arrow.core.raise.RaiseKt__FoldKt.traced(raise, function1, function2);
    }

    public static final arrow.core.raise.Traced withCause(arrow.core.raise.Traced traced, arrow.core.raise.Traced traced2) {
        return arrow.core.raise.RaiseKt__FoldKt.withCause(traced, traced2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, OtherError, A> A withError(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function1<? super OtherError, ? extends Error> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super OtherError>, ? extends A> function12) {
        return (A) arrow.core.raise.RaiseKt__RaiseKt.withError(raise, function1, function12);
    }

    public static final <Error, OtherError, A> A withErrorTraced(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super arrow.core.raise.Trace, ? super OtherError, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super OtherError>, ? extends A> function1) {
        return (A) arrow.core.raise.RaiseKt__FoldKt.withErrorTraced(raise, function2, function1);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I, J> J zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends I> function19, kotlin.jvm.functions.Function9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function9) {
        return (J) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function18, function19, function9);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I> I zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function8) {
        return (I) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function18, function8);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H> H zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function7) {
        return (H) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function17, function7);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G> G zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function6) {
        return (G) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function16, function6);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F> F zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function5<? super A, ? super B, ? super C, ? super D, ? super E, ? extends F> function5) {
        return (F) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function15, function5);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E> E zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function4<? super A, ? super B, ? super C, ? super D, ? extends E> function4) {
        return (E) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function14, function4);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D> D zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends D> function3) {
        return (D) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function13, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C> C zipOrAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function2) {
        return (C) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function1, function12, function2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I, J> J zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends I> function19, kotlin.jvm.functions.Function9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function9) {
        return (J) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function18, function19, function9);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H, I> I zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends H> function18, kotlin.jvm.functions.Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function8) {
        return (I) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function18, function8);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G, H> H zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends G> function17, kotlin.jvm.functions.Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function7) {
        return (H) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function17, function7);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F, G> G zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends F> function16, kotlin.jvm.functions.Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function6) {
        return (G) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function16, function6);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E, F> F zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends E> function15, kotlin.jvm.functions.Function5<? super A, ? super B, ? super C, ? super D, ? super E, ? extends F> function5) {
        return (F) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function15, function5);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D, E> E zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends D> function14, kotlin.jvm.functions.Function4<? super A, ? super B, ? super C, ? super D, ? extends E> function4) {
        return (E) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function14, function4);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C, D> D zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends C> function13, kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends D> function3) {
        return (D) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function13, function3);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B, C> C zipOrAccumulate(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends B> function12, kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function22) {
        return (C) arrow.core.raise.RaiseKt__RaiseAccumulateKt.zipOrAccumulate(raise, function2, function1, function12, function22);
    }
}
