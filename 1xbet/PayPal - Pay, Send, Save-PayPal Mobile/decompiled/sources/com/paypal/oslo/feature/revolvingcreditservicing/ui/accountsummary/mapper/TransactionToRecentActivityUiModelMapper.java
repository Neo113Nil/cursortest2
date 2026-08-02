package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/TransactionToRecentActivityUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "activitiesUiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "transaction", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/transactionitem/TransactionItemUiModel;", "map", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionToRecentActivityUiModelMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TransactionToRecentActivityUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubTransactionItemUiModelMapper, "");
        this.getHighSpeedVideoFpsRangesFor = activityHubTransactionItemUiModelMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object map(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper$map$1 transactionToRecentActivityUiModelMapper$map$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper$map$1) {
            transactionToRecentActivityUiModelMapper$map$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper$map$1) continuation;
            if ((transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = transactionToRecentActivityUiModelMapper$map$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper = this.getHighSpeedVideoFpsRangesFor;
                    transactionToRecentActivityUiModelMapper$map$1.Camera2StreamConfigurationMap = transaction;
                    transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRanges = 1;
                    obj = activityHubTransactionItemUiModelMapper.map(transaction, true, locale, transactionToRecentActivityUiModelMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transaction = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) transactionToRecentActivityUiModelMapper$map$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(transactionItemUiModel.getImageUrl(), transactionItemUiModel.getTitle(), transactionItemUiModel.getDescription(), null, transactionItemUiModel.getAmount(), transactionItemUiModel.getAmountColor().getColor(), transactionItemUiModel.getPercentage(), transaction);
            }
        }
        transactionToRecentActivityUiModelMapper$map$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper$map$1(this, continuation);
        java.lang.Object obj2 = transactionToRecentActivityUiModelMapper$map$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionToRecentActivityUiModelMapper$map$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj2;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel(transactionItemUiModel2.getImageUrl(), transactionItemUiModel2.getTitle(), transactionItemUiModel2.getDescription(), null, transactionItemUiModel2.getAmount(), transactionItemUiModel2.getAmountColor().getColor(), transactionItemUiModel2.getPercentage(), transaction);
    }
}
