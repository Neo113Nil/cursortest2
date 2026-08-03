package com.inmobi.media;

/* renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2446h0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f5229a;
    public final /* synthetic */ com.inmobi.media.C2576m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446h0(com.inmobi.media.C2576m0 c2576m0, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5229a = map;
        this.b = c2576m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2446h0(this.b, this.f5229a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = this.f5229a;
        return new com.inmobi.media.C2446h0(this.b, map, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        long elapsedRealtime;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object obj2 = this.f5229a.get("errorCode");
        java.lang.Short sh = obj2 instanceof java.lang.Short ? (java.lang.Short) obj2 : null;
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.b.b);
        com.inmobi.media.C2576m0 c2576m0 = this.b;
        if (sh != null && sh.shortValue() == 2138) {
            j = c2576m0.c.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        } else if ((sh == null || sh.shortValue() != 2139) && (sh == null || sh.shortValue() != 2203)) {
            j = c2576m0.c.f5131a;
            kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        } else {
            j = c2576m0.c.e;
            kotlinx.coroutines.CoroutineScope coroutineScope3 = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        a2.put("latency", kotlin.coroutines.jvm.internal.Boxing.boxLong(elapsedRealtime - j));
        a2.putAll(this.f5229a);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdLoadFailed", a2, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }
}
