package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"ChallengeView", "", "challengeResponse", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "challengeScreen", "", "submitChallengeRequest", "Lkotlin/Function1;", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lkotlin/ParameterName;", "name", "challengeRequest", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WhiteListView", "whiteListCheckedState", "Landroidx/compose/runtime/MutableState;", "", "uiCustomization", "Lcom/paypal/android/threeds/ui/customization/UICustomization;", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/MutableState;Lcom/paypal/android/threeds/ui/customization/UICustomization;Landroidx/compose/runtime/Composer;I)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChallengeViewKt {
    /* JADX WARN: Removed duplicated region for block: B:113:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChallengeView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.android.threeds.data.model.ChallengeRequest, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.android.threeds.ui.customization.UICustomization uICustomization;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2049289633);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(challengeResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2049289633, i4, -1, "com.paypal.android.threeds.ui.ChallengeView (ChallengeView.kt:57)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.AlignmentLineKt.m1585paddingFromBaselineVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM()), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.ui.Modifier m1585paddingFromBaselineVpY3zN4 = androidx.compose.foundation.layout.AlignmentLineKt.m1585paddingFromBaselineVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11016getThree_ds_margin_20D9Ej5fM(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11005getThree_ds_margin_10D9Ej5fM());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1585paddingFromBaselineVpY3zN4);
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
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelHeaderView(challengeResponse.getChallengeInfoHeader(), androidx.compose.foundation.layout.AlignmentLineKt.m1586paddingFromBaselineVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11017getThree_ds_margin_24D9Ej5fM(), 0.0f, 2, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(challengeResponse.getChallengeInfoTextIndicator(), com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE.getValue())) {
                    startRestartGroup.startReplaceGroup(1002714110);
                    modifier3 = modifier4;
                    uICustomization = uiCustomization;
                    i5 = i4;
                    coil3.compose.SingletonAsyncImageKt.m9749AsyncImage10Xjiaw(java.lang.Integer.valueOf(com.paypal.android.threeds.R.drawable.ic_warning), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.warning_icon_content_desc, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11016getThree_ds_margin_20D9Ej5fM(), 0.0f, 0.0f, 13, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11018getThree_ds_margin_26D9Ej5fM()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 384, 0, 2040);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f)), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    uICustomization = uiCustomization;
                    i5 = i4;
                    startRestartGroup.startReplaceGroup(1003224401);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getChallengeInfoText(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11017getThree_ds_margin_24D9Ej5fM(), 0.0f, 0.0f, 13, null), uICustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, 48, 0);
                startRestartGroup.endNode();
                modifier2 = modifier3;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11017getThree_ds_margin_24D9Ej5fM(), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(hashCode4))) {
                    m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(hashCode4));
                    m5299constructorimpl4.apply(java.lang.Integer.valueOf(hashCode4), setCompositeKeyHash4);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect.INSTANCE.getName())) {
                    startRestartGroup.startReplaceGroup(274828474);
                    i6 = i5;
                    com.paypal.android.threeds.ui.SingleSelectViewKt.SingleSelectView(challengeResponse, mutableState, function1, startRestartGroup, (i6 & 14) | 48 | (i6 & 896));
                    startRestartGroup.endReplaceGroup();
                } else {
                    i6 = i5;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect.INSTANCE.getName())) {
                        startRestartGroup.startReplaceGroup(275148859);
                        com.paypal.android.threeds.ui.MultiSelectViewKt.MultiSelectView(challengeResponse, mutableState, function1, startRestartGroup, (i6 & 14) | 48 | (i6 & 896));
                        startRestartGroup.endReplaceGroup();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.android.threeds.utils.ChallengeUiType.OOB.INSTANCE.getName())) {
                        startRestartGroup.startReplaceGroup(275460316);
                        com.paypal.android.threeds.ui.OutOfBandViewKt.OutOfBandView(challengeResponse, mutableState, function1, startRestartGroup, (i6 & 14) | 48 | (i6 & 896));
                        startRestartGroup.endReplaceGroup();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.android.threeds.utils.ChallengeUiType.Text.INSTANCE.getName())) {
                        startRestartGroup.startReplaceGroup(275771773);
                        com.paypal.android.threeds.ui.TextFlowViewKt.TextFlowView(challengeResponse, mutableState, function1, startRestartGroup, (i6 & 14) | 48 | (i6 & 896));
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(276041411);
                        startRestartGroup.endReplaceGroup();
                    }
                }
                Camera2StreamConfigurationMap(challengeResponse, mutableState, uICustomization, startRestartGroup, (i6 & 14) | 48);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ChallengeViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.ChallengeViewKt.$r8$lambda$Pnh1XvbyqYTuahVVek0L04xClFw(com.paypal.android.threeds.data.model.ChallengeResponse.this, str, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final com.paypal.android.threeds.ui.customization.UICustomization uICustomization, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1733946720);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(challengeResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(uICustomization) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1733946720, i2, -1, "com.paypal.android.threeds.ui.WhiteListView (ChallengeView.kt:157)");
            }
            com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization = uICustomization.getButtonCustomization(com.paypal.android.threeds.ui.customization.UICustomization.ButtonType.SUBMIT);
            com.paypal.android.threeds.utils.CustomizeUtils customizeUtils = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE;
            if (buttonCustomization == null) {
                buttonCustomization = new com.paypal.android.threeds.ui.customization.ButtonCustomization();
            }
            long m11037getButtonBackgroundColorvNxB06k = customizeUtils.m11037getButtonBackgroundColorvNxB06k(buttonCustomization);
            java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
            if (whitelistingInfoText != null && !kotlin.text.StringsKt.isBlank(whitelistingInfoText)) {
                startRestartGroup.startReplaceGroup(435571520);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean booleanValue = mutableState.getValue().booleanValue();
                androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7800getCheckboxo7Vup1c());
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.ChallengeViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.android.threeds.ui.ChallengeViewKt.m10988$r8$lambda$SbeNDZkrrsE_cqBH_HHvMobAwQ(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.selection.ToggleableKt.m1952toggleableoSLSa3U$default(fillMaxWidth$default, booleanValue, false, m7792boximpl, null, (kotlin.jvm.functions.Function1) rememberedValue, 10, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11016getThree_ds_margin_20D9Ej5fM(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.android.threeds.ui.customization.LabelCustomization getHighSpeedVideoFpsRangesFor = uICustomization.getGetHighSpeedVideoFpsRangesFor();
                androidx.compose.material.CheckboxKt.Checkbox(mutableState.getValue().booleanValue(), null, null, false, null, androidx.compose.material.CheckboxDefaults.INSTANCE.m2536colorszjMxDiM(m11037getButtonBackgroundColorvNxB06k, com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11040getLabelHeadingTextColorvNxB06k(getHighSpeedVideoFpsRangesFor == null ? new com.paypal.android.threeds.ui.customization.LabelCustomization() : getHighSpeedVideoFpsRangesFor), androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.paypal.android.threeds.R.color.background, startRestartGroup, 0), 0L, 0L, startRestartGroup, androidx.compose.material.CheckboxDefaults.$stable << 15, 24), startRestartGroup, 48, 28);
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(challengeResponse.getWhitelistingInfoText(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), getHighSpeedVideoFpsRangesFor, startRestartGroup, 48, 0);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(436865026);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ChallengeViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ChallengeViewKt.m10989$r8$lambda$h68kbodco0IIapO43U1aFA08g8(com.paypal.android.threeds.data.model.ChallengeResponse.this, mutableState, uICustomization, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pnh1XvbyqYTuahVVek0L04xClFw(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChallengeView(challengeResponse, str, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SbeNDZkrrs-E_cqBH_HHvMobAwQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10988$r8$lambda$SbeNDZkrrsE_cqBH_HHvMobAwQ(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h68kbod-co0IIapO43U1aFA08g8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10989$r8$lambda$h68kbodco0IIapO43U1aFA08g8(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.MutableState mutableState, com.paypal.android.threeds.ui.customization.UICustomization uICustomization, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(challengeResponse, mutableState, uICustomization, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
