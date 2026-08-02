package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0019\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0014\u0010&\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "p0", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "p1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "p2", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "", "", "getKey", "(I)Ljava/lang/Object;", "getIndex", "(Ljava/lang/Object;)I", "getContentType", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getHighResolutionOutputSizeshNQ4ISI", "getItemCount", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyStaggeredGridItemProviderImpl implements androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState getHighSpeedVideoFpsRanges;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent getHighSpeedVideoSizes;

    public LazyStaggeredGridItemProviderImpl(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.getHighSpeedVideoFpsRanges = lazyStaggeredGridState;
        this.getHighSpeedVideoSizes = lazyStaggeredGridIntervalContent;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    /* renamed from: getKeyIndexMap, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.getHighSpeedVideoSizes.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getKey(int p0) {
        java.lang.Object key = getGetHighResolutionOutputSizeshNQ4ISI().getKey(p0);
        return key == null ? this.getHighSpeedVideoSizes.getKey(p0) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(java.lang.Object p0) {
        return getGetHighResolutionOutputSizeshNQ4ISI().getIndex(p0);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getContentType(int p0) {
        return this.getHighSpeedVideoSizes.getContentType(p0);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(final int i, final java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(89098518);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(89098518, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:75)");
            }
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, this.getHighSpeedVideoFpsRanges.getPinnedItems(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(608834466, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.this, i, obj, i2, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoSizes;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl lazyStaggeredGridItemProviderImpl, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(608834466, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:77)");
            }
            androidx.compose.foundation.lazy.layout.IntervalList.Interval<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> interval = lazyStaggeredGridItemProviderImpl.getHighSpeedVideoSizes.getIntervals().get(i);
            interval.getValue().getItem().invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScopeImpl.INSTANCE, java.lang.Integer.valueOf(i - interval.getStartIndex()), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.getHighSpeedVideoSizes.getSpanProvider();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl) p0).getHighSpeedVideoSizes);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl lazyStaggeredGridItemProviderImpl, int i, java.lang.Object obj, int i2, androidx.compose.runtime.Composer composer) {
        lazyStaggeredGridItemProviderImpl.Item(i, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
