package androidx.core.content.pm;

/* loaded from: classes7.dex */
public class ShortcutManagerCompat {
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> Camera2StreamConfigurationMap = null;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> getHighSpeedVideoFpsRanges;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context context) {
        return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean requestPinShortcut(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat, android.content.IntentSender intentSender) {
        if (android.os.Build.VERSION.SDK_INT > 32 || !shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        return false;
    }

    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends android.content.BroadcastReceiver {
        final /* synthetic */ android.content.IntentSender getHighSpeedVideoFpsRangesFor;

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            try {
                this.getHighSpeedVideoFpsRangesFor.sendIntent(context, 0, null, null, null);
            } catch (android.content.IntentSender.SendIntentException unused) {
            }
        }
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        android.content.Intent createShortcutResultIntent = ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo());
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new android.content.Intent();
        }
        return shortcutInfoCompat.getHighSpeedVideoSizes(createShortcutResultIntent);
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.pm.ShortcutInfoCompat.getHighSpeedVideoFpsRangesFor(context, ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getShortcuts(i));
        }
        android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return androidx.core.content.pm.ShortcutInfoCompat.getHighSpeedVideoFpsRangesFor(context, arrayList);
    }

    public static boolean addDynamicShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(list, 1);
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            Camera2StreamConfigurationMap(context, Camera2StreamConfigurationMap2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = Camera2StreamConfigurationMap2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            return false;
        }
        Camera2StreamConfigurationMap(context).addShortcuts(Camera2StreamConfigurationMap2);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getHighSpeedVideoFpsRanges(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
        return true;
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    public static boolean isRateLimitingActive(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).isRateLimitingActive();
    }

    public static int getIconMaxWidth(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getIconMaxWidth();
    }

    public static int getIconMaxHeight(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getIconMaxHeight();
    }

    public static void reportShortcutUsed(android.content.Context context, java.lang.String str) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(str);
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).reportShortcutUsed(str);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutUsageReported(java.util.Collections.singletonList(str));
        }
    }

    public static boolean setDynamicShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(list);
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(list, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(Camera2StreamConfigurationMap2.size());
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = Camera2StreamConfigurationMap2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        Camera2StreamConfigurationMap(context).removeAllShortcuts();
        Camera2StreamConfigurationMap(context).addShortcuts(Camera2StreamConfigurationMap2);
        for (androidx.core.content.pm.ShortcutInfoChangeListener shortcutInfoChangeListener : getHighSpeedVideoFpsRanges(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context context) {
        java.util.List<android.content.pm.ShortcutInfo> dynamicShortcuts = ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getDynamicShortcuts();
        java.util.ArrayList arrayList = new java.util.ArrayList(dynamicShortcuts.size());
        java.util.Iterator<android.content.pm.ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.core.content.pm.ShortcutInfoCompat.Builder(context, it.next()).build());
        }
        return arrayList;
    }

    public static boolean updateShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(list, 1);
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            Camera2StreamConfigurationMap(context, Camera2StreamConfigurationMap2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = Camera2StreamConfigurationMap2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        Camera2StreamConfigurationMap(context).addShortcuts(Camera2StreamConfigurationMap2);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getHighSpeedVideoFpsRanges(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutUpdated(list);
        }
        return true;
    }

    static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        android.graphics.Bitmap decodeStream;
        androidx.core.graphics.drawable.IconCompat createWithBitmap;
        if (shortcutInfoCompat.getOutputFormats == null) {
            return false;
        }
        int i = shortcutInfoCompat.getOutputFormats.mType;
        if (i != 6 && i != 4) {
            return true;
        }
        java.io.InputStream uriInputStream = shortcutInfoCompat.getOutputFormats.getUriInputStream(context);
        if (uriInputStream == null || (decodeStream = android.graphics.BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        if (i == 6) {
            createWithBitmap = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(decodeStream);
        } else {
            createWithBitmap = androidx.core.graphics.drawable.IconCompat.createWithBitmap(decodeStream);
        }
        shortcutInfoCompat.getOutputFormats = createWithBitmap;
        return true;
    }

    static void Camera2StreamConfigurationMap(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : new java.util.ArrayList(list)) {
            if (!getHighSpeedVideoFpsRangesFor(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    public static void disableShortcuts(android.content.Context context, java.util.List<java.lang.String> list, java.lang.CharSequence charSequence) {
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).disableShortcuts(list, charSequence);
        Camera2StreamConfigurationMap(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void enableShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(list, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = Camera2StreamConfigurationMap2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getInputSizeshNQ4ISI);
        }
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).enableShortcuts(arrayList);
        Camera2StreamConfigurationMap(context).addShortcuts(Camera2StreamConfigurationMap2);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getHighSpeedVideoFpsRanges(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
    }

    public static void removeDynamicShortcuts(android.content.Context context, java.util.List<java.lang.String> list) {
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeDynamicShortcuts(list);
        Camera2StreamConfigurationMap(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void removeAllDynamicShortcuts(android.content.Context context) {
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeAllDynamicShortcuts();
        Camera2StreamConfigurationMap(context).removeAllShortcuts();
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
        while (it.hasNext()) {
            it.next().onAllShortcutsRemoved();
        }
    }

    public static void removeLongLivedShortcuts(android.content.Context context, java.util.List<java.lang.String> list) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
            return;
        }
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeLongLivedShortcuts(list);
        Camera2StreamConfigurationMap(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static boolean pushDynamicShortcut(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(shortcutInfoCompat);
        if (android.os.Build.VERSION.SDK_INT <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getHighSpeedVideoFpsRanges(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            getHighSpeedVideoFpsRangesFor(context, shortcutInfoCompat);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
        } else {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            java.util.List<android.content.pm.ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManager.removeDynamicShortcuts(java.util.Arrays.asList(androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getHighSpeedVideoFpsRangesFor(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(java.util.Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        androidx.core.content.pm.ShortcutInfoCompatSaver<?> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(context);
        try {
            java.util.List<androidx.core.content.pm.ShortcutInfoCompat> shortcuts = Camera2StreamConfigurationMap2.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                Camera2StreamConfigurationMap2.removeShortcuts(java.util.Arrays.asList(getHighSpeedVideoFpsRangesFor(shortcuts)));
            }
            Camera2StreamConfigurationMap2.addShortcuts(java.util.Arrays.asList(shortcutInfoCompat));
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getHighSpeedVideoFpsRanges(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return true;
        } catch (java.lang.Exception unused) {
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it3 = getHighSpeedVideoFpsRanges(context).iterator();
            while (it3.hasNext()) {
                it3.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return false;
        } catch (java.lang.Throwable th) {
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it4 = getHighSpeedVideoFpsRanges(context).iterator();
            while (it4.hasNext()) {
                it4.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            throw th;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        int i = -1;
        java.lang.String str = null;
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > i) {
                str = shortcutInfoCompat.getId();
                i = shortcutInfoCompat.getRank();
            }
        }
        return str;
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> Camera2StreamConfigurationMap(android.content.Context context) {
        if (getHighSpeedVideoFpsRanges == null) {
            try {
                getHighSpeedVideoFpsRanges = (androidx.core.content.pm.ShortcutInfoCompatSaver) java.lang.Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, androidx.core.content.pm.ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context);
            } catch (java.lang.Exception unused) {
            }
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new androidx.core.content.pm.ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return getHighSpeedVideoFpsRanges;
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getHighSpeedVideoFpsRanges(android.content.Context context) {
        android.os.Bundle bundle;
        java.lang.String string;
        if (Camera2StreamConfigurationMap == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((androidx.core.content.pm.ShortcutInfoChangeListener) java.lang.Class.forName(string, false, androidx.core.content.pm.ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = arrayList;
            }
        }
        return Camera2StreamConfigurationMap;
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> Camera2StreamConfigurationMap(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list, int i) {
        java.util.Objects.requireNonNull(list);
        if (android.os.Build.VERSION.SDK_INT > 32) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    static class Api25Impl {
        private Api25Impl() {
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<android.content.pm.ShortcutInfo> list) {
            int i = -1;
            java.lang.String str = null;
            for (android.content.pm.ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }
}
