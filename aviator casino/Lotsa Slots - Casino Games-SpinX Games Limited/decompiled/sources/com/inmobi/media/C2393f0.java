package com.inmobi.media;

/* renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2393f0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2576m0 f5189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2393f0(com.inmobi.media.C2576m0 c2576m0, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5189a = c2576m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2393f0(this.f5189a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2393f0(this.f5189a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.f5189a.b);
        a2.put("networkType", com.inmobi.media.B5.o());
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdLoadCalled", a2, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }
}
