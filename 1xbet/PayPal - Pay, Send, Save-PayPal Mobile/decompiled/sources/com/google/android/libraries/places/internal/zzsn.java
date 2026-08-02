package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsn implements kotlinx.coroutines.flow.Flow {
    final /* synthetic */ kotlinx.coroutines.flow.Flow zza;

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.zza.collect(new com.google.android.libraries.places.internal.zzsm(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public zzsn(kotlinx.coroutines.flow.Flow flow) {
        this.zza = flow;
    }
}
