package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Oo implements com.inmobi.media.Jo {
    public static final java.util.WeakHashMap g = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Lo f4884a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public android.view.View c;
    public final java.util.concurrent.ConcurrentHashMap d;
    public final java.lang.ref.WeakReference e;
    public com.inmobi.media.Lf f;

    public Oo(android.app.Activity activity, com.inmobi.media.Lo windowInsetListener, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.f4884a = windowInsetListener;
        this.b = interfaceC2772t9;
        this.d = new java.util.concurrent.ConcurrentHashMap();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        this.e = weakReference;
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.w()) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        android.app.Activity activity2 = (android.app.Activity) weakReference.get();
        android.view.View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            java.util.WeakHashMap weakHashMap = g;
            java.lang.Object obj = weakHashMap.get(decorView);
            if (obj == null) {
                obj = new com.inmobi.media.Ko(decorView);
                weakHashMap.put(decorView, obj);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
            ((com.inmobi.media.Ko) obj).f4806a.add(this);
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(android.view.WindowInsets windowInsets) {
        try {
            android.app.Activity activity = (android.app.Activity) this.e.get();
            if (!this.f4884a.a()) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            com.inmobi.media.Mo b = com.inmobi.media.J3.a(activity) ? com.inmobi.media.Gi.b(windowInsets) : com.inmobi.media.Gi.a(windowInsets);
            java.lang.Integer f = com.inmobi.media.N5.f();
            int intValue = f != null ? f.intValue() : com.inmobi.media.N5.a(windowInsets);
            com.inmobi.media.N5.a(java.lang.Integer.valueOf(intValue));
            a(b, intValue);
        } catch (java.lang.Error e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.b;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b("WindowInsetsHandler", "Error in getting safeArea " + e.getMessage());
            }
        } catch (java.lang.Exception e2) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.b;
            if (interfaceC2772t94 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t94).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a(com.inmobi.media.Mo insets, int i) {
        com.inmobi.media.Lf orientation = com.inmobi.media.Mf.a(com.inmobi.media.N5.g());
        com.inmobi.media.No no = (com.inmobi.media.No) this.d.get(java.lang.Integer.valueOf(i));
        if (no == null) {
            no = new com.inmobi.media.No();
            this.d.put(java.lang.Integer.valueOf(i), no);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.Mo mo = (com.inmobi.media.Mo) no.f4863a.get(orientation);
        if (mo != null && kotlin.jvm.internal.Intrinsics.areEqual(insets, mo)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
            no.f4863a.put(orientation, insets);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.d;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(concurrentHashMap.size()));
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((com.inmobi.media.No) entry.getValue()).a());
            }
            com.inmobi.media.N5.a(linkedHashMap);
        }
        if (this.f != orientation) {
            this.f = orientation;
            com.inmobi.media.Lo lo = this.f4884a;
            java.lang.Object obj = this.d.get(java.lang.Integer.valueOf(i));
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            lo.a(orientation, (com.inmobi.media.No) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Oo(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi view, com.inmobi.media.Lo windowInsetListener, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this((android.app.Activity) null, windowInsetListener, interfaceC2772t9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.w()) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = view;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        java.util.WeakHashMap weakHashMap = g;
        java.lang.Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new com.inmobi.media.Ko(view);
            weakHashMap.put(view, obj);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
        ((com.inmobi.media.Ko) obj).f4806a.add(this);
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        android.view.View view = this.c;
        if (view != null) {
            java.util.WeakHashMap weakHashMap = g;
            com.inmobi.media.Ko ko = (com.inmobi.media.Ko) weakHashMap.get(view);
            if (ko != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
                ko.f4806a.remove(this);
                if (ko.f4806a.isEmpty()) {
                    ko.a();
                    weakHashMap.remove(view);
                }
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
