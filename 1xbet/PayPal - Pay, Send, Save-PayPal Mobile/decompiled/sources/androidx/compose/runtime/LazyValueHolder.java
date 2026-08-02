package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00028\u00008CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", com.google.android.gms.common.internal.ImagesContract.LOCAL, "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyValueHolder<T> implements androidx.compose.runtime.ValueHolder<T> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    public LazyValueHolder(kotlin.jvm.functions.Function0<? extends T> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(function0);
    }

    private final T getHighResolutionOutputSizeshNQ4ISI() {
        return (T) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final T readValue(androidx.compose.runtime.PersistentCompositionLocalMap map) {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final androidx.compose.runtime.ProvidedValue<T> toProvided(androidx.compose.runtime.CompositionLocal<T> local) {
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new kotlin.KotlinNothingValueException();
    }
}
