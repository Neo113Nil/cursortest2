package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u001b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Landroidx/compose/foundation/lazy/LazyListState;", "p0", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "p1", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "p2", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "p3", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListIntervalContent;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "", "", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getKey", "(I)Ljava/lang/Object;", "getContentType", "getIndex", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/LazyListState;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getItemScope", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getHighSpeedVideoFpsRangesFor", "getItemCount", "Landroidx/collection/IntList;", "getHeaderIndexes", "()Landroidx/collection/IntList;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyListItemProviderImpl implements androidx.compose.foundation.lazy.LazyListItemProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyItemScopeImpl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListIntervalContent getHighResolutionOutputSizeshNQ4ISI;

    public LazyListItemProviderImpl(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.lazy.LazyListIntervalContent lazyListIntervalContent, androidx.compose.foundation.lazy.LazyItemScopeImpl lazyItemScopeImpl, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.getHighSpeedVideoSizes = lazyListState;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyListIntervalContent;
        this.getHighSpeedVideoFpsRanges = lazyItemScopeImpl;
        this.getHighSpeedVideoFpsRangesFor = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    /* renamed from: getItemScope, reason: from getter */
    public final androidx.compose.foundation.lazy.LazyItemScopeImpl getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    /* renamed from: getKeyIndexMap, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(final int i, final java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-462424778);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, this.getHighSpeedVideoSizes.getPinnedItems(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-824725566, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyListItemProviderImpl.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListItemProviderImpl.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highSpeedVideoFpsRanges;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListItemProviderImpl.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.LazyListItemProviderImpl.this, i, obj, i2, (androidx.compose.runtime.Composer) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListItemProviderImpl lazyListItemProviderImpl, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-824725566, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            androidx.compose.foundation.lazy.layout.IntervalList.Interval<androidx.compose.foundation.lazy.LazyListInterval> interval = lazyListItemProviderImpl.getHighResolutionOutputSizeshNQ4ISI.getIntervals().get(i);
            interval.getValue().getItem().invoke(lazyListItemProviderImpl.getGetHighSpeedVideoFpsRanges(), java.lang.Integer.valueOf(i - interval.getStartIndex()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getKey(int p0) {
        java.lang.Object key = getGetHighSpeedVideoFpsRangesFor().getKey(p0);
        return key == null ? this.getHighResolutionOutputSizeshNQ4ISI.getKey(p0) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getContentType(int p0) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getContentType(p0);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final androidx.collection.IntList getHeaderIndexes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(java.lang.Object p0) {
        return getGetHighSpeedVideoFpsRangesFor().getIndex(p0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof androidx.compose.foundation.lazy.LazyListItemProviderImpl) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.foundation.lazy.LazyListItemProviderImpl) p0).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.LazyListItemProviderImpl lazyListItemProviderImpl, int i, java.lang.Object obj, int i2, androidx.compose.runtime.Composer composer) {
        lazyListItemProviderImpl.Item(i, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
