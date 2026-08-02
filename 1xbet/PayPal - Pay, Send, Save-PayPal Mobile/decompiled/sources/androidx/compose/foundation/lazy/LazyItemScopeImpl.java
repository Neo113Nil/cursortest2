package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJC\u0010\u0016\u001a\u00020\n*\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "<init>", "()V", "", "width", "height", "", "setMaxSize", "(II)V", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "animateItem", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyItemScopeImpl implements androidx.compose.foundation.lazy.LazyItemScope {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    public final void setMaxSize(int width, int height) {
        this.getHighSpeedVideoSizes.setIntValue(width);
        this.Camera2StreamConfigurationMap.setIntValue(height);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final androidx.compose.ui.Modifier fillParentMaxSize(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(new androidx.compose.foundation.lazy.ParentSizeElement(f, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final androidx.compose.ui.Modifier fillParentMaxWidth(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(new androidx.compose.foundation.lazy.ParentSizeElement(f, this.getHighSpeedVideoSizes, null, "fillParentMaxWidth", 4, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final androidx.compose.ui.Modifier fillParentMaxHeight(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(new androidx.compose.foundation.lazy.ParentSizeElement(f, null, this.Camera2StreamConfigurationMap, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final androidx.compose.ui.Modifier animateItem(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3) {
        return (finiteAnimationSpec == null && finiteAnimationSpec2 == null && finiteAnimationSpec3 == null) ? modifier : modifier.then(new androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3));
    }
}
