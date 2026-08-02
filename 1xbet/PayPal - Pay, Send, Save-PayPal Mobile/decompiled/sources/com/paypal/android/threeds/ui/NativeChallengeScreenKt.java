package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;", "challengeViewModel", "", "challengeScreen", "Lkotlin/Function0;", "", "navigateUp", "NativeChallengeScreen", "(Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NativeChallengeScreenKt {
    @com.paypal.android.threeds.jacoco.ExcludeJacocoGeneratedReport
    public static final void NativeChallengeScreen(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1849380170);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(challengeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1849380170, i2, -1, "com.paypal.android.threeds.ui.NativeChallengeScreen (NativeChallengeScreen.kt:41)");
            }
            composer2 = startRestartGroup;
            androidx.compose.material.ScaffoldKt.m2719Scaffold27mzLpw(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1349904529, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.NativeChallengeScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.NativeChallengeScreenKt.$r8$lambda$dzdt74julbfaHbVBlHMxfeBiG9U(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-228084296, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ui.NativeChallengeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.android.threeds.ui.NativeChallengeScreenKt.$r8$lambda$HFcM41MCMm9eBqxAvtFgEOPsGb0(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, str, (androidx.compose.foundation.layout.PaddingValues) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), composer2, 384, 12582912, 131067);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.NativeChallengeScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.NativeChallengeScreenKt.$r8$lambda$TBgG8cqw2W_s5KMEWfGbmCDQbZM(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1RgVh9FTe0pwTEsPlv9UI1MR6Kc(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeRequest, "");
        challengeViewModel.initChallenge(challengeRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HFcM41MCMm9eBqxAvtFgEOPsGb0(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, java.lang.String str, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        java.lang.String whyInfoLabel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-228084296, i2, -1, "com.paypal.android.threeds.ui.NativeChallengeScreen.<anonymous> (NativeChallengeScreen.kt:45)");
            }
            com.paypal.android.threeds.data.model.ChallengeResponse value = challengeViewModel.getChallengeResponse().getValue();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.paypal.android.threeds.R.color.background, composer, 0), null, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 6);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1286backgroundbw27NRU$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(hashCode2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(hashCode2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (challengeViewModel.getProgressDialogState()) {
                composer.startReplaceGroup(-1243250176);
                com.paypal.android.threeds.ui.ThreeDsChallengeProgressViewKt.ThreeDsChallengeProgressView(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1243182906);
                composer.endReplaceGroup();
            }
            if (value != null) {
                composer.startReplaceGroup(-1243103360);
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues), 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(hashCode3))) {
                    m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(hashCode3));
                    m5299constructorimpl3.apply(java.lang.Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (value.getIssuerImage() == null && value.getPsImage() == null) {
                    composer.startReplaceGroup(2092870542);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2092749456);
                    com.paypal.android.threeds.ui.BrandingViewKt.BrandingView(value.getIssuerImage(), value.getPsImage(), null, composer, 0, 4);
                    composer.endReplaceGroup();
                }
                boolean changedInstance = composer.changedInstance(challengeViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.NativeChallengeScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.android.threeds.ui.NativeChallengeScreenKt.$r8$lambda$1RgVh9FTe0pwTEsPlv9UI1MR6Kc(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, (com.paypal.android.threeds.data.model.ChallengeRequest) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.android.threeds.ui.ChallengeViewKt.ChallengeView(value, str, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 0, 8);
                java.lang.String expandInfoLabel = value.getExpandInfoLabel();
                if ((expandInfoLabel == null || kotlin.text.StringsKt.isBlank(expandInfoLabel)) && ((whyInfoLabel = value.getWhyInfoLabel()) == null || kotlin.text.StringsKt.isBlank(whyInfoLabel))) {
                    composer.startReplaceGroup(2093371502);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2093285012);
                    com.paypal.android.threeds.ui.InformationViewKt.InformationView(value, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1242113530);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TBgG8cqw2W_s5KMEWfGbmCDQbZM(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        NativeChallengeScreen(challengeViewModel, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dzdt74julbfaHbVBlHMxfeBiG9U(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1349904529, i, -1, "com.paypal.android.threeds.ui.NativeChallengeScreen.<anonymous> (NativeChallengeScreen.kt:43)");
            }
            com.paypal.android.threeds.ui.ToolbarViewKt.ToolbarView(function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
