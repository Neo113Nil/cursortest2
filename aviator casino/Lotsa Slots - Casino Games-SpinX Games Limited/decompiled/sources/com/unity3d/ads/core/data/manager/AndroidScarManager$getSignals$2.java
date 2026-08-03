package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidScarManager.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidScarManager$getSignals$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.ads.gmascar.models.BiddingSignals>, java.lang.Object> {
    final /* synthetic */ java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> $adFormat;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.manager.AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidScarManager$getSignals$2(java.util.List<? extends gatewayprotocol.v1.AdFormatOuterClass.AdFormat> list, com.unity3d.ads.core.data.manager.AndroidScarManager androidScarManager, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2> continuation) {
        super(2, continuation);
        this.$adFormat = list;
        this.this$0 = androidScarManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2(this.$adFormat, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.ads.gmascar.models.BiddingSignals> continuation) {
        return ((com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.unity3d.services.ads.gmascar.GMAScarAdapterBridge gMAScarAdapterBridge;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> list = this.$adFormat;
            com.unity3d.ads.core.data.manager.AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2 androidScarManager$getSignals$2 = this;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(androidScarManager$getSignals$2), 1);
            cancellableContinuationImpl.initCancellability();
            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat = com.unity3d.ads.core.extensions.AdFormatExtensions.toUnityAdFormat((gatewayprotocol.v1.AdFormatOuterClass.AdFormat) it.next());
                    if (unityAdFormat == com.unity3d.scar.adapter.common.scarads.UnityAdFormat.UNSPECIFIED) {
                        unityAdFormat = null;
                    }
                    if (unityAdFormat != null) {
                        arrayList2.add(unityAdFormat);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            java.util.ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                gMAScarAdapterBridge = androidScarManager.gmaBridge;
                gMAScarAdapterBridge.getSCARBiddingSignals(arrayList, new com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler(true, new com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(com.unity3d.services.ads.gmascar.models.BiddingSignals signals) {
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.ads.gmascar.models.BiddingSignals> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(signals));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(java.lang.String msg) {
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.ads.gmascar.models.BiddingSignals> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(msg))));
                    }
                }));
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(null));
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(androidScarManager$getSignals$2);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
