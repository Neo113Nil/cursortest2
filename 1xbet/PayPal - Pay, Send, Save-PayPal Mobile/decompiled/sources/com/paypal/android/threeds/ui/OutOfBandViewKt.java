package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "challengeResponse", "Landroidx/compose/runtime/MutableState;", "", "whiteListCheckedState", "Lkotlin/Function1;", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lkotlin/ParameterName;", "", "submitChallengeRequest", "OutOfBandView", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OutOfBandViewKt {
    public static final void OutOfBandView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2117823906);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(challengeResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2117823906, i3, -1, "com.paypal.android.threeds.ui.OutOfBandView (OutOfBandView.kt:40)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            boolean z = false;
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getChallengeInfoLabel(), androidx.compose.foundation.layout.AlignmentLineKt.m1585paddingFromBaselineVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM()), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM()), startRestartGroup, 6);
            java.lang.String oobContinueLabel = challengeResponse.getOobContinueLabel();
            if (oobContinueLabel == null) {
                startRestartGroup.startReplaceGroup(-1525611649);
                oobContinueLabel = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.continue_label, startRestartGroup, 0);
            } else {
                startRestartGroup.startReplaceGroup(-1525612827);
            }
            startRestartGroup.endReplaceGroup();
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.CONTINUE);
            boolean changedInstance = startRestartGroup.changedInstance(challengeResponse);
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 896) == 256) {
                z = true;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.OutOfBandViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.android.threeds.ui.OutOfBandViewKt.$r8$lambda$Xj6rJuHG6rEjQP4p0pu_2qbhT5o(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.ButtonView(oobContinueLabel, null, buttonCustomization, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 2);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.OutOfBandViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.OutOfBandViewKt.$r8$lambda$icSE1a3YCSYIR3nSLMDG065q4Xw(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xj6rJuHG6rEjQP4p0pu_2qbhT5o(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1) {
        java.lang.String str;
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest;
        java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
        if (whitelistingInfoText == null || kotlin.text.StringsKt.isBlank(whitelistingInfoText)) {
            str = null;
        } else {
            str = (((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE : com.paypal.android.threeds.utils.Indicator.No.INSTANCE).getValue();
        }
        challengeRequest = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : java.lang.Boolean.TRUE, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : str, (r17 & 128) == 0 ? null : null);
        function1.invoke(challengeRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$icSE1a3YCSYIR3nSLMDG065q4Xw(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        OutOfBandView(challengeResponse, mutableState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
