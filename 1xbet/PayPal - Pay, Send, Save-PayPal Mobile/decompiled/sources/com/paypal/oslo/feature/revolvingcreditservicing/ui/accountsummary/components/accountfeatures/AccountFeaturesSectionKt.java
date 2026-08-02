package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a9\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"AccountFeaturesSection", "", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/accountfeatures/AccountFeaturesSectionUiState;", "onFeatureClick", "Lkotlin/Function1;", "", "onSeeAllClick", "Lkotlin/Function0;", "onTryAgainClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "features", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountFeaturesSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "AccountFeaturesSectionSingleItemPreview", "AccountFeaturesSectionEmptyPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountFeaturesSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountFeaturesSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(226536078);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(accountSummarySectionUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(226536078, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSection (AccountFeaturesSection.kt:53)");
                }
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = java.lang.Boolean.valueOf(!kotlin.collections.CollectionsKt.contains(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE}), accountSummarySectionUiState));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.AccountSummarySection(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_account_features), function0, androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionTestTags.SECTION), accountSummarySectionUiState.getIsRedirectionButtonVisible(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_accessibility_see_all, new java.lang.Object[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_account_features, startRestartGroup, 0)}, startRestartGroup, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.analytics.AccountSummaryAnalyticsConstants.Item.INSTANCE.getSEE_ALL_ACCOUNT_FEATURES()), ((java.lang.Boolean) rememberedValue).booleanValue(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-824062716, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$ecPwlQQvjCcsMfyFmBFywnyaYjQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.this, function1, function02, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 112) | 12582912, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$aUgVB6fzNIHfhBCdDrLfqJqSH20(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.this, function1, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel> list, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-956779685);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-956779685, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.Content (AccountFeaturesSection.kt:92)");
                }
                com.paypal.pds.components.CardKt.Card(modifier3, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2019548863, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$ayhf7YOTMhwxkbXUaMSy3wpoeYw(list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 805306368 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$WZ06uH0eFCHB2RAXMgO29QwrcKc(list, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$--F7OBdLpi0PSKTm_ctr9ZHew2s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18189$r8$lambda$F7OBdLpi0PSKTm_ctr9ZHew2s(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BjjS8YQSZCD4oyKEDkAm9eAcoyQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1042826460);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1042826460, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionEmptyPreview (AccountFeaturesSection.kt:140)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$cky8pFbUTr3gn29TKGCN90BOusU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AccountFeaturesSection(empty, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3510, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$BjjS8YQSZCD4oyKEDkAm9eAcoyQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HKQTPUB_BUOmzK_uuHogbCLzopQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel unEnrolledAccountFeatureRowUiModel) {
        function1.invoke(unEnrolledAccountFeatureRowUiModel.getId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WZ06uH0eFCHB2RAXMgO29QwrcKc(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aUgVB6fzNIHfhBCdDrLfqJqSH20(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountFeaturesSection(accountSummarySectionUiState, function1, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ayhf7YOTMhwxkbXUaMSy3wpoeYw(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2019548863, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.Content.<anonymous> (AccountFeaturesSection.kt:97)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(811653152);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel unEnrolledAccountFeatureRowUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel) it.next();
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(unEnrolledAccountFeatureRowUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$HKQTPUB_BUOmzK_uuHogbCLzopQ(kotlin.jvm.functions.Function1.this, unEnrolledAccountFeatureRowUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.unenrolleraccountfeatures.UnEnrolledAccountFeatureRowKt.m18259UnEnrolledAccountFeatureRowvz2T9sI(unEnrolledAccountFeatureRowUiModel, null, 0.0f, 0.0f, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 14);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cky8pFbUTr3gn29TKGCN90BOusU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dhSmcblMoKfuMOeTfft2eE1uVuA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1068188412);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1068188412, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionSingleItemPreview (AccountFeaturesSection.kt:128)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.UnEnrolledAccountFeatureRowUiModel) kotlin.sequences.SequencesKt.first(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.unenrolleraccountfeatures.AccountFeaturePreviewProvider.INSTANCE.getElements())));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.m18189$r8$lambda$F7OBdLpi0PSKTm_ctr9ZHew2s((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AccountFeaturesSection(ready, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$dhSmcblMoKfuMOeTfft2eE1uVuA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ecPwlQQvjCcsMfyFmBFywnyaYjQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-824062716, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSection.<anonymous> (AccountFeaturesSection.kt:70)");
            }
            if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) {
                composer.startReplaceGroup(380777049);
                getHighSpeedVideoFpsRangesFor((java.util.List) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) accountSummarySectionUiState).getData(), function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionTestTags.CONTENT), composer, 384, 0);
                composer.endReplaceGroup();
            } else if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) {
                composer.startReplaceGroup(381029575);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt.AccountSummarySectionPartialError(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_features_partial_error_description), function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionTestTags.ERROR), composer, 384, 0);
                composer.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE)) {
                composer.startReplaceGroup(-1650265432);
                composer.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE)) {
                    composer.startReplaceGroup(-1650286539);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1650263640);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ix3EOp5zwCsMZuMT0M1sTSvOJs4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wqe24fx5mZaB-Vl5GgktO-AEX4s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18194$r8$lambda$wqe24fx5mZaBVl5GgktOAEX4s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(164076521);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(164076521, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionPreview (AccountFeaturesSection.kt:116)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(kotlin.sequences.SequencesKt.toList(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.unenrolleraccountfeatures.AccountFeaturePreviewProvider.INSTANCE.getElements()));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.$r8$lambda$ix3EOp5zwCsMZuMT0M1sTSvOJs4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AccountFeaturesSection(ready, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.accountfeatures.AccountFeaturesSectionKt.m18194$r8$lambda$wqe24fx5mZaBVl5GgktOAEX4s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
