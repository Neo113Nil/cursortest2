package io.reactivex.internal.functions;

/* loaded from: classes3.dex */
public final class Functions {
    static final io.reactivex.functions.Function<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.functions.Functions.Identity();
    public static final java.lang.Runnable EMPTY_RUNNABLE = new io.reactivex.internal.functions.Functions.EmptyRunnable();
    public static final io.reactivex.functions.Action EMPTY_ACTION = new io.reactivex.internal.functions.Functions.EmptyAction();
    static final io.reactivex.functions.Consumer<java.lang.Object> getHighSpeedVideoSizes = new io.reactivex.internal.functions.Functions.EmptyConsumer();
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ERROR_CONSUMER = new io.reactivex.internal.functions.Functions.ErrorConsumer();
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ON_ERROR_MISSING = new io.reactivex.internal.functions.Functions.OnErrorMissingConsumer();
    public static final io.reactivex.functions.LongConsumer EMPTY_LONG_CONSUMER = new io.reactivex.internal.functions.Functions.EmptyLongConsumer();
    static final io.reactivex.functions.Predicate<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.functions.Functions.TruePredicate();
    static final io.reactivex.functions.Predicate<java.lang.Object> Camera2StreamConfigurationMap = new io.reactivex.internal.functions.Functions.FalsePredicate();
    static final java.util.concurrent.Callable<java.lang.Object> getInputSizeshNQ4ISI = new io.reactivex.internal.functions.Functions.NullCallable();
    static final java.util.Comparator<java.lang.Object> getHighSpeedVideoFpsRanges = new io.reactivex.internal.functions.Functions.NaturalObjectComparator();
    public static final io.reactivex.functions.Consumer<org.reactivestreams.Subscription> REQUEST_MAX = new io.reactivex.internal.functions.Functions.MaxRequestSubscription();

