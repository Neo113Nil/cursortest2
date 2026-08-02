package com.paypal.oslo.feature.merchantbanking.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$AccountRoutingAccordionKt {
    public static final com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt INSTANCE = new com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1161701953, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.$r8$lambda$ue5rz_tDodQnUs5TgvPdj63uV7U((com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-820097943, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.$r8$lambda$BKSXKc_aRSmJhuPUgzkyMVll9oY((com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$BKSXKc_aRSmJhuPUgzkyMVll9oY(com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arnAccordionItemDTO, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-820097943, i, -1, "com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.lambda$-820097943.<anonymous> (AccountRoutingAccordion.kt:77)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
        composer.startReplaceGroup(521666226);
        java.util.Iterator<T> it = arnAccordionItemDTO.getBodyList().iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.BulletLabel((java.lang.String) it.next(), composer, 0);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GL0PoDVLRRjmqsdJX00rzveJ7w0(com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, arnAccordionItemDTO.getHeader());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ue5rz_tDodQnUs5TgvPdj63uV7U(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, final com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arnAccordionItemDTO, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1161701953, i, -1, "com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.lambda$-1161701953.<anonymous> (AccountRoutingAccordion.kt:70)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean changedInstance = composer.changedInstance(arnAccordionItemDTO);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.$r8$lambda$GL0PoDVLRRjmqsdJX00rzveJ7w0(com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(arnAccordionItemDTO.getHeader(), androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 0, 6, 1020);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-820097943$merchant_banking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15593getLambda$820097943$merchant_banking_prodRelease() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-1161701953$merchant_banking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15592getLambda$1161701953$merchant_banking_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
