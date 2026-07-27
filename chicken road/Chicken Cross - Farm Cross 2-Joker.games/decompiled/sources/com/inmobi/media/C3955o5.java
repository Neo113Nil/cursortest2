package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3955o5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7280a;
    public final /* synthetic */ StateFlow b;
    public final /* synthetic */ C3697f2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3955o5(StateFlow stateFlow, C3697f2 c3697f2, Continuation continuation) {
        super(2, continuation);
        this.b = stateFlow;
        this.c = c3697f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3955o5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3955o5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7280a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlow = this.b;
            C3697f2 c3697f2 = this.c;
            this.f7280a = 1;
            if (stateFlow.collect(c3697f2, this) == coroutine_suspended) {
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
