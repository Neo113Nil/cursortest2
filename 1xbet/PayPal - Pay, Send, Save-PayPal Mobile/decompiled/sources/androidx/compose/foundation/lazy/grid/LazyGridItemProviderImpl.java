package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001b\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0014\u0010\u001e\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "p0", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "p1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "p2", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "", "", "getKey", "(I)Ljava/lang/Object;", "getContentType", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getIndex", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getItemCount", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/IntList;", "getHeaderIndexes", "()Landroidx/collection/IntList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyGridItemProviderImpl implements androidx.compose.foundation.lazy.grid.LazyGridItemProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.grid.LazyGridIntervalContent Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoSizes;

    public LazyGridItemProviderImpl(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.lazy.grid.LazyGridIntervalContent lazyGridIntervalContent, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.getHighSpeedVideoSizes = lazyGridState;
        this.Camera2StreamConfigurationMap = lazyGridIntervalContent;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    /* renamed from: getKeyIndexMap, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.Camera2StreamConfigurationMap.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getKey(int p0) {
        java.lang.Object key = getGetHighResolutionOutputSizeshNQ4ISI().getKey(p0);
        return key == null ? this.Camera2StreamConfigurationMap.getKey(p0) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getContentType(int p0) {
        return this.Camera2StreamConfigurationMap.getContentType(p0);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final androidx.collection.IntList getHeaderIndexes() {
        return this.Camera2StreamConfigurationMap.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(final int i, final java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1493551140);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(this) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1493551140, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, this.getHighSpeedVideoSizes.getPinnedItems(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(726189336, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highSpeedVideoSizes;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.this, i, obj, i2, (androidx.compose.runtime.Composer) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl lazyGridItemProviderImpl, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(726189336, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:81)");
            }
            androidx.compose.foundation.lazy.layout.IntervalList.Interval<androidx.compose.foundation.lazy.grid.LazyGridInterval> interval = lazyGridItemProviderImpl.Camera2StreamConfigurationMap.getIntervals().get(i);
            interval.getValue().getItem().invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl.INSTANCE, java.lang.Integer.valueOf(i - interval.getStartIndex()), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.Camera2StreamConfigurationMap.getSpanLayoutProvider();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(java.lang.Object p0) {
        return getGetHighResolutionOutputSizeshNQ4ISI().getIndex(p0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl) p0).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl lazyGridItemProviderImpl, int i, java.lang.Object obj, int i2, androidx.compose.runtime.Composer composer) {
        lazyGridItemProviderImpl.Item(i, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
