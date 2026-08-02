package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/MoneyOnHoldState;", "state", "Lkotlin/Function3;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "", "Lkotlin/coroutines/Continuation;", "", "", "formatMoney", "", "MoneyOnHoldDetails", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/onholddetails/MoneyOnHoldState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "p0", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MoneyHoldDetailsPreview", "(Landroidx/compose/runtime/Composer;I)V", "HelpCenterID", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoneyOnHoldDetailsKt {
    public static final java.lang.String HelpCenterID = "FAQ1987";

    public static final void MoneyOnHoldDetails(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState moneyOnHoldState, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyOnHoldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-798080790);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(moneyOnHoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-798080790, i3, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetails (MoneyOnHoldDetails.kt:49)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.INSTANCE.getMONEY_ON_HOLD_ZONE()), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.MoneyOnHold.SCREEN);
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
            com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt.CardAmount(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_money_hold_title, startRestartGroup, 0), moneyOnHoldState.getAmountOnHold(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.MoneyOnHold.AMOUNT_CARD), function3, null, startRestartGroup, ((i3 << 3) & 7168) | 384, 16);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.$r8$lambda$ES3ovzr7fHk7GbKHti4sKbOmoeQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.$r8$lambda$JUIrTxLCbco1b4fHSyzTfX_ZbsQ(com.paypal.oslo.core.navigation.AppNavigator.this, moneyOnHoldState, function3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(7424764);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(7424764, i2, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldInstructions (MoneyOnHoldDetails.kt:74)");
            }
            int i3 = i2;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_money_on_hold_details_instructions_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.MoneyOnHold.TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 432, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_money_on_hold_details_instructions_description, startRestartGroup, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_money_on_hold_details_instructions_link_text, startRestartGroup, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.MoneyOnHold.DESCRIPTION);
            com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
            boolean changed = startRestartGroup.changed(stringResource);
            boolean changed2 = startRestartGroup.changed(stringResource2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.$r8$lambda$4VSzH9j2lWFs66Lx6ZCQ37WtedY(stringResource, stringResource2, (com.paypal.pds.core.Builder) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.core.RichText invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
            com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.$r8$lambda$JY82lNW3IuZC205FXk3m665nS2U(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, testTag, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodyLarge, null, composer2, 48, 48, 5116);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.m12184$r8$lambda$lGwtCXrKKwmrf2MVzPE5XlfO6E(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MoneyHoldDetailsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1119296496);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1119296496, i, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MoneyHoldDetailsPreview (MoneyOnHoldDetails.kt:101)");
            }
            com.paypal.oslo.feature.balance.domain.model.Money money = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal("2000.00"), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null);
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState moneyOnHoldState = new com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState(money);
            com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$MoneyHoldDetailsPreview$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$MoneyHoldDetailsPreview$1$1(null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MoneyOnHoldDetails(appNavigator, moneyOnHoldState, (kotlin.jvm.functions.Function3) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.$r8$lambda$er71HI84r4Z5jknYzYktt3G3C_s(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4VSzH9j2lWFs66Lx6ZCQ37WtedY(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        builder.appendLink(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ES3ovzr7fHk7GbKHti4sKbOmoeQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.m12183$r8$lambda$bFc6T4oSkckbedEpOYPckbi2Io((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JUIrTxLCbco1b4fHSyzTfX_ZbsQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState moneyOnHoldState, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        MoneyOnHoldDetails(appNavigator, moneyOnHoldState, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JY82lNW3IuZC205FXk3m665nS2U(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bFc6T4oSkc-kbedEpOYPckbi2Io, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12183$r8$lambda$bFc6T4oSkckbedEpOYPckbi2Io(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination(HelpCenterID));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$er71HI84r4Z5jknYzYktt3G3C_s(int i, androidx.compose.runtime.Composer composer, int i2) {
        MoneyHoldDetailsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lGwtCXrKKwmrf2MVzP-E5XlfO6E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12184$r8$lambda$lGwtCXrKKwmrf2MVzPE5XlfO6E(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
