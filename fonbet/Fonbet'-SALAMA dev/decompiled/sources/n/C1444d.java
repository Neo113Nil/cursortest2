package n;

import L.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1444d extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f15284c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f15285d = Executors.newFixedThreadPool(4, new ThreadFactoryC1443c(0));

    /* renamed from: e, reason: collision with root package name */
    public volatile Handler f15286e;

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
