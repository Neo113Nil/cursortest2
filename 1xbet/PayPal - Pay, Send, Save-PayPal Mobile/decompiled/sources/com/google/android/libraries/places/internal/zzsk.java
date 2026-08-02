package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsk implements kotlinx.coroutines.flow.Flow {
    final /* synthetic */ kotlinx.coroutines.flow.Flow zza;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzb;

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.zza.collect(new com.google.android.libraries.places.internal.zzsj(flowCollector, this.zzb), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public zzsk(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function2 function2) {
        this.zza = flow;
        this.zzb = function2;
    }
}
