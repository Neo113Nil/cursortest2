package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class T3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6864a;
    public final /* synthetic */ C4066s3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(C4066s3 c4066s3, Continuation continuation) {
        super(2, continuation);
        this.b = c4066s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T3(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6864a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = (C4177w3) X3.b.getValue();
            int i2 = this.b.f7366a;
            this.f6864a = 1;
            Object a2 = c4177w3.f7450a.a("click", "id=?", new String[]{String.valueOf(i2)}, this);
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
