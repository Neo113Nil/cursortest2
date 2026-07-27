package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class U6 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6884a;
    public final /* synthetic */ V6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v6, Continuation continuation) {
        super(1, continuation);
        this.b = v6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new U6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new U6(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6884a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                V6 v6 = this.b;
                this.f6884a = 1;
                if (V6.a(v6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            String str = "Progress poll exception: " + e;
        }
        return Unit.INSTANCE;
    }
}
