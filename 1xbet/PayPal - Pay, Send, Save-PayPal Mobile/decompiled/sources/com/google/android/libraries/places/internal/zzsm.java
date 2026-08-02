package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsm implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector zza;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.internal.zzsl zzslVar;
        int i;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        if (continuation instanceof com.google.android.libraries.places.internal.zzsl) {
            zzslVar = (com.google.android.libraries.places.internal.zzsl) continuation;
            int i2 = zzslVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzslVar.zzb = i2 - 2147483648;
                java.lang.Object obj2 = zzslVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzslVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.zza;
                    zzslVar.zzc = flowCollector2;
                    zzslVar.zzb = 1;
                    java.lang.Object await = ((kotlinx.coroutines.Deferred) obj).await(zzslVar);
                    if (await != coroutine_suspended) {
                        obj2 = await;
                        flowCollector = flowCollector2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    return kotlin.Unit.INSTANCE;
                }
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) zzslVar.zzc;
                kotlin.ResultKt.throwOnFailure(obj2);
                zzslVar.zzc = null;
                zzslVar.zzb = 2;
            }
        }
        zzslVar = new com.google.android.libraries.places.internal.zzsl(this, continuation);
        java.lang.Object obj22 = zzslVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzslVar.zzb;
        if (i != 0) {
        }
        zzslVar.zzc = null;
        zzslVar.zzb = 2;
    }

    public zzsm(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.zza = flowCollector;
    }
}
