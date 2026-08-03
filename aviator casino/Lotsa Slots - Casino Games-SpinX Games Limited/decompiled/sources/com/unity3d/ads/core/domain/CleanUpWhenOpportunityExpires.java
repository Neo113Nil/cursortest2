package com.unity3d.ads.core.domain;

/* compiled from: CleanUpWhenOpportunityExpires.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CleanUpWhenOpportunityExpires {
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;

    public CleanUpWhenOpportunityExpires(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(com.unity3d.ads.core.data.model.AdObject adObject) {
        final kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        if (adObject.getAdPlayer() != null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null);
            kotlinx.coroutines.JobKt.getJob(adObject.getAdPlayer().getScope().getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(kotlinx.coroutines.Job.this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            });
            return;
        }
        throw new java.lang.IllegalArgumentException("AdObject does not have an adPlayer.".toString());
    }
}
