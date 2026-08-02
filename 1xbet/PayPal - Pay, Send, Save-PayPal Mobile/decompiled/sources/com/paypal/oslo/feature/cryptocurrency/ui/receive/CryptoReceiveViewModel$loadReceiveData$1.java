package com.paypal.oslo.feature.cryptocurrency.ui.receive;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1", f = "CryptoReceiveViewModel.kt", i = {0, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {207, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 258}, m = "invokeSuspend", n = {"defaultNetwork", "defaultNetwork", "clientTrackingId", "defaultNetwork", "clientTrackingId", "evaluationResult", "this_$iv", "evaluation", "$i$f$fold", "$i$a$-fold-CryptoReceiveViewModel$loadReceiveData$1$4"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveViewModel$loadReceiveData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x021b, code lost:
    
        if (com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.access$generateAddress(r8, r9, r5, r10, r11, r25) == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ba, code lost:
    
        if (r4 != r7) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState copy;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases cryptoReceiveUseCases;
        java.lang.String str2;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases cryptoReceiveUseCases2;
        java.lang.String str3;
        java.lang.Object invoke2;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object obj2;
        T t;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String str6;
        arrow.core.Either either;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            copy = r9.copy((r26 & 1) != 0 ? r9.assetSymbol : null, (r26 & 2) != 0 ? r9.isLoading : true, (r26 & 4) != 0 ? r9.isError : false, (r26 & 8) != 0 ? r9.assetName : null, (r26 & 16) != 0 ? r9.networkName : null, (r26 & 32) != 0 ? r9.address : null, (r26 & 64) != 0 ? r9.logoUrl : null, (r26 & 128) != 0 ? r9.networkImageUrl : null, (r26 & 256) != 0 ? r9.availableNetworks : null, (r26 & 512) != 0 ? r9.selectedNetworkId : null, (r26 & 1024) != 0 ? r9.memo : null, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) mutableStateFlow2.getValue()).displayMemo : false);
            mutableStateFlow.setValue(copy);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            dynamicConfigurationManager = this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            java.util.List<java.lang.String> multichainAssets = dynamicConfigurationManager.getMultichainAssets();
            str = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (multichainAssets.contains(str)) {
                cryptoReceiveUseCases = this.getInputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks = cryptoReceiveUseCases.getGetAvailableNetworks();
                str2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getOutputMinFrameDuration = 1;
                invoke = getAvailableNetworks.invoke(str2, this);
            }
            java.lang.String obj5 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj5, "");
            cryptoReceiveUseCases2 = this.getInputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTrade = cryptoReceiveUseCases2.getEvaluateCryptocurrencyTrade();
            str3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
            this.getOutputMinFrameDuration = 2;
            invoke2 = evaluateCryptocurrencyTrade.invoke(str3, obj5, this);
            if (invoke2 != coroutine_suspended) {
                objectRef2 = objectRef;
                str4 = obj5;
                either = (arrow.core.Either) invoke2;
                final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel = this.getInputSizeshNQ4ISI;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            str4 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef2 = objectRef3;
            invoke2 = obj;
            either = (arrow.core.Either) invoke2;
            final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel2 = this.getInputSizeshNQ4ISI;
            if (!(either instanceof arrow.core.Either.Right)) {
                com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult evaluationResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult) ((arrow.core.Either.Right) either).getValue();
                if (!evaluationResult.isAllowed()) {
                    cryptoReceiveViewModel2.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_MSG_TRADE_EVALUATION_DENIED, evaluationResult.getDecisionCode(), null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) objectRef2.element;
                java.lang.String id = blockchainNetwork != null ? blockchainNetwork.getId() : null;
                com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) objectRef2.element;
                java.lang.String blockchain = blockchainNetwork2 != null ? blockchainNetwork2.getBlockchain() : null;
                java.lang.String transactionTrackingId = evaluationResult.getTransactionTrackingId();
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj6) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.this, objectRef2, (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress) obj6);
                    }
                };
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef2);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(evaluationResult);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputMinFrameDuration = 3;
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor(cryptoReceiveViewModel2, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_MSG_TRADE_EVALUATION_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either).getValue()).toString())));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        invoke = obj;
        arrow.core.Either either2 = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel3 = this.getInputSizeshNQ4ISI;
        if (either2 instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either2).getValue();
            cryptoReceiveViewModel3.getOutputFormats = list;
            str5 = cryptoReceiveViewModel3.getOutputMinFrameDuration;
            if (str5 != null) {
                java.util.List list2 = list;
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    java.lang.String id2 = ((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj3).getId();
                    str6 = cryptoReceiveViewModel3.getOutputMinFrameDuration;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(id2, str6)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj3;
                t = blockchainNetwork3;
                if (blockchainNetwork3 == null) {
                    java.util.Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it2.next();
                        if (((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj4).isDefault()) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork4 = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj4;
                    t = blockchainNetwork4;
                    if (blockchainNetwork4 == null) {
                        t = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) kotlin.collections.CollectionsKt.firstOrNull(list);
                    }
                }
            } else {
                java.util.Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj2).isDefault()) {
                        break;
                    }
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork5 = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj2;
                t = blockchainNetwork5;
                if (blockchainNetwork5 == null) {
                    t = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) kotlin.collections.CollectionsKt.firstOrNull(list);
                }
            }
            objectRef.element = t;
            java.lang.String obj52 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj52, "");
            cryptoReceiveUseCases2 = this.getInputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTrade2 = cryptoReceiveUseCases2.getEvaluateCryptocurrencyTrade();
            str3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj52);
            this.getOutputMinFrameDuration = 2;
            invoke2 = evaluateCryptocurrencyTrade2.invoke(str3, obj52, this);
            if (invoke2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (either2 instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor(cryptoReceiveViewModel3, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_MSG_NETWORKS_LOAD_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either2).getValue()).toString())));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress receiveAddress) {
        java.util.List list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState copy;
        list = cryptoReceiveViewModel.getOutputFormats;
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1$invokeSuspend$lambda$3$0$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) t2).isDefault()), java.lang.Boolean.valueOf(((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) t).isDefault()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        java.util.Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.cryptocurrency.ui.receive.mapper.NetworkOptionMapperKt.toNetworkOption((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        mutableStateFlow = cryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow2 = cryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState cryptoReceiveUiState = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) mutableStateFlow2.getValue();
        java.lang.String networkName = receiveAddress.getNetworkName();
        java.lang.String address = receiveAddress.getAddress();
        java.lang.String networkImageUrl = receiveAddress.getNetworkImageUrl();
        com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) objectRef.element;
        java.lang.String id = blockchainNetwork != null ? blockchainNetwork.getId() : null;
        if (id == null) {
            id = "";
        }
        copy = cryptoReceiveUiState.copy((r26 & 1) != 0 ? cryptoReceiveUiState.assetSymbol : null, (r26 & 2) != 0 ? cryptoReceiveUiState.isLoading : false, (r26 & 4) != 0 ? cryptoReceiveUiState.isError : false, (r26 & 8) != 0 ? cryptoReceiveUiState.assetName : null, (r26 & 16) != 0 ? cryptoReceiveUiState.networkName : networkName, (r26 & 32) != 0 ? cryptoReceiveUiState.address : address, (r26 & 64) != 0 ? cryptoReceiveUiState.logoUrl : null, (r26 & 128) != 0 ? cryptoReceiveUiState.networkImageUrl : networkImageUrl, (r26 & 256) != 0 ? cryptoReceiveUiState.availableNetworks : arrayList2, (r26 & 512) != 0 ? cryptoReceiveUiState.selectedNetworkId : id, (r26 & 1024) != 0 ? cryptoReceiveUiState.memo : receiveAddress.getMemo(), (r26 & 2048) != 0 ? cryptoReceiveUiState.displayMemo : receiveAddress.getDisplayMemo());
        mutableStateFlow.setValue(copy);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveViewModel$loadReceiveData$1(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveData$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = cryptoReceiveViewModel;
    }
}
