package D;

import A.l;
import C0.b;
import D.f;
import D.g;
import D.i;
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
import kotlin.jvm.internal.j;
import m.InterfaceC0785a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f148a;

    /* renamed from: b, reason: collision with root package name */
    public final f f149b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f150c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f151d;

    /* renamed from: e, reason: collision with root package name */
    public C0.b f152e;

    public i(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        SidecarInterface b2 = g.b(context);
        f fVar = new f();
        this.f148a = b2;
        this.f149b = fVar;
        this.f150c = new LinkedHashMap();
        this.f151d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f148a;
    }

    public final l e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return new l(L0.l.f214a);
        }
        SidecarInterface sidecarInterface = this.f148a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        SidecarInterface sidecarInterface2 = this.f148a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f149b.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f148a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        LinkedHashMap linkedHashMap = this.f151d;
        if (((InterfaceC0785a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        C0.b bVar = this.f152e;
        if (bVar != null) {
            bVar.a(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f150c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z2 || (sidecarInterface = this.f148a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f150c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f148a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f148a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C0.b bVar = this.f152e;
        if (bVar != null) {
            bVar.m(activity, e(activity));
        }
        this.f151d.get(activity);
    }

    public final void h(C0.a aVar) {
        this.f152e = new C0.b(aVar);
        SidecarInterface sidecarInterface = this.f148a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f149b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    b bVar;
                    f fVar;
                    SidecarInterface d2;
                    j.e(newDeviceState, "newDeviceState");
                    linkedHashMap = i.this.f150c;
                    Collection<Activity> values = linkedHashMap.values();
                    i iVar = i.this;
                    for (Activity activity : values) {
                        IBinder a2 = g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a2 != null && (d2 = iVar.d()) != null) {
                            sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a2);
                        }
                        bVar = iVar.f152e;
                        if (bVar != null) {
                            fVar = iVar.f149b;
                            bVar.m(activity, fVar.e(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    f fVar;
                    SidecarDeviceState sidecarDeviceState;
                    b bVar;
                    j.e(windowToken, "windowToken");
                    j.e(newLayout, "newLayout");
                    linkedHashMap = i.this.f150c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    fVar = i.this.f149b;
                    SidecarInterface d2 = i.this.d();
                    if (d2 == null || (sidecarDeviceState = d2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    l e2 = fVar.e(newLayout, sidecarDeviceState);
                    bVar = i.this.f152e;
                    if (bVar != null) {
                        bVar.m(activity, e2);
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
            SidecarInterface sidecarInterface = this.f148a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.j.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f148a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f148a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f148a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.j.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f148a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.j.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f148a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!kotlin.jvm.internal.j.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.j.d(rect, "displayFeature.rect");
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
                kotlin.jvm.internal.j.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (kotlin.jvm.internal.j.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
