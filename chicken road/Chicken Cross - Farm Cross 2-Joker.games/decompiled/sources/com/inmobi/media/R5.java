package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class R5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6819a;
    public final /* synthetic */ S5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(S5 s5, Continuation continuation) {
        super(2, continuation);
        this.b = s5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new R5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R5(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6819a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4120u1 abstractC4120u1 = this.b.b;
            if (abstractC4120u1 != null) {
                abstractC4120u1.a();
            }
            Fd fd = this.b.f6842a;
            if (fd != null) {
                this.f6819a = 1;
                if (fd.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
