package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Jk extends SuspendLambda implements Function1 {
    public Jk(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Jk(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Jk((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Intrinsics.checkNotNullExpressionValue(Kk.b, "access$getTAG$p(...)");
        C4276zk.f7528a.getClass();
        C4276zk.e();
        C3906mc c3906mc = C3906mc.f7246a;
        if (C3906mc.d()) {
            LocationManager locationManager = C3906mc.b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3906mc);
            }
            GoogleApiClient googleApiClient = C3906mc.d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3906mc.d = null;
        return Unit.INSTANCE;
    }
}
