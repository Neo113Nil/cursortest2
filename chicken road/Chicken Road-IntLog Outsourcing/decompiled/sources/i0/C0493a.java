package i0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493a extends j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f5830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493a(b bVar, int i2) {
        super(0);
        this.f5829e = i2;
        this.f5830f = bVar;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        switch (this.f5829e) {
            case 0:
                Class<?> loadClass = this.f5830f.f5831a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                b bVar = this.f5830f;
                Class<?> loadClass2 = bVar.f5831a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = bVar.f5831a.loadClass("androidx.window.extensions.WindowExtensions");
                i.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                i.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
