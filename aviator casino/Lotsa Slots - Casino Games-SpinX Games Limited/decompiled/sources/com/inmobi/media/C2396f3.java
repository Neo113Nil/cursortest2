package com.inmobi.media;

/* renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2396f3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5191a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.V2 c;
    public final /* synthetic */ com.inmobi.media.HandlerC2526k3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2396f3(com.inmobi.media.V2 v2, com.inmobi.media.HandlerC2526k3 handlerC2526k3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = v2;
        this.d = handlerC2526k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2396f3 c2396f3 = new com.inmobi.media.C2396f3(this.c, this.d, continuation);
        c2396f3.b = obj;
        return c2396f3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2396f3) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5191a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            com.inmobi.media.C2633o3 c2633o3 = new com.inmobi.media.C2633o3();
            com.inmobi.media.V2 v2 = this.c;
            this.b = coroutineScope;
            this.f5191a = 1;
            obj = c2633o3.a(v2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((com.inmobi.media.EnumC2372e6) obj) != null) {
            com.inmobi.media.HandlerC2526k3 handlerC2526k3 = this.d;
            com.inmobi.media.V2 v22 = this.c;
            int i2 = com.inmobi.media.HandlerC2526k3.f5285a;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 4;
            obtain.obj = v22;
            handlerC2526k3.sendMessage(obtain);
        } else {
            com.inmobi.media.V2 v23 = this.c;
            com.inmobi.media.HandlerC2526k3 handlerC2526k32 = this.d;
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
            java.lang.String str = v23.b;
            com.inmobi.media.A3.b(v23);
            int i3 = com.inmobi.media.HandlerC2526k3.f5285a;
            handlerC2526k32.b(v23);
        }
        return kotlin.Unit.INSTANCE;
    }
}
