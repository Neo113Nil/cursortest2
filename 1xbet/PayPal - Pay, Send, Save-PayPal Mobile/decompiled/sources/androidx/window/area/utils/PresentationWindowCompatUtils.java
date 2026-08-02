package androidx.window.area.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Landroidx/window/area/utils/PresentationWindowCompatUtils;", "", "<init>", "()V", "getWindowBeforeVendorApiLevel4", "Landroid/view/Window;", "extensionPresentation", "Landroidx/window/extensions/area/ExtensionWindowAreaPresentation;", "getWindowMethod", "Ljava/lang/reflect/Method;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PresentationWindowCompatUtils {
    public static final androidx.window.area.utils.PresentationWindowCompatUtils INSTANCE = new androidx.window.area.utils.PresentationWindowCompatUtils();

    private PresentationWindowCompatUtils() {
    }

    public final android.view.Window getWindowBeforeVendorApiLevel4(androidx.window.extensions.area.ExtensionWindowAreaPresentation extensionPresentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionPresentation, "");
        java.lang.reflect.Method highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(extensionPresentation);
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        return (android.view.Window) highSpeedVideoFpsRangesFor.invoke(extensionPresentation, new java.lang.Object[0]);
    }

    private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(androidx.window.extensions.area.ExtensionWindowAreaPresentation extensionWindowAreaPresentation) {
        java.lang.Object obj;
        java.lang.reflect.Method[] methods = extensionWindowAreaPresentation.getClass().getMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods, "");
        java.lang.reflect.Method[] methodArr = methods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.lang.reflect.Method method = methodArr[i];
            java.lang.reflect.Method method2 = method;
            if (kotlin.jvm.internal.Intrinsics.areEqual(method2 != null ? method2.getName() : null, "getWindow") && kotlin.jvm.internal.Intrinsics.areEqual(method2.getReturnType(), android.view.Window.class)) {
                obj = method;
                break;
            }
            i++;
        }
        return (java.lang.reflect.Method) obj;
    }
}
