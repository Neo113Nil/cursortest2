package androidx.compose.ui.graphics;

/* compiled from: CanvasUtils.android.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "()V", "inorderBarrierMethod", "Ljava/lang/reflect/Method;", "orderMethodsFetched", "", "reorderBarrierMethod", "enableZ", "", "canvas", "Landroid/graphics/Canvas;", com.ironsource.mediationsdk.metadata.a.j, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasUtils {
    public static final androidx.compose.ui.graphics.CanvasUtils INSTANCE = new androidx.compose.ui.graphics.CanvasUtils();
    private static java.lang.reflect.Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static java.lang.reflect.Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    public final void enableZ(android.graphics.Canvas canvas, boolean enable) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.CanvasZHelper.INSTANCE.enableZ(canvas, enable);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (android.os.Build.VERSION.SDK_INT == 28) {
                    java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass());
                    reorderBarrierMethod = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new java.lang.Class[0]);
                    inorderBarrierMethod = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new java.lang.Class[0]);
                } else {
                    reorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new java.lang.Class[0]);
                    inorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new java.lang.Class[0]);
                }
                java.lang.reflect.Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                java.lang.reflect.Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (enable) {
            try {
                java.lang.reflect.Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                return;
            }
        }
        if (enable || (method = inorderBarrierMethod) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        method.invoke(canvas, new java.lang.Object[0]);
    }
}
