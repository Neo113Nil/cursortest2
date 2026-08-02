package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "Lcom/paypal/pds/components/ListItem;", "toListItem", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementContentItemUiModelToListItemMapperKt {
    public static final com.paypal.pds.components.ListItem toListItem(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1702581670, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.toListItem (StatementContentItemUiModelToListItemMapper.kt:19)");
        }
        com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(content.getMonth().asString(composer, 0), content.getDateRange().asString(composer, 0), content.getAmount().asString(composer, 0), content.getType().asString(composer, 0), false, false, null, null, null, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), 2000, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listItem;
    }
}
