package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"TextFlowView", "", "challengeResponse", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "whiteListCheckedState", "Landroidx/compose/runtime/MutableState;", "", "submitChallengeRequest", "Lkotlin/Function1;", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lkotlin/ParameterName;", "name", "challengeRequest", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "three-ds_release", "textState", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextFlowViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void TextFlowView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(831252208);
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
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(831252208, i3, -1, "com.paypal.android.threeds.ui.TextFlowView (TextFlowView.kt:50)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.android.threeds.ui.TextFlowViewKt$TextFlowView$1$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
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
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.TextFlowViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getChallengeInfoLabel(), androidx.compose.foundation.layout.AlignmentLineKt.m1585paddingFromBaselineVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM()), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
            java.lang.String str = (java.lang.String) mutableState2.getValue();
            com.paypal.android.threeds.ui.customization.TextBoxCustomization getHighResolutionOutputSizeshNQ4ISI = uiCustomization.getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.text_field, startRestartGroup, 0));
            boolean changed = startRestartGroup.changed(mutableState2);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.TextFlowViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.android.threeds.ui.TextFlowViewKt.$r8$lambda$TcKPsWCsCLt7gpcJoIGYQG1sZTY(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.TextBoxView(testTag, str, (kotlin.jvm.functions.Function1) rememberedValue4, null, getHighResolutionOutputSizeshNQ4ISI, null, startRestartGroup, 0, 40);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11023getThree_ds_margin_48D9Ej5fM()), startRestartGroup, 6);
            java.lang.String submitAuthenticationLabel = challengeResponse.getSubmitAuthenticationLabel();
            if (submitAuthenticationLabel == null) {
                startRestartGroup.startReplaceGroup(1590854921);
                submitAuthenticationLabel = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.submit_cta, startRestartGroup, 0);
            } else {
                startRestartGroup.startReplaceGroup(1590853464);
            }
            startRestartGroup.endReplaceGroup();
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.ButtonView(submitAuthenticationLabel, null, uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.SUBMIT), new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.TextFlowViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.android.threeds.ui.TextFlowViewKt.$r8$lambda$s019G5GSpOrdKOg7x7hDhhgs0Yg(com.paypal.android.threeds.data.model.ChallengeResponse.this, objectRef, mutableState, function1, mutableState2);
                }
            }, startRestartGroup, 0, 2);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11011getThree_ds_margin_14D9Ej5fM()), composer2, 6);
            java.lang.String resendInformationLabel = challengeResponse.getResendInformationLabel();
            if (resendInformationLabel != null && !kotlin.text.StringsKt.isBlank(resendInformationLabel)) {
                composer2.startReplaceGroup(2073200970);
                java.lang.String resendInformationLabel2 = challengeResponse.getResendInformationLabel();
                com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.RESEND);
                boolean changedInstance = composer2.changedInstance(challengeResponse);
                boolean z = (i3 & 896) == 256;
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if ((changedInstance | z) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.TextFlowViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.android.threeds.ui.TextFlowViewKt.$r8$lambda$SHGNfUzvy2LcvQtgSFLsOyldE6w(com.paypal.android.threeds.data.model.ChallengeResponse.this, function1);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.OutlinedButtonView(resendInformationLabel2, null, buttonCustomization, (kotlin.jvm.functions.Function0) rememberedValue5, composer2, 0, 2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(2073750972);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.TextFlowViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.TextFlowViewKt.m10993$r8$lambda$K6f2vCs3Yja0ES_BN5e47ErCT0(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$K6f2vCs3Yja0ES_-BN5e47ErCT0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10993$r8$lambda$K6f2vCs3Yja0ES_BN5e47ErCT0(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        TextFlowView(challengeResponse, mutableState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SHGNfUzvy2LcvQtgSFLsOyldE6w(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, kotlin.jvm.functions.Function1 function1) {
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest;
        challengeRequest = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE.getValue(), (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
        function1.invoke(challengeRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TcKPsWCsCLt7gpcJoIGYQG1sZTY(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [T, java.lang.String] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$s019G5GSpOrdKOg7x7hDhhgs0Yg(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState2) {
        java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
        if (whitelistingInfoText != null && !kotlin.text.StringsKt.isBlank(whitelistingInfoText)) {
            objectRef.element = (((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE : com.paypal.android.threeds.utils.Indicator.No.INSTANCE).getValue();
        }
        androidx.compose.runtime.MutableState mutableState3 = mutableState2;
        function1.invoke(((java.lang.String) mutableState3.getValue()).length() > 0 ? com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : (java.lang.String) mutableState3.getValue(), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : (java.lang.String) objectRef.element, (r17 & 128) == 0 ? null : null) : com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : "Y", (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : (java.lang.String) objectRef.element, (r17 & 128) == 0 ? null : null));
        return kotlin.Unit.INSTANCE;
    }
}
