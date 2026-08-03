package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Q7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4911a;
    public final /* synthetic */ com.inmobi.media.videoPlayer.model.VideoViewPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7, com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition) {
        super(2, continuation);
        this.f4911a = r7;
        this.b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Q7(continuation, this.f4911a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Q7((kotlin.coroutines.Continuation) obj2, this.f4911a, this.b).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.transition.TransitionManager.beginDelayedTransition(this.f4911a.n);
        this.f4911a.e.setVideoViewPosition(this.b);
        int b = (int) (com.inmobi.media.N5.b() * this.b.getWidth());
        int b2 = (int) (com.inmobi.media.N5.b() * this.b.getHeight());
        com.inmobi.media.G1 g1 = this.f4911a.n;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(b, b2);
        if (this.f4911a.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (com.inmobi.media.N5.b() * this.b.getX()), (int) (com.inmobi.media.N5.b() * this.b.getY()), 0, 0);
        }
        g1.setLayoutParams(layoutParams);
        if (this.f4911a.i > 0 && this.f4911a.j > 0) {
            com.inmobi.media.R7 r7 = this.f4911a;
            com.inmobi.media.G1 g12 = r7.n;
            int i = r7.i;
            int i2 = this.f4911a.j;
            g12.getClass();
            if (i > 0 && i2 > 0) {
                g12.f4716a = i / i2;
                g12.requestLayout();
            }
        }
        this.f4911a.n.requestLayout();
        return kotlin.Unit.INSTANCE;
    }
}
