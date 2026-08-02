package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SingleCategoryCardRendererKt {
    /* renamed from: $r8$lambda$Bc-Z6iMlza06nFE-F97ItD5iYhs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19213$r8$lambda$BcZ6iMlza06nFEF97ItD5iYhs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-685046334);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-685046334, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRendererPreview (SingleCategoryCardRenderer.kt:59)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel categoryCardViewModel = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel(com.paypal.oslo.feature.searchandintelligence.ui.preview.PreviewUtilsKt.getPreviewSearchAndIntelligence());
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
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$SearchAndIntelligencePreview$3$1$previewHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$SearchAndIntelligencePreview$3$1$previewHandler$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.ProvidedValue<?> provides = com.paypal.oslo.core.commonui.components.LocalAsyncImagePreviewHandler.INSTANCE.provides(new com.paypal.oslo.core.commonui.components.AsyncImagePreviewHandler((kotlin.jvm.functions.Function0) rememberedValue));
            androidx.view.viewmodel.compose.LocalViewModelStoreOwner localViewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE;
            androidx.view.ViewModelStore viewModelStore = new androidx.view.ViewModelStore();
            viewModelStore.put("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(java.lang.String.valueOf(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel.class.getCanonicalName())), categoryCardViewModel);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{provides, localViewModelStoreOwner.provides(new com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt$fakeViewModelStoreOwner$1(viewModelStore))}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1132503358, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRendererKt$SingleCategoryCardRendererPreview$$inlined$SearchAndIntelligencePreview$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1132503358, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreview.<anonymous>.<anonymous>.<anonymous> (SearchAndIntelligencePreview.kt:70)");
                    }
                    composer2.startReplaceGroup(1327258865);
                    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.Render$default(new com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard(new com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard("Running Shoes", "https://example.com/shoes.jpg", (java.lang.String) null, (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, new com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRenderer(), composer2, 0, 2);
                    composer2.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRendererKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.SingleCategoryCardRendererKt.m19213$r8$lambda$BcZ6iMlza06nFEF97ItD5iYhs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
