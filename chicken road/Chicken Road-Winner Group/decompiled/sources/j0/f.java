package j0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.C0261a;
import d0.C0262b;
import d0.C0267g;
import e2.o;
import g0.C0303b;
import g0.C0304c;
import g0.C0311j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9510b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f9511a;

    public f() {
        B0.c.m(3, "verificationMode");
        this.f9511a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.j.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.j.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (a((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public final C0311j c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C0311j(o.f4877a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new C0311j(d(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0304c e3 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e3 != null) {
                arrayList.add(e3);
            }
        }
        return arrayList;
    }

    public final C0304c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        C0303b c0303b;
        C0303b c0303b2;
        kotlin.jvm.internal.j.e(feature, "feature");
        C0261a c0261a = C0261a.f4821a;
        int i3 = this.f9511a;
        B0.c.m(i3, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new C0267g(feature, i3, c0261a).E("Type must be either TYPE_FOLD or TYPE_HINGE", b.f9506e).E("Feature bounds must not be 0", c.f9507e).E("TYPE_FOLD must have 0 area", d.f9508e).E("Feature be pinned to either left or top", e.f9509e).k();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            c0303b = C0303b.f4952g;
        } else {
            if (type != 2) {
                return null;
            }
            c0303b = C0303b.f4953h;
        }
        int b3 = a.b(sidecarDeviceState);
        if (b3 == 0 || b3 == 1) {
            return null;
        }
        if (b3 != 2) {
            c0303b2 = C0303b.f4951e;
            if (b3 != 3 && b3 == 4) {
                return null;
            }
        } else {
            c0303b2 = C0303b.f;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.j.d(rect, "feature.rect");
        return new C0304c(new C0262b(rect), c0303b, c0303b2);
    }
}
