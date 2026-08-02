package X0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import t6.q;

/* loaded from: classes.dex */
public final class d extends t6.i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7) {
        super(0);
        this.f7436a = i7;
        this.f7437b = eVar;
    }

    @Override // s6.a
    public final Object invoke() {
        boolean z4;
        Class cls;
        boolean z7;
        boolean z8;
        switch (this.f7436a) {
            case 0:
                Class<?> loadClass = this.f7437b.f7438a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                t6.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                t6.h.d(method, "getBoundsMethod");
                if (p3.f.B(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    t6.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (p3.f.B(method2, q.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        t6.h.d(method3, "getStateMethod");
                        if (p3.f.B(method3, q.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z4 = true;
                            return Boolean.valueOf(z4);
                        }
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 1:
                e eVar = this.f7437b;
                try {
                    cls = eVar.f7439b.G();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                t6.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    t6.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z7 = true;
                        return Boolean.valueOf(z7);
                    }
                }
                z7 = false;
                return Boolean.valueOf(z7);
            case 2:
                Class<?> loadClass3 = this.f7437b.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                t6.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    t6.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z8 = true;
                        return Boolean.valueOf(z8);
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            default:
                e eVar2 = this.f7437b;
                Class<?> loadClass4 = ((ClassLoader) eVar2.f7440c.f16591b).loadClass("androidx.window.extensions.WindowExtensions");
                t6.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                t6.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
