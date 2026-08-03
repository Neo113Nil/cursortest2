package com.inmobi.media;

/* renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2876x8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5545a;
    public final /* synthetic */ com.inmobi.media.C2926z8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876x8(com.inmobi.media.C2926z8 c2926z8, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2926z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2876x8 c2876x8 = new com.inmobi.media.C2876x8(this.b, continuation);
        c2876x8.f5545a = obj;
        return c2876x8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2876x8 c2876x8 = new com.inmobi.media.C2876x8(this.b, (kotlin.coroutines.Continuation) obj2);
        c2876x8.f5545a = (com.inmobi.media.AbstractC2493im) obj;
        return c2876x8.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.AbstractC2493im mediaEvent = (com.inmobi.media.AbstractC2493im) this.f5545a;
        this.b.a(mediaEvent);
        com.inmobi.media.C2936zi c2936zi = this.b.b;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof com.inmobi.media.C2454h8) {
                com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((com.inmobi.media.C2454h8) mediaEvent).f5236a;
                java.util.Map a2 = c2936zi.a();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                a2.put("payload", jSONObject.toString());
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoLoadStarted", a2, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.C2531k8) {
                com.inmobi.media.C2531k8 c2531k8 = (com.inmobi.media.C2531k8) mediaEvent;
                java.util.Map a3 = c2936zi.a();
                java.lang.Long latency = c2531k8.f5290a.getLatency();
                a3.put("latency", java.lang.Long.valueOf(latency != null ? latency.longValue() : -1L));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("videoUrl", c2531k8.f5290a.getVideoUrl());
                jSONObject2.put("cacheProgress", c2531k8.b);
                a3.put("payload", jSONObject2.toString());
                com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoLoadSuccess", a3, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.Bn) {
                java.util.Map a4 = c2936zi.a();
                com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoStart", a4, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.Om) {
                java.util.Map a5 = c2936zi.a();
                com.inmobi.media.C2624nk c2624nk4 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoFirstQuartile", a5, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.C2941zn) {
                java.util.Map a6 = c2936zi.a();
                com.inmobi.media.C2624nk c2624nk5 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoSecondQuartile", a6, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.In) {
                java.util.Map a7 = c2936zi.a();
                com.inmobi.media.C2624nk c2624nk6 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoThirdQuartile", a7, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.C2442gm) {
                java.util.Map a8 = c2936zi.a();
                com.inmobi.media.C2624nk c2624nk7 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoComplete", a8, com.inmobi.media.EnumC2728rk.f5431a);
            } else if (mediaEvent instanceof com.inmobi.media.C2401f8) {
                com.inmobi.media.C2401f8 c2401f8 = (com.inmobi.media.C2401f8) mediaEvent;
                java.util.Map a9 = c2936zi.a();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("videoUrls", c2401f8.f5195a.getVideoFiles());
                a9.put("payload", jSONObject3.toString());
                a9.put("errorCode", java.lang.Short.valueOf(c2401f8.b));
                com.inmobi.media.C2624nk c2624nk8 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoLoadFailure", a9, com.inmobi.media.EnumC2728rk.f5431a);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
