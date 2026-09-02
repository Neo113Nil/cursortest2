package c0;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2557a;

    public C0101f() {
        B1.a.l(3, "verificationMode");
        this.f2557a = 3;
    }

    public static boolean a(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || c0.AbstractC0096a.b(sidecarDeviceState) != c0.AbstractC0096a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature, androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(java.util.List list, java.util.List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b((androidx.window.sidecar.SidecarDisplayFeature) list.get(i2), (androidx.window.sidecar.SidecarDisplayFeature) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(c0.AbstractC0096a.c(sidecarWindowLayoutInfo), c0.AbstractC0096a.c(sidecarWindowLayoutInfo2));
    }

    public final Z.j e(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo, androidx.window.sidecar.SidecarDeviceState state) {
        kotlin.jvm.internal.i.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new Z.j(i1.C0199r.f3325a);
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        c0.AbstractC0096a.d(sidecarDeviceState, c0.AbstractC0096a.b(state));
        return new Z.j(f(c0.AbstractC0096a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final java.util.ArrayList f(java.util.List list, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Z.c g2 = g((androidx.window.sidecar.SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z.c g(androidx.window.sidecar.SidecarDisplayFeature feature, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        Z.b bVar;
        Z.b bVar2;
        kotlin.jvm.internal.i.e(feature, "feature");
        androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) W.a.a(this.f2557a, feature).d("Type must be either TYPE_FOLD or TYPE_HINGE", c0.C0097b.f2553e).d("Feature bounds must not be 0", c0.C0098c.f2554e).d("TYPE_FOLD must have 0 area", c0.C0099d.f2555e).d("Feature be pinned to either left or top", c0.C0100e.f2556e).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = Z.b.f1840g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = Z.b.f1841h;
        }
        int b2 = c0.AbstractC0096a.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                bVar2 = Z.b.f1838e;
                if (b2 != 3) {
                }
            } else {
                bVar2 = Z.b.f1839f;
            }
            android.graphics.Rect rect = feature.getRect();
            kotlin.jvm.internal.i.d(rect, "feature.rect");
            return new Z.c(new W.b(rect), bVar, bVar2);
        }
        return null;
    }
}
