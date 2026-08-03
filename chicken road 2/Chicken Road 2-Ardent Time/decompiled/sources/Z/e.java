package Z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f1849a;

    /* renamed from: b, reason: collision with root package name */
    public final V.b f1850b;

    /* renamed from: c, reason: collision with root package name */
    public final V.b f1851c;

    public e(java.lang.ClassLoader classLoader, V.b bVar) {
        this.f1849a = classLoader;
        this.f1850b = bVar;
        this.f1851c = new V.b(classLoader);
    }

    public final androidx.window.extensions.layout.WindowLayoutComponent a() {
        V.b bVar = this.f1851c;
        bVar.getClass();
        boolean z2 = false;
        try {
            new V.a(bVar, 0).invoke();
            if (a.AbstractC0059a.B("WindowExtensionsProvider#getWindowExtensions is not valid", new V.a(bVar, 1)) && a.AbstractC0059a.B("WindowExtensions#getWindowLayoutComponent is not valid", new Z.d(this, 3)) && a.AbstractC0059a.B("FoldingFeature class is not valid", new Z.d(this, 0))) {
                int a2 = W.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (a.AbstractC0059a.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.content.Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new Z.d(this, 2))) {
                        z2 = true;
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (java.lang.UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return a.AbstractC0059a.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.app.Activity.class.getName() + ", java.util.function.Consumer) is not valid", new Z.d(this, 1));
    }
}
