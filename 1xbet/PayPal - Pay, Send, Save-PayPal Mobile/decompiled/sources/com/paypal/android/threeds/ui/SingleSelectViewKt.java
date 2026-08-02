package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "challengeResponse", "Landroidx/compose/runtime/MutableState;", "", "whiteListCheckedState", "Lkotlin/Function1;", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lkotlin/ParameterName;", "", "submitChallengeRequest", "SingleSelectView", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SingleSelectViewKt {
    public static final void SingleSelectView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(906541342);
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
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(906541342, i4, -1, "com.paypal.android.threeds.ui.SingleSelectView (SingleSelectView.kt:54)");
            }
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.SUBMIT);
            com.paypal.android.threeds.ui.customization.LabelCustomization getHighSpeedVideoFpsRangesFor = uiCustomization.getGetHighSpeedVideoFpsRangesFor();
            com.paypal.android.threeds.utils.CustomizeUtils customizeUtils = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE;
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new com.paypal.android.threeds.ui.customization.LabelCustomization();
            }
            long m11040getLabelHeadingTextColorvNxB06k = customizeUtils.m11040getLabelHeadingTextColorvNxB06k(getHighSpeedVideoFpsRangesFor);
            com.paypal.android.threeds.utils.CustomizeUtils customizeUtils2 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE;
            if (buttonCustomization == null) {
                buttonCustomization = new com.paypal.android.threeds.ui.customization.ButtonCustomization();
            }
            long m11037getButtonBackgroundColorvNxB06k = customizeUtils2.m11037getButtonBackgroundColorvNxB06k(buttonCustomization);
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> challengeSelectInfo = challengeResponse.getChallengeSelectInfo();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            final java.lang.String str = (java.lang.String) mutableState2.component1();
            kotlin.jvm.functions.Function1 component2 = mutableState2.component2();
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
            java.lang.Object obj = null;
            int i5 = i4;
            final kotlin.jvm.functions.Function1 function12 = component2;
            int i6 = 1;
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getChallengeInfoLabel(), androidx.compose.foundation.layout.AlignmentLineKt.m1586paddingFromBaselineVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 1, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
            androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.ui.Modifier.INSTANCE);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, selectableGroup);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(hashCode2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(hashCode2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (challengeSelectInfo == null) {
                startRestartGroup.startReplaceGroup(448370620);
                startRestartGroup.endReplaceGroup();
                composer3 = startRestartGroup;
                i3 = i5;
            } else {
                startRestartGroup.startReplaceGroup(448370621);
                java.util.Iterator<T> it = challengeSelectInfo.iterator();
                while (it.hasNext()) {
                    final java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.first(((java.util.Map) it.next()).entrySet());
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i6, obj);
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), str);
                    androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c());
                    boolean changed = startRestartGroup.changed(function12);
                    boolean changedInstance = startRestartGroup.changedInstance(entry);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.SingleSelectViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.android.threeds.ui.SingleSelectViewKt.$r8$lambda$AeUC2nGeB_u4rSUURQD4AWHgzFY(kotlin.jvm.functions.Function1.this, entry);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.selection.SelectableKt.m1946selectableoSLSa3U$default(fillMaxWidth$default2, areEqual, false, m7792boximpl, null, (kotlin.jvm.functions.Function0) rememberedValue2, 10, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11008getThree_ds_margin_12D9Ej5fM(), i6, obj);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(hashCode3))) {
                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(hashCode3));
                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.runtime.Composer composer4 = startRestartGroup;
                    androidx.compose.material.RadioButtonKt.RadioButton(kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), str), null, null, false, null, androidx.compose.material.RadioButtonDefaults.INSTANCE.m2708colorsRGew2ao(m11037getButtonBackgroundColorvNxB06k, m11040getLabelHeadingTextColorvNxB06k, 0L, startRestartGroup, androidx.compose.material.RadioButtonDefaults.$stable << 9, 4), composer4, 48, 28);
                    com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView((java.lang.String) entry.getValue(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), composer4, 48, 0);
                    composer4.endNode();
                    startRestartGroup = composer4;
                    function12 = function12;
                    i5 = i5;
                    obj = null;
                    i6 = 1;
                }
                composer3 = startRestartGroup;
                i3 = i5;
                composer3.endReplaceGroup();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            composer2 = composer3;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM()), composer2, 6);
            java.lang.String submitAuthenticationLabel = challengeResponse.getSubmitAuthenticationLabel();
            if (submitAuthenticationLabel == null) {
                composer2.startReplaceGroup(707244301);
                submitAuthenticationLabel = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.submit_cta, composer2, 0);
            } else {
                composer2.startReplaceGroup(707242844);
            }
            composer2.endReplaceGroup();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 1, null);
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization2 = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.NEXT);
            boolean changedInstance2 = composer2.changedInstance(challengeResponse);
            int i7 = i3;
            boolean z = (i7 & 112) == 32;
            boolean changed2 = composer2.changed(str);
            boolean z2 = (i7 & 896) == 256;
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if ((changedInstance2 | z | changed2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.SingleSelectViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.android.threeds.ui.SingleSelectViewKt.$r8$lambda$ccTEN9Rg8dtrOt7Tr7xgl_cncGw(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, str, function1);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.ButtonView(submitAuthenticationLabel, m1708paddingVpY3zN4$default2, buttonCustomization2, (kotlin.jvm.functions.Function0) rememberedValue3, composer2, 48, 0);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.SingleSelectViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.android.threeds.ui.SingleSelectViewKt.$r8$lambda$9liTZitYePEQ1z2Ud9WegI7kDqo(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9liTZitYePEQ1z2Ud9WegI7kDqo(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        SingleSelectView(challengeResponse, mutableState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AeUC2nGeB_u4rSUURQD4AWHgzFY(kotlin.jvm.functions.Function1 function1, java.util.Map.Entry entry) {
        function1.invoke(entry.getKey());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ccTEN9Rg8dtrOt7Tr7xgl_cncGw(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        java.lang.String str2;
        java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
        if (whitelistingInfoText == null || kotlin.text.StringsKt.isBlank(whitelistingInfoText)) {
            str2 = null;
        } else {
            str2 = (((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE : com.paypal.android.threeds.utils.Indicator.No.INSTANCE).getValue();
        }
        java.lang.String str3 = str2;
        function1.invoke(str.length() > 0 ? com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : str, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : str3, (r17 & 128) == 0 ? null : null) : com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : "Y", (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : str3, (r17 & 128) == 0 ? null : null));
        return kotlin.Unit.INSTANCE;
    }
}
