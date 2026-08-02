package com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"p\u0010\u0000\u001aW\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012E\u0012C\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\f0\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"termsComponentRenderers", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "", "onAccept", "Landroidx/compose/runtime/Composable;", "getTermsComponentRenderers", "()Ljava/util/Map;", "termsComponentRenderers$delegate", "Lkotlin/Lazy;", "TermsStepScreenContent", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terms/domain/TermsStepComponentConfig;", "onSubmit", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terms/domain/TermsStepComponentConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsStepScreenContentKt {
    private static final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.Map mapOf;
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.ComposableSingletons$TermsStepScreenContentKt.INSTANCE.m16872getLambda$1210396991$one_onboarding_prodRelease()), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.BalanceTermsViewComponentConfig.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.ComposableSingletons$TermsStepScreenContentKt.INSTANCE.getLambda$2047453728$one_onboarding_prodRelease()), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.ppdcterms.domain.PPDCTermsViewComponentConfig.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.ComposableSingletons$TermsStepScreenContentKt.INSTANCE.getLambda$1010337151$one_onboarding_prodRelease()));
            return mapOf;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TermsStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig termsStepComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-503294756);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(termsStepComponentConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i3 = i4;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-503294756, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContent (TermsStepScreenContent.kt:96)");
                }
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1558794650);
                for (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig : termsStepComponentConfig.getComponents()) {
                    kotlin.jvm.functions.Function4 function4 = (kotlin.jvm.functions.Function4) ((java.util.Map) Camera2StreamConfigurationMap.getValue()).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig.getClass()));
                    if (function4 != null) {
                        startRestartGroup.startReplaceGroup(-953442804);
                        function4.invoke(viewComponentConfig, function1, startRestartGroup, java.lang.Integer.valueOf(i3 & 112));
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-953367908);
                        startRestartGroup.endReplaceGroup();
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "unknown";
                        }
                        com.paypal.android.logger.Logger.w$default(logger, "Unknown Terms Component", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("componentType", simpleName)), null, 4, null);
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentKt.$r8$lambda$TcRwpQIX0_x3boY0xSZilji4r_c(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TcRwpQIX0_x3boY0xSZilji4r_c(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig termsStepComponentConfig, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsStepScreenContent(termsStepComponentConfig, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
