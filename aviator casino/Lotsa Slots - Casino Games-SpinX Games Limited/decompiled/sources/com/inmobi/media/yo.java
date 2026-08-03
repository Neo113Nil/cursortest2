package com.inmobi.media;

/* loaded from: classes5.dex */
public final class yo extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5578a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(java.lang.String str, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = interfaceC2772t9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.yo(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.yo(this.b, this.c, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5578a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Ao ao = com.inmobi.media.Ao.f4610a;
        java.lang.String str = this.b;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        this.f5578a = 1;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(com.inmobi.media.H9.d, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new com.inmobi.media.C2866wo(str, interfaceC2772t9, null), 1, null);
        return async$default == coroutine_suspended ? coroutine_suspended : async$default;
    }
}
