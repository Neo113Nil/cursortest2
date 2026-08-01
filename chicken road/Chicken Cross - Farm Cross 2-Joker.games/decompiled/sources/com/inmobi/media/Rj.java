package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Rj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tj f6831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Tj tj, Continuation continuation) {
        super(2, continuation);
        this.f6831a = tj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Rj(this.f6831a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Rj(this.f6831a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Tj tj = this.f6831a;
        if (tj.a(tj.c.b)) {
            Y9 l = this.f6831a.l();
            if (l != null) {
                ((Z9) l).b("AUM-RenderedState", "onAdImpression callback blocked.");
            }
        } else {
            this.f6831a.d.onAdImpression(null);
        }
        return Unit.INSTANCE;
    }
}
