package X0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f7438a;

    /* renamed from: b, reason: collision with root package name */
    public final C1719l1 f7439b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.c f7440c;

    public e(ClassLoader classLoader, C1719l1 c1719l1) {
        this.f7438a = classLoader;
        this.f7439b = c1719l1;
        this.f7440c = new u1.c(classLoader, 10);
    }

    public final WindowLayoutComponent a() {
        u1.c cVar = this.f7440c;
        cVar.getClass();
        boolean z4 = false;
        try {
            new T0.a(cVar, 0).invoke();
            if (p3.f.c0("WindowExtensionsProvider#getWindowExtensions is not valid", new T0.a(cVar, 1)) && p3.f.c0("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && p3.f.c0("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = U0.e.a();
                if (a2 == 1) {
                    z4 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (p3.f.c0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z4 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z4) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return p3.f.c0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
