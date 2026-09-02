package A;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import w.C0854a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f15a;

    /* renamed from: b, reason: collision with root package name */
    public final w.b f16b;

    /* renamed from: c, reason: collision with root package name */
    public final w.b f17c;

    public e(ClassLoader classLoader, w.b bVar) {
        this.f15a = classLoader;
        this.f16b = bVar;
        this.f17c = new w.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        w.b bVar = this.f17c;
        bVar.getClass();
        boolean z2 = false;
        try {
            new C0854a(bVar, 0).invoke();
            if (V.a.E("WindowExtensionsProvider#getWindowExtensions is not valid", new C0854a(bVar, 1)) && V.a.E("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && V.a.E("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = x.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (V.a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
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
        return V.a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
