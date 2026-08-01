package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class Gb extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6580a;
    public final /* synthetic */ Kb b;
    public final /* synthetic */ C3810j3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(Kb kb, C3810j3 c3810j3, Continuation continuation) {
        super(1, continuation);
        this.b = kb;
        this.c = c3810j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Gb(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Gb(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6580a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Kb kb = this.b;
            C3810j3 c3810j3 = this.c;
            this.f6580a = 1;
            if (Kb.a(kb, c3810j3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return Unit.INSTANCE;
    }
}
