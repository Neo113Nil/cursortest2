package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b%\u0010&J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b)\u0010*J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b,\u0010*J$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b.\u0010*J$\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020$0\u00122\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020$H\u0096@¢\u0006\u0004\b4\u00105J$\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080\u00122\u0006\u00106\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b9\u0010:J$\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010'\u001a\u00020\fH\u0096@¢\u0006\u0004\b<\u0010*R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/RemotePayPalCardRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider;", "deviceInfoProvider", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;", "workerScheduler", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider;Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "deviceWalletServiceCardIds", "", "riskMetadataId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "financialProducts", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/GetCardEligibilityError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "getCardEligibility", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payPalCardId", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "partnerName", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;", "flowEntryPoint", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PrepareAddCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardResult;", "prepareAddCard", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "idGroup", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardAddedError;", "", "notifyCardAdded", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardDeletedError;", "notifyCardDeleted", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardSuspendError;", "notifyCardSuspended", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardResumedError;", "notifyCardResumed", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "card", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardUpdatedError;", "notifyCardUpdated", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncAllFailedNotifyCalls", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsResult;", "closeCards", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalUploadTnCError;", "uploadTermsAndCondition", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemotePayPalCardRepository implements com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    public RemotePayPalCardRepository(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider, com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncWorkerScheduler, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = deviceInfoProvider;
        this.getHighSpeedVideoFpsRangesFor = backgroundSyncWorkerScheduler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r1 == r2) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardEligibility(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> list, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1 remotePayPalCardRepository$getCardEligibility$1;
        int i;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> list3;
        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list4;
        java.lang.String str2;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> list5;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult domain;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1) {
            remotePayPalCardRepository$getCardEligibility$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1) continuation;
            if ((remotePayPalCardRepository$getCardEligibility$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                remotePayPalCardRepository$getCardEligibility$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1 remotePayPalCardRepository$getCardEligibility$12 = remotePayPalCardRepository$getCardEligibility$1;
                java.lang.Object obj = remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = remotePayPalCardRepository$getCardEligibility$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting evaluate eligibility API call", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider = this.getHighSpeedVideoFpsRanges;
                    list3 = list;
                    remotePayPalCardRepository$getCardEligibility$12.getHighResolutionOutputSizeshNQ4ISI = list3;
                    remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    list4 = list2;
                    remotePayPalCardRepository$getCardEligibility$12.Camera2StreamConfigurationMap = list4;
                    remotePayPalCardRepository$getCardEligibility$12.getInputSizeshNQ4ISI = 1;
                    obj = deviceInfoProvider.invoke(remotePayPalCardRepository$getCardEligibility$12);
                    if (obj != coroutine_suspended) {
                        str2 = str;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Ior ior = (arrow.core.Ior) obj;
                    if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "GetCardEligibility API call failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data data = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        deviceWalletEligibility = data != null ? data.getDeviceWalletEligibility() : null;
                        if (deviceWalletEligibility == null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "GetCardEligibility returned null data", null, null, null, 14, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "GetCardEligibility returned null eligibility data")));
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "GetCardEligibility API call successful", null, null, 6, null);
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.toDomain(deviceWalletEligibility));
                    }
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "GetCardEligibility returned partial data with errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data) graphQLData.getData();
                        deviceWalletEligibility = data2 != null ? data2.getDeviceWalletEligibility() : null;
                        return (deviceWalletEligibility == null || (domain = com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.toDomain(deviceWalletEligibility)) == null || (right = arrow.core.EitherKt.right(domain)) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2))) : right;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list6 = (java.util.List) remotePayPalCardRepository$getCardEligibility$12.Camera2StreamConfigurationMap;
                str2 = (java.lang.String) remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRanges;
                java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> list7 = (java.util.List) remotePayPalCardRepository$getCardEligibility$12.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                list4 = list6;
                list3 = list7;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj;
                com.paypal.oslo.api.graphql.schema.type.ProvisioningDeviceInput provisioningDeviceInput = new com.paypal.oslo.api.graphql.schema.type.ProvisioningDeviceInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo.getDeviceId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceWalletDeviceIDType(deviceInfo.getDeviceIdType())), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo.getWalletId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceType(deviceInfo.getDeviceType())));
                com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                list5 = list3.isEmpty() ? list3 : null;
                if (list5 == null) {
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId> list8 = list5;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list8, 10));
                    java.util.Iterator<T> it = list8.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) it.next()).getId());
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(arrayList);
                com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                if (list4 != null) {
                    java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list9 = !list4.isEmpty() ? list4 : null;
                    if (list9 != null) {
                        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list10 = list9;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list10, 10));
                        java.util.Iterator<T> it2 = list10.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.toFinancialProduct((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType) it2.next()));
                        }
                        arrayList2 = arrayList4;
                        com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput = new com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput(provisioningDeviceInput, presentIfNotNull, companion2.presentIfNotNull(arrayList2), null, 8, null);
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery getCardEligibilityQuery = new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery(evaluateEligibilityInput);
                        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        remotePayPalCardRepository$getCardEligibility$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                        remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        remotePayPalCardRepository$getCardEligibility$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                        remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo);
                        remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisioningDeviceInput);
                        remotePayPalCardRepository$getCardEligibility$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateEligibilityInput);
                        remotePayPalCardRepository$getCardEligibility$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCardEligibilityQuery);
                        remotePayPalCardRepository$getCardEligibility$12.getInputSizeshNQ4ISI = 2;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getCardEligibilityQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, remotePayPalCardRepository$getCardEligibility$12, 2, (java.lang.Object) null);
                    }
                }
                arrayList2 = null;
                com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput2 = new com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput(provisioningDeviceInput, presentIfNotNull, companion2.presentIfNotNull(arrayList2), null, 8, null);
                com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery getCardEligibilityQuery2 = new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery(evaluateEligibilityInput2);
                com.apollographql.apollo.ApolloClient apolloClient2 = this.Camera2StreamConfigurationMap.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient2, "");
                remotePayPalCardRepository$getCardEligibility$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                remotePayPalCardRepository$getCardEligibility$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo);
                remotePayPalCardRepository$getCardEligibility$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisioningDeviceInput);
                remotePayPalCardRepository$getCardEligibility$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateEligibilityInput2);
                remotePayPalCardRepository$getCardEligibility$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCardEligibilityQuery2);
                remotePayPalCardRepository$getCardEligibility$12.getInputSizeshNQ4ISI = 2;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient2, getCardEligibilityQuery2, (com.paypal.oslo.core.network.graphql.CallConfig) null, remotePayPalCardRepository$getCardEligibility$12, 2, (java.lang.Object) null);
            }
        }
        remotePayPalCardRepository$getCardEligibility$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1 remotePayPalCardRepository$getCardEligibility$122 = remotePayPalCardRepository$getCardEligibility$1;
        java.lang.Object obj2 = remotePayPalCardRepository$getCardEligibility$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remotePayPalCardRepository$getCardEligibility$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo2 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj2;
        com.paypal.oslo.api.graphql.schema.type.ProvisioningDeviceInput provisioningDeviceInput2 = new com.paypal.oslo.api.graphql.schema.type.ProvisioningDeviceInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo2.getDeviceId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceWalletDeviceIDType(deviceInfo2.getDeviceIdType())), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo2.getWalletId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceType(deviceInfo2.getDeviceType())));
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        if (list3.isEmpty()) {
        }
        if (list5 == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion3.presentIfNotNull(arrayList);
        com.apollographql.apollo.api.Optional.Companion companion22 = com.apollographql.apollo.api.Optional.INSTANCE;
        if (list4 != null) {
        }
        arrayList2 = null;
        com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput22 = new com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput(provisioningDeviceInput2, presentIfNotNull2, companion22.presentIfNotNull(arrayList2), null, 8, null);
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery getCardEligibilityQuery22 = new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery(evaluateEligibilityInput22);
        com.apollographql.apollo.ApolloClient apolloClient22 = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient22, "");
        remotePayPalCardRepository$getCardEligibility$122.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
        remotePayPalCardRepository$getCardEligibility$122.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        remotePayPalCardRepository$getCardEligibility$122.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
        remotePayPalCardRepository$getCardEligibility$122.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo2);
        remotePayPalCardRepository$getCardEligibility$122.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisioningDeviceInput2);
        remotePayPalCardRepository$getCardEligibility$122.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluateEligibilityInput22);
        remotePayPalCardRepository$getCardEligibility$122.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCardEligibilityQuery22);
        remotePayPalCardRepository$getCardEligibility$122.getInputSizeshNQ4ISI = 2;
        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient22, getCardEligibilityQuery22, (com.paypal.oslo.core.network.graphql.CallConfig) null, remotePayPalCardRepository$getCardEligibility$122, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x016b, code lost:
    
        if (r3 != r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object prepareAddCard(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$prepareAddCard$1 remotePayPalCardRepository$prepareAddCard$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2;
        java.lang.Object obj;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult domainResult;
        arrow.core.Either right;
        java.lang.String str8 = str2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$prepareAddCard$1) {
            remotePayPalCardRepository$prepareAddCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$prepareAddCard$1) continuation;
            if ((remotePayPalCardRepository$prepareAddCard$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                remotePayPalCardRepository$prepareAddCard$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = remotePayPalCardRepository$prepareAddCard$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = remotePayPalCardRepository$prepareAddCard$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, cardType.name());
                    pairArr[1] = kotlin.TuplesKt.to("hasCvv", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str8 != null));
                    pairArr[2] = kotlin.TuplesKt.to("flowEntryPoint", flowEntryPoint != null ? flowEntryPoint.name() : null);
                    com.paypal.android.logger.Logger.d$default(logger, "Starting prepare to add card API call", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider = this.getHighSpeedVideoFpsRanges;
                    remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizes = str;
                    cardType2 = cardType;
                    remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRangesFor = cardType2;
                    remotePayPalCardRepository$prepareAddCard$1.Camera2StreamConfigurationMap = str8;
                    remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    remotePayPalCardRepository$prepareAddCard$1.getHighResolutionOutputSizeshNQ4ISI = str4;
                    remotePayPalCardRepository$prepareAddCard$1.getOutputMinFrameDuration = flowEntryPoint;
                    remotePayPalCardRepository$prepareAddCard$1.getOutputSizes = 1;
                    java.lang.Object invoke = deviceInfoProvider.invoke(remotePayPalCardRepository$prepareAddCard$1);
                    if (invoke != coroutine_suspended) {
                        obj = invoke;
                        flowEntryPoint2 = flowEntryPoint;
                        str5 = str4;
                        str6 = str;
                        str7 = str3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    arrow.core.Ior ior = (arrow.core.Ior) obj2;
                    if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PrepareCardForDigitization API call failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", callError.toString())), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError)));
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        prepareCardForDigitization = data != null ? data.getPrepareCardForDigitization() : null;
                        if (prepareCardForDigitization == null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PrepareCardForDigitization returned null data", null, null, null, 14, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, "PrepareCardForDigitization returned null data")));
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PrepareCardForDigitization API call successful", null, null, 6, null);
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.taptopay.data.mapper.PrepareCardForDigitizationMapperKt.toDomainResult(prepareCardForDigitization));
                    }
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PrepareCardForDigitization returned partial data with errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", callError2.toString())), null, 4, null);
                        com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data) graphQLData.getData();
                        prepareCardForDigitization = data2 != null ? data2.getPrepareCardForDigitization() : null;
                        return (prepareCardForDigitization == null || (domainResult = com.paypal.oslo.feature.taptopay.data.mapper.PrepareCardForDigitizationMapperKt.toDomainResult(prepareCardForDigitization)) == null || (right = arrow.core.EitherKt.right(domainResult)) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PrepareAddCardError(com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.toServiceApiError(callError2))) : right;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint) remotePayPalCardRepository$prepareAddCard$1.getOutputMinFrameDuration;
                str5 = (java.lang.String) remotePayPalCardRepository$prepareAddCard$1.getHighResolutionOutputSizeshNQ4ISI;
                str7 = (java.lang.String) remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRanges;
                java.lang.String str9 = (java.lang.String) remotePayPalCardRepository$prepareAddCard$1.Camera2StreamConfigurationMap;
                cardType2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType) remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRangesFor;
                str6 = (java.lang.String) remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj2);
                flowEntryPoint2 = flowEntryPoint3;
                str8 = str9;
                obj = obj2;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj;
                com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput access$buildPrepareCardForDigitizationInput = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepositoryKt.access$buildPrepareCardForDigitizationInput(deviceInfo, str6, cardType2, str8, str5, flowEntryPoint2);
                com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation prepareCardForDigitizationMutation = new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation(access$buildPrepareCardForDigitizationInput);
                com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(prepareCardForDigitizationMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.TapToPay.INSTANCE.getPrepareAddCard(), null, 2, null));
                remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardType2);
                remotePayPalCardRepository$prepareAddCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                remotePayPalCardRepository$prepareAddCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                remotePayPalCardRepository$prepareAddCard$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowEntryPoint2);
                remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo);
                remotePayPalCardRepository$prepareAddCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildPrepareCardForDigitizationInput);
                remotePayPalCardRepository$prepareAddCard$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prepareCardForDigitizationMutation);
                remotePayPalCardRepository$prepareAddCard$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                remotePayPalCardRepository$prepareAddCard$1.getOutputSizes = 2;
                obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(addExecutionContext, null, remotePayPalCardRepository$prepareAddCard$1, 2, null);
            }
        }
        remotePayPalCardRepository$prepareAddCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$prepareAddCard$1(this, continuation);
        java.lang.Object obj22 = remotePayPalCardRepository$prepareAddCard$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remotePayPalCardRepository$prepareAddCard$1.getOutputSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo2 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj;
        com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput access$buildPrepareCardForDigitizationInput2 = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepositoryKt.access$buildPrepareCardForDigitizationInput(deviceInfo2, str6, cardType2, str8, str5, flowEntryPoint2);
        com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation prepareCardForDigitizationMutation2 = new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation(access$buildPrepareCardForDigitizationInput2);
        com.apollographql.apollo.ApolloCall addExecutionContext2 = this.Camera2StreamConfigurationMap.get().mutation(prepareCardForDigitizationMutation2).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.TapToPay.INSTANCE.getPrepareAddCard(), null, 2, null));
        remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
        remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardType2);
        remotePayPalCardRepository$prepareAddCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
        remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
        remotePayPalCardRepository$prepareAddCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
        remotePayPalCardRepository$prepareAddCard$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowEntryPoint2);
        remotePayPalCardRepository$prepareAddCard$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo2);
        remotePayPalCardRepository$prepareAddCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildPrepareCardForDigitizationInput2);
        remotePayPalCardRepository$prepareAddCard$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prepareCardForDigitizationMutation2);
        remotePayPalCardRepository$prepareAddCard$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext2);
        remotePayPalCardRepository$prepareAddCard$1.getOutputSizes = 2;
        obj22 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(addExecutionContext2, null, remotePayPalCardRepository$prepareAddCard$1, 2, null);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object notifyCardAdded(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardAddedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Scheduling lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardAddedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", cardIdGroup.getDeviceWalletServiceCardId().getId()), kotlin.TuplesKt.to("digitizedCardId", cardIdGroup.getDigitizedCardId().getId())), null, 4, null);
        try {
            com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = this.getHighSpeedVideoFpsRangesFor;
            androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(cardIdGroup);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardAddedWorker")), null, 4, null);
            androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker.class);
            if (workData != null) {
                builder.setInputData(workData);
            }
            builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
            builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
            builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
            backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to schedule lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardAddedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", cardIdGroup.getDeviceWalletServiceCardId().getId())), null, exc, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardAddedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(exc)));
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object notifyCardUpdated(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardUpdatedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "notifyCardUpdated stub called - no API call implemented yet", null, null, 6, null);
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object syncAllFailedNotifyCalls(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting sync all failed notify calls", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r2 != r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        if (r2 != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object closeCards(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsResult>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1 remotePayPalCardRepository$closeCards$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsResult domainResult;
        arrow.core.Either right;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1) {
            remotePayPalCardRepository$closeCards$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1) continuation;
            if ((remotePayPalCardRepository$closeCards$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                remotePayPalCardRepository$closeCards$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1 remotePayPalCardRepository$closeCards$12 = remotePayPalCardRepository$closeCards$1;
                java.lang.Object obj = remotePayPalCardRepository$closeCards$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = remotePayPalCardRepository$closeCards$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting close cards API call", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceId", str2)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider = this.getHighSpeedVideoFpsRanges;
                    remotePayPalCardRepository$closeCards$12.getHighSpeedVideoSizes = str2;
                    remotePayPalCardRepository$closeCards$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = deviceInfoProvider.invoke(remotePayPalCardRepository$closeCards$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (java.lang.String) remotePayPalCardRepository$closeCards$12.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior = (arrow.core.Ior) obj;
                        if (ior instanceof arrow.core.Ior.Left) {
                            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                            com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logError(callError, "CloseDeviceWalletCardTokens API call failed");
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError("Close cards failed: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 2, null));
                        }
                        if (ior instanceof arrow.core.Ior.Right) {
                            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data data = (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens = data != null ? data.getCloseDeviceWalletCardTokens() : null;
                            if (closeDeviceWalletCardTokens == null) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CloseDeviceWalletCardTokens returned null data", null, null, 6, null);
                                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError("CloseDeviceWalletCardTokens returned null data", null, 2, null));
                            }
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CloseDeviceWalletCardTokens API call successful", null, null, 6, null);
                            return arrow.core.EitherKt.right(com.paypal.oslo.feature.taptopay.data.mapper.CloseDeviceWalletCardTokensMapperKt.toDomainResult(closeDeviceWalletCardTokens, str2));
                        }
                        if (ior instanceof arrow.core.Ior.Both) {
                            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                            java.lang.Object leftValue = both.getLeftValue();
                            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                            com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                            com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.logWarning(callError2, "CloseDeviceWalletCardTokens returned partial data with errors");
                            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data data2 = (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data) graphQLData.getData();
                            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens2 = data2 != null ? data2.getCloseDeviceWalletCardTokens() : null;
                            return (closeDeviceWalletCardTokens2 == null || (domainResult = com.paypal.oslo.feature.taptopay.data.mapper.CloseDeviceWalletCardTokensMapperKt.toDomainResult(closeDeviceWalletCardTokens2, str2)) == null || (right = arrow.core.EitherKt.right(domainResult)) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError("Close cards failed: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 2, null)) : right;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str2 = (java.lang.String) remotePayPalCardRepository$closeCards$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj;
                com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput closeDeviceWalletCardTokensInput = new com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo.getDeviceId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceWalletDeviceIDType(deviceInfo.getDeviceIdType())));
                com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation closeDeviceWalletCardTokensMutation = new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation(closeDeviceWalletCardTokensInput);
                com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                remotePayPalCardRepository$closeCards$12.getHighSpeedVideoSizes = str2;
                remotePayPalCardRepository$closeCards$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo);
                remotePayPalCardRepository$closeCards$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokensInput);
                remotePayPalCardRepository$closeCards$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokensMutation);
                remotePayPalCardRepository$closeCards$12.getHighSpeedVideoFpsRangesFor = 2;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, closeDeviceWalletCardTokensMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, remotePayPalCardRepository$closeCards$12, 2, (java.lang.Object) null);
            }
        }
        remotePayPalCardRepository$closeCards$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1 remotePayPalCardRepository$closeCards$122 = remotePayPalCardRepository$closeCards$1;
        java.lang.Object obj2 = remotePayPalCardRepository$closeCards$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remotePayPalCardRepository$closeCards$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo deviceInfo2 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo) obj2;
        com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput closeDeviceWalletCardTokensInput2 = new com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(deviceInfo2.getDeviceId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.taptopay.data.mapper.DeviceInfoMapperKt.toDeviceWalletDeviceIDType(deviceInfo2.getDeviceIdType())));
        com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation closeDeviceWalletCardTokensMutation2 = new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation(closeDeviceWalletCardTokensInput2);
        com.apollographql.apollo.ApolloClient apolloClient2 = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient2, "");
        remotePayPalCardRepository$closeCards$122.getHighSpeedVideoSizes = str2;
        remotePayPalCardRepository$closeCards$122.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceInfo2);
        remotePayPalCardRepository$closeCards$122.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokensInput2);
        remotePayPalCardRepository$closeCards$122.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeDeviceWalletCardTokensMutation2);
        remotePayPalCardRepository$closeCards$122.getHighSpeedVideoFpsRangesFor = 2;
        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient2, closeDeviceWalletCardTokensMutation2, (com.paypal.oslo.core.network.graphql.CallConfig) null, remotePayPalCardRepository$closeCards$122, 2, (java.lang.Object) null);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object uploadTermsAndCondition(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalUploadTnCError, kotlin.Unit>> continuation) {
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object notifyCardDeleted(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Scheduling lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardDeletedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, 4, null);
        try {
            com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = this.getHighSpeedVideoFpsRangesFor;
            androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardDeletedWorker")), null, 4, null);
            androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker.class);
            if (workData != null) {
                builder.setInputData(workData);
            }
            builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
            builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
            builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
            backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to schedule lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardDeletedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, exc, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(exc)));
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object notifyCardSuspended(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Scheduling lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardSuspendedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, 4, null);
        try {
            com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = this.getHighSpeedVideoFpsRangesFor;
            androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardSuspendedWorker")), null, 4, null);
            androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker.class);
            if (workData != null) {
                builder.setInputData(workData);
            }
            builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
            builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
            builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
            backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to schedule lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardSuspendedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, exc, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(exc)));
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository
    public final java.lang.Object notifyCardResumed(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Scheduling lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardResumedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, 4, null);
        try {
            com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = this.getHighSpeedVideoFpsRangesFor;
            androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardResumedWorker")), null, 4, null);
            androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker.class);
            if (workData != null) {
                builder.setInputData(workData);
            }
            builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
            builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
            builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
            backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to schedule lifecycle worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workerName", "NotifyCardResumedWorker"), kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, exc, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError(new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(exc)));
        }
    }
}
