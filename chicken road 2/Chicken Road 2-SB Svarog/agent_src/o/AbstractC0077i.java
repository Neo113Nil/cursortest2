package o;

import android.view.Choreographer;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0077i {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
