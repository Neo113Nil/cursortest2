package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$AccordionKt {
    public static final com.paypal.pds.components.ComposableSingletons$AccordionKt INSTANCE = new com.paypal.pds.components.ComposableSingletons$AccordionKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1584617043, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.ComposableSingletons$AccordionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.pds.components.ComposableSingletons$AccordionKt.$r8$lambda$XwazN48MPxak4fjU_lKEqy8_3Kc((com.paypal.pds.components.AccordionHeaderScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-288681223, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.ComposableSingletons$AccordionKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.pds.components.ComposableSingletons$AccordionKt.$r8$lambda$W80jDhTSGYAcbUQ4o04HBVNa18M((com.paypal.pds.components.AccordionBodyScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(467391736, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.ComposableSingletons$AccordionKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.pds.components.ComposableSingletons$AccordionKt.$r8$lambda$kK4nD3PHc34Dy_3fMylEHF75yTQ((com.paypal.pds.components.AccordionHeaderScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-268689084, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.ComposableSingletons$AccordionKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.pds.components.ComposableSingletons$AccordionKt.$r8$lambda$eXtNzigly1UaxFfl9hDOtkDsEfw((com.paypal.pds.components.AccordionBodyScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$W80jDhTSGYAcbUQ4o04HBVNa18M(com.paypal.pds.components.AccordionBodyScope accordionBodyScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(accordionBodyScope) : composer.changedInstance(accordionBodyScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 131) != 130, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-288681223, i, -1, "com.paypal.pds.components.ComposableSingletons$AccordionKt.lambda$-288681223.<anonymous> (Accordion.kt:388)");
            }
            com.paypal.pds.components.AccordionBodyScope.ComposeDefaultImpls.Body$default("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do Go back and double tap to close", accordionBodyScope, composer, ((i << 6) & 896) | 54, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XwazN48MPxak4fjU_lKEqy8_3Kc(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i & 48) == 0) {
            i2 = i | (composer.changed(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1584617043, i2, -1, "com.paypal.pds.components.ComposableSingletons$AccordionKt.lambda$-1584617043.<anonymous> (Accordion.kt:377)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, false, 0, 0, null, null, composer, ((i2 >> 3) & 14) | 48, 0, 2044);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eXtNzigly1UaxFfl9hDOtkDsEfw(com.paypal.pds.components.AccordionBodyScope accordionBodyScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (composer.shouldExecute((i & 129) != 128, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-268689084, i, -1, "com.paypal.pds.components.ComposableSingletons$AccordionKt.lambda$-268689084.<anonymous> (Accordion.kt:411)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Custom Body Example -- it's a body!", null, null, null, null, null, false, 0, 0, null, null, composer, 6, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kK4nD3PHc34Dy_3fMylEHF75yTQ(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(accordionHeaderScope) : composer.changedInstance(accordionHeaderScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 131) != 130, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(467391736, i, -1, "com.paypal.pds.components.ComposableSingletons$AccordionKt.lambda$467391736.<anonymous> (Accordion.kt:408)");
            }
            com.paypal.pds.components.AccordionHeaderScope.ComposeDefaultImpls.Header$default("Header", null, accordionHeaderScope, composer, ((i << 6) & 896) | 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$467391736$pds_release() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-288681223$pds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21721getLambda$288681223$pds_release() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getLambda$-268689084$pds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21720getLambda$268689084$pds_release() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1584617043$pds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21719getLambda$1584617043$pds_release() {
        return Camera2StreamConfigurationMap;
    }
}
