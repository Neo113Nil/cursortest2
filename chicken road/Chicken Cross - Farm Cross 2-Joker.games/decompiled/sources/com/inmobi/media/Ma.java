package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Ma extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6713a;
    public final /* synthetic */ Oa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ma(Oa oa, Continuation continuation) {
        super(2, continuation);
        this.b = oa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ma(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ma(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6713a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
            String str = this.b.f6760a.c.f7325a;
            this.f6713a = 1;
            if (c4213xc.a(str, this) == coroutine_suspended) {
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
