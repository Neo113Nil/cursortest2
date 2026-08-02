package a;

/* loaded from: classes3.dex */
public class d {
    public static boolean a(android.content.Context context, java.util.List<java.lang.String> list) {
        if (context == null || list == null) {
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.Iterator<java.lang.String> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                packageManager.getPackageInfo(it.next(), 0);
                z = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public static boolean a(android.content.pm.PackageManager packageManager, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    private d() {
    }
}
