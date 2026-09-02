package z;

import F.AbstractC0010k;
import X.m;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.C0090a;
import w.C0093b;
import w.C0094c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1328b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f1329a;

    public g() {
        AbstractC0010k.f("verificationMode", 3);
        this.f1329a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (g0.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return g0.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (a((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0094c e2 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public final w.k d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new w.k(m.f402b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new w.k(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final C0094c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0093b c0093b;
        C0093b c0093b2 = C0093b.f1280f;
        g0.h.e(sidecarDisplayFeature, "feature");
        int i2 = this.f1329a;
        AbstractC0010k.f("verificationMode", i2);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new t.g(sidecarDisplayFeature, i2, C0090a.f1250a).d("Type must be either TYPE_FOLD or TYPE_HINGE", c.f1324c).d("Feature bounds must not be 0", d.f1325c).d("TYPE_FOLD must have 0 area", e.f1326c).d("Feature be pinned to either left or top", f.f1327c).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c0093b = C0093b.f1282h;
        } else {
            if (type != 2) {
                return null;
            }
            c0093b = C0093b.f1283i;
        }
        int b2 = b.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            c0093b2 = C0093b.f1281g;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        g0.h.d(rect, "feature.rect");
        return new C0094c(new t.b(rect), c0093b, c0093b2);
    }
}
