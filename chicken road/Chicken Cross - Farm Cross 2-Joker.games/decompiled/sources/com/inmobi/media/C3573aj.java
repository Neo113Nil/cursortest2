package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3573aj extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3685ej f7014a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3573aj(C3685ej c3685ej, Continuation continuation) {
        super(1, continuation);
        this.f7014a = c3685ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3573aj(this.f7014a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3573aj(this.f7014a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int andIncrement = this.f7014a.k.getAndIncrement();
        this.f7014a.getClass();
        String str = "saving checkpoint - " + (andIncrement + 1);
        this.f7014a.a(false);
        return Unit.INSTANCE;
    }
}
