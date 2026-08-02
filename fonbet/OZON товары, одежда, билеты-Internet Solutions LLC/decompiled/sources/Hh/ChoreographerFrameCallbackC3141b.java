package Hh;

import android.view.Choreographer;

/* renamed from: Hh.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC3141b implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3140a f10989a;

    ChoreographerFrameCallbackC3141b(C3140a c3140a) {
        this.f10989a = c3140a;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        Choreographer choreographer;
        C3140a c3140a = this.f10989a;
        C3140a.f(c3140a, j11);
        choreographer = c3140a.f10961a;
        choreographer.postFrameCallback(this);
        c3140a.f10969i = j11;
    }
}
