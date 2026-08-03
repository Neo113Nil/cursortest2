package com.inmobi.media;

/* renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2852wa extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ca f5525a;
    public final /* synthetic */ com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2852wa(com.inmobi.media.Ca ca, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest htmlVideoPlayerRequest, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5525a = ca;
        this.b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2852wa(this.f5525a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2852wa(this.f5525a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5525a.f4638a;
        com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest obj2 = this.b;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "requestConfig");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC2675pi.getAdConfig().getHybridNative().getIsEnabled()) {
            java.lang.String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC2675pi.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            com.inmobi.media.C2936zi c2936zi = gestureDetectorOnGestureListenerC2675pi.e0;
            try {
                com.inmobi.media.AbstractC2520jn.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC2675pi.a1 = true;
                gestureDetectorOnGestureListenerC2675pi.Z0 = new com.inmobi.media.C2926z8(gestureDetectorOnGestureListenerC2675pi, gestureDetectorOnGestureListenerC2675pi.getAdConfig().getHybridNative(), obj2, gestureDetectorOnGestureListenerC2675pi.b1, gestureDetectorOnGestureListenerC2675pi.e0, gestureDetectorOnGestureListenerC2675pi.i);
                com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
                gestureDetectorOnGestureListenerC2675pi.a(enumC2771t8, com.inmobi.media.AbstractC2773ta.a(obj2, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest.class));
                com.inmobi.media.C2926z8 c2926z8 = gestureDetectorOnGestureListenerC2675pi.Z0;
                if (c2926z8 != null) {
                    com.inmobi.media.C2464hi videoLoadListener = new com.inmobi.media.C2464hi(gestureDetectorOnGestureListenerC2675pi);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
                    if (!c2926z8.g.get()) {
                        com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest obj3 = c2926z8.f5586a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "obj");
                        java.lang.String valueOf = java.lang.String.valueOf(com.inmobi.media.AbstractC2773ta.a(obj3, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest.class));
                        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.f5524a};
                        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
                        if (c2926z8.a(enumC2850w8Arr, "createVideoPlayer", valueOf, com.inmobi.media.EnumC2850w8.b)) {
                            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2926z8.c;
                            if (interfaceC2772t92 != null) {
                                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            c2926z8.m = videoLoadListener;
                            if (c2926z8.f == null) {
                                c2926z8.f = kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(c2926z8.k.C, new com.inmobi.media.C2876x8(c2926z8, null)), c2926z8.e);
                            }
                            com.inmobi.media.R7 r7 = c2926z8.k;
                            if (!r7.h.get()) {
                                r7.a(new com.inmobi.media.C2454h8(r7.f4933a));
                                if (r7.b() == com.inmobi.media.Bg.f4624a) {
                                    r7.l.set(com.inmobi.media.Bg.b);
                                    r7.s.clear();
                                    r7.s.addAll(r7.f4933a.getVideoFiles());
                                    java.util.List list = r7.s;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((com.inmobi.media.videoPlayer.model.HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        r7.a(new com.inmobi.media.C2428g8(com.inmobi.media.Rm.e));
                                    } else {
                                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.c, null, null, new com.inmobi.media.G7(r7, arrayList, null), 3, null);
                                        r7.v = launch$default;
                                    }
                                } else {
                                    r7.a(new com.inmobi.media.C2428g8(com.inmobi.media.Rm.f));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC2675pi.getViewableAd();
            } catch (com.inmobi.media.Ag e) {
                if (c2936zi != null) {
                    c2936zi.a(e.f4603a);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr2 = com.inmobi.media.EnumC2374e8.f5173a;
        jSONObject.put("jsCommand", "createVideoPlayer");
        gestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.EnumC2771t8.e, jSONObject);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).b("HtmlVideoPlayer", "Cannot play hybrid video");
        }
        return kotlin.Unit.INSTANCE;
    }
}
