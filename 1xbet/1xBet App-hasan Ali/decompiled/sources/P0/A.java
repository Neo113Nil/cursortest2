package P0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Choreographer f4614k;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f4614k.postFrameCallback(new Choreographer.FrameCallback() { // from class: P0.B
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                runnable.run();
            }
        });
    }
}
