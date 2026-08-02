package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "sendCopyChecked", "isLoading", "Lkotlin/Function1;", "", "onSendCopyChange", "Lkotlin/Function0;", "onConfirmClick", "onDismiss", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "SendReminderConfirmationModal", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendReminderConfirmationModalKt {
    public static final void SendReminderConfirmationModal(final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1716457121);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1716457121, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModal (SendReminderConfirmationModal.kt:62)");
            }
            boolean z3 = (458752 & i2) == 131072 || ((i2 & 262144) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$SendReminderConfirmationModal$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$SendReminderConfirmationModal$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i3 = (i2 >> 15) & 14;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(bottomSheetController, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | i3);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "send_reminder_confirmation_modal");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, new com.paypal.pds.components.TopNavConfig("", false, null, 6, null), null, null, null, function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2114282206, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt.m13358$r8$lambda$7UQ97R6DaOWFjgXbuHZHoQ6oGU(kotlin.jvm.functions.Function0.this, z2, z, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i3 | ((i2 >> 9) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i2 << 6) & 3670016), 440);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt.$r8$lambda$bkSCniBckiiF0RfAxoajXDAK_3U(z, z2, function1, function0, function02, bottomSheetController, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$7UQ97R6DaOWFjgXbuHZHoQ6oG-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13358$r8$lambda$7UQ97R6DaOWFjgXbuHZHoQ6oGU(kotlin.jvm.functions.Function0 function0, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2114282206, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModal.<anonymous>.<anonymous> (SendReminderConfirmationModal.kt:78)");
            }
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, navigationBarsPadding);
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
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_send_reminder_modal_title, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_send_reminder_modal_body, composer, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.CheckboxKt.Checkbox(z2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_send_reminder_send_copy, composer, 0), function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "send_copy_checkbox"), false, null, null, null, composer, 3072, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            composer.endNode();
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_send, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), "send_reminder_confirm_button"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, z, composer, 1769472, 152);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D7m2GY0FAkQnHRTjByT-jNuz0sQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13359$r8$lambda$D7m2GY0FAkQnHRTjByTjNuz0sQ(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZwcI-u2lJ_pjqd9ch6IEi7Njlq0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13361$r8$lambda$ZwcIu2lJ_pjqd9ch6IEi7Njlq0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2140627706);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2140627706, updateChangedFlags, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalPreview (SendReminderConfirmationModal.kt:130)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$SendReminderConfirmationModalPreview$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.ui.Modifier align = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt.$r8$lambda$iIB8tTmr59G4BI9zLkuCgKZVcI4(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, "Show Modal", align, null, null, null, null, false, false, startRestartGroup, 48, 504);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit2;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt.m13359$r8$lambda$D7m2GY0FAkQnHRTjByTjNuz0sQ(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            SendReminderConfirmationModal(true, false, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue6, bottomSheetController, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 15) | 25014);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.SendReminderConfirmationModalKt.m13361$r8$lambda$ZwcIu2lJ_pjqd9ch6IEi7Njlq0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bkSCniBckiiF0RfAxoajXDAK_3U(boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, androidx.compose.runtime.Composer composer, int i2) {
        SendReminderConfirmationModal(z, z2, function1, function0, function02, bottomSheetController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iIB8tTmr59G4BI9zLkuCgKZVcI4(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }
}
