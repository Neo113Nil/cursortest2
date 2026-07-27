package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3592ba extends SuspendLambda implements Function1 {
    public C3592ba(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3592ba(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3592ba((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
        C3564aa listener = AbstractC3621ca.c;
        c4213xc.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c4213xc.b = new WeakReference(listener);
        return Unit.INSTANCE;
    }
}
