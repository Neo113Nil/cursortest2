package androidx.profileinstaller;

import Z1.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import j3.i;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // Z1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // Z1.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new i(29);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: Q1.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                ProfileInstallerInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new i(29);
    }
}
