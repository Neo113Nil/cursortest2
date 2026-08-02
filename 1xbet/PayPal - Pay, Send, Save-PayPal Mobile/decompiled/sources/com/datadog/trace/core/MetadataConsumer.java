package com.datadog.trace.core;

@java.lang.FunctionalInterface
/* loaded from: classes8.dex */
public interface MetadataConsumer extends com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.core.Metadata> {
    public static final com.datadog.trace.core.MetadataConsumer NO_OP = new com.datadog.trace.core.MetadataConsumer() { // from class: com.datadog.trace.core.MetadataConsumer$$ExternalSyntheticLambda0
        @Override // com.datadog.trace.core.MetadataConsumer
        public final void accept(com.datadog.trace.core.Metadata metadata) {
            com.datadog.trace.core.MetadataConsumer.lambda$static$0(metadata);
        }
    };

    static /* synthetic */ void lambda$static$0(com.datadog.trace.core.Metadata metadata) {
    }

    @Override // com.datadog.android.trace.internal.compat.function.Consumer
    void accept(com.datadog.trace.core.Metadata metadata);
}
