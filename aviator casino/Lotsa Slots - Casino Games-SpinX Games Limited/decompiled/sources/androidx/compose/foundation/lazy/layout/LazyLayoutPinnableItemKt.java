package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutPinnableItem.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"LazyLayoutPinnableItem", "", com.ironsource.X3.i.W, "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(final java.lang.Object obj, final int i, final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i2) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2079116560);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyLayoutPinnableItem)P(2,1,3)53@2119L77,55@2294L7,56@2306L74,57@2385L103:LazyLayoutPinnableItem.kt#wow0x6");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2079116560, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        startRestartGroup.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lazyLayoutPinnedItemList);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem lazyLayoutPinnableItem = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem) rememberedValue;
        lazyLayoutPinnableItem.setIndex(i);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.layout.PinnableContainer> localPinnableContainer = androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localPinnableContainer);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        lazyLayoutPinnableItem.setParentPinnableContainer((androidx.compose.ui.layout.PinnableContainer) consume);
        startRestartGroup.startReplaceableGroup(-913235405);
        boolean changed2 = startRestartGroup.changed(lazyLayoutPinnableItem);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem lazyLayoutPinnableItem2 = androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem.this;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem.this.onDisposed();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), function2, startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | ((i2 >> 6) & 112));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i, lazyLayoutPinnedItemList, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
