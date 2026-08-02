package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010\u0011J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b \u0010\u0011J\u0010\u0010!\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b!\u0010\rJ\u0010\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\"\u0010\rR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/payair/logic/managers/SetupManager;", "setupManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/payair/logic/managers/SetupManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "digitizedCardId", "getCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "getCardMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "cards", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/payair/model/Response;", "deleteCard", "getDefaultToken", "()Ljava/lang/String;", "", "setDefaultToken", "(Ljava/lang/String;)V", "getWalletID", "getTokenDetails", "getAuthenticationMethods", "clearData", "logout", "getHighSpeedVideoFpsRanges", "Lcom/payair/logic/managers/TokenManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/payair/logic/managers/SetupManager;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SdkTokenManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.payair.logic.managers.SetupManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SdkTokenManager(com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.SetupManager setupManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = tokenManager;
        this.getHighSpeedVideoSizes = setupManager;
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:11:0x0055->B:13:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCards(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCards$1 sdkTokenManager$getCards$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCards$1) {
            sdkTokenManager$getCards$1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCards$1) continuation;
            if ((sdkTokenManager$getCards$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                sdkTokenManager$getCards$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = sdkTokenManager$getCards$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sdkTokenManager$getCards$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.managers.TokenManager tokenManager = this.getHighSpeedVideoFpsRangesFor;
                    sdkTokenManager$getCards$1.Camera2StreamConfigurationMap = 1;
                    obj = com.payair.logic.managers.TokenManager.DefaultImpls.getAllLocalTokensWithDetails$default(tokenManager, false, sdkTokenManager$getCards$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.paypal.oslo.feature.taptopay.data.payair.card.TokenMapper(new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$$ExternalSyntheticLambda0(this)).map((com.payair.model.TokenDetailsWithAsset) it.next()));
                }
                return arrayList;
            }
        }
        sdkTokenManager$getCards$1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCards$1(this, continuation);
        java.lang.Object obj2 = sdkTokenManager$getCards$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sdkTokenManager$getCards$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1 sdkTokenManager$getCard$1;
        int i;
        com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1) {
            sdkTokenManager$getCard$1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1) continuation;
            if ((sdkTokenManager$getCard$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                sdkTokenManager$getCard$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1 sdkTokenManager$getCard$12 = sdkTokenManager$getCard$1;
                java.lang.Object obj = sdkTokenManager$getCard$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sdkTokenManager$getCard$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.managers.TokenManager tokenManager = this.getHighSpeedVideoFpsRangesFor;
                    sdkTokenManager$getCard$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    sdkTokenManager$getCard$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.payair.logic.managers.TokenManager.DefaultImpls.getLocalTokenDetails$default(tokenManager, str, false, sdkTokenManager$getCard$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) obj;
                if (tokenDetailsWithAsset == null) {
                    return new com.paypal.oslo.feature.taptopay.data.payair.card.TokenMapper(new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$$ExternalSyntheticLambda0(this)).map(tokenDetailsWithAsset);
                }
                return null;
            }
        }
        sdkTokenManager$getCard$1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1 sdkTokenManager$getCard$122 = sdkTokenManager$getCard$1;
        java.lang.Object obj2 = sdkTokenManager$getCard$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sdkTokenManager$getCard$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) obj2;
        if (tokenDetailsWithAsset == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardMetadata(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1 sdkTokenManager$getCardMetadata$1;
        int i;
        com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1) {
            sdkTokenManager$getCardMetadata$1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1) continuation;
            if ((sdkTokenManager$getCardMetadata$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                sdkTokenManager$getCardMetadata$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1 sdkTokenManager$getCardMetadata$12 = sdkTokenManager$getCardMetadata$1;
                java.lang.Object obj = sdkTokenManager$getCardMetadata$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sdkTokenManager$getCardMetadata$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.managers.TokenManager tokenManager = this.getHighSpeedVideoFpsRangesFor;
                    sdkTokenManager$getCardMetadata$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    sdkTokenManager$getCardMetadata$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.payair.logic.managers.TokenManager.DefaultImpls.getLocalTokenDetails$default(tokenManager, str, false, sdkTokenManager$getCardMetadata$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) obj;
                if (tokenDetailsWithAsset == null) {
                    return new com.paypal.oslo.feature.taptopay.data.payair.card.TokenMetadataMapper().map(tokenDetailsWithAsset);
                }
                return null;
            }
        }
        sdkTokenManager$getCardMetadata$1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1 sdkTokenManager$getCardMetadata$122 = sdkTokenManager$getCardMetadata$1;
        java.lang.Object obj2 = sdkTokenManager$getCardMetadata$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sdkTokenManager$getCardMetadata$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) obj2;
        if (tokenDetailsWithAsset == null) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> cards() {
        final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.model.TokenDetailsWithAsset>> observeTokenList = this.getHighSpeedVideoFpsRangesFor.observeTokenList();
        return kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>() { // from class: com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard map;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.List list = (java.util.List) obj;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                java.util.Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    map = new com.paypal.oslo.feature.taptopay.data.payair.card.TokenMapper(new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$$ExternalSyntheticLambda0(this.getHighSpeedVideoFpsRanges)).map((com.payair.model.TokenDetailsWithAsset) it.next());
                                    arrayList.add(map);
                                }
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1$2", f = "SdkTokenManager.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRanges = sdkTokenManager;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$cards$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, this.getHighSpeedVideoFpsRanges, kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 1, null), kotlin.collections.CollectionsKt.emptyList());
    }

    public final java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return com.payair.logic.managers.TokenManager.DefaultImpls.deleteToken$default(this.getHighSpeedVideoFpsRangesFor, str, com.payair.model.ReasonCode.OTHER, null, continuation, 4, null);
    }

    public final java.lang.String getDefaultToken() {
        return this.getHighSpeedVideoFpsRangesFor.getDefaultToken();
    }

    public final void setDefaultToken(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        this.getHighSpeedVideoFpsRangesFor.setActiveToken(digitizedCardId);
        this.getHighSpeedVideoFpsRangesFor.setDefaultToken(digitizedCardId);
    }

    public final java.lang.String getWalletID() {
        return this.getHighSpeedVideoSizes.getPaymentAppInstanceId();
    }

    public final java.lang.Object getTokenDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getTokenDetails(str, continuation);
    }

    public final java.lang.Object getAuthenticationMethods(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getAuthenticationMethods(str, continuation);
    }

    public final java.lang.Object clearData(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object clearData = this.getHighSpeedVideoSizes.clearData(continuation);
        return clearData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearData : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object logout(kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.getHighSpeedVideoSizes.logout(continuation);
    }

    public static /* synthetic */ boolean $r8$lambda$lXhdrUc4fxP2MtGuelIxwU6IIeA(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(sdkTokenManager.getHighSpeedVideoFpsRangesFor.getDefaultToken(), str);
    }
}
