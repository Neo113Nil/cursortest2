package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "", "index", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItemList", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "LazyLayoutPinnableItem", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(final java.lang.Object obj, final int i, final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(872548579);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(872548579, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean changed = startRestartGroup.changed(obj);
            boolean changed2 = startRestartGroup.changed(lazyLayoutPinnedItemList);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem lazyLayoutPinnableItem = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem) rememberedValue;
            lazyLayoutPinnableItem.Camera2StreamConfigurationMap(i);
            lazyLayoutPinnableItem.getHighSpeedVideoSizes((androidx.compose.ui.layout.PinnableContainer) startRestartGroup.consume(androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer()));
            boolean changed3 = startRestartGroup.changed(lazyLayoutPinnableItem);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem.this);
                        return highSpeedVideoFpsRanges;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), function2, startRestartGroup, ((i3 >> 6) & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj3).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.Camera2StreamConfigurationMap(obj, i, lazyLayoutPinnedItemList, function2, i2, (androidx.compose.runtime.Composer) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRanges(final androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem lazyLayoutPinnableItem) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem.this.getHighSpeedVideoSizes();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.lang.Object obj, int i, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList, kotlin.jvm.functions.Function2 function2, int i2, androidx.compose.runtime.Composer composer) {
        LazyLayoutPinnableItem(obj, i, lazyLayoutPinnedItemList, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
