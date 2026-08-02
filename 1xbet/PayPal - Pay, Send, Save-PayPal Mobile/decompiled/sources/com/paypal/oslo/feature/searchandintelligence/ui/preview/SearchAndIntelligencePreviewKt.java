package com.paypal.oslo.feature.searchandintelligence.ui.preview;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a<\u0010\u0004\u001a\u00020\u0001\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "SearchAndIntelligencePreview", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/ViewModel;", "T", "viewModel", "(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchAndIntelligencePreviewKt {
    public static final void SearchAndIntelligencePreview(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(155226958);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(155226958, i2, -1, "com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreview (SearchAndIntelligencePreview.kt:36)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        com.paypal.oslo.core.commonui.components.Image ColorImage$default;
                        ColorImage$default = com.paypal.oslo.core.commonui.components.AsyncImageKt.ColorImage$default(-7829368, 0, 0, 6, null);
                        return ColorImage$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.core.commonui.components.LocalAsyncImagePreviewHandler.INSTANCE.provides(new com.paypal.oslo.core.commonui.components.AsyncImagePreviewHandler((kotlin.jvm.functions.Function0) rememberedValue)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1755333914, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.$r8$lambda$xvkcpRJQcyYWwnLw8tFHVxLVXJc(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.$r8$lambda$faEJIIk_CpBvRTpUNZUz7o2tUDE(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final /* synthetic */ <T extends androidx.view.ViewModel> void SearchAndIntelligencePreview(T t, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 54, 2);
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, background);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$SearchAndIntelligencePreview$3$1$previewHandler$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$SearchAndIntelligencePreview$3$1$previewHandler$1$1.INSTANCE;
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.ProvidedValue<?> provides = com.paypal.oslo.core.commonui.components.LocalAsyncImagePreviewHandler.INSTANCE.provides(new com.paypal.oslo.core.commonui.components.AsyncImagePreviewHandler((kotlin.jvm.functions.Function0) rememberedValue));
        androidx.view.viewmodel.compose.LocalViewModelStoreOwner localViewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE;
        androidx.view.ViewModelStore viewModelStore = new androidx.view.ViewModelStore();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        viewModelStore.put("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(java.lang.String.valueOf(androidx.view.ViewModel.class.getCanonicalName())), t);
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{provides, localViewModelStoreOwner.provides(new com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$fakeViewModelStoreOwner$1(viewModelStore))}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1132503358, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$SearchAndIntelligencePreview$3$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1132503358, i2, -1, "com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreview.<anonymous>.<anonymous>.<anonymous> (SearchAndIntelligencePreview.kt:70)");
                }
                function2.invoke(composer2, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        composer.endNode();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$faEJIIk_CpBvRTpUNZUz7o2tUDE(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        SearchAndIntelligencePreview(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xvkcpRJQcyYWwnLw8tFHVxLVXJc(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1755333914, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreview.<anonymous>.<anonymous>.<anonymous> (SearchAndIntelligencePreview.kt:43)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
