package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45566a = o.i("WorkerFactory");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45567b = 0;

    public final n a(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class cls;
        String str2 = f45566a;
        n nVar = null;
        try {
            cls = Class.forName(str).asSubclass(n.class);
        } catch (Throwable th2) {
            o.e().d(str2, "Invalid class: " + str, th2);
            cls = null;
        }
        if (cls != null) {
            try {
                nVar = (n) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                o.e().d(str2, "Could not instantiate " + str, th3);
            }
        }
        if (nVar == null || !nVar.isUsed()) {
            return nVar;
        }
        throw new IllegalStateException(V.e.a("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
