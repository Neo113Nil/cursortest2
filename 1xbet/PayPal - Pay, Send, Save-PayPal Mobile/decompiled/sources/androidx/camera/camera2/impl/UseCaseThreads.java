package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00102\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0018\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u001a\b\u0004\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00180\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0013\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jc\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0018\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001d2*\b\u0004\u0010\u0013\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00180\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J3\u0010$\u001a\u00020#2\u001e\b\u0004\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00106\u001a\u00070\u0004¢\u0006\u0002\b48\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010)R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\n078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010+R\u0014\u00108\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\"\u0010=\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(\"\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseThreads;", "", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "backgroundDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "isOnSequentialThread", "()Z", "", "checkOnSequentialThread", "()V", "T", "Lkotlin/Function0;", "Lkotlinx/coroutines/Deferred;", "block", "confineDeferred", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/Deferred;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "confineDeferredList", "(ILkotlin/jvm/functions/Function0;)Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "confineDeferredSuspend", "(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineStart;)Lkotlinx/coroutines/Deferred;", "confineDeferredListSuspend", "(ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlinx/coroutines/Job;", "confineLaunch", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/Executor;", "getBackgroundExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "Lorg/jspecify/annotations/NonNull;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ThreadLocal;", "getHighSpeedVideoSizes", "Ljava/lang/ThreadLocal;", "Camera2StreamConfigurationMap", "sequentialExecutor", "getSequentialExecutor", "sequentialScope", "getSequentialScope", "setSequentialScope", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseThreads {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    private final kotlinx.coroutines.CoroutineDispatcher backgroundDispatcher;
    private final java.util.concurrent.Executor backgroundExecutor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ThreadLocal<java.lang.Boolean> Camera2StreamConfigurationMap;
    private final android.os.Handler mainHandler;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final java.util.concurrent.Executor sequentialExecutor;
    private kotlinx.coroutines.CoroutineScope sequentialScope;

    public UseCaseThreads(kotlinx.coroutines.CoroutineScope coroutineScope, java.util.concurrent.Executor executor, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.scope = coroutineScope;
        this.backgroundExecutor = executor;
        this.backgroundDispatcher = coroutineDispatcher;
        this.mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.concurrent.Executor newSequentialExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSequentialExecutor, "");
        this.getHighSpeedVideoFpsRangesFor = newSequentialExecutor;
        this.Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();
        java.util.concurrent.Executor executor2 = new java.util.concurrent.Executor() { // from class: androidx.camera.camera2.impl.UseCaseThreads$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                r0.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.UseCaseThreads$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.camera2.impl.UseCaseThreads.m145$r8$lambda$Sy8e0BZW_MxonrOBkbBkAohDiY(androidx.camera.camera2.impl.UseCaseThreads.this, runnable);
                    }
                });
            }
        };
        this.sequentialExecutor = executor2;
        kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(executor2);
        this.getHighSpeedVideoSizes = from;
        this.sequentialScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)).plus(from));
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final java.util.concurrent.Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    public final android.os.Handler getMainHandler() {
        return this.mainHandler;
    }

    public final boolean isOnSequentialThread() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(), java.lang.Boolean.TRUE);
    }

    public final java.util.concurrent.Executor getSequentialExecutor() {
        return this.sequentialExecutor;
    }

    public final kotlinx.coroutines.CoroutineScope getSequentialScope() {
        return this.sequentialScope;
    }

    public final void setSequentialScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.sequentialScope = coroutineScope;
    }

    public final void checkOnSequentialThread() {
        if (isOnSequentialThread()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        sb.append(java.lang.Thread.currentThread().getName());
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public final <T> kotlinx.coroutines.Deferred<T> confineDeferred(kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.Deferred<? extends T>> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1(block, CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default;
    }

    public final <T> java.util.List<kotlinx.coroutines.Deferred<T>> confineDeferredList(int size, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1(block, arrayList2, null), 3, null);
        return arrayList2;
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred confineDeferredSuspend$default(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineStart coroutineStart, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        kotlinx.coroutines.CoroutineStart coroutineStart2 = coroutineStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineStart2, "");
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(useCaseThreads.getSequentialScope(), null, coroutineStart2, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1(function1, CompletableDeferred$default, null), 1, null);
        return CompletableDeferred$default;
    }

    public final <T> kotlinx.coroutines.Deferred<T> confineDeferredSuspend(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> block, kotlinx.coroutines.CoroutineStart start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "");
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getSequentialScope(), null, start, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1(block, CompletableDeferred$default, null), 1, null);
        return CompletableDeferred$default;
    }

    public static /* synthetic */ java.util.List confineDeferredListSuspend$default(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, int i, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        kotlinx.coroutines.CoroutineStart coroutineStart2 = coroutineStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineStart2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(useCaseThreads.getSequentialScope(), null, coroutineStart2, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1(function1, arrayList2, null), 1, null);
        return arrayList2;
    }

    public final <T> java.util.List<kotlinx.coroutines.Deferred<T>> confineDeferredListSuspend(int size, kotlinx.coroutines.CoroutineStart start, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getSequentialScope(), null, start, new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1(block, arrayList2, null), 1, null);
        return arrayList2;
    }

    public final kotlinx.coroutines.Job confineLaunch(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseThreads$confineLaunch$1(block, null), 3, null);
        return launch$default;
    }

    /* renamed from: $r8$lambda$Sy8e0BZ-W_MxonrOBkbBkAohDiY, reason: not valid java name */
    public static /* synthetic */ void m145$r8$lambda$Sy8e0BZW_MxonrOBkbBkAohDiY(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, java.lang.Runnable runnable) {
        useCaseThreads.Camera2StreamConfigurationMap.set(java.lang.Boolean.TRUE);
        try {
            runnable.run();
        } finally {
            useCaseThreads.Camera2StreamConfigurationMap.remove();
        }
    }
}
