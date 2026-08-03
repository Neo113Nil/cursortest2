package com.inmobi.media;

/* loaded from: classes5.dex */
public final class D7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4656a;
    public final /* synthetic */ com.inmobi.media.C2505j8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7, com.inmobi.media.C2505j8 c2505j8) {
        super(2, continuation);
        this.f4656a = r7;
        this.b = c2505j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.D7(continuation, this.f4656a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.D7((kotlin.coroutines.Continuation) obj2, this.f4656a, this.b).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.Surface surface;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f4656a.l.set(com.inmobi.media.Bg.c);
        this.f4656a.p.seekTo(0L);
        com.inmobi.media.C2742s8 c2742s8 = this.f4656a.z;
        if (!c2742s8.g && (surface = c2742s8.e) != null) {
            c2742s8.g = true;
            c2742s8.b.setVideoSurface(surface);
        }
        com.inmobi.media.R7 r7 = this.f4656a;
        com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState htmlVideoPlaybackState = new com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.b.b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.b.f5274a);
        htmlVideoPlaybackState.setLatency(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis() - this.f4656a.u));
        htmlVideoPlaybackState.setMuted(this.f4656a.y.e);
        com.inmobi.media.EnumC2612n8[] enumC2612n8Arr = com.inmobi.media.EnumC2612n8.f5353a;
        htmlVideoPlaybackState.setState(com.ironsource.X3.i.s);
        htmlVideoPlaybackState.setTime(this.f4656a.p.getCurrentPosition() / 1000.0f);
        r7.a(new com.inmobi.media.C2531k8(htmlVideoPlaybackState, this.b.c));
        return kotlin.Unit.INSTANCE;
    }
}
