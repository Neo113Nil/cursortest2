package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "challengeResponse", "Landroidx/compose/runtime/MutableState;", "", "whiteListCheckedState", "Lkotlin/Function1;", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lkotlin/ParameterName;", "", "submitChallengeRequest", "MultiSelectView", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MultiSelectViewKt {
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0277, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MultiSelectView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer3;
        java.util.Set set;
        java.lang.Object obj;
        java.lang.Object obj2;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = mutableState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1313193534);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(challengeResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2;
        if (!startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            function12 = function1;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1313193534, i6, -1, "com.paypal.android.threeds.ui.MultiSelectView (MultiSelectView.kt:52)");
            }
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.SUBMIT);
            com.paypal.android.threeds.utils.CustomizeUtils customizeUtils = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE;
            if (buttonCustomization == null) {
                buttonCustomization = new com.paypal.android.threeds.ui.customization.ButtonCustomization();
            }
            long m11037getButtonBackgroundColorvNxB06k = customizeUtils.m11037getButtonBackgroundColorvNxB06k(buttonCustomization);
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> challengeSelectInfo = challengeResponse.getChallengeSelectInfo();
            java.util.LinkedHashSet rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new java.util.LinkedHashSet();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.Set set2 = (java.util.Set) rememberedValue;
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
            java.util.Set set3 = set2;
            int i7 = 0;
            int i8 = 1;
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getChallengeInfoLabel(), androidx.compose.foundation.layout.AlignmentLineKt.m1586paddingFromBaselineVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 1, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                startRestartGroup.startReplaceGroup(-385905961);
                startRestartGroup.endReplaceGroup();
                i3 = i6;
                i4 = 0;
                i5 = 1;
                composer3 = startRestartGroup;
                set = set3;
            } else {
                startRestartGroup.startReplaceGroup(-385905960);
                java.util.Iterator<T> it = challengeSelectInfo.iterator();
                androidx.compose.runtime.Composer composer4 = startRestartGroup;
                while (it.hasNext()) {
                    final java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.first(((java.util.Map) it.next()).entrySet());
                    java.lang.Object rememberedValue2 = composer4.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        obj = null;
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        composer4.updateRememberedValue(rememberedValue2);
                    } else {
                        obj = null;
                    }
                    final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i8, obj);
                    boolean booleanValue = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
                    androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7800getCheckboxo7Vup1c());
                    final java.util.Set set4 = set3;
                    boolean changedInstance = composer4.changedInstance(set4);
                    boolean changedInstance2 = composer4.changedInstance(entry);
                    java.lang.Object rememberedValue3 = composer4.rememberedValue();
                    if (!(changedInstance | changedInstance2)) {
                        obj2 = rememberedValue3;
                    }
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.MultiSelectViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.android.threeds.ui.MultiSelectViewKt.$r8$lambda$X9CQV9fAxU0SBlkpH1smQVh2yv4(androidx.compose.runtime.MutableState.this, set4, entry, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    };
                    composer4.updateRememberedValue(function13);
                    obj2 = function13;
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.selection.ToggleableKt.m1952toggleableoSLSa3U$default(fillMaxWidth$default2, booleanValue, false, m7792boximpl, null, (kotlin.jvm.functions.Function1) obj2, 10, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11008getThree_ds_margin_12D9Ej5fM(), i8, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer4, 48);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer4, i7));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, m1708paddingVpY3zN4$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(hashCode3))) {
                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(hashCode3));
                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.paypal.android.threeds.ui.customization.LabelCustomization getHighSpeedVideoFpsRangesFor = uiCustomization.getGetHighSpeedVideoFpsRangesFor();
                    com.paypal.android.threeds.utils.CustomizeUtils customizeUtils2 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE;
                    if (getHighSpeedVideoFpsRangesFor == null) {
                        getHighSpeedVideoFpsRangesFor = new com.paypal.android.threeds.ui.customization.LabelCustomization();
                    }
                    androidx.compose.runtime.Composer composer5 = composer4;
                    androidx.compose.material.CheckboxKt.Checkbox(((java.lang.Boolean) mutableState3.getValue()).booleanValue(), null, null, false, null, androidx.compose.material.CheckboxDefaults.INSTANCE.m2536colorszjMxDiM(m11037getButtonBackgroundColorvNxB06k, customizeUtils2.m11040getLabelHeadingTextColorvNxB06k(getHighSpeedVideoFpsRangesFor), androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.paypal.android.threeds.R.color.background, composer4, 0), 0L, 0L, composer5, androidx.compose.material.CheckboxDefaults.$stable << 15, 24), composer5, 48, 28);
                    com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView((java.lang.String) entry.getValue(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), composer5, 48, 0);
                    composer5.endNode();
                    i7 = 0;
                    i8 = 1;
                    i6 = i6;
                    composer4 = composer5;
                    set3 = set4;
                }
                i3 = i6;
                i4 = i7;
                i5 = i8;
                composer3 = composer4;
                set = set3;
                composer3.endReplaceGroup();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            java.lang.String submitAuthenticationLabel = challengeResponse.getSubmitAuthenticationLabel();
            if (submitAuthenticationLabel == null) {
                composer2 = composer3;
                composer2.startReplaceGroup(1511630545);
                submitAuthenticationLabel = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.submit_cta, composer2, i4);
            } else {
                composer2 = composer3;
                composer2.startReplaceGroup(1511629088);
            }
            composer2.endReplaceGroup();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), i5, null);
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization2 = uiCustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.NEXT);
            boolean changedInstance3 = composer2.changedInstance(challengeResponse);
            int i9 = (i3 & 112) == 32 ? i5 : i4;
            final java.util.Set set5 = set;
            boolean changedInstance4 = composer2.changedInstance(set5);
            if ((i3 & 896) == 256) {
                i4 = i5;
            }
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if ((i4 | (changedInstance3 ? 1 : 0) | i9 | (changedInstance4 ? 1 : 0)) != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState;
                function12 = function1;
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.MultiSelectViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.android.threeds.ui.MultiSelectViewKt.$r8$lambda$MRvL7bQRPRQtUf0DLIRX6eWY73o(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState2, set5, function12);
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                mutableState2 = mutableState;
                function12 = function1;
            }
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.ButtonView(submitAuthenticationLabel, m1708paddingVpY3zN4$default2, buttonCustomization2, (kotlin.jvm.functions.Function0) rememberedValue4, composer2, 48, 0);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.MultiSelectViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.android.threeds.ui.MultiSelectViewKt.$r8$lambda$pCTyndfPU9KBBxSDFgBoGByOdeY(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState2, function12, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$GISel2ftHKrnlIDP5xGRTYu-8Jw, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m10991$r8$lambda$GISel2ftHKrnlIDP5xGRTYu8Jw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MRvL7bQRPRQtUf0DLIRX6eWY73o(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, java.util.Set set, kotlin.jvm.functions.Function1 function1) {
        java.lang.String str;
        java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
        if (whitelistingInfoText == null || kotlin.text.StringsKt.isBlank(whitelistingInfoText)) {
            str = null;
        } else {
            str = (((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE : com.paypal.android.threeds.utils.Indicator.No.INSTANCE).getValue();
        }
        java.lang.String str2 = str;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(set, ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.MultiSelectViewKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.android.threeds.ui.MultiSelectViewKt.m10991$r8$lambda$GISel2ftHKrnlIDP5xGRTYu8Jw((java.lang.String) obj);
            }
        }, 30, null);
        function1.invoke(joinToString$default.length() > 0 ? com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : joinToString$default, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : str2, (r17 & 128) == 0 ? null : null) : com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(challengeResponse, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : "Y", (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : str2, (r17 & 128) == 0 ? null : null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X9CQV9fAxU0SBlkpH1smQVh2yv4(androidx.compose.runtime.MutableState mutableState, java.util.Set set, java.util.Map.Entry entry, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            set.add(entry.getKey());
        } else {
            set.remove(entry.getKey());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pCTyndfPU9KBBxSDFgBoGByOdeY(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        MultiSelectView(challengeResponse, mutableState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
