package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Bp extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6483a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3832jp c;
    public final /* synthetic */ Dp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bp(C3832jp c3832jp, Continuation continuation, Dp dp) {
        super(2, continuation);
        this.c = c3832jp;
        this.d = dp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Bp bp = new Bp(this.c, continuation, this.d);
        bp.b = obj;
        return bp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bp) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6483a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            C3832jp c3832jp = this.c;
            Ap ap = new Ap(coroutineScope, this.d);
            this.f6483a = 1;
            if (c3832jp.collect(ap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
