package arrow.core;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000e\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\t*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\t*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a*\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a*\u0010\u001e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001b\u001aG\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040!\"\u0004\b\u0000\u0010\u001f\"\u0004\b\u0001\u0010 *\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0\u0004¢\u0006\u0004\b\"\u0010#\u001at\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040!\"\u0004\b\u0000\u0010\u001f\"\u0004\b\u0001\u0010 \"\u0004\b\u0002\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010%\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0\u0013H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b&\u0010'\u001a\u0080\u0001\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040.\"\u0004\b\u0000\u0010(\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000)2#\u0010-\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)¢\u0006\u0002\b,H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u001al\u00101\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040.\"\u0004\b\u0000\u0010(\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00042#\u0010-\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)¢\u0006\u0002\b,H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a%\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b5\u00106\u001a)\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000407\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b8\u00109\u001a#\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b:\u00106\u001a#\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\b<\u0010\u0010\u001a%\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\b=\u0010\u0010*\u001c\u0010>\u001a\u0004\b\u0000\u0010\u001f\"\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"E", "head", "", "t", "Larrow/core/NonEmptyList;", "nonEmptyListOf", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "nel", "(Ljava/lang/Object;)Ljava/util/List;", "", "other", "", "compareTo-8QhqC-A", "(Ljava/util/List;Ljava/util/List;)I", "compareTo", "flatten-GZgkXh4", "(Ljava/util/List;)Ljava/util/List;", "flatten", "T", "Lkotlin/Function1;", "selector", "minBy-ZALtuoE", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "minBy", "maxBy-ZALtuoE", "maxBy", "min-GZgkXh4", "(Ljava/util/List;)Ljava/lang/Comparable;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "max-GZgkXh4", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "A", "B", "Lkotlin/Pair;", "unzip-GZgkXh4", "(Ljava/util/List;)Lkotlin/Pair;", "unzip", "f", "unzip-ZALtuoE", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "Error", "Lkotlin/Function2;", "combine", "Larrow/core/raise/RaiseAccumulate;", "Lkotlin/ExtensionFunctionType;", "transform", "Larrow/core/Either;", "mapOrAccumulate-lNWZWLA", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "mapOrAccumulate", "mapOrAccumulate-ZALtuoE", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "", "toNonEmptyListOrNull", "(Ljava/lang/Iterable;)Ljava/util/List;", "Larrow/core/Option;", "toNonEmptyListOrNone", "(Ljava/lang/Iterable;)Larrow/core/Option;", "toNonEmptyListOrThrow", "", "wrapAsNonEmptyListOrThrow", "wrapAsNonEmptyListOrNull", "Nel"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NonEmptyListKt {
    public static final <E> java.util.List<E> nonEmptyListOf(E e, E... eArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        return arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(e), (java.lang.Object[]) eArr));
    }

    public static final <E> java.util.List<E> nel(E e) {
        return arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(e));
    }

    /* renamed from: compareTo-8QhqC-A, reason: not valid java name */
    public static final <E extends java.lang.Comparable<? super E>> int m9626compareTo8QhqCA(java.util.List<? extends E> list, java.util.List<? extends E> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        return arrow.core.IterableKt.compareTo(list, list2);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [E] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: minBy-ZALtuoE, reason: not valid java name */
    public static final <E, T extends java.lang.Comparable<? super T>> E m9633minByZALtuoE(java.util.List<? extends E> list, kotlin.jvm.functions.Function1<? super E, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        ?? r0 = (java.lang.Object) it.next();
        if (!it.hasNext()) {
            return r0;
        }
        T invoke = function1.invoke(r0);
        do {
            java.lang.Object obj = (java.lang.Object) it.next();
            T invoke2 = function1.invoke(obj);
            r0 = r0;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                r0 = (E) obj;
            }
        } while (it.hasNext());
        return (E) r0;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [E] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: maxBy-ZALtuoE, reason: not valid java name */
    public static final <E, T extends java.lang.Comparable<? super T>> E m9631maxByZALtuoE(java.util.List<? extends E> list, kotlin.jvm.functions.Function1<? super E, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        ?? r0 = (java.lang.Object) it.next();
        if (!it.hasNext()) {
            return r0;
        }
        T invoke = function1.invoke(r0);
        do {
            java.lang.Object obj = (java.lang.Object) it.next();
            T invoke2 = function1.invoke(obj);
            r0 = r0;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                r0 = (E) obj;
            }
        } while (it.hasNext());
        return (E) r0;
    }

    /* renamed from: min-GZgkXh4, reason: not valid java name */
    public static final <E extends java.lang.Comparable<? super E>> E m9632minGZgkXh4(java.util.List<? extends E> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return (E) kotlin.collections.CollectionsKt.minOrThrow((java.lang.Iterable<java.lang.Double>) list);
    }

    /* renamed from: max-GZgkXh4, reason: not valid java name */
    public static final <E extends java.lang.Comparable<? super E>> E m9630maxGZgkXh4(java.util.List<? extends E> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return (E) kotlin.collections.CollectionsKt.maxOrThrow((java.lang.Iterable<java.lang.Double>) list);
    }

    /* renamed from: unzip-ZALtuoE, reason: not valid java name */
    public static final <A, B, E> kotlin.Pair<arrow.core.NonEmptyList<A>, arrow.core.NonEmptyList<B>> m9635unzipZALtuoE(java.util.List<? extends E> list, kotlin.jvm.functions.Function1<? super E, ? extends kotlin.Pair<? extends A, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int m9584getSizeimpl = arrow.core.NonEmptyList.m9584getSizeimpl(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(m9584getSizeimpl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m9584getSizeimpl);
        java.util.Iterator m9589iteratorimpl = arrow.core.NonEmptyList.m9589iteratorimpl(list);
        while (m9589iteratorimpl.hasNext()) {
            kotlin.Pair<? extends A, ? extends B> invoke = function1.invoke((java.lang.Object) m9589iteratorimpl.next());
            A component1 = invoke.component1();
            B component2 = invoke.component2();
            arrayList.add(component1);
            arrayList2.add(component2);
        }
        return kotlin.TuplesKt.to(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList2)));
    }

    /* renamed from: mapOrAccumulate-lNWZWLA, reason: not valid java name */
    public static final <Error, E, T> arrow.core.Either<Error, arrow.core.NonEmptyList<T>> m9629mapOrAccumulatelNWZWLA(java.util.List<? extends E> list, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super E, ? extends T> function22) {
        arrow.core.Either.Left left;
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        java.util.List<? extends E> list2 = list;
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(arrow.core.IterableKt.collectionSizeOrDefault(list2, 10));
            arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise3);
                for (T t : list2) {
                    arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(z);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(z);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise5), defaultRaise7, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise7));
                            boolean hasErrors = raiseAccumulate3.hasErrors();
                            T invoke = function22.invoke(raiseAccumulate3, t);
                            if (!hasErrors) {
                                createListBuilder.add(invoke);
                            }
                            raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                            defaultRaise6.complete();
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            defaultRaise6.complete();
                            raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise6)).getAll());
                        } catch (java.lang.Throwable th) {
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                        defaultRaise4.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise4.complete();
                        raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise4);
                    } catch (java.lang.Throwable th2) {
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                    }
                    z = false;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                    latestError.getValue();
                    throw new kotlin.KotlinNothingValueException();
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                defaultRaise.complete();
                left = new arrow.core.Either.Right(build);
            } catch (arrow.core.raise.RaiseCancellationException e3) {
                defaultRaise3.complete();
                java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise3)).getAll()).iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Error next = it.next();
                while (it.hasNext()) {
                    next = function2.invoke(next, it.next());
                }
                defaultRaise2.raise(next);
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.Throwable th3) {
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
            }
        } catch (arrow.core.raise.RaiseCancellationException e4) {
            defaultRaise.complete();
            left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise));
        } finally {
            defaultRaise.complete();
            java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        if (left instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl((java.util.List) ((arrow.core.Either.Right) left).getValue())));
        }
        if (left instanceof arrow.core.Either.Left) {
            return left;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: mapOrAccumulate-ZALtuoE, reason: not valid java name */
    public static final <Error, E, T> arrow.core.Either<arrow.core.NonEmptyList<Error>, arrow.core.NonEmptyList<T>> m9628mapOrAccumulateZALtuoE(java.util.List<? extends E> list, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super E, ? extends T> function2) {
        arrow.core.Either.Left left;
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.List<? extends E> list2 = list;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(arrow.core.IterableKt.collectionSizeOrDefault(list2, 10));
            arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise);
            for (T t : list2) {
                arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise3), defaultRaise5, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise5));
                        boolean hasErrors = raiseAccumulate3.hasErrors();
                        T invoke = function2.invoke(raiseAccumulate3, t);
                        if (!hasErrors) {
                            createListBuilder.add(invoke);
                        }
                        raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise4.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise4.complete();
                        raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4)).getAll());
                    } catch (java.lang.Throwable th) {
                        defaultRaise4.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    defaultRaise2.complete();
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    defaultRaise2.complete();
                    raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise2);
                } catch (java.lang.Throwable th2) {
                    defaultRaise2.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                latestError.getValue();
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
            defaultRaise.complete();
            left = new arrow.core.Either.Right(build);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            defaultRaise.complete();
            left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise));
        } catch (java.lang.Throwable th3) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
        }
        if (left instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl((java.util.List) ((arrow.core.Either.Right) left).getValue())));
        }
        if (left instanceof arrow.core.Either.Left) {
            return left;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> java.util.List<T> toNonEmptyListOrNull(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return wrapAsNonEmptyListOrNull(kotlin.collections.CollectionsKt.toList(iterable));
    }

    public static final <T> arrow.core.Option<arrow.core.NonEmptyList<T>> toNonEmptyListOrNone(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.List nonEmptyListOrNull = toNonEmptyListOrNull(iterable);
        return arrow.core.OptionKt.toOption(nonEmptyListOrNull != null ? arrow.core.NonEmptyList.m9567boximpl(nonEmptyListOrNull) : null);
    }

    public static final <T> java.util.List<T> toNonEmptyListOrThrow(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return wrapAsNonEmptyListOrThrow(kotlin.collections.CollectionsKt.toList(iterable));
    }

    public static final <T> java.util.List<T> wrapAsNonEmptyListOrThrow(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(list);
    }

    public static final <T> java.util.List<T> wrapAsNonEmptyListOrNull(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(list);
    }

    /* renamed from: flatten-GZgkXh4, reason: not valid java name */
    public static final <E> java.util.List<E> m9627flattenGZgkXh4(java.util.List<? extends arrow.core.NonEmptyList<? extends E>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) it.next()).getAll()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    /* renamed from: unzip-GZgkXh4, reason: not valid java name */
    public static final <A, B> kotlin.Pair<arrow.core.NonEmptyList<A>, arrow.core.NonEmptyList<B>> m9634unzipGZgkXh4(java.util.List<? extends kotlin.Pair<? extends A, ? extends B>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        int m9584getSizeimpl = arrow.core.NonEmptyList.m9584getSizeimpl(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(m9584getSizeimpl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m9584getSizeimpl);
        java.util.Iterator m9589iteratorimpl = arrow.core.NonEmptyList.m9589iteratorimpl(list);
        while (m9589iteratorimpl.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) m9589iteratorimpl.next();
            java.lang.Object component1 = pair.component1();
            java.lang.Object component2 = pair.component2();
            arrayList.add(component1);
            arrayList2.add(component2);
        }
        return kotlin.TuplesKt.to(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList2)));
    }
}
