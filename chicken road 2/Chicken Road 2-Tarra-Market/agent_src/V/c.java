package V;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f499b;

    /* renamed from: a, reason: collision with root package name */
    public b f500a;

    static {
        c cVar = new c();
        cVar.f500a = null;
        f499b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f499b;
        synchronized (cVar) {
            try {
                if (cVar.f500a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f500a = new b(context);
                }
                bVar = cVar.f500a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
