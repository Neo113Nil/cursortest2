package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ba extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ca f4619a;
    public final /* synthetic */ com.inmobi.media.videoPlayer.model.VideoViewPosition b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(com.inmobi.media.Ca ca, com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4619a = ca;
        this.b = videoViewPosition;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Ba(this.f4619a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Ba) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4619a.f4638a;
        com.inmobi.media.videoPlayer.model.VideoViewPosition newVideoViewPosition = this.b;
        java.lang.String str = this.c;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newVideoViewPosition, "videoViewPosition");
        com.inmobi.media.C2926z8 c2926z8 = gestureDetectorOnGestureListenerC2675pi.Z0;
        if (c2926z8 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
            if (!c2926z8.g.get()) {
                com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.e, com.inmobi.media.EnumC2850w8.f, com.inmobi.media.EnumC2850w8.g};
                com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
                if (com.inmobi.media.C2926z8.a(c2926z8, enumC2850w8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c2926z8.k.a(newVideoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.EnumC2771t8.j, str);
        } else {
            com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.e;
            com.inmobi.media.EnumC2374e8[] enumC2374e8Arr2 = com.inmobi.media.EnumC2374e8.f5173a;
            com.inmobi.media.C2295b8 obj2 = new com.inmobi.media.C2295b8((java.lang.Object) str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC2675pi.a(enumC2771t8, com.inmobi.media.AbstractC2773ta.a(obj2, com.inmobi.media.C2295b8.class));
        }
        return kotlin.Unit.INSTANCE;
    }
}
