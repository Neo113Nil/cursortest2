package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\r\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0018\u0010'\u001a\u0006\u0012\u0002\b\u00030 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "loader", "Ljava/lang/ClassLoader;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "<init>", "(Ljava/lang/ClassLoader;Landroidx/window/core/ConsumerAdapter;)V", "safeWindowExtensionsProvider", "Landroidx/window/SafeWindowExtensionsProvider;", "windowLayoutComponent", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "canUseWindowLayoutComponent", "", "isWindowLayoutComponentAccessible", "isWindowLayoutComponentAccessible$window_release", "hasValidVendorApiLevel1", "hasValidVendorApiLevel1$window_release", "hasValidVendorApiLevel2", "hasValidVendorApiLevel2$window_release", "hasValidVendorApiLevel6", "hasValidVendorApiLevel6$window_release", "isWindowLayoutProviderValid", "isFoldingFeatureValid", "isMethodWindowLayoutInfoListenerJavaConsumerValid", "isMethodWindowLayoutInfoListenerWindowConsumerValid", "isDisplayFoldFeatureValid", "isSupportedWindowFeaturesValid", "isGetSupportedWindowFeaturesValid", "displayFoldFeatureClass", "Ljava/lang/Class;", "getDisplayFoldFeatureClass", "()Ljava/lang/Class;", "supportedWindowFeaturesClass", "getSupportedWindowFeaturesClass", "foldingFeatureClass", "getFoldingFeatureClass", "windowLayoutComponentClass", "getWindowLayoutComponentClass", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeWindowLayoutComponentProvider {
    private final androidx.window.SafeWindowExtensionsProvider getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.core.ConsumerAdapter getHighSpeedVideoFpsRangesFor;
    private final java.lang.ClassLoader getHighSpeedVideoSizes;

    public SafeWindowLayoutComponentProvider(java.lang.ClassLoader classLoader, androidx.window.core.ConsumerAdapter consumerAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
        this.getHighSpeedVideoSizes = classLoader;
        this.getHighSpeedVideoFpsRangesFor = consumerAdapter;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.window.SafeWindowExtensionsProvider(classLoader);
    }

    public final boolean isWindowLayoutComponentAccessible$window_release() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isWindowExtensionsValid$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowLayoutComponent is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.$r8$lambda$JKL5Cg8Yg1MMdcNbJTk_iZPF6BA(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("FoldingFeature class is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.m9460$r8$lambda$YhsYaCrxEyBEECja7t37ATbhTA(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        });
    }

    public final boolean hasValidVendorApiLevel2$window_release() {
        if (!hasValidVendorApiLevel1$window_release()) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(android.content.Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return androidx.window.reflection.ReflectionUtils.validateReflection$window_release(sb.toString(), new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.$r8$lambda$sY670AWqxzWbF1yp3Eo3b6mXnvg(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        });
    }

    public final boolean hasValidVendorApiLevel6$window_release() {
        return hasValidVendorApiLevel2$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("DisplayFoldFeature is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.$r8$lambda$gePtknSSR1dr9ZK6V0_GWHszKFU(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SupportedWindowFeatures is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.$r8$lambda$y2Pz0TKlnCHREXWyIQRAU9VVuOg(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.m9458$r8$lambda$9cp1a0rlw0tfqNxXBABZnuqpyw(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        });
    }

    /* renamed from: $r8$lambda$-9cp1a0rlw0tfqNxXBABZnuqpyw, reason: not valid java name */
    public static /* synthetic */ boolean m9458$r8$lambda$9cp1a0rlw0tfqNxXBABZnuqpyw(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getSupportedWindowFeatures", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            java.lang.Class<?> loadClass2 = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.SUPPORTED_WINDOW_FEATURES_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass2, "");
            if (reflectionUtils2.doesReturn$window_release(method, loadClass2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$JHk-s-XBFwyCXzWcpubDZNqFnr8, reason: not valid java name */
    public static /* synthetic */ boolean m9459$r8$lambda$JHksXBFwyCXzWcpubDZNqFnr8(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> consumerClassOrNull$window_release = safeWindowLayoutComponentProvider.getHighSpeedVideoFpsRangesFor.consumerClassOrNull$window_release();
        if (consumerClassOrNull$window_release == null) {
            return false;
        }
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("addWindowLayoutInfoListener", android.app.Activity.class, consumerClassOrNull$window_release);
        java.lang.reflect.Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", consumerClassOrNull$window_release);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils.isPublic$window_release(method)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        return reflectionUtils2.isPublic$window_release(method2);
    }

    public static /* synthetic */ boolean $r8$lambda$JKL5Cg8Yg1MMdcNbJTk_iZPF6BA(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.reflect.Method method = safeWindowLayoutComponentProvider.getHighResolutionOutputSizeshNQ4ISI.getWindowExtensionsClass$window_release().getMethod("getWindowLayoutComponent", new java.lang.Class[0]);
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, loadClass);
    }

    /* renamed from: $r8$lambda$YhsYaCr-xEyBEECja7t37ATbhTA, reason: not valid java name */
    public static /* synthetic */ boolean m9460$r8$lambda$YhsYaCrxEyBEECja7t37ATbhTA(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.FOLDING_FEATURE_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getBounds", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = loadClass.getMethod("getType", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = loadClass.getMethod("getState", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.doesReturn$window_release(method, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.graphics.Rect.class)) && androidx.window.reflection.ReflectionUtils.INSTANCE.isPublic$window_release(method)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.doesReturn$window_release(method2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) && androidx.window.reflection.ReflectionUtils.INSTANCE.isPublic$window_release(method2)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.doesReturn$window_release(method3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) && androidx.window.reflection.ReflectionUtils.INSTANCE.isPublic$window_release(method3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$gePtknSSR1dr9ZK6V0_GWHszKFU(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.DISPLAY_FOLD_FEATURE_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getType", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = loadClass.getMethod("hasProperty", java.lang.Integer.TYPE);
        java.lang.reflect.Method method3 = loadClass.getMethod("hasProperties", int[].class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Boolean.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Boolean.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$sY670AWqxzWbF1yp3Eo3b6mXnvg(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("addWindowLayoutInfoListener", android.content.Context.class, androidx.window.extensions.core.util.function.Consumer.class);
        java.lang.reflect.Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", androidx.window.extensions.core.util.function.Consumer.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils.isPublic$window_release(method)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        return reflectionUtils2.isPublic$window_release(method2);
    }

    public static /* synthetic */ boolean $r8$lambda$y2Pz0TKlnCHREXWyIQRAU9VVuOg(androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        java.lang.Class<?> loadClass = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.SUPPORTED_WINDOW_FEATURES_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getDisplayFoldFeatures", new java.lang.Class[0]);
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(genericReturnType, "");
        java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericReturnType).getActualTypeArguments()[0];
        kotlin.jvm.internal.Intrinsics.checkNotNull(type, "");
        java.lang.Class cls = (java.lang.Class) type;
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.util.List.class)) {
            java.lang.Class<?> loadClass2 = safeWindowLayoutComponentProvider.getHighSpeedVideoSizes.loadClass(androidx.window.reflection.WindowExtensionsConstants.DISPLAY_FOLD_FEATURE_CLASS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass2, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls, loadClass2)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.window.extensions.layout.WindowLayoutComponent getWindowLayoutComponent() {
        int safeVendorApiLevel;
        boolean z = false;
        if (isWindowLayoutComponentAccessible$window_release() && (safeVendorApiLevel = androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()) > 0) {
            if (safeVendorApiLevel == 1) {
                z = hasValidVendorApiLevel1$window_release();
            } else if (safeVendorApiLevel < 5) {
                z = hasValidVendorApiLevel2$window_release();
            } else {
                z = hasValidVendorApiLevel6$window_release();
            }
        }
        if (!z) {
            return null;
        }
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean hasValidVendorApiLevel1$window_release() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(android.app.Activity.class.getName());
        sb.append(", java.util.function.Consumer) is not valid");
        return androidx.window.reflection.ReflectionUtils.validateReflection$window_release(sb.toString(), new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.layout.SafeWindowLayoutComponentProvider.m9459$r8$lambda$JHksXBFwyCXzWcpubDZNqFnr8(androidx.window.layout.SafeWindowLayoutComponentProvider.this));
            }
        });
    }
}
