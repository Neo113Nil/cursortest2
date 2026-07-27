package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Na extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6739a;
    public final /* synthetic */ C4019qc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Na(C4019qc c4019qc, Continuation continuation) {
        super(2, continuation);
        this.b = c4019qc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Na(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Na(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6739a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
            C4019qc c4019qc = this.b;
            this.f6739a = 1;
            if (c4213xc.b(c4019qc, this) == coroutine_suspended) {
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
