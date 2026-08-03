package com.facebook.internal;

/* compiled from: Validate.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J$\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0004H\u0007J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J$\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J$\u0010%\u001a\u00020\f\"\u0004\b\u0000\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010&\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010'\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J7\u0010(\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0016\u0010)\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010*\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\fH\u0007J\b\u0010-\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/facebook/internal/Validate;", "", "()V", "CONTENT_PROVIDER_BASE", "", "CONTENT_PROVIDER_NOT_FOUND_REASON", "CUSTOM_TAB_REDIRECT_URI_PREFIX", "FACEBOOK_ACTIVITY_NOT_FOUND_REASON", "NO_INTERNET_PERMISSION_REASON", "TAG", "kotlin.jvm.PlatformType", "containsNoNullOrEmpty", "", "container", "", "name", "containsNoNulls", "T", "hasAppID", "hasBluetoothPermission", "", "context", "Landroid/content/Context;", "hasChangeWifiStatePermission", "hasClientToken", "hasContentProvider", "hasCustomTabRedirectActivity", "redirectURI", "hasFacebookActivity", "shouldThrow", "hasInternetPermissions", "hasLocationPermission", "hasPermission", "permission", "hasWiFiPermission", "notEmpty", "arg", "notEmptyAndContainsNoNulls", "notNull", "notNullOrEmpty", "oneOf", "values", "", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", "runningOnUiThread", "sdkInitialized", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Validate {
    private static final java.lang.String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    private static final java.lang.String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    public static final java.lang.String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
    private static final java.lang.String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    private static final java.lang.String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    public static final com.facebook.internal.Validate INSTANCE = new com.facebook.internal.Validate();
    private static final java.lang.String TAG = com.facebook.internal.Validate.class.getName();

    private Validate() {
    }

    @kotlin.jvm.JvmStatic
    public static final void notNull(java.lang.Object arg, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (arg != null) {
            return;
        }
        throw new java.lang.NullPointerException("Argument '" + name + "' cannot be null");
    }

    @kotlin.jvm.JvmStatic
    public static final <T> void notEmpty(java.util.Collection<? extends T> container, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    @kotlin.jvm.JvmStatic
    public static final <T> void containsNoNulls(java.util.Collection<? extends T> container, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new java.lang.NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void containsNoNullOrEmpty(java.util.Collection<java.lang.String> container, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        for (java.lang.String str : container) {
            if (str == null) {
                throw new java.lang.NullPointerException("Container '" + name + "' cannot contain null values");
            }
            if (!(str.length() > 0)) {
                throw new java.lang.IllegalArgumentException(("Container '" + name + "' cannot contain empty values").toString());
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <T> void notEmptyAndContainsNoNulls(java.util.Collection<? extends T> container, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        containsNoNulls(container, name);
        notEmpty(container, name);
    }

    @kotlin.jvm.JvmStatic
    public static final void runningOnUiThread() {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            throw new com.facebook.FacebookException("This method should be called from the UI thread");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String notNullOrEmpty(java.lang.String arg, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (arg != null && arg.length() > 0) {
            return arg;
        }
        throw new java.lang.IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    @kotlin.jvm.JvmStatic
    public static final void notEmpty(java.lang.String arg, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arg, "arg");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    @kotlin.jvm.JvmStatic
    public static final void oneOf(java.lang.Object arg, java.lang.String name, java.lang.Object... values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        int length = values.length;
        int i = 0;
        while (i < length) {
            java.lang.Object obj = values[i];
            i++;
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, arg)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Argument '" + name + "' was not one of the allowed values");
    }

    @kotlin.jvm.JvmStatic
    public static final void sdkInitialized() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isInitialized()) {
            throw new com.facebook.FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String hasAppID() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new java.lang.IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String hasClientToken() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String clientToken = com.facebook.FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new java.lang.IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    @kotlin.jvm.JvmStatic
    public static final void hasInternetPermissions(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        hasInternetPermissions(context, true);
    }

    @kotlin.jvm.JvmStatic
    public static final void hasInternetPermissions(android.content.Context context, boolean shouldThrow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!shouldThrow) {
                android.util.Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
                return;
            }
            throw new java.lang.IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasWiFiPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasChangeWifiStatePermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasLocationPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasBluetoothPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasPermission(android.content.Context context, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "permission");
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    @kotlin.jvm.JvmStatic
    public static final void hasFacebookActivity(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        hasFacebookActivity(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hasFacebookActivity(android.content.Context context, boolean shouldThrow) {
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                if (!shouldThrow) {
                    android.util.Log.w(TAG, FACEBOOK_ACTIVITY_NOT_FOUND_REASON);
                    return;
                }
                throw new java.lang.IllegalStateException(FACEBOOK_ACTIVITY_NOT_FOUND_REASON.toString());
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasCustomTabRedirectActivity(android.content.Context context, java.lang.String redirectURI) {
        java.util.List<android.content.pm.ResolveInfo> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(android.net.Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !kotlin.jvm.internal.Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @kotlin.jvm.JvmStatic
    public static final void hasContentProvider(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String hasAppID = hasAppID();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(CONTENT_PROVIDER_BASE, hasAppID);
            if (packageManager.resolveContentProvider(stringPlus, 0) != null) {
                return;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, java.util.Arrays.copyOf(new java.lang.Object[]{stringPlus}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            throw new java.lang.IllegalStateException(format.toString());
        }
    }
}
