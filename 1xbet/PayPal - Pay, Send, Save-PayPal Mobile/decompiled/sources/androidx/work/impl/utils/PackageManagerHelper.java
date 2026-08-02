package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class PackageManagerHelper {
    private static final java.lang.String getHighSpeedVideoSizes = androidx.work.Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static void setComponentEnabled(android.content.Context context, java.lang.Class<?> cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, cls.getName()));
            if (z == (componentEnabledSetting != 0 && componentEnabledSetting == 1)) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                java.lang.String str = getHighSpeedVideoSizes;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping component enablement for ");
                sb.append(cls.getName());
                logger.debug(str, sb.toString());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            java.lang.String str2 = getHighSpeedVideoSizes;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z ? "enabled" : "disabled");
            logger2.debug(str2, sb2.toString());
        } catch (java.lang.Exception e) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            java.lang.String str3 = getHighSpeedVideoSizes;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z ? "enabled" : "disabled");
            logger3.debug(str3, sb3.toString(), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.Class<?> cls) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, cls.getName()));
        return componentEnabledSetting != 0 && componentEnabledSetting == 1;
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.String str) {
        return context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, str)) == 1;
    }
}
