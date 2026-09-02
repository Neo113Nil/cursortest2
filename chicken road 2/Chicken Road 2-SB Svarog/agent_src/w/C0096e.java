package w;

import a.AbstractC0018a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import s.C0089a;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f1292b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f1293c;

    public C0096e(ClassLoader classLoader, s.b bVar) {
        this.f1291a = classLoader;
        this.f1292b = bVar;
        this.f1293c = new s.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        s.b bVar = this.f1293c;
        bVar.getClass();
        boolean z2 = false;
        try {
            g0.h.d(bVar.f1207a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0018a.E("WindowExtensionsProvider#getWindowExtensions is not valid", new C0089a(0, bVar)) && AbstractC0018a.E("WindowExtensions#getWindowLayoutComponent is not valid", new C0095d(this, 3)) && AbstractC0018a.E("FoldingFeature class is not valid", new C0095d(this, 0))) {
                int a2 = t.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0018a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0095d(this, 2))) {
                        z2 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0018a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0095d(this, 1));
    }
}
