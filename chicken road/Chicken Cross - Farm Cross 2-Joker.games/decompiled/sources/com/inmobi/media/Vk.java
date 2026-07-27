package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Vk extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C3972ol f6916a;
    public int b;
    public final /* synthetic */ Zk c;
    public final /* synthetic */ Xj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Zk zk, Xj xj, Continuation continuation) {
        super(2, continuation);
        this.c = zk;
        this.d = xj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Vk(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Vk(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3972ol c3972ol = this.f6916a;
            ResultKt.throwOnFailure(obj);
            return c3972ol;
        }
        ResultKt.throwOnFailure(obj);
        C3972ol c3972ol2 = new C3972ol(this.c.f6996a);
        Zk zk = this.c;
        String str = this.d.f6954a;
        this.f6916a = c3972ol2;
        this.b = 1;
        return Zk.a(zk, str, c3972ol2, this) == coroutine_suspended ? coroutine_suspended : c3972ol2;
    }
}
