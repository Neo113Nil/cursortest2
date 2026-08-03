package com.unity3d.services.ads.offerwall;

/* compiled from: OfferwallAdapterBridge.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", i = {}, l = {77, 83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ java.lang.String $placementName;
    int label;
    final /* synthetic */ com.unity3d.services.ads.offerwall.OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z, com.unity3d.services.ads.offerwall.OfferwallAdapterBridge offerwallAdapterBridge, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1> continuation) {
        super(2, continuation);
        this.$placementAvailable = z;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.HashMap hashMap;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$placementAvailable) {
                mutableSharedFlow2 = this.this$0._offerwallEventFlow;
                com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS;
                java.lang.String str = this.$placementName;
                java.lang.String str2 = str == null ? "" : str;
                this.label = 1;
                if (mutableSharedFlow2.emit(new com.unity3d.ads.core.domain.offerwall.OfferwallEventData(offerwallEvent, str2, null, null, 12, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                hashMap = this.this$0.placementsMap;
                java.lang.String str3 = this.$placementName;
                if (str3 == null) {
                    str3 = "";
                }
                hashMap.remove(str3);
                mutableSharedFlow = this.this$0._offerwallEventFlow;
                com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent2 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED;
                java.lang.String str4 = this.$placementName;
                java.lang.String str5 = str4 == null ? "" : str4;
                this.label = 2;
                if (mutableSharedFlow.emit(new com.unity3d.ads.core.domain.offerwall.OfferwallEventData(offerwallEvent2, str5, null, null, 12, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
