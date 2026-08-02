package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H ¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\f\u0010\nJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0002\b\u000fH\u0086\u0004¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "provides", "providesDefault", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "providesComputed", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/runtime/ProvidedValue;)Landroidx/compose/runtime/ValueHolder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends androidx.compose.runtime.CompositionLocal<T> {
    public static final int $stable = 0;

    public abstract androidx.compose.runtime.ProvidedValue<T> defaultProvidedValue$runtime(T value);

    public ProvidableCompositionLocal(kotlin.jvm.functions.Function0<? extends T> function0) {
        super(function0, null);
    }

    public final androidx.compose.runtime.ProvidedValue<T> provides(T value) {
        return defaultProvidedValue$runtime(value);
    }

    public final androidx.compose.runtime.ProvidedValue<T> providesDefault(T value) {
        return defaultProvidedValue$runtime(value).ifNotAlreadyProvided$runtime();
    }

    public final androidx.compose.runtime.ProvidedValue<T> providesComputed(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.CompositionLocalAccessorScope, ? extends T> compute) {
        return new androidx.compose.runtime.ProvidedValue<>(this, null, false, null, null, compute, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public androidx.compose.runtime.ValueHolder<T> updatedStateOf$runtime(androidx.compose.runtime.ProvidedValue<T> value, androidx.compose.runtime.ValueHolder<T> previous) {
        androidx.compose.runtime.DynamicValueHolder dynamicValueHolder = null;
        if (previous instanceof androidx.compose.runtime.DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder = (androidx.compose.runtime.DynamicValueHolder) previous;
                dynamicValueHolder.getState().setValue(value.getEffectiveValue$runtime());
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (previous instanceof androidx.compose.runtime.StaticValueHolder) {
            if (value.isStatic$runtime()) {
                androidx.compose.runtime.StaticValueHolder staticValueHolder = (androidx.compose.runtime.StaticValueHolder) previous;
                if (kotlin.jvm.internal.Intrinsics.areEqual(value.getEffectiveValue$runtime(), staticValueHolder.getValue())) {
                    dynamicValueHolder = staticValueHolder;
                }
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (previous instanceof androidx.compose.runtime.ComputedValueHolder) {
            androidx.compose.runtime.ComputedValueHolder computedValueHolder = (androidx.compose.runtime.ComputedValueHolder) previous;
            if (value.getCompute$runtime() == computedValueHolder.getCompute()) {
                dynamicValueHolder = computedValueHolder;
            }
            dynamicValueHolder = dynamicValueHolder;
        }
        return dynamicValueHolder == null ? getHighSpeedVideoSizes(value) : dynamicValueHolder;
    }

    private static androidx.compose.runtime.ValueHolder<T> getHighSpeedVideoSizes(androidx.compose.runtime.ProvidedValue<T> p0) {
        if (!p0.getIsDynamic()) {
            return p0.getCompute$runtime() != null ? new androidx.compose.runtime.ComputedValueHolder(p0.getCompute$runtime()) : p0.getState$runtime() != null ? new androidx.compose.runtime.DynamicValueHolder(p0.getState$runtime()) : new androidx.compose.runtime.StaticValueHolder(p0.getEffectiveValue$runtime());
        }
        androidx.compose.runtime.MutableState<T> state$runtime = p0.getState$runtime();
        if (state$runtime == null) {
            T value = p0.getValue();
            androidx.compose.runtime.SnapshotMutationPolicy<T> mutationPolicy$runtime = p0.getMutationPolicy$runtime();
            if (mutationPolicy$runtime == null) {
                mutationPolicy$runtime = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime);
        }
        return new androidx.compose.runtime.DynamicValueHolder(state$runtime);
    }
}
