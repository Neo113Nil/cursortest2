package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00120\u0004\"\u0004\b\u0001\u0010\r*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\r*$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00028\u00010\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J9\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048'X¦\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\""}, d2 = {"Larrow/core/raise/Accumulate;", "Error", "", "error", "Larrow/core/raise/RaiseAccumulate$Value;", "", "accumulate", "(Ljava/lang/Object;)Larrow/core/raise/RaiseAccumulate$Value;", "Larrow/core/NonEmptyList;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "accumulateAll-GZgkXh4", "(Ljava/util/List;)Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll", "A", "Larrow/core/Either;", "bindOrAccumulate", "(Larrow/core/Either;)Larrow/core/raise/RaiseAccumulate$Value;", "", "", "bindAllOrAccumulate", "(Ljava/lang/Iterable;)Larrow/core/raise/RaiseAccumulate$Value;", "Larrow/core/EitherNel;", "bindNelOrAccumulate", "Lkotlin/Function1;", "recover", "getOrAccumulate", "(Larrow/core/Either;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "getHasAccumulatedErrors", "()Z", "getHasAccumulatedErrors$annotations", "()V", "hasAccumulatedErrors", "getLatestError", "()Larrow/core/raise/RaiseAccumulate$Value;", "getLatestError$annotations", "latestError"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Accumulate<Error> {
    @kotlin.IgnorableReturnValue
    arrow.core.raise.RaiseAccumulate.Value accumulate(Error error);

    /* renamed from: accumulateAll-GZgkXh4, reason: not valid java name */
    arrow.core.raise.RaiseAccumulate.Value mo9683accumulateAllGZgkXh4(java.util.List<? extends Error> errors);

    <A> arrow.core.raise.RaiseAccumulate.Value<java.util.List<A>> bindAllOrAccumulate(java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable);

    <A> arrow.core.raise.RaiseAccumulate.Value<A> bindNelOrAccumulate(arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either);

    <A> arrow.core.raise.RaiseAccumulate.Value<A> bindOrAccumulate(arrow.core.Either<? extends Error, ? extends A> either);

    /* renamed from: getHasAccumulatedErrors */
    boolean hasErrors();

    arrow.core.raise.RaiseAccumulate.Value getLatestError();

    <A> A getOrAccumulate(arrow.core.Either<? extends Error, ? extends A> either, kotlin.jvm.functions.Function1<? super Error, ? extends A> function1);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getHasAccumulatedErrors$annotations() {
        }

        public static /* synthetic */ void getLatestError$annotations() {
        }

        public static <Error> boolean getHasAccumulatedErrors(arrow.core.raise.Accumulate<Error> accumulate) {
            return accumulate.getLatestError() != null;
        }

        @kotlin.IgnorableReturnValue
        public static <Error> arrow.core.raise.RaiseAccumulate.Value accumulate(arrow.core.raise.Accumulate<Error> accumulate, Error error) {
            return accumulate.mo9683accumulateAllGZgkXh4(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(error)));
        }

        public static <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, arrow.core.Either<? extends Error, ? extends A> either) {
            arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(accumulate, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4)).bind(either));
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = accumulate.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
                } catch (java.lang.Throwable th) {
                    defaultRaise3.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                defaultRaise.complete();
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                defaultRaise.complete();
                raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise);
            } catch (java.lang.Throwable th2) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
            }
            return (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow;
        }

        public static <Error, A> arrow.core.raise.RaiseAccumulate.Value<java.util.List<A>> bindAllOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
            arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(accumulate, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4)).bindAll(iterable));
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = accumulate.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
                } catch (java.lang.Throwable th) {
                    defaultRaise3.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                defaultRaise.complete();
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                defaultRaise.complete();
                raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise);
            } catch (java.lang.Throwable th2) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
            }
            return (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow;
        }

        public static <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindNelOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
            arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(accumulate, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4)).bindNel(either));
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = accumulate.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
                } catch (java.lang.Throwable th) {
                    defaultRaise3.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                defaultRaise.complete();
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                defaultRaise.complete();
                raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise);
            } catch (java.lang.Throwable th2) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
            }
            return (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <Error, A> A getOrAccumulate(arrow.core.raise.Accumulate<Error> accumulate, arrow.core.Either<? extends Error, ? extends A> either, kotlin.jvm.functions.Function1<? super Error, ? extends A> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            if (either instanceof arrow.core.Either.Left) {
                a.d dVar = (java.lang.Object) ((arrow.core.Either.Left) either).getValue();
                accumulate.accumulate(dVar);
                return function1.invoke(dVar);
            }
            if (either instanceof arrow.core.Either.Right) {
                return (A) ((arrow.core.Either.Right) either).getValue();
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
