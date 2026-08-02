package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\f\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionListPreviewParameter;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivitySectionUiState;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "mockedTransaction", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "getMockedTransaction", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivitySectionUiState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivitySectionUiState$Ready;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityTransactionListPreviewParameter implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState>> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction mockedTransaction;
    private final kotlin.sequences.Sequence<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState>> values;

    public ActivityTransactionListPreviewParameter() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionListPreviewParameter$mockedTransaction$1
            private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount;
            private final java.time.Instant creationDate;
            private final boolean isCancellable;
            private final java.lang.String referenceId;
            private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
            private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
            private final java.lang.String id = "";
            private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.OTHER;
            private final java.lang.String transactionName = "";
            private final java.lang.String transactionCashbackPercentage = "";

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.lang.String getId() {
                return this.id;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
                return this.amount;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.time.Instant getCreationDate() {
                return this.creationDate;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            /* renamed from: isCancellable, reason: from getter */
            public final boolean getIsCancellable() {
                return this.isCancellable;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType() {
                return this.transactionType;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
                return this.transactionImage;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.lang.String getTransactionName() {
                return this.transactionName;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
                return this.transactionFundingInstruments;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.lang.String getTransactionCashbackPercentage() {
                return this.transactionCashbackPercentage;
            }

            @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
            public final java.lang.String getReferenceId() {
                return this.referenceId;
            }
        };
        this.mockedTransaction = transaction;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel("1", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("List Item 2"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 27 ∙ Refund"), "", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$10,00"), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("1.5%"), java.lang.Boolean.FALSE, transaction);
        this.getHighSpeedVideoFpsRanges = transactionItemUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("List Item 2"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Oct 27 ∙ Refund"), "", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("$10,00"), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("1.5%"), java.lang.Boolean.TRUE, transaction);
        this.getHighSpeedVideoSizes = transactionItemUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel[]{transactionItemUiModel, transactionItemUiModel2, transactionItemUiModel, transactionItemUiModel}));
        this.getHighResolutionOutputSizeshNQ4ISI = ready;
        this.values = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new java.util.List[]{kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING), null, 2, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING), null, 2, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE), null, 2, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Others"), null, 2, null)}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING)), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Hidden.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE), null, 2, null)})});
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction getMockedTransaction() {
        return this.mockedTransaction;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState>> getValues() {
        return this.values;
    }
}
