package com.paypal.oslo.feature.balance.common.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"TurnOffConfirmationSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "title", "", "isConsumerAccountType", "", "onClickTurnOff", "Lkotlin/Function0;", "onCloseButtonClick", "analyticsFlowName", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TurnOffConfirmationSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TurnOffConfirmationSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-251091290);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            str3 = str2;
            i3 |= startRestartGroup.changed(str3) ? 131072 : 65536;
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                str4 = str3;
            } else {
                java.lang.String str5 = i5 != 0 ? "auto_reload_turn_off" : str3;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-251091290, i4, -1, "com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheet (TurnOffConfirmationSheet.kt:47)");
                }
                final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str5, null);
                java.lang.String str6 = str5;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(214333165, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt.m12016$r8$lambda$wERqxpufdrxTAUG2OtMbeQTKbg(com.paypal.pds.components.BottomSheetController.this, businessFlowContext, str, z, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i4 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | (3670016 & (i4 << 6)), 442);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str4 = str6;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt.$r8$lambda$_W9TuTYarVNqfqY_yeovoqt4ZR0(com.paypal.pds.components.BottomSheetController.this, str, z, function0, function02, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str3 = str2;
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_W9TuTYarVNqfqY_yeovoqt4ZR0(com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TurnOffConfirmationSheet(bottomSheetController, str, z, function0, function02, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tQcFV5wtDy9N6w16KRLlJlTc2W4(kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        function0.invoke();
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wERqxpuf-drxTAUG2OtMbeQTKbg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12016$r8$lambda$wERqxpufdrxTAUG2OtMbeQTKbg(final com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, java.lang.String str, boolean z, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(214333165, i, -1, "com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheet.<anonymous> (TurnOffConfirmationSheet.kt:58)");
            }
            boolean visible = bottomSheetController.getVisible();
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changedInstance2 = composer.changedInstance(businessFlowContext);
            com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$TurnOffConfirmationSheet$1$1$1 rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$TurnOffConfirmationSheet$1$1$1(bottomSheetController, businessFlowContext, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 0);
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 2, null), kotlin.collections.CollectionsKt.plus((java.util.Collection) com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_VIEW_TURN_OFF), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(businessFlowContext)));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, context);
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
            if (z) {
                composer.startReplaceGroup(-131042650);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_turn_off_description, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-130914713);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_turn_off_description_merchant, composer, 0);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.HeaderKt.Header(str, (androidx.compose.ui.Modifier) null, stringResource, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null), composer, 0);
            androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getTURN_OFF_CONFIRM_BUTTON()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent("confirm_turn_off"));
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_turn_off_button, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            boolean changed = composer.changed(function0);
            boolean changedInstance3 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt.$r8$lambda$tQcFV5wtDy9N6w16KRLlJlTc2W4(kotlin.jvm.functions.Function0.this, bottomSheetController);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, context2, null, null, primary, large, false, false, composer, 1769472, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), composer, 0);
            androidx.compose.ui.Modifier context3 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getCANCEL_BUTTON()), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent("cancel_turn_off"));
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_leave_on_button, composer, 0);
            boolean changedInstance4 = composer.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$TurnOffConfirmationSheet$1$2$2$1 rememberedValue3 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.balance.common.ui.TurnOffConfirmationSheetKt$TurnOffConfirmationSheet$1$2$2$1(bottomSheetController);
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3), stringResource3, context3, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
