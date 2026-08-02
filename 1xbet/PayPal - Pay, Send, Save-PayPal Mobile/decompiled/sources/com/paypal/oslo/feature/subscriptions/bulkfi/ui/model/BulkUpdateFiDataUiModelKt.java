package com.paypal.oslo.feature.subscriptions.bulkfi.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiDataUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiDataUiModelKt {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00f1 -> B:11:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData bulkUpdateFiData, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt$toUiModel$1 bulkUpdateFiDataUiModelKt$toUiModel$1;
        int i;
        com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData bulkUpdateFiData2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel;
        java.util.Iterator it;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2;
        com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData bulkUpdateFiData3;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        int i2;
        int i3;
        java.util.Collection collection;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper3 = formatHelper;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt$toUiModel$1) {
            bulkUpdateFiDataUiModelKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt$toUiModel$1) continuation;
            if ((bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = bulkUpdateFiData.getFundingInstrument();
                    bulkUpdateFiData2 = bulkUpdateFiData;
                    if (fundingInstrument != null) {
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizes = bulkUpdateFiData2;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = formatHelper3;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(fundingInstrument, formatHelper3, bulkUpdateFiDataUiModelKt$toUiModel$1);
                    } else {
                        fundingInstrumentUiModel = null;
                        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> consumerAgreements = bulkUpdateFiData2.getConsumerAgreements();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consumerAgreements, 10));
                        it = consumerAgreements.iterator();
                        formatHelper2 = formatHelper3;
                        bulkUpdateFiData3 = bulkUpdateFiData2;
                        iterable = consumerAgreements;
                        iterable2 = iterable;
                        i2 = 0;
                        i3 = 0;
                        collection = arrayList;
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel;
                        if (it.hasNext()) {
                        }
                    }
                } else if (i == 1) {
                    formatHelper3 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) bulkUpdateFiDataUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    bulkUpdateFiData2 = (com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData) bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                    i2 = bulkUpdateFiDataUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                    i3 = bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                    collection = (java.util.Collection) bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputStallDuration;
                    fundingInstrumentUiModel2 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputStallDurationlomOqCM;
                    java.lang.Object obj2 = bulkUpdateFiDataUiModelKt$toUiModel$1.getInputFormats;
                    it = (java.util.Iterator) bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
                    java.util.Collection collection2 = (java.util.Collection) bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputFormats;
                    iterable = (java.lang.Iterable) bulkUpdateFiDataUiModelKt$toUiModel$1.getInputSizeshNQ4ISI;
                    iterable2 = (java.lang.Iterable) bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputMinFrameDuration;
                    formatHelper2 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) bulkUpdateFiDataUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    bulkUpdateFiData3 = (com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData) bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    collection.add((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem = (com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) next;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bulkUpdateFiData3);
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = formatHelper2;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputFormats = collection;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor = it;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionItem);
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputStallDurationlomOqCM = fundingInstrumentUiModel2;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputStallDuration = collection;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = i3;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = i2;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = 0;
                        bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI = 2;
                        obj = com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt.toUiModel(subscriptionItem, formatHelper2, bulkUpdateFiDataUiModelKt$toUiModel$1);
                        if (obj != coroutine_suspended) {
                            collection2 = collection;
                            collection.add((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                            collection = collection2;
                            if (it.hasNext()) {
                                return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel(fundingInstrumentUiModel2, (java.util.List) collection);
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> consumerAgreements2 = bulkUpdateFiData2.getConsumerAgreements();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consumerAgreements2, 10));
                it = consumerAgreements2.iterator();
                formatHelper2 = formatHelper3;
                bulkUpdateFiData3 = bulkUpdateFiData2;
                iterable = consumerAgreements2;
                iterable2 = iterable;
                i2 = 0;
                i3 = 0;
                collection = arrayList2;
                fundingInstrumentUiModel2 = fundingInstrumentUiModel;
                if (it.hasNext()) {
                }
            }
        }
        bulkUpdateFiDataUiModelKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt$toUiModel$1(continuation);
        java.lang.Object obj3 = bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bulkUpdateFiDataUiModelKt$toUiModel$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj3;
        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> consumerAgreements22 = bulkUpdateFiData2.getConsumerAgreements();
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consumerAgreements22, 10));
        it = consumerAgreements22.iterator();
        formatHelper2 = formatHelper3;
        bulkUpdateFiData3 = bulkUpdateFiData2;
        iterable = consumerAgreements22;
        iterable2 = iterable;
        i2 = 0;
        i3 = 0;
        collection = arrayList22;
        fundingInstrumentUiModel2 = fundingInstrumentUiModel;
        if (it.hasNext()) {
        }
    }
}
