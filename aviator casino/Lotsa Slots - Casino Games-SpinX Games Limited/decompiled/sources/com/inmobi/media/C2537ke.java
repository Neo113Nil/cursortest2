package com.inmobi.media;

/* renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2537ke extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Be f5295a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2537ke(com.inmobi.media.Be be, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5295a = be;
    }

    public static final kotlin.Unit a(com.inmobi.media.Be be, short s) {
        com.inmobi.media.InterfaceC2772t9 l = be.l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "onAssetClickEvent " + ((int) s));
        }
        ((com.inmobi.media.C2274ad) be.b.m.getValue()).a(s);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2537ke(this.f5295a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2537ke(this.f5295a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2358dh c2358dh = (com.inmobi.media.C2358dh) this.f5295a.b.o.getValue();
        final com.inmobi.media.Be be = this.f5295a;
        com.inmobi.media.C2304bh c2304bh = be.b.c;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.ke$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.inmobi.media.C2537ke.a(com.inmobi.media.Be.this, ((java.lang.Short) obj2).shortValue());
            }
        };
        c2358dh.getClass();
        com.inmobi.media.C2358dh.a(c2304bh, function1);
        return kotlin.Unit.INSTANCE;
    }
}
