package com.unity3d.ads.core.utils;

/* compiled from: CommonCoroutineTimer.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/Job;", "delayStartMillis", "", "repeatMillis", "action", "Lkotlin/Function0;", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonCoroutineTimer implements com.unity3d.ads.core.utils.CoroutineTimer {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope scope;

    public CommonCoroutineTimer(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        kotlinx.coroutines.CompletableJob SupervisorJob$default = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.job = SupervisorJob$default;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorJob$default));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public kotlinx.coroutines.Job start(long delayStartMillis, long repeatMillis, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1(delayStartMillis, action, repeatMillis, null), 2, null);
        return launch$default;
    }
}
