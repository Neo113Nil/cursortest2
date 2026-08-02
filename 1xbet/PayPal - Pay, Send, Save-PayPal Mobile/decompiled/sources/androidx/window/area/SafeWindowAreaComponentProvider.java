package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/window/area/SafeWindowAreaComponentProvider;", "", "loader", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/ClassLoader;)V", "windowExtensions", "Landroidx/window/extensions/WindowExtensions;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "getWindowAreaComponent", "()Landroidx/window/extensions/area/WindowAreaComponent;", "isWindowAreaProviderValid", "", "windowAreaComponentClass", "Ljava/lang/Class;", "getWindowAreaComponentClass", "()Ljava/lang/Class;", "extensionWindowAreaStatusClass", "getExtensionWindowAreaStatusClass", "extensionWindowAreaPresentationClass", "getExtensionWindowAreaPresentationClass", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeWindowAreaComponentProvider {
    private final androidx.window.extensions.WindowExtensions getHighSpeedVideoFpsRangesFor;
    private final java.lang.ClassLoader getHighSpeedVideoSizes;

    public SafeWindowAreaComponentProvider(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        this.getHighSpeedVideoSizes = classLoader;
        this.getHighSpeedVideoFpsRangesFor = new androidx.window.SafeWindowExtensionsProvider(classLoader).getWindowExtensions();
    }

    public final androidx.window.extensions.area.WindowAreaComponent getWindowAreaComponent() {
        try {
            final androidx.window.extensions.WindowExtensions windowExtensions = this.getHighSpeedVideoFpsRangesFor;
            if (windowExtensions == null || !androidx.window.reflection.ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowAreaComponent is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.area.SafeWindowAreaComponentProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.window.area.SafeWindowAreaComponentProvider.$r8$lambda$hHAFXi5E0P336uG0h13Jz7fHMQY(windowExtensions, this));
                }
            }) || android.os.Build.VERSION.SDK_INT < 29) {
                return null;
            }
            androidx.window.area.reflectionguard.WindowAreaComponentValidator windowAreaComponentValidator = androidx.window.area.reflectionguard.WindowAreaComponentValidator.INSTANCE;
            java.lang.Class<?> loadClass = this.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_AREA_COMPONENT_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
            if (!windowAreaComponentValidator.isWindowAreaComponentValid$window_release(loadClass, androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel())) {
                return null;
            }
            androidx.window.area.reflectionguard.WindowAreaComponentValidator windowAreaComponentValidator2 = androidx.window.area.reflectionguard.WindowAreaComponentValidator.INSTANCE;
            java.lang.Class<?> loadClass2 = this.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.EXTENSION_WINDOW_AREA_STATUS_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass2, "");
            if (!windowAreaComponentValidator2.isExtensionWindowAreaStatusValid$window_release(loadClass2, androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel())) {
                return null;
            }
            androidx.window.area.reflectionguard.WindowAreaComponentValidator windowAreaComponentValidator3 = androidx.window.area.reflectionguard.WindowAreaComponentValidator.INSTANCE;
            java.lang.Class<?> loadClass3 = this.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.EXTENSION_WINDOW_AREA_PRESENTATION_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass3, "");
            if (windowAreaComponentValidator3.isExtensionWindowAreaPresentationValid$window_release(loadClass3, androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel())) {
                return this.getHighSpeedVideoFpsRangesFor.getWindowAreaComponent();
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$hHAFXi5E0P336uG0h13Jz7fHMQY(java.lang.Object obj, androidx.window.area.SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) {
        java.lang.reflect.Method method = obj.getClass().getMethod("getWindowAreaComponent", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            java.lang.Class<?> loadClass = safeWindowAreaComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_AREA_COMPONENT_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
            if (reflectionUtils2.doesReturn$window_release(method, loadClass)) {
                return true;
            }
        }
        return false;
    }
}
