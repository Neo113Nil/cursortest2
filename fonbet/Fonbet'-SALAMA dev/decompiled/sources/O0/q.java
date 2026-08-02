package O0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4889a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f4890b;

    static {
        a aVar = new a();
        aVar.f4829N = new ArrayList();
        aVar.f4832Q = false;
        aVar.f4833R = 0;
        aVar.f4830O = false;
        aVar.G(new i(2));
        aVar.G(new g());
        aVar.G(new i(1));
        f4889a = new ThreadLocal();
        f4890b = new ArrayList();
    }

    public static r.b a() {
        r.b bVar;
        ThreadLocal threadLocal = f4889a;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (r.b) weakReference.get()) != null) {
            return bVar;
        }
        r.b bVar2 = new r.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
