package X0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import t6.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends t6.i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7) {
        super(0);
        this.f7436a = i7;
        this.f7437b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x0165  */
    @Override // s6.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z4;
        Class clsG;
        boolean z7;
        boolean z8;
        switch (this.f7436a) {
            case 0:
                Class<?> clsLoadClass = this.f7437b.f7438a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                t6.h.d(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                t6.h.d(method, "getBoundsMethod");
                if (p113p3.f.B(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    t6.h.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (p113p3.f.B(method2, q.a(cls)) && Modifier.isPublic(method2.getModifiers())) {
                        t6.h.d(method3, "getStateMethod");
                        if (p113p3.f.B(method3, q.a(cls)) && Modifier.isPublic(method3.getModifiers())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 1:
                e eVar = this.f7437b;
                try {
                    clsG = eVar.f7439b.G();
                    break;
                } catch (ClassNotFoundException unused) {
                    clsG = null;
                }
                if (clsG == null) {
                    return Boolean.FALSE;
                }
                Class<?> clsLoadClass2 = eVar.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsG);
                Method method5 = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsG);
                t6.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    t6.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 2:
                Class<?> clsLoadClass3 = this.f7437b.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(clsLoadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                t6.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    t6.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                e eVar2 = this.f7437b;
                Class<?> clsLoadClass4 = ((ClassLoader) eVar2.f7440c.f16597b).loadClass("androidx.window.extensions.WindowExtensions");
                t6.h.d(clsLoadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = clsLoadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass5 = eVar2.f7438a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                t6.h.d(clsLoadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                t6.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(clsLoadClass5));
        }
    }
}
