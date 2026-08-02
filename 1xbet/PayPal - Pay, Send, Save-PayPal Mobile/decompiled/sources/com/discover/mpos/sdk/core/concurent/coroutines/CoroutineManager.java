package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;", "", "<init>", "()V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "reset$mpos_sdk_core_release", "Lcom/discover/mpos/sdk/core/concurent/coroutines/DefaultCoroutineContextManager;", "contextManager", "Lcom/discover/mpos/sdk/core/concurent/coroutines/DefaultCoroutineContextManager;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDispatcherProvider;", "getCoroutineDispatcherProvider$mpos_sdk_core_release", "()Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDispatcherProvider;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineContextInitializer;", "coroutineInitializer", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineContextInitializer;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$mpos_sdk_core_release", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class CoroutineManager {
    private final com.discover.mpos.sdk.core.concurent.coroutines.DefaultCoroutineContextManager contextManager;
    private final com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider coroutineDispatcherProvider;
    private com.discover.mpos.sdk.core.concurent.coroutines.CoroutineContextInitializer coroutineInitializer;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;

    public CoroutineManager() {
        com.discover.mpos.sdk.core.concurent.coroutines.DefaultCoroutineContextManager defaultCoroutineContextManager = new com.discover.mpos.sdk.core.concurent.coroutines.DefaultCoroutineContextManager(null, null, null, 7, null);
        this.contextManager = defaultCoroutineContextManager;
        this.coroutineScope = defaultCoroutineContextManager;
        this.coroutineDispatcherProvider = defaultCoroutineContextManager;
        this.coroutineInitializer = defaultCoroutineContextManager;
    }

    /* renamed from: getCoroutineScope$mpos_sdk_core_release, reason: from getter */
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: getCoroutineDispatcherProvider$mpos_sdk_core_release, reason: from getter */
    public final com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider getCoroutineDispatcherProvider() {
        return this.coroutineDispatcherProvider;
    }

    public final void reset$mpos_sdk_core_release() {
        this.coroutineInitializer.reinitContext();
    }

    public final void cancel() {
        this.contextManager.cancelJob();
    }
}
