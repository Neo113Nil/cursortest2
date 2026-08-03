package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pa extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4893a;
    public final /* synthetic */ com.inmobi.media.Sa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pa(com.inmobi.media.Sa sa, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = sa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Pa(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Pa(this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4893a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Sa sa = this.b;
            sa.getClass();
            sa.b = new com.inmobi.media.C2662p6(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue(), sa, sa.f4953a.getEventConfig(), null);
            com.inmobi.media.Sa sa2 = this.b;
            this.f4893a = 1;
            if (com.inmobi.media.Sa.a(sa2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
