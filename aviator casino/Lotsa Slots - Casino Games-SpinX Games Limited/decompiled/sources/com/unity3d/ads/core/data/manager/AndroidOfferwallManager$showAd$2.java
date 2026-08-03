package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidOfferwallManager.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class AndroidOfferwallManager$showAd$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.domain.offerwall.OfferwallEventData>, com.unity3d.ads.core.domain.offerwall.OfferwallEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    AndroidOfferwallManager$showAd$2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.domain.offerwall.OfferwallEventData> flowCollector, com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2 androidOfferwallManager$showAd$2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2(continuation);
        androidOfferwallManager$showAd$2.L$0 = flowCollector;
        androidOfferwallManager$showAd$2.L$1 = offerwallEventData;
        return androidOfferwallManager$showAd$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData2 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) this.L$1;
            this.L$0 = offerwallEventData2;
            this.label = 1;
            if (flowCollector.emit(offerwallEventData2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            offerwallEventData = offerwallEventData2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            offerwallEventData = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!kotlin.collections.ArraysKt.contains(new com.unity3d.services.ads.offerwall.OfferwallEvent[]{com.unity3d.services.ads.offerwall.OfferwallEvent.ON_CONTENT_DISMISS, com.unity3d.services.ads.offerwall.OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
    }
}
