package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0013\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0019\u0010\u0010\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u0019\u0010\u0012\u001a\u0015\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/DefaultDiscoverJob;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;", "coroutineManager", "<init>", "(JLcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lkotlin/Function0;", "onExecute", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "onResult", "", "onError", "execute", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/Job;", "coroutineJob", "Lkotlinx/coroutines/Job;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;", "J"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class DefaultDiscoverJob<R> implements com.discover.mpos.sdk.core.concurent.DiscoverJob<R> {
    private kotlinx.coroutines.Job coroutineJob;
    private final com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager;
    private final long timeout;

    public DefaultDiscoverJob(long j, com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineManager, "");
        this.timeout = j;
        this.coroutineManager = coroutineManager;
    }

    @Override // com.discover.mpos.sdk.core.concurent.DiscoverJob
    public final void execute(kotlin.jvm.functions.Function0<? extends R> onExecute, kotlin.jvm.functions.Function1<? super R, kotlin.Unit> onResult, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExecute, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineManager.getCoroutineScope(), null, null, new com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1(this, onExecute, onError, onResult, null), 3, null);
        this.coroutineJob = launch$default;
    }

    @Override // com.discover.mpos.sdk.core.concurent.DiscoverJob
    public final void cancel() {
        kotlinx.coroutines.Job job = this.coroutineJob;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.coroutineManager.reset$mpos_sdk_core_release();
    }
}
