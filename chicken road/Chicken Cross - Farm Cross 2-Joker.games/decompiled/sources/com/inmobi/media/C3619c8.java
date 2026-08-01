package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.U3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3619c8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7043a;
    public final /* synthetic */ L8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619c8(Continuation continuation, C4043r8 c4043r8, L8 l8) {
        super(2, continuation);
        this.f7043a = c4043r8;
        this.b = l8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3619c8(continuation, this.f7043a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3619c8((Continuation) obj2, this.f7043a, this.b).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f7043a.j.set(Kh.c);
        this.f7043a.n.seekTo(0L);
        U8 u8 = this.f7043a.z;
        if (!u8.g && (surface = u8.e) != null) {
            u8.g = true;
            u8.b.setVideoSurface(surface);
        }
        C4043r8 c4043r8 = this.f7043a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.b.b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.b.f6691a);
        htmlVideoPlaybackState.setLatency(Boxing.boxLong(System.currentTimeMillis() - this.f7043a.s));
        htmlVideoPlaybackState.setMuted(this.f7043a.y.e);
        P8[] p8Arr = P8.f6778a;
        htmlVideoPlaybackState.setState(U3.i.s);
        htmlVideoPlaybackState.setTime(this.f7043a.n.getCurrentPosition() / 1000.0f);
        c4043r8.a(new M8(htmlVideoPlaybackState, this.b.c));
        return Unit.INSTANCE;
    }
}
