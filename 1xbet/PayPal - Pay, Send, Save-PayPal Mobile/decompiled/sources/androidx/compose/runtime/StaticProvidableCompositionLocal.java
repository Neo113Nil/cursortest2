package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticProvidableCompositionLocal<T> extends androidx.compose.runtime.ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    public StaticProvidableCompositionLocal(kotlin.jvm.functions.Function0<? extends T> function0) {
        super(function0);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final androidx.compose.runtime.ProvidedValue<T> defaultProvidedValue$runtime(T value) {
        return new androidx.compose.runtime.ProvidedValue<>(this, value, value == null, null, null, null, false);
    }
}
