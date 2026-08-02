package a1;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g6.C1167p;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0605a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        t6.h.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                t6.h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        t6.h.e(sidecarDeviceState, "sidecarDeviceState");
        int a2 = a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            return 0;
        }
        return a2;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C1167p c1167p = C1167p.f13302a;
        t6.h.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? c1167p : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                t6.h.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return c1167p;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i7) {
        try {
            try {
                sidecarDeviceState.posture = i7;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i7));
        }
    }
}
