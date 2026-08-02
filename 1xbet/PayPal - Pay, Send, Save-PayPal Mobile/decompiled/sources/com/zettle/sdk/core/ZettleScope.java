package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/core/ZettleScope;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "", "name", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "(Ljava/lang/String;Lkotlinx/coroutines/Job;Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lcom/zettle/sdk/core/Monitor;", "monitor", "Lcom/zettle/sdk/core/Monitor;", "getMonitor$core_publicRelease", "()Lcom/zettle/sdk/core/Monitor;", "setMonitor$core_publicRelease", "(Lcom/zettle/sdk/core/Monitor;)V", "sdk", "Lkotlinx/coroutines/CoroutineScope;", "getSdk", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleScope implements com.zettle.sdk.core.log.Loggable {
    public static final com.zettle.sdk.core.ZettleScope INSTANCE = new com.zettle.sdk.core.ZettleScope();
    private static final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler;
    private static com.zettle.sdk.core.Monitor monitor;
    private static final kotlinx.coroutines.CoroutineScope sdk;

    private ZettleScope() {
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public final com.zettle.sdk.core.Monitor getMonitor$core_publicRelease() {
        return monitor;
    }

    public final void setMonitor$core_publicRelease(com.zettle.sdk.core.Monitor monitor2) {
        monitor = monitor2;
    }

    public final kotlinx.coroutines.CoroutineExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    public final kotlinx.coroutines.CoroutineScope getSdk() {
        return sdk;
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineScope scope$default(com.zettle.sdk.core.ZettleScope zettleScope, java.lang.String str, kotlinx.coroutines.Job job, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            job = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        }
        if ((i & 4) != 0) {
            coroutineDispatcher = kotlinx.coroutines.Dispatchers.getIO();
        }
        return zettleScope.scope(str, job, coroutineDispatcher);
    }

    public final kotlinx.coroutines.CoroutineScope scope(java.lang.String name2, kotlinx.coroutines.Job job, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(job.plus(dispatcher).plus(new kotlinx.coroutines.CoroutineName(name2)).plus(exceptionHandler));
    }

    static {
        com.zettle.sdk.core.ZettleScope$special$$inlined$CoroutineExceptionHandler$1 zettleScope$special$$inlined$CoroutineExceptionHandler$1 = new com.zettle.sdk.core.ZettleScope$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        exceptionHandler = zettleScope$special$$inlined$CoroutineExceptionHandler$1;
        sdk = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(new kotlinx.coroutines.CoroutineName("zettle")).plus(zettleScope$special$$inlined$CoroutineExceptionHandler$1));
    }
}
