package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public class LockBasedStorageManager implements kotlin.reflect.jvm.internal.impl.storage.StorageManager {
    private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes;
    protected final kotlin.reflect.jvm.internal.impl.storage.SimpleLock lock;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = kotlin.text.StringsKt.substringBeforeLast(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final kotlin.reflect.jvm.internal.impl.storage.StorageManager NO_LOCKS = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("NO_LOCKS", kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.THROW, kotlin.reflect.jvm.internal.impl.storage.EmptySimpleLock.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
        {
            byte b = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        protected final <K, V> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<V> recursionDetectedDefault(java.lang.String str, K k) {
            if (str != null) {
                return kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.getHighSpeedVideoFpsRanges();
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "source", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"));
        }
    };

    public interface ExceptionHandlingStrategy {
        public static final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy THROW = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public final java.lang.RuntimeException handleException(java.lang.Throwable th) {
                if (th != null) {
                    throw kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.rethrow(th);
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }
        };

        java.lang.RuntimeException handleException(java.lang.Throwable th);
    }

    enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* synthetic */ LockBasedStorageManager(java.lang.String str, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy, kotlin.reflect.jvm.internal.impl.storage.SimpleLock simpleLock, byte b) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    private LockBasedStorageManager(java.lang.String str, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy, kotlin.reflect.jvm.internal.impl.storage.SimpleLock simpleLock) {
        if (str == null) {
            Camera2StreamConfigurationMap(4);
        }
        if (exceptionHandlingStrategy == null) {
            Camera2StreamConfigurationMap(5);
        }
        if (simpleLock == null) {
            Camera2StreamConfigurationMap(6);
        }
        this.lock = simpleLock;
        this.Camera2StreamConfigurationMap = exceptionHandlingStrategy;
        this.getHighSpeedVideoSizes = str;
    }

    public LockBasedStorageManager(java.lang.String str) {
        this(str, (java.lang.Runnable) null, (kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.Unit>) null);
    }

    public LockBasedStorageManager(java.lang.String str, java.lang.Runnable runnable, kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.Unit> function1) {
        this(str, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.THROW, kotlin.reflect.jvm.internal.impl.storage.SimpleLock.Companion.simpleLock(runnable, function1));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(" (");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(")");
        return sb.toString();
    }

    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap) {
        if (function1 == null) {
            Camera2StreamConfigurationMap(14);
        }
        if (concurrentMap == null) {
            Camera2StreamConfigurationMap(15);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap) {
        if (function1 == null) {
            Camera2StreamConfigurationMap(21);
        }
        if (concurrentMap == null) {
            Camera2StreamConfigurationMap(22);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValue(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(23);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createRecursionTolerantLazyValue(kotlin.jvm.functions.Function0<? extends T> function0, final T t) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(26);
        }
        if (t == null) {
            Camera2StreamConfigurationMap(27);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.4
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            protected final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> getHighSpeedVideoFpsRanges(boolean z) {
                return kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.getHighResolutionOutputSizeshNQ4ISI(t);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValueWithPostCompute(kotlin.jvm.functions.Function0<? extends T> function0, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends T> function1, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(28);
        }
        if (function12 == null) {
            Camera2StreamConfigurationMap(29);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValueWithPostCompute<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            protected final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> getHighSpeedVideoFpsRanges(boolean z) {
                kotlin.jvm.functions.Function1 function13 = function1;
                if (function13 == null) {
                    kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> highSpeedVideoFpsRanges = super.getHighSpeedVideoFpsRanges(z);
                    if (highSpeedVideoFpsRanges == null) {
                        getHighSpeedVideoSizes(0);
                    }
                    return highSpeedVideoFpsRanges;
                }
                return kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.getHighResolutionOutputSizeshNQ4ISI(function13.invoke(java.lang.Boolean.valueOf(z)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            protected final void getHighSpeedVideoFpsRangesFor(T t) {
                if (t == null) {
                    getHighSpeedVideoSizes(2);
                }
                function12.invoke(t);
            }

            private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
                java.lang.String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 2 : 3];
                if (i != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                } else {
                    objArr[0] = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE;
                }
                if (i != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (i == 2) {
                    objArr[2] = "doPostCompute";
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i == 2) {
                    throw new java.lang.IllegalArgumentException(format);
                }
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<T> createNullableLazyValue(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(30);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(34);
        }
        this.lock.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    protected <K, V> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<V> recursionDetectedDefault(java.lang.String str, K k) {
        if (str == null) {
            Camera2StreamConfigurationMap(35);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(k == null ? "" : "on input: ".concat(java.lang.String.valueOf(k)));
        sb.append(" under ");
        sb.append(this);
        throw ((java.lang.AssertionError) getHighSpeedVideoSizes(new java.lang.AssertionError(sb.toString())));
    }

    static class RecursionDetectedResult<T> {
        final boolean Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;

        public static <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> getHighResolutionOutputSizeshNQ4ISI(T t) {
            return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<>(t, false);
        }

        public static <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> getHighSpeedVideoFpsRanges() {
            return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<>(null, true);
        }

        private RecursionDetectedResult(T t, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.Camera2StreamConfigurationMap = z;
        }

        public java.lang.String toString() {
            return this.Camera2StreamConfigurationMap ? "FALL_THROUGH" : java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    static class LockBasedLazyValue<T> implements kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<T> {
        private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager getHighResolutionOutputSizeshNQ4ISI;
        private volatile java.lang.Object getHighSpeedVideoFpsRanges;
        private final kotlin.jvm.functions.Function0<? extends T> getHighSpeedVideoSizes;

        protected void getHighResolutionOutputSizeshNQ4ISI(T t) {
        }

        public LockBasedLazyValue(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                getHighSpeedVideoFpsRanges(0);
            }
            if (function0 == null) {
                getHighSpeedVideoFpsRanges(1);
            }
            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED;
            this.getHighResolutionOutputSizeshNQ4ISI = lockBasedStorageManager;
            this.getHighSpeedVideoSizes = function0;
        }

        public boolean isComputed() {
            return (this.getHighSpeedVideoFpsRanges == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED || this.getHighSpeedVideoFpsRanges == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T invoke;
            java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue)) {
                return (T) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(obj);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.lock.lock();
            try {
                java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                if (obj2 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue) {
                    if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                        this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED;
                        kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(true);
                        if (!highSpeedVideoFpsRanges.Camera2StreamConfigurationMap) {
                            invoke = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                        }
                    }
                    if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED) {
                        kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(false);
                        if (!highSpeedVideoFpsRanges2.Camera2StreamConfigurationMap) {
                            invoke = highSpeedVideoFpsRanges2.getHighResolutionOutputSizeshNQ4ISI;
                        }
                    }
                    this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING;
                    try {
                        invoke = this.getHighSpeedVideoSizes.invoke();
                        getHighResolutionOutputSizeshNQ4ISI(invoke);
                        this.getHighSpeedVideoFpsRanges = invoke;
                    } catch (java.lang.Throwable th) {
                        if (kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.getHighSpeedVideoFpsRanges == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(th);
                        }
                        throw this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.handleException(th);
                    }
                } else {
                    invoke = (T) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(obj2);
                }
                return invoke;
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.lock.unlock();
            }
        }

        protected kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> getHighSpeedVideoFpsRanges(boolean z) {
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedDefault = this.getHighResolutionOutputSizeshNQ4ISI.recursionDetectedDefault("in a lazy value", null);
            if (recursionDetectedDefault == null) {
                getHighSpeedVideoFpsRanges(2);
            }
            return recursionDetectedDefault;
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
            java.lang.String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
    }

    static abstract class LockBasedLazyValueWithPostCompute<T> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue<T> {
        private volatile kotlin.reflect.jvm.internal.impl.storage.SingleThreadValue<T> getHighResolutionOutputSizeshNQ4ISI;

        protected abstract void getHighSpeedVideoFpsRangesFor(T t);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedLazyValueWithPostCompute(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                getHighSpeedVideoSizes(0);
            }
            if (function0 == null) {
                getHighSpeedVideoSizes(1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.SingleThreadValue<T> singleThreadValue = this.getHighResolutionOutputSizeshNQ4ISI;
            if (singleThreadValue == null || singleThreadValue.Camera2StreamConfigurationMap != java.lang.Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (singleThreadValue.Camera2StreamConfigurationMap != java.lang.Thread.currentThread()) {
                throw new java.lang.IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            return singleThreadValue.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        protected final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.storage.SingleThreadValue<>(t);
            try {
                getHighSpeedVideoFpsRangesFor(t);
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute<T> implements kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValueWithPostCompute(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                getHighSpeedVideoFpsRangesFor(0);
            }
            if (function0 == null) {
                getHighSpeedVideoFpsRangesFor(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                getHighSpeedVideoFpsRangesFor(2);
            }
            return t;
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
            java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i == 2) {
                throw new java.lang.IllegalStateException(format);
            }
        }
    }

    static class LockBasedNotNullLazyValue<T> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue<T> implements kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                getHighResolutionOutputSizeshNQ4ISI(0);
            }
            if (function0 == null) {
                getHighResolutionOutputSizeshNQ4ISI(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                getHighResolutionOutputSizeshNQ4ISI(2);
            }
            return t;
        }

        private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
            java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i == 2) {
                throw new java.lang.IllegalStateException(format);
            }
        }
    }

    static class MapBasedMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> {
        private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager Camera2StreamConfigurationMap;
        private final java.util.concurrent.ConcurrentMap<K, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.jvm.functions.Function1<? super K, ? extends V> getHighSpeedVideoFpsRangesFor;

        public MapBasedMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                getHighSpeedVideoSizes(0);
            }
            if (concurrentMap == null) {
                getHighSpeedVideoSizes(1);
            }
            if (function1 == null) {
                getHighSpeedVideoSizes(2);
            }
            this.Camera2StreamConfigurationMap = lockBasedStorageManager;
            this.getHighResolutionOutputSizeshNQ4ISI = concurrentMap;
            this.getHighSpeedVideoFpsRangesFor = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k) {
            java.lang.AssertionError Camera2StreamConfigurationMap;
            java.lang.AssertionError Camera2StreamConfigurationMap2;
            V v;
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(k);
            if (obj != null && obj != kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                return (V) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(obj);
            }
            this.Camera2StreamConfigurationMap.lock.lock();
            try {
                java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI.get(k);
                if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                    obj2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED;
                    kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<V> recursionDetectedDefault = this.Camera2StreamConfigurationMap.recursionDetectedDefault("", k);
                    if (recursionDetectedDefault == null) {
                        getHighSpeedVideoSizes(3);
                    }
                    if (!recursionDetectedDefault.Camera2StreamConfigurationMap) {
                        v = recursionDetectedDefault.getHighResolutionOutputSizeshNQ4ISI;
                        return v;
                    }
                }
                if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED) {
                    kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<V> recursionDetectedDefault2 = this.Camera2StreamConfigurationMap.recursionDetectedDefault("", k);
                    if (recursionDetectedDefault2 == null) {
                        getHighSpeedVideoSizes(3);
                    }
                    if (!recursionDetectedDefault2.Camera2StreamConfigurationMap) {
                        v = recursionDetectedDefault2.getHighResolutionOutputSizeshNQ4ISI;
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(obj2);
                    return v;
                }
                java.lang.AssertionError assertionError = null;
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.put(k, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING);
                    V invoke = this.getHighSpeedVideoFpsRangesFor.invoke(k);
                    java.lang.Object put = this.getHighResolutionOutputSizeshNQ4ISI.put(k, kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeNull(invoke));
                    if (put == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                        return invoke;
                    }
                    assertionError = getHighResolutionOutputSizeshNQ4ISI(k, put);
                    throw assertionError;
                } catch (java.lang.Throwable th) {
                    if (!kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                        if (th == assertionError) {
                            try {
                                this.getHighResolutionOutputSizeshNQ4ISI.remove(k);
                                throw this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.handleException(th);
                            } finally {
                            }
                        }
                        java.lang.Object put2 = this.getHighResolutionOutputSizeshNQ4ISI.put(k, kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(th));
                        if (put2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                            throw this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.handleException(th);
                        }
                        throw getHighResolutionOutputSizeshNQ4ISI(k, put2);
                    }
                    try {
                        java.lang.Object remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(k);
                        if (remove != kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent key detected. ");
                            sb.append(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING);
                            sb.append(" is expected, was: ");
                            sb.append(remove);
                            sb.append(", most probably race condition detected on input ");
                            sb.append(k);
                            sb.append(" under ");
                            sb.append(this.Camera2StreamConfigurationMap);
                            throw ((java.lang.AssertionError) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.getHighSpeedVideoSizes(new java.lang.AssertionError(sb.toString())));
                        }
                        throw th;
                    } finally {
                    }
                }
            } finally {
                this.Camera2StreamConfigurationMap.lock.unlock();
            }
        }

        private java.lang.AssertionError getHighResolutionOutputSizeshNQ4ISI(K k, java.lang.Object obj) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Race condition detected on input ");
            sb.append(k);
            sb.append(". Old value is ");
            sb.append(obj);
            sb.append(" under ");
            sb.append(this.Camera2StreamConfigurationMap);
            java.lang.AssertionError assertionError = (java.lang.AssertionError) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.getHighSpeedVideoSizes(new java.lang.AssertionError(sb.toString()));
            if (assertionError == null) {
                getHighSpeedVideoSizes(4);
            }
            return assertionError;
        }

        private java.lang.AssertionError Camera2StreamConfigurationMap(K k, java.lang.Throwable th) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to remove ");
            sb.append(k);
            sb.append(" under ");
            sb.append(this.Camera2StreamConfigurationMap);
            return (java.lang.AssertionError) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.getHighSpeedVideoSizes(new java.lang.AssertionError(sb.toString(), th));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k) {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(k);
            return (obj == null || obj == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) ? false : true;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
    }

    static class MapBasedMemoizedFunctionToNotNull<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapBasedMemoizedFunctionToNotNull(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (concurrentMap == null) {
                getHighSpeedVideoSizes(1);
            }
            if (function1 == null) {
                getHighSpeedVideoSizes(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                getHighSpeedVideoSizes(3);
            }
            return v;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i == 3) {
                throw new java.lang.IllegalStateException(format);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends java.lang.Throwable> T getHighSpeedVideoSizes(T t) {
        if (t == null) {
            Camera2StreamConfigurationMap(36);
        }
        java.lang.StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!stackTrace[i].getClassName().startsWith(getHighSpeedVideoFpsRangesFor)) {
                break;
            }
            i++;
        }
        java.util.List subList = java.util.Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((java.lang.StackTraceElement[]) subList.toArray(new java.lang.StackTraceElement[subList.size()]));
        if (t == null) {
            Camera2StreamConfigurationMap(37);
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), (byte) 0);
    }

    static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues<K, V> {
        /* synthetic */ CacheWithNullableValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap concurrentMap, byte b) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNullableValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, java.lang.Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, V>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return ((kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation) obj).getHighSpeedVideoFpsRanges.invoke();
                }
            });
            if (lockBasedStorageManager == null) {
                getHighSpeedVideoFpsRangesFor(0);
            }
            if (concurrentMap == null) {
                getHighSpeedVideoFpsRangesFor(1);
            }
        }

        public V computeIfAbsent(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            if (function0 == null) {
                getHighSpeedVideoFpsRangesFor(2);
            }
            return invoke(new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation(k, function0));
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNotNullValuesBasedOnMemoizedFunction(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), (byte) 0);
    }

    static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<K, V> {
        /* synthetic */ CacheWithNotNullValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap concurrentMap, byte b) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private CacheWithNotNullValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, java.lang.Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, r0);
            byte b = 0;
            if (lockBasedStorageManager == null) {
                Camera2StreamConfigurationMap(0);
            }
            if (concurrentMap == null) {
                Camera2StreamConfigurationMap(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public V computeIfAbsent(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            if (function0 == null) {
                Camera2StreamConfigurationMap(2);
            }
            V v = (V) super.computeIfAbsent(k, function0);
            if (v == null) {
                Camera2StreamConfigurationMap(3);
            }
            return v;
        }

        private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
            java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i == 3) {
                throw new java.lang.IllegalStateException(format);
            }
        }
    }

    static class KeyWithComputation<K, V> {
        private final K getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.jvm.functions.Function0<? extends V> getHighSpeedVideoFpsRanges;

        public KeyWithComputation(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            this.getHighResolutionOutputSizeshNQ4ISI = k;
            this.getHighSpeedVideoFpsRanges = function0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.getHighResolutionOutputSizeshNQ4ISI.equals(((kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation) obj).getHighResolutionOutputSizeshNQ4ISI);
        }

        public int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction(kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            Camera2StreamConfigurationMap(9);
        }
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction = createMemoizedFunction(function1, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2));
        if (createMemoizedFunction == null) {
            Camera2StreamConfigurationMap(10);
        }
        return createMemoizedFunction;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            Camera2StreamConfigurationMap(19);
        }
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2));
        if (createMemoizedFunctionWithNullableValues == null) {
            Camera2StreamConfigurationMap(20);
        }
        return createMemoizedFunctionWithNullableValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String format;
        java.lang.String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i != 1 && i != 3 && i != 5) {
            if (i != 6) {
                switch (i) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case 35:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY;
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i != 10 || i == 13) {
                objArr[1] = "createMemoizedFunction";
            } else if (i == 20) {
                objArr[1] = "createMemoizedFunctionWithNullableValues";
            } else if (i != 37) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            } else {
                objArr[1] = "sanitizeStackTrace";
            }
            switch (i) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case 35:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = java.lang.String.format(str, objArr);
            if (i == 10 && i != 13 && i != 20 && i != 37) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i != 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i) {
        }
        format = java.lang.String.format(str, objArr);
        if (i == 10) {
        }
        throw new java.lang.IllegalStateException(format);
    }
}
