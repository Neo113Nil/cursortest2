package c0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.window.sidecar.SidecarInterface f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.C0101f f2561b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f2562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f2563d;

    /* renamed from: e, reason: collision with root package name */
    public I0.b f2564e;

    public i(android.content.Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        androidx.window.sidecar.SidecarInterface b2 = c0.g.b(context);
        c0.C0101f c0101f = new c0.C0101f();
        this.f2560a = b2;
        this.f2561b = c0101f;
        this.f2562c = new java.util.LinkedHashMap();
        this.f2563d = new java.util.LinkedHashMap();
    }

    public final androidx.window.sidecar.SidecarInterface d() {
        return this.f2560a;
    }

    public final Z.j e(android.app.Activity activity) {
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
        android.os.IBinder a2 = c0.g.a(activity);
        if (a2 == null) {
            return new Z.j(i1.C0199r.f3325a);
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.f2560a;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f2560a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return this.f2561b.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        android.os.IBinder a2 = c0.g.a(activity);
        if (a2 == null) {
            return;
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f2560a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        java.util.LinkedHashMap linkedHashMap = this.f2563d;
        if (((x.InterfaceC1010a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        I0.b bVar = this.f2564e;
        if (bVar != null) {
            bVar.s(activity);
        }
        java.util.LinkedHashMap linkedHashMap2 = this.f2562c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z2 || (sidecarInterface = this.f2560a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(android.os.IBinder iBinder, android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        java.util.LinkedHashMap linkedHashMap = this.f2562c;
        linkedHashMap.put(iBinder, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f2560a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f2560a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        I0.b bVar = this.f2564e;
        if (bVar != null) {
            bVar.J(activity, e(activity));
        }
        this.f2563d.get(activity);
    }

    public final void h(Z0.h hVar) {
        this.f2564e = new I0.b(hVar);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.f2560a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback(this.f2561b, new androidx.window.sidecar.SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
                    java.util.LinkedHashMap linkedHashMap;
                    I0.b bVar;
                    c0.C0101f c0101f;
                    androidx.window.sidecar.SidecarInterface d2;
                    kotlin.jvm.internal.i.e(newDeviceState, "newDeviceState");
                    linkedHashMap = c0.i.this.f2562c;
                    java.util.Collection<android.app.Activity> values = linkedHashMap.values();
                    c0.i iVar = c0.i.this;
                    for (android.app.Activity activity : values) {
                        android.os.IBinder a2 = c0.g.a(activity);
                        androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a2 != null && (d2 = iVar.d()) != null) {
                            sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a2);
                        }
                        bVar = iVar.f2564e;
                        if (bVar != null) {
                            c0101f = iVar.f2561b;
                            bVar.J(activity, c0101f.e(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(android.os.IBinder windowToken, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
                    java.util.LinkedHashMap linkedHashMap;
                    c0.C0101f c0101f;
                    androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
                    I0.b bVar;
                    kotlin.jvm.internal.i.e(windowToken, "windowToken");
                    kotlin.jvm.internal.i.e(newLayout, "newLayout");
                    linkedHashMap = c0.i.this.f2562c;
                    android.app.Activity activity = (android.app.Activity) linkedHashMap.get(windowToken);
                    if (activity == null) {
                        android.util.Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    c0101f = c0.i.this.f2561b;
                    androidx.window.sidecar.SidecarInterface d2 = c0.i.this.d();
                    if (d2 == null || (sidecarDeviceState = d2.getDeviceState()) == null) {
                        sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
                    }
                    Z.j e2 = c0101f.e(newLayout, sidecarDeviceState);
                    bVar = c0.i.this.f2564e;
                    if (bVar != null) {
                        bVar.J(activity, e2);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.Class<?> cls4;
        try {
            androidx.window.sidecar.SidecarInterface sidecarInterface = this.f2560a;
            java.lang.reflect.Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", androidx.window.sidecar.SidecarInterface.SidecarCallback.class);
            java.lang.Class<?> returnType = method != null ? method.getReturnType() : null;
            java.lang.Class cls5 = java.lang.Void.TYPE;
            if (!kotlin.jvm.internal.i.a(returnType, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f2560a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface3 = this.f2560a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface4 = this.f2560a;
            java.lang.reflect.Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", android.os.IBinder.class);
            java.lang.Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType2, androidx.window.sidecar.SidecarWindowLayoutInfo.class)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface5 = this.f2560a;
            java.lang.reflect.Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", android.os.IBinder.class);
            java.lang.Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType3, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface6 = this.f2560a;
            java.lang.reflect.Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", android.os.IBinder.class);
            java.lang.Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType4, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (java.lang.NoSuchFieldError unused) {
                androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, 3);
                java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((java.lang.Integer) invoke).intValue() != 3) {
                    throw new java.lang.Exception("Invalid device posture getter/setter");
                }
            }
            androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = new androidx.window.sidecar.SidecarDisplayFeature();
            android.graphics.Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.i.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new androidx.window.sidecar.SidecarWindowLayoutInfo();
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (java.lang.NoSuchFieldError unused2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(sidecarDisplayFeature);
                androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                java.lang.Object invoke2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                kotlin.jvm.internal.i.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (kotlin.jvm.internal.i.a(arrayList, (java.util.List) invoke2)) {
                    return true;
                }
                throw new java.lang.Exception("Invalid display feature getter/setter");
            }
        } catch (java.lang.Throwable unused3) {
            return false;
        }
    }
}
