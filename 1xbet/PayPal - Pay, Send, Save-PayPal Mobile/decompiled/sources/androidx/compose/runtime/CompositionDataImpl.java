package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u0004\u0018\u00010\u0003*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/runtime/CompositionDataImpl;", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "Landroidx/compose/runtime/Composition;", "composition", "<init>", "(Landroidx/compose/runtime/Composition;)V", "", "identityToFind", "Landroidx/compose/runtime/tooling/CompositionGroup;", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "findContextGroup", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/Composition;", "getComposition", "()Landroidx/compose/runtime/Composition;", "", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "isEmpty", "()Z", "getParent", "()Landroidx/compose/runtime/tooling/CompositionInstance;", "parent", "getData", "()Landroidx/compose/runtime/tooling/CompositionData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/Composition;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionDataImpl implements androidx.compose.runtime.tooling.CompositionData, androidx.compose.runtime.tooling.CompositionInstance {
    public static final int $stable = 8;
    private final androidx.compose.runtime.Composition composition;

    public CompositionDataImpl(androidx.compose.runtime.Composition composition) {
        this.composition = composition;
    }

    public final androidx.compose.runtime.Composition getComposition() {
        return this.composition;
    }

    public final int hashCode() {
        return this.composition.hashCode() * 31;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.runtime.CompositionDataImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.composition, ((androidx.compose.runtime.CompositionDataImpl) other).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final androidx.compose.runtime.tooling.CompositionInstance getParent() {
        androidx.compose.runtime.Composition Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.composition);
        return Camera2StreamConfigurationMap != null ? new androidx.compose.runtime.CompositionDataImpl(Camera2StreamConfigurationMap) : null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final androidx.compose.runtime.tooling.CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final androidx.compose.runtime.tooling.CompositionGroup findContextGroup() {
        java.lang.Integer findSubcompositionContextGroup;
        androidx.compose.runtime.Composition Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.composition);
        if (Camera2StreamConfigurationMap != null) {
            androidx.compose.runtime.CompositionImpl compositionImpl = Camera2StreamConfigurationMap instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) Camera2StreamConfigurationMap : null;
            androidx.compose.runtime.SlotTable slotTable = compositionImpl != null ? compositionImpl.getSlotTable() : null;
            if (slotTable != null) {
                androidx.compose.runtime.Composition composition = this.composition;
                androidx.compose.runtime.CompositionImpl compositionImpl2 = composition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) composition : null;
                androidx.compose.runtime.CompositionContext parent = compositionImpl2 != null ? compositionImpl2.getParent() : null;
                if (parent != null && (findSubcompositionContextGroup = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.findSubcompositionContextGroup(slotTable, parent)) != null) {
                    return androidx.compose.runtime.SlotTableKt.compositionGroupOf(slotTable, findSubcompositionContextGroup.intValue());
                }
            }
        }
        return null;
    }

    private static androidx.compose.runtime.Composition Camera2StreamConfigurationMap(androidx.compose.runtime.Composition composition) {
        androidx.compose.runtime.CompositionImpl compositionImpl = composition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) composition : null;
        androidx.compose.runtime.CompositionContext parent = compositionImpl != null ? compositionImpl.getParent() : null;
        if (parent != null) {
            return parent.getComposition$runtime();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final androidx.compose.runtime.tooling.CompositionGroup find(java.lang.Object identityToFind) {
        androidx.compose.runtime.Composition composition = this.composition;
        kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "");
        return ((androidx.compose.runtime.CompositionImpl) composition).getSlotTable().find(identityToFind);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> getCompositionGroups() {
        androidx.compose.runtime.Composition composition = this.composition;
        kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "");
        return ((androidx.compose.runtime.CompositionImpl) composition).getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        androidx.compose.runtime.Composition composition = this.composition;
        kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "");
        return ((androidx.compose.runtime.CompositionImpl) composition).getSlotTable().isEmpty();
    }
}
