package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidOpenMeasurementRepository$activateOM$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
    final /* synthetic */ android.content.Context $context;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$activateOM$2(com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository androidOpenMeasurementRepository, android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2> continuation) {
        super(2, continuation);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.manager.OmidManager omidManager;
        com.unity3d.ads.core.data.manager.OmidManager omidManager2;
        com.unity3d.ads.core.data.model.OMResult.Failure failure;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.this$0.isOMActive()) {
            try {
                omidManager = this.this$0.omidManager;
                omidManager.activate(this.$context);
                com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
                omidManager2 = androidOpenMeasurementRepository.omidManager;
                androidOpenMeasurementRepository.setOMActive(omidManager2.isActive());
                if (this.this$0.isOMActive()) {
                    failure = com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
                } else {
                    failure = new com.unity3d.ads.core.data.model.OMResult.Failure("om_activate_failure_time", null, 2, null);
                }
                return failure;
            } catch (java.lang.Throwable th) {
                return new com.unity3d.ads.core.data.model.OMResult.Failure("uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
        return new com.unity3d.ads.core.data.model.OMResult.Failure("om_already_active", null, 2, null);
    }
}
