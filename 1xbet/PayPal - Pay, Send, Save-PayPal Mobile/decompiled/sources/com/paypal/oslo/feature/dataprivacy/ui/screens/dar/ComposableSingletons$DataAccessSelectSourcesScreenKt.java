package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$DataAccessSelectSourcesScreenKt {
    public static final com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1020417007, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.m14097$r8$lambda$i_fC4wrcmS8BOGQOZOGVL0BSxw((com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-158631749, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.$r8$lambda$XnlaSkiLo2U9DyjfHLppjkfA0Y8((com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$XnlaSkiLo2U9DyjfHLppjkfA0Y8(com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSection, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-158631749, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.lambda$-158631749.<anonymous> (DataAccessSelectSourcesScreen.kt:288)");
        }
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
        int i2 = 0;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        composer.startReplaceGroup(523228930);
        java.util.Iterator<T> it = dataSection.getItemsRes().iterator();
        while (it.hasNext()) {
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(((java.lang.Number) it.next()).intValue(), composer, i2), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            i2 = i2;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i-_fC4wrcmS8BOGQOZOGVL0BSxw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14097$r8$lambda$i_fC4wrcmS8BOGQOZOGVL0BSxw(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSection, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1020417007, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$DataAccessSelectSourcesScreenKt.lambda$-1020417007.<anonymous> (DataAccessSelectSourcesScreen.kt:281)");
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(dataSection.getTitleRes(), composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-158631749$data_privacy_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14099getLambda$158631749$data_privacy_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-1020417007$data_privacy_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14098getLambda$1020417007$data_privacy_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
