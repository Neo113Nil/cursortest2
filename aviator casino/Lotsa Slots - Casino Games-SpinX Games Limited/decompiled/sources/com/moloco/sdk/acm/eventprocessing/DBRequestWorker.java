package com.moloco.sdk.acm.eventprocessing;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR'\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "Lcom/moloco/sdk/acm/db/d;", "b", "Lcom/moloco/sdk/acm/db/d;", "metricsDAO", "c", "url", "", "Lkotlin/jvm/internal/EnhancedNullability;", "d", "Ljava/util/Map;", "clientOptions", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "headers", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class DBRequestWorker extends androidx.work.CoroutineWorker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: b, reason: from kotlin metadata */
    public final com.moloco.sdk.acm.db.d metricsDAO;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.lang.String url;

    /* renamed from: d, reason: from kotlin metadata */
    public final java.util.Map<java.lang.String, java.lang.String> clientOptions;

    /* renamed from: e, reason: from kotlin metadata */
    public final kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> headers;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.DBRequestWorker", f = "DBWorkRequest.kt", i = {0}, l = {110}, m = "doWork", n = {"this"}, s = {"L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6889a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.acm.eventprocessing.DBRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(android.content.Context context, androidx.work.WorkerParameters params) {
        super(context, params);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "DBRequestWorker";
        this.metricsDAO = com.moloco.sdk.acm.db.MetricsDb.INSTANCE.b(context).b();
        this.url = getInputData().getString("url");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.moloco.sdk.acm.b.e, getInputData().getString(com.moloco.sdk.acm.b.e)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.f, getInputData().getString(com.moloco.sdk.acm.b.f)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.g, getInputData().getString(com.moloco.sdk.acm.b.g)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.d, getInputData().getString(com.moloco.sdk.acm.b.d)), kotlin.TuplesKt.to("osv", getInputData().getString("osv")), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.h, getInputData().getString(com.moloco.sdk.acm.b.h)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.b, getInputData().getString(com.moloco.sdk.acm.b.b)));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : mapOf.entrySet()) {
            if (((java.lang.String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.clientOptions = linkedHashMap;
        this.headers = new com.moloco.sdk.acm.http.a().a((java.lang.String) linkedHashMap.get(com.moloco.sdk.acm.b.h), (java.lang.String) linkedHashMap.get("osv"), (java.lang.String) linkedHashMap.get(com.moloco.sdk.acm.b.e), (java.lang.String) linkedHashMap.get(com.moloco.sdk.acm.b.f), (java.lang.String) linkedHashMap.get(com.moloco.sdk.acm.b.g), (java.lang.String) linkedHashMap.get(com.moloco.sdk.acm.b.b));
    }

    public final kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> a() {
        return this.headers;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a aVar;
        int i;
        com.moloco.sdk.acm.eventprocessing.DBRequestWorker dBRequestWorker;
        if (continuation instanceof com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a) {
            aVar = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        if (this.url != null) {
                            com.moloco.sdk.acm.http.b bVar = com.moloco.sdk.acm.http.b.f6906a;
                            bVar.a(com.moloco.sdk.acm.http.c.c(), this.url);
                            com.moloco.sdk.acm.eventprocessing.k kVar = new com.moloco.sdk.acm.eventprocessing.k(bVar.a(), this.metricsDAO, new com.moloco.sdk.acm.eventprocessing.f(new com.moloco.sdk.acm.services.j(), 720L), this.headers);
                            aVar.f6889a = this;
                            aVar.d = 1;
                            if (kVar.a(aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dBRequestWorker = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        dBRequestWorker = this;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, dBRequestWorker.TAG, "Work Manager failure: " + e.getMessage(), null, false, 12, null);
                        return androidx.work.ListenableWorker.Result.failure();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dBRequestWorker = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker) aVar.f6889a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ((kotlin.Result) obj).getValue();
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, dBRequestWorker.TAG, "Work Manager failure: " + e.getMessage(), null, false, 12, null);
                        return androidx.work.ListenableWorker.Result.failure();
                    }
                }
                return androidx.work.ListenableWorker.Result.success();
            }
        }
        aVar = new com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a(continuation);
        java.lang.Object obj2 = aVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        return androidx.work.ListenableWorker.Result.success();
    }
}
