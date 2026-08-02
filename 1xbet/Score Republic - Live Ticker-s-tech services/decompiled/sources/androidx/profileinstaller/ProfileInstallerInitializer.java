package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p000.td0;
import p000.u90;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements td0 {
    @Override // p000.td0
    /* JADX INFO: renamed from: a */
    public final List mo413a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.td0
    /* JADX INFO: renamed from: b */
    public final Object mo414b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: mx0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new RunnableC0126d5(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new u90(10);
    }
}
