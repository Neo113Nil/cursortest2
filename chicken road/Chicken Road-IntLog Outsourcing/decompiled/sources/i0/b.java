package i0;

import android.app.Activity;
import j0.c;
import j0.d;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.i;
import o0.C1355b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f5831a;

    public d a(Object obj, kotlin.jvm.internal.d dVar, Activity activity, C1355b c1355b) {
        c cVar = new c(dVar, c1355b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f5831a, new Class[]{b()}, cVar);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f5831a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
