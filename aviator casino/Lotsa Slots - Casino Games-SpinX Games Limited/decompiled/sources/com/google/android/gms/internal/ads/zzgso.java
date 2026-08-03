package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgso extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    java.lang.Object zza;
    int zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgsm zzc;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzd;
    private /* synthetic */ java.lang.Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgso(com.google.android.gms.internal.ads.zzgsm zzgsmVar, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzc = zzgsmVar;
        this.zzd = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgso zzgsoVar = new com.google.android.gms.internal.ads.zzgso(this.zzc, this.zzd, continuation);
        zzgsoVar.zze = obj;
        return zzgsoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.ads.zzgso) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r4 != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.sync.Mutex zza;
        java.lang.Object zze;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.zze);
                com.google.android.gms.internal.ads.zzgsm zzgsmVar = this.zzc;
                function2 = this.zzd;
                zza = zzgsmVar.zza();
                this.zze = zza;
                this.zza = function2;
                this.zzb = 1;
                zze = com.google.android.gms.internal.ads.zzgsp.zze(zza, this);
            } else {
                if (i != 1) {
                    mutex = (kotlinx.coroutines.sync.Mutex) this.zze;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        throw th;
                    }
                }
                function2 = (kotlin.jvm.functions.Function2) this.zza;
                kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) this.zze;
                kotlin.ResultKt.throwOnFailure(obj);
                zza = mutex2;
            }
            this.zze = zza;
            this.zza = null;
            this.zzb = 2;
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(function2, this);
            if (coroutineScope != coroutine_suspended) {
                mutex = zza;
                obj = coroutineScope;
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                return obj;
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th3) {
            mutex = zza;
            th = th3;
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            throw th;
        }
    }
}
