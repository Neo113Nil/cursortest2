package T0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import t6.h;
import t6.i;
import u1.c;

/* loaded from: classes.dex */
public final class a extends i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i7) {
        super(0);
        this.f6340a = i7;
        this.f6341b = cVar;
    }

    @Override // s6.a
    public final Object invoke() {
        switch (this.f6340a) {
            case 0:
                Class<?> loadClass = ((ClassLoader) this.f6341b.f16591b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                c cVar = this.f6341b;
                Class<?> loadClass2 = ((ClassLoader) cVar.f16591b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = ((ClassLoader) cVar.f16591b).loadClass("androidx.window.extensions.WindowExtensions");
                h.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(declaredMethod.getModifiers()));
        }
    }
}
