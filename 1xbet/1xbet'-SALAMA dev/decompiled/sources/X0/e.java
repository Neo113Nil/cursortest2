package X0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f7438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1010l1 f7439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p145u1.c f7440c;

    public e(ClassLoader classLoader, C1010l1 c1010l1) {
        this.f7438a = classLoader;
        this.f7439b = c1010l1;
        this.f7440c = new p145u1.c(classLoader, 10);
    }

    public final WindowLayoutComponent a() {
        p145u1.c cVar = this.f7440c;
        cVar.getClass();
        boolean zB = false;
        try {
            new T0.a(cVar, 0).invoke();
            if (p113p3.f.c0("WindowExtensionsProvider#getWindowExtensions is not valid", new T0.a(cVar, 1)) && p113p3.f.c0("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && p113p3.f.c0("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = U0.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (p113p3.f.c0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return p113p3.f.c0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
