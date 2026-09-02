package w;

import android.app.Activity;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import x.C0858c;
import x.C0859d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f6744a;

    public C0859d a(Object obj, e eVar, Activity activity, C.b bVar) {
        C0858c c0858c = new C0858c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f6744a, new Class[]{b()}, c0858c);
        j.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new C0859d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f6744a.loadClass("java.util.function.Consumer");
        j.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
