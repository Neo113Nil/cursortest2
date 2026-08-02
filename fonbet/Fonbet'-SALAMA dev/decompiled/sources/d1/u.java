package d1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import w1.L;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12372a = n.g("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f12372a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            n.d().c(str2, L.i("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                n.d().c(str2, L.i("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.isUsed()) {
            return listenableWorker;
        }
        throw new IllegalStateException(L.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
