package com.unity3d.ads.core.domain.events;

/* compiled from: CommonGetTransactionRequest.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionDataList", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "googlePlayBillingLibraryVersion", "", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "(Ljava/util/List;Ljava/lang/String;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonGetTransactionRequest implements com.unity3d.ads.core.domain.events.GetTransactionRequest {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list, java.lang.String str, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> continuation) {
        com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 commonGetTransactionRequest$invoke$1;
        int i;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl _create;
        java.lang.Object staticDeviceInfo;
        com.unity3d.ads.core.domain.events.CommonGetTransactionRequest commonGetTransactionRequest;
        java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list2;
        java.lang.String str2;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl2;
        if (continuation instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1) {
            commonGetTransactionRequest$invoke$1 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1) continuation;
            if ((commonGetTransactionRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonGetTransactionRequest$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonGetTransactionRequest$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGetTransactionRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.TransactionEventRequestKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    _create = companion._create(newBuilder);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    commonGetTransactionRequest$invoke$1.L$0 = this;
                    commonGetTransactionRequest$invoke$1.L$1 = list;
                    commonGetTransactionRequest$invoke$1.L$2 = str;
                    commonGetTransactionRequest$invoke$1.L$3 = transactionOrigin;
                    commonGetTransactionRequest$invoke$1.L$4 = _create;
                    commonGetTransactionRequest$invoke$1.L$5 = _create;
                    commonGetTransactionRequest$invoke$1.L$6 = _create;
                    commonGetTransactionRequest$invoke$1.label = 1;
                    staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(commonGetTransactionRequest$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonGetTransactionRequest = this;
                    list2 = list;
                    str2 = str;
                    dsl = _create;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$6;
                    dsl2 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$5;
                    gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl3 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$4;
                    gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin2 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin) commonGetTransactionRequest$invoke$1.L$3;
                    str2 = (java.lang.String) commonGetTransactionRequest$invoke$1.L$2;
                    list2 = (java.util.List) commonGetTransactionRequest$invoke$1.L$1;
                    com.unity3d.ads.core.domain.events.CommonGetTransactionRequest commonGetTransactionRequest2 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest) commonGetTransactionRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    _create = dsl3;
                    transactionOrigin = transactionOrigin2;
                    commonGetTransactionRequest = commonGetTransactionRequest2;
                    staticDeviceInfo = obj;
                }
                dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
                dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
                dsl2.setGooglePlayBillingLibraryVersion(str2);
                dsl2.setOrigin(transactionOrigin);
                dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
                return _create._build();
            }
        }
        commonGetTransactionRequest$invoke$1 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1(this, continuation);
        java.lang.Object obj2 = commonGetTransactionRequest$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGetTransactionRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
        dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl2.setGooglePlayBillingLibraryVersion(str2);
        dsl2.setOrigin(transactionOrigin);
        dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
        return _create._build();
    }
}
