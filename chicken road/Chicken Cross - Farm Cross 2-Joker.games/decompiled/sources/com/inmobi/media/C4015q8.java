package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.q8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4015q8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7321a;
    public final /* synthetic */ VideoViewPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4015q8(Continuation continuation, C4043r8 c4043r8, VideoViewPosition videoViewPosition) {
        super(2, continuation);
        this.f7321a = c4043r8;
        this.b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4015q8(continuation, this.f7321a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4015q8((Continuation) obj2, this.f7321a, this.b).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TransitionManager.beginDelayedTransition(this.f7321a.l);
        this.f7321a.e.setVideoViewPosition(this.b);
        int b = (int) (AbstractC3841k6.b() * this.b.getWidth());
        int b2 = (int) (AbstractC3841k6.b() * this.b.getHeight());
        C8 c8 = this.f7321a.l;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
        if (this.f7321a.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (AbstractC3841k6.b() * this.b.getX()), (int) (AbstractC3841k6.b() * this.b.getY()), 0, 0);
        }
        c8.setLayoutParams(layoutParams);
        this.f7321a.l.requestLayout();
        return Unit.INSTANCE;
    }
}
