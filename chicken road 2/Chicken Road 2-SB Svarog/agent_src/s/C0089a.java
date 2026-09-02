package s;

import g0.h;
import g0.i;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089a extends i implements f0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0089a(int i2, Object obj) {
        super(0);
        this.f1205c = i2;
        this.f1206d = obj;
    }

    @Override // f0.a
    public final Object a() {
        switch (this.f1205c) {
            case 0:
                b bVar = (b) this.f1206d;
                Class<?> loadClass = bVar.f1207a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = bVar.f1207a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                t.i iVar = (t.i) this.f1206d;
                return BigInteger.valueOf(iVar.f1268b).shiftLeft(32).or(BigInteger.valueOf(iVar.f1269c)).shiftLeft(32).or(BigInteger.valueOf(iVar.f1270d));
        }
    }
}
