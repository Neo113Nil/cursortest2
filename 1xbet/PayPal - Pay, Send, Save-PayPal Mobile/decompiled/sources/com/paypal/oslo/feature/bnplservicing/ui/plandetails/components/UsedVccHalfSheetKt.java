package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0016\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0018"}, d2 = {"UNUSED_CARD_HEIGHT", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "UsedVccHalfSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "model", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;", "defaultBackgroundColor", "Lcom/paypal/pds/core/Color;", "onClose", "Lkotlin/Function0;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;Lcom/paypal/pds/core/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UsedVccContent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;I)V", com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardTestTag.VIRTUAL_CARD, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "cardImageContentDescription", "", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;Lcom/paypal/pds/core/Color;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "UsedVccContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "UsedVccHalfSheetPreview", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UsedVccHalfSheetKt {
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(198.0f);

    /* JADX WARN: Code restructure failed: missing block: B:59:0x014a, code lost:
    
        if (r1.changedInstance(r26) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UsedVccHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.pds.core.Color color2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$UsedVccHalfSheet$3$1 rememberedValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-150199063);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(virtualCardModel) : startRestartGroup.changedInstance(virtualCardModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            color2 = color;
            i3 |= startRestartGroup.changed(color2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i3;
            boolean z = false;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                final com.paypal.pds.core.Color color3 = i5 != 0 ? com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE : color2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-150199063, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheet (UsedVccHalfSheet.kt:70)");
                }
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 5, null);
                int i6 = i4 & 14;
                boolean z2 = i6 == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                boolean z3 = (i4 & 7168) == 2048;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.m12677$r8$lambda$r492wg4XASETsSUhpioTigjdxw(com.paypal.pds.components.BottomSheetController.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.core.Color color4 = color3;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1364815358, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.m12678$r8$lambda$yO666xibFrxi1jp63XE5XO1ueY(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel.this, color3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.TopNavConfig.$stable << 6) | com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i6, 442);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (i6 != 4) {
                    if ((i4 & 8) != 0) {
                        composer2 = startRestartGroup;
                    } else {
                        composer2 = startRestartGroup;
                    }
                    rememberedValue = composer2.rememberedValue();
                    if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$UsedVccHalfSheet$3$1(bottomSheetController, null);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    color2 = color4;
                } else {
                    composer2 = startRestartGroup;
                }
                z = true;
                rememberedValue = composer2.rememberedValue();
                if (!z) {
                }
                rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$UsedVccHalfSheet$3$1(bottomSheetController, null);
                composer2.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                color2 = color4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.$r8$lambda$r8yB451eJW9RwdbbbRyjNMhRTS4(com.paypal.pds.components.BottomSheetController.this, virtualCardModel, color2, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        color2 = color;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        boolean z4 = false;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, final com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2059131604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(virtualCardModel) : startRestartGroup.changedInstance(virtualCardModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(color) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2059131604, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccContent (UsedVccHalfSheet.kt:91)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetTestTag.CARD);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            Camera2StreamConfigurationMap(virtualCardModel, color, null, startRestartGroup, (i2 & 112) | i3 | i4 | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | (i2 & 14), 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Information.INSTANCE, null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 4);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardModel.getPurchaseMerchantText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1000);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.$r8$lambda$x8_P50FxwrJ5kfgxrButRVBnstY(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel.this, color, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.pds.core.Color color2;
        int i4;
        java.lang.String str2;
        com.paypal.pds.core.Color color3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1079270062);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(virtualCardModel) : startRestartGroup.changedInstance(virtualCardModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            color2 = color;
            i3 |= startRestartGroup.changed(color2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    color3 = color2;
                    str3 = str2;
                } else {
                    color3 = i5 != 0 ? com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE : color2;
                    java.lang.String str4 = i4 != 0 ? null : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1079270062, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCard (UsedVccHalfSheet.kt:157)");
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.draw.ShadowKt.m5613shadows4CzXII$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), getHighSpeedVideoSizes), com.paypal.pds.core.ConstantsKt.getSize2(), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24()), false, 0L, 0L, 28, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24())), color3, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, i3 & 112, 2), com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.UNUSED_VIRTUAL_CARD);
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
                    com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(virtualCardModel.getBackgroundImageUrl(), str4, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds(), startRestartGroup, ((i3 >> 3) & 112) | 224640, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardModel.getCardType(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize40(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.CARD_TYPE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardModel.getLastFourDigitsText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomStart()), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetTestTag.LAST_FOUR_DIGITS), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.pds.core.Color color4 = color3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.m12675$r8$lambda$ODfP1XOGWVFXY9NLhT1rSaMn14(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel.this, color4, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        color2 = color;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$ODfP1XOGWVFXY-9NLhT1rSaMn14, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12675$r8$lambda$ODfP1XOGWVFXY9NLhT1rSaMn14(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(virtualCardModel, color, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SkMf0lppgEfvff4C8LUtpcm5YgI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1183934550);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1183934550, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetPreview (UsedVccHalfSheet.kt:252)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel("2134", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_single_use, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Used for your purchase at Name"), "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "Name", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_single_use_card_sheet_default_last4_digits, "2134"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_purchase_merchant, "Name"));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            int i3 = com.paypal.pds.components.BottomSheetController.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i5 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            UsedVccHalfSheet(bottomSheetController, virtualCardModel, null, function0, startRestartGroup, i3 | 3072 | (((((i4 | i5) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3), 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.$r8$lambda$SkMf0lppgEfvff4C8LUtpcm5YgI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tmv_GYvBogdKO6Q-ZAOCom2CjbY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12676$r8$lambda$Tmv_GYvBogdKO6QZAOCom2CjbY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1448648931);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1448648931, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccContentPreview (UsedVccHalfSheet.kt:225)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel("2134", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_single_use, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Used for your purchase at Name"), "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoCardArt@3x.png", "Name", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_single_use_card_sheet_default_last4_digits, "2134"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_purchase_merchant, "Name"));
            com.paypal.pds.core.Color.BackgroundBrandPrimary backgroundBrandPrimary = com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE;
            int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            getHighSpeedVideoFpsRangesFor(virtualCardModel, backgroundBrandPrimary, startRestartGroup, i3 | i4 | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheetKt.m12676$r8$lambda$Tmv_GYvBogdKO6QZAOCom2CjbY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r492wg4XASETsSUhpioTigjdx-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12677$r8$lambda$r492wg4XASETsSUhpioTigjdxw(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r8yB451eJW9RwdbbbRyjNMhRTS4(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UsedVccHalfSheet(bottomSheetController, virtualCardModel, color, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x8_P50FxwrJ5kfgxrButRVBnstY(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(virtualCardModel, color, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yO666xibFrxi1jp63XE5XO1-ueY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12678$r8$lambda$yO666xibFrxi1jp63XE5XO1ueY(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1364815358, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.UsedVccHalfSheet.<anonymous> (UsedVccHalfSheet.kt:79)");
            }
            int i2 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            getHighSpeedVideoFpsRangesFor(virtualCardModel, color, composer, i2 | i2 | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
