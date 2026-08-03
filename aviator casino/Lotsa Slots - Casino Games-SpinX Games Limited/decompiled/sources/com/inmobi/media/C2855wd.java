package com.inmobi.media;

/* renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2855wd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2881xd f5528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2855wd(com.inmobi.media.C2881xd c2881xd, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5528a = c2881xd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2855wd(this.f5528a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2855wd(this.f5528a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 l = this.f5528a.l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        com.inmobi.media.C2881xd c2881xd = this.f5528a;
        com.inmobi.media.Pc pc = c2881xd.i;
        com.inmobi.media.C2511je c2511je = c2881xd.f;
        com.inmobi.media.G g = c2881xd.f5559a.b;
        pc.a(c2511je, new com.inmobi.ads.AdMetaInfo(g.e, g.l));
        return kotlin.Unit.INSTANCE;
    }
}
