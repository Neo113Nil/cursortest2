package com.inmobi.media;

/* renamed from: com.inmobi.media.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2523k0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2576m0 f5282a;
    public final /* synthetic */ java.util.Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523k0(com.inmobi.media.C2576m0 c2576m0, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5282a = c2576m0;
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2523k0(this.f5282a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2523k0(this.f5282a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.f5282a.b);
        long j = this.f5282a.c.b;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        a2.put("latency", kotlin.coroutines.jvm.internal.Boxing.boxLong(android.os.SystemClock.elapsedRealtime() - j));
        a2.put("networkType", com.inmobi.media.B5.o());
        a2.putAll(this.b);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("ServerFill", a2, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }
}
