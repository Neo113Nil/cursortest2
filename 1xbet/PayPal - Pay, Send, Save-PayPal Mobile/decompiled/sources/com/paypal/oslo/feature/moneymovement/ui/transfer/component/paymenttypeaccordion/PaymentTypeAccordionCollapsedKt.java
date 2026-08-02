package com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"PaymentTypeAccordionCollapsed", "", "readyState", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;", "enabled", "", "showInfoLink", "onInfoLinkClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "onExpand", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordionCollapsedKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentTypeAccordionCollapsed(final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(649659853);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function02 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(649659853, i5, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsed (PaymentTypeAccordionCollapsed.kt:63)");
                    }
                    com.paypal.oslo.feature.moneymovement.api.domain.PaymentType selectedType = ready.getSelectedType();
                    if (selectedType != null) {
                        final com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption typeOption = com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeMapperKt.toTypeOption(selectedType);
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(modifier4, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "paymentTypeRow");
                        boolean z3 = z && function03 != null;
                        int i8 = i5 & 458752;
                        boolean z4 = i8 == 131072;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.$r8$lambda$B9FFXud4LCCf849saGm2trPt5S8(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        composer2 = startRestartGroup;
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(testTag, null, null, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 27), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1707paddingVpY3zN4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(typeOption.getIcon()), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, composer2, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(typeOption.getDisplayName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer2, 384, 6, 1018);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(typeOption.getDescription(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                        if (z2 && typeOption.getInfoLink() != null) {
                            composer2.startReplaceGroup(-1866503035);
                            java.lang.String text = typeOption.getInfoLink().getText();
                            com.paypal.pds.core.Typography.LinkMedium linkMedium = com.paypal.pds.core.Typography.LinkMedium.INSTANCE;
                            com.paypal.pds.core.Color.ContentLink contentLink = com.paypal.pds.core.Color.ContentLink.INSTANCE;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            boolean z5 = (i5 & 7168) == 2048;
                            boolean changed = composer2.changed(typeOption);
                            java.lang.Object rememberedValue2 = composer2.rememberedValue();
                            if ((changed | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.m15706$r8$lambda$iJCOgWakNWdkVLzpxO8KJONjPk(kotlin.jvm.functions.Function1.this, typeOption);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            i6 = 0;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(text, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion, null, null, z, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, ((i5 << 6) & 7168) | 6, 27), contentLink, null, null, null, false, 0, 0, null, linkMedium, composer2, 384, 6, 1016);
                            composer2.endReplaceGroup();
                        } else {
                            i6 = 0;
                            composer2.startReplaceGroup(-1866172017);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (z && function03 != null) {
                            composer2.startReplaceGroup(2083234618);
                            com.paypal.pds.core.Icon.ChevronDown chevronDown = com.paypal.pds.core.Icon.ChevronDown.INSTANCE;
                            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "paymentTypeDropdown");
                            com.paypal.pds.components.ButtonStyle.TertiaryContained tertiaryContained = com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE;
                            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_expand, composer2, i6);
                            com.paypal.pds.core.Icon.ChevronDown chevronDown2 = chevronDown;
                            int i9 = i8 != 131072 ? i6 : 1;
                            java.lang.Object rememberedValue3 = composer2.rememberedValue();
                            if (i9 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.m15705$r8$lambda$g_HAj0GxGcVSdZKbs7Ot44Ov5I(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.pds.components.IconButtonKt.IconButton(chevronDown2, (kotlin.jvm.functions.Function0) rememberedValue3, testTag2, tertiaryContained, small, stringResource, null, false, false, composer2, 28038, 448);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(2083612601);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function02 = function03;
                        modifier3 = modifier5;
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier6 = modifier4;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.$r8$lambda$5yIPJFR8wGxpIEoZDZLwTUP5mYU(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready.this, z, z2, function1, modifier6, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordionCollapsedKt.$r8$lambda$0FWSBcd3qSxzu0Ey7Cda10P8Nf0(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready.this, z, z2, function1, modifier3, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            function02 = function0;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0FWSBcd3qSxzu0Ey7Cda10P8Nf0(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentTypeAccordionCollapsed(ready, z, z2, function1, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5yIPJFR8wGxpIEoZDZLwTUP5mYU(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentTypeAccordionCollapsed(ready, z, z2, function1, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B9FFXud4LCCf849saGm2trPt5S8(kotlin.jvm.functions.Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g_HAj0GxG-cVSdZKbs7Ot44Ov5I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15705$r8$lambda$g_HAj0GxGcVSdZKbs7Ot44Ov5I(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iJCOgWakNWdkVLzpxO-8KJONjPk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15706$r8$lambda$iJCOgWakNWdkVLzpxO8KJONjPk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption typeOption) {
        function1.invoke(typeOption.getInfoLink().getUrl());
        return kotlin.Unit.INSTANCE;
    }
}
