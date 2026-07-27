package p0;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g4.C0471p;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1378a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        int a6 = a(sidecarDeviceState);
        if (a6 < 0 || a6 > 4) {
            return 0;
        }
        return a6;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        C0471p c0471p = C0471p.f5750a;
        kotlin.jvm.internal.i.e(info, "info");
        try {
            try {
                List list = info.displayFeatures;
                return list == null ? c0471p : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return c0471p;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i2) {
        try {
            try {
                sidecarDeviceState.posture = i2;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i2));
        }
    }
}
