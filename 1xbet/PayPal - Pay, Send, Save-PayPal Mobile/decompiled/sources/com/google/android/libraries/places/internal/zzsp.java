package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzsp implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope zza;
    final /* synthetic */ kotlin.jvm.functions.Function2 zzb;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.channels.ProducerScope producerScope = this.zza;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(producerScope, null, null, new com.google.android.libraries.places.internal.zzso(this.zzb, obj, null), 3, null);
        java.lang.Object send = producerScope.send(async$default, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    zzsp(kotlinx.coroutines.channels.ProducerScope producerScope, kotlin.jvm.functions.Function2 function2) {
        this.zza = producerScope;
        this.zzb = function2;
    }
}
