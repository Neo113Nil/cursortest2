package com.inmobi.media;

/* renamed from: com.inmobi.media.ol, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2651ol extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5378a;

    public C2651ol(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2651ol(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2651ol((kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5378a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String b = com.inmobi.media.Xi.b();
            if (b == null) {
                return kotlin.Unit.INSTANCE;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(b, com.inmobi.media.Xi.c)) {
                com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                this.f5378a = 1;
                java.lang.Object a2 = com.inmobi.media.C2613n9.a(((com.inmobi.media.C2370e4) com.inmobi.media.AbstractC2318c4.f5134a.b.b.getValue()).f5169a, "config_db", null, this, 6);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
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
