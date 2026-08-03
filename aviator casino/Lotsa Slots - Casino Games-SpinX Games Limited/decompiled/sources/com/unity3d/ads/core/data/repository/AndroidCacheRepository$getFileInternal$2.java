package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidCacheRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", i = {0, 1}, l = {70, 77, 89}, m = "invokeSuspend", n = {io.ktor.http.ContentDisposition.Parameters.FileName, "fileResult"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class AndroidCacheRepository$getFileInternal$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult>, java.lang.Object> {
    final /* synthetic */ java.io.File $cacheDirectory;
    final /* synthetic */ int $priority;
    final /* synthetic */ java.lang.String $url;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$getFileInternal$2(com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, java.lang.String str, java.io.File file, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String filename;
        com.unity3d.ads.core.data.datasource.CacheDataSource cacheDataSource;
        java.lang.Object file;
        kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            filename = this.this$0.getFilename(this.$url);
            cacheDataSource = this.this$0.localCacheDataSource;
            this.L$0 = filename;
            this.label = 1;
            file = cacheDataSource.getFile(this.$cacheDirectory, filename, this.$url, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$priority), this);
            if (file == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                MutableStateFlow = (kotlinx.coroutines.flow.MutableStateFlow) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.filterNotNull(MutableStateFlow), this);
                return first != coroutine_suspended ? coroutine_suspended : first;
            }
            filename = (java.lang.String) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            file = obj;
        }
        java.lang.String str = filename;
        com.unity3d.ads.core.data.model.CacheResult cacheResult = (com.unity3d.ads.core.data.model.CacheResult) file;
        if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
            return cacheResult;
        }
        MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        downloadPriorityQueue = this.this$0.downloadPriorityQueue;
        this.L$0 = MutableStateFlow;
        this.label = 2;
        if (downloadPriorityQueue.invoke(this.$priority, new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1(this.this$0, this.$cacheDirectory, str, this.$url, this.$priority, MutableStateFlow, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.L$0 = null;
        this.label = 3;
        java.lang.Object first2 = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.filterNotNull(MutableStateFlow), this);
        if (first2 != coroutine_suspended) {
        }
    }

    /* compiled from: AndroidCacheRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", i = {}, l = {79, 85}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.io.File $cacheDirectory;
        final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> $fileResult;
        final /* synthetic */ java.lang.String $filename;
        final /* synthetic */ int $priority;
        final /* synthetic */ java.lang.String $url;
        int label;
        final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, java.io.File file, java.lang.String str, java.lang.String str2, int i, kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> mutableStateFlow, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = mutableStateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[LOOP:0: B:7:0x0079->B:13:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.data.datasource.CacheDataSource cacheDataSource;
            com.unity3d.ads.core.data.datasource.CacheDataSource cacheDataSource2;
            com.unity3d.ads.core.data.model.CacheResult cacheResult;
            kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> mutableStateFlow;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                cacheDataSource = this.this$0.localCacheDataSource;
                this.label = 1;
                obj = cacheDataSource.getFile(this.$cacheDirectory, this.$filename, this.$url, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$priority), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
                    mutableStateFlow = this.$fileResult;
                    while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), cacheResult)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.unity3d.ads.core.data.model.CacheResult cacheResult2 = (com.unity3d.ads.core.data.model.CacheResult) obj;
            if (!(cacheResult2 instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
                cacheDataSource2 = this.this$0.remoteCacheDataSource;
                this.label = 2;
                obj = cacheDataSource2.getFile(this.$cacheDirectory, this.$filename, this.$url, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$priority), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
                mutableStateFlow = this.$fileResult;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), cacheResult)) {
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.CacheResult> mutableStateFlow2 = this.$fileResult;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), cacheResult2)) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
