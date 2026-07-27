package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class I4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6617a;
    public final /* synthetic */ J4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(J4 j4, Continuation continuation) {
        super(2, continuation);
        this.b = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I4(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I4(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6617a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            J4 j4 = this.b;
            this.f6617a = 1;
            Object collect = FlowKt.flow(new Si(new Ti((B4) j4.b.b.getValue()), null)).collect(new F4(j4), this);
            if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutine_suspended) {
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
