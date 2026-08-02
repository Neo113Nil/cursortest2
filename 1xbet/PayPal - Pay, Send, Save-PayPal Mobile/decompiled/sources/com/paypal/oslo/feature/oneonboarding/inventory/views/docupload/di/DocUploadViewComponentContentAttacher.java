package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentContentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "rememberState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;", "", "onDocumentUpload", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Landroidx/compose/ui/Modifier;", "modifier", "state", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V", "AttachBottomSheet", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadViewComponentContentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberState(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(1201838173);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1201838173, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.rememberState (DocUploadViewComponentAttacher.kt:226)");
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return null;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem, kotlin.Unit> function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(1086583650);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1086583650, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.Attach (DocUploadViewComponentAttacher.kt:236)");
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewComponentContentKt.DocUploadViewComponentContent(modifier, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1400714256, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.m17024$r8$lambda$j5VLgCvAypcCE6boPvaYMUjrVE(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, ((i >> 9) & 14) | 48, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final void AttachBottomSheet(final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1453738268);
        int i2 = i & 1;
        if (startRestartGroup.shouldExecute(i2 != 0, i2)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1453738268, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.AttachBottomSheet (DocUploadViewComponentAttacher.kt:248)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.m17023$r8$lambda$Gsq4_24YoyweRR5yO2HoldsRu4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.this, docUploadWidgetState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$Gsq4_24YoyweRR5yO2Ho-ldsRu4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17023$r8$lambda$Gsq4_24YoyweRR5yO2HoldsRu4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher docUploadViewComponentContentAttacher, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, int i, androidx.compose.runtime.Composer composer, int i2) {
        docUploadViewComponentContentAttacher.AttachBottomSheet(docUploadWidgetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j5VLgCvAypcCE-6boPvaYMUjrVE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17024$r8$lambda$j5VLgCvAypcCE6boPvaYMUjrVE(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1400714256, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher.Attach.<anonymous> (DocUploadViewComponentAttacher.kt:240)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw("DocUpload:".concat(java.lang.String.valueOf(docUploadViewComponentConfig.getDocumentCategory().name())), (androidx.compose.ui.Modifier) null, (androidx.compose.ui.text.TextStyle) null, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, composer, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
