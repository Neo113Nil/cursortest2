package Z;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z.e f1848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Z.e eVar, int i2) {
        super(0);
        this.f1847e = i2;
        this.f1848f = eVar;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        boolean z2;
        java.lang.Class cls;
        boolean z3;
        boolean z4;
        switch (this.f1847e) {
            case 0:
                java.lang.Class<?> loadClass = this.f1848f.f1849a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                java.lang.reflect.Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                java.lang.reflect.Method getTypeMethod = loadClass.getMethod("getType", null);
                java.lang.reflect.Method getStateMethod = loadClass.getMethod("getState", null);
                kotlin.jvm.internal.i.d(getBoundsMethod, "getBoundsMethod");
                if (a.AbstractC0059a.n(getBoundsMethod, kotlin.jvm.internal.q.a(android.graphics.Rect.class)) && java.lang.reflect.Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(getTypeMethod, "getTypeMethod");
                    java.lang.Class cls2 = java.lang.Integer.TYPE;
                    if (a.AbstractC0059a.n(getTypeMethod, kotlin.jvm.internal.q.a(cls2)) && java.lang.reflect.Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.i.d(getStateMethod, "getStateMethod");
                        if (a.AbstractC0059a.n(getStateMethod, kotlin.jvm.internal.q.a(cls2)) && java.lang.reflect.Modifier.isPublic(getStateMethod.getModifiers())) {
                            z2 = true;
                            return java.lang.Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return java.lang.Boolean.valueOf(z2);
            case 1:
                Z.e eVar = this.f1848f;
                try {
                    cls = eVar.f1850b.b();
                } catch (java.lang.ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Class<?> loadClass2 = eVar.f1849a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                java.lang.reflect.Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", android.app.Activity.class, cls);
                java.lang.reflect.Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.i.d(addListenerMethod, "addListenerMethod");
                if (java.lang.reflect.Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod, "removeListenerMethod");
                    if (java.lang.reflect.Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z3 = true;
                        return java.lang.Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return java.lang.Boolean.valueOf(z3);
            case 2:
                java.lang.Class<?> loadClass3 = this.f1848f.f1849a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                java.lang.reflect.Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", android.content.Context.class, androidx.window.extensions.core.util.function.Consumer.class);
                java.lang.reflect.Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", androidx.window.extensions.core.util.function.Consumer.class);
                kotlin.jvm.internal.i.d(addListenerMethod2, "addListenerMethod");
                if (java.lang.reflect.Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod2, "removeListenerMethod");
                    if (java.lang.reflect.Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z4 = true;
                        return java.lang.Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return java.lang.Boolean.valueOf(z4);
            default:
                Z.e eVar2 = this.f1848f;
                java.lang.Class<?> loadClass4 = eVar2.f1851c.f1745a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                java.lang.reflect.Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                java.lang.Class<?> loadClass5 = eVar2.f1849a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.i.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                return java.lang.Boolean.valueOf(java.lang.reflect.Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5));
        }
    }
}
