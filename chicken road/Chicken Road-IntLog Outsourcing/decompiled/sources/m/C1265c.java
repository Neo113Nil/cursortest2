package m;

import A.d;
import a.AbstractC0169a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265c extends AbstractC0169a {

    /* renamed from: g, reason: collision with root package name */
    public final Object f11085g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f11086h = Executors.newFixedThreadPool(4, new ThreadFactoryC1264b());

    /* renamed from: i, reason: collision with root package name */
    public volatile Handler f11087i;

    public static Handler U(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.b(looper);
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
