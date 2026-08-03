package com.unity3d.ads.core.data.manager;

/* compiled from: TransactionEventManager.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 148, 151}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, "purchaseTime", "index$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "transactionDataList", "deferredPurchaseList", com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE, "index$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "transactionDataList"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$4", "I$0", "I$1", "L$0"})
/* loaded from: classes5.dex */
final class TransactionEventManager$onPurchasesReceived$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> $purchases;
    final /* synthetic */ gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.manager.TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransactionEventManager$onPurchasesReceived$1(java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list, com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1> continuation) {
        super(2, continuation);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:33|(1:35)|36|37|38|39|(1:41)|(2:82|83)(1:43)|44|(1:46)(1:81)|(2:53|(1:55)(4:56|57|58|(5:60|61|62|63|(1:65)(9:66|24|25|(0)|28|29|30|31|(6:89|(1:91)|15|(0)|9|10)(0)))(6:71|28|29|30|31|(0)(0))))|74|75|76|77|30|31|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:60|61|62|63|(1:65)(9:66|24|25|(0)|28|29|30|31|(6:89|(1:91)|15|(0)|9|10)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cd, code lost:
    
        r12 = r4;
        r11 = r13;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e0, code lost:
    
        r5 = r2;
        r2 = r4;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01aa A[Catch: Exception -> 0x01e3, TryCatch #6 {Exception -> 0x01e3, blocks: (B:25:0x01a4, B:27:0x01aa, B:28:0x01c0), top: B:24:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180 A[Catch: Exception -> 0x01cc, TRY_LEAVE, TryCatch #4 {Exception -> 0x01cc, blocks: (B:58:0x0166, B:60:0x0180), top: B:57:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01a0 -> B:24:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01e3 -> B:29:0x01ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01bc -> B:28:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01dd -> B:30:0x01f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.List list;
        com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager;
        int i;
        int i2;
        java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list2;
        int i3;
        java.util.List list3;
        java.lang.Object obj2;
        java.util.Iterator it2;
        com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseBridge;
        java.lang.String str;
        kotlin.time.Duration duration;
        com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager2;
        com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher;
        java.lang.Object fetchProductDetails;
        kotlin.time.Duration m12144boximpl;
        java.lang.String str2;
        com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource;
        com.unity3d.ads.core.domain.events.GetTransactionData getTransactionData;
        com.unity3d.ads.core.domain.events.GetTransactionRequest getTransactionRequest;
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter;
        java.lang.Object invoke;
        com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrayList = new java.util.ArrayList();
            java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list4 = this.$purchases;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseBridge2 : list4) {
                arrayList2.add(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
            }
            java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list5 = this.$purchases;
            com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager3 = this.this$0;
            it = list5.iterator();
            list = arrayList2;
            transactionEventManager = transactionEventManager3;
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i4 == 1) {
                i3 = this.I$1;
                i2 = this.I$0;
                duration = (kotlin.time.Duration) this.L$6;
                str = (java.lang.String) this.L$5;
                purchaseBridge = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) this.L$4;
                it2 = (java.util.Iterator) this.L$3;
                com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager4 = (com.unity3d.ads.core.data.manager.TransactionEventManager) this.L$2;
                list3 = (java.util.List) this.L$1;
                java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list6 = (java.util.List) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    list2 = list6;
                    transactionEventManager2 = transactionEventManager4;
                    obj2 = obj;
                } catch (java.lang.Exception unused) {
                    list2 = list6;
                    it = it2;
                    transactionEventManager = transactionEventManager4;
                    list = list3;
                }
                if (com.google.protobuf.Timestamp.parseFrom(((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds() >= kotlin.time.Duration.m12160getInWholeSecondsimpl(duration.getRawValue())) {
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        invoke = obj;
                        transactionEventRepository = this.this$0.transactionEventRepository;
                        transactionEventRepository.addTransactionEvent((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                        return kotlin.Unit.INSTANCE;
                    }
                    arrayList = (java.util.List) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!arrayList.isEmpty()) {
                        getTransactionRequest = this.this$0.getTransactionRequest;
                        billingClientAdapter = this.this$0.billingClientAdapter;
                        this.L$0 = null;
                        this.label = 4;
                        invoke = getTransactionRequest.invoke(arrayList, billingClientAdapter.getAdapterVersion(), this.$transactionOrigin, this);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        transactionEventRepository = this.this$0.transactionEventRepository;
                        transactionEventRepository.addTransactionEvent((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                i3 = this.I$1;
                i2 = this.I$0;
                com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseBridge3 = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) this.L$4;
                it = (java.util.Iterator) this.L$3;
                transactionEventManager = (com.unity3d.ads.core.data.manager.TransactionEventManager) this.L$2;
                list = (java.util.List) this.L$1;
                java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list7 = (java.util.List) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    fetchProductDetails = obj;
                    list2 = list7;
                } catch (java.lang.Exception unused2) {
                    list2 = list7;
                }
                com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) fetchProductDetails;
                if (productDetailsResult instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) {
                    getTransactionData = transactionEventManager.getTransactionData;
                    list2.add(getTransactionData.invoke(purchaseBridge3, ((com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) productDetailsResult).getProductDetailsJson()));
                }
                ((kotlinx.coroutines.CompletableDeferred) list.get(i3)).complete(kotlin.Unit.INSTANCE);
                arrayList = list2;
                i = i2;
                if (!it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseBridge4 = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) next;
                    java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(purchaseBridge4.getOriginalJson().optLong("purchaseTime", -1L));
                    if (boxLong.longValue() < 0) {
                        boxLong = null;
                    }
                    if (boxLong != null) {
                        try {
                        } catch (java.lang.Exception unused3) {
                            list2 = arrayList;
                            i3 = i;
                            i2 = i5;
                        }
                        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                        m12144boximpl = kotlin.time.Duration.m12144boximpl(kotlin.time.DurationKt.toDuration(boxLong.longValue(), kotlin.time.DurationUnit.MILLISECONDS));
                    } else {
                        m12144boximpl = null;
                    }
                    java.lang.String it3 = purchaseBridge4.getOriginalJson().optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it3, "it");
                    if (!(!kotlin.text.StringsKt.isBlank(it3))) {
                        it3 = null;
                    }
                    if (m12144boximpl != null && (str2 = it3) != null && !kotlin.text.StringsKt.isBlank(str2)) {
                        byteStringDataSource = transactionEventManager.iapTransactionStore;
                        this.L$0 = arrayList;
                        this.L$1 = list;
                        this.L$2 = transactionEventManager;
                        this.L$3 = it;
                        this.L$4 = purchaseBridge4;
                        this.L$5 = it3;
                        this.L$6 = m12144boximpl;
                        this.I$0 = i5;
                        this.I$1 = i;
                        this.label = 1;
                        obj2 = byteStringDataSource.get(this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list3 = list;
                        it2 = it;
                        str = it3;
                        kotlin.time.Duration duration2 = m12144boximpl;
                        list2 = arrayList;
                        i3 = i;
                        transactionEventManager2 = transactionEventManager;
                        purchaseBridge = purchaseBridge4;
                        i2 = i5;
                        duration = duration2;
                        if (com.google.protobuf.Timestamp.parseFrom(((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds() >= kotlin.time.Duration.m12160getInWholeSecondsimpl(duration.getRawValue())) {
                            productDetailsFetcher = transactionEventManager2.productDetailsFetcher;
                            this.L$0 = list2;
                            this.L$1 = list3;
                            this.L$2 = transactionEventManager2;
                            this.L$3 = it2;
                            this.L$4 = purchaseBridge;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.I$0 = i2;
                            this.I$1 = i3;
                            this.label = 2;
                            fetchProductDetails = productDetailsFetcher.fetchProductDetails(str, this);
                            if (fetchProductDetails == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            purchaseBridge3 = purchaseBridge;
                            it = it2;
                            list = list3;
                            transactionEventManager = transactionEventManager2;
                            com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult2 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) fetchProductDetails;
                            if (productDetailsResult2 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) {
                            }
                            ((kotlinx.coroutines.CompletableDeferred) list.get(i3)).complete(kotlin.Unit.INSTANCE);
                            arrayList = list2;
                            i = i2;
                            if (!it.hasNext()) {
                                kotlinx.coroutines.CompletableDeferred[] completableDeferredArr = (kotlinx.coroutines.CompletableDeferred[]) list.toArray(new kotlinx.coroutines.CompletableDeferred[0]);
                                this.L$0 = arrayList;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 3;
                                if (kotlinx.coroutines.AwaitKt.awaitAll((kotlinx.coroutines.Deferred[]) java.util.Arrays.copyOf(completableDeferredArr, completableDeferredArr.length), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            transactionEventManager = transactionEventManager2;
                            it = it2;
                            list = list3;
                            ((kotlinx.coroutines.CompletableDeferred) list.get(i3)).complete(kotlin.Unit.INSTANCE);
                            arrayList = list2;
                            i = i2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                    ((kotlinx.coroutines.CompletableDeferred) list.get(i)).complete(kotlin.Unit.INSTANCE);
                    i = i5;
                    if (!it.hasNext()) {
                    }
                }
            }
            ((kotlinx.coroutines.CompletableDeferred) list.get(i3)).complete(kotlin.Unit.INSTANCE);
            arrayList = list2;
            i = i2;
            if (!it.hasNext()) {
            }
        }
    }
}
