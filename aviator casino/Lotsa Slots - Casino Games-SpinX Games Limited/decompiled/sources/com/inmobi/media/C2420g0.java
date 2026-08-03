package com.inmobi.media;

/* renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2420g0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2576m0 f5208a;
    public final /* synthetic */ short b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2420g0(com.inmobi.media.C2576m0 c2576m0, short s, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5208a = c2576m0;
        this.b = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2420g0(this.f5208a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2420g0(this.f5208a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.f5208a.b);
        a2.put("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxShort(this.b));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdLoadDroppedAtSDK", a2, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }
}
