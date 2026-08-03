package com.inmobi.media;

/* renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2921z3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5581a;
    public final /* synthetic */ com.inmobi.media.V2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2921z3(com.inmobi.media.V2 v2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = v2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2921z3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2921z3(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5581a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Z2 z2 = (com.inmobi.media.Z2) com.inmobi.media.A3.b.getValue();
            com.inmobi.media.V2 v2 = this.b;
            this.f5581a = 1;
            java.lang.Object a2 = com.inmobi.media.C2613n9.a(z2.f5077a, com.ironsource.Y3.d, com.inmobi.media.AbstractC2290b3.a(v2), null, null, this, 28);
            if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = kotlin.Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
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
