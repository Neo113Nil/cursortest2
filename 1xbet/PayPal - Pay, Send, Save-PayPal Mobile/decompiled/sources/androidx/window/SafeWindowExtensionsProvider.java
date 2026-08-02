package androidx.window;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/window/SafeWindowExtensionsProvider;", "", "loader", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/ClassLoader;)V", "windowExtensions", "Landroidx/window/extensions/WindowExtensions;", "getWindowExtensions", "()Landroidx/window/extensions/WindowExtensions;", "windowExtensionsClass", "Ljava/lang/Class;", "getWindowExtensionsClass$window_release", "()Ljava/lang/Class;", "isWindowExtensionsValid", "", "isWindowExtensionsValid$window_release", "isWindowExtensionsPresent", "windowExtensionsProviderClass", "getWindowExtensionsProviderClass", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeWindowExtensionsProvider {
    private final java.lang.ClassLoader Camera2StreamConfigurationMap;

    public SafeWindowExtensionsProvider(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        this.Camera2StreamConfigurationMap = classLoader;
    }

    public final java.lang.Class<?> getWindowExtensionsClass$window_release() {
        java.lang.Class<?> loadClass = this.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_EXTENSIONS_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        return loadClass;
    }

    /* renamed from: $r8$lambda$-SfpKZ-PxseYRt3t9eTavDt96_g, reason: not valid java name */
    public static /* synthetic */ java.lang.Class m9426$r8$lambda$SfpKZPxseYRt3t9eTavDt96_g(androidx.window.SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        java.lang.Class<?> loadClass = safeWindowExtensionsProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        return loadClass;
    }

    /* renamed from: $r8$lambda$Y7XkopevcJR3-CgF4t40u1o9YO4, reason: not valid java name */
    public static /* synthetic */ boolean m9427$r8$lambda$Y7XkopevcJR3CgF4t40u1o9YO4(androidx.window.SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        java.lang.Class<?> loadClass = safeWindowExtensionsProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", new java.lang.Class[0]);
        java.lang.Class<?> windowExtensionsClass$window_release = safeWindowExtensionsProvider.getWindowExtensionsClass$window_release();
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredMethod);
        return reflectionUtils.doesReturn$window_release(declaredMethod, windowExtensionsClass$window_release) && androidx.window.reflection.ReflectionUtils.INSTANCE.isPublic$window_release(declaredMethod);
    }

    public final androidx.window.extensions.WindowExtensions getWindowExtensions() {
        try {
            if (androidx.window.reflection.ReflectionUtils.INSTANCE.checkIsPresent$window_release(new androidx.window.SafeWindowExtensionsProvider$$ExternalSyntheticLambda0(this)) && isWindowExtensionsValid$window_release()) {
                return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final boolean isWindowExtensionsValid$window_release() {
        return androidx.window.reflection.ReflectionUtils.INSTANCE.checkIsPresent$window_release(new androidx.window.SafeWindowExtensionsProvider$$ExternalSyntheticLambda0(this)) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("WindowExtensionsProvider#getWindowExtensions is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.SafeWindowExtensionsProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.SafeWindowExtensionsProvider.m9427$r8$lambda$Y7XkopevcJR3CgF4t40u1o9YO4(androidx.window.SafeWindowExtensionsProvider.this));
            }
        });
    }
}
