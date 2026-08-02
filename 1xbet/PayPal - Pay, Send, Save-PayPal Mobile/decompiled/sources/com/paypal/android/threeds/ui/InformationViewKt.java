package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"InformationView", "", "challengeResponse", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Landroidx/compose/runtime/Composer;I)V", "ExpandableItem", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "arrowContentDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "three-ds_release", "expandedState", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InformationViewKt {
    public static final void InformationView(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1482354200);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(challengeResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1482354200, i2, -1, "com.paypal.android.threeds.ui.InformationView (InformationView.kt:44)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11008getThree_ds_margin_12D9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11016getThree_ds_margin_20D9Ej5fM(), 7, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.test_tag_information_zone, startRestartGroup, 0));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            java.lang.String whyInfoLabel = challengeResponse.getWhyInfoLabel();
            if (whyInfoLabel != null && !kotlin.text.StringsKt.isBlank(whyInfoLabel)) {
                startRestartGroup.startReplaceGroup(-41118182);
                ExpandableItem(challengeResponse.getWhyInfoLabel(), challengeResponse.getWhyInfoText(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.why_info_drop_down_arrow, startRestartGroup, 0), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-40912528);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String expandInfoLabel = challengeResponse.getExpandInfoLabel();
            if (expandInfoLabel != null && !kotlin.text.StringsKt.isBlank(expandInfoLabel)) {
                startRestartGroup.startReplaceGroup(-40841352);
                ExpandableItem(challengeResponse.getExpandInfoLabel(), challengeResponse.getExpandInfoText(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.info_drop_down_arrow, startRestartGroup, 0), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-40633776);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.InformationViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.InformationViewKt.$r8$lambda$MXNML813FszmrDlqffGjM5e3wmo(com.paypal.android.threeds.data.model.ChallengeResponse.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ExpandableItem(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2038583869);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2038583869, i3, -1, "com.paypal.android.threeds.ui.ExpandableItem (InformationView.kt:70)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            com.paypal.android.threeds.ui.customization.UICustomization uiCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(hashCode2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(hashCode2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, androidx.compose.material.ContentAlpha.$stable));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.InformationViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.android.threeds.ui.InformationViewKt.$r8$lambda$eJMbNkqP55qPI5j7amWPpzB32fc(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.material.IconButtonKt.IconButton((kotlin.jvm.functions.Function0) rememberedValue2, alpha, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-675268083, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.InformationViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.InformationViewKt.$r8$lambda$J3Y6LD_bZibtlV7Vg_7t1I52xO8(str3, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 24582, 12);
            composer2 = startRestartGroup;
            com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(str, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 9.0f, false, 2, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), startRestartGroup, i3 & 14, 0);
            composer2.endNode();
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                composer2.startReplaceGroup(-1099576544);
                com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.LabelView(str2, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), uiCustomization.getGetHighSpeedVideoFpsRangesFor(), composer2, ((i3 >> 3) & 14) | 48, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1099341099);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.InformationViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.InformationViewKt.$r8$lambda$rLV1lZxZzhtgqGgTURFr4LmCegg(str, str2, str3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$J3Y6LD_bZibtlV7Vg_7t1I52xO8(java.lang.String str, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-675268083, i, -1, "com.paypal.android.threeds.ui.ExpandableItem.<anonymous>.<anonymous>.<anonymous> (InformationView.kt:85)");
            }
            androidx.compose.material.IconKt.m2650Iconww6aTOc(((java.lang.Boolean) mutableState.getValue()).booleanValue() ? androidx.compose.material.icons.filled.KeyboardArrowDownKt.getKeyboardArrowDown(androidx.compose.material.icons.Icons.INSTANCE.getDefault()) : androidx.compose.material.icons.filled.KeyboardArrowRightKt.getKeyboardArrowRight(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), str, (androidx.compose.ui.Modifier) null, androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.paypal.android.threeds.R.color.paypal_text_color, composer, 0), composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MXNML813FszmrDlqffGjM5e3wmo(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, int i, androidx.compose.runtime.Composer composer, int i2) {
        InformationView(challengeResponse, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$eJMbNkqP55qPI5j7amWPpzB32fc(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rLV1lZxZzhtgqGgTURFr4LmCegg(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, androidx.compose.runtime.Composer composer, int i2) {
        ExpandableItem(str, str2, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
