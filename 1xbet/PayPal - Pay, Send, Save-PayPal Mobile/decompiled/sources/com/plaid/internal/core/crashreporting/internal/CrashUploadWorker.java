package com.plaid.internal.core.crashreporting.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/CrashUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CrashUploadWorker extends androidx.work.CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.E5 f6011a;
    public final com.google.gson.Gson b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        this.f6011a = com.plaid.internal.E5.c.a(null);
        this.b = new com.google.gson.Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a aVar;
        int i;
        if (continuation instanceof com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a) {
            aVar = (com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - 2147483648;
                java.lang.Object obj = aVar.f6012a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.work.Data inputData = getInputData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
                    com.plaid.internal.X6 a2 = new com.plaid.internal.W(this.f6011a).a(inputData.getString("crashesApiClass"));
                    com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = (com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions) this.b.fromJson(inputData.getString("crashOptions"), com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions.class);
                    if (crashApiOptions == null) {
                        throw new java.lang.IllegalArgumentException("No crash options provided");
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashApiOptions, "");
                    a2.c = crashApiOptions;
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    android.content.Context applicationContext2 = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                    androidx.work.Data inputData2 = getInputData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData2, "");
                    com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions2 = (com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions) this.b.fromJson(inputData2.getString("crashOptions"), com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions.class);
                    if (crashApiOptions2 == null) {
                        throw new java.lang.IllegalArgumentException("No crash options provided");
                    }
                    com.plaid.internal.C0456b0 c0456b0 = new com.plaid.internal.C0456b0(applicationContext2, crashApiOptions2, com.plaid.internal.C0546i0.f6434a);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0456b0, "");
                    java.io.File filesDir = applicationContext.getFilesDir();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
                    com.plaid.internal.C0537h0 c0537h0 = new com.plaid.internal.C0537h0(new com.plaid.internal.C0551i5(filesDir, "plaid-sdk/crashes"), c0456b0);
                    kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                    com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b bVar = new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b(c0537h0, a2, null);
                    aVar.c = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, bVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        aVar = new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a(continuation);
        java.lang.Object obj2 = aVar.f6012a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", f = "CrashUploadWorker.kt", i = {}, l = {35}, m = "doWork", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f6012a;
        public int c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f6012a = obj;
            this.c |= Integer.MIN_VALUE;
            return com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.this.doWork(this);
        }

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.a> continuation) {
            super(continuation);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", f = "CrashUploadWorker.kt", i = {1}, l = {36, 39, 40}, m = "invokeSuspend", n = {"batchEvents"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.util.List f6013a;
        public int b;
        public final /* synthetic */ com.plaid.internal.C0537h0 c;
        public final /* synthetic */ com.plaid.internal.X6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.plaid.internal.C0537h0 c0537h0, com.plaid.internal.X6 x6, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.c = c0537h0;
            this.d = x6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
            return new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b(this.c, this.d, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r7.a(r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r7 != r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        
            if (r7 != r0) goto L14;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.List list;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0537h0 c0537h0 = this.c;
                this.b = 1;
                obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0510e0(c0537h0, null), this);
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return androidx.work.ListenableWorker.Result.success();
                }
                list = this.f6013a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.X6 x6 = this.d;
                this.f6013a = null;
                this.b = 3;
            }
            list = (java.util.List) obj;
            com.plaid.internal.C0537h0 c0537h02 = this.c;
            this.f6013a = list;
            this.b = 2;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0501d0(c0537h02, null), this);
            if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = kotlin.Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b(this.c, this.d, continuation);
        }
    }
}
