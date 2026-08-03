package com.unity3d.ads.core.domain.work;

/* compiled from: UniversalRequestJob.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Landroidx/work/CoroutineWorker;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "logger", "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "logger$delegate", "Lkotlin/Lazy;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "getRequestPolicy", "()Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "setRequestPolicy", "(Lcom/unity3d/ads/gatewayclient/RequestPolicy;)V", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "getUniversalRequestDataSource", "()Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getWorkerParams", "()Landroidx/work/WorkerParameters;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class UniversalRequestJob extends androidx.work.CoroutineWorker implements com.unity3d.services.core.di.IServiceComponent {

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy logger;
    public com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy;

    /* renamed from: universalRequestDataSource$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy universalRequestDataSource;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy universalRequestEventSender;
    private final androidx.work.WorkerParameters workerParams;

    @Override // androidx.work.CoroutineWorker
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    protected final androidx.work.WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
        final com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob = this;
        final java.lang.String str = "";
        this.universalRequestEventSender = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.events.UniversalRequestEventSender invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestEventSender.class));
            }
        });
        this.universalRequestDataSource = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.class));
            }
        });
        this.logger = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.log.Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.log.Logger invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class));
            }
        });
    }

    public final com.unity3d.ads.gatewayclient.RequestPolicy getRequestPolicy() {
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("requestPolicy");
        return null;
    }

    public final void setRequestPolicy(com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }

    protected final com.unity3d.ads.core.domain.events.UniversalRequestEventSender getUniversalRequestEventSender() {
        return (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    protected final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource getUniversalRequestDataSource() {
        return (com.unity3d.ads.core.data.datasource.UniversalRequestDataSource) this.universalRequestDataSource.getValue();
    }

    protected final com.unity3d.ads.core.log.Logger getLogger() {
        return (com.unity3d.ads.core.log.Logger) this.logger.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(4:23|(1:25)|13|14)(2:26|27)))(1:29))(2:34|(2:36|37)(2:38|(1:40)(1:41)))|30|31|(1:33)|20|21|(0)(0)))|44|6|7|(0)(0)|30|31|(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        r4 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(r9));
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 universalRequestJob$doWork$1;
        java.lang.Object coroutine_suspended;
        ?? r2;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob2;
        ?? r8;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest;
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy;
        if (continuation instanceof com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1) {
            universalRequestJob$doWork$1 = (com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1) continuation;
            if ((universalRequestJob$doWork$1.label & Integer.MIN_VALUE) != 0) {
                universalRequestJob$doWork$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = universalRequestJob$doWork$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = universalRequestJob$doWork$1.label;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String string = universalRequestJob.workerParams.getInputData().getString(com.unity3d.ads.core.domain.work.UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                    if (string == null) {
                        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "success()");
                        return success;
                    }
                    com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource = universalRequestJob.getUniversalRequestDataSource();
                    universalRequestJob$doWork$1.L$0 = universalRequestJob;
                    universalRequestJob$doWork$1.L$1 = string;
                    universalRequestJob$doWork$1.label = 1;
                    java.lang.Object obj2 = universalRequestDataSource.get(universalRequestJob$doWork$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    universalRequestJob2 = universalRequestJob;
                    r8 = string;
                    obj = obj2;
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.work.ListenableWorker.Result success2 = androidx.work.ListenableWorker.Result.success();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success2, "{\n            universalR…esult.success()\n        }");
                            return success2;
                        }
                        ?? r82 = (java.lang.String) universalRequestJob$doWork$1.L$1;
                        com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob3 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r2 = universalRequestJob3;
                        universalRequestJob = r82;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                        com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob4 = r2;
                        ?? r83 = universalRequestJob;
                        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                            ?? universalRequestDataSource2 = universalRequestJob4.getUniversalRequestDataSource();
                            universalRequestJob$doWork$1.L$0 = null;
                            universalRequestJob$doWork$1.L$1 = null;
                            universalRequestJob$doWork$1.label = 3;
                            if (universalRequestDataSource2.remove(r83, universalRequestJob$doWork$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidx.work.ListenableWorker.Result success22 = androidx.work.ListenableWorker.Result.success();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success22, "{\n            universalR…esult.success()\n        }");
                            return success22;
                        }
                        androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "{\n            Result.retry()\n        }");
                        return retry;
                    }
                    java.lang.String str = (java.lang.String) universalRequestJob$doWork$1.L$1;
                    com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob5 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    universalRequestJob2 = universalRequestJob5;
                    r8 = str;
                }
                universalRequest = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r8));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                universalRequestEventSender = universalRequestJob2.getUniversalRequestEventSender();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
                requestPolicy = universalRequestJob2.getRequestPolicy();
                universalRequestJob$doWork$1.L$0 = universalRequestJob2;
                universalRequestJob$doWork$1.L$1 = r8;
                universalRequestJob$doWork$1.label = 2;
                r2 = universalRequestJob2;
                universalRequestJob = r8;
                if (universalRequestEventSender.invoke(universalRequest, requestPolicy, universalRequestJob$doWork$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob42 = r2;
                ?? r832 = universalRequestJob;
                if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                }
            }
        }
        universalRequestJob$doWork$1 = new com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1(universalRequestJob, continuation);
        java.lang.Object obj3 = universalRequestJob$doWork$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = universalRequestJob$doWork$1.label;
        if (r2 != 0) {
        }
        universalRequest = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) obj3).getUniversalRequestMapOrThrow(r8));
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        universalRequestEventSender = universalRequestJob2.getUniversalRequestEventSender();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
        requestPolicy = universalRequestJob2.getRequestPolicy();
        universalRequestJob$doWork$1.L$0 = universalRequestJob2;
        universalRequestJob$doWork$1.L$1 = r8;
        universalRequestJob$doWork$1.label = 2;
        r2 = universalRequestJob2;
        universalRequestJob = r8;
        if (universalRequestEventSender.invoke(universalRequest, requestPolicy, universalRequestJob$doWork$1) == coroutine_suspended) {
        }
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob422 = r2;
        ?? r8322 = universalRequestJob;
        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
        }
    }
}
