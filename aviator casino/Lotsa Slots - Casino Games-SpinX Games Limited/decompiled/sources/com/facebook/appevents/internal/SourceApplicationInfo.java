package com.facebook.appevents.internal;

/* compiled from: SourceApplicationInfo.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo;", "", "callingApplicationPackage", "", "isOpenedByAppLink", "", "(Ljava/lang/String;Z)V", "getCallingApplicationPackage", "()Ljava/lang/String;", "()Z", "toString", "writeSourceApplicationInfoToDisk", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Factory", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SourceApplicationInfo {
    private static final java.lang.String CALL_APPLICATION_PACKAGE_KEY = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.internal.SourceApplicationInfo.Companion INSTANCE = new com.facebook.appevents.internal.SourceApplicationInfo.Companion(null);
    private static final java.lang.String OPENED_BY_APP_LINK_KEY = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
    private static final java.lang.String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
    private final java.lang.String callingApplicationPackage;
    private final boolean isOpenedByAppLink;

    public /* synthetic */ SourceApplicationInfo(java.lang.String str, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    @kotlin.jvm.JvmStatic
    public static final void clearSavedSourceApplicationInfoFromDisk() {
        INSTANCE.clearSavedSourceApplicationInfoFromDisk();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.internal.SourceApplicationInfo getStoredSourceApplicatioInfo() {
        return INSTANCE.getStoredSourceApplicatioInfo();
    }

    private SourceApplicationInfo(java.lang.String str, boolean z) {
        this.callingApplicationPackage = str;
        this.isOpenedByAppLink = z;
    }

    public final java.lang.String getCallingApplicationPackage() {
        return this.callingApplicationPackage;
    }

    /* renamed from: isOpenedByAppLink, reason: from getter */
    public final boolean getIsOpenedByAppLink() {
        return this.isOpenedByAppLink;
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (!this.isOpenedByAppLink) {
            str = "Unclassified";
        } else {
            str = "Applink";
        }
        if (this.callingApplicationPackage == null) {
            return str;
        }
        return str + '(' + ((java.lang.Object) this.callingApplicationPackage) + ')';
    }

    public final void writeSourceApplicationInfoToDisk() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).edit();
        edit.putString(CALL_APPLICATION_PACKAGE_KEY, this.callingApplicationPackage);
        edit.putBoolean(OPENED_BY_APP_LINK_KEY, this.isOpenedByAppLink);
        edit.apply();
    }

    /* compiled from: SourceApplicationInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo$Factory;", "", "()V", "create", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "activity", "Landroid/app/Activity;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Factory {
        public static final com.facebook.appevents.internal.SourceApplicationInfo.Factory INSTANCE = new com.facebook.appevents.internal.SourceApplicationInfo.Factory();

        private Factory() {
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.appevents.internal.SourceApplicationInfo create(android.app.Activity activity) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            android.content.ComponentName callingActivity = activity.getCallingActivity();
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (callingActivity == null) {
                str = "";
            } else {
                str = callingActivity.getPackageName();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, activity.getPackageName())) {
                    return null;
                }
            }
            android.content.Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra(com.facebook.appevents.internal.SourceApplicationInfo.SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT, false)) {
                intent.putExtra(com.facebook.appevents.internal.SourceApplicationInfo.SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT, true);
                com.facebook.bolts.AppLinks appLinks = com.facebook.bolts.AppLinks.INSTANCE;
                android.os.Bundle appLinkData = com.facebook.bolts.AppLinks.getAppLinkData(intent);
                if (appLinkData != null) {
                    android.os.Bundle bundle = appLinkData.getBundle("referer_app_link");
                    if (bundle != null) {
                        str = bundle.getString("package");
                    }
                    z = true;
                }
            }
            if (intent != null) {
                intent.putExtra(com.facebook.appevents.internal.SourceApplicationInfo.SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT, true);
            }
            return new com.facebook.appevents.internal.SourceApplicationInfo(str, z, defaultConstructorMarker);
        }
    }

    /* compiled from: SourceApplicationInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo$Companion;", "", "()V", "CALL_APPLICATION_PACKAGE_KEY", "", "OPENED_BY_APP_LINK_KEY", "SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT", "clearSavedSourceApplicationInfoFromDisk", "", "getStoredSourceApplicatioInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.internal.SourceApplicationInfo getStoredSourceApplicatioInfo() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext());
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains(com.facebook.appevents.internal.SourceApplicationInfo.CALL_APPLICATION_PACKAGE_KEY)) {
                return new com.facebook.appevents.internal.SourceApplicationInfo(defaultSharedPreferences.getString(com.facebook.appevents.internal.SourceApplicationInfo.CALL_APPLICATION_PACKAGE_KEY, null), defaultSharedPreferences.getBoolean(com.facebook.appevents.internal.SourceApplicationInfo.OPENED_BY_APP_LINK_KEY, false), defaultConstructorMarker);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final void clearSavedSourceApplicationInfoFromDisk() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).edit();
            edit.remove(com.facebook.appevents.internal.SourceApplicationInfo.CALL_APPLICATION_PACKAGE_KEY);
            edit.remove(com.facebook.appevents.internal.SourceApplicationInfo.OPENED_BY_APP_LINK_KEY);
            edit.apply();
        }
    }
}
