package com.facebook.internal;

/* compiled from: CustomTabUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/CustomTabUtils;", "", "()V", "CHROME_PACKAGES", "", "", "[Ljava/lang/String;", "getChromePackage", "getDefaultRedirectURI", "getValidRedirectURI", "developerDefinedRedirectURI", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabUtils {
    public static final com.facebook.internal.CustomTabUtils INSTANCE = new com.facebook.internal.CustomTabUtils();
    private static final java.lang.String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private CustomTabUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDefaultRedirectURI() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.CustomTabUtils.class)) {
            return null;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            return kotlin.jvm.internal.Intrinsics.stringPlus(com.facebook.internal.Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, com.facebook.FacebookSdk.getApplicationContext().getPackageName());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.CustomTabUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getValidRedirectURI(java.lang.String developerDefinedRedirectURI) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.CustomTabUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.internal.Validate.hasCustomTabRedirectActivity(com.facebook.FacebookSdk.getApplicationContext(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.internal.Validate.hasCustomTabRedirectActivity(com.facebook.FacebookSdk.getApplicationContext(), getDefaultRedirectURI())) {
                return getDefaultRedirectURI();
            }
            return "";
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.CustomTabUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getChromePackage() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.CustomTabUtils.class)) {
            return null;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            java.util.HashSet hashSet = kotlin.collections.ArraysKt.toHashSet(CHROME_PACKAGES);
            java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                android.content.pm.ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.CustomTabUtils.class);
            return null;
        }
    }
}
