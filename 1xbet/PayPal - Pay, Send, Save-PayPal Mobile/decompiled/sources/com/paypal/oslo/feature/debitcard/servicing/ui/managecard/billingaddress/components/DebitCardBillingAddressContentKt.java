package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"DebitCardBillingAddressContent", "", "address", "", "", "title", "onEditClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BillingAddressDetails", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DebitCardBillingAddressContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardBillingAddressContentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardBillingAddressContent(final java.util.List<java.lang.String> list, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1068592245);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1068592245, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContent (DebitCardBillingAddressContent.kt:56)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), str, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(388580015, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.$r8$lambda$zRlIw4F4hCp7ykK3PepPCjiv7lI(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3078, 4);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 384, 0), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 48, 0), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_BILLING_ADDRESS_CARD);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                Camera2StreamConfigurationMap(list, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, (i4 & 14) | 48, 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.$r8$lambda$MLUzCf4U9qFaQA8AYVaA8WYZS_Q(list, str, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.util.List<java.lang.String> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(949333055);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(949333055, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.BillingAddressDetails (DebitCardBillingAddressContent.kt:102)");
                }
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(joinToString$default, androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_BILLING_ADDRESS_DETAILS), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, bodyMedium, startRestartGroup, 384, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.m14371$r8$lambda$OG7g1Er0UaQpB4dhLlYwUFpm4(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MLUzCf4U9qFaQA8AYVaA8WYZS_Q(java.util.List list, java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardBillingAddressContent(list, str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OG7g1--Er0UaQpB4dhLlYwUFpm4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14371$r8$lambda$OG7g1Er0UaQpB4dhLlYwUFpm4(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dsXRmvWVecKRzQnpM-jI6156ZI0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14372$r8$lambda$dsXRmvWVecKRzQnpMjI6156ZI0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-171240807);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-171240807, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentPreview (DebitCardBillingAddressContent.kt:113)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Grace Hamilton", "200 N. Clark St", "Chicago, IL 60601"});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DebitCardBillingAddressContent(listOf, "Billing address", (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.m14372$r8$lambda$dsXRmvWVecKRzQnpMjI6156ZI0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nLS-y29-ZwtQp5_rC-NznkNBL4Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14373$r8$lambda$nLSy29ZwtQp5_rCNznkNBL4Q(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zRlIw4F4hCp7ykK3PepPCjiv7lI(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(388580015, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContent.<anonymous>.<anonymous> (DebitCardBillingAddressContent.kt:65)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_edit, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getEDIT_BILLING_ADDRESS_BUTTON()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_BILLING_ADDRESS_EDIT_BUTTON);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.billingaddress.components.DebitCardBillingAddressContentKt.m14373$r8$lambda$nLSy29ZwtQp5_rCNznkNBL4Q(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, testTag, null, null, secondary, small, false, false, composer, 1769472, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
