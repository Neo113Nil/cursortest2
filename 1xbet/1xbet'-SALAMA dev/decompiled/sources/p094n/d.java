package p094n;

import L.g;
import P6.b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15290c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f15291d = Executors.newFixedThreadPool(4, new c(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Handler f15292e;

    public static Handler Y(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
