package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements R4.a<a> {

    public static class a {
    }

    @Override // R4.a
    @NonNull
    public final List<Class<? extends R4.a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // R4.a
    @NonNull
    public final a create(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: H4.b
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                ProfileInstallerInitializer.this.getClass();
                Handler createAsync = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                final Context context2 = applicationContext;
                createAsync.postDelayed(new Runnable() { // from class: H4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new d(context2, 0));
                    }
                }, nextInt + 5000);
            }
        });
        return new a();
    }
}
