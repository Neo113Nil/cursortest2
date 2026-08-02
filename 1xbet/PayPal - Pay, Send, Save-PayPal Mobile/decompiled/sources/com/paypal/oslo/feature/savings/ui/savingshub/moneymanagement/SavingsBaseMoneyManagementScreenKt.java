package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"SavingsBaseMoneyManagementScreen", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsBaseMoneyManagementScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsBaseMoneyManagementScreen(final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1335849285);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1335849285, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreen (SavingsBaseMoneyManagementScreen.kt:53)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.Object goalZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(kotlin.collections.CollectionsKt.arrayListOf(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.INSTANCE.getDummyData$savings_prodRelease(0)));
                    startRestartGroup.updateRememberedValue(goalZoneDTO);
                    rememberedValue2 = goalZoneDTO;
                }
                final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) rememberedValue2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$SavingsBaseMoneyManagementScreen$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                modifier3 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                int i6 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.WhenMappings.$EnumSwitchMapping$0[moneyManagementFlowType.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    startRestartGroup.startReplaceGroup(1987143732);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_add_money_to, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i6 == 4 || i6 == 5) {
                    startRestartGroup.startReplaceGroup(1987150043);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_money_from, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1987137413);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(stringResource, false, null, 6, null);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.$r8$lambda$1ZTTh_FqeollKqLs1_OKIuNxJiQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue4, topNavConfig, null, null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1388438714, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.$r8$lambda$uP8HyOACmmsEHBjVK6yaUXlLGnE(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO.this, moneyManagementFlowType, bottomSheetController, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.m19022$r8$lambda$sUFuJilz2p74Cm2Lvx4VOhF644(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, appNavigator, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1ZTTh_FqeollKqLs1_OKIuNxJiQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.m19021$r8$lambda$S3mfOSnj_EMxu4uUN4zXveydRM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3n5kFkCmTzwkxz7dPyb5AxFUPys(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        bottomSheetController.hideSheet();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.$r8$lambda$D3GXdG1VIqT_aL3AAz42zoOdanw(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, moneyManagementFlowType, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BgKcN-qMrwFkN9d3UISHDq-tfV0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19020$r8$lambda$BgKcNqMrwFkN9d3UISHDqtfV0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D3GXdG1VIqT_aL3AAz42zoOdanw(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination(goalSummaryDTO, moneyManagementFlowType, (java.lang.String) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GEfUNd2EX13POJCNaiskfeLYP4U(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        bottomSheetController.hideSheet();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.m19020$r8$lambda$BgKcNqMrwFkN9d3UISHDqtfV0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S3mfOSn-j_EMxu4uUN4zXveydRM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19021$r8$lambda$S3mfOSnj_EMxu4uUN4zXveydRM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sUFuJilz2p74C-m2Lvx4VOhF644, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19022$r8$lambda$sUFuJilz2p74Cm2Lvx4VOhF644(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsBaseMoneyManagementScreen(moneyManagementFlowType, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uP8HyOACmmsEHBjVK6yaUXlLGnE(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1388438714, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreen.<anonymous>.<anonymous> (SavingsBaseMoneyManagementScreen.kt:93)");
            }
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(moneyManagementFlowType.ordinal());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.$r8$lambda$3n5kFkCmTzwkxz7dPyb5AxFUPys(com.paypal.pds.components.BottomSheetController.this, appNavigator, moneyManagementFlowType, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.$r8$lambda$GEfUNd2EX13POJCNaiskfeLYP4U(com.paypal.pds.components.BottomSheetController.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, false, null, false, false, null, null, composer, 0, 0, 4080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
