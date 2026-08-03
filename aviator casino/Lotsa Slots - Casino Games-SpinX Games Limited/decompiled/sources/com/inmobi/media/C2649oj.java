package com.inmobi.media;

/* renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2649oj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {
    public C2649oj(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2649oj(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2649oj((kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.media.AbstractC2676pj.b, "access$getTAG$p(...)");
        com.inmobi.media.C2801ub c2801ub = com.inmobi.media.C2801ub.f5486a;
        if (com.inmobi.media.C2801ub.d()) {
            android.location.LocationManager locationManager = com.inmobi.media.C2801ub.b;
            if (locationManager != null) {
                locationManager.removeUpdates(c2801ub);
            }
            com.google.android.gms.common.api.GoogleApiClient googleApiClient = com.inmobi.media.C2801ub.d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        com.inmobi.media.C2801ub.d = null;
        return kotlin.Unit.INSTANCE;
    }
}
