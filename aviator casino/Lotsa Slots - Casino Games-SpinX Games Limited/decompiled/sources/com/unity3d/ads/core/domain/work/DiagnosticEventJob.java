package com.unity3d.ads.core.domain.work;

/* compiled from: DiagnosticEventJob.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "Lkotlin/Lazy;", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiagnosticEventJob extends com.unity3d.ads.core.domain.work.UniversalRequestJob implements com.unity3d.services.core.di.IServiceComponent {

    /* renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy diagnosticEventRequestWorkModifier;

    /* renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy getDiagnosticRequestPolicy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        final com.unity3d.ads.core.domain.work.DiagnosticEventJob diagnosticEventJob = this;
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.NONE;
        final java.lang.String str = com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = kotlin.LazyKt.lazy(lazyThreadSafetyMode, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
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
        final java.lang.String str2 = "";
        this.diagnosticEventRequestWorkModifier = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = com.unity3d.services.core.di.IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier.class));
            }
        });
    }

    private final com.unity3d.ads.core.domain.GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (com.unity3d.ads.core.domain.GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    private final com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 diagnosticEventJob$doWork$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.work.DiagnosticEventJob diagnosticEventJob;
        java.lang.String string;
        com.unity3d.ads.core.domain.work.DiagnosticEventJob diagnosticEventJob2;
        com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource;
        com.google.protobuf.ByteString byteString;
        com.unity3d.ads.core.domain.work.DiagnosticEventJob diagnosticEventJob3;
        if (continuation instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1) {
            diagnosticEventJob$doWork$1 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1) continuation;
            if ((diagnosticEventJob$doWork$1.label & Integer.MIN_VALUE) != 0) {
                diagnosticEventJob$doWork$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = diagnosticEventJob$doWork$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diagnosticEventJob$doWork$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        string = getWorkerParams().getInputData().getString(com.unity3d.ads.core.domain.work.UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                        if (string == null) {
                            androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "success()");
                            return success;
                        }
                        com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource2 = getUniversalRequestDataSource();
                        diagnosticEventJob$doWork$1.L$0 = this;
                        diagnosticEventJob$doWork$1.L$1 = string;
                        diagnosticEventJob$doWork$1.label = 1;
                        obj = universalRequestDataSource2.get(diagnosticEventJob$doWork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        diagnosticEventJob2 = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        diagnosticEventJob = this;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "retry()");
                        return retry;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            diagnosticEventJob = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return (androidx.work.ListenableWorker.Result) obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                                androidx.work.ListenableWorker.Result retry2 = androidx.work.ListenableWorker.Result.retry();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry2, "retry()");
                                return retry2;
                            }
                        }
                        diagnosticEventJob3 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                            diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob3;
                            diagnosticEventJob$doWork$1.label = 3;
                            obj = super.doWork(diagnosticEventJob$doWork$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            diagnosticEventJob = diagnosticEventJob3;
                            return (androidx.work.ListenableWorker.Result) obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            diagnosticEventJob = diagnosticEventJob3;
                            diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                            androidx.work.ListenableWorker.Result retry22 = androidx.work.ListenableWorker.Result.retry();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry22, "retry()");
                            return retry22;
                        }
                    }
                    string = (java.lang.String) diagnosticEventJob$doWork$1.L$1;
                    diagnosticEventJob2 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        diagnosticEventJob = diagnosticEventJob2;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        androidx.work.ListenableWorker.Result retry222 = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry222, "retry()");
                        return retry222;
                    }
                }
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(string));
                com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = diagnosticEventJob2.getDiagnosticEventRequestWorkModifier();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest invoke = diagnosticEventRequestWorkModifier.invoke(universalRequest);
                universalRequestDataSource = diagnosticEventJob2.getUniversalRequestDataSource();
                byteString = invoke.toByteString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "modifiedUniversalRequest.toByteString()");
                diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob2;
                diagnosticEventJob$doWork$1.L$1 = null;
                diagnosticEventJob$doWork$1.label = 2;
                if (universalRequestDataSource.set(string, byteString, diagnosticEventJob$doWork$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                diagnosticEventJob3 = diagnosticEventJob2;
                diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob3;
                diagnosticEventJob$doWork$1.label = 3;
                obj = super.doWork(diagnosticEventJob$doWork$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        diagnosticEventJob$doWork$1 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1(this, continuation);
        java.lang.Object obj2 = diagnosticEventJob$doWork$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diagnosticEventJob$doWork$1.label;
        if (i != 0) {
        }
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) obj2).getUniversalRequestMapOrThrow(string));
        com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier2 = diagnosticEventJob2.getDiagnosticEventRequestWorkModifier();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequest2, "universalRequest");
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest invoke2 = diagnosticEventRequestWorkModifier2.invoke(universalRequest2);
        universalRequestDataSource = diagnosticEventJob2.getUniversalRequestDataSource();
        byteString = invoke2.toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "modifiedUniversalRequest.toByteString()");
        diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob2;
        diagnosticEventJob$doWork$1.L$1 = null;
        diagnosticEventJob$doWork$1.label = 2;
        if (universalRequestDataSource.set(string, byteString, diagnosticEventJob$doWork$1) != coroutine_suspended) {
        }
    }
}
