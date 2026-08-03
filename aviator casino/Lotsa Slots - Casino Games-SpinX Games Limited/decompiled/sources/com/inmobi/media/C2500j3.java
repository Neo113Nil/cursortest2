package com.inmobi.media;

/* renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2500j3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5269a;
    public final /* synthetic */ com.inmobi.media.HandlerC2526k3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2500j3(com.inmobi.media.HandlerC2526k3 handlerC2526k3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = handlerC2526k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2500j3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2500j3(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5269a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Z2 z2 = (com.inmobi.media.Z2) com.inmobi.media.A3.b.getValue();
            this.f5269a = 1;
            obj = z2.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b.sendMessage(obtain));
        }
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        com.inmobi.media.A3.g.set(false);
        return kotlin.Unit.INSTANCE;
    }
}
