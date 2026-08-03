package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class PackageManagerHelper {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static void setComponentEnabled(android.content.Context context, java.lang.Class<?> klazz, boolean enabled) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = TAG;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(klazz.getName());
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(enabled ? "enabled" : com.ironsource.C2945a2.e);
            logger.debug(str, sb.toString());
        } catch (java.lang.Exception e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            java.lang.String str2 = TAG;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(klazz.getName());
            sb2.append("could not be ");
            sb2.append(enabled ? "enabled" : com.ironsource.C2945a2.e);
            logger2.debug(str2, sb2.toString(), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.Class<?> klazz) {
        return isComponentExplicitlyEnabled(context, klazz.getName());
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.String className) {
        return context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, className)) == 1;
    }
}
