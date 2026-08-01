package sg.bigo.ads.v1;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import sg.bigo.ads.q0.ThreadFactoryC5440d;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f13361a = Executors.newFixedThreadPool(1, new ThreadFactoryC5440d("Stat-Worker", false));
    public static final Handler b;

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
    }
}
