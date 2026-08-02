package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\b\u0000\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0001\u0010\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u001eH\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0 H\u0007¢\u0006\u0004\b\u001c\u0010!J%\u0010\"\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0007¢\u0006\u0004\b\"\u0010#JA\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010%*\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001a0&¢\u0006\u0004\b\u001c\u0010'Jh\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0002\b(2\u0017\u0010\u0016\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b*\u0012\u0004\u0012\u00028\u00010\u0015H\u0087\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u0016\u0010+JG\u0010\"\u001a\u00028\u0001\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0015j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`,¢\u0006\u0002\b(H\u0097\u0001¢\u0006\u0004\b\"\u0010-JY\u0010\"\u001a\u00028\u0001\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`/¢\u0006\u0002\b(H\u0097A¢\u0006\u0004\b\"\u00100J,\u0010\"\u001a\u00028\u0001\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0097\u0001¢\u0006\u0004\b\"\u00101J8\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0019H\u0097\u0001¢\u0006\u0004\b2\u0010\u001dJP\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&\"\n\b\u0001\u0010$*\u0004\u0018\u00010\u0006\"\n\b\u0002\u0010\u0013*\u0004\u0018\u00010\u0006*\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00140&H\u0096\u0001¢\u0006\u0004\b2\u0010'J8\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u001eH\u0097\u0001¢\u0006\u0004\b3\u0010\u001fJ8\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140 H\u0097\u0001¢\u0006\u0004\b4\u0010!JG\u00105\u001a\u00028\u0001\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0015j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`,¢\u0006\u0002\b(H\u0096\u0001¢\u0006\u0004\b5\u0010-JY\u00105\u001a\u00028\u0001\"\n\b\u0001\u0010\u0013*\u0004\u0018\u00010\u0006*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`/¢\u0006\u0002\b(H\u0096A¢\u0006\u0004\b5\u00100J\u0018\u0010\t\u001a\u0002072\u0006\u00106\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\t\u00108R2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R(\u0010@\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Larrow/core/raise/IorRaise;", "Error", "Larrow/core/raise/Raise;", "Lkotlin/Function2;", "combineError", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Larrow/atomic/getHighResolutionOutputSizeshNQ4ISI;", "state", "raise", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/atomic/AtomicReference;Larrow/core/raise/Raise;)V", "e", "combine", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "accumulate", "(Ljava/lang/Object;)V", "A", "Larrow/core/Either;", "Lkotlin/Function1;", "recover", "getOrAccumulate", "(Larrow/core/Either;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "Larrow/core/Ior;", "", "bindAllIor", "(Ljava/lang/Iterable;)Ljava/util/List;", "Larrow/core/NonEmptyList;", "(Ljava/util/List;)Ljava/util/List;", "Larrow/core/NonEmptySet;", "(Ljava/util/Set;)Ljava/util/Set;", "bind", "(Larrow/core/Ior;)Ljava/lang/Object;", "K", "V", "", "(Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/ParameterName;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Larrow/core/raise/EagerEffect;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "Larrow/core/raise/Effect;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Larrow/core/Either;)Ljava/lang/Object;", "bindAll", "bindAll-vcjLgH4", "bindAll-1TN0_VU", "invoke", "r", "", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/jvm/functions/Function2;", "getCombineError", "()Lkotlin/jvm/functions/Function2;", "getCombineError$annotations", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Larrow/core/raise/Raise;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IorRaise<Error> implements arrow.core.raise.Raise<Error> {
    private final kotlin.jvm.functions.Function2<Error, Error, Error> combineError;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoSizes;
    private final arrow.core.raise.Raise<Error> getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getCombineError$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IorRaise(kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, arrow.core.raise.Raise<? super Error> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.combineError = function2;
        this.getHighSpeedVideoSizes = atomicReference;
        this.getHighSpeedVideoFpsRangesFor = raise;
    }

    public final kotlin.jvm.functions.Function2<Error, Error, Error> getCombineError() {
        return this.combineError;
    }

    @kotlin.IgnorableReturnValue
    public final Error combine(Error e) {
        java.lang.Object value;
        Error error;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoSizes;
        do {
            value = arrow.atomic.AtomicKt.getValue(atomicReference);
            java.lang.Object value2 = arrow.atomic.AtomicKt.getValue(atomicReference);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
            error = value2 == arrow.core.EmptyValue.INSTANCE ? e : (Error) this.combineError.invoke(value2, e);
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, value, error));
        return error;
    }

    @arrow.core.raise.RaiseDSL
    public final void accumulate(Error value) {
        bind(new arrow.core.Ior.Both(value, kotlin.Unit.INSTANCE));
    }

    @arrow.core.raise.RaiseDSL
    public final <A> java.util.Set<A> bindAllIor(java.util.Set<? extends arrow.core.Ior<? extends Error, ? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return arrow.core.NonEmptyList.m9606toNonEmptySet5sCjGKo(arrow.core.NonEmptySet.m9653map0xjo5U(set, new kotlin.jvm.functions.Function1() { // from class: arrow.core.raise.IorRaise$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.raise.IorRaise.m9686$r8$lambda$YkRI2lQvQLwgRVHhBxI2Y3SjLo(arrow.core.raise.IorRaise.this, (arrow.core.Ior) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> A bind(arrow.core.Ior<? extends Error, ? extends A> ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Left) {
            raise(((arrow.core.Ior.Left) ior).getValue());
            throw new kotlin.KotlinNothingValueException();
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return (A) ((arrow.core.Ior.Right) ior).getValue();
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        combine(both.getLeftValue());
        return (A) both.getRightValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> A recover(kotlin.jvm.functions.Function1<? super arrow.core.raise.IorRaise<Error>, ? extends A> block, kotlin.jvm.functions.Function1<? super Error, ? extends A> recover) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recover, "");
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            try {
                A invoke = block.invoke(new arrow.core.raise.IorRaise(getCombineError(), atomicReference, defaultRaise));
                defaultRaise.complete();
                return invoke;
            } finally {
                java.lang.Object obj = atomicReference.get();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, arrow.core.EmptyValue.INSTANCE)) {
                    combine(obj);
                }
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return recover.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @arrow.core.raise.RaiseDSL
    public final <A> A getOrAccumulate(arrow.core.Either<? extends Error, ? extends A> either, kotlin.jvm.functions.Function1<? super Error, ? extends A> function1) {
        arrow.core.Ior.Both both;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof arrow.core.Either.Right) {
            both = new arrow.core.Ior.Right(((arrow.core.Either.Right) either).getValue());
        } else if (either instanceof arrow.core.Either.Left) {
            a.d dVar = (java.lang.Object) ((arrow.core.Either.Left) either).getValue();
            both = new arrow.core.Ior.Both(dVar, function1.invoke(dVar));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return (A) bind(both);
    }

    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllIor(java.lang.Iterable<? extends arrow.core.Ior<? extends Error, ? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator<? extends arrow.core.Ior<? extends Error, ? extends A>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bind(it.next()));
        }
        return arrayList;
    }

    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllIor(java.util.List<? extends arrow.core.Ior<? extends Error, ? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends arrow.core.Ior<? extends Error, ? extends A>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(bind((arrow.core.Ior) it.next()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> java.util.Map<K, V> bindAllIor(java.util.Map<K, ? extends arrow.core.Ior<? extends Error, ? extends V>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), bind((arrow.core.Ior) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: $r8$lambda$YkRI2lQvQLwgRVHh-BxI2Y3SjLo, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9686$r8$lambda$YkRI2lQvQLwgRVHhBxI2Y3SjLo(arrow.core.raise.IorRaise iorRaise, arrow.core.Ior ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        return iorRaise.bind(ior);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final java.lang.Void raise(Error r) {
        this.getHighSpeedVideoFpsRangesFor.raise(r);
        return null;
    }

    @Override // arrow.core.raise.Raise
    public final <A> java.lang.Object invoke(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(function2, continuation);
    }

    @Override // arrow.core.raise.Raise
    public final <A> A invoke(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return (A) this.getHighSpeedVideoFpsRangesFor.invoke(function1);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-vcjLgH4 */
    public final <A> java.util.List<A> mo9685bindAllvcjLgH4(java.util.List<? extends arrow.core.Either<? extends Error, ? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return this.getHighSpeedVideoFpsRangesFor.mo9685bindAllvcjLgH4(list);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-1TN0_VU */
    public final <A> java.util.Set<A> mo9684bindAll1TN0_VU(java.util.Set<? extends arrow.core.Either<? extends Error, ? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return this.getHighSpeedVideoFpsRangesFor.mo9684bindAll1TN0_VU(set);
    }

    @Override // arrow.core.raise.Raise
    public final <K, A> java.util.Map<K, A> bindAll(java.util.Map<K, ? extends arrow.core.Either<? extends Error, ? extends A>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return this.getHighSpeedVideoFpsRangesFor.bindAll(map);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAll(java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return this.getHighSpeedVideoFpsRangesFor.bindAll(iterable);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final <A> java.lang.Object bind(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.bind(function2, continuation);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final <A> A bind(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super Error>, ? extends A> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return (A) this.getHighSpeedVideoFpsRangesFor.bind(function1);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final <A> A bind(arrow.core.Either<? extends Error, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return (A) this.getHighSpeedVideoFpsRangesFor.bind(either);
    }
}
