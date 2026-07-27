package g0;

import a.AbstractC0086a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.r;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305d extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4959e;
    public final /* synthetic */ C0306e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0305d(C0306e c0306e, int i3) {
        super(0);
        this.f4959e = i3;
        this.f = c0306e;
    }

    @Override // o2.a
    public final Object invoke() {
        Class cls;
        boolean z3;
        boolean z4;
        switch (this.f4959e) {
            case 0:
                Class<?> loadClass = this.f.f4960a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                boolean z5 = false;
                Method getBoundsMethod = loadClass.getMethod("getBounds", new Class[0]);
                Method getTypeMethod = loadClass.getMethod("getType", new Class[0]);
                Method getStateMethod = loadClass.getMethod("getState", new Class[0]);
                kotlin.jvm.internal.j.d(getBoundsMethod, "getBoundsMethod");
                if (AbstractC0086a.s(getBoundsMethod, r.a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0086a.s(getTypeMethod, r.a(cls2)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.j.d(getStateMethod, "getStateMethod");
                        if (AbstractC0086a.s(getStateMethod, r.a(cls2)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z5 = true;
                        }
                    }
                }
                return Boolean.valueOf(z5);
            case 1:
                C0306e c0306e = this.f;
                try {
                    cls = c0306e.f4961b.y();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0306e.f4960a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.j.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                Class<?> loadClass3 = this.f.f4960a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.j.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                C0306e c0306e2 = this.f;
                Class<?> loadClass4 = ((ClassLoader) c0306e2.f4962c.f2462a).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.j.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                boolean z6 = false;
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", new Class[0]);
                Class<?> loadClass5 = c0306e2.f4960a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.j.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5)) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
        }
    }
}
