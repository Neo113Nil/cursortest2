package c0;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0096a {
    public static int a(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((java.lang.Integer) invoke).intValue();
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        int a2 = a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            return 0;
        }
        return a2;
    }

    public static java.util.List c(androidx.window.sidecar.SidecarWindowLayoutInfo info) {
        i1.C0199r c0199r = i1.C0199r.f3325a;
        kotlin.jvm.internal.i.e(info, "info");
        try {
            try {
                java.util.List list = info.displayFeatures;
                return list == null ? c0199r : list;
            } catch (java.lang.NoSuchFieldError unused) {
                java.lang.Object invoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (java.util.List) invoke;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            return c0199r;
        }
    }

    public static void d(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int i2) {
        try {
            try {
                sidecarDeviceState.posture = i2;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        } catch (java.lang.NoSuchFieldError unused2) {
            androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(i2));
        }
    }
}
