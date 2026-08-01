package com.unity3d.ads.core.data.repository;

import com.moloco.sdk.BidRequest;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import io.ktor.http.ContentDisposition;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", i = {0, 1}, l = {91, 98, 111}, m = "invokeSuspend", n = {ContentDisposition.Parameters.FileName, "fileResult"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class AndroidCacheRepository$getFileInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CacheResult>, Object> {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $onProgress;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AndroidCacheRepository$getFileInternal$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$onProgress = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CacheResult> continuation) {
        return ((AndroidCacheRepository$getFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String filename;
        CacheDataSource cacheDataSource;
        Object file$default;
        CompletableDeferred CompletableDeferred$default;
        DownloadPriorityQueue downloadPriorityQueue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            filename = this.this$0.getFilename(this.$url);
            cacheDataSource = this.this$0.localCacheDataSource;
            this.L$0 = filename;
            this.label = 1;
            file$default = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, this.$cacheDirectory, filename, this.$url, Boxing.boxInt(this.$priority), 0, null, this, 48, null);
            if (file$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                CompletableDeferred$default = (CompletableDeferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                Object await = CompletableDeferred$default.await(this);
                return await != coroutine_suspended ? coroutine_suspended : await;
            }
            filename = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            file$default = obj;
        }
        String str = filename;
        CacheResult cacheResult = (CacheResult) file$default;
        if (cacheResult instanceof CacheResult.Success) {
            return cacheResult;
        }
        CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        downloadPriorityQueue = this.this$0.downloadPriorityQueue;
        this.L$0 = CompletableDeferred$default;
        this.label = 2;
        if (downloadPriorityQueue.invoke(this.$priority, new AnonymousClass1(this.this$0, this.$cacheDirectory, str, this.$url, this.$priority, CompletableDeferred$default, this.$intervalMs, this.$onProgress, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.L$0 = null;
        this.label = 3;
        Object await2 = CompletableDeferred$default.await(this);
        if (await2 != coroutine_suspended) {
        }
    }

    /* compiled from: AndroidCacheRepository.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", i = {}, l = {100, BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ CompletableDeferred<CacheResult> $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, CompletableDeferred<CacheResult> completableDeferred, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = completableDeferred;
            this.$intervalMs = i2;
            this.$onProgress = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            CacheDataSource cacheDataSource2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cacheDataSource = this.this$0.localCacheDataSource;
                this.label = 1;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, this.$cacheDirectory, this.$filename, this.$url, Boxing.boxInt(this.$priority), 0, null, this, 48, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fileResult.complete((CacheResult) obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CacheResult cacheResult = (CacheResult) obj;
            if (!(cacheResult instanceof CacheResult.Success)) {
                cacheDataSource2 = this.this$0.remoteCacheDataSource;
                this.label = 2;
                obj = cacheDataSource2.getFile(this.$cacheDirectory, this.$filename, this.$url, Boxing.boxInt(this.$priority), this.$intervalMs, this.$onProgress, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$fileResult.complete((CacheResult) obj);
                return Unit.INSTANCE;
            }
            this.$fileResult.complete(cacheResult);
            return Unit.INSTANCE;
        }
    }
}
