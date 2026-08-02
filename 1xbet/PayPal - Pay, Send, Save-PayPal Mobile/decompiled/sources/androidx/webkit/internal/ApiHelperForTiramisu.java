package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    static android.content.pm.PackageManager.ComponentInfoFlags dF_(long j) {
        return android.content.pm.PackageManager.ComponentInfoFlags.of(j);
    }

    static android.content.pm.ServiceInfo dE_(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, android.content.pm.PackageManager.ComponentInfoFlags componentInfoFlags) throws android.content.pm.PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }
}
