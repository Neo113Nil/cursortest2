package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpm {
    private final android.content.Context zza;

    public final java.lang.Object zza(android.net.Uri uri, com.google.android.libraries.places.internal.zzpo zzpoVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.bumptech.glide.Glide.with(this.zza).asBitmap().load(uri).dontAnimate().into((com.bumptech.glide.request.target.Target) zzpoVar), "");
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public zzpm(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.zza = context;
    }
}
