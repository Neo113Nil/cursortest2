package c0;

import b0.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.k;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168a extends k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2526e;
    public final /* synthetic */ j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0168a(j jVar, int i3) {
        super(0);
        this.f2526e = i3;
        this.f = jVar;
    }

    @Override // o2.a
    public final Object invoke() {
        switch (this.f2526e) {
            case 0:
                Class<?> loadClass = ((ClassLoader) this.f.f2462a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                j jVar = this.f;
                Class<?> loadClass2 = ((ClassLoader) jVar.f2462a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                kotlin.jvm.internal.j.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z3 = false;
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> loadClass3 = ((ClassLoader) jVar.f2462a).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.j.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                kotlin.jvm.internal.j.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                if (getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}
