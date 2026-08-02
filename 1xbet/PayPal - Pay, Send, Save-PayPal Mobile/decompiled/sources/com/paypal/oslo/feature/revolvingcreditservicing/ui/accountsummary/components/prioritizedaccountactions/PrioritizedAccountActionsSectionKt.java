package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"PrioritizedAccountActionsSection", "", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiState;", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", "onDismissClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "uiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DismissiblePreview", "(Landroidx/compose/runtime/Composer;I)V", "NonDismissiblePreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrioritizedAccountActionsSectionKt {
    public static final void PrioritizedAccountActionsSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891564690);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(accountSummarySectionUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-891564690, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSection (PrioritizedAccountActionsSection.kt:36)");
            }
            if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) {
                startRestartGroup.startReplaceGroup(-2095164558);
                Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) accountSummarySectionUiState).getData(), function1, function12, androidx.compose.ui.platform.TestTagKt.testTag(modifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionTestArgs.CONTENT), startRestartGroup, i3 & 1008, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2095156942);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18238$r8$lambda$7eDRCo0zmFhxYEtHUXVbP4q9UE(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.this, function1, function12, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1814025890);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(prioritizedAccountActionSectionUiModel) ? 4 : 2) | i : i;
        int i5 = 32;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1814025890, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.Content (PrioritizedAccountActionsSection.kt:54)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                if (prioritizedAccountActionSectionUiModel.getNonDismissible().isEmpty()) {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-1173587297);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$5aeFFsEQXgzSNwtfbLoWfLqPe_M((androidx.compose.animation.AnimatedContentTransitionScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.animation.AnimatedContentKt.AnimatedContent(prioritizedAccountActionSectionUiModel, null, (kotlin.jvm.functions.Function1) rememberedValue, null, "PrioritizedAccountActionsContentTransition", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(167389724, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$Yc54pNY5d61_m1KOKQdWJcMDobo(kotlin.jvm.functions.Function1.this, function12, (androidx.compose.animation.AnimatedContentScope) obj, (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 1597824, 42);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2021820369);
                    for (final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel : prioritizedAccountActionSectionUiModel.getNonDismissible()) {
                        boolean z2 = (i3 & 112) == i5 ? z : false;
                        boolean changed = startRestartGroup.changed(prioritizedAccountActionsUiModel);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((z2 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18239$r8$lambda$GwilYcSy6oavZJh5DXUQqSesmA(kotlin.jvm.functions.Function1.this, prioritizedAccountActionsUiModel);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        boolean z3 = (i3 & 896) == 256 ? z : false;
                        boolean changed2 = startRestartGroup.changed(prioritizedAccountActionsUiModel);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z3 | changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18240$r8$lambda$KGqVQRMrkk2YM8quRMuWByKAZ4(kotlin.jvm.functions.Function1.this, prioritizedAccountActionsUiModel);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsCardKt.PrioritizedAccountActionsCard(prioritizedAccountActionsUiModel, null, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 2);
                        z = z;
                        modifier4 = modifier4;
                        i5 = 32;
                    }
                    modifier3 = modifier4;
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$6glqGr3VpNRziU0Qwx1EJl5orhg(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel.this, function1, function12, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        boolean z4 = true;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$3ZE-fenIM6R4sJD7Z-IwbWIQEeo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18236$r8$lambda$3ZEfenIM6R4sJD7ZIwbWIQEeo(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionsUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform $r8$lambda$5aeFFsEQXgzSNwtfbLoWfLqPe_M(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
        return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6glqGr3VpNRziU0Qwx1EJl5orhg(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(prioritizedAccountActionSectionUiModel, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7b7fM9kVtfWrMYvN-KYh2k-mFao, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18237$r8$lambda$7b7fM9kVtfWrMYvNKYh2kmFao(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        function1.invoke(prioritizedAccountActionsUiModel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7eDRCo0zmFhxYEtHUX-VbP4q9UE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18238$r8$lambda$7eDRCo0zmFhxYEtHUXVbP4q9UE(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PrioritizedAccountActionsSection(accountSummarySectionUiState, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C1j9QpLLOA28Pg6RADUMmAFdk2s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-239161874);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-239161874, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.DismissiblePreview (PrioritizedAccountActionsSection.kt:91)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsCardPreviewDataKt.setupAutopay(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE)), kotlin.collections.CollectionsKt.emptyList()));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18241$r8$lambda$fDWQ80r8ibHlfFAWpoRy8t9Cj0((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$yZDodN3ACala6rKb11xIarAWIE8((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PrioritizedAccountActionsSection(ready, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$C1j9QpLLOA28Pg6RADUMmAFdk2s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GwilYcSy6oavZJ-h5DXUQqSesmA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18239$r8$lambda$GwilYcSy6oavZJh5DXUQqSesmA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        function1.invoke(prioritizedAccountActionsUiModel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KGqVQR-Mrkk2YM8quRMuWByKAZ4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18240$r8$lambda$KGqVQRMrkk2YM8quRMuWByKAZ4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        function1.invoke(prioritizedAccountActionsUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mzmm5eNLVv4lsZ2wqEQCZyP18M4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1644338499);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1644338499, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.NonDismissiblePreview (PrioritizedAccountActionsSection.kt:106)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsCardPreviewDataKt.cardShipped(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.NAVIGATION), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsCardPreviewDataKt.updateIncome(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.NAVIGATION)})));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$rq1wNEdFYPN8zaNa6e0E1My08wg((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18236$r8$lambda$3ZEfenIM6R4sJD7ZIwbWIQEeo((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PrioritizedAccountActionsSection(ready, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$Mzmm5eNLVv4lsZ2wqEQCZyP18M4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yc54pNY5d61_m1KOKQdWJcMDobo(final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionSectionUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(167389724, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.Content.<anonymous>.<anonymous> (PrioritizedAccountActionsSection.kt:73)");
        }
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel firstDismissibleOrNull = prioritizedAccountActionSectionUiModel.getFirstDismissibleOrNull();
        if (firstDismissibleOrNull == null) {
            composer.startReplaceGroup(250302098);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(250302099);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(firstDismissibleOrNull);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.$r8$lambda$lCBqPLJyFognZ2RJqVSygLoiGM8(kotlin.jvm.functions.Function1.this, firstDismissibleOrNull);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed3 = composer.changed(function12);
            boolean changed4 = composer.changed(firstDismissibleOrNull);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsSectionKt.m18237$r8$lambda$7b7fM9kVtfWrMYvNKYh2kmFao(kotlin.jvm.functions.Function1.this, firstDismissibleOrNull);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.PrioritizedAccountActionsCardKt.PrioritizedAccountActionsCard(firstDismissibleOrNull, null, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 2);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fDWQ80-r8ibHlfFAWpoRy8t9Cj0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18241$r8$lambda$fDWQ80r8ibHlfFAWpoRy8t9Cj0(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionsUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lCBqPLJyFognZ2RJqVSygLoiGM8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        function1.invoke(prioritizedAccountActionsUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rq1wNEdFYPN8zaNa6e0E1My08wg(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionsUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yZDodN3ACala6rKb11xIarAWIE8(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel prioritizedAccountActionsUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionsUiModel, "");
        return kotlin.Unit.INSTANCE;
    }
}
