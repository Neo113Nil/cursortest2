package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/AnonymousIdentifierReadCallback;", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Ljava/util/UUID;", "Lkotlin/Function1;", "", "onFinished", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onFailure", "()V", "Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "dataStoreContent", "onSuccess", "(Lcom/datadog/android/core/persistence/datastore/DataStoreContent;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnonymousIdentifierReadCallback implements com.datadog.android.api.storage.datastore.DataStoreReadCallback<java.util.UUID> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.util.UUID, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousIdentifierReadCallback(kotlin.jvm.functions.Function1<? super java.util.UUID, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreReadCallback
    public final void onSuccess(com.datadog.android.core.persistence.datastore.DataStoreContent<java.util.UUID> dataStoreContent) {
        this.getHighSpeedVideoFpsRanges.invoke(dataStoreContent != null ? dataStoreContent.getData() : null);
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreReadCallback
    public final void onFailure() {
        this.getHighSpeedVideoFpsRanges.invoke(null);
    }
}
