package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final class O2 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f6754a;
    public final /* synthetic */ P2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(P2 p2, Continuation continuation) {
        super(3, continuation);
        this.b = p2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new O2(this.b, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6754a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            P2 p2 = this.b;
            this.f6754a = 1;
            if (P2.a(p2, this) == coroutine_suspended) {
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
