package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements Executor {
    public final /* synthetic */ Choreographer oyjLVtGms9eZwJ0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.oyjLVtGms9eZwJ0.postFrameCallback(new g5(runnable));
    }
}
