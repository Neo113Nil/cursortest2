package com.google.common.cache;

/* loaded from: classes9.dex */
public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static <K, V> com.google.common.cache.RemovalListener<K, V> asynchronous(final com.google.common.cache.RemovalListener<K, V> removalListener, final java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(removalListener);
        com.google.common.base.Preconditions.checkNotNull(executor);
        return new com.google.common.cache.RemovalListener() { // from class: com.google.common.cache.RemovalListeners$$ExternalSyntheticLambda0
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(com.google.common.cache.RemovalNotification removalNotification) {
                executor.execute(new java.lang.Runnable() { // from class: com.google.common.cache.RemovalListeners$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.common.cache.RemovalListener.this.onRemoval(removalNotification);
                    }
                });
            }
        };
    }
}
