package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010'\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "", "index", "", "key", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getKey", "(I)Ljava/lang/Object;", "getIndex", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/pager/PagerState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/pager/PagerScopeImpl;", "Landroidx/compose/foundation/pager/PagerScopeImpl;", "getHighResolutionOutputSizeshNQ4ISI", "getItemCount", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerLazyLayoutItemProvider implements androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.pager.PagerIntervalContent> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerScopeImpl getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerScopeImpl.INSTANCE;

    public PagerLazyLayoutItemProvider(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.pager.PagerIntervalContent> lazyLayoutIntervalContent, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.getHighSpeedVideoFpsRanges = pagerState;
        this.Camera2StreamConfigurationMap = lazyLayoutIntervalContent;
        this.getHighSpeedVideoSizes = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.Camera2StreamConfigurationMap.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(final int i, final java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1201380429);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:208)");
            }
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, this.getHighSpeedVideoFpsRanges.getPinnedPages(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1142237095, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.this, i, obj, i2, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1142237095, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:210)");
            }
            androidx.compose.foundation.lazy.layout.IntervalList.Interval<androidx.compose.foundation.pager.PagerIntervalContent> interval = pagerLazyLayoutItemProvider.Camera2StreamConfigurationMap.getIntervals().get(i);
            interval.getValue().getItem().invoke(pagerLazyLayoutItemProvider.getHighResolutionOutputSizeshNQ4ISI, java.lang.Integer.valueOf(i - interval.getStartIndex()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final java.lang.Object getKey(int index) {
        java.lang.Object key = this.getHighSpeedVideoSizes.getKey(index);
        return key == null ? this.Camera2StreamConfigurationMap.getKey(index) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.getIndex(key);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.compose.foundation.pager.PagerLazyLayoutItemProvider) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.foundation.pager.PagerLazyLayoutItemProvider) other).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, java.lang.Object obj, int i2, androidx.compose.runtime.Composer composer) {
        pagerLazyLayoutItemProvider.Item(i, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
