package w;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854a extends k implements U0.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f6743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0854a(b bVar, int i2) {
        super(0);
        this.f6742e = i2;
        this.f6743f = bVar;
    }

    @Override // U0.a
    public final Object invoke() {
        switch (this.f6742e) {
            case 0:
                Class<?> loadClass = this.f6743f.f6744a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                b bVar = this.f6743f;
                Class<?> loadClass2 = bVar.f6744a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = bVar.f6744a.loadClass("androidx.window.extensions.WindowExtensions");
                j.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                j.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
