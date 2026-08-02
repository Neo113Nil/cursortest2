package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0004\u0010\nJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0007\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007\u0082\u0002\u0012\n\u0010\b\u0000\u001a\f\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000f*\u0004\u0018\u00018\u0001H\u0007\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\u0012\u0010\u0014J,\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0007\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0014J9\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\"\u0004\b\u0001\u0010\u0017\"\u0004\b\u0002\u0010\u0018*\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\"\u0004\b\u0001\u0010\u0017\"\u0004\b\u0002\u0010\u0018*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0001\u0010\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001dH\u0007¢\u0006\u0004\b\u001a\u0010\u001fJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u001dH\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010 H\u0007¢\u0006\u0004\b\u001a\u0010!J+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100 H\u0007¢\u0006\u0004\b\u001c\u0010!J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\"\"\u0004\b\u0001\u0010\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"H\u0007¢\u0006\u0004\b\u001a\u0010#J+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\"\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\"H\u0007¢\u0006\u0004\b\u001c\u0010#J]\u0010(\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000f2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0002\b%2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0087\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b(\u0010)JG\u0010+\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000f2\u001f\u0010&\u001a\u001b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u0000\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0002\b%H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Larrow/core/raise/SingletonRaise;", "E", "Larrow/core/raise/Raise;", "", "raise", "<init>", "(Larrow/core/raise/Raise;)V", "", "()Ljava/lang/Void;", "r", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "condition", "ensure", "(Z)V", "A", "Larrow/core/Option;", "Larrow/core/Some;", "bind", "(Larrow/core/Option;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "ensureNotNull", "K", "V", "", "bindAllNullable", "(Ljava/util/Map;)Ljava/util/Map;", "bindAllOption", "", "", "(Ljava/lang/Iterable;)Ljava/util/List;", "Larrow/core/NonEmptyList;", "(Ljava/util/List;)Ljava/util/List;", "Larrow/core/NonEmptySet;", "(Ljava/util/Set;)Ljava/util/Set;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/Function0;", "recover", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "ignoreErrors", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Larrow/core/raise/Raise;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingletonRaise<E> implements arrow.core.raise.Raise<E> {
    private final arrow.core.raise.Raise<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SingletonRaise(arrow.core.raise.Raise<? super kotlin.Unit> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.getHighResolutionOutputSizeshNQ4ISI = raise;
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(arrow.core.Either<? extends E, ? extends A> either) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, either);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super E>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, function1);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.lang.Object bind(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super E>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.bind(this, function2, continuation);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.util.List<A> bindAll(java.lang.Iterable<? extends arrow.core.Either<? extends E, ? extends A>> iterable) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, iterable);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <K, A> java.util.Map<K, A> bindAll(java.util.Map<K, ? extends arrow.core.Either<? extends E, ? extends A>> map) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, map);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-1TN0_VU */
    public final /* bridge */ <A> java.util.Set<A> mo9684bindAll1TN0_VU(java.util.Set<? extends arrow.core.Either<? extends E, ? extends A>> set) {
        return arrow.core.raise.Raise.DefaultImpls.m9687bindAll1TN0_VU(this, set);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-vcjLgH4 */
    public final /* bridge */ <A> java.util.List<A> mo9685bindAllvcjLgH4(java.util.List<? extends arrow.core.Either<? extends E, ? extends A>> list) {
        return arrow.core.raise.Raise.DefaultImpls.m9688bindAllvcjLgH4(this, list);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> A invoke(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super E>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.invoke(this, function1);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> java.lang.Object invoke(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super E>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.invoke(this, function2, continuation);
    }

    @arrow.core.raise.RaiseDSL
    public final java.lang.Void raise() {
        this.getHighResolutionOutputSizeshNQ4ISI.raise(kotlin.Unit.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final java.lang.Void raise(E r) {
        raise();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public final void ensure(boolean condition) {
        if (condition) {
            return;
        }
        raise();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public final <A> A bind(arrow.core.Option<? extends A> option) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
        ensure(option instanceof arrow.core.Some);
        return (A) ((arrow.core.Some) option).getValue();
    }

    @arrow.core.raise.RaiseDSL
    public final <A> A bind(A a2) {
        if (a2 != null) {
            return a2;
        }
        raise();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    @kotlin.IgnorableReturnValue
    public final <A> A ensureNotNull(A value) {
        if (value != null) {
            return value;
        }
        raise();
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public final <A> java.util.Set<A> bindAllNullable(java.util.Set<? extends A> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return arrow.core.NonEmptyList.m9606toNonEmptySet5sCjGKo(arrow.core.NonEmptySet.m9653map0xjo5U(set, new kotlin.jvm.functions.Function1() { // from class: arrow.core.raise.SingletonRaise$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object bind;
                bind = arrow.core.raise.SingletonRaise.this.bind((arrow.core.raise.SingletonRaise) obj);
                return bind;
            }
        }));
    }

    @arrow.core.raise.RaiseDSL
    public final <A> java.util.Set<A> bindAllOption(java.util.Set<? extends arrow.core.Option<? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return arrow.core.NonEmptyList.m9606toNonEmptySet5sCjGKo(arrow.core.NonEmptySet.m9653map0xjo5U(set, new kotlin.jvm.functions.Function1() { // from class: arrow.core.raise.SingletonRaise$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.raise.SingletonRaise.m9707$r8$lambda$vajDzY1YPyRWYAe2ezl8Ikxrsc(arrow.core.raise.SingletonRaise.this, (arrow.core.Option) obj);
            }
        }));
    }

    @arrow.core.raise.RaiseDSL
    public final <A> A ignoreErrors(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<java.lang.Object>, ? extends A> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return block.invoke(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <K, V> java.util.Map<K, V> bindAllNullable(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), bind((arrow.core.raise.SingletonRaise<E>) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> java.util.Map<K, V> bindAllOption(java.util.Map<K, ? extends arrow.core.Option<? extends V>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), bind((arrow.core.Option) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllNullable(java.lang.Iterable<? extends A> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator<? extends A> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bind((arrow.core.raise.SingletonRaise<E>) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllOption(java.lang.Iterable<? extends arrow.core.Option<? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator<? extends arrow.core.Option<? extends A>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bind((arrow.core.Option) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllNullable(java.util.List<? extends A> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends A> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(bind((arrow.core.raise.SingletonRaise<E>) it.next()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public final <A> java.util.List<A> bindAllOption(java.util.List<? extends arrow.core.Option<? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends arrow.core.Option<? extends A>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(bind((arrow.core.Option) it.next()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    @arrow.core.raise.RaiseDSL
    public final <A> A recover(kotlin.jvm.functions.Function1<? super arrow.core.raise.SingletonRaise<? super E>, ? extends A> block, kotlin.jvm.functions.Function0<? extends A> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            A invoke = block.invoke(new arrow.core.raise.SingletonRaise(defaultRaise));
            defaultRaise.complete();
            return invoke;
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return raise.invoke();
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* renamed from: $r8$lambda$v-ajDzY1YPyRWYAe2ezl8Ikxrsc, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9707$r8$lambda$vajDzY1YPyRWYAe2ezl8Ikxrsc(arrow.core.raise.SingletonRaise singletonRaise, arrow.core.Option option) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
        return singletonRaise.bind(option);
    }
}
