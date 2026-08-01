package com.inmobi.media;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class T extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f6861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(V v, Continuation continuation) {
        super(1, continuation);
        this.f6861a = v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new T(this.f6861a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new T(this.f6861a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = AbstractC3784i4.a(new S(this.f6861a));
        V v = this.f6861a;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        if (m8082exceptionOrNullimpl != null) {
            v.a(m8082exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
