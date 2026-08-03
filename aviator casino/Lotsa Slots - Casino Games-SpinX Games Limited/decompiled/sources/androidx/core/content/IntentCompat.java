package androidx.core.content;

/* loaded from: classes.dex */
public final class IntentCompat {
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    private IntentCompat() {
    }

    public static android.content.Intent makeMainSelectorActivity(java.lang.String str, java.lang.String str2) {
        return android.content.Intent.makeMainSelectorActivity(str, str2);
    }

    public static android.content.Intent createManageUnusedAppRestrictionsIntent(android.content.Context context, java.lang.String str) {
        if (!androidx.core.content.PackageManagerCompat.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            throw new java.lang.UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", str, null));
        }
        android.content.Intent data = new android.content.Intent(androidx.core.content.PackageManagerCompat.ACTION_PERMISSION_REVOCATION_SETTINGS).setData(android.net.Uri.fromParts("package", str, null));
        return android.os.Build.VERSION.SDK_INT >= 30 ? data : data.setPackage((java.lang.String) androidx.core.util.Preconditions.checkNotNull(androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(context.getPackageManager())));
    }

    public static <T> T getParcelableExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.core.content.IntentCompat.Api33Impl.getParcelableExtra(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static android.os.Parcelable[] getParcelableArrayExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<? extends android.os.Parcelable> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (android.os.Parcelable[]) androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayExtra(intent, str, cls);
        }
        return intent.getParcelableArrayExtra(str);
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayListExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<? extends T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayListExtra(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    public static <T extends java.io.Serializable> T getSerializableExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.core.content.IntentCompat.Api33Impl.getSerializableExtra(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T> T getParcelableExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        static <T> T[] getParcelableArrayExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        static <T> java.util.ArrayList<T> getParcelableArrayListExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        static <T extends java.io.Serializable> T getSerializableExtra(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }
}
