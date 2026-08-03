package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", i = {}, l = {149, 151, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Moloco$initialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.moloco.sdk.publisher.init.MolocoInitParams $initParam;
    final /* synthetic */ com.moloco.sdk.publisher.MolocoInitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$initialize$2(com.moloco.sdk.publisher.init.MolocoInitParams molocoInitParams, com.moloco.sdk.publisher.MolocoInitializationListener molocoInitializationListener, kotlin.coroutines.Continuation<? super com.moloco.sdk.publisher.Moloco$initialize$2> continuation) {
        super(2, continuation);
        this.$initParam = molocoInitParams;
        this.$listener = molocoInitializationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.moloco.sdk.publisher.Moloco$initialize$2(this.$initParam, this.$listener, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.moloco.sdk.internal.publisher.w initializationHandler;
        com.moloco.sdk.internal.v vVar;
        java.util.Set set;
        java.lang.Object updateAndroidClientMetricsOnInitSuccess;
        java.util.Set set2;
        java.util.List flatten;
        com.moloco.sdk.publisher.Moloco moloco;
        boolean shouldInitializeILRD;
        java.util.List flatten2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Moloco", "launched the scope to initialize sdk with thread name: " + java.lang.Thread.currentThread().getName() + " and dispatcher DispatcherProvider().IO", null, false, 12, null);
            com.moloco.sdk.internal.error.crash.a b = com.moloco.sdk.service_locator.a.d.f7345a.b();
            this.label = 1;
            if (b.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                moloco = com.moloco.sdk.publisher.Moloco.INSTANCE;
                com.moloco.sdk.publisher.init.MolocoInitParams molocoInitParams = this.$initParam;
                synchronized (moloco) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                    linkedHashSet.add(molocoInitParams.getMediationInfo().getName());
                    linkedHashSet.addAll(moloco.getPendingInitByMediator$moloco_sdk_release().keySet());
                    if (!linkedHashSet.isEmpty()) {
                        java.util.Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            shouldInitializeILRD = com.moloco.sdk.publisher.Moloco.INSTANCE.shouldInitializeILRD((java.lang.String) it.next());
                            if (shouldInitializeILRD) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    com.moloco.sdk.publisher.Moloco.INSTANCE.initializeILRD();
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization success", null, false, 12, null);
                com.moloco.sdk.publisher.Moloco moloco2 = com.moloco.sdk.publisher.Moloco.INSTANCE;
                synchronized (moloco2) {
                    flatten2 = kotlin.collections.CollectionsKt.flatten(moloco2.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco2.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                com.moloco.sdk.publisher.MolocoInitStatus b2 = com.moloco.sdk.internal.publisher.w.f.b();
                com.moloco.sdk.publisher.MolocoInitializationListener molocoInitializationListener = this.$listener;
                if (molocoInitializationListener != null) {
                    com.moloco.sdk.internal.publisher.x.a(molocoInitializationListener, b2);
                }
                java.util.Iterator it2 = flatten2.iterator();
                while (it2.hasNext()) {
                    com.moloco.sdk.internal.publisher.x.a((com.moloco.sdk.publisher.MolocoInitializationListener) it2.next(), b2);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            vVar = (com.moloco.sdk.internal.v) obj;
            if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                set2 = com.moloco.sdk.publisher.Moloco._failedMediations;
                set2.add(this.$initParam.getMediationInfo().getName());
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization failed", null, false, 12, null);
                com.moloco.sdk.publisher.Moloco moloco3 = com.moloco.sdk.publisher.Moloco.INSTANCE;
                synchronized (moloco3) {
                    flatten = kotlin.collections.CollectionsKt.flatten(moloco3.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco3.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                com.moloco.sdk.publisher.MolocoInitStatus a2 = com.moloco.sdk.internal.publisher.w.f.a(((com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.v.a) vVar).a()).toString());
                com.moloco.sdk.publisher.MolocoInitializationListener molocoInitializationListener2 = this.$listener;
                if (molocoInitializationListener2 != null) {
                    com.moloco.sdk.internal.publisher.x.a(molocoInitializationListener2, a2);
                }
                java.util.Iterator it3 = flatten.iterator();
                while (it3.hasNext()) {
                    com.moloco.sdk.internal.publisher.x.a((com.moloco.sdk.publisher.MolocoInitializationListener) it3.next(), a2);
                }
                return kotlin.Unit.INSTANCE;
            }
            if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            set = com.moloco.sdk.publisher.Moloco._failedMediations;
            set.remove(this.$initParam.getMediationInfo().getName());
            com.moloco.sdk.publisher.Moloco moloco4 = com.moloco.sdk.publisher.Moloco.INSTANCE;
            moloco4.processInitConfigs((com.moloco.sdk.Init.SDKInitResponse) ((com.moloco.sdk.internal.v.b) vVar).a());
            this.label = 3;
            updateAndroidClientMetricsOnInitSuccess = moloco4.updateAndroidClientMetricsOnInitSuccess(this);
            if (updateAndroidClientMetricsOnInitSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
            moloco = com.moloco.sdk.publisher.Moloco.INSTANCE;
            com.moloco.sdk.publisher.init.MolocoInitParams molocoInitParams2 = this.$initParam;
            synchronized (moloco) {
            }
        }
        com.moloco.sdk.publisher.Moloco moloco5 = com.moloco.sdk.publisher.Moloco.INSTANCE;
        moloco5.initializeAndroidClientMetrics(this.$initParam);
        initializationHandler = moloco5.getInitializationHandler();
        java.lang.String appKey = this.$initParam.getAppKey();
        com.moloco.sdk.publisher.MediationInfo mediationInfo = this.$initParam.getMediationInfo();
        com.moloco.sdk.internal.services.init.n c = com.moloco.sdk.service_locator.a.f.f7347a.c();
        com.moloco.sdk.acm.recorder.MetricsRecorder create = com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.create(this.$initParam.getMediationInfo().getName());
        this.label = 2;
        obj = initializationHandler.a(appKey, mediationInfo, c, create, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        vVar = (com.moloco.sdk.internal.v) obj;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.moloco.sdk.publisher.Moloco$initialize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
