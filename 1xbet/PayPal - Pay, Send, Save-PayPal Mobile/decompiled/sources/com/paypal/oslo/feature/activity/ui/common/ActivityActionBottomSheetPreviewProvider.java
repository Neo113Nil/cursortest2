package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/common/ActivityActionBottomSheetPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/activity/ui/common/ActivityActionBottomSheetPreviewParams;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ActivityActionBottomSheetPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams> {
    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams> getValues() {
        return kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams[]{new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Decline Confirmation", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Idle.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Report Confirmation", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Idle.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Decline Loading", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Loading.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Decline Success", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Decline Error", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Block Confirmation", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Cancel Confirmation", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE), new com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams("Add Tax ID Confirmation", com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE)});
    }
}
