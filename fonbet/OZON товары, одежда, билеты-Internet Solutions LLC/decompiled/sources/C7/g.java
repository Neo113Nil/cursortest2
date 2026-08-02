package C7;

import android.content.Context;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static e f4435a;

    static synchronized e a(Context context) {
        e eVar;
        synchronized (g.class) {
            try {
                if (f4435a == null) {
                    f fVar = new f();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    fVar.b(new m(context));
                    f4435a = fVar.a();
                }
                eVar = f4435a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }
}
