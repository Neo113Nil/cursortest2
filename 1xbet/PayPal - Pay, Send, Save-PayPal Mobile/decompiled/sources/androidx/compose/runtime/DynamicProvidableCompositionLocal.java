package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicProvidableCompositionLocal<T> extends androidx.compose.runtime.ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.SnapshotMutationPolicy<T> getHighSpeedVideoFpsRangesFor;

    public DynamicProvidableCompositionLocal(androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy, kotlin.jvm.functions.Function0<? extends T> function0) {
        super(function0);
        this.getHighSpeedVideoFpsRangesFor = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final androidx.compose.runtime.ProvidedValue<T> defaultProvidedValue$runtime(T value) {
        return new androidx.compose.runtime.ProvidedValue<>(this, value, value == null, this.getHighSpeedVideoFpsRangesFor, null, null, true);
    }
}
