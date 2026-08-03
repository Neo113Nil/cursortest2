package com.inmobi.media;

/* renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2623nj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5359a;

    public C2623nj(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2623nj(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2623nj((kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5359a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.media.AbstractC2676pj.b, "access$getTAG$p(...)");
            com.inmobi.media.C2386ej c2386ej = com.inmobi.media.C2386ej.f5183a;
            boolean sessionEnabled = com.inmobi.media.AbstractC2676pj.a().getSessionEnabled();
            c2386ej.getClass();
            com.inmobi.media.C2386ej.e = sessionEnabled;
            if (!sessionEnabled) {
                com.inmobi.media.C2386ej.d = null;
            }
            com.inmobi.media.C2386ej.c();
            if (com.inmobi.media.Xi.b() == null || com.inmobi.media.AbstractC2676pj.a().getLocationEnabled()) {
                com.inmobi.media.C2801ub c2801ub = com.inmobi.media.C2801ub.f5486a;
                this.f5359a = 1;
                if (c2801ub.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
