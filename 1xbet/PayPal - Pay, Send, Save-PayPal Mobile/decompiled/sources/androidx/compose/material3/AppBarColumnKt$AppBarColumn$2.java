package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppBarColumnKt$AppBarColumn$2 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.AppBarMenuState Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.AppBarMenuState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.material3.AppBarColumnScopeImpl> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.AppBarOverflowState getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1681423992, intValue, -1, "androidx.compose.material3.AppBarColumn.<anonymous> (AppBarColumn.kt:71)");
            }
            kotlin.jvm.functions.Function3<androidx.compose.material3.AppBarMenuState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.material3.AppBarMenuState appBarMenuState = this.Camera2StreamConfigurationMap;
            final androidx.compose.material3.AppBarOverflowState appBarOverflowState = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.State<androidx.compose.material3.AppBarColumnScopeImpl> state = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function3.invoke(appBarMenuState, composer2, 6);
            boolean isExpanded = appBarMenuState.isExpanded();
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.AppBarColumnKt$AppBarColumn$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.AppBarColumnKt$AppBarColumn$2.getHighSpeedVideoFpsRanges(androidx.compose.material3.AppBarMenuState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.AndroidMenu_androidKt.m2885DropdownMenuIlH_yew(isExpanded, (kotlin.jvm.functions.Function0) rememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(703704227, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.AppBarColumnKt$AppBarColumn$2$1$2
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (!composer4.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(703704227, intValue2, -1, "androidx.compose.material3.AppBarColumn.<anonymous>.<anonymous>.<anonymous> (AppBarColumn.kt:77)");
                        }
                        java.util.List<androidx.compose.material3.AppBarItem> subList = androidx.compose.material3.AppBarColumnKt.access$AppBarColumn$lambda$2(state).getItems().subList(androidx.compose.material3.AppBarOverflowState.this.getVisibleItemCount(), androidx.compose.material3.AppBarOverflowState.this.getTotalItemCount());
                        androidx.compose.material3.AppBarMenuState appBarMenuState2 = appBarMenuState;
                        int size = subList.size();
                        for (int i = 0; i < size; i++) {
                            subList.get(i).MenuContent(appBarMenuState2, composer4, 6);
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 48, 48, 2044);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.AppBarMenuState appBarMenuState) {
        appBarMenuState.dismiss();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppBarColumnKt$AppBarColumn$2(kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.material3.AppBarMenuState appBarMenuState, androidx.compose.material3.AppBarOverflowState appBarOverflowState, androidx.compose.runtime.State<androidx.compose.material3.AppBarColumnScopeImpl> state) {
        this.getHighSpeedVideoFpsRanges = function3;
        this.Camera2StreamConfigurationMap = appBarMenuState;
        this.getHighSpeedVideoSizes = appBarOverflowState;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
