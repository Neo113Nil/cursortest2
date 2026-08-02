package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002"}, d2 = {"", "LearnMoreScreen", "(Landroidx/compose/runtime/Composer;I)V", "LearnMoreScreenContent", "LearnMoreScreenPreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LearnMoreScreenKt {
    public static final void LearnMoreScreen(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(562590203);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(562590203, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreen (LearnMoreScreen.kt:32)");
            }
            LearnMoreScreenContent(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt.$r8$lambda$Z9HGwiGDnP3xsdqaY_M3JaoXEIo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LearnMoreScreenContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-69254384);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-69254384, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenContent (LearnMoreScreen.kt:37)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_details_learn_more_content, startRestartGroup, 0);
            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, bodyMedium, startRestartGroup, 384, 6, 1016);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt.$r8$lambda$K3EyBvOTiC3IVbHyfcj9BaP2hGM(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LearnMoreScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-278220895);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-278220895, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenPreview (LearnMoreScreen.kt:59)");
            }
            LearnMoreScreenContent(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt.$r8$lambda$BYcBACtVaY8PhnB7reRS6t2iIH4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BYcBACtVaY8PhnB7reRS6t2iIH4(int i, androidx.compose.runtime.Composer composer, int i2) {
        LearnMoreScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K3EyBvOTiC3IVbHyfcj9BaP2hGM(int i, androidx.compose.runtime.Composer composer, int i2) {
        LearnMoreScreenContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z9HGwiGDnP3xsdqaY_M3JaoXEIo(int i, androidx.compose.runtime.Composer composer, int i2) {
        LearnMoreScreen(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
