package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/components/StatementHubListPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "Camera2StreamConfigurationMap", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementHubListPreviewParameterProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel>> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem("", null, null, null, false);

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel>> getValues() {
        return kotlin.sequences.SequencesKt.sequenceOf(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header("0", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("2025")), new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content("1", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("December"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Nov 18 - Dec 18"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$100.00"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Download this statement to review the change in terms."), this.Camera2StreamConfigurationMap), new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("November"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 18 - Nov 18"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$200.00"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE, this.Camera2StreamConfigurationMap)}));
    }
}
