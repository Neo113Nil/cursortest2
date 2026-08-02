package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "uiModel", "Lkotlin/Function0;", "", "onClose", "UpdatePaymentSuccessHalfSheet", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onDoneClick", "UpdatePaymentSuccessHalfSheetContent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdatePaymentSuccessHalfSheetKt {
    public static final void UpdatePaymentSuccessHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentSuccessUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(69850521);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(updatePaymentSuccessUiModel) : startRestartGroup.changedInstance(updatePaymentSuccessUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(69850521, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheet (UpdatePaymentSuccessHalfSheet.kt:50)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) {
                z = true;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$UpdatePaymentSuccessHalfSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$UpdatePaymentSuccessHalfSheet$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig("", false, null, 4, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2091508320, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.$r8$lambda$9LtR9CsktEMZ7J9rCFQE8Hupfeo(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel.this, bottomSheetController, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i3 | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i2 << 12) & 3670016), 442);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.m12535$r8$lambda$HFAG2tniX6aRj61DQJKu8qm40(com.paypal.pds.components.BottomSheetController.this, updatePaymentSuccessUiModel, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UpdatePaymentSuccessHalfSheetContent(final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentSuccessUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(966630964);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(updatePaymentSuccessUiModel) : startRestartGroup.changedInstance(updatePaymentSuccessUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(966630964, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetContent (UpdatePaymentSuccessHalfSheet.kt:77)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetTestTags.UPDATE_PAYMENT_SUCCESS_HALF_SHEET);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(updatePaymentSuccessUiModel.getImageRes(), startRestartGroup, 0), null, 2, null), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.Large.$stable << 6) | 3072, 50);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(updatePaymentSuccessUiModel.getContent().getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(updatePaymentSuccessUiModel.getContent().getSuccessMessage(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(updatePaymentSuccessUiModel.getContent().getDoneButton(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, false, startRestartGroup, ((i3 >> 3) & 14) | 384, 504);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.$r8$lambda$Plo5v_urDyr4o1ua2yDT0N3fV74(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2fKExF4cchMYbEQcZVd2chyqKcU(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9LtR9CsktEMZ7J9rCFQE8Hupfeo(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2091508320, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheet.<anonymous> (UpdatePaymentSuccessHalfSheet.kt:63)");
            }
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.$r8$lambda$2fKExF4cchMYbEQcZVd2chyqKcU(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            UpdatePaymentSuccessHalfSheetContent(updatePaymentSuccessUiModel, (kotlin.jvm.functions.Function0) rememberedValue, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HFAG2tniX6aRj61DQ-JKu8q-m40, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12535$r8$lambda$HFAG2tniX6aRj61DQJKu8qm40(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        UpdatePaymentSuccessHalfSheet(bottomSheetController, updatePaymentSuccessUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Iqz3Or4UDfAAt_JmrPHP7bRe8wo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2124184810);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2124184810, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetLightPreview (UpdatePaymentSuccessHalfSheet.kt:130)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider changeFiContentProvider = new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider();
            com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel = new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel(new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent(changeFiContentProvider.getSuccessContent().getPaymentMethodUpdatedTitle(), changeFiContentProvider.getSuccessContent().successMessage("1234"), changeFiContentProvider.getSuccessContent().getDoneButton()), com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_clock_clockwise);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            UpdatePaymentSuccessHalfSheetContent(updatePaymentSuccessUiModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.$r8$lambda$Iqz3Or4UDfAAt_JmrPHP7bRe8wo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Plo5v_urDyr4o1ua2yDT0N3fV74(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        UpdatePaymentSuccessHalfSheetContent(updatePaymentSuccessUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$evja3QKz7iBdOlJHbgQJqZ7XVzM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-525221107);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-525221107, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessAutopayDarkPreview (UpdatePaymentSuccessHalfSheet.kt:155)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider changeFiContentProvider = new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider();
            com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel = new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel(new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent(changeFiContentProvider.getSuccessContent().getAutopayIsOnTitle(), changeFiContentProvider.getSuccessContent().successMessage("5678"), changeFiContentProvider.getSuccessContent().getDoneButton()), com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_clock_countdown);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            UpdatePaymentSuccessHalfSheetContent(updatePaymentSuccessUiModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessHalfSheetKt.$r8$lambda$evja3QKz7iBdOlJHbgQJqZ7XVzM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
