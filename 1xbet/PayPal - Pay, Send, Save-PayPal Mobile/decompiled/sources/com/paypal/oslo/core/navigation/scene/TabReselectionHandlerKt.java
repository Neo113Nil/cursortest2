package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"TabReselectionHandler", "", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "onRefresh", "Lkotlin/Function0;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TabReselectionHandlerKt {
    public static final void TabReselectionHandler(final androidx.compose.foundation.lazy.LazyListState lazyListState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1601456931);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                lazyListState = null;
            }
            if (i5 != 0) {
                function0 = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1601456931, i3, -1, "com.paypal.oslo.core.navigation.scene.TabReselectionHandler (TabReselectionHandler.kt:70)");
            }
            com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder l1TabReselectionHolder = (com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.L1TabReselectionHolderKt.getLocalL1TabReselection());
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 3) & 14);
            boolean changedInstance = startRestartGroup.changedInstance(l1TabReselectionHolder);
            boolean z = (i3 & 14) == 4;
            boolean changed = startRestartGroup.changed(rememberUpdatedState);
            com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$1$1(l1TabReselectionHolder, lazyListState, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(l1TabReselectionHolder, lazyListState, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i3 << 3) & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.m11620$r8$lambda$TeSw8AOERPbmCQYu3aU2QSfd7U(androidx.compose.foundation.lazy.LazyListState.this, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TabReselectionHandler(final androidx.compose.foundation.ScrollState scrollState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2042815752);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                function0 = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2042815752, i3, -1, "com.paypal.oslo.core.navigation.scene.TabReselectionHandler (TabReselectionHandler.kt:136)");
            }
            com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder l1TabReselectionHolder = (com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.L1TabReselectionHolderKt.getLocalL1TabReselection());
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 3) & 14);
            boolean changedInstance = startRestartGroup.changedInstance(l1TabReselectionHolder);
            boolean z = (i3 & 14) == 4;
            boolean changed = startRestartGroup.changed(rememberUpdatedState);
            com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1(l1TabReselectionHolder, scrollState, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(l1TabReselectionHolder, scrollState, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i3 << 3) & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.$r8$lambda$CpSy_fZdHXkz2rKDilyUYf2iQVM(androidx.compose.foundation.ScrollState.this, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CpSy_fZdHXkz2rKDilyUYf2iQVM(androidx.compose.foundation.ScrollState scrollState, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TabReselectionHandler(scrollState, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TeSw8-AOERPbmCQYu3aU2QSfd7U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11620$r8$lambda$TeSw8AOERPbmCQYu3aU2QSfd7U(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TabReselectionHandler(lazyListState, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
