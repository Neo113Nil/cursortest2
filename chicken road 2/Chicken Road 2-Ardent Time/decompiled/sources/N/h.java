package N;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(final java.lang.Runnable runnable) {
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: N.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