    private Functions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T1, T2, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "f is null");
        return new io.reactivex.internal.functions.Functions.Array2Func(biFunction);
    }

    public static <T1, T2, T3, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function3<T1, T2, T3, R> function3) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function3, "f is null");
        return new io.reactivex.internal.functions.Functions.Array3Func(function3);
    }

    public static <T1, T2, T3, T4, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function4<T1, T2, T3, T4, R> function4) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function4, "f is null");
        return new io.reactivex.internal.functions.Functions.Array4Func(function4);
    }

    public static <T1, T2, T3, T4, T5, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> function5) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function5, "f is null");
        return new io.reactivex.internal.functions.Functions.Array5Func(function5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function6, "f is null");
        return new io.reactivex.internal.functions.Functions.Array6Func(function6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function7, "f is null");
        return new io.reactivex.internal.functions.Functions.Array7Func(function7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function8, "f is null");
        return new io.reactivex.internal.functions.Functions.Array8Func(function8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function9, "f is null");
        return new io.reactivex.internal.functions.Functions.Array9Func(function9);
    }

    public static <T> io.reactivex.functions.Function<T, T> identity() {
        return (io.reactivex.functions.Function<T, T>) getHighSpeedVideoFpsRangesFor;
    }

    public static <T> io.reactivex.functions.Consumer<T> emptyConsumer() {
        return (io.reactivex.functions.Consumer<T>) getHighSpeedVideoSizes;
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysTrue() {
        return (io.reactivex.functions.Predicate<T>) getHighResolutionOutputSizeshNQ4ISI;
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysFalse() {
        return (io.reactivex.functions.Predicate<T>) Camera2StreamConfigurationMap;
    }

    public static <T> java.util.concurrent.Callable<T> nullSupplier() {
        return (java.util.concurrent.Callable<T>) getInputSizeshNQ4ISI;
    }

    public static <T> java.util.Comparator<T> naturalOrder() {
        return (java.util.Comparator<T>) getHighSpeedVideoFpsRanges;
    }

    /* loaded from: classes17.dex */
    static final class FutureAction implements io.reactivex.functions.Action {
        final java.util.concurrent.Future<?> getHighSpeedVideoFpsRangesFor;

        FutureAction(java.util.concurrent.Future<?> future) {
            this.getHighSpeedVideoFpsRangesFor = future;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws java.lang.Exception {
            this.getHighSpeedVideoFpsRangesFor.get();
        }
    }

    public static io.reactivex.functions.Action futureAction(java.util.concurrent.Future<?> future) {
        return new io.reactivex.internal.functions.Functions.FutureAction(future);
    }

    /* loaded from: classes17.dex */
    static final class JustValue<T, U> implements java.util.concurrent.Callable<U>, io.reactivex.functions.Function<T, U> {
        final U getHighResolutionOutputSizeshNQ4ISI;

        JustValue(U u) {
            this.getHighResolutionOutputSizeshNQ4ISI = u;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws java.lang.Exception {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // io.reactivex.functions.Function
        public final U apply(T t) throws java.lang.Exception {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public static <T> java.util.concurrent.Callable<T> justCallable(T t) {
        return new io.reactivex.internal.functions.Functions.JustValue(t);
    }

    public static <T, U> io.reactivex.functions.Function<T, U> justFunction(U u) {
        return new io.reactivex.internal.functions.Functions.JustValue(u);
    }

    /* loaded from: classes17.dex */
    static final class CastToClass<T, U> implements io.reactivex.functions.Function<T, U> {
        final java.lang.Class<U> getHighSpeedVideoSizes;

        CastToClass(java.lang.Class<U> cls) {
            this.getHighSpeedVideoSizes = cls;
        }

        @Override // io.reactivex.functions.Function
        public final U apply(T t) throws java.lang.Exception {
            return this.getHighSpeedVideoSizes.cast(t);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, U> castFunction(java.lang.Class<U> cls) {
        return new io.reactivex.internal.functions.Functions.CastToClass(cls);
    }

    /* loaded from: classes17.dex */
    static final class ArrayListCapacityCallable<T> implements java.util.concurrent.Callable<java.util.List<T>> {
        final int getHighSpeedVideoSizes;

        ArrayListCapacityCallable(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return new java.util.ArrayList(this.getHighSpeedVideoSizes);
        }
    }

    public static <T> java.util.concurrent.Callable<java.util.List<T>> createArrayList(int i) {
        return new io.reactivex.internal.functions.Functions.ArrayListCapacityCallable(i);
    }

    /* loaded from: classes17.dex */
    static final class EqualsPredicate<T> implements io.reactivex.functions.Predicate<T> {
        final T getHighSpeedVideoFpsRanges;

        EqualsPredicate(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t) throws java.lang.Exception {
            return io.reactivex.internal.functions.ObjectHelper.equals(t, this.getHighSpeedVideoFpsRanges);
        }
    }

    public static <T> io.reactivex.functions.Predicate<T> equalsWith(T t) {
        return new io.reactivex.internal.functions.Functions.EqualsPredicate(t);
    }

    public static <T> java.util.concurrent.Callable<java.util.Set<T>> createHashSet() {
        return io.reactivex.internal.functions.Functions.HashSetCallable.INSTANCE;
    }

    /* loaded from: classes17.dex */
    static final class NotificationOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> getHighSpeedVideoFpsRanges;

        NotificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.getHighSpeedVideoFpsRanges = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t) throws java.lang.Exception {
            this.getHighSpeedVideoFpsRanges.accept(io.reactivex.Notification.createOnNext(t));
        }
    }

    /* loaded from: classes17.dex */
    static final class NotificationOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.getHighSpeedVideoFpsRangesFor.accept(io.reactivex.Notification.createOnError(th));
        }

        NotificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.getHighSpeedVideoFpsRangesFor = consumer;
        }
    }

    /* loaded from: classes17.dex */
    static final class NotificationOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> Camera2StreamConfigurationMap;

        NotificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.Camera2StreamConfigurationMap = consumer;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.accept(io.reactivex.Notification.createOnComplete());
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> notificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnNext(consumer);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> notificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnError(consumer);
    }

    public static <T> io.reactivex.functions.Action notificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnComplete(consumer);
    }

    /* loaded from: classes17.dex */
    static final class ActionConsumer<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;

        ActionConsumer(io.reactivex.functions.Action action) {
            this.getHighResolutionOutputSizeshNQ4ISI = action;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t) throws java.lang.Exception {
            this.getHighResolutionOutputSizeshNQ4ISI.run();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> actionConsumer(io.reactivex.functions.Action action) {
        return new io.reactivex.internal.functions.Functions.ActionConsumer(action);
    }

    /* loaded from: classes17.dex */
    static final class ClassFilter<T, U> implements io.reactivex.functions.Predicate<T> {
        final java.lang.Class<U> getHighSpeedVideoFpsRangesFor;

        ClassFilter(java.lang.Class<U> cls) {
            this.getHighSpeedVideoFpsRangesFor = cls;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t) throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRangesFor.isInstance(t);
        }
    }

    public static <T, U> io.reactivex.functions.Predicate<T> isInstanceOf(java.lang.Class<U> cls) {
        return new io.reactivex.internal.functions.Functions.ClassFilter(cls);
    }

    /* loaded from: classes17.dex */
    static final class BooleanSupplierPredicateReverse<T> implements io.reactivex.functions.Predicate<T> {
        final io.reactivex.functions.BooleanSupplier getHighSpeedVideoFpsRanges;

        BooleanSupplierPredicateReverse(io.reactivex.functions.BooleanSupplier booleanSupplier) {
            this.getHighSpeedVideoFpsRanges = booleanSupplier;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t) throws java.lang.Exception {
            return !this.getHighSpeedVideoFpsRanges.getAsBoolean();
        }
    }

    public static <T> io.reactivex.functions.Predicate<T> predicateReverseFor(io.reactivex.functions.BooleanSupplier booleanSupplier) {
        return new io.reactivex.internal.functions.Functions.BooleanSupplierPredicateReverse(booleanSupplier);
    }

    /* loaded from: classes17.dex */
    static final class TimestampFunction<T> implements io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> {
        final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
        final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;

        TimestampFunction(java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRangesFor = timeUnit;
            this.getHighSpeedVideoFpsRanges = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.schedulers.Timed(obj, this.getHighSpeedVideoFpsRanges.now(this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public static <T> io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> timestampWith(java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.functions.Functions.TimestampFunction(timeUnit, scheduler);
    }

    /* loaded from: classes17.dex */
    static final class ToMapKeySelector<K, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> getHighSpeedVideoFpsRanges;

        @Override // io.reactivex.functions.BiConsumer
        public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            ((java.util.Map) obj).put(this.getHighSpeedVideoFpsRanges.apply(obj2), obj2);
        }

        ToMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> function) {
            this.getHighSpeedVideoFpsRanges = function;
        }
    }

    public static <T, K> io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> toMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> function) {
        return new io.reactivex.internal.functions.Functions.ToMapKeySelector(function);
    }

    /* loaded from: classes17.dex */
    static final class ToMapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.functions.Function<? super T, ? extends V> getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.functions.BiConsumer
        public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            ((java.util.Map) obj).put(this.getHighResolutionOutputSizeshNQ4ISI.apply(obj2), this.getHighSpeedVideoFpsRangesFor.apply(obj2));
        }

        ToMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends V> function, io.reactivex.functions.Function<? super T, ? extends K> function2) {
            this.getHighSpeedVideoFpsRangesFor = function;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> toMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2) {
        return new io.reactivex.internal.functions.Functions.ToMapKeyValueSelector(function2, function);
    }

    /* loaded from: classes17.dex */
    static final class ToMultimapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends V> getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.functions.Function<? super T, ? extends K> getHighSpeedVideoFpsRanges;
        private final io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.BiConsumer
        public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            java.util.Map map = (java.util.Map) obj;
            K apply = this.getHighSpeedVideoFpsRanges.apply(obj2);
            java.util.Collection<? super V> collection = (java.util.Collection) map.get(apply);
            if (collection == null) {
                collection = this.getHighSpeedVideoSizes.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.getHighResolutionOutputSizeshNQ4ISI.apply(obj2));
        }

        ToMultimapKeyValueSelector(io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> function, io.reactivex.functions.Function<? super T, ? extends V> function2, io.reactivex.functions.Function<? super T, ? extends K> function3) {
            this.getHighSpeedVideoSizes = function;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRanges = function3;
        }
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> toMultimapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> function3) {
        return new io.reactivex.internal.functions.Functions.ToMultimapKeyValueSelector(function3, function2, function);
    }

    /* loaded from: classes17.dex */
    enum NaturalComparator implements java.util.Comparator<java.lang.Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Comparable) obj).compareTo(obj2);
        }
    }

    public static <T> java.util.Comparator<T> naturalComparator() {
        return io.reactivex.internal.functions.Functions.NaturalComparator.INSTANCE;
    }

    /* loaded from: classes17.dex */
    static final class ListSorter<T> implements io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> {
        final java.util.Comparator<? super T> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            java.util.List list = (java.util.List) obj;
            java.util.Collections.sort(list, this.Camera2StreamConfigurationMap);
            return list;
        }

        ListSorter(java.util.Comparator<? super T> comparator) {
            this.Camera2StreamConfigurationMap = comparator;
        }
    }

    public static <T> io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> listSorter(java.util.Comparator<? super T> comparator) {
        return new io.reactivex.internal.functions.Functions.ListSorter(comparator);
    }

    /* loaded from: classes17.dex */
    static final class Array2Func<T1, T2, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 2 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoFpsRangesFor.apply(objArr2[0], objArr2[1]);
        }

        Array2Func(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.getHighSpeedVideoFpsRangesFor = biFunction;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array3Func<T1, T2, T3, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function3<T1, T2, T3, R> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 3 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.apply(objArr2[0], objArr2[1], objArr2[2]);
        }

        Array3Func(io.reactivex.functions.Function3<T1, T2, T3, R> function3) {
            this.getHighResolutionOutputSizeshNQ4ISI = function3;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array4Func<T1, T2, T3, T4, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function4<T1, T2, T3, T4, R> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 4 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoFpsRanges.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
        }

        Array4Func(io.reactivex.functions.Function4<T1, T2, T3, T4, R> function4) {
            this.getHighSpeedVideoFpsRanges = function4;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array5Func<T1, T2, T3, T4, T5, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        private final io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 5 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoFpsRangesFor.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
        }

        Array5Func(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> function5) {
            this.getHighSpeedVideoFpsRangesFor = function5;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 6 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoSizes.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5]);
        }

        Array6Func(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.getHighSpeedVideoSizes = function6;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 7 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoSizes.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6]);
        }

        Array7Func(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
            this.getHighSpeedVideoSizes = function7;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 8 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.getHighSpeedVideoFpsRanges.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6], objArr2[7]);
        }

        Array8Func(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.getHighSpeedVideoFpsRanges = function8;
        }
    }

    /* loaded from: classes17.dex */
    static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object[] objArr) throws java.lang.Exception {
            java.lang.Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Array of size 9 expected but got ");
                sb.append(objArr2.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return this.Camera2StreamConfigurationMap.apply(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6], objArr2[7], objArr2[8]);
        }

        Array9Func(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
            this.Camera2StreamConfigurationMap = function9;
        }
    }

    /* loaded from: classes17.dex */
    static final class Identity implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        @Override // io.reactivex.functions.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return obj;
        }

        Identity() {
        }

        public final java.lang.String toString() {
            return "IdentityFunction";
        }
    }

    /* loaded from: classes17.dex */
    static final class EmptyRunnable implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        EmptyRunnable() {
        }

        public final java.lang.String toString() {
            return "EmptyRunnable";
        }
    }

    /* loaded from: classes17.dex */
    static final class EmptyAction implements io.reactivex.functions.Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
        }

        EmptyAction() {
        }

        public final java.lang.String toString() {
            return "EmptyAction";
        }
    }

    /* loaded from: classes17.dex */
    static final class EmptyConsumer implements io.reactivex.functions.Consumer<java.lang.Object> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(java.lang.Object obj) {
        }

        EmptyConsumer() {
        }

        public final java.lang.String toString() {
            return "EmptyConsumer";
        }
    }

    /* loaded from: classes17.dex */
    static final class ErrorConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        ErrorConsumer() {
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Throwable th) throws java.lang.Exception {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class OnErrorMissingConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        OnErrorMissingConsumer() {
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Throwable th) throws java.lang.Exception {
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.OnErrorNotImplementedException(th));
        }
    }

    /* loaded from: classes17.dex */
    static final class EmptyLongConsumer implements io.reactivex.functions.LongConsumer {
        @Override // io.reactivex.functions.LongConsumer
        public final void accept(long j) {
        }

        EmptyLongConsumer() {
        }
    }

    /* loaded from: classes17.dex */
    static final class TruePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(java.lang.Object obj) {
            return true;
        }

        TruePredicate() {
        }
    }

    /* loaded from: classes17.dex */
    static final class FalsePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(java.lang.Object obj) {
            return false;
        }

        FalsePredicate() {
        }
    }

    /* loaded from: classes17.dex */
    static final class NullCallable implements java.util.concurrent.Callable<java.lang.Object> {
        @Override // java.util.concurrent.Callable
        public final java.lang.Object call() {
            return null;
        }

        NullCallable() {
        }
    }

    /* loaded from: classes17.dex */
    static final class NaturalObjectComparator implements java.util.Comparator<java.lang.Object> {
        NaturalObjectComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Comparable) obj).compareTo(obj2);
        }
    }

    /* loaded from: classes17.dex */
    static final class MaxRequestSubscription implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        MaxRequestSubscription() {
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(org.reactivestreams.Subscription subscription) throws java.lang.Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes17.dex */
    enum HashSetCallable implements java.util.concurrent.Callable<java.util.Set<java.lang.Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.util.Set<java.lang.Object> call() throws java.lang.Exception {
            return new java.util.HashSet();
        }
    }
}
