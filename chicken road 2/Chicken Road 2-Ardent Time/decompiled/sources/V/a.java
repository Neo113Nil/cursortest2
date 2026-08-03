package V;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V.b f1744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(V.b bVar, int i2) {
        super(0);
        this.f1743e = i2;
        this.f1744f = bVar;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        switch (this.f1743e) {
            case 0:
                java.lang.Class<?> loadClass = this.f1744f.f1745a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                V.b bVar = this.f1744f;
                java.lang.Class<?> loadClass2 = bVar.f1745a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                kotlin.jvm.internal.i.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                java.lang.reflect.Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                java.lang.Class<?> loadClass3 = bVar.f1745a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.i.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                kotlin.jvm.internal.i.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return java.lang.Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && java.lang.reflect.Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
