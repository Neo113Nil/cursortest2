package com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"W9ConsentViewComponentContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/w9consent/domain/W9ConsentViewComponentConfig;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/w9consent/domain/W9ConsentViewComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onW9InstructionLinkClick", "url", "", "context", "Landroid/content/Context;", "W9ConsentViewComponentContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class W9ConsentViewComponentContentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void W9ConsentViewComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.domain.W9ConsentViewComponentConfig w9ConsentViewComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(w9ConsentViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1129441404);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(w9ConsentViewComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1129441404, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContent (W9ConsentViewComponentContent.kt:61)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId m16607boximpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(w9ConsentViewComponentConfig.mo16702getIdfHLlpbY());
                boolean z = (i3 & 14) == 4;
                com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$W9ConsentViewComponentContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$W9ConsentViewComponentContent$1$1(w9ConsentViewComponentConfig, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(m16607boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_item_1, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_item_2, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_item_3, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_item_4, startRestartGroup, 0)});
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.analytics.CIPW9StepAnalytics.MODULE_W9_CONSENT, 0, null, null, 14, null)), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, com.paypal.pds.components.CardCornerRadius.Radius12, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-298858154, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt.$r8$lambda$yM4tb0bvEw1apXBA6PbMPN3KmRo(listOf, intentId, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 806879280, 436);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt.$r8$lambda$kVOvup7fY_pD73TOMPp6gOS1hbU(com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.domain.W9ConsentViewComponentConfig.this, intentId, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void onW9InstructionLinkClick(java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.analytics.SavingsCipW9Analytics.INSTANCE.trackW9InstructionPressed$one_onboarding_prodRelease(intentId);
        com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.launchUrlInBrowser(str, context);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Sbw8T1NcxPpNI3cecmBD7LEBL2Q(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        onW9InstructionLinkClick(str2, intentId, context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eYx16uY-HogxUjKDRoviHC_i9Ek, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17110$r8$lambda$eYx16uYHogxUjKDRoviHC_i9Ek(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1995078968);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1995078968, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentPreview (W9ConsentViewComponentContent.kt:171)");
            }
            W9ConsentViewComponentContent(new com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.domain.W9ConsentViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview"), (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings(null, 1, null), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt.m17110$r8$lambda$eYx16uYHogxUjKDRoviHC_i9Ek(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kVOvup7fY_pD73TOMPp6gOS1hbU(com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.domain.W9ConsentViewComponentConfig w9ConsentViewComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        W9ConsentViewComponentContent(w9ConsentViewComponentConfig, intentId, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yM4tb0bvEw1apXBA6PbMPN3KmRo(java.util.List list, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-298858154, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContent.<anonymous> (W9ConsentViewComponentContent.kt:84)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing2());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_title, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_subtitle, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.runtime.Composer composer2 = composer;
            int i2 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            composer2.startReplaceGroup(645417127);
            int i3 = 0;
            for (java.lang.Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String str = (java.lang.String) obj;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 6);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i2));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i4);
                sb.append(".");
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
                composer.endNode();
                composer2 = composer;
                i3 = i4;
                i2 = 0;
            }
            composer.endReplaceGroup();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_instructions_text, composer, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_instructions_link, composer, 0), com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.ui.W9TermsUrls.W9_INSTRUCTIONS))), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
            boolean changedInstance = composer.changedInstance(intentId);
            boolean changedInstance2 = composer.changedInstance(context);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.ui.W9ConsentViewComponentContentKt.$r8$lambda$Sbw8T1NcxPpNI3cecmBD7LEBL2Q(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, context, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3, (java.lang.String) obj4);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, null, null, (kotlin.jvm.functions.Function3) rememberedValue, null, composer, com.paypal.pds.components.LegalConsentItem.$stable, 22);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_w9_consent_note, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
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
