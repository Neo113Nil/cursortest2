package X0;

import A0.l;
import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1630b;

    /* renamed from: a, reason: collision with root package name */
    public l f1631a;

    static {
        b bVar = new b();
        bVar.f1631a = null;
        f1630b = bVar;
    }

    public static l a(Context context) {
        l lVar;
        b bVar = f1630b;
        synchronized (bVar) {
            try {
                if (bVar.f1631a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    l lVar2 = new l();
                    lVar2.f72a = context;
                    bVar.f1631a = lVar2;
                }
                lVar = bVar.f1631a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
