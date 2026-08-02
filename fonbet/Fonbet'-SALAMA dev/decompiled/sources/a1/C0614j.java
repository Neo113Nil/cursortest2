package a1;

import G.m;
import X0.l;
import a1.AbstractC0612h;
import a1.C0610f;
import a1.C0614j;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g6.C1167p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import t6.h;
import w1.C1726n0;
import w1.C1761y0;

/* renamed from: a1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614j {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f7960a;

    /* renamed from: b, reason: collision with root package name */
    public final C0610f f7961b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7962c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7963d;

    /* renamed from: e, reason: collision with root package name */
    public C1726n0 f7964e;

    public C0614j(Context context) {
        t6.h.e(context, "context");
        SidecarInterface b7 = AbstractC0612h.b(context);
        C0610f c0610f = new C0610f();
        this.f7960a = b7;
        this.f7961b = c0610f;
        this.f7962c = new LinkedHashMap();
        this.f7963d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f7960a;
    }

    public final X0.l e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a2 = AbstractC0612h.a(activity);
        if (a2 == null) {
            return new X0.l(C1167p.f13302a);
        }
        SidecarInterface sidecarInterface = this.f7960a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        SidecarInterface sidecarInterface2 = this.f7960a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f7961b.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a2 = AbstractC0612h.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f7960a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        LinkedHashMap linkedHashMap = this.f7963d;
        O.a aVar = (O.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof m) {
                ((m) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        C1726n0 c1726n0 = this.f7964e;
        if (c1726n0 != null) {
            c1726n0.g(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f7962c;
        boolean z4 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z4 || (sidecarInterface = this.f7960a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f7962c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f7960a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f7960a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C1726n0 c1726n0 = this.f7964e;
        if (c1726n0 != null) {
            c1726n0.G(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f7963d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof m)) {
            O.a aVar = new O.a() { // from class: a1.g
                @Override // O.a
                public final void accept(Object obj) {
                    C0614j c0614j = C0614j.this;
                    t6.h.e(c0614j, "this$0");
                    Activity activity2 = activity;
                    t6.h.e(activity2, "$activity");
                    C1726n0 c1726n02 = c0614j.f7964e;
                    if (c1726n02 != null) {
                        c1726n02.G(activity2, c0614j.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((m) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void h(C1761y0 c1761y0) {
        this.f7964e = new C1726n0(c1761y0);
        SidecarInterface sidecarInterface = this.f7960a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f7961b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    LinkedHashMap linkedHashMap;
                    C1726n0 c1726n0;
                    C0610f c0610f;
                    SidecarInterface d7;
                    h.e(sidecarDeviceState, "newDeviceState");
                    linkedHashMap = C0614j.this.f7962c;
                    Collection<Activity> values = linkedHashMap.values();
                    C0614j c0614j = C0614j.this;
                    for (Activity activity : values) {
                        IBinder a2 = AbstractC0612h.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a2 != null && (d7 = c0614j.d()) != null) {
                            sidecarWindowLayoutInfo = d7.getWindowLayoutInfo(a2);
                        }
                        c1726n0 = c0614j.f7964e;
                        if (c1726n0 != null) {
                            c0610f = c0614j.f7961b;
                            c1726n0.G(activity, c0610f.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    LinkedHashMap linkedHashMap;
                    C0610f c0610f;
                    SidecarDeviceState sidecarDeviceState;
                    C1726n0 c1726n0;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    linkedHashMap = C0614j.this.f7962c;
                    Activity activity = (Activity) linkedHashMap.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    c0610f = C0614j.this.f7961b;
                    SidecarInterface d7 = C0614j.this.d();
                    if (d7 == null || (sidecarDeviceState = d7.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    l e7 = c0610f.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                    c1726n0 = C0614j.this.f7964e;
                    if (c1726n0 != null) {
                        c1726n0.G(activity, e7);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f7960a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!t6.h.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f7960a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f7960a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f7960a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!t6.h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f7960a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!t6.h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f7960a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!t6.h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                t6.h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            t6.h.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                t6.h.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (t6.h.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
