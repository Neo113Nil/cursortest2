package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/core/internal/persistence/AsyncEventWriteScope;", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "Ljava/util/concurrent/Executor;", "executor", "writer", "", "featureWriteLock", "", "featureName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/util/concurrent/Executor;Lcom/datadog/android/api/storage/EventBatchWriter;Ljava/lang/Object;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "block", "invoke", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Ljava/util/concurrent/Executor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/storage/EventBatchWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncEventWriteScope implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, kotlin.Unit> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.storage.EventBatchWriter getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

    public AsyncEventWriteScope(java.util.concurrent.Executor executor, com.datadog.android.api.storage.EventBatchWriter eventBatchWriter, java.lang.Object obj, java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
        this.getHighSpeedVideoSizes = eventBatchWriter;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit> function1) {
        invoke2((kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighResolutionOutputSizeshNQ4ISI, "eventWriteScopeInvoke-".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor)), this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.AsyncEventWriteScope$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.AsyncEventWriteScope.$r8$lambda$koohHkx7R4USittGOuySi_W6QvE(com.datadog.android.core.internal.persistence.AsyncEventWriteScope.this, block);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$koohHkx7R4USittGOuySi_W6QvE(com.datadog.android.core.internal.persistence.AsyncEventWriteScope asyncEventWriteScope, kotlin.jvm.functions.Function1 function1) {
        synchronized (asyncEventWriteScope.getHighSpeedVideoFpsRanges) {
            function1.invoke(asyncEventWriteScope.getHighSpeedVideoSizes);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
