package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3601bj extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3685ej f7032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601bj(C3685ej c3685ej, Continuation continuation) {
        super(1, continuation);
        this.f7032a = c3685ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3601bj(this.f7032a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3601bj(this.f7032a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f7032a.a(true);
        return Unit.INSTANCE;
    }
}
