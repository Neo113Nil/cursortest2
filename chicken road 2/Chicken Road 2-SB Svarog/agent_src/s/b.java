package s;

import android.app.Activity;
import g0.e;
import g0.h;
import java.lang.reflect.Proxy;
import t.c;
import t.d;
import y.C0101b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1207a;

    public d a(Object obj, e eVar, Activity activity, C0101b c0101b) {
        c cVar = new c(eVar, c0101b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f1207a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1207a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
