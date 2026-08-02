package com.datadog.android.sessionreplay.internal.storage;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/storage/NoOpResourcesWriter;", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "<init>", "()V", "Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;", "enrichedResource", "", "write", "(Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpResourcesWriter implements com.datadog.android.sessionreplay.internal.storage.ResourcesWriter {
    @Override // com.datadog.android.sessionreplay.internal.storage.ResourcesWriter
    public final void write(com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrichedResource, "");
    }
}
