package V;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f1745a;

    public W.d a(java.lang.Object obj, kotlin.jvm.internal.d dVar, android.app.Activity activity, b0.C0092b c0092b) {
        W.c cVar = new W.c(dVar, c0092b);
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.f1745a, new java.lang.Class[]{b()}, cVar);
        kotlin.jvm.internal.i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", android.app.Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new W.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public java.lang.Class b() {
        java.lang.Class<?> loadClass = this.f1745a.loadClass("java.util.function.Consumer");
        kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
