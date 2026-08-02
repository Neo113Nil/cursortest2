package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"SpecialFinancingRow", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingRowKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpecialFinancingRow(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingItemUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-533243076);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(specialFinancingItemUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-533243076, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRow (SpecialFinancingRow.kt:28)");
                }
                com.paypal.pds.components.ListKt.ListItemView(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.SpecialFinancingItemToListItemMapperKt.toListItem(specialFinancingItemUiModel, startRestartGroup, i3 & 14), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, function0, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable | ((i3 << 3) & 7168), 116);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt.m18411$r8$lambda$CFViJIrEr_tWa0y69PXFiTRevo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel.this, modifier3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$CFViJIrEr_t-Wa0y69PXFiTRevo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18411$r8$lambda$CFViJIrEr_tWa0y69PXFiTRevo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SpecialFinancingRow(specialFinancingItemUiModel, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K-CsR5vydGN9WNDVKcMz-GmXxqM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18413$r8$lambda$KCsR5vydGN9WNDVKcMzGmXxqM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1076597069);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1076597069, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.Preview (SpecialFinancingRow.kt:38)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel("", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Nike"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_activity_subtitle, new java.lang.Object[]{"December 26, 2024"}, null, false, 12, null), "", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$127.01"), "May 27, 2024", "$324.64", "December 26, 2024", "$27.01", true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Remaining \nbalance"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SpecialFinancingRow(specialFinancingItemUiModel, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRowKt.m18413$r8$lambda$KCsR5vydGN9WNDVKcMzGmXxqM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
