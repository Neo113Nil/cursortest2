package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"RequestPhysicalCardForFeeContent", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "requestPhysicalCardPricingInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardPricingInfo;", "onAcceptClick", "Lkotlin/Function0;", "onLinkClick", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardPricingInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NumberedAvatar", "number", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "RequestPhysicalCardForFeeContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease", "isConsentChecked", "", "showConsentWarning"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardForFeeContentKt {
    public static final void RequestPhysicalCardForFeeContent(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardPricingInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1718476135);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(requestPhysicalCardPricingInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1718476135, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContent (RequestPhysicalCardForFeeContent.kt:83)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getUserIntent(requestPhysicalCardPricingInfo.getProductName());
            composer2 = startRestartGroup;
            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2018242780, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$xylVdlo0cJatRrWMKcOKEmWGFDI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo.this, userIntent, function02, function0, mutableState, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-723637155, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$YbT7qmUdxR6YTiKXwe90_kqw2OI(androidx.compose.foundation.ScrollState.this, appNavigator, userIntent, requestPhysicalCardPricingInfo, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, 27648, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$ZKdbL9QR6LLNrkf4x9GxbrreMCo(com.paypal.oslo.core.navigation.AppNavigator.this, requestPhysicalCardPricingInfo, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1469487065);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1469487065, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.NumberedAvatar (RequestPhysicalCardForFeeContent.kt:235)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(str), null, com.paypal.pds.components.AvatarSize.Small.INSTANCE, com.paypal.pds.components.AvatarEmphasis.High.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.Small.$stable << 6) | 3072, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$zZUHb60EvV20qeDk_DlPiu4pKkQ(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CVOlEzjEgM_L5lLsTBxfRN2wN5Y(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        com.paypal.pds.core.Builder.append$default(builder, " ", null, false, 6, null);
        builder.appendLink(str2, "physical_card_agreement");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HK7UlUEpRBWf90k4_4qd6-c5VrA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14485$r8$lambda$HK7UlUEpRBWf90k4_4qd6c5VrA(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, int i, boolean z) {
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getAGREEMENT_CHECKBOX(), userIntentContext, null, 8, null);
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        if (z) {
            mutableState2.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IGp_l4wulRpGxXGbCQB994ugkTY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1429395523);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1429395523, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentPreview (RequestPhysicalCardForFeeContent.kt:245)");
            }
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo = new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, "4.99 EUR", "2.00 EUR", "");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RequestPhysicalCardForFeeContent(appNavigator, requestPhysicalCardPricingInfo, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3456);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$IGp_l4wulRpGxXGbCQB994ugkTY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZ_R39NeXI1Zd4KStDYW4TDLO74(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(83271343, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RequestPhysicalCardForFeeContent.kt:208)");
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
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_atm_title, composer, 0), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_atm_description, new java.lang.Object[]{requestPhysicalCardPricingInfo.getCardWithdrawalAtmFee()}, composer, 0), null, null, false, true, null, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.ComposableSingletons$RequestPhysicalCardForFeeContentKt.INSTANCE.getLambda$405122320$debit_card_prodRelease(), null, null, null, false, null, null, null, null, null, false, composer, 102236160, 0, 523962);
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_mastercard_title, composer, 0), null, null, null, null, false, false, null, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.ComposableSingletons$RequestPhysicalCardForFeeContentKt.INSTANCE.m14484getLambda$1396861945$debit_card_prodRelease(), null, null, null, false, null, null, null, null, null, false, composer, 100663296, 0, 524030);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$YbT7qmUdxR6YTiKXwe90_kqw2OI(androidx.compose.foundation.ScrollState scrollState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-723637155, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContent.<anonymous> (RequestPhysicalCardForFeeContent.kt:165)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$g4KJsGxKaFUfja_zqeKG30Ez5l0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 384, 107);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(483537051);
                com.paypal.pds.components.BannerKt.Banner(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntentContext)), com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getCONSENT_WARNING_BANNER()), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_consent_warning, composer, 0), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, composer, 48, 120);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(484027161);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_title, composer, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_description, new java.lang.Object[]{requestPhysicalCardPricingInfo.getCardIssuanceFee()}, composer, 0), (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 48, 120);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            com.paypal.pds.components.CardKt.Card(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(userIntentContext)), com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getFEE_INFO_CARD()), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(83271343, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$QZ_R39NeXI1Zd4KStDYW4TDLO74(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 805306368 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZKdbL9QR6LLNrkf4x9GxbrreMCo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        RequestPhysicalCardForFeeContent(appNavigator, requestPhysicalCardPricingInfo, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eBgvgyX2eoQIpqK__yfn2fKqQ2w(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function0 function0, int i, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        if (str != null) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getAGREEMENT_LINK(), userIntentContext, null, 8, null);
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g4KJsGxKaFUfja_zqeKG30Ez5l0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$rWNNkwxXtw5_IWQpW0RVWeVFRLw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$j99RR49gerzUGPRyjXYWJzUVHeY(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getACCEPT_BUTTON(), userIntentContext, null, 8, null);
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            function0.invoke();
        } else {
            mutableState2.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rWNNkwxXtw5_IWQpW0RVWeVFRLw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$xylVdlo0cJatRrWMKcOKEmWGFDI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2018242780, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContent.<anonymous> (RequestPhysicalCardForFeeContent.kt:97)");
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
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_consent_description_prefix, composer, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_consent_link, composer, 0);
            final java.lang.String agreementUrl = requestPhysicalCardPricingInfo.getAgreementUrl();
            if (agreementUrl == null || kotlin.text.StringsKt.isBlank(agreementUrl)) {
                agreementUrl = null;
            }
            com.paypal.pds.components.LegalConsentItem.Companion companion2 = com.paypal.pds.components.LegalConsentItem.INSTANCE;
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_consent_label, composer, 0);
            com.paypal.pds.core.RichText.Companion companion3 = com.paypal.pds.core.RichText.INSTANCE;
            boolean changed = composer.changed(stringResource);
            boolean changed2 = composer.changed(stringResource2);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$CVOlEzjEgM_L5lLsTBxfRN2wN5Y(stringResource, stringResource2, (com.paypal.pds.core.Builder) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.explicit$default(companion2, stringResource3, companion3.invoke((kotlin.jvm.functions.Function1) rememberedValue), ((java.lang.Boolean) mutableState.getValue()).booleanValue(), (com.paypal.pds.core.AnalyticsScope) null, 8, (java.lang.Object) null));
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getAGREEMENT_SECTION()), kotlin.collections.CollectionsKt.listOf(userIntentContext));
            boolean changedInstance = composer.changedInstance(userIntentContext);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.m14485$r8$lambda$HK7UlUEpRBWf90k4_4qd6c5VrA(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, mutableState, mutableState2, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            boolean changed3 = composer.changed(agreementUrl);
            boolean changedInstance2 = composer.changedInstance(userIntentContext);
            boolean changed4 = composer.changed(function0);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changedInstance2 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$eBgvgyX2eoQIpqK__yfn2fKqQ2w(agreementUrl, userIntentContext, function0, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, context, function2, (kotlin.jvm.functions.Function3) rememberedValue3, null, composer, com.paypal.pds.components.LegalConsentItem.$stable, 16);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_request_physical_card_cta, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null), kotlin.collections.CollectionsKt.listOf(userIntentContext)), com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getACCEPT_BUTTON());
            boolean changedInstance3 = composer.changedInstance(userIntentContext);
            boolean changed5 = composer.changed(function02);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changedInstance3 | changed5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.$r8$lambda$j99RR49gerzUGPRyjXYWJzUVHeY(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, function02, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource4, item, null, null, primary, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zZUHb60EvV20qeDk_DlPiu4pKkQ(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
