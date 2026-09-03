package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements Choreographer.FrameCallback {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h5((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ g5(Runnable runnable) {
        this.b41X89IqSbKt = runnable;
    }
}
