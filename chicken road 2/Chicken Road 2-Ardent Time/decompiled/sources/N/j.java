package N;

/* loaded from: classes.dex */
public abstract class j {
    public static android.content.pm.PackageInfo a(android.content.pm.PackageManager packageManager, android.content.Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
    }
}
