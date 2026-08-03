package com.inmobi.media;

/* renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2878xa extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ca f5547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2878xa(com.inmobi.media.Ca ca, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5547a = ca;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2878xa(this.f5547a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2878xa(this.f5547a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5547a.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "destroyVideoPlayer is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5547a.f4638a;
        gestureDetectorOnGestureListenerC2675pi.b1 = null;
        com.inmobi.media.C2926z8 c2926z8 = gestureDetectorOnGestureListenerC2675pi.Z0;
        if (c2926z8 != null) {
            c2926z8.a();
        }
        return kotlin.Unit.INSTANCE;
    }
}
