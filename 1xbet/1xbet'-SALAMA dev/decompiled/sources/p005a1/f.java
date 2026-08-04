package p005a1;

import U0.a;
import X0.b;
import X0.c;
import X0.l;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p031e1.k;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7954a;

    public f() {
        k.o(3, "verificationMode");
        this.f7954a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || a.b(sidecarDeviceState) != a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!b((SidecarDisplayFeature) list.get(i7), (SidecarDisplayFeature) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2));
    }

    public final l e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        h.e(sidecarDeviceState, SentryThread.JsonKeys.STATE);
        if (sidecarWindowLayoutInfo == null) {
            return new l(p.f13308a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new l(f(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVarG = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarG != null) {
                arrayList.add(cVarG);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        b bVar;
        b bVar2;
        h.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) a.a(this.f7954a, sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", b.f7950a).d("Feature bounds must not be 0", c.f7951a).d("TYPE_FOLD must have 0 area", d.f7952a).d("Feature be pinned to either left or top", e.f7953a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = b.f7430z;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f7423A;
        }
        int iB = a.b(sidecarDeviceState);
        if (iB != 0 && iB != 1) {
            if (iB != 2) {
                bVar2 = b.f7428x;
                if (iB != 3) {
                }
            } else {
                bVar2 = b.f7429y;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            h.d(rect, "feature.rect");
            return new c(new U0.b(rect), bVar, bVar2);
        }
        return null;
    }
}
