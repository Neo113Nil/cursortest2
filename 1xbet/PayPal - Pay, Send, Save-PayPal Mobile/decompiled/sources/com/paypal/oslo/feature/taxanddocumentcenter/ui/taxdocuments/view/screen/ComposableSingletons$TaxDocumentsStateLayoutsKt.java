package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$TaxDocumentsStateLayoutsKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1138529829, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt.$r8$lambda$zvUfnzjOD4NJHo_BKdlqV7BWAO8((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$zvUfnzjOD4NJHo_BKdlqV7BWAO8(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1138529829, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt.lambda$1138529829.<anonymous> (TaxDocumentsStateLayouts.kt:224)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "reports_loading_indicator"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1138529829$tax_and_document_center_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
