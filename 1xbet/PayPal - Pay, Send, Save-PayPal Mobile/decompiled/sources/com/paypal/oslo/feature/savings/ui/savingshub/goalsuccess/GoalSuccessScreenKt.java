package com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"GoalSuccessScreen", "", "goal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onAction", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/goalsuccess/GoalSuccessViewModel;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/savings/ui/savingshub/goalsuccess/GoalSuccessViewModel;Landroidx/compose/runtime/Composer;II)V", "GoalSuccessScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalSuccessScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoalSuccessScreen(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel2;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        int i4;
        com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r15;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2052281316);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(goalSummaryDTO) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    goalSuccessViewModel2 = goalSuccessViewModel;
                    if (startRestartGroup.changedInstance(goalSuccessViewModel2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    goalSuccessViewModel2 = goalSuccessViewModel;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                goalSuccessViewModel2 = goalSuccessViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    goalSuccessViewModel4 = goalSuccessViewModel2;
                    r15 = 1;
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        z = true;
                        i4 = i3 & (-7169);
                        goalSuccessViewModel4 = (com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        z = true;
                        i4 = i3;
                        goalSuccessViewModel4 = goalSuccessViewModel2;
                    }
                    modifier3 = modifier4;
                    r15 = z;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2052281316, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreen (GoalSuccessScreen.kt:62)");
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(goalSuccessViewModel4);
                boolean z2 = (i4 & 14) == 4 ? r15 : false;
                com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$GoalSuccessScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$GoalSuccessScreen$1$1(goalSuccessViewModel4, goalSummaryDTO, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, r15, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.savings.ui.testtags.GoalSuccessTestTags.SCREEN);
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
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                goalSuccessViewModel3 = goalSuccessViewModel4;
                char c = r15;
                com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_success_title, new java.lang.Object[]{goalSummaryDTO.getTitle()}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.GoalSuccessTestTags.HEADER), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_success_description, startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt.INSTANCE.getLambda$1561904881$savings_prodRelease(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 221232, 72);
                com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_success_transfer_money, startRestartGroup, 0);
                int i7 = i4 & 112;
                char c2 = i7 == 32 ? c : (char) 0;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (c2 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt.$r8$lambda$JxoKNi_RavF853p0KvLha1JMLFY(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem(stringResource, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_success_view_goal, startRestartGroup, 0);
                char c3 = i7 == 32 ? c : (char) 0;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (c3 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt.$r8$lambda$BEOPqqAmPKaJfFeAAbvnrzYXLrc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                buttonGroupItemArr[c] = new com.paypal.pds.components.ButtonGroupItem(stringResource2, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, 108, null);
                com.paypal.pds.components.ButtonGroupKt.ButtonGroup(buttonGroupItemArr, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.ui.testtags.GoalSuccessTestTags.BUTTON_GROUP), com.paypal.pds.components.ButtonSize.Large.INSTANCE, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, startRestartGroup, (com.paypal.pds.components.ButtonGroupAlignment.Vertical.$stable << 9) | 384, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                goalSuccessViewModel3 = goalSuccessViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel5 = goalSuccessViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt.m18985$r8$lambda$A1YW78SBf1BtfoLj0AMr0mngYI(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, function1, modifier5, goalSuccessViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$A1YW78SBf1BtfoLj0AMr-0mngYI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18985$r8$lambda$A1YW78SBf1BtfoLj0AMr0mngYI(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GoalSuccessScreen(goalSummaryDTO, function1, modifier, goalSuccessViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BBVvj_n_1uVexRkHZbIWi6141jU(com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSuccessActionType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BEOPqqAmPKaJfFeAAbvnrzYXLrc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType.ViewGoal);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JxoKNi_RavF853p0KvLha1JMLFY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType.TransferMoney);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uw86SkLE_f-zuZkt3CTpi30yUxs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18986$r8$lambda$uw86SkLE_fzuZkt3CTpi30yUxs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1751253922);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1751253922, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenPreview (GoalSuccessScreen.kt:120)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO("goal-123", "Vacation Fund", "", "$33.53", "$33.53", 0.0d, true, false, (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) null, new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", "33.53"), true, new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", "33.53"), 256, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt.$r8$lambda$BBVvj_n_1uVexRkHZbIWi6141jU((com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            GoalSuccessScreen(goalSummaryDTO, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessScreenKt.m18986$r8$lambda$uw86SkLE_fzuZkt3CTpi30yUxs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
