package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", "enableZ", "(Landroid/graphics/Canvas;Z)V", "Ljava/lang/reflect/Method;", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CanvasUtils {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static java.lang.reflect.Method Camera2StreamConfigurationMap;
    public static final androidx.compose.ui.graphics.CanvasUtils INSTANCE = new androidx.compose.ui.graphics.CanvasUtils();
    public static final int $stable = 8;

    private CanvasUtils() {
    }

    public final void enableZ(android.graphics.Canvas canvas, boolean enable) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.CanvasZHelper canvasZHelper = androidx.compose.ui.graphics.CanvasZHelper.INSTANCE;
            androidx.compose.ui.graphics.CanvasZHelper.getHighSpeedVideoFpsRangesFor(canvas, enable);
            return;
        }
        if (!getHighSpeedVideoFpsRanges) {
            try {
                if (android.os.Build.VERSION.SDK_INT == 28) {
                    java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass());
                    getHighSpeedVideoFpsRangesFor = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new java.lang.Class[0]);
                    Camera2StreamConfigurationMap = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new java.lang.Class[0]);
                } else {
                    getHighSpeedVideoFpsRangesFor = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new java.lang.Class[0]);
                    Camera2StreamConfigurationMap = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new java.lang.Class[0]);
                }
                java.lang.reflect.Method method2 = getHighSpeedVideoFpsRangesFor;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                java.lang.reflect.Method method3 = Camera2StreamConfigurationMap;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            getHighSpeedVideoFpsRanges = true;
        }
        if (enable) {
            try {
                java.lang.reflect.Method method4 = getHighSpeedVideoFpsRangesFor;
                if (method4 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                return;
            }
        }
        if (enable || (method = Camera2StreamConfigurationMap) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        method.invoke(canvas, new java.lang.Object[0]);
    }
}
