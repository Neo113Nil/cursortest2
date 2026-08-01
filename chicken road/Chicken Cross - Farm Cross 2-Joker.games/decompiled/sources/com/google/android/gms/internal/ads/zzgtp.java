package com.google.android.gms.internal.ads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgtp {
    public static final Deferred zza(CoroutineScope coroutineScope, zzgtm coroutineSequence, Function2 block) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineSequence, "coroutineSequence");
        Intrinsics.checkNotNullParameter(block, "block");
        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new zzgto(coroutineSequence, block, null), 1, null);
        return async$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zzd(Mutex mutex, Continuation continuation) {
        Object lock = mutex.lock(null, continuation);
        return lock == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lock : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zze(Mutex mutex, Continuation continuation) {
        zzgtn zzgtnVar = zzgtn.zza;
        if ((!(zzgtnVar instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(zzgtnVar, mutex, continuation) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(zzgtnVar, 2)).invoke(mutex, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            IntrinsicsKt.intercepted(continuation).resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
        }
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
