package com.paypal.oslo.feature.merchantbanking.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"AccountRoutingAccordion", "", "(Landroidx/compose/runtime/Composer;I)V", "BulletLabel", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "merchant-banking_prodRelease", "isItem1Expanded", "", "isItem2Expanded"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingAccordionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AccountRoutingAccordion(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-501615825);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-501615825, i, -1, "com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordion (AccountRoutingAccordion.kt:36)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO[]{new com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_title, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_1, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_2, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_3, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_4, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_5, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_making_payments_bullet_6, startRestartGroup, 0)}), ((java.lang.Boolean) mutableState.getValue()).booleanValue()), new com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_receiving_payments_title, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_receiving_payments_bullet_1, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_receiving_payments_bullet_2, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_receiving_payments_bullet_3, startRestartGroup, 0)}), ((java.lang.Boolean) mutableState2.getValue()).booleanValue())});
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.$r8$lambda$9ByMUsAm0nUaBKXPv_r69PR4wu8((com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.$r8$lambda$wztOW_gX5ZNNZVUIS5gHbN5Enyo(androidx.compose.runtime.MutableState.this, mutableState2, (com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.AccordionKt.Accordion(listOf, function1, wrapContentHeight$default, (kotlin.jvm.functions.Function2) rememberedValue4, true, com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.INSTANCE.m15592getLambda$1161701953$merchant_banking_prodRelease(), com.paypal.oslo.feature.merchantbanking.ui.components.ComposableSingletons$AccountRoutingAccordionKt.INSTANCE.m15593getLambda$820097943$merchant_banking_prodRelease(), null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.$r8$lambda$O_pRstgrmHRwVooPkTy6gl9jXLg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BulletLabel(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-856021375);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-856021375, i2, -1, "com.paypal.oslo.feature.merchantbanking.ui.components.BulletLabel (AccountRoutingAccordion.kt:95)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing2()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_start_bullet, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing2()), startRestartGroup, 0);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.m15589$r8$lambda$POtSrDm32DBe7rb31TKu2toVyQ(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, i3, 6, 1020);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.$r8$lambda$AAOD6AkomdpHIFuzsdgDkuETh4M(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ boolean $r8$lambda$9ByMUsAm0nUaBKXPv_r69PR4wu8(com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arnAccordionItemDTO, "");
        return arnAccordionItemDTO.isExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AAOD6AkomdpHIFuzsdgDkuETh4M(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        BulletLabel(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O_pRstgrmHRwVooPkTy6gl9jXLg(int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountRoutingAccordion(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$POtSrDm32DBe7-rb31TKu2toVyQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15589$r8$lambda$POtSrDm32DBe7rb31TKu2toVyQ(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$wztOW_gX5ZNNZVUIS5gHbN5Enyo(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arnAccordionItemDTO, "");
        if (i == 0) {
            mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        } else {
            mutableState2.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState2.getValue()).booleanValue()));
        }
        return kotlin.Unit.INSTANCE;
    }
}
