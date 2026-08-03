package com.inmobi.media;

/* renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2933zf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Af f5592a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2933zf(com.inmobi.media.Af af, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5592a = af;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2933zf(this.f5592a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2933zf(this.f5592a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Ig ig = this.f5592a.f4602a;
        java.lang.String value = this.b;
        ig.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("omid_js_string", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.inmobi.media.La la = ig.f4765a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        la.a("omid_js_string", value, false);
        ig.f4765a.a("last_ts", java.lang.System.currentTimeMillis() / 1000, false);
        return kotlin.Unit.INSTANCE;
    }
}
