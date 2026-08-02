package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "Lcom/paypal/pds/components/ListItem;", "toListItem", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingItemToListItemMapperKt {
    public static final com.paypal.pds.components.ListItem toListItem(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingItemUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1011129439, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.toListItem (SpecialFinancingItemToListItemMapper.kt:22)");
        }
        com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(specialFinancingItemUiModel.getTitle().asString(composer, 0), specialFinancingItemUiModel.getDescription().asString(composer, 0), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-563000382, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.SpecialFinancingItemToListItemMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.SpecialFinancingItemToListItemMapperKt.$r8$lambda$4MUkwkbMeBvCtqfCBTuDavBRjgE(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(927568323, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.SpecialFinancingItemToListItemMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.SpecialFinancingItemToListItemMapperKt.$r8$lambda$PdGyTw2u_l1nKsnx5Y1V71C4WCs(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), null, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing2()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing2()), 1804, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listItem;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4MUkwkbMeBvCtqfCBTuDavBRjgE(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-563000382, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.toListItem.<anonymous> (SpecialFinancingItemToListItemMapper.kt:35)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.components.SpecialFinancingRemainBalanceKt.SpecialFinancingRemainBalance(specialFinancingItemUiModel.getRemainBalance(), specialFinancingItemUiModel.getAmountSubtitle(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PdGyTw2u_l1nKsnx5Y1V71C4WCs(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel specialFinancingItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(927568323, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.mapper.toListItem.<anonymous> (SpecialFinancingItemToListItemMapper.kt:30)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.ActivityMerchantImage(specialFinancingItemUiModel.getImageUrl(), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
