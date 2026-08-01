package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class W3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6922a;
    public final /* synthetic */ C4066s3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(C4066s3 c4066s3, Continuation continuation) {
        super(2, continuation);
        this.b = c4066s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new W3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W3(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6922a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = (C4177w3) X3.b.getValue();
            C4066s3 c4066s3 = this.b;
            this.f6922a = 1;
            Object a2 = S9.a(c4177w3.f7450a, "click", AbstractC4231y3.a(c4066s3), null, null, this, 28);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
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
