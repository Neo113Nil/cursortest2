package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "entry1", "entries", "<init>", "(Lkotlin/Pair;[Lkotlin/Pair;)V", "T", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "get$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", "contains$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiLocalMap extends androidx.compose.ui.modifier.ModifierLocalMap {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.compose.ui.modifier.ModifierLocal<?>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    public MultiLocalMap(kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object> pair, kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object>... pairArr) {
        super(null);
        androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.compose.ui.modifier.ModifierLocal<?>, java.lang.Object> mutableStateMapOf = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
        this.getHighResolutionOutputSizeshNQ4ISI = mutableStateMapOf;
        mutableStateMapOf.put(pair.getFirst(), pair.getSecond());
        mutableStateMapOf.putAll(kotlin.collections.MapsKt.toMap(pairArr));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public final <T> void mo7494set$ui(androidx.compose.ui.modifier.ModifierLocal<T> key, T value) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(key, value);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final <T> T get$ui(androidx.compose.ui.modifier.ModifierLocal<T> key) {
        T t = (T) this.getHighResolutionOutputSizeshNQ4ISI.get(key);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean contains$ui(androidx.compose.ui.modifier.ModifierLocal<?> key) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(key);
    }
}
