package m0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import i0.C0493a;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f11103a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.b f11104b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.b f11105c;

    public C1270e(ClassLoader classLoader, i0.b bVar) {
        this.f11103a = classLoader;
        this.f11104b = bVar;
        this.f11105c = new i0.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        i0.b bVar = this.f11105c;
        bVar.getClass();
        boolean z = false;
        try {
            new C0493a(bVar, 0).invoke();
            if (e5.g.A("WindowExtensionsProvider#getWindowExtensions is not valid", new C0493a(bVar, 1)) && e5.g.A("WindowExtensions#getWindowLayoutComponent is not valid", new C1269d(this, 3)) && e5.g.A("FoldingFeature class is not valid", new C1269d(this, 0))) {
                int a6 = j0.e.a();
                if (a6 == 1) {
                    z = b();
                } else if (2 <= a6 && a6 <= Integer.MAX_VALUE && b()) {
                    if (e5.g.A("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C1269d(this, 2))) {
                        z = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return e5.g.A("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C1269d(this, 1));
    }
}
