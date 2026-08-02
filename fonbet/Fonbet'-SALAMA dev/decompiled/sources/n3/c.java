package n3;

import android.content.Context;
import n1.C1450e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f15352b;

    /* renamed from: a, reason: collision with root package name */
    public C1450e f15353a;

    static {
        c cVar = new c();
        cVar.f15353a = null;
        f15352b = cVar;
    }

    public static C1450e a(Context context) {
        C1450e c1450e;
        c cVar = f15352b;
        synchronized (cVar) {
            try {
                if (cVar.f15353a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f15353a = new C1450e(context, 17);
                }
                c1450e = cVar.f15353a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1450e;
    }
}
