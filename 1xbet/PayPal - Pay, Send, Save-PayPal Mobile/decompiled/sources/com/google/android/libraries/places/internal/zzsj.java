package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsj implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector zza;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzb;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.internal.zzsi zzsiVar;
        int i;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        if (continuation instanceof com.google.android.libraries.places.internal.zzsi) {
            zzsiVar = (com.google.android.libraries.places.internal.zzsi) continuation;
            int i2 = zzsiVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzsiVar.zzb = i2 - 2147483648;
                java.lang.Object obj2 = zzsiVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzsiVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.zza;
                    kotlin.jvm.functions.Function2 function2 = this.zzb;
                    zzsiVar.zzc = flowCollector2;
                    zzsiVar.zzb = 1;
                    kotlin.jvm.internal.InlineMarker.mark(6);
                    java.lang.Object invoke = function2.invoke(obj, zzsiVar);
                    kotlin.jvm.internal.InlineMarker.mark(7);
                    if (invoke != coroutine_suspended) {
                        obj2 = invoke;
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
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) zzsiVar.zzc;
                kotlin.ResultKt.throwOnFailure(obj2);
                zzsiVar.zzc = null;
                zzsiVar.zzb = 2;
            }
        }
        zzsiVar = new com.google.android.libraries.places.internal.zzsi(this, continuation);
        java.lang.Object obj22 = zzsiVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzsiVar.zzb;
        if (i != 0) {
        }
        zzsiVar.zzc = null;
        zzsiVar.zzb = 2;
    }

    public zzsj(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
        this.zza = flowCollector;
        this.zzb = function2;
    }
}
