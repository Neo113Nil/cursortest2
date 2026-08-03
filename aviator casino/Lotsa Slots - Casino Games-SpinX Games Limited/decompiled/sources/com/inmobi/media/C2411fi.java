package com.inmobi.media;

/* renamed from: com.inmobi.media.fi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2411fi extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5203a;
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2411fi(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str, long j, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = gestureDetectorOnGestureListenerC2675pi;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2411fi c2411fi = new com.inmobi.media.C2411fi(this.b, this.c, this.d, this.e, continuation);
        c2411fi.f5203a = obj;
        return c2411fi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2411fi) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.f5203a;
        if (this.b.N.get() || !kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b.i;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "Skipping loadHtmlUrl, RenderView destroyed");
            }
            return kotlin.Unit.INSTANCE;
        }
        java.lang.String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b.i;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str3, "Prefetch empty/failed, signaling ad load failure");
            }
            com.inmobi.media.C2936zi renderViewTelemetry = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(this.d, kotlin.coroutines.jvm.internal.Boxing.boxShort((short) this.e));
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.b;
            int i = this.e;
            gestureDetectorOnGestureListenerC2675pi.getClass();
            gestureDetectorOnGestureListenerC2675pi.d(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.d(i));
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.b.i;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "Prefetch succeeded, loading HTML content in WebView");
            }
            com.inmobi.media.C2936zi renderViewTelemetry2 = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry2 != null) {
                renderViewTelemetry2.a(this.d, (java.lang.Short) null);
            }
            this.b.i(this.c);
        }
        return kotlin.Unit.INSTANCE;
    }
}
