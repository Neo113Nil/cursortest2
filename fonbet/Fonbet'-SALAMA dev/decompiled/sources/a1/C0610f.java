package a1;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g6.C1167p;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610f {

    /* renamed from: a, reason: collision with root package name */
    public final int f7954a;

    public C0610f() {
        e1.k.o(3, "verificationMode");
        this.f7954a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (t6.h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC0605a.b(sidecarDeviceState) != AbstractC0605a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (t6.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return t6.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
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
        if (t6.h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0605a.c(sidecarWindowLayoutInfo), AbstractC0605a.c(sidecarWindowLayoutInfo2));
    }

    public final X0.l e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        t6.h.e(sidecarDeviceState, SentryThread.JsonKeys.STATE);
        if (sidecarWindowLayoutInfo == null) {
            return new X0.l(C1167p.f13302a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0605a.d(sidecarDeviceState2, AbstractC0605a.b(sidecarDeviceState));
        return new X0.l(f(AbstractC0605a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X0.c g3 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g3 != null) {
                arrayList.add(g3);
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
    public final X0.c g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        X0.b bVar;
        X0.b bVar2;
        t6.h.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) U0.a.a(this.f7954a, sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", C0606b.f7950a).d("Feature bounds must not be 0", C0607c.f7951a).d("TYPE_FOLD must have 0 area", C0608d.f7952a).d("Feature be pinned to either left or top", C0609e.f7953a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = X0.b.f7430z;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = X0.b.f7423A;
        }
        int b7 = AbstractC0605a.b(sidecarDeviceState);
        if (b7 != 0 && b7 != 1) {
            if (b7 != 2) {
                bVar2 = X0.b.f7428x;
                if (b7 != 3) {
                }
            } else {
                bVar2 = X0.b.f7429y;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            t6.h.d(rect, "feature.rect");
            return new X0.c(new U0.b(rect), bVar, bVar2);
        }
        return null;
    }
}
