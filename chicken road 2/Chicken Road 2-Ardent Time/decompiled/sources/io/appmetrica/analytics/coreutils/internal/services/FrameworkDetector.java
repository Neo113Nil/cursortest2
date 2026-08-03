package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public class FrameworkDetector {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3769a = new io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector().detectFramework();

    public static java.lang.String framework() {
        return f3769a;
    }

    public static boolean isNative() {
        return "native".equals(f3769a);
    }

    public java.lang.String detectFramework() {
        return io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.unity3d.player.UnityPlayer") ? io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.UNITY : io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("mono.MonoPackageManager") ? io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.XAMARIN : io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin") ? io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.CORDOVA : io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView") ? "react" : io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER : "native";
    }
}
