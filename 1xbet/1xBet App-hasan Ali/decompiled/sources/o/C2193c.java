package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d1.i;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r3.AbstractC2349a;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2193c extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f18499n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final ExecutorService f18500o = Executors.newFixedThreadPool(4, new ThreadFactoryC2192b(0));

    /* renamed from: p, reason: collision with root package name */
    public volatile Handler f18501p;

    public static Handler Q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i.b(looper);
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
