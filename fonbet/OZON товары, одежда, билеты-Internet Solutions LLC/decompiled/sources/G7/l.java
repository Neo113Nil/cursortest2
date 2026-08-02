package G7;

import android.content.Context;

/* loaded from: classes9.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static k f9741a;

    static synchronized k a(Context context) {
        k kVar;
        synchronized (l.class) {
            try {
                if (f9741a == null) {
                    j jVar = new j();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    jVar.a(context);
                    f9741a = jVar.b();
                }
                kVar = f9741a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
