package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4014q7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7320a;
    public final /* synthetic */ AbstractC4070s7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4014q7(AbstractC4070s7 abstractC4070s7, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC4070s7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4014q7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4014q7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7320a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C3554a0 c3554a0 = this.b.n;
        this.f7320a = 1;
        Object a2 = c3554a0.a(this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
