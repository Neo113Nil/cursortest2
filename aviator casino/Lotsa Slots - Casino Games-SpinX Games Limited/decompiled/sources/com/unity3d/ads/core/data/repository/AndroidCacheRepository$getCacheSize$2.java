package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidCacheRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidCacheRepository$getCacheSize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$getCacheSize$2(com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: AndroidCacheRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> {
        public static final com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2.AnonymousClass1 INSTANCE = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2.AnonymousClass1();

        AnonymousClass1() {
            super(1, java.io.File.class, "isFile", "isFile()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Boolean invoke(java.io.File p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            return java.lang.Boolean.valueOf(p0.isFile());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.io.File file;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            file = this.this$0.cacheDir;
            java.util.Iterator it = kotlin.sequences.SequencesKt.filter(kotlin.io.FilesKt.walk$default(file, null, 1, null), com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2.AnonymousClass1.INSTANCE).iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((java.io.File) it.next()).length();
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
