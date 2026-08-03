package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlGetRequestWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moloco-sdk_release", "url", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UrlGetRequestWorker extends androidx.work.CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] f7990a = {kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.class, "url", "<v#0>", 0))};
    public static final int b = 0;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker", f = "PersistentHttpRequest.kt", i = {0, 0}, l = {84}, m = "doWork", n = {"this", "url$delegate"}, s = {"L$0", "L$1"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7991a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(android.content.Context context, androidx.work.WorkerParameters params) {
        super(com.moloco.sdk.internal.android_context.b.a(context), params);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
    }

    public static final java.lang.String a(java.util.Map<java.lang.String, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
        return (java.lang.String) kotlin.collections.MapsKt.getOrImplicitDefaultNullable(map, f7990a[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a aVar;
        java.lang.Object obj;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker urlGetRequestWorker;
        java.util.Map<java.lang.String, java.lang.Object> map;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                obj = aVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.HttpClient a2 = com.moloco.sdk.service_locator.a.i.f7350a.a();
                    java.util.Map<java.lang.String, java.lang.Object> keyValueMap = getInputData().getKeyValueMap();
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.d, "Sending request to " + a(keyValueMap), null, false, 12, null);
                    java.lang.String a3 = a(keyValueMap);
                    aVar.f7991a = this;
                    aVar.b = keyValueMap;
                    aVar.e = 1;
                    obj = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(a2, a3, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    urlGetRequestWorker = this;
                    map = keyValueMap;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) aVar.b;
                    urlGetRequestWorker = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker) aVar.f7991a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.d, "[Success] Sent request to " + a(map), null, false, 12, null);
                    androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(success);
                    return success;
                }
                if (urlGetRequestWorker.getRunAttemptCount() >= 5) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.d, "[Failure] Request to " + a(map), null, false, 12, null);
                    androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(failure);
                    return failure;
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.d, "[Failure][Retrying] Request to " + a(map), null, false, 12, null);
                androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                kotlin.jvm.internal.Intrinsics.checkNotNull(retry);
                return retry;
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a(continuation);
        obj = aVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
