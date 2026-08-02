package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "infoText", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "EmoneyInfoModal", "(Ljava/lang/String;Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/Composer;I)V", "text", "EmoneyModalContent", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmoneyInfoModalKt {
    public static final void EmoneyInfoModal(final java.lang.String str, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1184695032);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1184695032, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModal (EmoneyInfoModal.kt:34)");
            }
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(bottomSheetController))) {
                z = true;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.m12325$r8$lambda$nHfW3Dw9pWuaNbY6YdPnhfcku0(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2050102527, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.m12324$r8$lambda$m4sMC8VPKsjuZGlfAVlrWnuW24(str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | ((i2 >> 3) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 314);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.$r8$lambda$6G9zdu15F1RdvoL0MEFbYq0fc6o(str, bottomSheetController, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EmoneyModalContent(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-214455467);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-214455467, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyModalContent (EmoneyInfoModal.kt:47)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i2 & 14) | 432, 6, 1000);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.$r8$lambda$I246cbOMbdyJHPEi1XPDW39zWwU(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$577J9-roGZ367LUBLQjBo1S4Ak4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12323$r8$lambda$577J9roGZ367LUBLQjBo1S4Ak4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1063686887);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1063686887, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalPreview (EmoneyInfoModal.kt:70)");
            }
            EmoneyModalContent("E-money is a digital currency that we load on your virtual card.", startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModalKt.m12323$r8$lambda$577J9roGZ367LUBLQjBo1S4Ak4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6G9zdu15F1RdvoL0MEFbYq0fc6o(java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, androidx.compose.runtime.Composer composer, int i2) {
        EmoneyInfoModal(str, bottomSheetController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I246cbOMbdyJHPEi1XPDW39zWwU(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        EmoneyModalContent(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m4sMC8VPKsj-uZGlfAVlrWnuW24, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12324$r8$lambda$m4sMC8VPKsjuZGlfAVlrWnuW24(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2050102527, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.EmoneyInfoModal.<anonymous> (EmoneyInfoModal.kt:41)");
            }
            EmoneyModalContent(str, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n-HfW3Dw9pWuaNbY6YdPnhfcku0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12325$r8$lambda$nHfW3Dw9pWuaNbY6YdPnhfcku0(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }
}
