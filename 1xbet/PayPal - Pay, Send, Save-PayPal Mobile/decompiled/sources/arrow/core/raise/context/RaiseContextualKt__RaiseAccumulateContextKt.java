package arrow.core.raise.context;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0090\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00032-\u0010\t\u001a)\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u009d\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\r2-\u0010\t\u001a)\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u009d\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00102-\u0010\t\u001a)\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a®\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001429\u0010\t\u001a5\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0015\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00010\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u0005ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001am\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00028\u00010\u0018j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0019H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008d\u0001\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000123\u0010\t\u001a/\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r`\u001e\u0012\u0004\u0012\u00028\u00010\u001c¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001f\u0010 \u001a]\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\"\u0010#\u001ai\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0!\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u0003H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b$\u0010%\u001as\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010!\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00028\u00010\u0018j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0019H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b&\u0010#\u001ah\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b+\u0010,\u001az\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010!\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020-2\b\u0010\t\u001a\u0004\u0018\u00018\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b.\u0010/\u001a\u0087\u0001\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010!\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012'\u0010\t\u001a#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0004\u0012\u00028\u00010\u001c¢\u0006\u0002\b\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005j\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b0\u00101*\u001c\u00102\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Error", "A", "B", "", "Larrow/core/raise/RaiseAccumulate;", "Larrow/core/raise/context/RaiseAccumulate;", "raise", "Lkotlin/Function2;", "Lkotlin/ContextFunctionTypeParams;", "p0", "", "mapOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Larrow/core/NonEmptyList;", "mapOrAccumulate-l8IBlHg", "(Larrow/core/raise/RaiseAccumulate;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Larrow/core/NonEmptySet;", "mapOrAccumulate--YW8gn4", "(Larrow/core/raise/RaiseAccumulate;Ljava/util/Set;Lkotlin/jvm/functions/Function2;)Ljava/util/Set;", "K", "", "", "mapValuesOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "Larrow/core/Either;", "Larrow/core/EitherNel;", "bindNel", "(Larrow/core/raise/RaiseAccumulate;Larrow/core/Either;)Ljava/lang/Object;", "Lkotlin/Function1;", "Larrow/core/raise/Raise;", "Larrow/core/raise/context/Raise;", "withNel", "(Larrow/core/raise/RaiseAccumulate;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Larrow/core/raise/RaiseAccumulate$Value;", "bindOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;Larrow/core/Either;)Larrow/core/raise/RaiseAccumulate$Value;", "bindAllOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;Ljava/lang/Iterable;)Larrow/core/raise/RaiseAccumulate$Value;", "bindNelOrAccumulate", "", "Lkotlin/Function0;", "p1", "", "ensureOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;ZLkotlin/jvm/functions/Function0;)V", "", "ensureNotNullOrAccumulate", "(Larrow/core/raise/RaiseAccumulate;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Larrow/core/raise/RaiseAccumulate$Value;", "accumulating", "(Larrow/core/raise/RaiseAccumulate;Lkotlin/jvm/functions/Function1;)Larrow/core/raise/RaiseAccumulate$Value;", "RaiseAccumulate"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/raise/context/RaiseContextualKt")
/* loaded from: classes7.dex */
final /* synthetic */ class RaiseContextualKt__RaiseAccumulateContextKt {
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bindNel(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return (A) raiseAccumulate.bindNel(either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends Error, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return raiseAccumulate.bindOrAccumulate(either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<java.util.List<A>> bindAllOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return raiseAccumulate.bindAllOrAccumulate(iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> bindNelOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return raiseAccumulate.bindNelOrAccumulate(either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A, B> java.util.List<B> mapOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.lang.Iterable<? extends A> iterable, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> raise = raiseAccumulate.getRaise();
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(arrow.core.IterableKt.collectionSizeOrDefault(iterable, 10));
        arrow.core.raise.RaiseAccumulate raiseAccumulate2 = new arrow.core.raise.RaiseAccumulate(raise);
        for (A a2 : iterable) {
            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = raiseAccumulate2;
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate4 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4));
                    boolean hasErrors = raiseAccumulate4.hasErrors();
                    B invoke = function2.invoke(raiseAccumulate4, a2);
                    if (!hasErrors) {
                        createListBuilder.add(invoke);
                    }
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = raiseAccumulate3.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
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
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (!raiseAccumulate2.hasErrors() || (latestError = raiseAccumulate2.getLatestError()) == null) {
            return kotlin.collections.CollectionsKt.build(createListBuilder);
        }
        latestError.getValue();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate-l8IBlHg, reason: not valid java name */
    public static final <Error, A, B> java.util.List<B> m9724mapOrAccumulatel8IBlHg(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.List<? extends A> list, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> raise = raiseAccumulate.getRaise();
        java.util.List<? extends A> list2 = list;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(arrow.core.IterableKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        arrow.core.raise.RaiseAccumulate raiseAccumulate2 = new arrow.core.raise.RaiseAccumulate(raise);
        while (it.hasNext()) {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) it.next();
            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = raiseAccumulate2;
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate4 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4));
                    boolean hasErrors = raiseAccumulate4.hasErrors();
                    B invoke = function2.invoke(raiseAccumulate4, aMEXKernel);
                    if (!hasErrors) {
                        createListBuilder.add(invoke);
                    }
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = raiseAccumulate3.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
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
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (!raiseAccumulate2.hasErrors() || (latestError = raiseAccumulate2.getLatestError()) == null) {
            return arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.build(createListBuilder));
        }
        latestError.getValue();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    /* renamed from: mapOrAccumulate--YW8gn4, reason: not valid java name */
    public static final <Error, A, B> java.util.Set<B> m9723mapOrAccumulateYW8gn4(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.Set<? extends A> set, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> raise = raiseAccumulate.getRaise();
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder(arrow.core.NonEmptySet.m9648getSizeimpl(set));
        java.util.Iterator m9651iteratorimpl = arrow.core.NonEmptySet.m9651iteratorimpl(set);
        arrow.core.raise.RaiseAccumulate raiseAccumulate2 = new arrow.core.raise.RaiseAccumulate(raise);
        while (m9651iteratorimpl.hasNext()) {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) m9651iteratorimpl.next();
            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = raiseAccumulate2;
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate4 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4));
                    boolean hasErrors = raiseAccumulate4.hasErrors();
                    B invoke = function2.invoke(raiseAccumulate4, aMEXKernel);
                    if (!hasErrors) {
                        createSetBuilder.add(invoke);
                    }
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = raiseAccumulate3.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
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
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (!raiseAccumulate2.hasErrors() || (latestError = raiseAccumulate2.getLatestError()) == null) {
            return arrow.core.NonEmptySetKt.wrapAsNonEmptySetOrThrow(kotlin.collections.SetsKt.build(createSetBuilder));
        }
        latestError.getValue();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, Error, A, B> java.util.Map<K, B> mapValuesOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> raise = raiseAccumulate.getRaise();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        arrow.core.raise.RaiseAccumulate raiseAccumulate2 = new arrow.core.raise.RaiseAccumulate(raise);
        for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = raiseAccumulate2;
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate4 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4));
                    boolean hasErrors = raiseAccumulate4.hasErrors();
                    java.util.Map.Entry<K, ? extends A> entry2 = entry;
                    B invoke = function2.invoke(raiseAccumulate4, entry2);
                    if (!hasErrors) {
                        createMapBuilder.put(entry2.getKey(), invoke);
                    }
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise3.complete();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise3.complete();
                    raisedOrRethrow = raiseAccumulate3.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
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
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (!raiseAccumulate2.hasErrors() || (latestError = raiseAccumulate2.getLatestError()) == null) {
            return kotlin.collections.MapsKt.build(createMapBuilder);
        }
        latestError.getValue();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A withNel(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(raiseAccumulate.getRaise());
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> void ensureOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate2 = raiseAccumulate;
        if (z) {
            new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
        } else {
            raiseAccumulate2.accumulate(function0.invoke());
        }
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, B> arrow.core.raise.RaiseAccumulate.Value<B> ensureNotNullOrAccumulate(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return b != null ? new arrow.core.raise.RaiseAccumulate.Ok(b) : raiseAccumulate.accumulate(function0.invoke());
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> arrow.core.raise.RaiseAccumulate.Value<A> accumulating(arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate, kotlin.jvm.functions.Function1<? super arrow.core.raise.RaiseAccumulate<Error>, ? extends A> function1) {
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raiseAccumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        arrow.core.raise.RaiseAccumulate<Error> raiseAccumulate2 = raiseAccumulate;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise3;
                raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(function1.invoke(new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise2), defaultRaise4, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise4))));
                defaultRaise3.complete();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise3.complete();
                raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3)).getAll());
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
}
