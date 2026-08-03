package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5026a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.inmobi.ads.rendering.InMobiAdActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(long j, com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = inMobiAdActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.W8(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.W8(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5026a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j = this.b;
            this.f5026a = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c.h;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("EmbeddedBrowser", "Landing page loading timed out after " + this.b + " ms");
        }
        this.c.a("LOADER_TIMEOUT");
        return kotlin.Unit.INSTANCE;
    }
}
