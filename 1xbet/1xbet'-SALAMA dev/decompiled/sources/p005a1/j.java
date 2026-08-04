package p005a1;

import G.m;
import O.a;
import X0.l;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p005a1.f;
import p005a1.j;
import p050g6.p;
import p155w1.C1017n0;
import p155w1.C1052y0;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f7960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1017n0 f7964e;

    public j(Context context) {
        h.e(context, "context");
        SidecarInterface sidecarInterfaceB = h.b(context);
        f fVar = new f();
        this.f7960a = sidecarInterfaceB;
        this.f7961b = fVar;
        this.f7962c = new LinkedHashMap();
        this.f7963d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f7960a;
    }

    public final l e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = h.a(activity);
        if (iBinderA == null) {
            return new l(p.f13308a);
        }
        SidecarInterface sidecarInterface = this.f7960a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f7960a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f7961b.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder iBinderA = h.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f7960a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f7963d;
        a aVar = (a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof m) {
                ((m) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        C1017n0 c1017n0 = this.f7964e;
        if (c1017n0 != null) {
            c1017n0.g(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f7962c;
        boolean z4 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
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
        C1017n0 c1017n0 = this.f7964e;
        if (c1017n0 != null) {
            c1017n0.G(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f7963d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof m)) {
            a aVar = new a() { // from class: a1.g
                @Override // O.a
                public final void accept(Object obj) {
                    j jVar = this.f7955a;
                    h.e(jVar, "this$0");
                    Activity activity2 = activity;
                    h.e(activity2, "$activity");
                    C1017n0 c1017n1 = jVar.f7964e;
                    if (c1017n1 != null) {
                        c1017n1.G(activity2, jVar.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((m) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void h(C1052y0 c1052y0) {
        this.f7964e = new C1017n0(c1052y0);
        SidecarInterface sidecarInterface = this.f7960a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f7961b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterfaceD;
                    h.e(sidecarDeviceState, "newDeviceState");
                    Collection<Activity> collectionValues = this.f9852a.f7962c.values();
                    j jVar = this.f9852a;
                    for (Activity activity : collectionValues) {
                        IBinder iBinderA = p005a1.h.a(activity);
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        if (iBinderA != null && (sidecarInterfaceD = jVar.d()) != null) {
                            windowLayoutInfo = sidecarInterfaceD.getWindowLayoutInfo(iBinderA);
                        }
                        C1017n0 c1017n0 = jVar.f7964e;
                        if (c1017n0 != null) {
                            c1017n0.G(activity, jVar.f7961b.e(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    Activity activity = (Activity) this.f9852a.f7962c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    f fVar = this.f9852a.f7961b;
                    SidecarInterface sidecarInterfaceD = this.f9852a.d();
                    if (sidecarInterfaceD == null || (sidecarDeviceState = sidecarInterfaceD.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    l lVarE = fVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                    C1017n0 c1017n0 = this.f9852a.f7964e;
                    if (c1017n0 != null) {
                        c1017n0.G(activity, lVarE);
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
            if (!h.a(returnType, cls5)) {
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
            if (!h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f7960a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f7960a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                h.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            h.d(rect, "displayFeature.rect");
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
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                h.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (h.a(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
