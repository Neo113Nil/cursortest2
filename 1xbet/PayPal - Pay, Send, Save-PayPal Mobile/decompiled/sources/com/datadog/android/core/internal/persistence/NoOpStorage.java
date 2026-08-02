package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J3\u0010\u0013\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0004\u0012\u00020\n0\u0010j\u0002`\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "<init>", "()V", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "deleteBatch", "", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "getEventWriteScope", "(Lcom/datadog/android/api/context/DatadogContext;)Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpStorage implements com.datadog.android.core.internal.persistence.Storage {
    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void dropAll() {
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final com.datadog.android.core.internal.persistence.BatchData readNextBatch() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> getEventWriteScope(com.datadog.android.api.context.DatadogContext datadogContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        return new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.core.internal.persistence.NoOpStorage$getEventWriteScope$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit> function1) {
                getHighResolutionOutputSizeshNQ4ISI(function1);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit> function1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            }
        };
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void confirmBatchRead(com.datadog.android.core.internal.persistence.BatchId batchId, com.datadog.android.core.internal.metrics.RemovalReason removalReason, boolean deleteBatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removalReason, "");
    }
}
