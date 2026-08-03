package com.unity3d.ads.core.domain.scar;

/* compiled from: CommonScarEventReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", i = {}, l = {35, 41, 52, 66, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CommonScarEventReceiver$sendEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.Enum<?> $eventId;
    final /* synthetic */ java.lang.Object[] $params;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.scar.CommonScarEventReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonScarEventReceiver$sendEvent$1(java.lang.Enum<?> r1, java.lang.Object[] objArr, com.unity3d.ads.core.domain.scar.CommonScarEventReceiver commonScarEventReceiver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1> continuation) {
        super(2, continuation);
        this.$eventId = r1;
        this.$params = objArr;
        this.this$0 = commonScarEventReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1(this.$eventId, this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Enum<?> r2 = this.$eventId;
            if (r2 == com.unity3d.scar.adapter.common.GMAEvent.VERSION) {
                java.lang.Object[] objArr = this.$params;
                com.unity3d.ads.core.domain.scar.CommonScarEventReceiver commonScarEventReceiver = this.this$0;
                java.lang.String str = (java.lang.String) objArr[0];
                mutableSharedFlow4 = commonScarEventReceiver._versionFlow;
                if (!(!kotlin.jvm.internal.Intrinsics.areEqual(str, "0.0.0"))) {
                    str = null;
                }
                this.label = 1;
                if (mutableSharedFlow4.emit(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (r2 == com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED) {
                java.lang.Object[] objArr2 = this.$params;
                mutableSharedFlow3 = this.this$0._gmaEventFlow;
                com.unity3d.scar.adapter.common.GMAEvent gMAEvent = com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED;
                java.lang.Object obj2 = objArr2[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData = new com.unity3d.ads.core.domain.scar.GmaEventData(gMAEvent, null, null, (java.lang.String) obj2, null, null, null, 118, null);
                this.label = 2;
                if (mutableSharedFlow3.emit(gmaEventData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (r2 == com.unity3d.scar.adapter.common.GMAEvent.LOAD_ERROR) {
                java.lang.Object[] objArr3 = this.$params;
                mutableSharedFlow2 = this.this$0._gmaEventFlow;
                com.unity3d.scar.adapter.common.GMAEvent gMAEvent2 = com.unity3d.scar.adapter.common.GMAEvent.LOAD_ERROR;
                java.lang.Object obj3 = objArr3[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) obj3;
                java.lang.Object obj4 = objArr3[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj5 = objArr3[2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj6 = objArr3[3];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData2 = new com.unity3d.ads.core.domain.scar.GmaEventData(gMAEvent2, null, null, str2, (java.lang.String) obj4, (java.lang.String) obj5, (java.lang.Integer) obj6, 6, null);
                this.label = 3;
                if (mutableSharedFlow2.emit(gmaEventData2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (this.$eventId instanceof com.unity3d.scar.adapter.common.GMAEvent) {
                    mutableSharedFlow = this.this$0._gmaEventFlow;
                    this.label = 4;
                    if (mutableSharedFlow.emit(new com.unity3d.ads.core.domain.scar.GmaEventData((com.unity3d.scar.adapter.common.GMAEvent) this.$eventId, null, null, null, null, null, null, 126, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (this.$eventId instanceof com.unity3d.services.banners.bridge.BannerBridge.BannerEvent) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.$eventId instanceof com.unity3d.services.banners.bridge.BannerBridge.BannerEvent) {
                    mutableSharedFlow5 = this.this$0._gmaEventFlow;
                    com.unity3d.scar.adapter.common.GMAEvent gMAEvent3 = com.unity3d.scar.adapter.common.GMAEvent.BANNER;
                    com.unity3d.services.banners.bridge.BannerBridge.BannerEvent bannerEvent = (com.unity3d.services.banners.bridge.BannerBridge.BannerEvent) this.$eventId;
                    java.lang.Object obj7 = this.$params[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.String");
                    this.label = 5;
                    if (mutableSharedFlow5.emit(new com.unity3d.ads.core.domain.scar.GmaEventData(gMAEvent3, bannerEvent, (java.lang.String) obj7, null, null, null, null, 120, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }
}
