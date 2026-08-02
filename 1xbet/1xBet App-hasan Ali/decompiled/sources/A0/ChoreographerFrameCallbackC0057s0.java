package A0;

import android.view.Choreographer;
import p4.C2268h;

/* renamed from: A0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0057s0 implements Choreographer.FrameCallback {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2268h f573k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.c f574l;

    public ChoreographerFrameCallbackC0057s0(C2268h c2268h, C0059t0 c0059t0, i4.c cVar) {
        this.f573k = c2268h;
        this.f574l = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Object p5;
        try {
            p5 = this.f574l.c(Long.valueOf(j5));
        } catch (Throwable th) {
            p5 = G4.l.p(th);
        }
        this.f573k.resumeWith(p5);
    }
}
