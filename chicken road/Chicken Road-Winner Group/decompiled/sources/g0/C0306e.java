package g0;

import a.AbstractC0086a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import c0.C0168a;
import d0.AbstractC0265e;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f4960a;

    /* renamed from: b, reason: collision with root package name */
    public final J1.i f4961b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.j f4962c;

    public C0306e(ClassLoader classLoader, J1.i iVar) {
        this.f4960a = classLoader;
        this.f4961b = iVar;
        this.f4962c = new b0.j(classLoader);
    }

    public final WindowLayoutComponent a() {
        b0.j jVar = this.f4962c;
        jVar.getClass();
        boolean z3 = false;
        try {
            new C0168a(jVar, 0).invoke();
            if (AbstractC0086a.f0("WindowExtensionsProvider#getWindowExtensions is not valid", new C0168a(jVar, 1)) && AbstractC0086a.f0("WindowExtensions#getWindowLayoutComponent is not valid", new C0305d(this, 3)) && AbstractC0086a.f0("FoldingFeature class is not valid", new C0305d(this, 0))) {
                int a3 = AbstractC0265e.a();
                if (a3 == 1) {
                    z3 = b();
                } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0086a.f0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0305d(this, 2))) {
                        z3 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z3) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0086a.f0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0305d(this, 1));
    }
}
