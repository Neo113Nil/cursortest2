package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgsp {
    public static final kotlinx.coroutines.Deferred zza(kotlinx.coroutines.CoroutineScope coroutineScope, com.google.android.gms.internal.ads.zzgsm coroutineSequence, kotlin.jvm.functions.Function2 block) {
        kotlinx.coroutines.Deferred async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineSequence, "coroutineSequence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new com.google.android.gms.internal.ads.zzgso(coroutineSequence, block, null), 1, null);
        return async$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object zzd(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation continuation) {
        java.lang.Object lock = mutex.lock(null, continuation);
        return lock == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lock : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object zze(kotlinx.coroutines.sync.Mutex mutex, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVar = com.google.android.gms.internal.ads.zzgsn.zza;
        if ((!(zzgsnVar instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(zzgsnVar, mutex, continuation) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(zzgsnVar, 2)).invoke(mutex, continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation).resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }
}
