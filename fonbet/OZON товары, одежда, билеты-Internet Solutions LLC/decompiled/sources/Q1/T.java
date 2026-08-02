package Q1;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f22861a;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f22861a.postFrameCallback(new Choreographer.FrameCallback() { // from class: Q1.U
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                runnable.run();
            }
        });
    }
}
