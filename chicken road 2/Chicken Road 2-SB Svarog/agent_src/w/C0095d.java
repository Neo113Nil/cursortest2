package w;

import a.AbstractC0018a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095d extends g0.i implements f0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0096e f1290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0095d(C0096e c0096e, int i2) {
        super(0);
        this.f1289c = i2;
        this.f1290d = c0096e;
    }

    @Override // f0.a
    public final Object a() {
        boolean z2;
        Class cls;
        boolean z3;
        boolean z4;
        switch (this.f1289c) {
            case 0:
                Class<?> loadClass = this.f1290d.f1291a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                g0.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                g0.h.d(method, "getBoundsMethod");
                if (AbstractC0018a.i(method, g0.l.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    g0.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0018a.i(method2, g0.l.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        g0.h.d(method3, "getStateMethod");
                        if (AbstractC0018a.i(method3, g0.l.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                C0096e c0096e = this.f1290d;
                try {
                    cls = c0096e.f1292b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0096e.f1291a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                g0.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                g0.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    g0.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                Class<?> loadClass3 = this.f1290d.f1291a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                g0.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                g0.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    g0.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                C0096e c0096e2 = this.f1290d;
                Class<?> loadClass4 = c0096e2.f1293c.f1207a.loadClass("androidx.window.extensions.WindowExtensions");
                g0.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = c0096e2.f1291a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                g0.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                g0.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
