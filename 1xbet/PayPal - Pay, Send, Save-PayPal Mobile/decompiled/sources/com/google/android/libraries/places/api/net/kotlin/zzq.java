package com.google.android.libraries.places.api.net.kotlin;

/* loaded from: classes.dex */
final class zzq extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object zza;
    int zzb;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitSearchNearby(null, null, null, null, this);
    }

    zzq(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }
}
