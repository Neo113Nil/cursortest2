package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"SnoozePaymentCard", "", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/SnoozePaymentCardUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/SnoozePaymentCardUiModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SnoozeIcon", "icon", "Lcom/paypal/pds/core/Icon;", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/runtime/Composer;I)V", "SnoozePaymentComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozePaymentCardKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SnoozePaymentCard(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel snoozePaymentCardUiModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozePaymentCardUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1946222194);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(snoozePaymentCardUiModel) : startRestartGroup.changedInstance(snoozePaymentCardUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1946222194, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCard (SnoozePaymentCard.kt:49)");
                    }
                    function03 = function04;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-746981172, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt.m12668$r8$lambda$_ilt20UQ9IcTRTdo1xMLzrEo5c(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel.this, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306368, 502);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt.m12669$r8$lambda$cfyqtkSYnrOTek847GZflPM_34(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel.this, modifier5, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(final com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-520806174);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-520806174, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozeIcon (SnoozePaymentCard.kt:77)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(icon), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt.m12670$r8$lambda$yqviODVmUkvPAUxwW2fdDP08Wk(com.paypal.pds.core.Icon.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$_ilt-20UQ9IcTRTdo1xMLzrEo5c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12668$r8$lambda$_ilt20UQ9IcTRTdo1xMLzrEo5c(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel snoozePaymentCardUiModel, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-746981172, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCard.<anonymous> (SnoozePaymentCard.kt:54)");
            }
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(com.paypal.oslo.core.commonui.utils.RefTextKt.value(snoozePaymentCardUiModel.getSnoozePaymentTitleText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(snoozePaymentCardUiModel.getSnoozePaymentDescription(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, true, false, null, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.ComposableSingletons$SnoozePaymentCardKt.INSTANCE.m12654getLambda$1718696760$bnpl_servicing_prodRelease(), null, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), 1900, null), null, false, function0, null, null, false, composer, com.paypal.pds.components.ListItem.$stable, 118);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cfyqtkSYn-rOTek847GZflPM_34, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12669$r8$lambda$cfyqtkSYnrOTek847GZflPM_34(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel snoozePaymentCardUiModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SnoozePaymentCard(snoozePaymentCardUiModel, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$clAK6v4WIV65AVcdQdy8y3dn40U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-133471381);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-133471381, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentComponentPreview (SnoozePaymentCard.kt:94)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider planDetailsContentProvider = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider();
            SnoozePaymentCard(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardUiModel(planDetailsContentProvider.getSnoozePaymentCardTitle(), planDetailsContentProvider.snoozePaymentCardDescription(" \n17 April 2025", "11 May 2025")), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16()), null, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.SnoozePaymentCardKt.$r8$lambda$clAK6v4WIV65AVcdQdy8y3dn40U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yq-viODVmUkvPAUxwW2fdDP08Wk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12670$r8$lambda$yqviODVmUkvPAUxwW2fdDP08Wk(com.paypal.pds.core.Icon icon, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(icon, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
