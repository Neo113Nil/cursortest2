package T0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p145u1.c;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i7) {
        super(0);
        this.f6340a = i7;
        this.f6341b = cVar;
    }

    @Override // s6.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        switch (this.f6340a) {
            case 0:
                Class<?> clsLoadClass = ((ClassLoader) this.f6341b.f16597b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return clsLoadClass;
            default:
                c cVar = this.f6341b;
                Class<?> clsLoadClass2 = ((ClassLoader) cVar.f16597b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(clsLoadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = clsLoadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass3 = ((ClassLoader) cVar.f16597b).loadClass("androidx.window.extensions.WindowExtensions");
                h.d(clsLoadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass3) && Modifier.isPublic(declaredMethod.getModifiers()));
        }
    }
}
