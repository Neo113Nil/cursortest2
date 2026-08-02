package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0018"}, d2 = {"FiImageSize", "Landroidx/compose/ui/unit/Dp;", "getFiImageSize", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "FiSectionHeader", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FiImage", "fi", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Landroidx/compose/runtime/Composer;I)V", "CheckmarkIcon", "(Landroidx/compose/runtime/Composer;I)V", "LinkNewInstrumentOption", "onClick", "Lkotlin/Function0;", "testTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlusIcon", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FiSelectionComponentsKt {
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);

    public static final float getFiImageSize() {
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FiSectionHeader(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1505031052);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1505031052, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSectionHeader (FiSelectionComponents.kt:55)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.savings.ui.testtags.FiSelectionTestTags.SECTION_HEADER), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.$r8$lambda$vPWcF_dwFvZBYyYRYQUMgv0die4(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void FiImage(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String str;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.ImageDTO image;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementFiDTO, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1959831572);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(moneyMovementFiDTO) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1959831572, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiImage (FiSelectionComponents.kt:70)");
            }
            int i3 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.WhenMappings.$EnumSwitchMapping$0[moneyMovementFiDTO.getSource().getInstrumentType().ordinal()];
            if (i3 == 1) {
                str = com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.BALANCE_IMAGE_URL;
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = moneyMovementFiDTO.getSource().getFiDto();
                if (fiDto == null || (image = fiDto.getImage()) == null || (str = image.getUrl()) == null) {
                    str = com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.PAYPAL_LOGO_IMAGE_URL;
                }
            }
            com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), "", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, Camera2StreamConfigurationMap), com.paypal.oslo.feature.savings.ui.testtags.FiSelectionTestTags.FI_ICON), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), com.paypal.pds.components.ImageCornerRadius.Radius8, null, null, startRestartGroup, 28080, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.$r8$lambda$L8JPmABbjWSqxZjBXRQqH_2e8Wk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CheckmarkIcon(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1686160561);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1686160561, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.CheckmarkIcon (FiSelectionComponents.kt:95)");
            }
            com.paypal.pds.core.Icon.CheckmarkCircleFill checkmarkCircleFill = com.paypal.pds.core.Icon.CheckmarkCircleFill.INSTANCE;
            com.paypal.pds.core.Icon.CheckmarkCircleFill checkmarkCircleFill2 = checkmarkCircleFill;
            com.paypal.pds.components.IconKt.Icon(checkmarkCircleFill2, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.FiSelectionTestTags.CHECKMARK_ICON), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 28086, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.m19050$r8$lambda$qhnecuiOnWnX3tp9nFBxf_mD_U(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkNewInstrumentOption(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(162036992);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(162036992, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.LinkNewInstrumentOption (FiSelectionComponents.kt:114)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12()), null, null, false, null, null, function0, startRestartGroup, (i4 << 15) & 3670016, 31), str2), com.paypal.pds.core.ConstantsKt.getSpacing12());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                PlusIcon(startRestartGroup, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i4 & 14) | 384, 6, 1018);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.$r8$lambda$FvnJO2ioXVRxePsJkIRdRSp5ZKU(str, function0, str2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PlusIcon(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1194063632);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1194063632, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.PlusIcon (FiSelectionComponents.kt:142)");
            }
            com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
            com.paypal.pds.core.Icon.Plus plus2 = plus;
            com.paypal.pds.components.IconKt.Icon(plus2, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.FiSelectionTestTags.PLUS_ICON), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 28086, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.$r8$lambda$VHtFIfQ8KPljjDdR_Wmh4vyRP8E(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FvnJO2ioXVRxePsJkIRdRSp5ZKU(java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkNewInstrumentOption(str, function0, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L8JPmABbjWSqxZjBXRQqH_2e8Wk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, int i, androidx.compose.runtime.Composer composer, int i2) {
        FiImage(moneyMovementFiDTO, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VHtFIfQ8KPljjDdR_Wmh4vyRP8E(int i, androidx.compose.runtime.Composer composer, int i2) {
        PlusIcon(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qhnec-uiOnWnX3tp9nFBxf_mD_U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19050$r8$lambda$qhnecuiOnWnX3tp9nFBxf_mD_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        CheckmarkIcon(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vPWcF_dwFvZBYyYRYQUMgv0die4(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FiSectionHeader(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
