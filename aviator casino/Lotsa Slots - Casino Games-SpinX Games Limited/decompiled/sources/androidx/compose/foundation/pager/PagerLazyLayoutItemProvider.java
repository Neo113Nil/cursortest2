package androidx.compose.foundation.pager;

/* compiled from: LazyLayoutPager.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "itemCount", "", "getItemCount", "()I", "pagerScopeImpl", "Landroidx/compose/foundation/pager/PagerScopeImpl;", "Item", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, com.ironsource.X3.i.W, "", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "equals", "", "other", "getIndex", "getKey", "hashCode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider {
    public static final int $stable = 0;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.pager.PagerIntervalContent> intervalContent;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap keyIndexMap;
    private final androidx.compose.foundation.pager.PagerScopeImpl pagerScopeImpl = androidx.compose.foundation.pager.PagerScopeImpl.INSTANCE;
    private final androidx.compose.foundation.pager.PagerState state;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public /* synthetic */ java.lang.Object getContentType(int i) {
        return androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider.CC.$default$getContentType(this, i);
    }

    public PagerLazyLayoutItemProvider(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.pager.PagerIntervalContent> lazyLayoutIntervalContent, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = pagerState;
        this.intervalContent = lazyLayoutIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i, final java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i2) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1201380429);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Item)196@8244L209:LazyLayoutPager.kt#g6yjnt");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1201380429, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:195)");
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, this.state.getPinnedPages(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1142237095, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent lazyLayoutIntervalContent;
                androidx.compose.foundation.pager.PagerScopeImpl pagerScopeImpl;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C*198@8397L32:LazyLayoutPager.kt#g6yjnt");
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1142237095, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:197)");
                    }
                    lazyLayoutIntervalContent = androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.this.intervalContent;
                    int i4 = i;
                    androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.this;
                    androidx.compose.foundation.lazy.layout.IntervalList.Interval interval = lazyLayoutIntervalContent.getIntervals().get(i4);
                    int startIndex = i4 - interval.getStartIndex();
                    kotlin.jvm.functions.Function4<androidx.compose.foundation.pager.PagerScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> item = ((androidx.compose.foundation.pager.PagerIntervalContent) interval.getValue()).getItem();
                    pagerScopeImpl = pagerLazyLayoutItemProvider.pagerScopeImpl;
                    item.invoke(pagerScopeImpl, java.lang.Integer.valueOf(startIndex), composer2, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i2 << 3) & 112) | 3592);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.this.Item(i, obj, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public java.lang.Object getKey(int index) {
        java.lang.Object key = this.keyIndexMap.getKey(index);
        return key == null ? this.intervalContent.getKey(index) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(java.lang.Object key) {
        return this.keyIndexMap.getIndex(key);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.compose.foundation.pager.PagerLazyLayoutItemProvider) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intervalContent, ((androidx.compose.foundation.pager.PagerLazyLayoutItemProvider) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
