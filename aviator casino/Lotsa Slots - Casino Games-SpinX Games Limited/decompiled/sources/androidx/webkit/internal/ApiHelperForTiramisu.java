package androidx.webkit.internal;

/* loaded from: classes2.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    static android.content.pm.PackageManager.ComponentInfoFlags of(long j) {
        return android.content.pm.PackageManager.ComponentInfoFlags.of(j);
    }

    static android.content.pm.ServiceInfo getServiceInfo(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, android.content.pm.PackageManager.ComponentInfoFlags componentInfoFlags) throws android.content.pm.PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }
}
