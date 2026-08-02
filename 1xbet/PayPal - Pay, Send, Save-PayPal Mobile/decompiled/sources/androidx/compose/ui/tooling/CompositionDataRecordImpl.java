package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecordImpl;", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "<init>", "()V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getStore", "()Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CompositionDataRecordImpl implements androidx.compose.ui.tooling.CompositionDataRecord {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.runtime.tooling.CompositionData> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    @Override // androidx.compose.ui.tooling.CompositionDataRecord
    public final java.util.Set<androidx.compose.runtime.tooling.CompositionData> getStore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
