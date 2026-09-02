package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0075g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1039c;

    public /* synthetic */ RunnableC0075g(Context context, int i2) {
        this.f1038b = i2;
        this.f1039c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1038b) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0079k.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0075g(this.f1039c, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0075g(this.f1039c, 2));
                break;
            default:
                AbstractC0074f.s(this.f1039c, new ExecutorC0072d(), AbstractC0074f.f1028a, false);
                break;
        }
    }

    public /* synthetic */ RunnableC0075g(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1038b = 0;
        this.f1039c = context;
    }
}
