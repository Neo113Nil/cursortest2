package com.unity3d.ads.core.domain.work;

/* compiled from: OperativeEventJob.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/work/OperativeEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getOperativeRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetOperativeRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy$delegate", "Lkotlin/Lazy;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OperativeEventJob extends com.unity3d.ads.core.domain.work.UniversalRequestJob implements com.unity3d.services.core.di.IServiceComponent {

    /* renamed from: getOperativeRequestPolicy$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy getOperativeRequestPolicy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        final com.unity3d.ads.core.domain.work.OperativeEventJob operativeEventJob = this;
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.NONE;
        final java.lang.String str = com.unity3d.services.core.di.ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy = kotlin.LazyKt.lazy(lazyThreadSafetyMode, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetRequestPolicy invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class));
            }
        });
    }

    private final com.unity3d.ads.core.domain.GetRequestPolicy getGetOperativeRequestPolicy() {
        return (com.unity3d.ads.core.domain.GetRequestPolicy) this.getOperativeRequestPolicy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 operativeEventJob$doWork$1;
        int i;
        com.unity3d.ads.core.domain.work.OperativeEventJob operativeEventJob;
        if (continuation instanceof com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1) {
            operativeEventJob$doWork$1 = (com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1) continuation;
            if ((operativeEventJob$doWork$1.label & Integer.MIN_VALUE) != 0) {
                operativeEventJob$doWork$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = operativeEventJob$doWork$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operativeEventJob$doWork$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
                        operativeEventJob$doWork$1.L$0 = this;
                        operativeEventJob$doWork$1.label = 1;
                        obj = super.doWork(operativeEventJob$doWork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        operativeEventJob = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        operativeEventJob = this;
                        operativeEventJob.getLogger().trace("OperativeEventJob failed to process work", th);
                        androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "retry()");
                        return retry;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    operativeEventJob = (com.unity3d.ads.core.domain.work.OperativeEventJob) operativeEventJob$doWork$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        operativeEventJob.getLogger().trace("OperativeEventJob failed to process work", th);
                        androidx.work.ListenableWorker.Result retry2 = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry2, "retry()");
                        return retry2;
                    }
                }
                return (androidx.work.ListenableWorker.Result) obj;
            }
        }
        operativeEventJob$doWork$1 = new com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1(this, continuation);
        java.lang.Object obj2 = operativeEventJob$doWork$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operativeEventJob$doWork$1.label;
        if (i != 0) {
        }
        return (androidx.work.ListenableWorker.Result) obj2;
    }
}
