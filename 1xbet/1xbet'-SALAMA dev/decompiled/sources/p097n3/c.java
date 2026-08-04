package p097n3;

import android.content.Context;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f15358b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f15359a;

    static {
        c cVar = new c();
        cVar.f15359a = null;
        f15358b = cVar;
    }

    public static e a(Context context) {
        e eVar;
        c cVar = f15358b;
        synchronized (cVar) {
            try {
                if (cVar.f15359a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f15359a = new e(context, 17);
                }
                eVar = cVar.f15359a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
